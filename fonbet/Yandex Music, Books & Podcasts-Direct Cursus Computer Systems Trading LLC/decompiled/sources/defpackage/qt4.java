package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class qt4 {
    public static final float c;
    public static final float d;
    public static final float f;
    public static final float g;
    public static final float a = 12;
    public static final float b = 40;
    public static final float e = 15;
    public static final float h = 4;

    static {
        float f2 = 8;
        c = f2;
        d = f2;
        float f3 = 16;
        f = f3;
        g = f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ab0 ab0Var, sdr sdrVar, p9 p9Var, st4 st4Var, yci yciVar, hq5 hq5Var, int i, int i2) {
        ab0 ab0Var2;
        int i3;
        sdr sdrVar2;
        yci yciVar2;
        boolean h2;
        Object K;
        int i4;
        jil jilVar;
        boolean z;
        xmn r;
        ab0Var.getClass();
        sdrVar.getClass();
        st4Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-768440587);
        if ((i & 6) == 0) {
            ab0Var2 = ab0Var;
            i3 = (oq5Var.h(ab0Var2) ? 4 : 2) | i;
        } else {
            ab0Var2 = ab0Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            sdrVar2 = sdrVar;
            i3 |= oq5Var.f(sdrVar2) ? 32 : 16;
        } else {
            sdrVar2 = sdrVar;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.f(p9Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.h(st4Var) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
            if ((i3 & 9363) == 9362 || !oq5Var.z()) {
                vci vciVar = vci.a;
                if (i5 != 0) {
                    yciVar2 = vciVar;
                }
                h2 = oq5Var.h(st4Var);
                K = oq5Var.K();
                if (!h2 || K == gq5.a) {
                    K = new v5(22, st4Var);
                    oq5Var.k0(K);
                }
                gld.k(st4Var, (Function1) K, oq5Var);
                yci q = a.q(d.e(yciVar2, j(oq5Var)), 0.0f, d, 0.0f, e, 5);
                kfh d2 = ug3.d(b2c.b, false);
                i4 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, q);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, d2, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                jilVar = (jil) gld.O(st4Var.l(), oq5Var).getValue();
                if (!Intrinsics.d(jilVar, gil.a)) {
                    oq5Var.Z(-2094848200);
                    b(p9Var, a.o(vciVar, f, 0.0f, 2), oq5Var, ((i3 >> 6) & 14) | 48);
                    oq5Var.p(false);
                } else {
                    if (!(jilVar instanceof iil)) {
                        throw vz1.i(oq5Var, -2094850154, false);
                    }
                    oq5Var.Z(-2094840151);
                    if (((u7l) sdrVar2.getValue()).h || ((u7l) sdrVar2.getValue()).g) {
                        oq5Var.Z(-515450051);
                        int i6 = i3 & 14;
                        int i7 = i3 << 3;
                        d(ab0Var, (iil) jilVar, sdrVar, p9Var, st4Var, null, oq5Var, i6 | (i7 & 896) | (i7 & 7168) | (i7 & 57344));
                        z = false;
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(-515072998);
                        iil iilVar = (iil) jilVar;
                        int i8 = i3 & 14;
                        int i9 = i3 << 3;
                        e(ab0Var2, iilVar, sdrVar, p9Var, st4Var, null, oq5Var, i8 | (i9 & 896) | (i9 & 7168) | (i9 & 57344));
                        z = false;
                        oq5Var.p(false);
                    }
                    oq5Var.p(z);
                }
                oq5Var.p(true);
            } else {
                oq5Var.S();
            }
            yci yciVar3 = yciVar2;
            r = oq5Var.r();
            if (r == null) {
                r.d = new cj((Object) ab0Var, (Object) sdrVar, (Object) p9Var, (Object) st4Var, yciVar3, i, i2, 4);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i3 & 9363) == 9362) {
        }
        vci vciVar2 = vci.a;
        if (i5 != 0) {
        }
        h2 = oq5Var.h(st4Var);
        K = oq5Var.K();
        if (!h2) {
        }
        K = new v5(22, st4Var);
        oq5Var.k0(K);
        gld.k(st4Var, (Function1) K, oq5Var);
        yci q2 = a.q(d.e(yciVar2, j(oq5Var)), 0.0f, d, 0.0f, e, 5);
        kfh d22 = ug3.d(b2c.b, false);
        i4 = oq5Var.P;
        androidx.compose.runtime.internal.a l2 = oq5Var.l();
        yci H2 = vnj.H(oq5Var, q2);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d22, wp5.f);
        g0g.U(oq5Var, l2, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i4, oq5Var, i4, kb5Var2);
        g0g.U(oq5Var, H2, wp5.d);
        jilVar = (jil) gld.O(st4Var.l(), oq5Var).getValue();
        if (!Intrinsics.d(jilVar, gil.a)) {
        }
        oq5Var.p(true);
        yci yciVar32 = yciVar2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void b(p9 p9Var, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        long j;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(474172092);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(p9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            d85 d85Var = (d85) ((Function2) p9Var.a).invoke(oq5Var, 0);
            if (d85Var != null) {
                oq5Var.Z(-86410061);
                j = c3x.D(((dq0) oq5Var.j(eq0.a)).c.c, d85Var.a);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-86322951);
                j = ((dq0) oq5Var.j(eq0.a)).c.c;
                oq5Var.p(false);
            }
            dma dmaVar = new dma(a);
            tgo tgoVar = ugo.a;
            f(nt0.h, nt0.i, nt0.j, androidx.compose.foundation.a.b(xp3.u(yciVar, new tgo(dmaVar, dmaVar, dmaVar, dmaVar)), j, vnj.i), nt0.k, null, oq5Var, 25014, 32);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(p9Var, yciVar, i, 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x029a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(st4 st4Var, final wxk wxkVar, eml emlVar, sdr sdrVar, boolean z, p9 p9Var, List list, yci yciVar, cjc cjcVar, hq5 hq5Var, int i, int i2) {
        int i3;
        sdr sdrVar2;
        boolean z2;
        yci yciVar2;
        int i4;
        cjc cjcVar2;
        cjc cjcVar3;
        long j;
        long j2;
        final poi n;
        cjc cjcVar4;
        boolean e2;
        Object K;
        final poi poiVar;
        CharSequence subtitle;
        final int i5;
        wn5 C;
        cjc cjcVar5;
        yci yciVar3;
        boolean z3;
        d85 f2;
        long j3;
        long j4;
        xmn r;
        st4Var.getClass();
        wxkVar.getClass();
        emlVar.getClass();
        sdrVar.getClass();
        list.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(861350282);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(st4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(wxkVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.f(emlVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            sdrVar2 = sdrVar;
            i3 |= oq5Var.f(sdrVar2) ? 2048 : 1024;
        } else {
            sdrVar2 = sdrVar;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i3 |= oq5Var.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            z2 = z;
        }
        if ((196608 & i) == 0) {
            i3 |= oq5Var.f(p9Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i3 |= (2097152 & i) == 0 ? oq5Var.f(list) : oq5Var.h(list) ? 1048576 : 524288;
        }
        int i6 = i2 & 128;
        if (i6 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
            i4 = i2 & 256;
            if (i4 == 0) {
                i3 |= 100663296;
            } else if ((100663296 & i) == 0) {
                cjcVar2 = cjcVar;
                i3 |= oq5Var.f(cjcVar2) ? 67108864 : 33554432;
                if ((i3 & 38347923) == 38347922 || !oq5Var.z()) {
                    yci yciVar4 = i6 != 0 ? vci.a : yciVar2;
                    cjcVar3 = i4 != 0 ? null : cjcVar2;
                    if (p9Var.equals(yt4.b)) {
                        oq5Var.Z(-1942768323);
                        Integer num = wxkVar.b().c;
                        d85 d85Var = num != null ? new d85(c3x.f(num.intValue())) : null;
                        d85 d85Var2 = d85Var != null ? new d85(jf0.g0(d85Var.a, Float.valueOf(0.72f), 0.0f, 6)) : null;
                        if (d85Var2 == null) {
                            oq5Var.Z(-1942605078);
                            z3 = false;
                            oq5Var.p(false);
                            f2 = null;
                        } else {
                            oq5Var.Z(-1171043337);
                            long j5 = d85Var2.a;
                            z3 = false;
                            f2 = k5r.f(oq5Var, false, d85.b(j5, !((ma5) oq5Var.j(pa5.a)).g() ? 0.16f : 0.24f, 0.0f, 0.0f, 0.0f, 14));
                        }
                        if (f2 == null) {
                            oq5Var.Z(-1171039243);
                            j3 = ((dq0) oq5Var.j(eq0.a)).c.c;
                            oq5Var.p(z3);
                        } else {
                            oq5Var.Z(-1171045164);
                            oq5Var.p(z3);
                            j3 = f2.a;
                        }
                        agr agrVar = eq0.a;
                        j = c3x.D(j3, ((dq0) oq5Var.j(agrVar)).c.a);
                        if (d85Var == null) {
                            oq5Var.Z(-1171033830);
                            j4 = d85.b(((dq0) oq5Var.j(agrVar)).c.c, 1.0f, 0.0f, 0.0f, 0.0f, 14);
                            oq5Var.p(false);
                        } else {
                            oq5Var.Z(-1171035194);
                            oq5Var.p(false);
                            j4 = d85Var.a;
                        }
                        j2 = d85.b(jf0.g0(j4, Float.valueOf(0.6f), 0.0f, 6), 0.16f, 0.0f, 0.0f, 0.0f, 14);
                        oq5Var.p(false);
                    } else {
                        if (!(p9Var instanceof zt4)) {
                            throw vz1.i(oq5Var, -1171050604, false);
                        }
                        oq5Var.Z(-1942166489);
                        oq5Var.p(false);
                        zt4 zt4Var = (zt4) p9Var;
                        j = zt4Var.b;
                        j2 = zt4Var.c;
                    }
                    n = up6.n(((u7l) sdrVar2.getValue()).b, oq5Var);
                    if (cjcVar3 == null) {
                        oq5Var.Z(-1171019336);
                        cjcVar4 = rzf.u(szf.o0(Float.valueOf(((u7l) sdrVar2.getValue()).c), oq5Var));
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(-1171021785);
                        oq5Var.p(false);
                        cjcVar4 = cjcVar3;
                    }
                    dma dmaVar = new dma(a);
                    tgo tgoVar = ugo.a;
                    yci u = xp3.u(yciVar4, new tgo(dmaVar, dmaVar, dmaVar, dmaVar));
                    yci yciVar5 = yciVar4;
                    int i7 = i3;
                    e2 = ((i3 & 57344) == 16384) | oq5Var.e(j) | oq5Var.f(cjcVar4) | oq5Var.e(j2) | oq5Var.f(n);
                    K = oq5Var.K();
                    if (!e2 || K == gq5.a) {
                        final boolean z4 = z2;
                        final long j6 = j;
                        final long j7 = j2;
                        final cjc cjcVar6 = cjcVar4;
                        K = new Function1() { // from class: gt4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                jpa jpaVar = (jpa) obj;
                                jpaVar.getClass();
                                jpa.B(jpaVar, j6, 0L, 0L, 0.0f, null, 0, 126);
                                if (z4) {
                                    long i8 = swf.i(0.0f, enj.f(jpaVar.y0()));
                                    long i9 = swf.i(nmq.d(jpaVar.e()), enj.f(jpaVar.y0()));
                                    long i10 = swf.i((cjcVar6.e() * (enj.e(i9) - enj.e(i8))) + enj.e(i8), enj.f(jpaVar.y0()));
                                    long j8 = j7;
                                    jpaVar.s(d85.b(j8, n.e() * d85.d(j8), 0.0f, 0.0f, 0.0f, 14), i8, i10, (r18 & 8) != 0 ? 0.0f : nmq.b(jpaVar.e()), (r18 & 16) != 0 ? 0 : 1);
                                }
                                return Unit.a;
                            }
                        };
                        poiVar = n;
                        oq5Var.k0(K);
                    } else {
                        poiVar = n;
                    }
                    yci a2 = androidx.compose.ui.draw.a.a(u, (Function1) K);
                    subtitle = wxkVar.getSubtitle();
                    if (subtitle == null) {
                        oq5Var.Z(-1940362352);
                        i5 = 0;
                        oq5Var.p(false);
                        C = null;
                    } else {
                        i5 = 0;
                        oq5Var.Z(-1940362351);
                        C = ild.C(-1545752170, new m32(21, subtitle, poiVar), oq5Var);
                        oq5Var.p(false);
                    }
                    final int i8 = 1;
                    f(ild.C(-962282122, new Function2() { // from class: ht4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i9 = i5;
                            hq5 hq5Var2 = (hq5) obj;
                            int intValue = ((Integer) obj2).intValue();
                            switch (i9) {
                                case 0:
                                    if ((intValue & 3) == 2) {
                                        oq5 oq5Var2 = (oq5) hq5Var2;
                                        if (oq5Var2.z()) {
                                            oq5Var2.S();
                                            break;
                                        }
                                    }
                                    wxk wxkVar2 = wxkVar;
                                    String str = wxkVar2.b().b;
                                    if (str == null) {
                                        str = "";
                                    }
                                    String str2 = str;
                                    qo6 qo6Var = wxkVar2.b().a;
                                    oq5 oq5Var3 = (oq5) hq5Var2;
                                    cjc cjcVar7 = poiVar;
                                    boolean f3 = oq5Var3.f(cjcVar7);
                                    Object K2 = oq5Var3.K();
                                    if (f3 || K2 == gq5.a) {
                                        K2 = new wf3(cjcVar7, 8);
                                        oq5Var3.k0(K2);
                                    }
                                    irf.y(str2, qo6Var, wyf.s(vci.a, (Function0) K2), false, false, null, null, null, oq5Var3, 0, 248);
                                    break;
                                default:
                                    if ((intValue & 3) == 2) {
                                        oq5 oq5Var4 = (oq5) hq5Var2;
                                        if (oq5Var4.z()) {
                                            oq5Var4.S();
                                            break;
                                        }
                                    }
                                    wxk wxkVar3 = wxkVar;
                                    String title = wxkVar3.getTitle();
                                    boolean d0 = szf.d0(wxkVar3);
                                    jzb a3 = wxkVar3.a();
                                    oq5 oq5Var5 = (oq5) hq5Var2;
                                    cjc cjcVar8 = poiVar;
                                    boolean f4 = oq5Var5.f(cjcVar8);
                                    Object K3 = oq5Var5.K();
                                    if (f4 || K3 == gq5.a) {
                                        K3 = new wf3(cjcVar8, 5);
                                        oq5Var5.k0(K3);
                                    }
                                    qt4.g(title, d0, a3, wyf.s(vci.a, (Function0) K3), oq5Var5, 0);
                                    break;
                            }
                            return Unit.a;
                        }
                    }, oq5Var), ild.C(866924215, new Function2() { // from class: ht4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i9 = i8;
                            hq5 hq5Var2 = (hq5) obj;
                            int intValue = ((Integer) obj2).intValue();
                            switch (i9) {
                                case 0:
                                    if ((intValue & 3) == 2) {
                                        oq5 oq5Var2 = (oq5) hq5Var2;
                                        if (oq5Var2.z()) {
                                            oq5Var2.S();
                                            break;
                                        }
                                    }
                                    wxk wxkVar2 = wxkVar;
                                    String str = wxkVar2.b().b;
                                    if (str == null) {
                                        str = "";
                                    }
                                    String str2 = str;
                                    qo6 qo6Var = wxkVar2.b().a;
                                    oq5 oq5Var3 = (oq5) hq5Var2;
                                    cjc cjcVar7 = poiVar;
                                    boolean f3 = oq5Var3.f(cjcVar7);
                                    Object K2 = oq5Var3.K();
                                    if (f3 || K2 == gq5.a) {
                                        K2 = new wf3(cjcVar7, 8);
                                        oq5Var3.k0(K2);
                                    }
                                    irf.y(str2, qo6Var, wyf.s(vci.a, (Function0) K2), false, false, null, null, null, oq5Var3, 0, 248);
                                    break;
                                default:
                                    if ((intValue & 3) == 2) {
                                        oq5 oq5Var4 = (oq5) hq5Var2;
                                        if (oq5Var4.z()) {
                                            oq5Var4.S();
                                            break;
                                        }
                                    }
                                    wxk wxkVar3 = wxkVar;
                                    String title = wxkVar3.getTitle();
                                    boolean d0 = szf.d0(wxkVar3);
                                    jzb a3 = wxkVar3.a();
                                    oq5 oq5Var5 = (oq5) hq5Var2;
                                    cjc cjcVar8 = poiVar;
                                    boolean f4 = oq5Var5.f(cjcVar8);
                                    Object K3 = oq5Var5.K();
                                    if (f4 || K3 == gq5.a) {
                                        K3 = new wf3(cjcVar8, 5);
                                        oq5Var5.k0(K3);
                                    }
                                    qt4.g(title, d0, a3, wyf.s(vci.a, (Function0) K3), oq5Var5, 0);
                                    break;
                            }
                            return Unit.a;
                        }
                    }, oq5Var), C, a2, ild.C(2059575930, new s43(emlVar, z, st4Var, sdrVar2, 3), oq5Var), list, oq5Var, 24630 | ((i7 >> 3) & 458752), 0);
                    cjcVar5 = cjcVar3;
                    yciVar3 = yciVar5;
                } else {
                    oq5Var.S();
                    yciVar3 = yciVar2;
                    cjcVar5 = cjcVar2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new bq(st4Var, wxkVar, emlVar, sdrVar, z, p9Var, list, yciVar3, cjcVar5, i, i2);
                    return;
                }
                return;
            }
            cjcVar2 = cjcVar;
            if ((i3 & 38347923) == 38347922) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (p9Var.equals(yt4.b)) {
            }
            n = up6.n(((u7l) sdrVar2.getValue()).b, oq5Var);
            if (cjcVar3 == null) {
            }
            dma dmaVar2 = new dma(a);
            tgo tgoVar2 = ugo.a;
            yci u2 = xp3.u(yciVar4, new tgo(dmaVar2, dmaVar2, dmaVar2, dmaVar2));
            yci yciVar52 = yciVar4;
            int i72 = i3;
            e2 = ((i3 & 57344) == 16384) | oq5Var.e(j) | oq5Var.f(cjcVar4) | oq5Var.e(j2) | oq5Var.f(n);
            K = oq5Var.K();
            if (e2) {
            }
            final boolean z42 = z2;
            final long j62 = j;
            final long j72 = j2;
            final cjc cjcVar62 = cjcVar4;
            K = new Function1() { // from class: gt4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    jpa jpaVar = (jpa) obj;
                    jpaVar.getClass();
                    jpa.B(jpaVar, j62, 0L, 0L, 0.0f, null, 0, 126);
                    if (z42) {
                        long i82 = swf.i(0.0f, enj.f(jpaVar.y0()));
                        long i9 = swf.i(nmq.d(jpaVar.e()), enj.f(jpaVar.y0()));
                        long i10 = swf.i((cjcVar62.e() * (enj.e(i9) - enj.e(i82))) + enj.e(i82), enj.f(jpaVar.y0()));
                        long j8 = j72;
                        jpaVar.s(d85.b(j8, n.e() * d85.d(j8), 0.0f, 0.0f, 0.0f, 14), i82, i10, (r18 & 8) != 0 ? 0.0f : nmq.b(jpaVar.e()), (r18 & 16) != 0 ? 0 : 1);
                    }
                    return Unit.a;
                }
            };
            poiVar = n;
            oq5Var.k0(K);
            yci a22 = androidx.compose.ui.draw.a.a(u2, (Function1) K);
            subtitle = wxkVar.getSubtitle();
            if (subtitle == null) {
            }
            final int i82 = 1;
            f(ild.C(-962282122, new Function2() { // from class: ht4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i9 = i5;
                    hq5 hq5Var2 = (hq5) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i9) {
                        case 0:
                            if ((intValue & 3) == 2) {
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.z()) {
                                    oq5Var2.S();
                                    break;
                                }
                            }
                            wxk wxkVar2 = wxkVar;
                            String str = wxkVar2.b().b;
                            if (str == null) {
                                str = "";
                            }
                            String str2 = str;
                            qo6 qo6Var = wxkVar2.b().a;
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            cjc cjcVar7 = poiVar;
                            boolean f3 = oq5Var3.f(cjcVar7);
                            Object K2 = oq5Var3.K();
                            if (f3 || K2 == gq5.a) {
                                K2 = new wf3(cjcVar7, 8);
                                oq5Var3.k0(K2);
                            }
                            irf.y(str2, qo6Var, wyf.s(vci.a, (Function0) K2), false, false, null, null, null, oq5Var3, 0, 248);
                            break;
                        default:
                            if ((intValue & 3) == 2) {
                                oq5 oq5Var4 = (oq5) hq5Var2;
                                if (oq5Var4.z()) {
                                    oq5Var4.S();
                                    break;
                                }
                            }
                            wxk wxkVar3 = wxkVar;
                            String title = wxkVar3.getTitle();
                            boolean d0 = szf.d0(wxkVar3);
                            jzb a3 = wxkVar3.a();
                            oq5 oq5Var5 = (oq5) hq5Var2;
                            cjc cjcVar8 = poiVar;
                            boolean f4 = oq5Var5.f(cjcVar8);
                            Object K3 = oq5Var5.K();
                            if (f4 || K3 == gq5.a) {
                                K3 = new wf3(cjcVar8, 5);
                                oq5Var5.k0(K3);
                            }
                            qt4.g(title, d0, a3, wyf.s(vci.a, (Function0) K3), oq5Var5, 0);
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var), ild.C(866924215, new Function2() { // from class: ht4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i9 = i82;
                    hq5 hq5Var2 = (hq5) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i9) {
                        case 0:
                            if ((intValue & 3) == 2) {
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.z()) {
                                    oq5Var2.S();
                                    break;
                                }
                            }
                            wxk wxkVar2 = wxkVar;
                            String str = wxkVar2.b().b;
                            if (str == null) {
                                str = "";
                            }
                            String str2 = str;
                            qo6 qo6Var = wxkVar2.b().a;
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            cjc cjcVar7 = poiVar;
                            boolean f3 = oq5Var3.f(cjcVar7);
                            Object K2 = oq5Var3.K();
                            if (f3 || K2 == gq5.a) {
                                K2 = new wf3(cjcVar7, 8);
                                oq5Var3.k0(K2);
                            }
                            irf.y(str2, qo6Var, wyf.s(vci.a, (Function0) K2), false, false, null, null, null, oq5Var3, 0, 248);
                            break;
                        default:
                            if ((intValue & 3) == 2) {
                                oq5 oq5Var4 = (oq5) hq5Var2;
                                if (oq5Var4.z()) {
                                    oq5Var4.S();
                                    break;
                                }
                            }
                            wxk wxkVar3 = wxkVar;
                            String title = wxkVar3.getTitle();
                            boolean d0 = szf.d0(wxkVar3);
                            jzb a3 = wxkVar3.a();
                            oq5 oq5Var5 = (oq5) hq5Var2;
                            cjc cjcVar8 = poiVar;
                            boolean f4 = oq5Var5.f(cjcVar8);
                            Object K3 = oq5Var5.K();
                            if (f4 || K3 == gq5.a) {
                                K3 = new wf3(cjcVar8, 5);
                                oq5Var5.k0(K3);
                            }
                            qt4.g(title, d0, a3, wyf.s(vci.a, (Function0) K3), oq5Var5, 0);
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var), C, a22, ild.C(2059575930, new s43(emlVar, z, st4Var, sdrVar2, 3), oq5Var), list, oq5Var, 24630 | ((i72 >> 3) & 458752), 0);
            cjcVar5 = cjcVar3;
            yciVar3 = yciVar52;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i2 & 256;
        if (i4 == 0) {
        }
        cjcVar2 = cjcVar;
        if ((i3 & 38347923) == 38347922) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (p9Var.equals(yt4.b)) {
        }
        n = up6.n(((u7l) sdrVar2.getValue()).b, oq5Var);
        if (cjcVar3 == null) {
        }
        dma dmaVar22 = new dma(a);
        tgo tgoVar22 = ugo.a;
        yci u22 = xp3.u(yciVar4, new tgo(dmaVar22, dmaVar22, dmaVar22, dmaVar22));
        yci yciVar522 = yciVar4;
        int i722 = i3;
        e2 = ((i3 & 57344) == 16384) | oq5Var.e(j) | oq5Var.f(cjcVar4) | oq5Var.e(j2) | oq5Var.f(n);
        K = oq5Var.K();
        if (e2) {
        }
        final boolean z422 = z2;
        final long j622 = j;
        final long j722 = j2;
        final cjc cjcVar622 = cjcVar4;
        K = new Function1() { // from class: gt4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                jpa.B(jpaVar, j622, 0L, 0L, 0.0f, null, 0, 126);
                if (z422) {
                    long i822 = swf.i(0.0f, enj.f(jpaVar.y0()));
                    long i9 = swf.i(nmq.d(jpaVar.e()), enj.f(jpaVar.y0()));
                    long i10 = swf.i((cjcVar622.e() * (enj.e(i9) - enj.e(i822))) + enj.e(i822), enj.f(jpaVar.y0()));
                    long j8 = j722;
                    jpaVar.s(d85.b(j8, n.e() * d85.d(j8), 0.0f, 0.0f, 0.0f, 14), i822, i10, (r18 & 8) != 0 ? 0.0f : nmq.b(jpaVar.e()), (r18 & 16) != 0 ? 0 : 1);
                }
                return Unit.a;
            }
        };
        poiVar = n;
        oq5Var.k0(K);
        yci a222 = androidx.compose.ui.draw.a.a(u22, (Function1) K);
        subtitle = wxkVar.getSubtitle();
        if (subtitle == null) {
        }
        final int i822 = 1;
        f(ild.C(-962282122, new Function2() { // from class: ht4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i9 = i5;
                hq5 hq5Var2 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                switch (i9) {
                    case 0:
                        if ((intValue & 3) == 2) {
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            if (oq5Var2.z()) {
                                oq5Var2.S();
                                break;
                            }
                        }
                        wxk wxkVar2 = wxkVar;
                        String str = wxkVar2.b().b;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = str;
                        qo6 qo6Var = wxkVar2.b().a;
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        cjc cjcVar7 = poiVar;
                        boolean f3 = oq5Var3.f(cjcVar7);
                        Object K2 = oq5Var3.K();
                        if (f3 || K2 == gq5.a) {
                            K2 = new wf3(cjcVar7, 8);
                            oq5Var3.k0(K2);
                        }
                        irf.y(str2, qo6Var, wyf.s(vci.a, (Function0) K2), false, false, null, null, null, oq5Var3, 0, 248);
                        break;
                    default:
                        if ((intValue & 3) == 2) {
                            oq5 oq5Var4 = (oq5) hq5Var2;
                            if (oq5Var4.z()) {
                                oq5Var4.S();
                                break;
                            }
                        }
                        wxk wxkVar3 = wxkVar;
                        String title = wxkVar3.getTitle();
                        boolean d0 = szf.d0(wxkVar3);
                        jzb a3 = wxkVar3.a();
                        oq5 oq5Var5 = (oq5) hq5Var2;
                        cjc cjcVar8 = poiVar;
                        boolean f4 = oq5Var5.f(cjcVar8);
                        Object K3 = oq5Var5.K();
                        if (f4 || K3 == gq5.a) {
                            K3 = new wf3(cjcVar8, 5);
                            oq5Var5.k0(K3);
                        }
                        qt4.g(title, d0, a3, wyf.s(vci.a, (Function0) K3), oq5Var5, 0);
                        break;
                }
                return Unit.a;
            }
        }, oq5Var), ild.C(866924215, new Function2() { // from class: ht4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i9 = i822;
                hq5 hq5Var2 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                switch (i9) {
                    case 0:
                        if ((intValue & 3) == 2) {
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            if (oq5Var2.z()) {
                                oq5Var2.S();
                                break;
                            }
                        }
                        wxk wxkVar2 = wxkVar;
                        String str = wxkVar2.b().b;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = str;
                        qo6 qo6Var = wxkVar2.b().a;
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        cjc cjcVar7 = poiVar;
                        boolean f3 = oq5Var3.f(cjcVar7);
                        Object K2 = oq5Var3.K();
                        if (f3 || K2 == gq5.a) {
                            K2 = new wf3(cjcVar7, 8);
                            oq5Var3.k0(K2);
                        }
                        irf.y(str2, qo6Var, wyf.s(vci.a, (Function0) K2), false, false, null, null, null, oq5Var3, 0, 248);
                        break;
                    default:
                        if ((intValue & 3) == 2) {
                            oq5 oq5Var4 = (oq5) hq5Var2;
                            if (oq5Var4.z()) {
                                oq5Var4.S();
                                break;
                            }
                        }
                        wxk wxkVar3 = wxkVar;
                        String title = wxkVar3.getTitle();
                        boolean d0 = szf.d0(wxkVar3);
                        jzb a3 = wxkVar3.a();
                        oq5 oq5Var5 = (oq5) hq5Var2;
                        cjc cjcVar8 = poiVar;
                        boolean f4 = oq5Var5.f(cjcVar8);
                        Object K3 = oq5Var5.K();
                        if (f4 || K3 == gq5.a) {
                            K3 = new wf3(cjcVar8, 5);
                            oq5Var5.k0(K3);
                        }
                        qt4.g(title, d0, a3, wyf.s(vci.a, (Function0) K3), oq5Var5, 0);
                        break;
                }
                return Unit.a;
            }
        }, oq5Var), C, a222, ild.C(2059575930, new s43(emlVar, z, st4Var, sdrVar2, 3), oq5Var), list, oq5Var, 24630 | ((i722 >> 3) & 458752), 0);
        cjcVar5 = cjcVar3;
        yciVar3 = yciVar522;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(ab0 ab0Var, final iil iilVar, final sdr sdrVar, final p9 p9Var, final st4 st4Var, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        sdr sdrVar2;
        boolean z;
        oq5 oq5Var;
        cjc u;
        boolean f2;
        Object K;
        long j;
        boolean h2;
        Object m5Var;
        long j2;
        Object obj;
        kml kmlVar;
        int i3;
        float f3;
        boolean h3;
        Object K2;
        float f4;
        oq5 oq5Var2;
        yci yciVar2;
        boolean z2;
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-2099400977);
        if ((i & 6) == 0) {
            i2 = (oq5Var3.h(ab0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var3.f(iilVar) : oq5Var3.h(iilVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            sdrVar2 = sdrVar;
            i2 |= oq5Var3.f(sdrVar2) ? 256 : 128;
        } else {
            sdrVar2 = sdrVar;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var3.f(p9Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var3.h(st4Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i4 = i2 | 196608;
        if ((i4 & 74899) == 74898 && oq5Var3.z()) {
            oq5Var3.S();
            yciVar2 = yciVar;
            oq5Var2 = oq5Var3;
        } else {
            kml kmlVar2 = iilVar.a;
            final cml cmlVar = kmlVar2.b;
            Object obj2 = cmlVar.a;
            if (((u7l) sdrVar2.getValue()).h) {
                wxk wxkVar = (wxk) obj2;
                if ((wxkVar instanceof sxk) || (wxkVar instanceof uxk)) {
                    z2 = true;
                } else {
                    if (!(wxkVar instanceof oxk) && !(wxkVar instanceof pxk) && !(wxkVar instanceof txk)) {
                        b6e.s();
                        return;
                    }
                    z2 = false;
                }
                if (z2) {
                    z = true;
                    if (((u7l) sdrVar2.getValue()).g) {
                        oq5Var = oq5Var3;
                        oq5Var.Z(60250268);
                        u = rzf.u(szf.o0(Float.valueOf(((u7l) sdrVar2.getValue()).c), oq5Var));
                        oq5Var.p(false);
                    } else {
                        oq5Var3.Z(59924303);
                        u = gut.T0(((u7l) sdrVar2.getValue()).c, ((u7l) sdrVar2.getValue()).d, ((u7l) sdrVar2.getValue()).f, ((u7l) sdrVar2.getValue()).a, (wxk) obj2, oq5Var3, 0, 224);
                        oq5Var = oq5Var3;
                        oq5Var.p(false);
                    }
                    f2 = oq5Var.f(obj2);
                    K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (!f2 || K == kjnVar) {
                        K = new jap();
                        oq5Var.k0(K);
                    }
                    final jap japVar = (jap) K;
                    float e2 = u.e();
                    j = ((u7l) sdrVar2.getValue()).d;
                    h2 = oq5Var.h(st4Var);
                    Object K3 = oq5Var.K();
                    if (!h2 || K3 == kjnVar) {
                        j2 = j;
                        obj = obj2;
                        kmlVar = kmlVar2;
                        i3 = 0;
                        m5Var = new m5(1, st4Var, st4.class, "onSeek", "onSeek(F)V", 0, 29);
                        oq5Var.k0(m5Var);
                    } else {
                        kmlVar = kmlVar2;
                        obj = obj2;
                        m5Var = K3;
                        i3 = 0;
                        j2 = j;
                    }
                    final boolean z3 = z;
                    final kml kmlVar3 = kmlVar;
                    Object obj3 = obj;
                    oq5 oq5Var4 = oq5Var;
                    yci t = lsq.t(japVar, z3, e2, j2, (Function1) ((h9f) m5Var), null, oq5Var4, 6, 96);
                    cml cmlVar2 = kmlVar3.a;
                    wxk wxkVar2 = cmlVar2 == null ? (wxk) cmlVar2.a : null;
                    cml cmlVar3 = kmlVar3.c;
                    o14 o14Var = new o14(wxkVar2, obj3, cmlVar3 != null ? (wxk) cmlVar3.a : null);
                    i24 i24Var = new i24(g);
                    f3 = 8;
                    boolean z4 = !japVar.a();
                    h3 = oq5Var4.h(st4Var);
                    K2 = oq5Var4.K();
                    if (!h3 || K2 == kjnVar) {
                        f4 = f3;
                        m5 m5Var2 = new m5(1, st4Var, st4.class, "onSwipe", "onSwipe(Lcom/yandex/music/shared/design/api/components/SwipeDirection;)V", 0, 28);
                        oq5Var4.k0(m5Var2);
                        K2 = m5Var2;
                    } else {
                        f4 = f3;
                    }
                    vci vciVar = vci.a;
                    zc4.a(ab0Var, o14Var, (Function1) ((h9f) K2), i24Var, vciVar, t, null, null, false, false, 0.0f, false, f4, z4, 0.0f, ild.C(647911844, new pyc() { // from class: lt4
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            cjc cjcVar;
                            Object obj7;
                            eml emlVar;
                            float f5;
                            wxk wxkVar3 = (wxk) obj4;
                            hq5 hq5Var2 = (hq5) obj5;
                            int intValue = ((Integer) obj6).intValue();
                            wxkVar3.getClass();
                            Object obj8 = cml.this.a;
                            boolean equals = wxkVar3.equals(obj8);
                            sdr sdrVar3 = sdrVar;
                            if (((u7l) sdrVar3.getValue()).g) {
                                oq5 oq5Var5 = (oq5) hq5Var2;
                                oq5Var5.Z(358881922);
                                cjcVar = gut.T0(((u7l) sdrVar3.getValue()).c, ((u7l) sdrVar3.getValue()).d, ((u7l) sdrVar3.getValue()).f, ((u7l) sdrVar3.getValue()).a, (wxk) obj8, oq5Var5, 0, 224);
                                oq5Var5.p(false);
                            } else {
                                oq5 oq5Var6 = (oq5) hq5Var2;
                                oq5Var6.Z(359235167);
                                cjc u2 = rzf.u(szf.o0(Float.valueOf(((u7l) sdrVar3.getValue()).c), oq5Var6));
                                oq5Var6.p(false);
                                cjcVar = u2;
                            }
                            if (((u7l) sdrVar3.getValue()).h) {
                                oq5 oq5Var7 = (oq5) hq5Var2;
                                oq5Var7.Z(359419338);
                                if (equals && z3) {
                                    Float f6 = (Float) japVar.b.getValue();
                                    f5 = f6 != null ? f6.floatValue() : cjcVar.e();
                                } else {
                                    f5 = 0.0f;
                                }
                                cjcVar = rzf.u(szf.o0(Float.valueOf(f5), oq5Var7));
                                oq5Var7.p(false);
                            } else {
                                oq5 oq5Var8 = (oq5) hq5Var2;
                                oq5Var8.Z(359599262);
                                oq5Var8.p(false);
                            }
                            cjc cjcVar2 = cjcVar;
                            kml kmlVar4 = iilVar.a;
                            Iterator it = xz0.w(new cml[]{kmlVar4.a, kmlVar4.b, kmlVar4.c}).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj7 = null;
                                    break;
                                }
                                obj7 = it.next();
                                if (Intrinsics.d(((cml) obj7).a, wxkVar3)) {
                                    break;
                                }
                            }
                            cml cmlVar4 = (cml) obj7;
                            if (cmlVar4 == null || (emlVar = cmlVar4.b) == null) {
                                emlVar = eml.d;
                            }
                            kml kmlVar5 = kmlVar3;
                            boolean z5 = kmlVar5.a != null;
                            boolean z6 = kmlVar5.c != null;
                            st4 st4Var2 = st4Var;
                            qt4.c(st4Var2, wxkVar3, emlVar, sdrVar3, equals, p9Var, qt4.i(st4Var2, z5, z6, hq5Var2), null, cjcVar2, hq5Var2, (intValue << 3) & 112, 128);
                            return Unit.a;
                        }
                    }, oq5Var4), oq5Var4, (i4 & 14) | ((i4 >> 3) & 57344), 196992, 20416);
                    oq5Var2 = oq5Var4;
                    h(japVar, ((u7l) sdrVar.getValue()).d, oq5Var2, i3);
                    yciVar2 = vciVar;
                }
            }
            z = false;
            if (((u7l) sdrVar2.getValue()).g) {
            }
            f2 = oq5Var.f(obj2);
            K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (!f2) {
            }
            K = new jap();
            oq5Var.k0(K);
            final jap japVar2 = (jap) K;
            float e22 = u.e();
            j = ((u7l) sdrVar2.getValue()).d;
            h2 = oq5Var.h(st4Var);
            Object K32 = oq5Var.K();
            if (h2) {
            }
            j2 = j;
            obj = obj2;
            kmlVar = kmlVar2;
            i3 = 0;
            m5Var = new m5(1, st4Var, st4.class, "onSeek", "onSeek(F)V", 0, 29);
            oq5Var.k0(m5Var);
            final boolean z32 = z;
            final kml kmlVar32 = kmlVar;
            Object obj32 = obj;
            oq5 oq5Var42 = oq5Var;
            yci t2 = lsq.t(japVar2, z32, e22, j2, (Function1) ((h9f) m5Var), null, oq5Var42, 6, 96);
            cml cmlVar22 = kmlVar32.a;
            if (cmlVar22 == null) {
            }
            cml cmlVar32 = kmlVar32.c;
            o14 o14Var2 = new o14(wxkVar2, obj32, cmlVar32 != null ? (wxk) cmlVar32.a : null);
            i24 i24Var2 = new i24(g);
            f3 = 8;
            boolean z42 = !japVar2.a();
            h3 = oq5Var42.h(st4Var);
            K2 = oq5Var42.K();
            if (h3) {
            }
            f4 = f3;
            m5 m5Var22 = new m5(1, st4Var, st4.class, "onSwipe", "onSwipe(Lcom/yandex/music/shared/design/api/components/SwipeDirection;)V", 0, 28);
            oq5Var42.k0(m5Var22);
            K2 = m5Var22;
            vci vciVar2 = vci.a;
            zc4.a(ab0Var, o14Var2, (Function1) ((h9f) K2), i24Var2, vciVar2, t2, null, null, false, false, 0.0f, false, f4, z42, 0.0f, ild.C(647911844, new pyc() { // from class: lt4
                @Override // defpackage.pyc
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    cjc cjcVar;
                    Object obj7;
                    eml emlVar;
                    float f5;
                    wxk wxkVar3 = (wxk) obj4;
                    hq5 hq5Var2 = (hq5) obj5;
                    int intValue = ((Integer) obj6).intValue();
                    wxkVar3.getClass();
                    Object obj8 = cml.this.a;
                    boolean equals = wxkVar3.equals(obj8);
                    sdr sdrVar3 = sdrVar;
                    if (((u7l) sdrVar3.getValue()).g) {
                        oq5 oq5Var5 = (oq5) hq5Var2;
                        oq5Var5.Z(358881922);
                        cjcVar = gut.T0(((u7l) sdrVar3.getValue()).c, ((u7l) sdrVar3.getValue()).d, ((u7l) sdrVar3.getValue()).f, ((u7l) sdrVar3.getValue()).a, (wxk) obj8, oq5Var5, 0, 224);
                        oq5Var5.p(false);
                    } else {
                        oq5 oq5Var6 = (oq5) hq5Var2;
                        oq5Var6.Z(359235167);
                        cjc u2 = rzf.u(szf.o0(Float.valueOf(((u7l) sdrVar3.getValue()).c), oq5Var6));
                        oq5Var6.p(false);
                        cjcVar = u2;
                    }
                    if (((u7l) sdrVar3.getValue()).h) {
                        oq5 oq5Var7 = (oq5) hq5Var2;
                        oq5Var7.Z(359419338);
                        if (equals && z32) {
                            Float f6 = (Float) japVar2.b.getValue();
                            f5 = f6 != null ? f6.floatValue() : cjcVar.e();
                        } else {
                            f5 = 0.0f;
                        }
                        cjcVar = rzf.u(szf.o0(Float.valueOf(f5), oq5Var7));
                        oq5Var7.p(false);
                    } else {
                        oq5 oq5Var8 = (oq5) hq5Var2;
                        oq5Var8.Z(359599262);
                        oq5Var8.p(false);
                    }
                    cjc cjcVar2 = cjcVar;
                    kml kmlVar4 = iilVar.a;
                    Iterator it = xz0.w(new cml[]{kmlVar4.a, kmlVar4.b, kmlVar4.c}).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj7 = null;
                            break;
                        }
                        obj7 = it.next();
                        if (Intrinsics.d(((cml) obj7).a, wxkVar3)) {
                            break;
                        }
                    }
                    cml cmlVar4 = (cml) obj7;
                    if (cmlVar4 == null || (emlVar = cmlVar4.b) == null) {
                        emlVar = eml.d;
                    }
                    kml kmlVar5 = kmlVar32;
                    boolean z5 = kmlVar5.a != null;
                    boolean z6 = kmlVar5.c != null;
                    st4 st4Var2 = st4Var;
                    qt4.c(st4Var2, wxkVar3, emlVar, sdrVar3, equals, p9Var, qt4.i(st4Var2, z5, z6, hq5Var2), null, cjcVar2, hq5Var2, (intValue << 3) & 112, 128);
                    return Unit.a;
                }
            }, oq5Var42), oq5Var42, (i4 & 14) | ((i4 >> 3) & 57344), 196992, 20416);
            oq5Var2 = oq5Var42;
            h(japVar2, ((u7l) sdrVar.getValue()).d, oq5Var2, i3);
            yciVar2 = vciVar2;
        }
        xmn r = oq5Var2.r();
        if (r != null) {
            r.d = new ft4(ab0Var, iilVar, sdrVar, p9Var, st4Var, yciVar2, i, 0);
        }
    }

    public static final void e(ab0 ab0Var, iil iilVar, sdr sdrVar, p9 p9Var, st4 st4Var, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        float f2;
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(2100231706);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.h(ab0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var2.f(iilVar) : oq5Var2.h(iilVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(sdrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(p9Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.h(st4Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i3 = i2 | 196608;
        if ((74899 & i3) == 74898 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            kml kmlVar = iilVar.a;
            cml cmlVar = kmlVar.a;
            wxk wxkVar = cmlVar != null ? (wxk) cmlVar.a : null;
            Object obj = kmlVar.b.a;
            cml cmlVar2 = kmlVar.c;
            o14 o14Var = new o14(wxkVar, obj, cmlVar2 != null ? (wxk) cmlVar2.a : null);
            i24 i24Var = new i24(g);
            float f3 = 8;
            boolean h2 = oq5Var2.h(st4Var);
            Object K = oq5Var2.K();
            if (h2 || K == gq5.a) {
                f2 = f3;
                mt4 mt4Var = new mt4(1, st4Var, st4.class, "onSwipe", "onSwipe(Lcom/yandex/music/shared/design/api/components/SwipeDirection;)V", 0, 0);
                oq5Var2.k0(mt4Var);
                K = mt4Var;
            } else {
                f2 = f3;
            }
            wn5 C = ild.C(-1895277755, new lc(iilVar, st4Var, kmlVar, sdrVar, p9Var, 3), oq5Var2);
            int i4 = (i3 & 14) | ((i3 >> 3) & 57344);
            vci vciVar = vci.a;
            oq5Var = oq5Var2;
            zc4.a(ab0Var, o14Var, (Function1) ((h9f) K), i24Var, vciVar, null, null, null, false, false, 0.0f, false, f2, true, 0.0f, C, oq5Var, i4, 200064, 20448);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ft4(ab0Var, iilVar, sdrVar, p9Var, st4Var, yciVar2, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(wn5 wn5Var, wn5 wn5Var2, Function2 function2, yci yciVar, Function2 function22, List list, hq5 hq5Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        Object K;
        int i7;
        wn5 wn5Var3;
        Function2 function23;
        boolean z2;
        Function2 function24;
        xmn r;
        Function2 function25 = function22;
        List list2 = list;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-284529080);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(wn5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(wn5Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.h(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var.h(function25) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i8 = i2 & 32;
        int i9 = 196608;
        if (i8 == 0) {
            if ((196608 & i) == 0) {
                i9 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? oq5Var.f(list2) : oq5Var.h(list2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            }
            if ((74899 & i3) == 74898 || !oq5Var.z()) {
                if (i8 != 0) {
                    list2 = c5b.a;
                }
                iz2 iz2Var = b2c.b;
                kfh d2 = ug3.d(iz2Var, false);
                i4 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, yciVar);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                kb5 kb5Var = wp5.f;
                g0g.U(oq5Var, d2, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(oq5Var, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(oq5Var, H, kb5Var4);
                iz2 iz2Var2 = b2c.f;
                b bVar = b.a;
                vci vciVar = vci.a;
                yci a2 = bVar.a(vciVar, iz2Var2);
                hz2 hz2Var = b2c.l;
                int i10 = i3;
                nho a3 = lho.a(qx0.a, hz2Var, oq5Var, 48);
                i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, a2);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, a3, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                yci m = d.m(a.m(vciVar, c), 40);
                kfh d3 = ug3.d(iz2Var, true);
                i6 = oq5Var.P;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H3 = vnj.H(oq5Var, m);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, d3, kb5Var);
                g0g.U(oq5Var, l3, kb5Var2);
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var3);
                }
                g0g.U(oq5Var, H3, kb5Var4);
                wn5Var.invoke(oq5Var, Integer.valueOf(i10 & 14));
                oq5Var.p(true);
                float p = w1g.p(nu0.i(), 0, oq5Var, 0, 2) + w1g.p(nu0.j(), 0, oq5Var, 0, 2);
                float f2 = mu0.a;
                yci u = d.u(d.e(vciVar, p + f2), hz2Var, true);
                if (!(((double) 1.0f) <= 0.0d)) {
                    qme.a("invalid weight; must be greater than zero");
                }
                yci g2 = vz1.g(1.0f, u, true);
                z = (i10 & 458752) != 131072 || ((i10 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && oq5Var.h(list2));
                K = oq5Var.K();
                if (!z || K == gq5.a) {
                    K = new h50(list2, 2);
                    oq5Var.k0(K);
                }
                yci b2 = nfp.b(g2, true, (Function1) K);
                ta5 a4 = sa5.a(qx0.e, b2c.n, oq5Var, 54);
                i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l4 = oq5Var.l();
                yci H4 = vnj.H(oq5Var, b2);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, a4, kb5Var);
                g0g.U(oq5Var, l4, kb5Var2);
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var3);
                }
                g0g.U(oq5Var, H4, kb5Var4);
                wn5Var3 = wn5Var2;
                xcs.a(nu0.j(), ild.C(1118289175, new y61(wn5Var3, 3), oq5Var), oq5Var, 48);
                if (function2 == null) {
                    oq5Var.Z(1322086731);
                    u1g.l(oq5Var, d.e(vciVar, f2));
                    function23 = function2;
                    xcs.a(nu0.i(), ild.C(-1635204388, new im0(function23, 4), oq5Var), oq5Var, 48);
                    z2 = false;
                } else {
                    function23 = function2;
                    z2 = false;
                    oq5Var.Z(1296875578);
                }
                oq5Var.p(z2);
                oq5Var.p(true);
                Function2 function26 = function22;
                function26.invoke(oq5Var, Integer.valueOf((i10 >> 12) & 14));
                oq5Var.p(true);
                oq5Var.p(true);
                function24 = function26;
            } else {
                oq5Var.S();
                wn5Var3 = wn5Var2;
                function23 = function2;
                function24 = function25;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new fd1(wn5Var, wn5Var3, function23, yciVar, function24, list2, i, i2);
                return;
            }
            return;
        }
        i3 |= i9;
        if ((74899 & i3) == 74898) {
        }
        if (i8 != 0) {
        }
        iz2 iz2Var3 = b2c.b;
        kfh d22 = ug3.d(iz2Var3, false);
        i4 = oq5Var.P;
        androidx.compose.runtime.internal.a l5 = oq5Var.l();
        yci H5 = vnj.H(oq5Var, yciVar);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        kb5 kb5Var5 = wp5.f;
        g0g.U(oq5Var, d22, kb5Var5);
        kb5 kb5Var22 = wp5.e;
        g0g.U(oq5Var, l5, kb5Var22);
        kb5 kb5Var32 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i4, oq5Var, i4, kb5Var32);
        kb5 kb5Var42 = wp5.d;
        g0g.U(oq5Var, H5, kb5Var42);
        iz2 iz2Var22 = b2c.f;
        b bVar2 = b.a;
        vci vciVar2 = vci.a;
        yci a22 = bVar2.a(vciVar2, iz2Var22);
        hz2 hz2Var2 = b2c.l;
        int i102 = i3;
        nho a32 = lho.a(qx0.a, hz2Var2, oq5Var, 48);
        i5 = oq5Var.P;
        androidx.compose.runtime.internal.a l22 = oq5Var.l();
        yci H22 = vnj.H(oq5Var, a22);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a32, kb5Var5);
        g0g.U(oq5Var, l22, kb5Var22);
        if (!oq5Var.O) {
        }
        ouj.x(i5, oq5Var, i5, kb5Var32);
        g0g.U(oq5Var, H22, kb5Var42);
        yci m2 = d.m(a.m(vciVar2, c), 40);
        kfh d32 = ug3.d(iz2Var3, true);
        i6 = oq5Var.P;
        androidx.compose.runtime.internal.a l32 = oq5Var.l();
        yci H32 = vnj.H(oq5Var, m2);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d32, kb5Var5);
        g0g.U(oq5Var, l32, kb5Var22);
        if (!oq5Var.O) {
        }
        ouj.x(i6, oq5Var, i6, kb5Var32);
        g0g.U(oq5Var, H32, kb5Var42);
        wn5Var.invoke(oq5Var, Integer.valueOf(i102 & 14));
        oq5Var.p(true);
        float p2 = w1g.p(nu0.i(), 0, oq5Var, 0, 2) + w1g.p(nu0.j(), 0, oq5Var, 0, 2);
        float f22 = mu0.a;
        yci u2 = d.u(d.e(vciVar2, p2 + f22), hz2Var2, true);
        if (!(((double) 1.0f) <= 0.0d)) {
        }
        yci g22 = vz1.g(1.0f, u2, true);
        if ((i102 & 458752) != 131072) {
        }
        K = oq5Var.K();
        if (!z) {
        }
        K = new h50(list2, 2);
        oq5Var.k0(K);
        yci b22 = nfp.b(g22, true, (Function1) K);
        ta5 a42 = sa5.a(qx0.e, b2c.n, oq5Var, 54);
        i7 = oq5Var.P;
        androidx.compose.runtime.internal.a l42 = oq5Var.l();
        yci H42 = vnj.H(oq5Var, b22);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a42, kb5Var5);
        g0g.U(oq5Var, l42, kb5Var22);
        if (!oq5Var.O) {
        }
        ouj.x(i7, oq5Var, i7, kb5Var32);
        g0g.U(oq5Var, H42, kb5Var42);
        wn5Var3 = wn5Var2;
        xcs.a(nu0.j(), ild.C(1118289175, new y61(wn5Var3, 3), oq5Var), oq5Var, 48);
        if (function2 == null) {
        }
        oq5Var.p(z2);
        oq5Var.p(true);
        Function2 function262 = function22;
        function262.invoke(oq5Var, Integer.valueOf((i102 >> 12) & 14));
        oq5Var.p(true);
        oq5Var.p(true);
        function24 = function262;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void g(CharSequence charSequence, boolean z, jzb jzbVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1134328026);
        int i2 = i | (oq5Var.h(charSequence) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | (oq5Var.d(jzbVar == null ? -1 : jzbVar.ordinal()) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            bg3.a(yciVar, null, false, ild.C(1728781252, new qt(jzbVar, z, charSequence, 6), oq5Var), oq5Var, ((i2 >> 9) & 14) | 3072, 6);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s43(charSequence, z, jzbVar, yciVar, i, 4);
        }
    }

    public static final void h(final jap japVar, final long j, hq5 hq5Var, final int i) {
        jap japVar2;
        xmn r;
        Function2 function2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1169280521);
        int i2 = i | (oq5Var.f(japVar) ? 4 : 2) | (oq5Var.e(j) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            japVar2 = japVar;
        } else {
            Continuation continuation = null;
            sdr b2 = pk0.b(japVar.a() ? 1.0f : 0.0f, weo.S(150, 0, null, 6), "seek_capsule_alpha", null, oq5Var, 3120, 20);
            if (!japVar.a() && ((Number) b2.getValue()).floatValue() == 0.0f) {
                r = oq5Var.r();
                if (r != null) {
                    final int i3 = 0;
                    function2 = new Function2(japVar, j, i, i3) { // from class: it4
                        public final /* synthetic */ int a;
                        public final /* synthetic */ jap b;
                        public final /* synthetic */ long c;

                        {
                            this.a = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.a;
                            hq5 hq5Var2 = (hq5) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    qt4.h(this.b, this.c, hq5Var2, rvf.R(1));
                                    break;
                                default:
                                    qt4.h(this.b, this.c, hq5Var2, rvf.R(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r.d = function2;
                }
                return;
            }
            japVar2 = japVar;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.h(0.0f, oq5Var);
            }
            poi poiVar = (poi) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = tlm.h(0.0f, oq5Var);
            }
            poi poiVar2 = (poi) K2;
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object K3 = oq5Var.K();
            if (z || K3 == kjnVar) {
                K3 = new pt4(japVar2, poiVar, continuation, 0);
                oq5Var.k0(K3);
            }
            gld.w(oq5Var, japVar2, (Function2) K3);
            boolean z2 = i4 == 4;
            Object K4 = oq5Var.K();
            if (z2 || K4 == kjnVar) {
                K4 = new pt4(japVar2, poiVar2, continuation, 1);
                oq5Var.k0(K4);
            }
            gld.w(oq5Var, japVar2, (Function2) K4);
            jx7 jx7Var = (jx7) oq5Var.j(es5.h);
            int L = jx7Var.L(h);
            int L2 = jx7Var.L(g);
            t6k t6kVar = (t6k) poiVar;
            boolean c2 = oq5Var.c(t6kVar.e()) | oq5Var.d(L) | oq5Var.d(L2);
            Object K5 = oq5Var.K();
            if (c2 || K5 == kjnVar) {
                K5 = new lap(L, t6kVar.e(), L2);
                oq5Var.k0(K5);
            }
            phm phmVar = new phm(8, false);
            wn5 C = ild.C(-285378411, new dj(2, j, b2, poiVar2), oq5Var);
            oq5Var = oq5Var;
            bi0.a((lap) K5, null, phmVar, C, oq5Var, 3456, 2);
        }
        r = oq5Var.r();
        if (r != null) {
            final int i5 = 1;
            final jap japVar3 = japVar2;
            function2 = new Function2(japVar3, j, i, i5) { // from class: it4
                public final /* synthetic */ int a;
                public final /* synthetic */ jap b;
                public final /* synthetic */ long c;

                {
                    this.a = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.a;
                    hq5 hq5Var2 = (hq5) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            qt4.h(this.b, this.c, hq5Var2, rvf.R(1));
                            break;
                        default:
                            qt4.h(this.b, this.c, hq5Var2, rvf.R(1));
                            break;
                    }
                    return Unit.a;
                }
            };
            r.d = function2;
        }
    }

    public static final List i(final st4 st4Var, boolean z, boolean z2, hq5 hq5Var) {
        String M = rvf.M(R.string.player_skip_description, hq5Var);
        String M2 = rvf.M(R.string.player_previous_description, hq5Var);
        oq5 oq5Var = (oq5) hq5Var;
        boolean h2 = oq5Var.h(st4Var);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (h2 || K == kjnVar) {
            final int i = 0;
            K = new Function0() { // from class: jt4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            st4Var.i(xur.b);
                            break;
                        default:
                            st4Var.i(xur.a);
                            break;
                    }
                    return Boolean.TRUE;
                }
            };
            oq5Var.k0(K);
        }
        nw6 nw6Var = new nw6(M2, (Function0) K);
        if (!z) {
            nw6Var = null;
        }
        boolean h3 = oq5Var.h(st4Var);
        Object K2 = oq5Var.K();
        if (h3 || K2 == kjnVar) {
            final int i2 = 1;
            K2 = new Function0() { // from class: jt4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            st4Var.i(xur.b);
                            break;
                        default:
                            st4Var.i(xur.a);
                            break;
                    }
                    return Boolean.TRUE;
                }
            };
            oq5Var.k0(K2);
        }
        return xz0.w(new nw6[]{nw6Var, z2 ? new nw6(M, (Function0) K2) : null});
    }

    public static final float j(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
        oq5Var.Z(-183855610);
        float c0 = jx7Var.c0(jx7Var.L(d + e) + jx7Var.L(Math.max(w1g.p(nu0.i(), 0, oq5Var, 0, 2) + w1g.p(nu0.j(), 0, oq5Var, 0, 2) + mu0.a, (c * 2) + b)));
        oq5Var.p(false);
        return c0;
    }
}
