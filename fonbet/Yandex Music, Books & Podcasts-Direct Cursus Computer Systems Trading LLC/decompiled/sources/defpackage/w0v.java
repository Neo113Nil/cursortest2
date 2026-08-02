package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public abstract class w0v {
    public static final float a = 40;

    public static final void a(k2v k2vVar, boolean z, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1946427695);
        if ((((oq5Var.h(k2vVar) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            kfh d = ug3.d(b2c.f, false);
            int i2 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, vci.a);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            a3v a3vVar = k2vVar.a;
            if (a3vVar instanceof y2v) {
                oq5Var.Z(-1174491644);
                gut.a(((y2v) a3vVar).a, oq5Var, 0);
                oq5Var.p(false);
            } else {
                if (!(a3vVar instanceof z2v)) {
                    throw vz1.i(oq5Var, 1347582808, false);
                }
                oq5Var.Z(-1174313115);
                if (z) {
                    oq5Var.Z(-1174281836);
                    gut.a(((z2v) a3vVar).a, oq5Var, 0);
                } else {
                    oq5Var.Z(-1187968615);
                }
                oq5Var.p(false);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl3(k2vVar, z, i, 11);
        }
    }

    public static final void b(k2v k2vVar, sdr sdrVar, Function0 function0, Function0 function02, yci yciVar, boolean z, hq5 hq5Var, int i) {
        int i2;
        vci vciVar;
        kjn kjnVar;
        float f;
        boolean z2;
        z7t z7tVar;
        boolean z3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(779631063);
        int i3 = i | (oq5Var.h(k2vVar) ? 4 : 2) | (oq5Var.f(sdrVar) ? 32 : 16) | (oq5Var.h(function0) ? 256 : 128) | (oq5Var.h(function02) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.g(z) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if ((74899 & i3) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            d8t e = i8t.e(Boolean.valueOf(!((Boolean) sdrVar.getValue()).booleanValue() && z), "ForegroundPauseSwap", oq5Var, 48, 0);
            x6k x6kVar = e.d;
            oct octVar = azt.a;
            boolean booleanValue = ((Boolean) e.c()).booleanValue();
            oq5Var.Z(1700276367);
            float f2 = booleanValue ? 1.0f : 0.0f;
            oq5Var.p(false);
            Float valueOf = Float.valueOf(f2);
            boolean booleanValue2 = ((Boolean) x6kVar.getValue()).booleanValue();
            oq5Var.Z(1700276367);
            float f3 = booleanValue2 ? 1.0f : 0.0f;
            oq5Var.p(false);
            Float valueOf2 = Float.valueOf(f3);
            x7t f4 = e.f();
            f4.getClass();
            oq5Var.Z(-10466582);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            act actVar = f4.c(bool, bool2) ? new act(150, 0, lya.a) : new act(150, 150, lya.a);
            oq5Var.p(false);
            z7t c = i8t.c(e, valueOf, valueOf2, actVar, octVar, oq5Var, 196608);
            boolean booleanValue3 = ((Boolean) e.c()).booleanValue();
            oq5Var.Z(1410235763);
            float f5 = booleanValue3 ? 1.0f : 0.0f;
            oq5Var.p(false);
            Float valueOf3 = Float.valueOf(f5);
            boolean booleanValue4 = ((Boolean) x6kVar.getValue()).booleanValue();
            oq5Var.Z(1410235763);
            float f6 = booleanValue4 ? 1.0f : 0.0f;
            oq5Var.p(false);
            Float valueOf4 = Float.valueOf(f6);
            x7t f7 = e.f();
            f7.getClass();
            oq5Var.Z(824710350);
            act actVar2 = f7.c(bool, bool2) ? new act(150, 150, lya.a) : new act(150, 0, lya.a);
            oq5Var.p(false);
            z7t c2 = i8t.c(e, valueOf3, valueOf4, actVar2, octVar, oq5Var, 196608);
            kfh d = ug3.d(b2c.f, false);
            int i4 = oq5Var.P;
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
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            float floatValue = ((Number) c.h.getValue()).floatValue();
            vci vciVar2 = vci.a;
            kjn kjnVar2 = gq5.a;
            if (floatValue < 1.0f) {
                oq5Var.Z(37369672);
                h1v h1vVar = k2vVar.b;
                if (h1vVar == null) {
                    oq5Var.Z(1158459833);
                    oq5Var.p(false);
                    i2 = i3;
                    z2 = false;
                    vciVar = vciVar2;
                    kjnVar = kjnVar2;
                    z7tVar = c2;
                    f = 1.0f;
                } else {
                    oq5Var.Z(1158459834);
                    float f8 = ((gtu) oq5Var.j(htu.a)).d;
                    if (((Boolean) sdrVar.getValue()).booleanValue()) {
                        f8 = 1.0f;
                    }
                    vciVar = vciVar2;
                    kjnVar = kjnVar2;
                    sdr b = pk0.b(f8, null, null, null, oq5Var, 0, 30);
                    qo6 qo6Var = h1vVar.a;
                    oq5Var.Z(37378961);
                    String str = h1vVar.b;
                    if (StringsKt.U(str)) {
                        t8n t8nVar = ((w3v) oq5Var.j(x3v.a)).b;
                        WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
                        webPath$Storage.getClass();
                        str = vz1.w(etn.B("https://avatars.mds.yandex.net/get-music-misc/29541/img.69a1a762f5e70a2c205f855f/%%", webPath$Storage));
                    }
                    oq5Var.p(false);
                    yci d2 = androidx.compose.foundation.layout.a.d(vciVar, 1.0f);
                    boolean z4 = (i3 & 7168) == 2048;
                    Object K = oq5Var.K();
                    if (z4 || K == kjnVar) {
                        K = new gct(13, function02);
                        oq5Var.k0(K);
                    }
                    yci e2 = androidx.compose.foundation.a.e(d2, false, null, null, (Function0) K, 7);
                    boolean f9 = oq5Var.f(c) | oq5Var.f(b);
                    Object K2 = oq5Var.K();
                    if (f9 || K2 == kjnVar) {
                        K2 = new wes(24, b, c);
                        oq5Var.k0(K2);
                    }
                    i2 = i3;
                    f = 1.0f;
                    String str2 = str;
                    z7tVar = c2;
                    ltg.e(qo6Var, str2, androidx.compose.ui.graphics.a.a(e2, (Function1) K2), null, null, null, null, null, oq5Var, 0, 248);
                    oq5Var = oq5Var;
                    z2 = false;
                    oq5Var.p(false);
                }
            } else {
                i2 = i3;
                vciVar = vciVar2;
                kjnVar = kjnVar2;
                f = 1.0f;
                z2 = false;
                z7tVar = c2;
                oq5Var.Z(1143075185);
            }
            oq5Var.p(z2);
            if (((Number) z7tVar.h.getValue()).floatValue() > 0.0f) {
                oq5Var.Z(1159442751);
                yci d3 = androidx.compose.foundation.layout.a.d(vciVar, f);
                boolean f10 = oq5Var.f(z7tVar);
                Object K3 = oq5Var.K();
                if (f10 || K3 == kjnVar) {
                    K3 = new q0v(0, z7tVar);
                    oq5Var.k0(K3);
                }
                oq5 oq5Var2 = oq5Var;
                a0g.x((i2 >> 6) & 14, 12, oq5Var2, androidx.compose.ui.graphics.a.a(d3, (Function1) K3), null, function0, false);
                oq5Var = oq5Var2;
                z3 = false;
            } else {
                z3 = false;
                oq5Var.Z(1143075185);
            }
            oq5Var.p(z3);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k5b(k2vVar, sdrVar, function0, function02, yciVar, z, i);
        }
    }

    public static final void c(final l3v l3vVar, sdr sdrVar, ab0 ab0Var, Function0 function0, final Function0 function02, final Function0 function03, Function1 function1, yci yciVar, Function1 function12, onu onuVar, Function1 function13, Function0 function04, boolean z, pyc pycVar, Function2 function2, hq5 hq5Var, int i, int i2, int i3) {
        int i4;
        sdr sdrVar2;
        Function0 function05;
        yci yciVar2;
        final Function1 function14;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Function0 function06;
        Function1 function15;
        oq5 oq5Var;
        pyc pycVar2;
        Function0 function07;
        boolean z2;
        Function1 function16;
        Function2 function22;
        yci yciVar3;
        Function1 function17;
        onu onuVar2;
        sdrVar.getClass();
        ab0Var.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function1.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-2124607499);
        if ((i & 6) == 0) {
            i4 = (oq5Var2.h(l3vVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            sdrVar2 = sdrVar;
            i4 |= oq5Var2.f(sdrVar2) ? 32 : 16;
        } else {
            sdrVar2 = sdrVar;
        }
        if ((i & 384) == 0) {
            i4 |= oq5Var2.h(ab0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function05 = function0;
            i4 |= oq5Var2.h(function05) ? 2048 : 1024;
        } else {
            function05 = function0;
        }
        int i11 = i & 24576;
        int i12 = RemoteCameraConfig.Notification.ID;
        if (i11 == 0) {
            i4 |= oq5Var2.h(function02) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= oq5Var2.h(function03) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i4 |= oq5Var2.h(function1) ? 1048576 : 524288;
        }
        int i13 = i3 & 128;
        if (i13 != 0) {
            i4 |= 12582912;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            if ((i & 12582912) == 0) {
                i4 |= oq5Var2.f(yciVar2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
            }
        }
        int i14 = i3 & 256;
        if (i14 != 0) {
            i4 |= 100663296;
            function14 = function12;
        } else {
            function14 = function12;
            if ((i & 100663296) == 0) {
                i4 |= oq5Var2.h(function14) ? 67108864 : 33554432;
            }
        }
        int i15 = i3 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i15 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i4 |= oq5Var2.d(onuVar == null ? -1 : onuVar.ordinal()) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i16 = i4;
        int i17 = i3 & 1024;
        if (i17 != 0) {
            i6 = i2 | 6;
            i5 = i17;
        } else if ((i2 & 6) == 0) {
            i5 = i17;
            i6 = i2 | (oq5Var2.h(function13) ? 4 : 2);
        } else {
            i5 = i17;
            i6 = i2;
        }
        int i18 = i3 & 2048;
        if (i18 != 0) {
            i6 |= 48;
            i7 = i18;
        } else if ((i2 & 48) == 0) {
            i7 = i18;
            i6 |= oq5Var2.h(function04) ? 32 : 16;
        } else {
            i7 = i18;
        }
        int i19 = i6;
        int i20 = i3 & 4096;
        if (i20 != 0) {
            i8 = i19 | 384;
        } else {
            int i21 = i19;
            if ((i2 & 384) == 0) {
                i21 |= oq5Var2.g(z) ? 256 : 128;
            }
            i8 = i21;
        }
        int i22 = i3 & RemoteCameraConfig.Notification.ID;
        if (i22 != 0) {
            i9 = i8 | 3072;
        } else {
            int i23 = i8;
            if ((i2 & 3072) == 0) {
                i9 = i23 | (oq5Var2.h(pycVar) ? 2048 : 1024);
            } else {
                i9 = i23;
            }
        }
        int i24 = i3 & 16384;
        if (i24 != 0) {
            i10 = i9 | 24576;
        } else {
            int i25 = i9;
            if ((i2 & 24576) == 0) {
                if (oq5Var2.h(function2)) {
                    i12 = 16384;
                }
                i10 = i25 | i12;
            } else {
                i10 = i25;
            }
        }
        if ((i16 & 306783379) == 306783378 && (i10 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            function17 = function13;
            function07 = function04;
            z2 = z;
            pycVar2 = pycVar;
            function22 = function2;
            oq5Var = oq5Var2;
            yciVar3 = yciVar2;
            function16 = function14;
            onuVar2 = onuVar;
        } else {
            yci yciVar4 = i13 != 0 ? vci.a : yciVar2;
            if (i14 != 0) {
                function14 = null;
            }
            final onu onuVar3 = i15 != 0 ? onu.a : onuVar;
            Function1 function18 = i5 != 0 ? null : function13;
            kjn kjnVar = gq5.a;
            if (i7 != 0) {
                Object K = oq5Var2.K();
                if (K == kjnVar) {
                    K = new wuu(24);
                    oq5Var2.k0(K);
                }
                function06 = (Function0) K;
            } else {
                function06 = function04;
            }
            boolean z3 = i20 != 0 ? true : z;
            pyc pycVar3 = i22 != 0 ? null : pycVar;
            Function2 function23 = i24 == 0 ? function2 : null;
            aqi o0 = szf.o0(function18, oq5Var2);
            boolean f = oq5Var2.f(ab0Var);
            final Function2 function24 = function23;
            Object K2 = oq5Var2.K();
            if (f || K2 == kjnVar) {
                K2 = new v0v(ab0Var, o0);
                oq5Var2.k0(K2);
            }
            v0v v0vVar = (v0v) K2;
            boolean f2 = oq5Var2.f(l3vVar);
            Object K3 = oq5Var2.K();
            if (f2 || K3 == kjnVar) {
                function15 = function18;
                K3 = new o14(l3vVar.a, l3vVar.b, l3vVar.c);
                oq5Var2.k0(K3);
            } else {
                function15 = function18;
            }
            o14 o14Var = (o14) K3;
            oq5Var = oq5Var2;
            final Function0 function08 = function05;
            final boolean z4 = z3;
            final pyc pycVar4 = pycVar3;
            final sdr sdrVar3 = sdrVar2;
            final Function0 function09 = function06;
            zc4.a(v0vVar, o14Var, function1, new i24(0), yciVar4, null, null, null, false, pycVar3 != null, 1.2f, false, 0.0f, false, 0.0f, ild.C(218518552, new pyc() { // from class: r0v
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    l2v l2vVar = (l2v) obj;
                    hq5 hq5Var2 = (hq5) obj2;
                    ((Integer) obj3).getClass();
                    l2vVar.getClass();
                    boolean equals = l2vVar.equals(l3v.this.b);
                    wn5 C = ild.C(-90396949, new p0v(l2vVar, equals, sdrVar3, function08, function02, function03, onuVar3, function09, z4), hq5Var2);
                    pyc pycVar5 = pycVar4;
                    if (pycVar5 != null) {
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        oq5Var3.Z(-1283522963);
                        oq5Var3.Z(-457037709);
                        yci yciVar5 = vci.a;
                        yci c = d.c(yciVar5, 1.0f);
                        if (!equals) {
                            Object K4 = oq5Var3.K();
                            if (K4 == gq5.a) {
                                K4 = new t0v(0);
                                oq5Var3.k0(K4);
                            }
                            yciVar5 = nfp.a(yciVar5, (Function1) K4);
                        }
                        yci f3 = c.f(yciVar5);
                        oq5Var3.p(false);
                        cb0.s(ild.C(868746126, new duu(function14, equals, function24, C), oq5Var3), ild.C(721817261, new u0v(0, pycVar5, l2vVar), oq5Var3), f3, oq5Var3, 54);
                        oq5Var3.p(false);
                    } else {
                        oq5 oq5Var4 = (oq5) hq5Var2;
                        oq5Var4.Z(-1282217212);
                        C.invoke(oq5Var4, 6);
                        oq5Var4.p(false);
                    }
                    return Unit.a;
                }
            }, oq5Var), oq5Var, ((i16 >> 12) & 896) | ((i16 >> 9) & 57344), 196662, 29152);
            pycVar2 = pycVar4;
            function07 = function09;
            z2 = z4;
            function16 = function14;
            function22 = function24;
            yciVar3 = yciVar4;
            function17 = function15;
            onuVar2 = onuVar3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s0v(l3vVar, sdrVar, ab0Var, function0, function02, function03, function1, yciVar3, function16, onuVar2, function17, function07, z2, pycVar2, function22, i, i2, i3, 0);
        }
    }

    public static final void d(k2v k2vVar, boolean z, sdr sdrVar, Function0 function0, Function0 function02, Function0 function03, onu onuVar, Function0 function04, boolean z2, hq5 hq5Var, int i) {
        oq5 oq5Var;
        wn5 wn5Var;
        wn5 wn5Var2;
        boolean z3;
        boolean z4;
        oq5 oq5Var2;
        k2v k2vVar2 = k2vVar;
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-333183704);
        int i2 = (oq5Var3.g(z2) ? 67108864 : 33554432) | i | (oq5Var3.h(k2vVar2) ? 4 : 2) | (oq5Var3.g(z) ? 32 : 16) | (oq5Var3.f(sdrVar) ? 256 : 128) | (oq5Var3.h(function0) ? 2048 : 1024) | (oq5Var3.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var3.h(function03) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var3.d(onuVar.ordinal()) ? 1048576 : 524288) | (oq5Var3.h(function04) ? 8388608 : RemoteCameraConfig.Camera.BITRATE);
        if ((38347923 & i2) == 38347922 && oq5Var3.z()) {
            oq5Var3.S();
            oq5Var2 = oq5Var3;
        } else {
            iz2 iz2Var = b2c.f;
            yci c = d.c(vci.a, 1.0f);
            Object K = oq5Var3.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = vz1.h(oq5Var3);
            }
            uoi uoiVar = (uoi) K;
            boolean z5 = ((i2 & 112) == 32) | ((29360128 & i2) == 8388608) | ((57344 & i2) == 16384);
            Object K2 = oq5Var3.K();
            if (z5 || K2 == kjnVar) {
                K2 = new x2h(z, function04, function02, 3);
                oq5Var3.k0(K2);
            }
            yci d = androidx.compose.foundation.a.d(c, uoiVar, null, false, null, null, (Function0) K2, 28);
            kfh d2 = ug3.d(iz2Var, false);
            int i3 = oq5Var3.P;
            a l = oq5Var3.l();
            yci H = vnj.H(oq5Var3, d);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            g0g.U(oq5Var3, d2, wp5.f);
            g0g.U(oq5Var3, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var3, i3, kb5Var);
            }
            g0g.U(oq5Var3, H, wp5.d);
            wn5 C = ild.C(-214602819, new o0v(onuVar, function04, k2vVar2), oq5Var3);
            wn5 C2 = ild.C(1007999806, new o0v(onuVar, k2vVar2, function04), oq5Var3);
            k26 k26Var = new k26(onuVar, function04, k2vVar2, sdrVar, function03, function0, z2);
            k2vVar2 = k2vVar2;
            wn5 C3 = ild.C(-2064364865, k26Var, oq5Var3);
            a3v a3vVar = k2vVar2.a;
            boolean z6 = a3vVar instanceof y2v;
            if (z6) {
                oq5Var = oq5Var3;
                wn5Var = C;
                wn5Var2 = C2;
                z3 = false;
            } else {
                if (!(a3vVar instanceof z2v)) {
                    b6e.s();
                    return;
                }
                oq5Var = oq5Var3;
                wn5Var = C;
                wn5Var2 = C2;
                z3 = true;
            }
            if (z6) {
                z4 = true;
            } else {
                if (!(a3vVar instanceof z2v)) {
                    b6e.s();
                    return;
                }
                z4 = false;
            }
            z0v.a(wn5Var, wn5Var2, C3, z3, z4, null, onuVar, oq5Var, (3670016 & i2) | 438, 32);
            oq5Var2 = oq5Var;
            oq5Var2.p(true);
        }
        xmn r = oq5Var2.r();
        if (r != null) {
            r.d = new p0v(k2vVar2, z, sdrVar, function0, function02, function03, onuVar, function04, z2, i);
        }
    }

    public static final void e(yci yciVar, onu onuVar, Function2 function2, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(262547579);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.d(onuVar == null ? -1 : onuVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            wn5 C = ild.C(1720562615, new olu(3, onuVar), oq5Var);
            if (function2 != null) {
                oq5Var.Z(420233926);
                cb0.s(ild.C(877607537, new lqr(C, 15), oq5Var), function2, yciVar, oq5Var, ((i2 << 6) & 896) | ((i2 >> 3) & 112) | 6);
                oq5Var.p(false);
            } else {
                oq5Var.Z(420432481);
                C.invoke(yciVar, oq5Var, Integer.valueOf((i2 & 14) | 48));
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(yciVar, onuVar, function2, i, 22);
        }
    }
}
