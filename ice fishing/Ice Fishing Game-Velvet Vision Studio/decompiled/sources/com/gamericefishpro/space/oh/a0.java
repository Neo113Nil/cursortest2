package com.gamericefishpro.space.oh;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements h, Serializable {
    public Function0 d;
    public Object e;

    @Override // com.gamericefishpro.space.oh.h
    public final Object getValue() {
        if (this.e == y.a) {
            Function0 function0 = this.d;
            Intrinsics.b(function0);
            this.e = function0.invoke();
            this.d = null;
        }
        return this.e;
    }

    public final String toString() {
        return this.e != y.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
