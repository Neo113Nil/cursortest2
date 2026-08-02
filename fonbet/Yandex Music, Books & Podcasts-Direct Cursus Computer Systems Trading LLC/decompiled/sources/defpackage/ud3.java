package defpackage;

/* loaded from: classes4.dex */
public final class ud3 {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;

    public ud3(String str, long j, long j2, boolean z) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud3)) {
            return false;
        }
        ud3 ud3Var = (ud3) obj;
        return this.a.equals(ud3Var.a) && d85.c(this.b, ud3Var.b) && d85.c(this.c, ud3Var.c) && this.d == ud3Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = d85.o;
        met metVar = net.b;
        return Boolean.hashCode(this.d) + tlm.c(this.c, tlm.c(this.b, hashCode, 31), 31);
    }

    public final String toString() {
        String i = d85.i(this.b);
        String i2 = d85.i(this.c);
        StringBuilder m = f1d.m("LikeButtonState(title=", this.a, ", buttonColor=", i, ", textColor=");
        m.append(i2);
        m.append(", isEnabled=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
