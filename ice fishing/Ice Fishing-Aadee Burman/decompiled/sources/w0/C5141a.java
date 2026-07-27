package w0;

import Q7.j;
import java.util.Locale;
import kotlin.jvm.internal.h;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5141a {

    /* renamed from: a, reason: collision with root package name */
    public final String f41622a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41623b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41624c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41625d;

    /* renamed from: e, reason: collision with root package name */
    public final String f41626e;

    /* renamed from: f, reason: collision with root package name */
    public final int f41627f;

    /* renamed from: g, reason: collision with root package name */
    public final int f41628g;

    public C5141a(int i, int i6, String str, String str2, String str3, boolean z3) {
        this.f41622a = str;
        this.f41623b = str2;
        this.f41624c = z3;
        this.f41625d = i;
        this.f41626e = str3;
        this.f41627f = i6;
        Locale US = Locale.US;
        h.d(US, "US");
        String upperCase = str2.toUpperCase(US);
        h.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f41628g = j.U(upperCase, "INT", false) ? 3 : (j.U(upperCase, "CHAR", false) || j.U(upperCase, "CLOB", false) || j.U(upperCase, "TEXT", false)) ? 2 : j.U(upperCase, "BLOB", false) ? 5 : (j.U(upperCase, "REAL", false) || j.U(upperCase, "FLOA", false) || j.U(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5141a)) {
                return false;
            }
            C5141a c5141a = (C5141a) obj;
            if (this.f41625d != c5141a.f41625d) {
                return false;
            }
            if (!this.f41622a.equals(c5141a.f41622a) || this.f41624c != c5141a.f41624c) {
                return false;
            }
            int i = c5141a.f41627f;
            String str = c5141a.f41626e;
            String str2 = this.f41626e;
            int i6 = this.f41627f;
            if (i6 == 1 && i == 2 && str2 != null && !O3.b.j(str2, str)) {
                return false;
            }
            if (i6 == 2 && i == 1 && str != null && !O3.b.j(str, str2)) {
                return false;
            }
            if (i6 != 0 && i6 == i) {
                if (str2 != null) {
                    if (!O3.b.j(str2, str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.f41628g != c5141a.f41628g) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f41622a.hashCode() * 31) + this.f41628g) * 31) + (this.f41624c ? 1231 : 1237)) * 31) + this.f41625d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f41622a);
        sb.append("', type='");
        sb.append(this.f41623b);
        sb.append("', affinity='");
        sb.append(this.f41628g);
        sb.append("', notNull=");
        sb.append(this.f41624c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f41625d);
        sb.append(", defaultValue='");
        String str = this.f41626e;
        if (str == null) {
            str = "undefined";
        }
        return u1.h.g(sb, str, "'}");
    }
}
