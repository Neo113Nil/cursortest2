package com.gamericefishpro.space.h2;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends com.gamericefishpro.space.ei.l implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ f1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(f1 f1Var, int i) {
        super(0);
        this.d = i;
        this.e = f1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                f1 f1Var = this.e;
                com.gamericefishpro.space.o1.q qVar = f1Var.a0;
                Intrinsics.b(qVar);
                f1Var.E0(qVar, f1Var.Z);
                break;
            default:
                f1 f1Var2 = this.e.J;
                if (f1Var2 != null) {
                    f1Var2.R0();
                }
                break;
        }
        return Unit.a;
    }
}
