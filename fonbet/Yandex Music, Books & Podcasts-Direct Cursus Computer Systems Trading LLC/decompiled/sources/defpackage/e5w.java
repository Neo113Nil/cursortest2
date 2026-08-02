package defpackage;

import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public final class e5w {
    public static final e5w f;
    public static final e5w g;
    public final String a;
    public final String b;
    public final Date c;
    public final Date d;
    public final TimeZone e;

    static {
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.getClass();
        f = new e5w("00:00", "06:00", rzf.L("00:00", timeZone), rzf.L("06:00", timeZone), timeZone);
        TimeZone timeZone2 = TimeZone.getDefault();
        timeZone2.getClass();
        g = new e5w("00:00", "23:59", rzf.L("00:00", timeZone2), rzf.L("23:59", timeZone2), timeZone2);
    }

    public e5w(String str, String str2, Date date, Date date2, TimeZone timeZone) {
        this.a = str;
        this.b = str2;
        this.c = date;
        this.d = date2;
        this.e = timeZone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5w)) {
            return false;
        }
        e5w e5wVar = (e5w) obj;
        return this.a.equals(e5wVar.a) && this.b.equals(e5wVar.b) && this.c.equals(e5wVar.c) && this.d.equals(e5wVar.d) && this.e.equals(e5wVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("WorkerTimeInterval(startTime=", this.a, ", endTime=", this.b, ", startTimeDate=");
        m.append(this.c);
        m.append(", endTimeDate=");
        m.append(this.d);
        m.append(", timeZone=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}
