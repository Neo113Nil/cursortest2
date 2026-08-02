package com.datadog.android.core.sampling;

/* loaded from: classes4.dex */
public interface Sampler {
    Float getSampleRate();

    boolean sample(Object obj);
}
