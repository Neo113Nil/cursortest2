package defpackage;

/* loaded from: classes4.dex */
public final class hfs {
    public final long a;
    public final long b;

    public hfs(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfs)) {
            return false;
        }
        hfs hfsVar = (hfs) obj;
        return d85.c(this.a, hfsVar.a) && d85.c(this.b, hfsVar.b);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.s("ThemedColor(darkThemeColor=", d85.i(this.a), ", lightThemeColor=", d85.i(this.b), ")");
    }
}
