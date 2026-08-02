package defpackage;

/* loaded from: classes.dex */
public final class f3r extends ai3 {
    public final long a;

    public f3r(long j) {
        this.a = j;
    }

    @Override // defpackage.ai3
    public final void a(float f, long j, gh0 gh0Var) {
        gh0Var.c(1.0f);
        long j2 = this.a;
        if (f != 1.0f) {
            j2 = d85.b(j2, d85.d(j2) * f, 0.0f, 0.0f, 0.0f, 14);
        }
        gh0Var.e(j2);
        if (gh0Var.c != null) {
            gh0Var.h(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f3r) {
            return d85.c(this.a, ((f3r) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) d85.i(this.a)) + ')';
    }
}
