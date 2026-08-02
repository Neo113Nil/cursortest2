package defpackage;

/* loaded from: classes.dex */
public class z83 {
    public static a93 a;

    public static void a(long j, long j2, String str) {
        if (j != j2) {
            l(str, Long.valueOf(j), Long.valueOf(j2));
        }
    }

    public static void b(String str, Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj == null || !obj.equals(obj2)) {
            l(str, obj, obj2);
        }
    }

    public static void c(String str, boolean z) {
        h(str, !z);
    }

    public static void d(Object obj, String str) {
        h(str, obj != null);
    }

    public static void e(Long l) {
        if (-1 == l) {
            j("".concat("expected not same"));
        }
    }

    public static void f(Object obj, String str) {
        h(str, obj == null);
    }

    public static void g(String str, Object obj, Object obj2) {
        if (obj != obj2) {
            j((str != null ? str.concat(" ") : "") + "expected same:<" + obj + "> was not:<" + obj2 + ">");
        }
    }

    public static void h(String str, boolean z) {
        if (z) {
            return;
        }
        j(str);
    }

    public static void i() {
        if (a == null) {
            a = new a93();
        }
        a.getClass();
    }

    public static void j(String str) {
        new AssertionError(str);
        if (a == null) {
            a = new a93();
        }
        a.getClass();
    }

    public static void k(String str, Throwable th) {
        new AssertionError(str).initCause(th);
        if (a == null) {
            a = new a93();
        }
        a.getClass();
    }

    public static void l(String str, Object obj, Object obj2) {
        String sb;
        String str2 = "";
        if (str != null && !str.equals("")) {
            str2 = str.concat(" ");
        }
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        if (valueOf.equals(valueOf2)) {
            StringBuilder v = oyr.v(str2, "expected: ");
            v.append(m(obj, valueOf));
            v.append(" but was: ");
            v.append(m(obj2, valueOf2));
            sb = v.toString();
        } else {
            StringBuilder w = oyr.w(str2, "expected:<", valueOf, "> but was:<", valueOf2);
            w.append(">");
            sb = w.toString();
        }
        j(sb);
    }

    public static String m(Object obj, String str) {
        return unr0.o(obj == null ? "null" : obj.getClass().getName(), "<", str, ">");
    }
}
