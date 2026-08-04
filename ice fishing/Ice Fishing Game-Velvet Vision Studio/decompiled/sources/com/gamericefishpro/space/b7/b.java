package com.gamericefishpro.space.b7;

import com.gamericefishpro.space.si.a0;
import com.gamericefishpro.space.si.e0;
import com.gamericefishpro.space.si.n0;
import com.gamericefishpro.space.z4.s0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends s0 {
    public final n0 b;
    public final a0 c;

    public b(a initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        n0 n0VarB = e0.b(initialState);
        this.b = n0VarB;
        this.c = new a0(n0VarB);
    }

    public final void e(Function1 update) {
        Intrinsics.checkNotNullParameter(update, "update");
        n0 n0Var = this.b;
        n0Var.i(update.invoke(n0Var.getValue()));
    }
}
