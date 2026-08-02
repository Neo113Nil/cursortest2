package com.datadog.trace.common.sampling;

import com.datadog.trace.core.DDSpan;

/* loaded from: classes4.dex */
public final class DeterministicSampler$TraceSampler implements Sampler {
    public static final double MAX = Math.pow(2.0d, 64.0d) - 1.0d;
    public final float rate;

    public DeterministicSampler$TraceSampler(double d) {
        this.rate = (float) d;
    }

    @Override // com.datadog.trace.common.sampling.Sampler
    public final boolean sample(DDSpan dDSpan) {
        long j = (dDSpan.context.traceId.toLong() * 1111111111111111111L) - Long.MIN_VALUE;
        double d = this.rate;
        double d2 = MAX;
        return j < ((d > 0.5d ? 1 : (d == 0.5d ? 0 : -1)) < 0 ? ((long) (d * d2)) + Long.MIN_VALUE : (d > 1.0d ? 1 : (d == 1.0d ? 0 : -1)) < 0 ? (long) ((d * d2) + (-9.223372036854776E18d)) : Long.MAX_VALUE);
    }
}
