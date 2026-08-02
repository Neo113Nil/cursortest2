package com.datadog.trace.common.sampling;

import com.datadog.trace.core.DDSpan;

/* loaded from: classes4.dex */
public final class ForcePrioritySampler implements Sampler, PrioritySampler {
    public final int prioritySampling;

    public ForcePrioritySampler(int i) {
        this.prioritySampling = i;
    }

    @Override // com.datadog.trace.common.sampling.Sampler
    public final boolean sample(DDSpan dDSpan) {
        return true;
    }

    @Override // com.datadog.trace.common.sampling.PrioritySampler
    public final void setSamplingPriority(DDSpan dDSpan) {
        dDSpan.context.setSamplingPriority(this.prioritySampling, 0);
    }
}
