package com.gamericefishpro.space.v;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.w.g1;
import com.gamericefishpro.space.w.v0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ i0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(i0 i0Var, int i) {
        super(1);
        this.d = i;
        this.e = i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g1 g1Var = (g1) obj;
                y yVar = y.d;
                y yVar2 = y.e;
                v0 v0Var = null;
                if (!g1Var.b(yVar, yVar2)) {
                    if (g1Var.b(yVar2, y.i)) {
                        r0 r0Var = this.e.I.a;
                    } else {
                        v0Var = f0.d;
                    }
                }
                return v0Var == null ? f0.d : v0Var;
            default:
                g1 g1Var2 = (g1) obj;
                y yVar3 = y.d;
                y yVar4 = y.e;
                if (g1Var2.b(yVar3, yVar4)) {
                    return f0.c;
                }
                if (!g1Var2.b(yVar4, y.i)) {
                    return f0.c;
                }
                r0 r0Var2 = this.e.I.a;
                return f0.c;
        }
    }
}
