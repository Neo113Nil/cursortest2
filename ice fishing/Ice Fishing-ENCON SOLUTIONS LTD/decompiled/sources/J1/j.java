package J1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f876j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f877k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f878l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f879m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f880a;

    /* renamed from: b, reason: collision with root package name */
    public final String f881b;

    /* renamed from: c, reason: collision with root package name */
    public final long f882c;

    /* renamed from: d, reason: collision with root package name */
    public final String f883d;

    /* renamed from: e, reason: collision with root package name */
    public final String f884e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f885f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f886g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f887h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f888i;

    public j(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f880a = str;
        this.f881b = str2;
        this.f882c = j2;
        this.f883d = str3;
        this.f884e = str4;
        this.f885f = z2;
        this.f886g = z3;
        this.f887h = z4;
        this.f888i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (kotlin.jvm.internal.i.a(jVar.f880a, this.f880a) && kotlin.jvm.internal.i.a(jVar.f881b, this.f881b) && jVar.f882c == this.f882c && kotlin.jvm.internal.i.a(jVar.f883d, this.f883d) && kotlin.jvm.internal.i.a(jVar.f884e, this.f884e) && jVar.f885f == this.f885f && jVar.f886g == this.f886g && jVar.f887h == this.f887h && jVar.f888i == this.f888i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f888i) + ((Boolean.hashCode(this.f887h) + ((Boolean.hashCode(this.f886g) + ((Boolean.hashCode(this.f885f) + C1.a.e(this.f884e, C1.a.e(this.f883d, (Long.hashCode(this.f882c) + C1.a.e(this.f881b, C1.a.e(this.f880a, 527, 31), 31)) * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f880a);
        sb.append('=');
        sb.append(this.f881b);
        if (this.f887h) {
            long j2 = this.f882c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) O1.d.f1237a.get()).format(new Date(j2));
                kotlin.jvm.internal.i.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.f888i) {
            sb.append("; domain=");
            sb.append(this.f883d);
        }
        sb.append("; path=");
        sb.append(this.f884e);
        if (this.f885f) {
            sb.append("; secure");
        }
        if (this.f886g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString()");
        return sb2;
    }
}
