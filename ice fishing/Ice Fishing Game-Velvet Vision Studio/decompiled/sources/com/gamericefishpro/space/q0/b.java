package com.gamericefishpro.space.q0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.t0.t2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final t2 a = new t2(new com.gamericefishpro.space.a5.h(26));
    public static final t2 b = new t2(new com.gamericefishpro.space.a5.h(27));

    public static final long a(com.gamericefishpro.space.s0.b bVar, com.gamericefishpro.space.t0.r rVar) {
        a aVar = (a) rVar.j(a);
        switch (bVar.ordinal()) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return aVar.n;
            case 1:
                return aVar.w;
            case 2:
                return aVar.y;
            case 3:
                return aVar.v;
            case 4:
                return aVar.e;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return aVar.u;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return aVar.o;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return aVar.x;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return aVar.z;
            case 9:
                return aVar.b;
            case 10:
                return aVar.d;
            case RequestError.STOP_TRACKING /* 11 */:
                return aVar.M;
            case 12:
                return aVar.N;
            case 13:
                return aVar.g;
            case 14:
                return aVar.i;
            case 15:
                return aVar.Q;
            case 16:
                return aVar.R;
            case 17:
                return aVar.q;
            case 18:
                return aVar.s;
            case 19:
                return aVar.k;
            case 20:
                return aVar.m;
            case 21:
                return aVar.U;
            case 22:
                return aVar.V;
            case 23:
                return aVar.A;
            case 24:
                return aVar.B;
            case 25:
                return aVar.a;
            case 26:
                return aVar.c;
            case 27:
                return aVar.K;
            case 28:
                return aVar.L;
            case 29:
                return aVar.C;
            case 30:
                return aVar.f;
            case 31:
                return aVar.h;
            case 32:
                return aVar.O;
            case 33:
                return aVar.P;
            case 34:
                return aVar.p;
            case 35:
                return aVar.D;
            case 36:
                return aVar.F;
            case 37:
                return aVar.G;
            case 38:
                return aVar.H;
            case 39:
                return aVar.I;
            case RequestError.NETWORK_FAILURE /* 40 */:
                return aVar.J;
            case RequestError.NO_DEV_KEY /* 41 */:
                return aVar.E;
            case 42:
                return aVar.t;
            case 43:
                return aVar.r;
            case 44:
                return aVar.j;
            case 45:
                return aVar.l;
            case 46:
                return aVar.S;
            case 47:
                return aVar.T;
            default:
                throw new com.gamericefishpro.space.oh.k();
        }
    }
}
