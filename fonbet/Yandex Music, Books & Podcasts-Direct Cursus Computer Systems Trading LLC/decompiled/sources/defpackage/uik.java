package defpackage;

/* loaded from: classes4.dex */
public final class uik {
    public final long a;

    public uik(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uik) || !d85.c(this.a, ((uik) obj).a)) {
            return false;
        }
        Object obj2 = j66.d;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return j66.d.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PaywallScreenCustomization(bgColor=" + d85.i(this.a) + ", progressBox=" + j66.d + ")";
    }
}
