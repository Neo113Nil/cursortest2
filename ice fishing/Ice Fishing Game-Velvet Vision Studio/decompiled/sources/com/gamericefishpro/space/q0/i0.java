package com.gamericefishpro.space.q0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.t0.t2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public static final t2 a = new t2(new n(3));

    public static final com.gamericefishpro.space.o1.k0 a(com.gamericefishpro.space.s0.e eVar, com.gamericefishpro.space.t0.r rVar) {
        h0 h0Var = (h0) rVar.j(a);
        switch (eVar.ordinal()) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return h0Var.h;
            case 1:
                return h0Var.e;
            case 2:
                return h0Var.g;
            case 3:
                return b(h0Var.e);
            case 4:
                return h0Var.a;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return b(h0Var.a);
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return com.gamericefishpro.space.k0.e.a;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return h0Var.d;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                com.gamericefishpro.space.k0.d dVar = h0Var.d;
                com.gamericefishpro.space.k0.b bVar = g0.i;
                return com.gamericefishpro.space.k0.d.b(dVar, bVar, null, null, bVar, 6);
            case 9:
                return h0Var.f;
            case 10:
                com.gamericefishpro.space.k0.d dVar2 = h0Var.d;
                com.gamericefishpro.space.k0.b bVar2 = g0.i;
                return com.gamericefishpro.space.k0.d.b(dVar2, null, bVar2, bVar2, null, 9);
            case RequestError.STOP_TRACKING /* 11 */:
                return b(h0Var.d);
            case 12:
                return h0Var.c;
            case 13:
                return com.gamericefishpro.space.o1.o.b;
            case 14:
                return h0Var.b;
            default:
                throw new com.gamericefishpro.space.oh.k();
        }
    }

    public static com.gamericefishpro.space.k0.d b(com.gamericefishpro.space.k0.d dVar) {
        com.gamericefishpro.space.k0.b bVar = g0.i;
        return com.gamericefishpro.space.k0.d.b(dVar, null, null, bVar, bVar, 3);
    }
}
