package com.gamericefishpro.space.ei;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l implements h, Serializable {
    private final int arity;

    public l(int i) {
        this.arity = i;
    }

    @Override // com.gamericefishpro.space.ei.h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        b0.a.getClass();
        String strA = c0.a(this);
        Intrinsics.checkNotNullExpressionValue(strA, "renderLambdaToString(...)");
        return strA;
    }
}
