package r2;

import f1.d0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final f1.n f6014a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6015b;

    public b(f1.n nVar, float f10) {
        this.f6014a = nVar;
        this.f6015b = f10;
    }

    @Override // r2.o
    public final float a() {
        return this.f6015b;
    }

    @Override // r2.o
    public final long b() {
        int i10 = f1.q.f2284i;
        return f1.q.f2283h;
    }

    @Override // r2.o
    public final d0 c() {
        return this.f6014a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return pc.j.a(this.f6014a, bVar.f6014a) && Float.compare(this.f6015b, bVar.f6015b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6015b) + (this.f6014a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f6014a);
        sb.append(", alpha=");
        return a4.d.k(sb, this.f6015b, ')');
    }
}
