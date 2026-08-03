package r2;

import f1.d0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final long f6016a;

    public c(long j3) {
        this.f6016a = j3;
        if (j3 != 16) {
            return;
        }
        m2.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // r2.o
    public final float a() {
        return f1.q.d(this.f6016a);
    }

    @Override // r2.o
    public final long b() {
        return this.f6016a;
    }

    @Override // r2.o
    public final d0 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && f1.q.c(this.f6016a, ((c) obj).f6016a);
    }

    public final int hashCode() {
        int i10 = f1.q.f2284i;
        return Long.hashCode(this.f6016a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) f1.q.i(this.f6016a)) + ')';
    }
}
