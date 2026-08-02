package i8;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f38251k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f38252l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f38253m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f38254n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f38255a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38256b;

    /* renamed from: c, reason: collision with root package name */
    public final long f38257c;

    /* renamed from: d, reason: collision with root package name */
    public final String f38258d;

    /* renamed from: e, reason: collision with root package name */
    public final String f38259e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f38260f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f38261g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f38262h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final String f38263j;

    public j(String str, String str2, long j6, String str3, String str4, boolean z6, boolean z9, boolean z10, boolean z11, String str5) {
        this.f38255a = str;
        this.f38256b = str2;
        this.f38257c = j6;
        this.f38258d = str3;
        this.f38259e = str4;
        this.f38260f = z6;
        this.f38261g = z9;
        this.f38262h = z10;
        this.i = z11;
        this.f38263j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.h.a(jVar.f38255a, this.f38255a) && kotlin.jvm.internal.h.a(jVar.f38256b, this.f38256b) && jVar.f38257c == this.f38257c && kotlin.jvm.internal.h.a(jVar.f38258d, this.f38258d) && kotlin.jvm.internal.h.a(jVar.f38259e, this.f38259e) && jVar.f38260f == this.f38260f && jVar.f38261g == this.f38261g && jVar.f38262h == this.f38262h && jVar.i == this.i && kotlin.jvm.internal.h.a(jVar.f38263j, this.f38263j);
    }

    public final int hashCode() {
        int hashCode = (Boolean.hashCode(this.i) + ((Boolean.hashCode(this.f38262h) + ((Boolean.hashCode(this.f38261g) + ((Boolean.hashCode(this.f38260f) + AbstractC5128c.a(AbstractC5128c.a((Long.hashCode(this.f38257c) + AbstractC5128c.a(AbstractC5128c.a(527, 31, this.f38255a), 31, this.f38256b)) * 31, 31, this.f38258d), 31, this.f38259e)) * 31)) * 31)) * 31)) * 31;
        String str = this.f38263j;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f38255a);
        sb.append('=');
        sb.append(this.f38256b);
        if (this.f38262h) {
            long j6 = this.f38257c;
            if (j6 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) n8.d.f39683a.get()).format(new Date(j6));
                kotlin.jvm.internal.h.d(format, "format(...)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.f38258d);
        }
        sb.append("; path=");
        sb.append(this.f38259e);
        if (this.f38260f) {
            sb.append("; secure");
        }
        if (this.f38261g) {
            sb.append("; httponly");
        }
        String str = this.f38263j;
        if (str != null) {
            sb.append("; samesite=");
            sb.append(str);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }
}
