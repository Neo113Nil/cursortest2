package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes9.dex */
public interface ArgumentsMerger<I, O> {
    boolean compareWithOtherArguments(I i);

    O mergeFrom(I i);
}
