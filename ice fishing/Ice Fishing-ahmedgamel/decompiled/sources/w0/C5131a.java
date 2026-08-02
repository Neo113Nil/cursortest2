package w0;

import Q7.j;
import com.bumptech.glide.f;
import com.google.android.gms.internal.ads.Wv;
import java.util.Locale;
import kotlin.jvm.internal.h;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5131a {

    /* renamed from: a, reason: collision with root package name */
    public final String f41404a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41405b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41406c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41407d;

    /* renamed from: e, reason: collision with root package name */
    public final String f41408e;

    /* renamed from: f, reason: collision with root package name */
    public final int f41409f;

    /* renamed from: g, reason: collision with root package name */
    public final int f41410g;

    public C5131a(int i, int i4, String str, String str2, String str3, boolean z6) {
        this.f41404a = str;
        this.f41405b = str2;
        this.f41406c = z6;
        this.f41407d = i;
        this.f41408e = str3;
        this.f41409f = i4;
        Locale US = Locale.US;
        h.d(US, "US");
        String upperCase = str2.toUpperCase(US);
        h.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f41410g = j.k0(upperCase, "INT", false) ? 3 : (j.k0(upperCase, "CHAR", false) || j.k0(upperCase, "CLOB", false) || j.k0(upperCase, "TEXT", false)) ? 2 : j.k0(upperCase, "BLOB", false) ? 5 : (j.k0(upperCase, "REAL", false) || j.k0(upperCase, "FLOA", false) || j.k0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5131a)) {
                return false;
            }
            C5131a c5131a = (C5131a) obj;
            if (this.f41407d != c5131a.f41407d) {
                return false;
            }
            if (!this.f41404a.equals(c5131a.f41404a) || this.f41406c != c5131a.f41406c) {
                return false;
            }
            int i = c5131a.f41409f;
            String str = c5131a.f41408e;
            String str2 = this.f41408e;
            int i4 = this.f41409f;
            if (i4 == 1 && i == 2 && str2 != null && !f.g(str2, str)) {
                return false;
            }
            if (i4 == 2 && i == 1 && str != null && !f.g(str, str2)) {
                return false;
            }
            if (i4 != 0 && i4 == i) {
                if (str2 != null) {
                    if (!f.g(str2, str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.f41410g != c5131a.f41410g) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f41404a.hashCode() * 31) + this.f41410g) * 31) + (this.f41406c ? 1231 : 1237)) * 31) + this.f41407d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f41404a);
        sb.append("', type='");
        sb.append(this.f41405b);
        sb.append("', affinity='");
        sb.append(this.f41410g);
        sb.append("', notNull=");
        sb.append(this.f41406c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f41407d);
        sb.append(", defaultValue='");
        String str = this.f41408e;
        if (str == null) {
            str = "undefined";
        }
        return Wv.i(sb, str, "'}");
    }
}
