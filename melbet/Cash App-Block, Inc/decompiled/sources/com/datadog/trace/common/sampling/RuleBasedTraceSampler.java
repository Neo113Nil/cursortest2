package com.datadog.trace.common.sampling;

import com.datadog.trace.common.sampling.SamplingRule;
import com.datadog.trace.common.sampling.TraceSamplingRules;
import com.datadog.trace.core.DDSpan;
import com.datadog.trace.core.util.SimpleRateLimiter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class RuleBasedTraceSampler implements Sampler, PrioritySampler {
    public final RateByServiceTraceSampler fallbackSampler;
    public final long rateLimit;
    public final SimpleRateLimiter rateLimiter;
    public final ArrayList samplingRules;

    public RuleBasedTraceSampler(ArrayList arrayList, int i, RateByServiceTraceSampler rateByServiceTraceSampler) {
        this.samplingRules = arrayList;
        this.fallbackSampler = rateByServiceTraceSampler;
        SimpleRateLimiter simpleRateLimiter = new SimpleRateLimiter();
        simpleRateLimiter.startNanos = System.nanoTime();
        simpleRateLimiter.capacity = Math.max(1, i);
        simpleRateLimiter.secondsAndCount = new AtomicLong(0L);
        this.rateLimiter = simpleRateLimiter;
        this.rateLimit = i;
    }

    public static RuleBasedTraceSampler build(HashMap hashMap, HashMap hashMap2, TraceSamplingRules traceSamplingRules, Double d, int i) {
        ArrayList arrayList = new ArrayList();
        List<TraceSamplingRules.Rule> list = traceSamplingRules.rules;
        if (list.isEmpty()) {
            if (hashMap != null) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    try {
                        arrayList.add(new SamplingRule.ServiceSamplingRule((String) entry.getKey(), new DeterministicSampler$TraceSampler(Double.parseDouble((String) entry.getValue())), 0));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            if (hashMap2 != null) {
                for (Map.Entry entry2 : hashMap2.entrySet()) {
                    try {
                        arrayList.add(new SamplingRule.ServiceSamplingRule((String) entry2.getKey(), new DeterministicSampler$TraceSampler(Double.parseDouble((String) entry2.getValue())), 1));
                    } catch (NumberFormatException unused2) {
                    }
                }
            }
        } else {
            if (hashMap.isEmpty()) {
                hashMap2.isEmpty();
            }
            for (TraceSamplingRules.Rule rule : list) {
                arrayList.add(new SamplingRule.TraceSamplingRule(rule.service, rule.name, rule.resource, rule.tags, new DeterministicSampler$TraceSampler(rule.sampleRate)));
            }
        }
        if (d != null) {
            arrayList.add(new SamplingRule.AlwaysMatchesSamplingRule(new DeterministicSampler$TraceSampler(d.doubleValue())));
        }
        return new RuleBasedTraceSampler(arrayList, i, new RateByServiceTraceSampler());
    }

    @Override // com.datadog.trace.common.sampling.Sampler
    public final boolean sample(DDSpan dDSpan) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        r1.setSamplingPriority$1(-1, "_dd.rule_psr", r3, 3);
        r1 = r18;
     */
    @Override // com.datadog.trace.common.sampling.PrioritySampler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setSamplingPriority(DDSpan dDSpan) {
        SamplingRule samplingRule;
        boolean z;
        long j;
        DDSpan dDSpan2;
        DDSpan dDSpan3 = dDSpan;
        Iterator it = this.samplingRules.iterator();
        while (true) {
            if (!it.hasNext()) {
                samplingRule = null;
                break;
            } else {
                samplingRule = (SamplingRule) it.next();
                if (samplingRule.matches(dDSpan3)) {
                    break;
                }
            }
        }
        if (samplingRule == null) {
            this.fallbackSampler.setSamplingPriority(dDSpan3);
            return;
        }
        DeterministicSampler$TraceSampler deterministicSampler$TraceSampler = samplingRule.sampler;
        float f = deterministicSampler$TraceSampler.rate;
        if (!deterministicSampler$TraceSampler.sample(dDSpan3)) {
            dDSpan.setSamplingPriority$1(-1, "_dd.rule_psr", f, 3);
            return;
        }
        SimpleRateLimiter simpleRateLimiter = this.rateLimiter;
        AtomicLong atomicLong = (AtomicLong) simpleRateLimiter.secondsAndCount;
        int i = 1;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            long j2 = atomicLong.get();
            if (z2) {
                i2 = (int) ((System.nanoTime() - simpleRateLimiter.startNanos) / 1000000000);
                z2 = false;
            }
            int i3 = (int) (2147483647L & j2);
            int i4 = i2 - ((int) (j2 >> 32));
            if (i4 <= 0) {
                int i5 = i3 + i;
                if (i5 > simpleRateLimiter.capacity || i5 < 0) {
                    break;
                }
                z = z2;
                j = ((r12 & Integer.MAX_VALUE) << 32) | i5;
                if (i4 < 0) {
                    z = true;
                }
            } else {
                z = z2;
                j = ((i2 & Integer.MAX_VALUE) << 32) | 1;
            }
            if (atomicLong.compareAndSet(j2, j)) {
                dDSpan2 = dDSpan;
                dDSpan2.setSamplingPriority$1(2, "_dd.rule_psr", f, 3);
                break;
            } else {
                dDSpan3 = dDSpan;
                z2 = z;
                i = 1;
            }
        }
        dDSpan2.context.setMetric("_dd.limit_psr", Long.valueOf(this.rateLimit));
    }
}
