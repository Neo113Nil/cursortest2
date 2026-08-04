package com.gamericefishpro.space.d0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h2.b2;
import com.gamericefishpro.space.h2.c2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ e0 e;

    public /* synthetic */ k0(e0 e0Var, int i) {
        this.d = i;
        this.e = e0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c2 c2Var = (c2) obj;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.c(c2Var, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
                e0 e0Var = (e0) c2Var;
                k1 k1Var = this.e.I;
                if (!Intrinsics.a(e0Var.H, k1Var)) {
                    e0Var.H = k1Var;
                    e0Var.J.invoke(k1Var);
                    e0Var.I = k1Var;
                    com.gamericefishpro.space.h2.k.w(e0Var, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new k0(e0Var, 0));
                }
                return b2.e;
            default:
                Intrinsics.c(c2Var, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
                this.e.H = ((e0) c2Var).I;
                return Boolean.FALSE;
        }
    }
}
