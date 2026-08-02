package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class tua {
    public static final float a;
    public static final float e;
    public static final float f;
    public static final float h;
    public static final float i;
    public static final float k;
    public static final float l;
    public static final float m;
    public static final float n;
    public static final float b = 356;
    public static final float c = RemoteCameraConfig.Mic.BUFFER_SIZE;
    public static final float d = 40;
    public static final float g = 16;
    public static final float j = 123;

    static {
        float f2 = 8;
        a = f2;
        e = f2;
        float f3 = 24;
        f = f3;
        float f4 = 20;
        h = f4;
        i = f4;
        k = f2;
        l = f3;
        float f5 = 12;
        m = f5;
        n = f5;
    }

    public static final void a(zwa zwaVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        yci f2;
        zwaVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1421343650);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(zwaVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K).a;
            aqi O = gld.O(zwaVar.K(), oq5Var);
            Unit unit = Unit.a;
            boolean h2 = oq5Var.h(zwaVar) | oq5Var.h(mm6Var);
            Object K2 = oq5Var.K();
            Continuation continuation = null;
            if (h2 || K2 == kjnVar) {
                K2 = new n71(zwaVar, mm6Var, continuation, 10);
                oq5Var.k0(K2);
            }
            gld.w(oq5Var, unit, (Function2) K2);
            yci b2 = a.b(d.c(yciVar, 1.0f), d85.b(d85.b, 0.5f, 0.0f, 0.0f, 0.0f, 14), vnj.i);
            boolean h3 = oq5Var.h(zwaVar);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                K3 = new f98(zwaVar, continuation, 16);
                oq5Var.k0(K3);
            }
            f2 = b2.f(new SuspendPointerInputElement(unit, null, null, new dur((Function2) K3), 6));
            gz2 gz2Var = b2c.o;
            lx0 lx0Var = qx0.e;
            boolean f3 = oq5Var.f(O) | oq5Var.h(zwaVar);
            Object K4 = oq5Var.K();
            if (f3 || K4 == kjnVar) {
                K4 = new ny2(23, zwaVar, O);
                oq5Var.k0(K4);
            }
            weo.g(f2, null, null, lx0Var, gz2Var, null, false, (Function1) K4, oq5Var, 221184, 206);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(zwaVar, yciVar, i2, 29);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    public static final void b(final iwa iwaVar, final zwa zwaVar, yci yciVar, hq5 hq5Var, int i2) {
        long j2;
        yci f2;
        wua wuaVar;
        int i3;
        kb5 kb5Var;
        kb5 kb5Var2;
        kb5 kb5Var3;
        b bVar;
        vci vciVar;
        kjn kjnVar;
        grb grbVar;
        kb5 kb5Var4;
        ?? r2;
        oq5 oq5Var;
        b bVar2;
        boolean z;
        float f3;
        kjn kjnVar2;
        zwa zwaVar2;
        kjn kjnVar3;
        oq5 oq5Var2;
        yci yciVar2;
        oq5 oq5Var3;
        wua wuaVar2 = iwaVar.i;
        oq5 oq5Var4 = (oq5) hq5Var;
        oq5Var4.b0(-1022316060);
        int i4 = 2;
        int i5 = i2 | (oq5Var4.f(iwaVar) ? 4 : 2) | (oq5Var4.h(zwaVar) ? 32 : 16) | 384;
        if ((i5 & 147) == 146 && oq5Var4.z()) {
            oq5Var4.S();
            yciVar2 = yciVar;
            zwaVar2 = zwaVar;
            oq5Var3 = oq5Var4;
        } else {
            d85 T = pd.T(iwaVar.p);
            if (T == null) {
                oq5Var4.Z(1101785101);
                j2 = ((dq0) oq5Var4.j(eq0.a)).c.b;
                oq5Var4.p(false);
            } else {
                oq5Var4.Z(1101782807);
                oq5Var4.p(false);
                j2 = T.a;
            }
            float f4 = a;
            vci vciVar2 = vci.a;
            yci s = d.s(gut.z(gut.a0(gut.p1(androidx.compose.foundation.layout.a.m(vciVar2, f4)))), b, c);
            float f5 = d;
            yci b2 = a.b(xp3.u(y1g.d0(s, e, ugo.a(f5), false, 28), ugo.a(f5)), j2, vnj.i);
            Unit unit = Unit.a;
            Object K = oq5Var4.K();
            Continuation continuation = null;
            kjn kjnVar4 = gq5.a;
            if (K == kjnVar4) {
                K = new z21(i4, 15, continuation);
                oq5Var4.k0(K);
            }
            f2 = b2.f(new SuspendPointerInputElement(unit, null, null, new dur((Function2) K), 6));
            boolean h2 = oq5Var4.h(zwaVar);
            Object K2 = oq5Var4.K();
            if (h2 || K2 == kjnVar4) {
                K2 = new qua(zwaVar, 0);
                oq5Var4.k0(K2);
            }
            yci b3 = nfp.b(f2, false, (Function1) K2);
            kfh d2 = ug3.d(b2c.b, false);
            int i6 = oq5Var4.P;
            androidx.compose.runtime.internal.a l2 = oq5Var4.l();
            yci H = vnj.H(oq5Var4, b3);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var4.d0();
            if (oq5Var4.O) {
                oq5Var4.k(grbVar2);
            } else {
                oq5Var4.n0();
            }
            kb5 kb5Var5 = wp5.f;
            g0g.U(oq5Var4, d2, kb5Var5);
            kb5 kb5Var6 = wp5.e;
            g0g.U(oq5Var4, l2, kb5Var6);
            kb5 kb5Var7 = wp5.g;
            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var4, i6, kb5Var7);
            }
            kb5 kb5Var8 = wp5.d;
            g0g.U(oq5Var4, H, kb5Var8);
            String str = iwaVar.q;
            b bVar3 = b.a;
            if (str != null) {
                oq5Var4.Z(410470228);
                kb5Var3 = kb5Var7;
                wuaVar = wuaVar2;
                kb5Var = kb5Var6;
                kb5Var2 = kb5Var8;
                bVar = bVar3;
                vciVar = vciVar2;
                kjnVar = kjnVar4;
                grbVar = grbVar2;
                r2 = 0;
                i3 = i5;
                kb5Var4 = kb5Var5;
                p1g.a(iwaVar.q, null, bVar3.b(vciVar2), null, null, null, hd6.c, 0.0f, null, 0, oq5Var4, 1572912, 952);
                oq5Var = oq5Var4;
            } else {
                wuaVar = wuaVar2;
                i3 = i5;
                kb5Var = kb5Var6;
                kb5Var2 = kb5Var8;
                kb5Var3 = kb5Var7;
                bVar = bVar3;
                vciVar = vciVar2;
                kjnVar = kjnVar4;
                grbVar = grbVar2;
                kb5Var4 = kb5Var5;
                r2 = 0;
                oq5Var4.Z(403921912);
                oq5Var = oq5Var4;
            }
            oq5Var.p(r2);
            vci vciVar3 = vciVar;
            b bVar4 = bVar;
            hq5 hq5Var2 = oq5Var;
            tva.a(iwaVar.o, false, null, androidx.compose.foundation.layout.a.k(bVar4.a(vciVar3, b2c.c), 0.0f, -tva.e, 1), hq5Var2, 432);
            oq5 oq5Var5 = hq5Var2;
            yci d3 = d.d(vciVar3, 1.0f);
            float f6 = j;
            float f7 = g;
            float f8 = f;
            yci p = androidx.compose.foundation.layout.a.p(d3, f8, f6, f8, f7);
            Object K3 = oq5Var5.K();
            kjn kjnVar5 = kjnVar;
            if (K3 == kjnVar5) {
                K3 = new rua(0);
                oq5Var5.k0(K3);
            }
            yci b4 = nfp.b(p, r2, (Function1) K3);
            ta5 a2 = sa5.a(qx0.c, iwaVar.b ? b2c.o : b2c.n, oq5Var5, r2);
            int i7 = oq5Var5.P;
            androidx.compose.runtime.internal.a l3 = oq5Var5.l();
            yci H2 = vnj.H(oq5Var5, b4);
            oq5Var5.d0();
            if (oq5Var5.O) {
                oq5Var5.k(grbVar);
            } else {
                oq5Var5.n0();
            }
            g0g.U(oq5Var5, a2, kb5Var4);
            g0g.U(oq5Var5, l3, kb5Var);
            if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var5, i7, kb5Var3);
            }
            g0g.U(oq5Var5, H2, kb5Var2);
            int i8 = i3 & 14;
            xv7.l(iwaVar, null, oq5Var5, i8);
            String str2 = iwaVar.f;
            if (str2 == null || str2.length() == 0 || iwaVar.g == null) {
                bVar2 = bVar4;
                z = true;
                f3 = 1.0f;
                kjnVar2 = kjnVar5;
                oq5Var5.Z(577171330);
            } else {
                oq5Var5.Z(584932893);
                bVar2 = bVar4;
                z = true;
                kjnVar2 = kjnVar5;
                f3 = 1.0f;
                gld.m(3072, oq5Var5, androidx.compose.foundation.layout.a.q(vciVar3, 0.0f, k, 0.0f, 0.0f, 13), iwaVar.f, iwaVar.g, iwaVar.b);
            }
            oq5Var5.p(r2);
            wua wuaVar3 = iwaVar.h;
            boolean h3 = oq5Var5.h(zwaVar) | (i8 == 4 ? z : r2);
            Object K4 = oq5Var5.K();
            if (h3 || K4 == kjnVar2) {
                final int i9 = 0;
                K4 = new Function0() { // from class: sua
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                zwaVar.a(iwaVar.h.b);
                                break;
                            default:
                                zwaVar.a(iwaVar.i.b);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var5.k0(K4);
            }
            float f9 = f3;
            kjn kjnVar6 = kjnVar2;
            b bVar5 = bVar2;
            uua.a(wuaVar3, (Function0) K4, d.d(androidx.compose.foundation.layout.a.q(vciVar3, 0.0f, l, 0.0f, 0.0f, 13), f9), oq5Var5, 384);
            if (wuaVar != null) {
                oq5Var5.Z(585590992);
                boolean h4 = oq5Var5.h(zwaVar) | (i8 == 4 ? z : r2);
                Object K5 = oq5Var5.K();
                if (h4 || K5 == kjnVar6) {
                    final int i10 = 1;
                    K5 = new Function0() { // from class: sua
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i10) {
                                case 0:
                                    zwaVar.a(iwaVar.h.b);
                                    break;
                                default:
                                    zwaVar.a(iwaVar.i.b);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var5.k0(K5);
                }
                uua.a(wuaVar, (Function0) K5, d.d(androidx.compose.foundation.layout.a.q(vciVar3, 0.0f, m, 0.0f, 0.0f, 13), f9), oq5Var5, 384);
            } else {
                oq5Var5.Z(577171330);
            }
            oq5Var5.p(r2);
            if (iwaVar.m == null || iwaVar.n == null) {
                zwaVar2 = zwaVar;
                kjnVar3 = kjnVar6;
                oq5Var5.Z(577171330);
                oq5Var2 = oq5Var5;
            } else {
                oq5Var5.Z(586002765);
                zwaVar2 = zwaVar;
                kjnVar3 = kjnVar6;
                ff7.k(iwaVar.m, iwaVar.n, androidx.compose.foundation.layout.a.q(vciVar3, 0.0f, n, 0.0f, 0.0f, 13), oq5Var5, 384, 0);
                oq5Var2 = oq5Var5;
            }
            oq5Var2.p(r2);
            oq5Var2.p(z);
            if (iwaVar.l != null) {
                oq5Var2.Z(413078010);
                yci b5 = bVar5.b(vciVar3);
                Object K6 = oq5Var2.K();
                if (K6 == kjnVar3) {
                    K6 = new rua(1);
                    oq5Var2.k0(K6);
                }
                up6.h(iwaVar, nfp.b(b5, r2, (Function1) K6), oq5Var2, i8);
            } else {
                oq5Var2.Z(403921912);
            }
            oq5Var2.p(r2);
            boolean h5 = oq5Var2.h(zwaVar2);
            Object K7 = oq5Var2.K();
            if (h5 || K7 == kjnVar3) {
                K7 = new pua(zwaVar2, 1);
                oq5Var2.k0(K7);
            }
            Function0 function0 = (Function0) K7;
            yci q = androidx.compose.foundation.layout.a.q(bVar5.a(vciVar3, b2c.d), 0.0f, h, i, 0.0f, 9);
            Object K8 = oq5Var2.K();
            if (K8 == kjnVar3) {
                K8 = new rua(2);
                oq5Var2.k0(K8);
            }
            xua.a(iwaVar, function0, nfp.b(q, r2, (Function1) K8), oq5Var2, i8);
            oq5Var2.p(z);
            yciVar2 = vciVar3;
            oq5Var3 = oq5Var2;
        }
        xmn r = oq5Var3.r();
        if (r != null) {
            r.d = new v48(i2, 5, yciVar2, iwaVar, zwaVar2);
        }
    }
}
