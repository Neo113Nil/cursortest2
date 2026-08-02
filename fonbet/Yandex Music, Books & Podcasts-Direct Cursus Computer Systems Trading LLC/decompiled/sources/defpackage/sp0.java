package defpackage;

import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class sp0 {
    public static final float a = 56;
    public static final float b;
    public static final yci c;
    public static final yci d;
    public static final ufc e;

    static {
        float f = 4;
        b = f;
        vci vciVar = vci.a;
        c = d.r(vciVar, 16 - f);
        d = d.r(d.b(vciVar, 1.0f), 72 - f);
        e = p6g.l(0);
    }

    public static final void a(long j, long j2, float f, o0k o0kVar, opv opvVar, yci yciVar, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        oq5 oq5Var;
        jzk jzkVar = vnj.i;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-712505634);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.e(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.c(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(o0kVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.f(jzkVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.f(opvVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            yciVar2 = yciVar;
            i2 |= oq5Var2.f(yciVar2) ? 1048576 : 524288;
        } else {
            yciVar2 = yciVar;
        }
        if ((12582912 & i) == 0) {
            i2 |= oq5Var2.h(wn5Var) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if (oq5Var2.P(i2 & 1, (4793491 & i2) != 4793490)) {
            int i3 = i2 << 6;
            oq5Var = oq5Var2;
            q5g.k(yciVar2, jzkVar, j, j2, null, f, ild.C(213273114, new np0(opvVar, o0kVar, wn5Var, 1), oq5Var2), oq5Var, 1572864 | ((i2 >> 18) & 14) | ((i2 >> 9) & 112) | (i3 & 896) | (i3 & 7168) | ((i2 << 9) & 458752), 16);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new op0(j, j2, f, o0kVar, opvVar, yciVar, wn5Var, i);
        }
    }

    public static final void b(wn5 wn5Var, opv opvVar, yci yciVar, Function2 function2, pyc pycVar, long j, long j2, float f, hq5 hq5Var, int i) {
        int i2;
        opv opvVar2;
        yci yciVar2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-763778507);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.h(wn5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            opvVar2 = opvVar;
            i2 |= oq5Var2.f(opvVar2) ? 32 : 16;
        } else {
            opvVar2 = opvVar;
        }
        if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i2 |= oq5Var2.f(yciVar2) ? 256 : 128;
        } else {
            yciVar2 = yciVar;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.h(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.h(pycVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.e(j) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var2.e(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= oq5Var2.c(f) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if (oq5Var2.P(i2 & 1, (4793491 & i2) != 4793490)) {
            oq5Var2.U();
            if ((i & 1) != 0 && !oq5Var2.y()) {
                oq5Var2.S();
            }
            oq5Var2.q();
            int i3 = i2 >> 15;
            int i4 = i2 << 12;
            oq5Var = oq5Var2;
            a(j, j2, f, mp0.a, opvVar2, yciVar2, ild.C(1849684359, new zl0(1, function2, wn5Var, pycVar), oq5Var2), oq5Var, (i3 & 896) | (i3 & 14) | 12610560 | (i3 & 112) | (458752 & i4) | (i4 & 3670016));
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qp0(wn5Var, opvVar, yciVar, function2, pycVar, j, j2, f, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(wn5 wn5Var, yci yciVar, Function2 function2, pyc pycVar, long j, long j2, float f, hq5 hq5Var, int i, int i2) {
        int i3;
        long j3;
        int i4;
        int i5;
        pyc pycVar2;
        long j4;
        yci yciVar2;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2087748139);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i | 48;
        } else if ((i & 48) == 0) {
            i3 = i | (oq5Var.f(yciVar) ? 32 : 16);
        } else {
            i3 = i;
        }
        int i7 = i3 | 3072 | (oq5Var.e(j) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i2 & 32) == 0) {
            j3 = j2;
            if (oq5Var.e(j3)) {
                i4 = SQLiteDatabase.OPEN_SHAREDCACHE;
                i5 = i7 | i4;
                if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                    i5 |= oq5Var.c(f) ? 1048576 : 524288;
                }
                if (oq5Var.P(i5 & 1, (599187 & i5) == 599186)) {
                    oq5Var.S();
                    pycVar2 = pycVar;
                    j4 = j3;
                    yciVar2 = yciVar;
                } else {
                    oq5Var.U();
                    if ((i & 1) == 0 || oq5Var.y()) {
                        if (i6 != 0) {
                            yciVar = vci.a;
                        }
                        wn5 wn5Var2 = ao5.a;
                        if ((i2 & 32) != 0) {
                            j3 = pa5.b(j, oq5Var);
                            i5 &= -458753;
                        }
                        pycVar2 = wn5Var2;
                    } else {
                        oq5Var.S();
                        if ((i2 & 32) != 0) {
                            i5 &= -458753;
                        }
                        pycVar2 = pycVar;
                    }
                    j4 = j3;
                    yciVar2 = yciVar;
                    oq5Var.q();
                    int i8 = i5 << 3;
                    b(wn5Var, e, yciVar2, function2, pycVar2, j, j4, f, oq5Var, (i8 & 896) | 27702 | (458752 & i8) | (3670016 & i8) | (i8 & 29360128));
                }
                r = oq5Var.r();
                if (r == null) {
                    r.d = new rp0(wn5Var, yciVar2, function2, pycVar2, j, j4, f, i, i2);
                    return;
                }
                return;
            }
        } else {
            j3 = j2;
        }
        i4 = SQLiteDatabase.OPEN_FULLMUTEX;
        i5 = i7 | i4;
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
        }
        if (oq5Var.P(i5 & 1, (599187 & i5) == 599186)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }
}
