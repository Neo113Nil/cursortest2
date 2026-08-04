package com.gamericefishpro.space.h0;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ u0 e;

    public /* synthetic */ s0(u0 u0Var, int i) {
        this.d = i;
        this.e = u0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Float.valueOf(this.e.I.b());
            case 1:
                return Float.valueOf(this.e.I.f());
            default:
                u0 u0Var = this.e;
                return Float.valueOf(u0Var.I.a() - u0Var.I.d());
        }
    }
}
