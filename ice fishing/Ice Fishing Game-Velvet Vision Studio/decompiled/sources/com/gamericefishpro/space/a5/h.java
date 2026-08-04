package com.gamericefishpro.space.a5;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.e.o;
import com.gamericefishpro.space.e.p;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.f0.w;
import com.gamericefishpro.space.f2.k;
import com.gamericefishpro.space.f5.q;
import com.gamericefishpro.space.g0.v;
import com.gamericefishpro.space.q0.m;
import com.gamericefishpro.space.t0.a0;
import com.gamericefishpro.space.t0.t2;
import com.gamericefishpro.space.z4.p0;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Function0 {
    public final /* synthetic */ int d;

    public /* synthetic */ h(int i) {
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Class<?> returnType;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 1:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 2:
                t2 t2Var = com.gamericefishpro.space.c1.b.a;
                return com.gamericefishpro.space.c1.a.d;
            case 3:
                com.gamericefishpro.space.b1.d dVar = com.gamericefishpro.space.ej.a.b;
                if (dVar != null) {
                    return new com.gamericefishpro.space.cj.a(dVar, new h(6));
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case 4:
                com.gamericefishpro.space.b1.d dVar2 = com.gamericefishpro.space.ej.a.b;
                if (dVar2 != null) {
                    return new com.gamericefishpro.space.cj.a(((com.gamericefishpro.space.nj.a) dVar2.i).d, new h(5));
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                com.gamericefishpro.space.b1.d dVar3 = com.gamericefishpro.space.ej.a.b;
                if (dVar3 != null) {
                    return ((com.gamericefishpro.space.nj.a) dVar3.i).d;
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.gamericefishpro.space.b1.d dVar4 = com.gamericefishpro.space.ej.a.b;
                if (dVar4 != null) {
                    return dVar4;
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                a0 a0Var = com.gamericefishpro.space.d5.a.a;
                return null;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return UUID.randomUUID().toString();
            case 9:
                return Unit.a;
            case 10:
                a0 a0Var2 = o.a;
                return null;
            case RequestError.STOP_TRACKING /* 11 */:
                a0 a0Var3 = p.a;
                return null;
            case 12:
                return new com.gamericefishpro.space.e1.d(new LinkedHashMap());
            case 13:
                t2 t2Var2 = com.gamericefishpro.space.e1.h.a;
                return null;
            case 14:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 15:
                try {
                    Method method = (Method) com.gamericefishpro.space.e6.c.v.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 16:
                return new w(0, 0);
            case 17:
                return new v(0, 0);
            case 18:
                t2 t2Var3 = com.gamericefishpro.space.g1.g.a;
                return null;
            case 19:
                t2 t2Var4 = com.gamericefishpro.space.g1.i.a;
                return null;
            case 20:
                com.gamericefishpro.space.hi.d.d.getClass();
                return Integer.valueOf(com.gamericefishpro.space.hi.d.e.b(2147418112) + 65536);
            case 21:
                return new p0();
            case 22:
                com.gamericefishpro.space.c5.e eVar = new com.gamericefishpro.space.c5.e(0);
                eVar.a(b0.a(com.gamericefishpro.space.i5.b.class), new q(15));
                return eVar.c();
            case 23:
                a0 a0Var4 = com.gamericefishpro.space.k5.a.a;
                return null;
            case 24:
                t2 t2Var5 = com.gamericefishpro.space.l0.c.a;
                return null;
            case 25:
                a0 a0Var5 = com.gamericefishpro.space.n0.a.a;
                return null;
            case 26:
                long j = com.gamericefishpro.space.s0.a.z;
                return new com.gamericefishpro.space.q0.a(j, com.gamericefishpro.space.s0.a.j, com.gamericefishpro.space.s0.a.A, com.gamericefishpro.space.s0.a.k, com.gamericefishpro.space.s0.a.e, com.gamericefishpro.space.s0.a.E, com.gamericefishpro.space.s0.a.n, com.gamericefishpro.space.s0.a.F, com.gamericefishpro.space.s0.a.o, com.gamericefishpro.space.s0.a.R, com.gamericefishpro.space.s0.a.t, com.gamericefishpro.space.s0.a.S, com.gamericefishpro.space.s0.a.u, com.gamericefishpro.space.s0.a.a, com.gamericefishpro.space.s0.a.g, com.gamericefishpro.space.s0.a.I, com.gamericefishpro.space.s0.a.r, com.gamericefishpro.space.s0.a.Q, com.gamericefishpro.space.s0.a.s, j, com.gamericefishpro.space.s0.a.f, com.gamericefishpro.space.s0.a.d, com.gamericefishpro.space.s0.a.b, com.gamericefishpro.space.s0.a.h, com.gamericefishpro.space.s0.a.c, com.gamericefishpro.space.s0.a.i, com.gamericefishpro.space.s0.a.x, com.gamericefishpro.space.s0.a.y, com.gamericefishpro.space.s0.a.D, com.gamericefishpro.space.s0.a.J, com.gamericefishpro.space.s0.a.P, com.gamericefishpro.space.s0.a.K, com.gamericefishpro.space.s0.a.L, com.gamericefishpro.space.s0.a.M, com.gamericefishpro.space.s0.a.N, com.gamericefishpro.space.s0.a.O, com.gamericefishpro.space.s0.a.B, com.gamericefishpro.space.s0.a.C, com.gamericefishpro.space.s0.a.l, com.gamericefishpro.space.s0.a.m, com.gamericefishpro.space.s0.a.G, com.gamericefishpro.space.s0.a.H, com.gamericefishpro.space.s0.a.p, com.gamericefishpro.space.s0.a.q, com.gamericefishpro.space.s0.a.T, com.gamericefishpro.space.s0.a.U, com.gamericefishpro.space.s0.a.v, com.gamericefishpro.space.s0.a.w);
            case 27:
                t2 t2Var6 = com.gamericefishpro.space.q0.b.a;
                return Boolean.TRUE;
            case 28:
                k kVar = m.a;
                return Boolean.TRUE;
            default:
                return new com.gamericefishpro.space.c3.f(48);
        }
    }
}
