package com.datadog.trace.common.sampling;

import com.datadog.trace.core.DDSpan;

/* loaded from: classes4.dex */
public interface PrioritySampler {
    void setSamplingPriority(DDSpan dDSpan);
}
