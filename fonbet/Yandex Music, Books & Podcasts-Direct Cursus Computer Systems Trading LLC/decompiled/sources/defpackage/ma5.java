package defpackage;

/* loaded from: classes.dex */
public final class ma5 {
    public final x6k a;
    public final x6k b;
    public final x6k c;
    public final x6k d;
    public final x6k e;
    public final x6k f;
    public final x6k g;
    public final x6k h;
    public final x6k i;
    public final x6k j;
    public final x6k k;
    public final x6k l;
    public final x6k m;

    public ma5(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        d85 d85Var = new d85(j);
        ehv ehvVar = ehv.h;
        this.a = new x6k(d85Var, ehvVar);
        this.b = new x6k(new d85(j2), ehvVar);
        this.c = new x6k(new d85(j3), ehvVar);
        this.d = new x6k(new d85(j4), ehvVar);
        this.e = new x6k(new d85(j5), ehvVar);
        this.f = new x6k(new d85(j6), ehvVar);
        this.g = new x6k(new d85(j7), ehvVar);
        this.h = new x6k(new d85(j8), ehvVar);
        this.i = new x6k(new d85(j9), ehvVar);
        this.j = new x6k(new d85(j10), ehvVar);
        this.k = new x6k(new d85(j11), ehvVar);
        this.l = new x6k(new d85(j12), ehvVar);
        this.m = new x6k(Boolean.valueOf(z), ehvVar);
    }

    public final long a() {
        return ((d85) this.e.getValue()).a;
    }

    public final long b() {
        return ((d85) this.g.getValue()).a;
    }

    public final long c() {
        return ((d85) this.k.getValue()).a;
    }

    public final long d() {
        return ((d85) this.a.getValue()).a;
    }

    public final long e() {
        return ((d85) this.d.getValue()).a;
    }

    public final long f() {
        return ((d85) this.f.getValue()).a;
    }

    public final boolean g() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Colors(primary=");
        sb.append((Object) d85.i(d()));
        sb.append(", primaryVariant=");
        dfi.q(((d85) this.b.getValue()).a, ", secondary=", sb);
        sb.append((Object) d85.i(((d85) this.c.getValue()).a));
        sb.append(", secondaryVariant=");
        sb.append((Object) d85.i(e()));
        sb.append(", background=");
        sb.append((Object) d85.i(a()));
        sb.append(", surface=");
        sb.append((Object) d85.i(f()));
        sb.append(", error=");
        sb.append((Object) d85.i(b()));
        sb.append(", onPrimary=");
        dfi.q(((d85) this.h.getValue()).a, ", onSecondary=", sb);
        dfi.q(((d85) this.i.getValue()).a, ", onBackground=", sb);
        sb.append((Object) d85.i(((d85) this.j.getValue()).a));
        sb.append(", onSurface=");
        sb.append((Object) d85.i(c()));
        sb.append(", onError=");
        sb.append((Object) d85.i(((d85) this.l.getValue()).a));
        sb.append(", isLight=");
        sb.append(g());
        sb.append(')');
        return sb.toString();
    }
}
