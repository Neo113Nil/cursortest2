package defpackage;

import androidx.compose.foundation.layout.d;
import com.yandex.music.core.ui.compose.a;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public abstract class ndr {
    public static final List a = u75.h(Float.valueOf(0.9f), Float.valueOf(0.7f), Float.valueOf(0.5f), Float.valueOf(0.3f), Float.valueOf(0.2f));

    public static final void a(pgr pgrVar, hvq hvqVar, um0 um0Var, d85 d85Var, yci yciVar, zsq zsqVar, hq5 hq5Var, int i, int i2) {
        int i3;
        d85 d85Var2;
        ges gesVar;
        oq5 oq5Var;
        zsq zsqVar2;
        yci yciVar2;
        zsq zsqVar3 = zsqVar;
        hvqVar.getClass();
        um0Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(594178639);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? oq5Var2.f(pgrVar) : oq5Var2.h(pgrVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.h(hvqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.d(um0Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            d85Var2 = d85Var;
            i3 |= oq5Var2.f(d85Var2) ? 2048 : 1024;
        } else {
            d85Var2 = d85Var;
        }
        int i4 = i3 | 24576;
        int i5 = i2 & 32;
        if (i5 != 0) {
            i4 = 221184 | i3;
        } else if ((196608 & i) == 0) {
            i4 |= (i & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? oq5Var2.f(zsqVar3) : oq5Var2.h(zsqVar3) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i4) == 74898 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            zsqVar2 = zsqVar3;
            oq5Var = oq5Var2;
        } else {
            if (i5 != 0) {
                zsqVar3 = null;
            }
            zsq zsqVar4 = zsqVar3;
            Object K = oq5Var2.K();
            boolean z = true;
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(Boolean.valueOf(pgrVar.c.size() >= 5));
                oq5Var2.k0(K);
            }
            aqi aqiVar = (aqi) K;
            if (((Boolean) aqiVar.getValue()).booleanValue()) {
                oq5Var2.Z(1615975171);
                gesVar = nu0.d();
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(1616028305);
                ges gesVar2 = new ges(0L, v7g.z(58), tqc.p, null, null, wqc.a, null, 0L, null, 0, v7g.z(58), null, new h6g(17, e6g.d), 0, 15597529);
                oq5Var2.p(false);
                gesVar = gesVar2;
            }
            vci vciVar = vci.a;
            yci c = d.c(vciVar, 1.0f);
            if ((458752 & i4) != 131072 && ((i4 & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 || !oq5Var2.h(zsqVar4))) {
                z = false;
            }
            boolean h = z | oq5Var2.h(hvqVar);
            Object K2 = oq5Var2.K();
            if (h || K2 == kjnVar) {
                K2 = new ko1(zsqVar4, hvqVar, 10);
                oq5Var2.k0(K2);
            }
            yci b = a.b(c, null, 0L, 0.0f, null, (Function2) K2, 15);
            iz2 iz2Var = b2c.f;
            wn5 C = ild.C(382720697, new kt4(pgrVar, gesVar, um0Var, d85Var2, aqiVar, hvqVar, 5), oq5Var2);
            oq5Var = oq5Var2;
            bg3.a(b, iz2Var, false, C, oq5Var, 3120, 4);
            zsqVar2 = zsqVar4;
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fd1((Object) pgrVar, (Object) hvqVar, (Object) um0Var, d85Var, yciVar2, zsqVar2, i, i2, 14);
        }
    }

    public static final int b(String str, ges gesVar, int i, hq5 hq5Var) {
        str.getClass();
        ids O = o5g.O(0, 1, hq5Var);
        boolean f = ((oq5) hq5Var).f(str);
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (f || K == gq5.a) {
            if (i < 0) {
                ume.a("width must be >= 0");
            }
            K = ids.a(O, str, gesVar, 0, false, 0, ia6.h(i, i, 0, Integer.MAX_VALUE), 988);
            oq5Var.k0(K);
        }
        return ((cds) K).b.f;
    }

    public static final ges c(ogr ogrVar, boolean z, hq5 hq5Var) {
        if (z) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(-846915305);
            ges d = nu0.d();
            oq5Var.p(false);
            return d;
        }
        if (ogrVar.a != null) {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(-846913417);
            ges d2 = nu0.d();
            oq5Var2.p(false);
            return d2;
        }
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.Z(-846911977);
        ges e = nu0.e();
        oq5Var3.p(false);
        return e;
    }
}
