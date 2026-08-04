package com.gamericefishpro.space.b1;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.z.h1;
import com.gamericefishpro.space.z.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g extends com.gamericefishpro.space.ei.a implements Function2 {
    public final /* synthetic */ int A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.A = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int iIntValue = ((Number) obj2).intValue();
                ((h) this.d).d((r) obj, iIntValue);
                break;
            default:
                long j = ((com.gamericefishpro.space.c3.p) obj).a;
                j1 j1Var = (j1) this.d;
                a0.u(j1Var.d0.c(), null, new h1(j1Var, j, null, 1), 3);
                break;
        }
        return Unit.a;
    }
}
