package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class s2s {
    public static final float a = 56;

    public static final void a(yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1680542719);
        if ((i & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            CharSequence Y = f8g.Y(R.string.listening_history_day_tab_today, oq5Var);
            ids O = o5g.O(0, 1, oq5Var);
            jx7 jx7Var = (jx7) oq5Var.j(es5.h);
            ArrayList arrayList = new ArrayList(10);
            for (int i2 = 0; i2 < 10; i2++) {
                arrayList.add(Integer.valueOf(i2));
            }
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new csr(15);
                oq5Var.k0(K);
            }
            yciVar2 = yciVar;
            b(arrayList, 0, (Function1) K, ild.C(-1709714963, new fb1(14, O, Y, jx7Var), oq5Var), false, yciVar2, oq5Var, 224688);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar2, i, 12);
        }
    }

    public static final void b(List list, Object obj, Function1 function1, wn5 wn5Var, boolean z, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        wn5 wn5Var2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(800799294);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(list) : oq5Var.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var.f(obj) : oq5Var.h(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            wn5Var2 = wn5Var;
            i2 |= oq5Var.h(wn5Var2) ? 2048 : 1024;
        } else {
            wn5Var2 = wn5Var;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.g(z) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i2) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            float f = 16;
            long a2 = svd.a(oq5Var);
            agr agrVar = eq0.a;
            int i3 = (i2 >> 3) & 8;
            int i4 = i2 << 3;
            int i5 = ((i2 << 12) & 234881024) | (i3 << 6) | (i3 << 3) | 805306374 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4);
            ngg.h(null, list, obj, function1, wn5Var2, d.e(yciVar, a), a2, c3x.D(((dq0) oq5Var.j(agrVar)).d.c, ((dq0) oq5Var.j(agrVar)).c.a), z, a.a(f, 0.0f, 2), f, 40, null, oq5Var, i5, 432, 9216);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dq(list, obj, function1, wn5Var, z, yciVar, i, 15);
        }
    }

    public static final void c(List list, v0s v0sVar, Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        list.getClass();
        v0sVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(690357139);
        int i2 = i | (oq5Var.f(list) ? 4 : 2) | (oq5Var.f(v0sVar) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            b(list, v0sVar, function1, zsd.f, true, yciVar, oq5Var, (i2 & 14) | 27648 | (i2 & 112) | (i2 & 896) | ((i2 << 6) & 458752));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mqr(i, 1, list, v0sVar, function1, yciVar);
        }
    }
}
