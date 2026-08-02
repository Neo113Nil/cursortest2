package defpackage;

import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.selection.b;
import androidx.compose.material.MinimumInteractiveModifier;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class uvr {
    public static final float a;
    public static final float c;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float b = 14;
    public static final float d = 24;
    public static final float e = 2;
    public static final act i = new act(100, (kya) null, 6);
    public static final float j = 1;
    public static final float k = 6;
    public static final float l = 125;

    static {
        float f2 = 34;
        a = f2;
        float f3 = 20;
        c = f3;
        f = f2;
        g = f3;
        h = f2 - f3;
    }

    public static final void a(boolean z, Function1 function1, yci yciVar, boolean z2, ds7 ds7Var, hq5 hq5Var, int i2, int i3) {
        int i4;
        ds7 ds7Var2;
        ds7 ds7Var3;
        boolean z3;
        oq5 oq5Var;
        int i5;
        ds7 ds7Var4;
        uoi uoiVar;
        boolean z4;
        boolean z5;
        yci yciVar2;
        int i6;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(25866825);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var2.g(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.h(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        int i7 = i4 | 27648;
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                ds7Var2 = ds7Var;
                if (oq5Var2.f(ds7Var2)) {
                    i6 = SQLiteDatabase.OPEN_SHAREDCACHE;
                    i7 |= i6;
                }
            } else {
                ds7Var2 = ds7Var;
            }
            i6 = SQLiteDatabase.OPEN_FULLMUTEX;
            i7 |= i6;
        } else {
            ds7Var2 = ds7Var;
        }
        boolean z6 = true;
        if (oq5Var2.P(i7 & 1, (74899 & i7) != 74898)) {
            oq5Var2.U();
            if ((i2 & 1) != 0 && !oq5Var2.y()) {
                oq5Var2.S();
                if ((i3 & 32) != 0) {
                    i7 &= -458753;
                }
                i5 = i7;
                ds7Var4 = ds7Var2;
                z6 = z2;
            } else if ((i3 & 32) != 0) {
                i5 = i7 & (-458753);
                ds7Var4 = s7g.n(0L, 0L, oq5Var2, 1023);
                z6 = true;
            } else {
                i5 = i7;
                ds7Var4 = ds7Var2;
            }
            oq5Var2.q();
            oq5Var2.Z(-1604939679);
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = vz1.h(oq5Var2);
            }
            uoi uoiVar2 = (uoi) K;
            oq5Var2.p(false);
            ozm ozmVar = es5.h;
            float n0 = ((jx7) oq5Var2.j(ozmVar)).n0(h);
            Object K2 = oq5Var2.K();
            if (K2 == obj) {
                K2 = szf.g0(Boolean.FALSE);
                oq5Var2.k0(K2);
            }
            aqi aqiVar = (aqi) K2;
            float n02 = ((jx7) oq5Var2.j(ozmVar)).n0(l);
            boolean c2 = oq5Var2.c(n0) | oq5Var2.c(n02);
            Object K3 = oq5Var2.K();
            Object obj2 = K3;
            if (c2 || K3 == obj) {
                qvr qvrVar = new qvr(n0);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(Boolean.FALSE, Float.valueOf(0.0f));
                linkedHashMap.put(Boolean.TRUE, Float.valueOf(qvrVar.r));
                j9h j9hVar = new j9h(linkedHashMap);
                Boolean valueOf = Boolean.valueOf(z);
                ka0 ka0Var = new ka0(valueOf, rvr.s, new svr(n02), i, d5.y);
                ka0Var.m.setValue(j9hVar);
                ka0Var.k(valueOf);
                oq5Var2.k0(ka0Var);
                obj2 = ka0Var;
            }
            ka0 ka0Var2 = (ka0) obj2;
            int i8 = i5 >> 3;
            Object o0 = szf.o0(function1, oq5Var2);
            int i9 = i5 & 14;
            Object o02 = szf.o0(Boolean.valueOf(z), oq5Var2);
            boolean f2 = oq5Var2.f(ka0Var2) | oq5Var2.f(o02) | oq5Var2.f(o0);
            Object K4 = oq5Var2.K();
            if (f2 || K4 == obj) {
                K4 = new lco(ka0Var2, o02, o0, aqiVar, (Continuation) null, 16);
                oq5Var2.k0(K4);
            }
            gld.w(oq5Var2, ka0Var2, (Function2) K4);
            Boolean valueOf2 = Boolean.valueOf(z);
            Boolean bool = (Boolean) aqiVar.getValue();
            bool.getClass();
            boolean f3 = (i9 == 4) | oq5Var2.f(ka0Var2);
            Object K5 = oq5Var2.K();
            Continuation continuation = null;
            if (f3 || K5 == obj) {
                K5 = new z11(z, ka0Var2, (Continuation) null, 20);
                oq5Var2.k0(K5);
            }
            gld.y(valueOf2, bool, (Function2) K5, oq5Var2);
            boolean z7 = oq5Var2.j(es5.n) == xof.b;
            yci yciVar3 = vci.a;
            if (function1 != null) {
                uoiVar = uoiVar2;
                z4 = z6;
                z5 = true;
                yciVar2 = b.b(z, uoiVar, null, z4, new meo(2), function1);
            } else {
                uoiVar = uoiVar2;
                z4 = z6;
                z5 = true;
                yciVar2 = yciVar3;
            }
            if (function1 != null) {
                agr agrVar = yre.a;
                yciVar3 = MinimumInteractiveModifier.a;
            }
            yci j2 = d.j(a.m(d.x(zoa.a(yciVar.f(yciVar3).f(yciVar2), ka0Var2.f, bxj.b, (!z4 || function1 == null) ? false : z5, uoiVar, false, null, new d90(ka0Var2, continuation, 0), z7, 32), b2c.f, 2), e), f, g);
            kfh d2 = ug3.d(b2c.b, false);
            int i10 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H = vnj.H(oq5Var2, j2);
            xp5.T.getClass();
            Function0 function0 = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(function0);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d2, wp5.f);
            g0g.U(oq5Var2, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i10))) {
                ouj.x(i10, oq5Var2, i10, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            boolean booleanValue = ((Boolean) ka0Var2.h.getValue()).booleanValue();
            boolean f4 = oq5Var2.f(ka0Var2);
            Object K6 = oq5Var2.K();
            if (f4 || K6 == obj) {
                K6 = new v90(ka0Var2, 6);
                oq5Var2.k0(K6);
            }
            b(booleanValue, z4, ds7Var4, (Function0) K6, uoiVar, oq5Var2, (i8 & 896) | 6 | ((i5 >> 6) & 7168));
            oq5 oq5Var3 = oq5Var2;
            oq5Var3.p(true);
            z3 = z4;
            ds7Var3 = ds7Var4;
            oq5Var = oq5Var3;
        } else {
            oq5Var2.S();
            ds7Var3 = ds7Var2;
            z3 = z2;
            oq5Var = oq5Var2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pvr(z, function1, yciVar, z3, ds7Var3, i2, i3);
        }
    }

    public static final void b(boolean z, boolean z2, ds7 ds7Var, Function0 function0, uoi uoiVar, hq5 hq5Var, int i2) {
        int i3;
        boolean z3;
        long j2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(70908914);
        int i4 = i2 & 6;
        androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
        if (i4 == 0) {
            i3 = (oq5Var.f(bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.g(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(ds7Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.f(uoiVar) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new s2r();
                oq5Var.k0(K);
            }
            s2r s2rVar = (s2r) K;
            boolean z4 = (458752 & i3) == 131072;
            Object K2 = oq5Var.K();
            if (z4 || K2 == kjnVar) {
                K2 = new dl3(uoiVar, s2rVar, null, 3);
                oq5Var.k0(K2);
            }
            gld.w(oq5Var, uoiVar, (Function2) K2);
            float f2 = !s2rVar.isEmpty() ? k : j;
            ds7Var.getClass();
            oq5Var.Z(-1176343362);
            aqi o0 = szf.o0(new d85(z2 ? z ? ds7Var.b : ds7Var.d : z ? ds7Var.f : ds7Var.h), oq5Var);
            oq5Var.p(false);
            iz2 iz2Var = b2c.f;
            vci vciVar = vci.a;
            yci c2 = d.c(bVar.a(vciVar, iz2Var), 1.0f);
            boolean f3 = oq5Var.f(o0);
            Object K3 = oq5Var.K();
            if (f3 || K3 == kjnVar) {
                K3 = new kf0(o0, 8);
                oq5Var.k0(K3);
            }
            ksw.j(0, oq5Var, c2, (Function1) K3);
            oq5Var.Z(-66424183);
            aqi o02 = szf.o0(new d85(z2 ? z ? ds7Var.a : ds7Var.c : z ? ds7Var.e : ds7Var.g), oq5Var);
            oq5Var.p(false);
            wl7 wl7Var = (wl7) oq5Var.j(t2b.a);
            float f4 = ((cma) oq5Var.j(t2b.b)).a + f2;
            int i5 = i3;
            if (!d85.c(((d85) o02.getValue()).a, ((ma5) oq5Var.j(pa5.a)).f()) || wl7Var == null) {
                z3 = false;
                oq5Var.Z(1478584670);
                oq5Var.p(false);
                j2 = ((d85) o02.getValue()).a;
            } else {
                oq5Var.Z(1478495731);
                z3 = false;
                j2 = wl7.a(f4, 0, ((d85) o02.getValue()).a, oq5Var);
                oq5Var.p(false);
            }
            boolean z5 = z3;
            long j3 = j2;
            float f5 = f2;
            sdr b2 = bmq.b(j3, null, null, oq5Var, 0, 14);
            yci a2 = bVar.a(vciVar, b2c.e);
            boolean z6 = (i5 & 57344) != 16384 ? z5 : true;
            Object K4 = oq5Var.K();
            if (z6 || K4 == kjnVar) {
                K4 = new lna(7, function0);
                oq5Var.k0(K4);
            }
            yci i6 = d.i(e.a(a.i(a2, (Function1) K4), uoiVar, eeo.a(d, 4, 0L, z5)), c);
            tgo tgoVar = ugo.a;
            u1g.l(oq5Var, androidx.compose.foundation.a.b(y1g.d0(i6, f5, tgoVar, z5, 24), ((d85) b2.getValue()).a, tgoVar));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tvr(z, z2, ds7Var, function0, uoiVar, i2);
        }
    }
}
