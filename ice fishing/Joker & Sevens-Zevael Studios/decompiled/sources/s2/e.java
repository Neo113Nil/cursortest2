package s2;

import bc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: g, reason: collision with root package name */
    public final float f6384g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6385h;

    /* renamed from: i, reason: collision with root package name */
    public final t2.a f6386i;

    public e(float f10, float f11, t2.a aVar) {
        this.f6384g = f10;
        this.f6385h = f11;
        this.f6386i = aVar;
    }

    @Override // s2.c
    public final float B(long j3) {
        if (o.a(n.b(j3), 4294967296L)) {
            return this.f6386i.b(n.c(j3));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // s2.c
    public final float c() {
        return this.f6384g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f6384g, eVar.f6384g) == 0 && Float.compare(this.f6385h, eVar.f6385h) == 0 && pc.j.a(this.f6386i, eVar.f6386i);
    }

    public final int hashCode() {
        return this.f6386i.hashCode() + a4.d.b(this.f6385h, Float.hashCode(this.f6384g) * 31, 31);
    }

    @Override // s2.c
    public final float m() {
        return this.f6385h;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f6384g + ", fontScale=" + this.f6385h + ", converter=" + this.f6386i + ')';
    }

    @Override // s2.c
    public final long v(float f10) {
        return a0.E(4294967296L, this.f6386i.a(f10));
    }
}
