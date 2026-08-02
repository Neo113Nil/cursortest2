package defpackage;

import com.yandex.passport.api.g;
import com.yandex.plus.pay.api.model.AppDistribution;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class u7m {
    public final uz1 a;
    public final z66 b;
    public final g c;
    public final tf6 d;
    public final xdr e = ydr.a(ves.a);

    public u7m(uz1 uz1Var, z66 z66Var, le7 le7Var, g gVar, tf6 tf6Var) {
        this.a = uz1Var;
        this.b = z66Var;
        this.c = gVar;
        this.d = tf6Var;
    }

    public static Locale d() {
        htr htrVar;
        quk qukVar = htr.f;
        String language = swf.I().getLanguage();
        language.getClass();
        qukVar.getClass();
        int hashCode = language.hashCode();
        if (hashCode == 3424) {
            if (language.equals("kk")) {
                htrVar = htr.j;
            }
            htrVar = htr.g;
        } else if (hashCode != 3651) {
            if (hashCode == 3749 && language.equals("uz")) {
                htrVar = htr.i;
            }
            htrVar = htr.g;
        } else {
            if (language.equals("ru")) {
                htrVar = htr.h;
            }
            htrVar = htr.g;
        }
        return htrVar.c;
    }

    public final ft0 a() {
        ft0 ft0Var;
        ft0.b.getClass();
        ft0[] values = ft0.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ft0Var = null;
                break;
            }
            ft0Var = values[i];
            if (ft0Var.a.equals(AppDistribution.GOOGLE_STORE)) {
                break;
            }
            i++;
        }
        if (ft0Var != null) {
            return ft0Var;
        }
        ft0 ft0Var2 = ft0.DEV;
        su4.s(2, null, "Unknown AppDistribution: GoogleStore", null);
        return ft0Var2;
    }

    public final vdb b() {
        vdb vdbVar;
        vdb.a.getClass();
        vdb[] values = vdb.values();
        int length = values.length;
        int i = 0;
        while (true) {
            vdbVar = null;
            if (i >= length) {
                break;
            }
            vdb vdbVar2 = values[i];
            if (Intrinsics.d(vdbVar2.name(), null)) {
                vdbVar = vdbVar2;
                break;
            }
            i++;
        }
        return vdbVar == null ? vdb.b : vdbVar;
    }

    public final fkn c() {
        ves vesVar;
        ou0.a.getClass();
        xdr xdrVar = ou0.b;
        h0m h0mVar = new h0m(xdrVar, 4);
        ffs ffsVar = (ffs) xdrVar.getValue();
        int i = ffsVar == null ? -1 : r7m.a[ffsVar.ordinal()];
        if (i == -1) {
            vesVar = ves.c;
        } else if (i == 1) {
            vesVar = ves.b;
        } else if (i == 2) {
            vesVar = ves.a;
        } else {
            if (i != 3) {
                b6e.s();
                return null;
            }
            vesVar = ves.c;
        }
        return zsd.F0(h0mVar, this.d, lbq.a, vesVar);
    }
}
