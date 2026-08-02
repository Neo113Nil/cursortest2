package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.core.ui.compose.a;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class on1 {
    public static final float a = 440;
    public static final float b = 327;
    public static final float c = 590;

    public static final void a(final dn1 dn1Var, final vm1 vm1Var, final qkl qklVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        boolean z;
        long j;
        Function0 function0;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-89293172);
        int i2 = i | (oq5Var.h(dn1Var) ? 4 : 2) | (oq5Var.h(vm1Var) ? 32 : 16) | (oq5Var.h(qklVar) ? 256 : 128);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            yci u = xp3.u(d.e(yciVar2, a), o5g.D(oq5Var));
            ynn i3 = irv.i(oq5Var);
            boolean h = oq5Var.h(vm1Var);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new u2(13, vm1Var);
                oq5Var.k0(K);
            }
            yci c2 = a.c(u, i3, qklVar, (pyc) K, 14);
            kfh d = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            xn1 xn1Var = dn1Var.a;
            v9b v9bVar = xn1Var.c;
            v9b v9bVar2 = xn1Var.b;
            agr agrVar = pa5.a;
            v9b v9bVar3 = !((ma5) oq5Var.j(agrVar)).g() ? v9bVar2 : v9bVar;
            String str = v9bVar3 != null ? v9bVar3.a : null;
            vci vciVar = vci.a;
            yci e = d.e(d.d(vciVar, 1.0f), b);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = vz1.h(oq5Var);
            }
            uoi uoiVar = (uoi) K2;
            int i5 = i2 & 14;
            boolean h2 = oq5Var.h(vm1Var) | (i5 == 4 || oq5Var.h(dn1Var)) | oq5Var.h(qklVar);
            Object K3 = oq5Var.K();
            if (h2 || K3 == kjnVar) {
                final int i6 = 0;
                K3 = new Function0() { // from class: en1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                qkl qklVar2 = qklVar;
                                vm1Var.a(dn1Var.c, qklVar2);
                                break;
                            case 1:
                                qkl qklVar3 = qklVar;
                                vm1Var.a(dn1Var.c, qklVar3);
                                break;
                            case 2:
                                qkl qklVar4 = qklVar;
                                vm1Var.b(dn1Var.c, qklVar4);
                                break;
                            default:
                                vm1Var.c(dn1Var, qklVar);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K3);
            }
            yci d2 = androidx.compose.foundation.a.d(e, uoiVar, null, false, null, null, (Function0) K3, 28);
            Object K4 = oq5Var.K();
            if (K4 == kjnVar) {
                K4 = new ci1(21);
                oq5Var.k0(K4);
            }
            i(0, oq5Var, nfp.b(d2, false, (Function1) K4), str);
            if (!((ma5) oq5Var.j(agrVar)).g()) {
                v9bVar = v9bVar2;
            }
            d85 d85Var = v9bVar != null ? v9bVar.b : null;
            if (d85Var == null) {
                oq5Var.Z(1503446474);
                j = ((dq0) oq5Var.j(eq0.a)).c.d;
                z = false;
                oq5Var.p(false);
            } else {
                z = false;
                oq5Var.Z(1503445017);
                oq5Var.p(false);
                j = d85Var.a;
            }
            b bVar = b.a;
            k(bVar.b(vciVar), j, oq5Var, z ? 1 : 0);
            String str2 = dn1Var.b;
            if (str2 == null) {
                oq5Var.Z(-636895880);
                oq5Var.p(z);
                function0 = null;
            } else {
                oq5Var.Z(-636895879);
                boolean h3 = oq5Var.h(vm1Var) | oq5Var.f(str2) | oq5Var.h(qklVar);
                Object K5 = oq5Var.K();
                if (h3 || K5 == kjnVar) {
                    K5 = new vd(5, vm1Var, str2, qklVar);
                    oq5Var.k0(K5);
                }
                Function0 function02 = (Function0) K5;
                z = false;
                oq5Var.p(false);
                function0 = function02;
            }
            yci a2 = bVar.a(vciVar, b2c.h);
            boolean h4 = oq5Var.h(vm1Var) | ((i5 == 4 || oq5Var.h(dn1Var)) ? true : z ? 1 : 0) | oq5Var.h(qklVar);
            Object K6 = oq5Var.K();
            if (h4 || K6 == kjnVar) {
                final int i7 = 1;
                K6 = new Function0() { // from class: en1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                qkl qklVar2 = qklVar;
                                vm1Var.a(dn1Var.c, qklVar2);
                                break;
                            case 1:
                                qkl qklVar3 = qklVar;
                                vm1Var.a(dn1Var.c, qklVar3);
                                break;
                            case 2:
                                qkl qklVar4 = qklVar;
                                vm1Var.b(dn1Var.c, qklVar4);
                                break;
                            default:
                                vm1Var.c(dn1Var, qklVar);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K6);
            }
            Function0 function03 = (Function0) K6;
            boolean h5 = oq5Var.h(vm1Var) | ((i5 == 4 || oq5Var.h(dn1Var)) ? true : z ? 1 : 0) | oq5Var.h(qklVar);
            Object K7 = oq5Var.K();
            if (h5 || K7 == kjnVar) {
                final int i8 = 2;
                K7 = new Function0() { // from class: en1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                qkl qklVar2 = qklVar;
                                vm1Var.a(dn1Var.c, qklVar2);
                                break;
                            case 1:
                                qkl qklVar3 = qklVar;
                                vm1Var.a(dn1Var.c, qklVar3);
                                break;
                            case 2:
                                qkl qklVar4 = qklVar;
                                vm1Var.b(dn1Var.c, qklVar4);
                                break;
                            default:
                                vm1Var.c(dn1Var, qklVar);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K7);
            }
            Function0 function04 = (Function0) K7;
            boolean h6 = oq5Var.h(vm1Var);
            if (i5 == 4 || oq5Var.h(dn1Var)) {
                z = true;
            }
            boolean z2 = (h6 ? 1 : 0) | z | (oq5Var.h(qklVar) ? 1 : 0);
            Object K8 = oq5Var.K();
            if (z2 != 0 || K8 == kjnVar) {
                final int i9 = 3;
                K8 = new Function0() { // from class: en1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                qkl qklVar2 = qklVar;
                                vm1Var.a(dn1Var.c, qklVar2);
                                break;
                            case 1:
                                qkl qklVar3 = qklVar;
                                vm1Var.a(dn1Var.c, qklVar3);
                                break;
                            case 2:
                                qkl qklVar4 = qklVar;
                                vm1Var.b(dn1Var.c, qklVar4);
                                break;
                            default:
                                vm1Var.c(dn1Var, qklVar);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K8);
            }
            f(xn1Var, function03, function04, function0, (Function0) K8, a2, oq5Var, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl(dn1Var, vm1Var, qklVar, yciVar2, i);
        }
    }

    public static final void b(int i, hq5 hq5Var, yci yciVar, boolean z) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1682849668);
        int i2 = (oq5Var.g(z) ? 4 : 2) | i;
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci u = xp3.u(d.e(yciVar, a), o5g.D(oq5Var));
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, u);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            vci vciVar = vci.a;
            int i4 = i2 & 14;
            ivf.k(i4 | 48, 0, oq5Var, d.c(vciVar, 1.0f), z);
            g(i4, oq5Var, b.a.a(vciVar, b2c.h), z);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q10(z, yciVar, i, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007f, code lost:
    
        if (r25 > 1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final int i, final o0k o0kVar, final float f, yci yciVar, String str, final wn5 wn5Var, hq5 hq5Var, final int i2, final int i3) {
        int i4;
        String str2;
        int i5;
        int i6;
        final yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(861051442);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.d(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(o0kVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.c(f) ? 256 : 128;
        }
        int i7 = i4 | 3072;
        int i8 = i3 & 16;
        if (i8 != 0) {
            i5 = i4 | 27648;
            str2 = str;
        } else {
            str2 = str;
            i5 = i7 | (oq5Var.f(str2) ? 16384 : RemoteCameraConfig.Notification.ID);
        }
        if ((74899 & i5) == 74898 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            if (i8 != 0) {
                str2 = null;
            }
            if (c3x.L(oq5Var)) {
                i6 = 1;
            }
            i6 = i;
            Integer valueOf = Integer.valueOf(i6);
            exq exqVar = oq5Var.F;
            int i9 = exqVar.g;
            Object h = pq5.h(i9 < exqVar.h ? exqVar.n(exqVar.b, i9) : null, str2, valueOf);
            if (h == null) {
                h = new n3f(str2, valueOf);
            }
            oq5Var.W(-1458241371, h);
            boolean d = oq5Var.d(i6);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (d || K == kjnVar) {
                K = new uw1(i6, 1);
                oq5Var.k0(K);
            }
            fp7 b2 = r3k.b(0, (Function0) K, oq5Var, 0, 3);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new e2k();
                oq5Var.k0(K2);
            }
            vci vciVar = vci.a;
            rvf.b(b2, vciVar, o0kVar, (e2k) K2, 0, f, null, null, false, null, null, null, wn5Var, oq5Var, ((i5 << 3) & 896) | 3120 | ((i5 << 9) & 458752), 3072, 8144);
            oq5Var.p(false);
            yciVar2 = vciVar;
        }
        final String str3 = str2;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: mn1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    on1.c(i, o0kVar, f, yciVar2, str3, wn5Var, (hq5) obj, rvf.R(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(vm1 vm1Var, hq5 hq5Var, int i) {
        int i2;
        aqi aqiVar;
        vm1Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1876510193);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(vm1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            aqi O = gld.O(vm1Var.getState(), oq5Var);
            Object[] objArr = new Object[0];
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new pa1(25);
                oq5Var.k0(K);
            }
            aqi aqiVar2 = (aqi) o2g.g0(objArr, null, (Function0) K, oq5Var, 0, 6);
            Object[] objArr2 = new Object[0];
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new pa1(26);
                oq5Var.k0(K2);
            }
            aqi aqiVar3 = (aqi) o2g.g0(objArr2, null, (Function0) K2, oq5Var, 0, 6);
            o0k o0kVar = (o0k) oq5Var.j(lkg.a);
            float f = ((cma) oq5Var.j(lkg.b)).a;
            boolean f2 = oq5Var.f(O) | oq5Var.f(aqiVar3) | oq5Var.f(aqiVar2);
            Object K3 = oq5Var.K();
            if (f2 || K3 == kjnVar) {
                aqiVar = O;
                k3 k3Var = new k3(aqiVar, aqiVar3, aqiVar2, (Continuation) null, 17);
                oq5Var.k0(k3Var);
                K3 = k3Var;
            } else {
                aqiVar = O;
            }
            gld.x(aqiVar, aqiVar2, aqiVar3, (Function2) K3, oq5Var);
            sn1 sn1Var = (sn1) aqiVar.getValue();
            if (sn1Var instanceof qn1) {
                oq5Var.Z(-178235257);
                qn1 qn1Var = (qn1) sn1Var;
                e(qn1Var.a, qn1Var.b, o0kVar, f, oq5Var, 0);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else if (sn1Var instanceof rn1) {
                oq5Var.Z(-177865520);
                rn1 rn1Var = (rn1) sn1Var;
                c(rn1Var.a.size(), o0kVar, f, null, String.valueOf(System.identityHashCode(sn1Var)), ild.C(-1025116552, new ln1(rn1Var, vm1Var, aqiVar2, aqiVar3, 0), oq5Var), oq5Var, 196608, 8);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else {
                if (!Intrinsics.d(sn1Var, pn1.a)) {
                    throw vz1.i(oq5Var, -559940164, false);
                }
                oq5Var.Z(-176182065);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i4(vm1Var, i, 3);
        }
    }

    public static final void e(int i, final boolean z, o0k o0kVar, float f, hq5 hq5Var, final int i2) {
        int i3;
        int i4;
        final o0k o0kVar2;
        final float f2;
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-995831809);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.g(z) ? 32 : 16;
        }
        int i5 = i3 | (oq5Var.f(o0kVar) ? 256 : 128) | (oq5Var.c(f) ? 2048 : 1024);
        if ((i5 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            i4 = i;
            f2 = f;
            o0kVar2 = o0kVar;
        } else {
            int i6 = (i5 & 14) | 196608;
            int i7 = i5 >> 3;
            int i8 = i6 | (i7 & 112) | (i7 & 896);
            i4 = i;
            c(i4, o0kVar, f, null, null, ild.C(-387355129, new jn1(0, z), oq5Var), oq5Var, i8, 24);
            o0kVar2 = o0kVar;
            f2 = f;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            final int i9 = i4;
            r.d = new Function2() { // from class: kn1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    on1.e(i9, z, o0kVar2, f2, (hq5) obj, rvf.R(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final xn1 xn1Var, final Function0 function0, Function0 function02, Function0 function03, final Function0 function04, yci yciVar, hq5 hq5Var, int i) {
        wn5 wn5Var;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-827397657);
        int i2 = i | (oq5Var.f(xn1Var) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.h(function02) ? 256 : 128) | (oq5Var.h(function03) ? 2048 : 1024) | (oq5Var.h(function04) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if ((74899 & i2) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            String str = xn1Var.d;
            wn5 wn5Var2 = null;
            if (str == null) {
                oq5Var.Z(-184680220);
                oq5Var.p(false);
                wn5Var = null;
            } else {
                oq5Var.Z(-184680219);
                wn5 C = ild.C(534371818, new hv(str, function02, 1), oq5Var);
                oq5Var.p(false);
                wn5Var = C;
            }
            if (function03 == null) {
                oq5Var.Z(-184454850);
            } else {
                oq5Var.Z(-184454849);
                wn5Var2 = ild.C(-406799046, new zk(4, function03), oq5Var);
            }
            oq5Var.p(false);
            wn5 wn5Var3 = wn5Var2;
            final int i3 = 0;
            final int i4 = 1;
            h(ild.C(2024353147, new Function2() { // from class: hn1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    vci vciVar = vci.a;
                    xn1 xn1Var2 = xn1Var;
                    switch (i5) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.z()) {
                                    oq5Var2.S();
                                    break;
                                }
                            }
                            String str2 = xn1Var2.a;
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            long j = ((dq0) oq5Var3.j(eq0.a)).b.a;
                            yci D = ksw.D(vciVar, rvf.M(R.string.artist_info_block_title, hq5Var2) + StringUtil.SPACE + xn1Var2.a, null);
                            Object K = oq5Var3.K();
                            if (K == gq5.a) {
                                K = vz1.h(oq5Var3);
                            }
                            xcs.b(str2, androidx.compose.foundation.a.d(D, (uoi) K, null, false, null, null, function0, 28), j, 0L, null, 0L, null, null, 0L, 2, false, 3, 0, null, null, oq5Var3, 0, 3120, 120824);
                        default:
                            hq5 hq5Var3 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var4 = (oq5) hq5Var3;
                                if (oq5Var4.z()) {
                                    oq5Var4.S();
                                    break;
                                }
                            }
                            szf.b(xn1Var2.f, function0, androidx.compose.foundation.a.b(d.c(vciVar, 1.0f), ((dq0) ((oq5) hq5Var3).j(eq0.a)).d.c, ugo.a), null, 0L, 0L, hq5Var3, 0, 56);
                    }
                    return Unit.a;
                }
            }, oq5Var), ild.C(1456380924, new q2(14, xn1Var), oq5Var), ild.C(888408701, new Function2() { // from class: hn1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    vci vciVar = vci.a;
                    xn1 xn1Var2 = xn1Var;
                    switch (i5) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.z()) {
                                    oq5Var2.S();
                                    break;
                                }
                            }
                            String str2 = xn1Var2.a;
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            long j = ((dq0) oq5Var3.j(eq0.a)).b.a;
                            yci D = ksw.D(vciVar, rvf.M(R.string.artist_info_block_title, hq5Var2) + StringUtil.SPACE + xn1Var2.a, null);
                            Object K = oq5Var3.K();
                            if (K == gq5.a) {
                                K = vz1.h(oq5Var3);
                            }
                            xcs.b(str2, androidx.compose.foundation.a.d(D, (uoi) K, null, false, null, null, function04, 28), j, 0L, null, 0L, null, null, 0L, 2, false, 3, 0, null, null, oq5Var3, 0, 3120, 120824);
                        default:
                            hq5 hq5Var3 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var4 = (oq5) hq5Var3;
                                if (oq5Var4.z()) {
                                    oq5Var4.S();
                                    break;
                                }
                            }
                            szf.b(xn1Var2.f, function04, androidx.compose.foundation.a.b(d.c(vciVar, 1.0f), ((dq0) ((oq5) hq5Var3).j(eq0.a)).d.c, ugo.a), null, 0L, 0L, hq5Var3, 0, 56);
                    }
                    return Unit.a;
                }
            }, oq5Var), wn5Var, wn5Var3, yciVar, oq5Var, (i2 & 458752) | 438);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pr(xn1Var, function0, function02, function03, function04, yciVar, i, 3);
        }
    }

    public static final void g(int i, hq5 hq5Var, yci yciVar, boolean z) {
        int i2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-537177654);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            h(ild.C(1383324854, new sm(6, z), oq5Var), ild.C(1637714261, new sm(7, z), oq5Var), ild.C(1892103668, new sm(8, z), oq5Var), ild.C(2146493075, new sm(9, z), oq5Var), null, yciVar2, oq5Var, ((i2 << 12) & 458752) | 28086);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(z, yciVar2, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [hq5, java.lang.Object, oq5] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r5v2, types: [wn5] */
    /* JADX WARN: Type inference failed for: r6v14, types: [kotlin.jvm.functions.Function2] */
    public static final void h(wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, Function2 function2, Function2 function22, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        ?? r11;
        Function2 function23;
        Function2 function24;
        Function2 function25;
        wn5 wn5Var4;
        ?? r0 = (oq5) hq5Var;
        r0.b0(1935308906);
        if ((i & 6) == 0) {
            i2 = (r0.h(wn5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= r0.h(wn5Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= r0.h(wn5Var3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= r0.h(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= r0.h(function22) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= r0.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i2) == 74898 && r0.z()) {
            r0.S();
            function23 = function2;
            function25 = function22;
            wn5Var4 = wn5Var3;
        } else {
            float f = 16;
            yci q = androidx.compose.foundation.layout.a.q(yciVar, f, 0.0f, f, f, 2);
            kx0 kx0Var = qx0.c;
            gz2 gz2Var = b2c.n;
            ta5 a2 = sa5.a(kx0Var, gz2Var, r0, 0);
            int i3 = r0.P;
            androidx.compose.runtime.internal.a l = r0.l();
            yci H = vnj.H(r0, q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            r0.d0();
            int i4 = i2;
            if (r0.O) {
                r0.k(grbVar);
            } else {
                r0.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(r0, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(r0, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (r0.O || !Intrinsics.d(r0.K(), Integer.valueOf(i3))) {
                ouj.x(i3, r0, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(r0, H, kb5Var4);
            vci vciVar = vci.a;
            yci d = d.d(vciVar, 1.0f);
            iz2 iz2Var = b2c.b;
            kfh d2 = ug3.d(iz2Var, false);
            int i5 = r0.P;
            androidx.compose.runtime.internal.a l2 = r0.l();
            yci H2 = vnj.H(r0, d);
            r0.d0();
            if (r0.O) {
                r0.k(grbVar);
            } else {
                r0.n0();
            }
            g0g.U(r0, d2, kb5Var);
            g0g.U(r0, l2, kb5Var2);
            if (r0.O || !Intrinsics.d(r0.K(), Integer.valueOf(i5))) {
                ouj.x(i5, r0, i5, kb5Var3);
            }
            g0g.U(r0, H2, kb5Var4);
            float f2 = 48;
            iz2 iz2Var2 = b2c.e;
            b bVar = b.a;
            yci q2 = androidx.compose.foundation.layout.a.q(bVar.a(vciVar, iz2Var2), 0.0f, 0.0f, f2, 0.0f, 11);
            ta5 a3 = sa5.a(kx0Var, gz2Var, r0, 0);
            int i6 = r0.P;
            androidx.compose.runtime.internal.a l3 = r0.l();
            yci H3 = vnj.H(r0, q2);
            r0.d0();
            if (r0.O) {
                r0.k(grbVar);
            } else {
                r0.n0();
            }
            g0g.U(r0, a3, kb5Var);
            g0g.U(r0, l3, kb5Var2);
            if (r0.O || !Intrinsics.d(r0.K(), Integer.valueOf(i6))) {
                ouj.x(i6, r0, i6, kb5Var3);
            }
            g0g.U(r0, H3, kb5Var4);
            xcs.a(nu0.d(), ild.C(1720992999, new y61(wn5Var, 1), r0), r0, 48);
            u1g.l(r0, d.e(vciVar, 8));
            eta.l((i4 >> 3) & 14, wn5Var2, r0, true);
            yci a4 = bVar.a(d.m(vciVar, f2), b2c.g);
            kfh d3 = ug3.d(iz2Var, false);
            int i7 = r0.P;
            androidx.compose.runtime.internal.a l4 = r0.l();
            yci H4 = vnj.H(r0, a4);
            r0.d0();
            if (r0.O) {
                r0.k(grbVar);
            } else {
                r0.n0();
            }
            g0g.U(r0, d3, kb5Var);
            g0g.U(r0, l4, kb5Var2);
            if (r0.O || !Intrinsics.d(r0.K(), Integer.valueOf(i7))) {
                ouj.x(i7, r0, i7, kb5Var3);
            }
            g0g.U(r0, H4, kb5Var4);
            ?? r5 = wn5Var3;
            r5.invoke(r0, Integer.valueOf((i4 >> 6) & 14));
            r0.p(true);
            r0.p(true);
            if (function2 == null) {
                r0.Z(1790846685);
                r11 = 0;
                r0.p(false);
                function23 = function2;
            } else {
                r11 = 0;
                r0.Z(1790846686);
                function23 = function2;
                xcs.a(nu0.j(), ild.C(60918269, new im0(function23, 2), r0), r0, 48);
                r0.p(false);
            }
            if (function22 == null) {
                r0.Z(1791044155);
                r0.p(r11);
                function24 = function22;
            } else {
                r0.Z(1791044156);
                u1g.l(r0, d.e(vciVar, f));
                ?? r6 = function22;
                r6.invoke(r0, Integer.valueOf((int) r11));
                r0.p(r11);
                function24 = r6;
            }
            r0.p(true);
            wn5Var4 = r5;
            function25 = function24;
        }
        xmn r = r0.r();
        if (r != null) {
            r.d = new uu0(wn5Var, wn5Var2, wn5Var4, function23, function25, yciVar, i);
        }
    }

    public static final void i(int i, hq5 hq5Var, yci yciVar, String str) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1685826411);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            w1g.j(str, null, yciVar, null, null, null, hd6.a, 0.0f, null, 0, fgq.a, oq5Var, (i2 & 14) | 1572912 | ((i2 << 3) & 896), 952);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cb1(str, yciVar, i, 1);
        }
    }

    public static final void j(int i, hq5 hq5Var, yci yciVar, String str, Function0 function0) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-757921381);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16) | 384;
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            vci vciVar = vci.a;
            pd.n(str, 3, nu0.j(), function0, vciVar, null, oq5Var, ((i2 << 6) & 7168) | (i2 & 14) | 48 | 24576, 96);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new in1(str, function0, yciVar2, i, 0);
        }
    }

    public static final void k(yci yciVar, long j, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1072513275);
        int i2 = (oq5Var.e(j) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            p85 b0 = pd.b0(j);
            long b2 = p85.a(b0, 0.0f, b0.c + 0.04f, 11).b();
            boolean e = oq5Var.e(b2);
            Object K = oq5Var.K();
            if (e || K == gq5.a) {
                K = new fn1(b2, 0);
                oq5Var.k0(K);
            }
            ksw.j((i2 >> 3) & 14, oq5Var, yciVar, (Function1) K);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gn1(j, yciVar, i);
        }
    }
}
