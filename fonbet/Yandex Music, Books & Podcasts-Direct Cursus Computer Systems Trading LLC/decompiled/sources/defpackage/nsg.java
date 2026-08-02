package defpackage;

/* loaded from: classes5.dex */
public interface nsg {
    void a(String str, uxe uxeVar);

    boolean b();

    boolean c();

    void d(String str);

    boolean e();

    boolean f();

    void g(String str, Integer num, Object obj);

    String getName();

    void h(String str, Exception exc);

    void i(Object obj, String str);

    boolean j();

    void k(String str);

    default boolean l(int i) {
        char c;
        if (i == 1) {
            c = '(';
        } else if (i == 2) {
            c = 30;
        } else if (i == 3) {
            c = 20;
        } else if (i == 4) {
            c = '\n';
        } else {
            if (i != 5) {
                throw null;
            }
            c = 0;
        }
        if (c == 0) {
            return f();
        }
        if (c == '\n') {
            return c();
        }
        if (c == 20) {
            return e();
        }
        if (c == 30) {
            return b();
        }
        if (c == '(') {
            return j();
        }
        b6e.v(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TRACE" : "DEBUG" : "INFO" : "WARN" : "ERROR", "] not recognized.", "Level [");
        return false;
    }
}
