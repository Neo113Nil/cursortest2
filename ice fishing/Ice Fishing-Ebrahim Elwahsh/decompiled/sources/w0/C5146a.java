package w0;

import M7.j;
import com.bumptech.glide.g;
import java.util.Locale;
import kotlin.jvm.internal.h;
import t0.AbstractC5051n;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5146a {

    /* renamed from: a, reason: collision with root package name */
    public final String f41560a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41561b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41562c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41563d;

    /* renamed from: e, reason: collision with root package name */
    public final String f41564e;

    /* renamed from: f, reason: collision with root package name */
    public final int f41565f;

    /* renamed from: g, reason: collision with root package name */
    public final int f41566g;

    public C5146a(int i, int i4, String str, String str2, String str3, boolean z8) {
        this.f41560a = str;
        this.f41561b = str2;
        this.f41562c = z8;
        this.f41563d = i;
        this.f41564e = str3;
        this.f41565f = i4;
        Locale US = Locale.US;
        h.d(US, "US");
        String upperCase = str2.toUpperCase(US);
        h.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f41566g = j.L(upperCase, "INT", false) ? 3 : (j.L(upperCase, "CHAR", false) || j.L(upperCase, "CLOB", false) || j.L(upperCase, "TEXT", false)) ? 2 : j.L(upperCase, "BLOB", false) ? 5 : (j.L(upperCase, "REAL", false) || j.L(upperCase, "FLOA", false) || j.L(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5146a)) {
                return false;
            }
            C5146a c5146a = (C5146a) obj;
            if (this.f41563d != c5146a.f41563d) {
                return false;
            }
            if (!this.f41560a.equals(c5146a.f41560a) || this.f41562c != c5146a.f41562c) {
                return false;
            }
            int i = c5146a.f41565f;
            String str = c5146a.f41564e;
            String str2 = this.f41564e;
            int i4 = this.f41565f;
            if (i4 == 1 && i == 2 && str2 != null && !g.J(str2, str)) {
                return false;
            }
            if (i4 == 2 && i == 1 && str != null && !g.J(str, str2)) {
                return false;
            }
            if (i4 != 0 && i4 == i) {
                if (str2 != null) {
                    if (!g.J(str2, str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.f41566g != c5146a.f41566g) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f41560a.hashCode() * 31) + this.f41566g) * 31) + (this.f41562c ? 1231 : 1237)) * 31) + this.f41563d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f41560a);
        sb.append("', type='");
        sb.append(this.f41561b);
        sb.append("', affinity='");
        sb.append(this.f41566g);
        sb.append("', notNull=");
        sb.append(this.f41562c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f41563d);
        sb.append(", defaultValue='");
        String str = this.f41564e;
        if (str == null) {
            str = "undefined";
        }
        return AbstractC5051n.g(sb, str, "'}");
    }
}
