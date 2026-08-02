package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class rfo {

    public static abstract class a {
        public final void a(String str, String str2) {
            ((HashMap) b()).put(str, str2);
        }

        public abstract Map b();
    }

    public final String a(String str) {
        String str2 = (String) b().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map b();

    public abstract Integer c();

    public abstract qyn d();

    public abstract long e();

    public abstract byte[] f();

    public abstract byte[] g();

    public final int h(String str) {
        String str2 = (String) b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract Integer i();

    public abstract String j();

    public abstract String k();

    public abstract long l();

    public final h64 m() {
        h64 h64Var = new h64();
        String k = k();
        if (k == null) {
            ny61.t("Null transportName");
            return null;
        }
        h64Var.a = k;
        h64Var.b = c();
        h64Var.g = i();
        h64Var.h = j();
        h64Var.i = f();
        h64Var.j = g();
        qyn d = d();
        if (d == null) {
            ny61.t("Null encodedPayload");
            return null;
        }
        h64Var.c = d;
        h64Var.d = Long.valueOf(e());
        h64Var.e = Long.valueOf(l());
        h64Var.f = new HashMap(b());
        return h64Var;
    }
}
