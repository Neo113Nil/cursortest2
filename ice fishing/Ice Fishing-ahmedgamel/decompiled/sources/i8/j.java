package i8;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f38132k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f38133l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f38134m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f38135n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f38136a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38137b;

    /* renamed from: c, reason: collision with root package name */
    public final long f38138c;

    /* renamed from: d, reason: collision with root package name */
    public final String f38139d;

    /* renamed from: e, reason: collision with root package name */
    public final String f38140e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f38141f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f38142g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f38143h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final String f38144j;

    public j(String str, String str2, long j6, String str3, String str4, boolean z3, boolean z6, boolean z9, boolean z10, String str5) {
        this.f38136a = str;
        this.f38137b = str2;
        this.f38138c = j6;
        this.f38139d = str3;
        this.f38140e = str4;
        this.f38141f = z3;
        this.f38142g = z6;
        this.f38143h = z9;
        this.i = z10;
        this.f38144j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.h.a(jVar.f38136a, this.f38136a) && kotlin.jvm.internal.h.a(jVar.f38137b, this.f38137b) && jVar.f38138c == this.f38138c && kotlin.jvm.internal.h.a(jVar.f38139d, this.f38139d) && kotlin.jvm.internal.h.a(jVar.f38140e, this.f38140e) && jVar.f38141f == this.f38141f && jVar.f38142g == this.f38142g && jVar.f38143h == this.f38143h && jVar.i == this.i && kotlin.jvm.internal.h.a(jVar.f38144j, this.f38144j);
    }

    public final int hashCode() {
        int hashCode = (Boolean.hashCode(this.i) + ((Boolean.hashCode(this.f38143h) + ((Boolean.hashCode(this.f38142g) + ((Boolean.hashCode(this.f38141f) + u1.h.k(u1.h.k((Long.hashCode(this.f38138c) + u1.h.k(u1.h.k(527, 31, this.f38136a), 31, this.f38137b)) * 31, 31, this.f38139d), 31, this.f38140e)) * 31)) * 31)) * 31)) * 31;
        String str = this.f38144j;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f38136a);
        sb.append('=');
        sb.append(this.f38137b);
        if (this.f38143h) {
            long j6 = this.f38138c;
            if (j6 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) n8.d.f39516a.get()).format(new Date(j6));
                kotlin.jvm.internal.h.d(format, "format(...)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.f38139d);
        }
        sb.append("; path=");
        sb.append(this.f38140e);
        if (this.f38141f) {
            sb.append("; secure");
        }
        if (this.f38142g) {
            sb.append("; httponly");
        }
        String str = this.f38144j;
        if (str != null) {
            sb.append("; samesite=");
            sb.append(str);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }
}
