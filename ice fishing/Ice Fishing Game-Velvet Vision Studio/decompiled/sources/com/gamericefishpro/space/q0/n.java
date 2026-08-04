package com.gamericefishpro.space.q0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.t0.t2;
import com.gamericefishpro.space.y.c1;
import com.gamericefishpro.space.y.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Function0 {
    public final /* synthetic */ int d;

    public /* synthetic */ n(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                t2 t2Var = o.a;
                return Boolean.FALSE;
            case 1:
                return r.a;
            case 2:
                return new t();
            case 3:
                return new h0();
            case 4:
                return new com.gamericefishpro.space.c3.f(0);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return com.gamericefishpro.space.s0.i.a;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return Unit.a;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return Boolean.TRUE;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return Unit.a;
            case 9:
                com.gamericefishpro.space.t0.s.b("Unexpected call to default provider");
                throw new com.gamericefishpro.space.oh.e();
            case 10:
                com.gamericefishpro.space.f1.y yVar = new com.gamericefishpro.space.f1.y(new com.gamericefishpro.space.r2.z(11));
                yVar.d();
                return yVar;
            case RequestError.STOP_TRACKING /* 11 */:
                return Unit.a;
            case 12:
                com.gamericefishpro.space.t0.a0 a0Var = com.gamericefishpro.space.y.n0.a;
                return com.gamericefishpro.space.y.d0.a;
            case 13:
                return new w0();
            default:
                return new c1(0);
        }
    }
}
