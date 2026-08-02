package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.layout.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class ows {
    public static final float a = 323;
    public static final float b = 12;

    public static final void a(wxk wxkVar, boolean z, sdr sdrVar, c6h c6hVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        yci yciVar2;
        wxkVar.getClass();
        sdrVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(121478139);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.h(wxkVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(sdrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.h(c6hVar) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((i3 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            boolean h = oq5Var2.h(c6hVar);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                zhs zhsVar = new zhs(0, c6hVar, c6h.class, "onSubtitleClick", "onSubtitleClick()V", 0, 5);
                oq5Var2.k0(zhsVar);
                K = zhsVar;
            }
            h9f h9fVar = (h9f) K;
            boolean h2 = oq5Var2.h(c6hVar);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                zhs zhsVar2 = new zhs(0, c6hVar, c6h.class, "onSubtitleClick", "onSubtitleClick()V", 0, 6);
                oq5Var2.k0(zhsVar2);
                K2 = zhsVar2;
            }
            h9f h9fVar2 = (h9f) K2;
            boolean h3 = oq5Var2.h(c6hVar);
            Object K3 = oq5Var2.K();
            if (h3 || K3 == kjnVar) {
                zhs zhsVar3 = new zhs(0, c6hVar, c6h.class, "onSubtitleLongClick", "onSubtitleLongClick()V", 0, 7);
                oq5Var2.k0(zhsVar3);
                K3 = zhsVar3;
            }
            h9f h9fVar3 = (h9f) K3;
            boolean h4 = oq5Var2.h(c6hVar);
            Object K4 = oq5Var2.K();
            if (h4 || K4 == kjnVar) {
                zhs zhsVar4 = new zhs(0, c6hVar, c6h.class, "onTitleClick", "onTitleClick()V", 0, 8);
                oq5Var2.k0(zhsVar4);
                K4 = zhsVar4;
            }
            h9f h9fVar4 = (h9f) K4;
            boolean h5 = oq5Var2.h(c6hVar);
            Object K5 = oq5Var2.K();
            if (h5 || K5 == kjnVar) {
                zhs zhsVar5 = new zhs(0, c6hVar, c6h.class, "onTitleLongClick", "onTitleLongClick()V", 0, 9);
                oq5Var2.k0(zhsVar5);
                K5 = zhsVar5;
            }
            h9f h9fVar5 = (h9f) K5;
            boolean h6 = oq5Var2.h(c6hVar);
            Object K6 = oq5Var2.K();
            if (h6 || K6 == kjnVar) {
                zhs zhsVar6 = new zhs(0, c6hVar, c6h.class, "onShareClick", "onShareClick()V", 0, 10);
                oq5Var2.k0(zhsVar6);
                K6 = zhsVar6;
            }
            h9f h9fVar6 = (h9f) K6;
            boolean h7 = oq5Var2.h(c6hVar);
            Object K7 = oq5Var2.K();
            if (h7 || K7 == kjnVar) {
                zhs zhsVar7 = new zhs(0, c6hVar, c6h.class, "onOverflowClick", "onOverflowClick()V", 0, 11);
                oq5Var2.k0(zhsVar7);
                K7 = zhsVar7;
            }
            vci vciVar = vci.a;
            oq5Var = oq5Var2;
            b(wxkVar, z, sdrVar, (Function0) h9fVar, (Function0) h9fVar4, (Function0) h9fVar5, (Function0) h9fVar2, (Function0) h9fVar3, (Function0) h9fVar6, (Function0) ((h9f) K7), vciVar, oq5Var, i3 & 1022, (i3 >> 12) & 14);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vu0(wxkVar, z, sdrVar, c6hVar, yciVar2, i, 5);
        }
    }

    public static final void b(final wxk wxkVar, boolean z, final sdr sdrVar, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, final Function0 function07, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        boolean z2;
        Function0 function08;
        Function0 function09;
        Function0 function010;
        Function0 function011;
        Function0 function012;
        Function0 function013;
        int i4;
        wxkVar.getClass();
        sdrVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        function05.getClass();
        function06.getClass();
        function07.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-683496343);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(wxkVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i3 |= oq5Var.g(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.f(sdrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function08 = function0;
            i3 |= oq5Var.h(function08) ? 2048 : 1024;
        } else {
            function08 = function0;
        }
        if ((i & 24576) == 0) {
            function09 = function02;
            i3 |= oq5Var.h(function09) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            function09 = function02;
        }
        if ((196608 & i) == 0) {
            function010 = function03;
            i3 |= oq5Var.h(function010) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            function010 = function03;
        }
        if ((1572864 & i) == 0) {
            function011 = function04;
            i3 |= oq5Var.h(function011) ? 1048576 : 524288;
        } else {
            function011 = function04;
        }
        if ((12582912 & i) == 0) {
            function012 = function05;
            i3 |= oq5Var.h(function012) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            function012 = function05;
        }
        if ((100663296 & i) == 0) {
            function013 = function06;
            i3 |= oq5Var.h(function013) ? 67108864 : 33554432;
        } else {
            function013 = function06;
        }
        if ((805306368 & i) == 0) {
            i3 |= oq5Var.h(function07) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (oq5Var.f(yciVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            final boolean z3 = z2;
            final Function0 function014 = function08;
            final Function0 function015 = function09;
            final Function0 function016 = function010;
            final Function0 function017 = function011;
            final Function0 function018 = function012;
            final Function0 function019 = function013;
            bg3.a(d.e(yciVar, Math.max(l86.a, szf.Z(oq5Var))), null, false, ild.C(-1278168513, new pyc() { // from class: mws
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    jws jwsVar;
                    c cVar = (c) obj;
                    hq5 hq5Var2 = (hq5) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    cVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                    }
                    if ((intValue & 19) == 18) {
                        oq5 oq5Var2 = (oq5) hq5Var2;
                        if (oq5Var2.z()) {
                            oq5Var2.S();
                            return Unit.a;
                        }
                    }
                    float f = ows.a;
                    ep5 ep5Var = new ep5(26);
                    vci vciVar = vci.a;
                    yci b2 = a.b(vciVar, ep5Var);
                    nho a2 = lho.a(qx0.a, b2c.l, hq5Var2, 48);
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    int i5 = oq5Var3.P;
                    androidx.compose.runtime.internal.a l = oq5Var3.l();
                    yci H = vnj.H(hq5Var2, b2);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var3.d0();
                    if (oq5Var3.O) {
                        oq5Var3.k(grbVar);
                    } else {
                        oq5Var3.n0();
                    }
                    g0g.U(hq5Var2, a2, wp5.f);
                    g0g.U(hq5Var2, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var3, i5, kb5Var);
                    }
                    g0g.U(hq5Var2, H, wp5.d);
                    float d = cVar.d();
                    wxk wxkVar2 = wxk.this;
                    if (z3) {
                        jwsVar = new hws(wxkVar2.b());
                    } else {
                        boolean z4 = wxkVar2 instanceof sxk;
                        iws iwsVar = iws.a;
                        if (z4) {
                            if (Float.compare(d, ows.a) >= 0) {
                                List list = ((sxk) wxkVar2).h;
                                if (!list.isEmpty()) {
                                    jwsVar = new gws(list, sdrVar);
                                }
                            }
                        } else if (!(wxkVar2 instanceof oxk) && !(wxkVar2 instanceof pxk) && !(wxkVar2 instanceof txk) && !(wxkVar2 instanceof uxk)) {
                            b6e.s();
                            return null;
                        }
                        jwsVar = iwsVar;
                    }
                    Object K = oq5Var3.K();
                    if (K == gq5.a) {
                        K = new phs(19);
                        oq5Var3.k0(K);
                    }
                    yci a3 = nfp.a(vciVar, (Function1) K);
                    boolean z5 = false;
                    lws.b(jwsVar, function014, a3, hq5Var2, 0);
                    String title = wxkVar2.getTitle();
                    CharSequence subtitle = wxkVar2.getSubtitle();
                    jzb a4 = wxkVar2.a();
                    if (wxkVar2 instanceof sxk) {
                        z5 = ((sxk) wxkVar2).g;
                    } else if (!(wxkVar2 instanceof oxk) && !(wxkVar2 instanceof pxk) && !(wxkVar2 instanceof txk) && !(wxkVar2 instanceof uxk)) {
                        b6e.s();
                        return null;
                    }
                    boolean z6 = z5;
                    if (1.0f <= 0.0d) {
                        qme.a("invalid weight; must be greater than zero");
                    }
                    szf.s(title, subtitle, a4, z6, function015, function016, function017, function018, new LayoutWeightElement(true, 1.0f), hq5Var2, 0);
                    xv7.n(0, hq5Var2, null, function019, function07, rzf.D(wxkVar2), rzf.C(wxkVar2));
                    oq5Var3.p(true);
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 3072, 6);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new p9n(wxkVar, z, sdrVar, function0, function02, function03, function04, function05, function06, function07, yciVar, i, i2);
        }
    }

    public static final void c(int i, hq5 hq5Var, yci yciVar, boolean z) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(211551766);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            bg3.a(null, null, false, ild.C(1417446124, new xu0(z), oq5Var), oq5Var, 3072, 7);
            yciVar = vci.a;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(z, yciVar, i, 17);
        }
    }
}
