package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class uas {
    public static final uas a = new uas();
    public static final float b = 56;
    public static final float c = 280;
    public static final float d = 1;
    public static final float e = 2;

    public final void a(boolean z, uoi uoiVar, hs7 hs7Var, dup dupVar, float f, float f2, hq5 hq5Var, int i) {
        oq5 oq5Var;
        float f3;
        int i2;
        float f4;
        float f5;
        int i3;
        kya kyaVar;
        sdr o0;
        sdr o02;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(943754022);
        int i4 = i | (oq5Var2.g(z) ? 4 : 2) | (oq5Var2.g(false) ? 32 : 16) | (oq5Var2.f(uoiVar) ? 256 : 128) | (oq5Var2.f(hs7Var) ? 2048 : 1024) | (oq5Var2.f(dupVar) ? 16384 : RemoteCameraConfig.Notification.ID) | 589824;
        if (oq5Var2.P(i4 & 1, (4793491 & i4) != 4793490)) {
            oq5Var2.U();
            if ((i & 1) == 0 || oq5Var2.y()) {
                i2 = i4 & (-4128769);
                f4 = e;
                f5 = d;
            } else {
                oq5Var2.S();
                f5 = f2;
                i2 = i4 & (-4128769);
                f4 = f;
            }
            oq5Var2.q();
            aqi u = zc4.u(uoiVar, oq5Var2, ((i2 & 8190) >> 6) & 14);
            oq5Var2.Z(998675979);
            long j = !z ? hs7Var.h : ((Boolean) zc4.u(uoiVar, oq5Var2, ((i2 & 8190) >> 6) & 14).getValue()).booleanValue() ? hs7Var.e : hs7Var.f;
            if (z) {
                oq5Var2.Z(1614254271);
                oq5Var = oq5Var2;
                f = f4;
                i3 = 150;
                kyaVar = null;
                o0 = bmq.b(j, weo.S(150, 0, null, 6), null, oq5Var, 48, 12);
                oq5Var.p(false);
            } else {
                f = f4;
                i3 = 150;
                kyaVar = null;
                oq5Var = oq5Var2;
                oq5Var.Z(1614357129);
                o0 = szf.o0(new d85(j), oq5Var);
                oq5Var.p(false);
            }
            sdr sdrVar = o0;
            oq5Var.p(false);
            float f6 = ((Boolean) u.getValue()).booleanValue() ? f : f5;
            if (z) {
                oq5Var.Z(773088894);
                oq5 oq5Var3 = oq5Var;
                o02 = pk0.a(f6, weo.S(i3, 0, kyaVar, 6), null, oq5Var3, 48, 12);
                oq5Var = oq5Var3;
                oq5Var.p(false);
            } else {
                oq5Var.Z(773193116);
                o02 = szf.o0(new cma(f5), oq5Var);
                oq5Var.p(false);
            }
            dd3 dd3Var = (dd3) szf.o0(new dd3(((cma) o02.getValue()).a, new f3r(((d85) sdrVar.getValue()).a)), oq5Var).getValue();
            ug3.a(c3x.z(vci.a, dd3Var.a, dd3Var.b, dupVar), oq5Var, 0);
            f3 = f5;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            f3 = f2;
        }
        float f7 = f;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sas(this, z, uoiVar, hs7Var, dupVar, f7, f3, i);
        }
    }

    public final void b(String str, Function2 function2, boolean z, boolean z2, tiu tiuVar, uoi uoiVar, Function2 function22, dup dupVar, hs7 hs7Var, o0k o0kVar, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        boolean z3;
        boolean z4;
        tiu tiuVar2;
        oq5 oq5Var;
        o0k o0kVar2;
        int i3;
        o0k q0kVar;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-920823490);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z3 = z;
            i2 |= oq5Var2.g(z3) ? 256 : 128;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            z4 = z2;
            i2 |= oq5Var2.g(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        if ((i & 24576) == 0) {
            tiuVar2 = tiuVar;
            i2 |= oq5Var2.f(tiuVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            tiuVar2 = tiuVar;
        }
        if ((i & 196608) == 0) {
            i2 |= oq5Var2.f(uoiVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i2 |= oq5Var2.g(false) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= oq5Var2.h(null) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i & 100663296) == 0) {
            i2 |= oq5Var2.h(function22) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= oq5Var2.h(null) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i4 = 221184 | (oq5Var2.h(null) ? 4 : 2) | (oq5Var2.f(dupVar) ? 32 : 16) | (oq5Var2.f(hs7Var) ? 256 : 128) | 1024;
        if (oq5Var2.P(i2 & 1, ((306783379 & i2) == 306783378 && (74899 & i4) == 74898) ? false : true)) {
            oq5Var2.U();
            if ((i & 1) == 0 || oq5Var2.y()) {
                float f = cbs.a;
                i3 = i4 & (-7169);
                q0kVar = new q0k(f, f, f, f);
            } else {
                oq5Var2.S();
                i3 = i4 & (-7169);
                q0kVar = o0kVar;
            }
            oq5Var2.q();
            xbs xbsVar = xbs.a;
            int i5 = i2 << 3;
            int i6 = i2 >> 9;
            int i7 = i3 << 6;
            oq5Var = oq5Var2;
            boolean z5 = z4;
            tiu tiuVar3 = tiuVar2;
            cbs.a(str, function2, tiuVar3, function22, z5, z3, uoiVar, q0kVar, dupVar, hs7Var, wn5Var, oq5Var, (i5 & 896) | (i5 & 112) | 6 | ((i2 >> 3) & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | ((i3 << 21) & 29360128) | ((i2 << 15) & 234881024) | ((i2 << 21) & 1879048192), ((i2 >> 12) & 112) | ((i2 >> 18) & 14) | (i7 & 7168) | (i7 & 57344) | 196608);
            o0kVar2 = q0kVar;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            o0kVar2 = o0kVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tas(this, str, function2, z, z2, tiuVar, uoiVar, function22, dupVar, hs7Var, o0kVar2, wn5Var, i);
        }
    }
}
