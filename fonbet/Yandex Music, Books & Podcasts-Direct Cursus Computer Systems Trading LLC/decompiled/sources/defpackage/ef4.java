package defpackage;

import androidx.compose.foundation.layout.d;
import com.yandex.music.core.ui.compose.a;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class ef4 {
    public static final float a = 24;
    public static final float b = 80;
    public static final float c = 40;
    public static final float d = 32;

    public static final void a(df4 df4Var, um0 um0Var, hvq hvqVar, d85 d85Var, yci yciVar, zsq zsqVar, hq5 hq5Var, int i, int i2) {
        int i3;
        d85 d85Var2;
        um0 um0Var2;
        yci yciVar2;
        zsq zsqVar2 = zsqVar;
        df4Var.getClass();
        um0Var.getClass();
        hvqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-412603761);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(df4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.d(um0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.h(hvqVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.f(d85Var) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        int i5 = i2 & 32;
        if (i5 != 0) {
            i4 = 221184 | i3;
        } else if ((196608 & i) == 0) {
            i4 |= (i & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? oq5Var.f(zsqVar2) : oq5Var.h(zsqVar2) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i4) == 74898 && oq5Var.z()) {
            oq5Var.S();
            um0Var2 = um0Var;
            yciVar2 = yciVar;
            d85Var2 = d85Var;
        } else {
            if (i5 != 0) {
                zsqVar2 = null;
            }
            vci vciVar = vci.a;
            yci c2 = d.c(vciVar, 1.0f);
            boolean h = ((458752 & i4) == 131072 || ((i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && oq5Var.h(zsqVar2))) | oq5Var.h(hvqVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new ko1(zsqVar2, hvqVar, 3);
                oq5Var.k0(K);
            }
            yci b2 = a.b(c2, null, 0L, 0.0f, null, (Function2) K, 15);
            ta5 a2 = sa5.a(df4Var.e.a, b2c.o, oq5Var, 48);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            pas pasVar = df4Var.a;
            Long l2 = pasVar.a;
            wyf.n(new pas(l2, pasVar.b, pasVar.c, l2 == null ? pasVar.d : null, l2 == null ? pasVar.e : null, pasVar.f, pasVar.g, pasVar.h, pasVar.i), um0Var, hvqVar.a(), d85Var, d.d(vciVar, 1.0f), df4Var.b == null ? 0 : 1, oq5Var, (i4 & 112) | 24576 | (i4 & 7168), 0);
            d85Var2 = d85Var;
            oq5Var = oq5Var;
            um0Var2 = um0Var;
            bg3.a(null, null, false, ild.C(445454403, new xk(17, df4Var, um0Var2, d85Var2), oq5Var), oq5Var, 3072, 7);
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        zsq zsqVar3 = zsqVar2;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fd1((Object) df4Var, (Object) um0Var2, (Object) hvqVar, d85Var2, yciVar2, zsqVar3, i, i2, 4);
        }
    }
}
