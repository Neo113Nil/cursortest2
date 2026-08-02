package com.datadog.trace.common.sampling;

import com.datadog.trace.api.Config;
import com.datadog.trace.core.CoreTracer;
import com.datadog.trace.core.DDSpan;
import com.google.android.gms.auth.api.zbc;
import com.google.mlkit.vision.text.zzb;
import java.util.HashMap;

/* loaded from: classes4.dex */
public interface Sampler {

    public abstract class Builder {
        public static Sampler forConfig(Config config, CoreTracer.ConfigSnapshot configSnapshot) {
            if (config == null) {
                return new zzb(4);
            }
            String str = config.prioritySamplingForce;
            HashMap hashMap = config.traceSamplingServiceRules;
            HashMap hashMap2 = config.traceSamplingOperationRules;
            String str2 = config.traceSamplingRules;
            TraceSamplingRules traceSamplingRules = TraceSamplingRules.EMPTY;
            if (str2 != null) {
                traceSamplingRules = TraceSamplingRules.deserialize(str2);
            }
            boolean z = (hashMap == null || hashMap.isEmpty()) ? false : true;
            boolean z2 = (hashMap2 == null || hashMap2.isEmpty()) ? false : true;
            boolean isEmpty = traceSamplingRules.rules.isEmpty();
            boolean z3 = config.configProvider.getBoolean(new String[0], "v2.compatibility.enabled", false);
            Double d = configSnapshot != null ? configSnapshot.traceSampleRate : config.traceSampleRate;
            if (z3 && (z || z2 || !isEmpty || d != null)) {
                try {
                    return RuleBasedTraceSampler.build(hashMap, hashMap2, traceSamplingRules, d, config.traceRateLimit);
                } catch (IllegalArgumentException unused) {
                    return new zzb(4);
                }
            }
            if (d == null) {
                return config.prioritySamplingEnabled ? "keep".equalsIgnoreCase(str) ? new ForcePrioritySampler(1) : "drop".equalsIgnoreCase(str) ? new ForcePrioritySampler(0) : new RateByServiceTraceSampler() : new zzb(4);
            }
            RateByServiceTraceSampler rateByServiceTraceSampler = new RateByServiceTraceSampler();
            rateByServiceTraceSampler.serviceRates = new zbc(d.doubleValue());
            return rateByServiceTraceSampler;
        }
    }

    boolean sample(DDSpan dDSpan);
}
