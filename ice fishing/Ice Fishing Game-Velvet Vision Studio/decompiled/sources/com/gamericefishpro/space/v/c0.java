package com.gamericefishpro.space.v;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.w.g1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ j0 e;
    public final /* synthetic */ k0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(j0 j0Var, k0 k0Var, int i) {
        super(1);
        this.d = i;
        this.e = j0Var;
        this.i = k0Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g1 g1Var = (g1) obj;
                y yVar = y.d;
                y yVar2 = y.e;
                if (g1Var.b(yVar, yVar2)) {
                    l0 l0Var = this.e.a.a;
                    return l0Var != null ? l0Var.a : f0.b;
                }
                if (!g1Var.b(yVar2, y.i)) {
                    return f0.b;
                }
                l0 l0Var2 = this.i.a.a;
                return l0Var2 != null ? l0Var2.a : f0.b;
            case 1:
                int iOrdinal = ((y) obj).ordinal();
                float f = 0.0f;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        f = 1.0f;
                    } else {
                        if (iOrdinal != 2) {
                            throw new com.gamericefishpro.space.oh.k();
                        }
                        if (this.i.a.a == null) {
                            f = 1.0f;
                        }
                    }
                } else if (this.e.a.a == null) {
                    f = 1.0f;
                }
                return Float.valueOf(f);
            case 2:
                g1 g1Var2 = (g1) obj;
                y yVar3 = y.d;
                y yVar4 = y.e;
                if (g1Var2.b(yVar3, yVar4)) {
                    return f0.b;
                }
                if (!g1Var2.b(yVar4, y.i)) {
                    return f0.b;
                }
                r0 r0Var = this.i.a;
                return f0.b;
            default:
                int iOrdinal2 = ((y) obj).ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new com.gamericefishpro.space.oh.k();
                    }
                    r0 r0Var2 = this.i.a;
                }
                return Float.valueOf(1.0f);
        }
    }
}
