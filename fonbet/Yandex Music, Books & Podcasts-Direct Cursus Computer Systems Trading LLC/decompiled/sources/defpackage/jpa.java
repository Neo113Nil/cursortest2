package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface jpa extends jx7 {
    static /* synthetic */ void A0(jpa jpaVar, ai3 ai3Var, long j, long j2, float f, kpa kpaVar, d43 d43Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        jpaVar.F0(ai3Var, j3, (i2 & 4) != 0 ? f0(jpaVar.e(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? dbc.a : kpaVar, (i2 & 32) != 0 ? null : d43Var, (i2 & 64) != 0 ? 3 : i);
    }

    static /* synthetic */ void B(jpa jpaVar, long j, long j2, long j3, float f, m85 m85Var, int i, int i2) {
        long j4 = (i2 & 2) != 0 ? 0L : j2;
        jpaVar.v0(j, j4, (i2 & 4) != 0 ? f0(jpaVar.e(), j4) : j3, (i2 & 8) != 0 ? 1.0f : f, dbc.a, (i2 & 32) != 0 ? null : m85Var, (i2 & 64) != 0 ? 3 : i);
    }

    static /* synthetic */ void C(jpa jpaVar, eak eakVar, ai3 ai3Var, float f, amr amrVar, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        kpa kpaVar = amrVar;
        if ((i & 8) != 0) {
            kpaVar = dbc.a;
        }
        jpaVar.e0(eakVar, ai3Var, f2, kpaVar, (i & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void D0(jpa jpaVar, long j, float f, long j2, float f2, kpa kpaVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            f = nmq.c(jpaVar.e()) / 2.0f;
        }
        float f3 = f;
        if ((i2 & 4) != 0) {
            j2 = jpaVar.y0();
        }
        jpaVar.g0(j, f3, j2, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? dbc.a : kpaVar, (i2 & 64) != 0 ? 3 : i);
    }

    static /* synthetic */ void O(jpa jpaVar, o6g o6gVar, long j, long j2, amr amrVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = f0(jpaVar.e(), j3);
        }
        long j4 = j2;
        kpa kpaVar = amrVar;
        if ((i & 16) != 0) {
            kpaVar = dbc.a;
        }
        jpaVar.k0(o6gVar, j3, j4, kpaVar);
    }

    static /* synthetic */ void P(jpa jpaVar, ai3 ai3Var, long j, long j2, long j3, kpa kpaVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            j2 = f0(jpaVar.e(), j);
        }
        if ((i & 8) != 0) {
            j3 = 0;
        }
        if ((i & 32) != 0) {
            kpaVar = dbc.a;
        }
        jpaVar.l0(ai3Var, j, j2, j3, 1.0f, kpaVar);
    }

    static void T(opf opfVar, xod xodVar, Function1 function1) {
        long e = opfVar.a.e();
        opfVar.c((((int) Float.intBitsToFloat((int) (e >> 32))) << 32) | (((int) Float.intBitsToFloat((int) (e & 4294967295L))) & 4294967295L), xodVar, function1);
    }

    static long f0(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    static void j0(jpa jpaVar, yg0 yg0Var, long j, long j2, long j3, long j4, float f, m85 m85Var, int i, int i2) {
        jpaVar.h0(yg0Var, (i2 & 2) != 0 ? 0L : j, j2, (i2 & 8) != 0 ? 0L : j3, (i2 & 16) != 0 ? j2 : j4, (i2 & 32) != 0 ? 1.0f : f, (i2 & 128) != 0 ? null : m85Var, (i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? 1 : i);
    }

    static /* synthetic */ void q(jpa jpaVar, ltp ltpVar, float f, long j, float f2, amr amrVar, int i) {
        if ((i & 2) != 0) {
            f = nmq.c(jpaVar.e()) / 2.0f;
        }
        float f3 = f;
        if ((i & 4) != 0) {
            j = jpaVar.y0();
        }
        long j2 = j;
        if ((i & 8) != 0) {
            f2 = 1.0f;
        }
        float f4 = f2;
        kpa kpaVar = amrVar;
        if ((i & 16) != 0) {
            kpaVar = dbc.a;
        }
        jpaVar.I(ltpVar, f3, j2, f4, kpaVar);
    }

    static /* synthetic */ void u(jpa jpaVar, long j, long j2, long j3, int i) {
        if ((i & 4) != 0) {
            j2 = f0(jpaVar.e(), 0L);
        }
        jpaVar.H(j, 0L, j2, (i & 8) != 0 ? 0L : j3, dbc.a);
    }

    static /* synthetic */ void x0(jpa jpaVar, eak eakVar, long j, float f, kpa kpaVar, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            kpaVar = dbc.a;
        }
        jpaVar.f(eakVar, j, f2, kpaVar);
    }

    void F0(ai3 ai3Var, long j, long j2, float f, kpa kpaVar, m85 m85Var, int i);

    void H(long j, long j2, long j3, long j4, kpa kpaVar);

    void I(ltp ltpVar, float f, long j, float f2, kpa kpaVar);

    void V(long j, float f, float f2, boolean z, long j2, long j3, float f3, kpa kpaVar);

    default long e() {
        return q0().B();
    }

    void e0(eak eakVar, ai3 ai3Var, float f, kpa kpaVar, int i);

    void f(eak eakVar, long j, float f, kpa kpaVar);

    void g0(long j, float f, long j2, float f2, kpa kpaVar, int i);

    xof getLayoutDirection();

    void h0(yg0 yg0Var, long j, long j2, long j3, long j4, float f, m85 m85Var, int i);

    void k0(o6g o6gVar, long j, long j2, kpa kpaVar);

    void l0(ai3 ai3Var, long j, long j2, long j3, float f, kpa kpaVar);

    nsh q0();

    void s(long j, long j2, long j3, float f, int i);

    void u0(ArrayList arrayList, long j, float f);

    void v0(long j, long j2, long j3, float f, kpa kpaVar, m85 m85Var, int i);

    default long y0() {
        return a4g.y(q0().B());
    }
}
