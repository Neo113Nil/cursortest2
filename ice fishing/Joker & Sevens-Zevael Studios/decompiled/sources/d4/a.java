package d4;

import java.util.Locale;
import pc.j;
import xc.h;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1655a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1656b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1657c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1658d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1659e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1660f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1661g;

    public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
        this.f1655a = str;
        this.f1656b = str2;
        this.f1657c = z10;
        this.f1658d = i10;
        this.f1659e = str3;
        this.f1660f = i11;
        Locale locale = Locale.US;
        j.d(locale, "US");
        String upperCase = str2.toUpperCase(locale);
        j.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f1661g = h.n(upperCase, "INT", false) ? 3 : (h.n(upperCase, "CHAR", false) || h.n(upperCase, "CLOB", false) || h.n(upperCase, "TEXT", false)) ? 2 : h.n(upperCase, "BLOB", false) ? 5 : (h.n(upperCase, "REAL", false) || h.n(upperCase, "FLOA", false) || h.n(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f1658d != aVar.f1658d) {
                return false;
            }
            int i10 = aVar.f1660f;
            String str = aVar.f1659e;
            if (!this.f1655a.equals(aVar.f1655a) || this.f1657c != aVar.f1657c) {
                return false;
            }
            String str2 = this.f1659e;
            int i11 = this.f1660f;
            if (i11 == 1 && i10 == 2 && str2 != null && !i7.b.s(str2, str)) {
                return false;
            }
            if (i11 == 2 && i10 == 1 && str != null && !i7.b.s(str, str2)) {
                return false;
            }
            if (i11 != 0 && i11 == i10) {
                if (str2 != null) {
                    if (!i7.b.s(str2, str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.f1661g != aVar.f1661g) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f1655a.hashCode() * 31) + this.f1661g) * 31) + (this.f1657c ? 1231 : 1237)) * 31) + this.f1658d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f1655a);
        sb.append("', type='");
        sb.append(this.f1656b);
        sb.append("', affinity='");
        sb.append(this.f1661g);
        sb.append("', notNull=");
        sb.append(this.f1657c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f1658d);
        sb.append(", defaultValue='");
        String str = this.f1659e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
