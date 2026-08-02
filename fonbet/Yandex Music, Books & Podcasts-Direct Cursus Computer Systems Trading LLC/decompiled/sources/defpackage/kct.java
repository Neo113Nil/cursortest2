package defpackage;

import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class kct {
    public static final float b;
    public static final float c;
    public static final float a = 56;
    public static final float d = 24;
    public static final ov6 e = new ov6(0.8f, 0.0f, 0.8f, 0.15f);

    static {
        float f = 4;
        b = f;
        c = 16 - f;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(wn5 wn5Var, pyc pycVar, n5g n5gVar, yci yciVar, Function2 function2, d85 d85Var, long j, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        Function2 function22;
        long j2;
        d85 d85Var2;
        oq5 oq5Var;
        yci yciVar3;
        long j3;
        d85 d85Var3;
        xmn r;
        pycVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-121254922);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.h(wn5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.h(pycVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.f(n5gVar) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var2.f(yciVar2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                function22 = function2;
                i3 |= oq5Var2.h(function22) ? 16384 : RemoteCameraConfig.Notification.ID;
            } else {
                function22 = function2;
            }
            if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) != 0) {
                j2 = j;
                i3 |= ((i2 & 64) == 0 && oq5Var2.e(j2)) ? 1048576 : 524288;
            } else {
                j2 = j;
            }
            if ((533651 & i3) == 533650 || !oq5Var2.z()) {
                oq5Var2.U();
                if ((i & 1) != 0 || oq5Var2.y()) {
                    if (i4 != 0) {
                        yciVar2 = vci.a;
                    }
                    d85 d85Var4 = (i2 & 32) == 0 ? null : d85Var;
                    if ((i2 & 64) != 0) {
                        j2 = ((dq0) oq5Var2.j(eq0.a)).b.a;
                        i3 &= -3670017;
                    }
                    d85Var2 = d85Var4;
                } else {
                    oq5Var2.S();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    d85Var2 = d85Var;
                }
                long j4 = j2;
                int i5 = i3;
                yci yciVar4 = yciVar2;
                oq5Var2.q();
                int i6 = i5 >> 9;
                oq5Var = oq5Var2;
                q5g.k(yciVar4, null, svd.a(oq5Var2), j4, null, 0.0f, ild.C(59190578, new mqr(n5gVar, wn5Var, function22, ild.C(1424341325, new wt2(pycVar, 3), oq5Var2), 6), oq5Var2), oq5Var, (i6 & 14) | ScreenMirroringConfig.Video.BITRATE_1_5MB | (i6 & 7168), 50);
                yciVar3 = yciVar4;
                j3 = j4;
                d85Var3 = d85Var2;
            } else {
                oq5Var2.S();
                oq5Var = oq5Var2;
                yciVar3 = yciVar2;
                j3 = j2;
                d85Var3 = d85Var;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new ck(wn5Var, pycVar, n5gVar, yciVar3, function2, d85Var3, j3, i, i2);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i & 24576) != 0) {
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) != 0) {
        }
        if ((533651 & i3) == 533650) {
        }
        oq5Var2.U();
        if ((i & 1) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        d85Var2 = d85Var4;
        long j42 = j2;
        int i52 = i3;
        yci yciVar42 = yciVar2;
        oq5Var2.q();
        int i62 = i52 >> 9;
        oq5Var = oq5Var2;
        q5g.k(yciVar42, null, svd.a(oq5Var2), j42, null, 0.0f, ild.C(59190578, new mqr(n5gVar, wn5Var, function22, ild.C(1424341325, new wt2(pycVar, 3), oq5Var2), 6), oq5Var2), oq5Var, (i62 & 14) | ScreenMirroringConfig.Video.BITRATE_1_5MB | (i62 & 7168), 50);
        yciVar3 = yciVar42;
        j3 = j42;
        d85Var3 = d85Var2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void b(final yci yciVar, final Function0 function0, Function2 function2, Function0 function02, final ox0 ox0Var, final int i, final boolean z, final Function2 function22, wn5 wn5Var, final Function1 function1, hq5 hq5Var, final int i2, final int i3) {
        int i4;
        yci yciVar2;
        Function0 function03;
        Function2 function23;
        final wn5 wn5Var2;
        x2i x2iVar = qx0.a;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1655464570);
        int i5 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i5 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i6 = i5 | (oq5Var.h(function2) ? 256 : 128);
        if ((i2 & 3072) == 0) {
            i6 |= oq5Var.h(function02) ? 2048 : 1024;
        }
        if ((1572864 & i2) == 0) {
            i6 |= oq5Var.d(i) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i6 |= oq5Var.g(z) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i2) == 0) {
            i6 |= oq5Var.h(function22) ? 67108864 : 33554432;
        }
        if ((i3 & 48) == 0) {
            i4 = i3 | (oq5Var.h(function1) ? 32 : 16);
        } else {
            i4 = i3;
        }
        if ((i6 & 306783379) == 306783378 && (i4 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            wn5Var2 = wn5Var;
            function23 = function2;
            function03 = function02;
        } else {
            boolean z2 = ((i6 & 112) == 32) | ((i4 & 112) == 32) | ((3670016 & i6) == 1048576);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z2 || K == kjnVar) {
                K = new ict(function0, function1, ox0Var, i);
                oq5Var.k0(K);
            }
            kfh kfhVar = (kfh) K;
            int i7 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, kfhVar, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            fps fpsVar = fps.a;
            vci vciVar = vci.a;
            yci c2 = androidx.compose.ui.layout.a.c(vciVar, fpsVar);
            float f = b;
            yci q = androidx.compose.foundation.layout.a.q(c2, f, 0.0f, 0.0f, 0.0f, 14);
            iz2 iz2Var = b2c.b;
            kfh d2 = ug3.d(iz2Var, false);
            int i8 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, q);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var, i8, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            int i9 = 14;
            function22.invoke(oq5Var, Integer.valueOf((i6 >> 24) & 14));
            oq5Var.p(true);
            yci o = androidx.compose.foundation.layout.a.o(androidx.compose.ui.layout.a.c(vciVar, fps.b), f, 0.0f, 2);
            if (z) {
                oq5Var.Z(592374600);
                Object K2 = oq5Var.K();
                if (K2 == kjnVar) {
                    K2 = new h4t(i9);
                    oq5Var.k0(K2);
                }
                yciVar2 = nfp.a(vciVar, (Function1) K2);
                oq5Var.p(false);
            } else {
                oq5Var.Z(592375513);
                oq5Var.p(false);
                yciVar2 = vciVar;
            }
            yci f2 = o.f(yciVar2);
            boolean z3 = (i6 & 7168) == 2048;
            Object K3 = oq5Var.K();
            if (z3 || K3 == kjnVar) {
                function03 = function02;
                K3 = new ex(21, function03);
                oq5Var.k0(K3);
            } else {
                function03 = function02;
            }
            yci a2 = androidx.compose.ui.graphics.a.a(f2, (Function1) K3);
            kfh d3 = ug3.d(iz2Var, false);
            int i10 = oq5Var.P;
            a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, a2);
            oq5Var.d0();
            int i11 = i6;
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i10))) {
                ouj.x(i10, oq5Var, i10, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            function23 = function2;
            function23.invoke(oq5Var, Integer.valueOf((i11 >> 6) & 14));
            oq5Var.p(true);
            yci q2 = androidx.compose.foundation.layout.a.q(androidx.compose.ui.layout.a.c(vciVar, fps.c), 0.0f, 0.0f, f, 0.0f, 11);
            kfh d4 = ug3.d(iz2Var, false);
            int i12 = oq5Var.P;
            a l4 = oq5Var.l();
            yci H4 = vnj.H(oq5Var, q2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d4, kb5Var);
            g0g.U(oq5Var, l4, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i12))) {
                ouj.x(i12, oq5Var, i12, kb5Var3);
            }
            g0g.U(oq5Var, H4, kb5Var4);
            wn5Var2 = wn5Var;
            wn5Var2.invoke(oq5Var, 6);
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            final Function2 function24 = function23;
            final Function0 function04 = function03;
            r.d = new Function2() { // from class: fct
                {
                    x2i x2iVar2 = qx0.a;
                    float f3 = kct.a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    x2i x2iVar2 = qx0.a;
                    float f3 = kct.a;
                    ((Integer) obj2).getClass();
                    kct.b(yciVar, function0, function24, function04, ox0Var, i, z, function22, wn5Var2, function1, (hq5) obj, rvf.R(i2 | 1), rvf.R(i3));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ef, code lost:
    
        if ((r43 & 128) != 0) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(mct mctVar, wn5 wn5Var, wn5 wn5Var2, pyc pycVar, n5g n5gVar, yci yciVar, Function2 function2, long j, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        Function2 function22;
        long j2;
        int i4;
        vci vciVar;
        boolean z;
        Object K;
        boolean f;
        Object K2;
        boolean f2;
        Object K3;
        boolean f3;
        Object K4;
        boolean z2;
        Object K5;
        boolean z3;
        Object K6;
        oq5 oq5Var;
        yci yciVar3;
        long j3;
        xmn r;
        int i5;
        mctVar.getClass();
        pycVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1955206759);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.f(mctVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.h(wn5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.h(wn5Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var2.h(pycVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var2.f(n5gVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var2.f(yciVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) != 0) {
                function22 = function2;
                i3 |= oq5Var2.h(function22) ? 1048576 : 524288;
            } else {
                function22 = function2;
            }
            if ((12582912 & i) != 0) {
                if ((i2 & 128) == 0) {
                    j2 = j;
                    if (oq5Var2.e(j2)) {
                        i5 = 8388608;
                        i3 |= i5;
                    }
                } else {
                    j2 = j;
                }
                i5 = RemoteCameraConfig.Camera.BITRATE;
                i3 |= i5;
            } else {
                j2 = j;
            }
            if ((4793491 & i3) == 4793490 || !oq5Var2.z()) {
                oq5Var2.U();
                i4 = i & 1;
                vciVar = vci.a;
                if (i4 != 0 || oq5Var2.y()) {
                    if (i6 != 0) {
                        yciVar2 = vciVar;
                    }
                    if ((i2 & 128) != 0) {
                        j2 = ((dq0) oq5Var2.j(eq0.a)).b.a;
                        i3 &= -29360129;
                    }
                    int i7 = i3;
                    yci yciVar4 = yciVar2;
                    long j4 = j2;
                    oq5Var2.q();
                    vqn vqnVar = new vqn();
                    vqnVar.a = ((jx7) oq5Var2.j(es5.h)).L(d);
                    int i8 = i7 & 14;
                    z = i8 != 4;
                    K = oq5Var2.K();
                    Object obj = gq5.a;
                    if (!z || K == obj) {
                        K = new ect(mctVar, 1);
                        oq5Var2.k0(K);
                    }
                    Function0 function0 = (Function0) K;
                    f = oq5Var2.f(function0);
                    K2 = oq5Var2.K();
                    if (!f || K2 == obj) {
                        K2 = new g1j(29, function0);
                        oq5Var2.k0(K2);
                    }
                    Function0 function02 = (Function0) K2;
                    f2 = oq5Var2.f(function0);
                    K3 = oq5Var2.K();
                    if (!f2 || K3 == obj) {
                        K3 = new gct(0, function0);
                        oq5Var2.k0(K3);
                    }
                    Function0 function03 = (Function0) K3;
                    f3 = oq5Var2.f(function0);
                    K4 = oq5Var2.K();
                    if (!f3 || K4 == obj) {
                        K4 = szf.U(new gct(1, function0));
                        oq5Var2.k0(K4);
                    }
                    sdr sdrVar = (sdr) K4;
                    boolean z4 = !((Boolean) sdrVar.getValue()).booleanValue();
                    wn5 C = ild.C(1593708898, new wt2(pycVar, 2), oq5Var2);
                    bxj bxjVar = bxj.a;
                    z2 = i8 != 4;
                    K5 = oq5Var2.K();
                    if (!z2 || K5 == obj) {
                        K5 = new dct(mctVar, 3);
                        oq5Var2.k0(K5);
                    }
                    cpa b2 = zoa.b((Function1) K5, oq5Var2);
                    z3 = i8 != 4;
                    K6 = oq5Var2.K();
                    if (!z3 || K6 == obj) {
                        K6 = new dkc(mctVar, null, 2);
                        oq5Var2.k0(K6);
                    }
                    q5g.k(yciVar4.f(zoa.a(vciVar, b2, bxjVar, false, null, false, null, (pyc) K6, false, 188)), null, svd.a(oq5Var2), j4, null, 0.0f, ild.C(-1676189475, new mz5(n5gVar, wn5Var, function02, function22, C, mctVar, wn5Var2, function03, vqnVar, z4, sdrVar), oq5Var2), oq5Var2, ((i7 >> 12) & 7168) | ScreenMirroringConfig.Video.BITRATE_1_5MB, 50);
                    oq5Var = oq5Var2;
                    yciVar3 = yciVar4;
                    j3 = j4;
                } else {
                    oq5Var2.S();
                }
            } else {
                oq5Var2.S();
                yciVar3 = yciVar2;
                j3 = j2;
                oq5Var = oq5Var2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new fwl(mctVar, wn5Var, wn5Var2, pycVar, n5gVar, yciVar3, function2, j3, i, i2);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) != 0) {
        }
        if ((12582912 & i) != 0) {
        }
        if ((4793491 & i3) == 4793490) {
        }
        oq5Var2.U();
        i4 = i & 1;
        vciVar = vci.a;
        if (i4 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        int i72 = i3;
        yci yciVar42 = yciVar2;
        long j42 = j2;
        oq5Var2.q();
        vqn vqnVar2 = new vqn();
        vqnVar2.a = ((jx7) oq5Var2.j(es5.h)).L(d);
        int i82 = i72 & 14;
        if (i82 != 4) {
        }
        K = oq5Var2.K();
        Object obj2 = gq5.a;
        if (!z) {
        }
        K = new ect(mctVar, 1);
        oq5Var2.k0(K);
        Function0 function04 = (Function0) K;
        f = oq5Var2.f(function04);
        K2 = oq5Var2.K();
        if (!f) {
        }
        K2 = new g1j(29, function04);
        oq5Var2.k0(K2);
        Function0 function022 = (Function0) K2;
        f2 = oq5Var2.f(function04);
        K3 = oq5Var2.K();
        if (!f2) {
        }
        K3 = new gct(0, function04);
        oq5Var2.k0(K3);
        Function0 function032 = (Function0) K3;
        f3 = oq5Var2.f(function04);
        K4 = oq5Var2.K();
        if (!f3) {
        }
        K4 = szf.U(new gct(1, function04));
        oq5Var2.k0(K4);
        sdr sdrVar2 = (sdr) K4;
        boolean z42 = !((Boolean) sdrVar2.getValue()).booleanValue();
        wn5 C2 = ild.C(1593708898, new wt2(pycVar, 2), oq5Var2);
        bxj bxjVar2 = bxj.a;
        if (i82 != 4) {
        }
        K5 = oq5Var2.K();
        if (!z2) {
        }
        K5 = new dct(mctVar, 3);
        oq5Var2.k0(K5);
        cpa b22 = zoa.b((Function1) K5, oq5Var2);
        if (i82 != 4) {
        }
        K6 = oq5Var2.K();
        if (!z3) {
        }
        K6 = new dkc(mctVar, null, 2);
        oq5Var2.k0(K6);
        q5g.k(yciVar42.f(zoa.a(vciVar, b22, bxjVar2, false, null, false, null, (pyc) K6, false, 188)), null, svd.a(oq5Var2), j42, null, 0.0f, ild.C(-1676189475, new mz5(n5gVar, wn5Var, function022, function22, C2, mctVar, wn5Var2, function032, vqnVar2, z42, sdrVar2), oq5Var2), oq5Var2, ((i72 >> 12) & 7168) | ScreenMirroringConfig.Video.BITRATE_1_5MB, 50);
        oq5Var = oq5Var2;
        yciVar3 = yciVar42;
        j3 = j42;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(mct mctVar, float f, b9r b9rVar, cg6 cg6Var) {
        jct jctVar;
        int i;
        uqn uqnVar;
        b9r b9rVar2;
        uqn uqnVar2;
        if (cg6Var instanceof jct) {
            jctVar = (jct) cg6Var;
            int i2 = jctVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jctVar.o = i2 - Integer.MIN_VALUE;
                jct jctVar2 = jctVar;
                Object obj = jctVar2.n;
                nm6 nm6Var = nm6.a;
                i = jctVar2.o;
                if (i != 0) {
                    qgg.h0(obj);
                    if (mctVar.a() < 0.01f || mctVar.a() == 1.0f) {
                        return new yzt(0L);
                    }
                    uqnVar = new uqn();
                    uqnVar.a = f;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uqnVar2 = jctVar2.l;
                        qgg.h0(obj);
                        uqnVar = uqnVar2;
                        return new yzt(bzf.s(0.0f, uqnVar.a));
                    }
                    f = jctVar2.m;
                    uqn uqnVar3 = jctVar2.l;
                    b9rVar = jctVar2.k;
                    mct mctVar2 = jctVar2.j;
                    qgg.h0(obj);
                    uqnVar = uqnVar3;
                    mctVar = mctVar2;
                }
                b9rVar2 = b9rVar;
                if (b9rVar2 != null) {
                    t6k t6kVar = mctVar.c;
                    t6k t6kVar2 = mctVar.e;
                    float f2 = -t6kVar.e();
                    float e2 = t6kVar2.e();
                    if (f2 <= e2 && e2 <= 0.0f) {
                        vm0 J = wdp.J(t6kVar2.e(), 0.0f, 30);
                        Float f3 = new Float(mctVar.a() < 0.5f ? 0.0f : -mctVar.c.e());
                        dct dctVar = new dct(mctVar, 0);
                        jctVar2.j = null;
                        jctVar2.k = null;
                        jctVar2.l = uqnVar;
                        jctVar2.m = f;
                        jctVar2.o = 2;
                        if (v5g.s(J, f3, b9rVar2, false, dctVar, jctVar2, 4) == nm6Var) {
                            return nm6Var;
                        }
                        uqnVar2 = uqnVar;
                        uqnVar = uqnVar2;
                    }
                }
                return new yzt(bzf.s(0.0f, uqnVar.a));
            }
        }
        jctVar = new jct(cg6Var);
        jct jctVar22 = jctVar;
        Object obj2 = jctVar22.n;
        nm6 nm6Var2 = nm6.a;
        i = jctVar22.o;
        if (i != 0) {
        }
        b9rVar2 = b9rVar;
        if (b9rVar2 != null) {
        }
        return new yzt(bzf.s(0.0f, uqnVar.a));
    }
}
