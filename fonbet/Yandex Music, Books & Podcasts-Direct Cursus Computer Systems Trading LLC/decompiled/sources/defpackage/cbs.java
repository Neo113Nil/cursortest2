package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class cbs {
    public static final float a = 16;
    public static final float b = 12;

    public static final void a(String str, Function2 function2, tiu tiuVar, Function2 function22, boolean z, boolean z2, uoi uoiVar, o0k o0kVar, dup dupVar, hs7 hs7Var, wn5 wn5Var, hq5 hq5Var, int i, int i2) {
        int i3;
        tiu tiuVar2;
        int i4;
        Function2 function23;
        int i5;
        o0k o0kVar2;
        dup dupVar2;
        oq5 oq5Var;
        klx klxVar;
        boolean z3;
        boolean z4;
        xbs xbsVar = xbs.a;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(341783750);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.f(xbsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.h(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            tiuVar2 = tiuVar;
            i3 |= oq5Var2.f(tiuVar2) ? 2048 : 1024;
        } else {
            tiuVar2 = tiuVar;
        }
        int i6 = i & 24576;
        int i7 = RemoteCameraConfig.Notification.ID;
        if (i6 == 0) {
            i3 |= oq5Var2.h(null) ? 16384 : 8192;
        }
        int i8 = i & 196608;
        int i9 = SQLiteDatabase.OPEN_FULLMUTEX;
        if (i8 == 0) {
            i4 = 196608;
            function23 = function22;
            i3 |= oq5Var2.h(function23) ? 131072 : 65536;
        } else {
            i4 = 196608;
            function23 = function22;
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i3 |= oq5Var2.h(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= oq5Var2.h(null) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i & 100663296) == 0) {
            i3 |= oq5Var2.g(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= oq5Var2.g(z2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (oq5Var2.g(false) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= oq5Var2.f(uoiVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            o0kVar2 = o0kVar;
            i5 |= oq5Var2.f(o0kVar2) ? 256 : 128;
        } else {
            o0kVar2 = o0kVar;
        }
        if ((i2 & 3072) == 0) {
            dupVar2 = dupVar;
            i5 |= oq5Var2.f(dupVar2) ? 2048 : 1024;
        } else {
            dupVar2 = dupVar;
        }
        if ((i2 & 24576) == 0) {
            if (oq5Var2.f(hs7Var)) {
                i7 = 16384;
            }
            i5 |= i7;
        }
        if ((i2 & i4) == 0) {
            if (oq5Var2.h(wn5Var)) {
                i9 = 131072;
            }
            i5 |= i9;
        }
        boolean z5 = true;
        if (oq5Var2.P(i3 & 1, ((i3 & 306783379) == 306783378 && (74899 & i5) == 74898) ? false : true)) {
            boolean z6 = ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object K = oq5Var2.K();
            if (z6 || K == gq5.a) {
                mn0 mn0Var = new mn0(6, str, (ArrayList) null);
                tiuVar2.getClass();
                K = new l7t(mn0Var, lnj.a);
                oq5Var2.k0(K);
            }
            String str2 = ((l7t) K).a.b;
            vne vneVar = ((Boolean) zc4.u(uoiVar, oq5Var2, (i5 >> 3) & 14).getValue()).booleanValue() ? vne.a : str2.length() == 0 ? vne.b : vne.c;
            jdp jdpVar = new jdp(hs7Var, z2, uoiVar, 1);
            agr agrVar = wdt.b;
            udt udtVar = (udt) oq5Var2.j(agrVar);
            ges gesVar = udtVar.g;
            ges gesVar2 = udtVar.l;
            long c = gesVar.c();
            long j = d85.n;
            if ((!d85.c(c, j) || d85.c(gesVar2.c(), j)) && (d85.c(gesVar.c(), j) || !d85.c(gesVar2.c(), j))) {
                z5 = false;
            }
            klx klxVar2 = klx.i;
            oq5Var2.Z(1578866909);
            long c2 = ((udt) oq5Var2.j(agrVar)).l.c();
            if (z5) {
                oq5Var2.Z(-1572812364);
                if (c2 == 16) {
                    c2 = ((d85) jdpVar.invoke(vneVar, oq5Var2, 0)).a;
                }
                z3 = false;
                oq5Var2.p(false);
                klxVar = klxVar2;
            } else {
                klxVar = klxVar2;
                z3 = false;
                oq5Var2.Z(780549965);
                oq5Var2.p(false);
            }
            long j2 = c2;
            oq5Var2.p(z3);
            oq5Var2.Z(1578874175);
            long c3 = ((udt) oq5Var2.j(agrVar)).g.c();
            if (z5) {
                oq5Var2.Z(-1572585196);
                if (c3 == 16) {
                    c3 = ((d85) jdpVar.invoke(vneVar, oq5Var2, 0)).a;
                }
                z4 = false;
                oq5Var2.p(false);
            } else {
                z4 = false;
                oq5Var2.Z(780557293);
                oq5Var2.p(false);
            }
            oq5Var2.p(z4);
            wn5 C = ild.C(225557475, new yas(function23, str2, hs7Var, z2, uoiVar, dupVar2, function2, z, o0kVar2, z5, wn5Var), oq5Var2);
            oq5Var = oq5Var2;
            klxVar.S(vneVar, j2, c3, jdpVar, z4, C, oq5Var, 1769472);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zas(str, function2, tiuVar, function22, z, z2, uoiVar, o0kVar, dupVar, hs7Var, wn5Var, i, i2);
        }
    }

    public static final void b(long j, ges gesVar, Function2 function2, hq5 hq5Var, int i, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-399493340);
        int i4 = (oq5Var.e(j) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (oq5Var.f(gesVar) ? 32 : 16);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= oq5Var.f(null) ? 256 : 128;
        }
        int i6 = i3 | (oq5Var.h(function2) ? 2048 : 1024);
        if (oq5Var.P(i6 & 1, (i6 & 1171) != 1170)) {
            if (i5 != 0) {
                gesVar = null;
            }
            wn5 C = ild.C(494684590, new bbs(j, (Float) null, function2), oq5Var);
            if (gesVar != null) {
                oq5Var.Z(2115981348);
                xcs.a(gesVar, C, oq5Var, ((i6 >> 3) & 14) | 48);
            } else {
                oq5Var.Z(2115982984);
                C.invoke(oq5Var, 6);
            }
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        ges gesVar2 = gesVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new abs(j, gesVar2, function2, i, i2);
        }
    }

    public static final Object c(ffh ffhVar) {
        Object n = ffhVar.n();
        zof zofVar = n instanceof zof ? (zof) n : null;
        if (zofVar != null) {
            return zofVar.o;
        }
        return null;
    }
}
