package defpackage;

/* loaded from: classes.dex */
public final class y95 implements bcs {
    public final long a;

    public y95(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        tme.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.bcs
    public final long a() {
        return this.a;
    }

    @Override // defpackage.bcs
    public final float b() {
        return d85.d(this.a);
    }

    @Override // defpackage.bcs
    public final ai3 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y95) && d85.c(this.a, ((y95) obj).a);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) d85.i(this.a)) + ')';
    }
}
