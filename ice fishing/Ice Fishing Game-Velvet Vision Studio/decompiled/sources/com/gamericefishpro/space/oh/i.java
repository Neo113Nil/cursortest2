package com.gamericefishpro.space.oh;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class i {
    public static h a(j mode, Function0 initializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int iOrdinal = mode.ordinal();
        if (iOrdinal == 0) {
            return new s(initializer, null, 2, null);
        }
        if (iOrdinal == 1) {
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            r rVar = new r();
            rVar.d = initializer;
            rVar.e = y.a;
            return rVar;
        }
        if (iOrdinal != 2) {
            throw new k();
        }
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        a0 a0Var = new a0();
        a0Var.d = initializer;
        a0Var.e = y.a;
        return a0Var;
    }

    public static s b(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new s(initializer, null, 2, null);
    }
}
