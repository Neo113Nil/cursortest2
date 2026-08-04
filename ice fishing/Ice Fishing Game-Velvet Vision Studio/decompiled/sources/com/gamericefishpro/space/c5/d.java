package com.gamericefishpro.space.c5;

import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.z4.s0;
import com.gamericefishpro.space.z4.u0;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements u0 {
    public final g[] a;

    public d(g... initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        this.a = initializers;
    }

    @Override // com.gamericefishpro.space.z4.u0
    public final s0 b(Class modelClass, f extras) {
        s0 s0Var;
        g gVar;
        Function1 function1;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(modelClass, "<this>");
        com.gamericefishpro.space.ei.g modelClass2 = b0.a(modelClass);
        g[] gVarArr = this.a;
        g[] initializers = (g[]) Arrays.copyOf(gVarArr, gVarArr.length);
        Intrinsics.checkNotNullParameter(modelClass2, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        int length = initializers.length;
        int i = 0;
        while (true) {
            s0Var = null;
            if (i >= length) {
                gVar = null;
                break;
            }
            gVar = initializers[i];
            if (gVar.a.equals(modelClass2)) {
                break;
            }
            i++;
        }
        if (gVar != null && (function1 = gVar.b) != null) {
            s0Var = (s0) function1.invoke(extras);
        }
        if (s0Var != null) {
            return s0Var;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + modelClass2.b()).toString());
    }
}
