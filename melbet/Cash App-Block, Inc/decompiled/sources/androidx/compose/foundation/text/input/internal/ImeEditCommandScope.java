package androidx.compose.foundation.text.input.internal;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface ImeEditCommandScope {
    void edit(Function1 function1);

    int getTransformedLength();

    /* renamed from: mapFromTransformed-GEjPoXI, reason: not valid java name */
    long mo387mapFromTransformedGEjPoXI(long j);

    /* renamed from: mapToTransformed-GEjPoXI, reason: not valid java name */
    long mo388mapToTransformedGEjPoXI(long j);
}
