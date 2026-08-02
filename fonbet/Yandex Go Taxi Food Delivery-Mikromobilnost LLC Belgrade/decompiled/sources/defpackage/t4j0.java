package defpackage;

/* loaded from: classes9.dex */
public class t4j0 {
    public kwu a;
    public m5j0 d;
    public dai0 e = kxn.d;
    public String b = "GET";
    public keu c = new keu();

    public final void a(String str, String str2) {
        this.c.a(str, str2);
    }

    public final void b(za7 za7Var) {
        String za7Var2 = za7Var.toString();
        int length = za7Var2.length();
        keu keuVar = this.c;
        if (length == 0) {
            keuVar.f("Cache-Control");
        } else {
            keuVar.g("Cache-Control", za7Var2);
        }
    }

    public final void c() {
        e("GET", null);
    }

    public final void d(String str, String str2) {
        this.c.g(str, str2);
    }

    public final void e(String str, m5j0 m5j0Var) {
        if (str.length() <= 0) {
            ny61.g("method.isEmpty() == true");
            return;
        }
        if (m5j0Var == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                w511.f(oyr.p("method ", str, " must have a request body."));
                return;
            }
        } else if (!dai0.D(str)) {
            w511.f(oyr.p("method ", str, " must not have a request body."));
            return;
        }
        this.b = str;
        this.d = m5j0Var;
    }

    public final void f(String str) {
        this.c.f(str);
    }

    public final void g(Class cls, Object obj) {
        this.e = this.e.E(qoi0.a(cls), obj);
    }

    public final void h(String str) {
        if (cvu0.x(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (cvu0.x(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        jwu jwuVar = new jwu();
        jwuVar.i(null, str);
        this.a = jwuVar.e();
    }
}
