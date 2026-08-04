package com.gamericefishpro.space.f2;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ u0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(u0 u0Var, int i) {
        super(1);
        this.d = i;
        this.e = u0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                t0.o((t0) obj, this.e, 0, 0);
                break;
            case 1:
                ((t0) obj).h(this.e, 0, 0, 0.0f);
                break;
            case 2:
                t0.l((t0) obj, this.e, 0, 0);
                break;
            case 3:
                ((t0) obj).h(this.e, 0, 0, 0.0f);
                break;
            default:
                ((t0) obj).h(this.e, 0, 0, 0.0f);
                break;
        }
        return Unit.a;
    }
}
