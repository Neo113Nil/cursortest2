package com.gamericefishpro.space.vh;

import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.ei.c0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends g implements com.gamericefishpro.space.ei.h {
    private final int d;

    public h(com.gamericefishpro.space.th.a aVar) {
        super(aVar);
        this.d = 2;
    }

    @Override // com.gamericefishpro.space.ei.h
    public final int getArity() {
        return this.d;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        b0.a.getClass();
        String strA = c0.a(this);
        Intrinsics.checkNotNullExpressionValue(strA, "renderLambdaToString(...)");
        return strA;
    }
}
