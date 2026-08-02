package defpackage;

/* loaded from: classes3.dex */
public final class efj {
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public efj(String str, String str2, String str3, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efj)) {
            return false;
        }
        efj efjVar = (efj) obj;
        return this.a.equals(efjVar.a) && this.b.equals(efjVar.b) && this.c.equals(efjVar.c) && this.d == efjVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder m = f1d.m("NotificationData(chatId=", this.a, ", displayName=", this.b, ", message=");
        m.append(this.c);
        m.append(", timestamp=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
