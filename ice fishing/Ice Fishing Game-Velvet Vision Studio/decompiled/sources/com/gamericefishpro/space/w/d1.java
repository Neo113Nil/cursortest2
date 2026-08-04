package com.gamericefishpro.space.w;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.t0.k2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d1 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ l1 e;

    public /* synthetic */ d1(l1 l1Var, int i) {
        this.d = i;
        this.e = l1Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                l1 l1Var = this.e;
                if (Intrinsics.a(l1Var.d.getValue(), l1Var.a.k())) {
                    com.gamericefishpro.space.t0.d1 d1Var = l1Var.g;
                    if (((k2) com.gamericefishpro.space.f1.p.t(d1Var.e, d1Var)).c == Long.MIN_VALUE && !((Boolean) l1Var.h.getValue()).booleanValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return Long.valueOf(this.e.b());
        }
    }
}
