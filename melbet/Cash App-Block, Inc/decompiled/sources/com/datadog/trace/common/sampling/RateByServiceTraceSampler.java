package com.datadog.trace.common.sampling;

import com.datadog.trace.core.DDSpan;
import com.google.android.gms.auth.api.zbc;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class RateByServiceTraceSampler implements Sampler, PrioritySampler {
    public volatile zbc serviceRates = new zbc(1.0d);

    @Override // com.datadog.trace.common.sampling.Sampler
    public final boolean sample(DDSpan dDSpan) {
        return true;
    }

    @Override // com.datadog.trace.common.sampling.PrioritySampler
    public final void setSamplingPriority(DDSpan dDSpan) {
        DeterministicSampler$TraceSampler deterministicSampler$TraceSampler;
        String str = dDSpan.context.serviceName;
        Object tag = dDSpan.getTag("env");
        if (tag == null) {
            tag = "";
        }
        zbc zbcVar = this.serviceRates;
        DeterministicSampler$TraceSampler deterministicSampler$TraceSampler2 = (DeterministicSampler$TraceSampler) zbcVar.zba;
        Map map = (Map) ((HashMap) zbcVar.zbb).get((String) tag);
        if (map != null && (deterministicSampler$TraceSampler = (DeterministicSampler$TraceSampler) map.get(str)) != null) {
            deterministicSampler$TraceSampler2 = deterministicSampler$TraceSampler;
        }
        boolean sample = deterministicSampler$TraceSampler2.sample(dDSpan);
        float f = deterministicSampler$TraceSampler2.rate;
        if (sample) {
            dDSpan.setSamplingPriority$1(1, "_dd.agent_psr", f, 1);
        } else {
            dDSpan.setSamplingPriority$1(0, "_dd.agent_psr", f, 1);
        }
    }
}
