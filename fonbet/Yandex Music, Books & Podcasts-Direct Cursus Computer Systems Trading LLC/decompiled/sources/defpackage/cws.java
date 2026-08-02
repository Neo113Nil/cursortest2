package defpackage;

/* loaded from: classes6.dex */
public final class cws {
    public final int a;
    public final int b;
    public final int c;

    public cws(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cws)) {
            return false;
        }
        cws cwsVar = (cws) obj;
        return this.a == cwsVar.a && this.b == cwsVar.b && this.c == cwsVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f1d.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackInfo(width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", bitrate=");
        return vz1.r(sb, this.c, ')');
    }
}
