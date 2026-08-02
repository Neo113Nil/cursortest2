package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class lqd {
    public static final float a = 320;

    public static final void a(ArrayList arrayList, yci yciVar, int i, o0k o0kVar, mqd mqdVar, wn5 wn5Var, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(862479327);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(arrayList) : oq5Var.h(arrayList) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(o0kVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.f(mqdVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 196608) == 0) {
            i3 |= oq5Var.h(wn5Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            oq5Var.U();
            if ((i2 & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            b(arrayList, yciVar, i, o0kVar, mqdVar, ild.C(863370639, new lo1(wn5Var, 2), oq5Var), oq5Var, 196608 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cj(arrayList, yciVar, i, o0kVar, mqdVar, wn5Var, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(List list, yci yciVar, int i, o0k o0kVar, mqd mqdVar, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        int i4;
        int i5;
        o0k o0kVar2;
        mqd mqdVar2;
        wn5 wn5Var2;
        o0k o0kVar3;
        xmn r;
        list.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1246553922);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? oq5Var.f(list) : oq5Var.h(list) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 = i;
            i4 |= oq5Var.d(i5) ? 256 : 128;
        } else {
            i5 = i;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            o0kVar2 = o0kVar;
            i4 |= oq5Var.f(o0kVar2) ? 2048 : 1024;
            if ((i2 & 24576) != 0) {
                mqdVar2 = mqdVar;
                i4 |= oq5Var.f(mqdVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
            } else {
                mqdVar2 = mqdVar;
            }
            if ((196608 & i2) != 0) {
                wn5Var2 = wn5Var;
                i4 |= oq5Var.h(wn5Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            } else {
                wn5Var2 = wn5Var;
            }
            if (oq5Var.P(i4 & 1, (74899 & i4) == 74898)) {
                oq5Var.S();
                o0kVar3 = o0kVar2;
            } else {
                oq5Var.U();
                if ((i2 & 1) != 0 && !oq5Var.y()) {
                    oq5Var.S();
                } else if (i6 != 0) {
                    o0kVar2 = a.a(16, 0.0f, 2);
                }
                o0k o0kVar4 = o0kVar2;
                oq5Var.q();
                bg3.a(d.d(yciVar, 1.0f), null, false, ild.C(1994565544, new kqd(mqdVar2, o0kVar4, i5, list, wn5Var2), oq5Var), oq5Var, 3072, 6);
                o0kVar3 = o0kVar4;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new ctb(list, yciVar, i, o0kVar3, mqdVar, wn5Var, i2, i3);
                return;
            }
            return;
        }
        o0kVar2 = o0kVar;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        if (oq5Var.P(i4 & 1, (74899 & i4) == 74898)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }
}
