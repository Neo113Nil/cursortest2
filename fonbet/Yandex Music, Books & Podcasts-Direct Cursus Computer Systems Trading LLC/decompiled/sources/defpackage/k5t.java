package defpackage;

import androidx.compose.ui.layout.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public abstract class k5t {
    public static final float a = 76;

    public static final void a(h5t h5tVar, a6t a6tVar, fvf fvfVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        h5tVar.getClass();
        fvfVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-2088508669);
        int i2 = i | (oq5Var2.f(h5tVar) ? 4 : 2) | (oq5Var2.h(a6tVar) ? 32 : 16) | (oq5Var2.f(fvfVar) ? 256 : 128);
        if (oq5Var2.P(i2 & 1, (i2 & 147) != 146)) {
            ynn i3 = irv.i(oq5Var2);
            aqi O = gld.O(asq.K(h5tVar.a.G().a.d, new h4t(1)), oq5Var2);
            p5t p5tVar = a6tVar.a;
            wn5 C = ild.C(84290710, new lc(a6tVar, O, h5tVar, i3, fvfVar, 20), oq5Var2);
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                zhs zhsVar = new zhs(0, h5tVar, h5t.class, "toggleTrailer", "toggleTrailer()V", 0, 18);
                oq5Var2.k0(zhsVar);
                K = zhsVar;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean z2 = i4 == 4;
            Object K2 = oq5Var2.K();
            if (z2 || K2 == kjnVar) {
                K2 = new zhs(0, h5tVar, h5t.class, "shareTrailer", "shareTrailer()V", 0, 19);
                oq5Var2.k0(K2);
            }
            oq5Var = oq5Var2;
            p1g.q(p5tVar, C, function0, (Function0) ((h9f) K2), null, oq5Var, 48);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kws(h5tVar, a6tVar, fvfVar, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2, types: [int] */
    /* JADX WARN: Type inference failed for: r27v3 */
    public static final void b(List list, l5t l5tVar, h5t h5tVar, ynn ynnVar, int i, fvf fvfVar, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        ?? r27;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(839857682);
        int i3 = i2 | (oq5Var2.h(list) ? 4 : 2) | (oq5Var2.d(l5tVar.ordinal()) ? 32 : 16) | (oq5Var2.f(h5tVar) ? 256 : 128) | (oq5Var2.f(ynnVar) ? 2048 : 1024) | (oq5Var2.d(i) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.f(fvfVar) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX) | 12582912;
        if (oq5Var2.P(i3 & 1, (4793491 & i3) != 4793490)) {
            Integer valueOf = Integer.valueOf(i);
            boolean z = ((57344 & i3) == 16384) | ((458752 & i3) == 131072);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                r27 = 0;
                K = new j50(fvfVar, i, (Continuation) null, 4);
                oq5Var2.k0(K);
            } else {
                r27 = 0;
            }
            int i4 = i3 >> 12;
            gld.w(oq5Var2, valueOf, (Function2) K);
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = szf.g0(Integer.valueOf((int) r27));
                oq5Var2.k0(K2);
            }
            aqi aqiVar = (aqi) K2;
            int K3 = ff7.K(a, oq5Var2);
            boolean d = oq5Var2.d(K3);
            Object K4 = oq5Var2.K();
            if (d || K4 == kjnVar) {
                K4 = new a6c(K3, aqiVar, 2);
                oq5Var2.k0(K4);
            }
            yci b = a.b(yciVar, (pyc) K4);
            boolean h = ((i3 & 112) == 32 ? true : r27) | oq5Var2.h(list) | ((i3 & 896) != 256 ? r27 : true) | ((i3 & 7168) == 2048 ? true : r27);
            Object K5 = oq5Var2.K();
            if (h || K5 == kjnVar) {
                r90 r90Var = new r90(list, l5tVar, h5tVar, ynnVar, aqiVar, 10);
                oq5Var2.k0(r90Var);
                K5 = r90Var;
            }
            oq5Var = oq5Var2;
            weo.f(b, fvfVar, null, null, null, null, false, null, (Function1) K5, oq5Var, i4 & 112, 508);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu0(list, l5tVar, h5tVar, ynnVar, i, fvfVar, yciVar, i2);
        }
    }
}
