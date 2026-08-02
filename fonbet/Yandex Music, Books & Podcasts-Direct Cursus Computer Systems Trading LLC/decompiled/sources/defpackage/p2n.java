package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class p2n {
    public static final float a = 56;

    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, String str2, String str3, Function0 function0, r2n r2nVar, yci yciVar, d85 d85Var, d85 d85Var2, hq5 hq5Var, int i, int i2) {
        int i3;
        String str4;
        String str5;
        yci yciVar2;
        int i4;
        d85 d85Var3;
        int i5;
        d85 d85Var4;
        d85 d85Var5;
        xmn r;
        str.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-294895105);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i3 |= oq5Var.f(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & 384) == 0) {
            str5 = str3;
            i3 |= oq5Var.f(str5) ? 256 : 128;
        } else {
            str5 = str3;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.h(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var.d(r2nVar.ordinal()) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
            } else if ((1572864 & i) == 0) {
                d85Var3 = d85Var;
                i3 |= oq5Var.f(d85Var3) ? 1048576 : 524288;
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    i3 |= oq5Var.f(d85Var2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                    if (oq5Var.P(i3 & 1, (4793491 & i3) == 4793490)) {
                        oq5Var.S();
                        d85Var4 = d85Var3;
                        d85Var5 = d85Var2;
                    } else {
                        yci yciVar3 = i6 != 0 ? vci.a : yciVar2;
                        d85 d85Var6 = i4 != 0 ? null : d85Var3;
                        d85 d85Var7 = i5 != 0 ? null : d85Var2;
                        pd.b(new qzm[0], true, ild.C(-1645978776, new x91(function0, yciVar3, d85Var6, r2nVar, str5, d85Var7, str, str4, 4), oq5Var), oq5Var, 432, 0);
                        yciVar2 = yciVar3;
                        d85Var4 = d85Var6;
                        d85Var5 = d85Var7;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new gd1(str, str2, str3, function0, r2nVar, yciVar2, d85Var4, d85Var5, i, i2);
                        return;
                    }
                    return;
                }
                if (oq5Var.P(i3 & 1, (4793491 & i3) == 4793490)) {
                }
                r = oq5Var.r();
                if (r == null) {
                }
            }
            d85Var3 = d85Var;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if (oq5Var.P(i3 & 1, (4793491 & i3) == 4793490)) {
            }
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        d85Var3 = d85Var;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if (oq5Var.P(i3 & 1, (4793491 & i3) == 4793490)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }
}
