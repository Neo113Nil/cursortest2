package d0;

import f1.a0;
import f1.b0;
import f1.g0;
import f1.z;
import pc.j;
import s2.l;
import x4.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f1559a;

    /* renamed from: b, reason: collision with root package name */
    public final a f1560b;

    /* renamed from: c, reason: collision with root package name */
    public final a f1561c;

    /* renamed from: d, reason: collision with root package name */
    public final a f1562d;

    public d(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f1559a = aVar;
        this.f1560b = aVar2;
        this.f1561c = aVar3;
        this.f1562d = aVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [d0.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [d0.a] */
    public static d b(d dVar, b bVar, b bVar2, b bVar3, int i10) {
        b bVar4 = bVar;
        if ((i10 & 1) != 0) {
            bVar4 = dVar.f1559a;
        }
        a aVar = dVar.f1560b;
        b bVar5 = bVar2;
        if ((i10 & 4) != 0) {
            bVar5 = dVar.f1561c;
        }
        dVar.getClass();
        return new d(bVar4, aVar, bVar5, bVar3);
    }

    @Override // f1.g0
    public final b0 a(long j3, l lVar, s2.c cVar) {
        float a6 = this.f1559a.a(j3, cVar);
        float a8 = this.f1560b.a(j3, cVar);
        float a10 = this.f1561c.a(j3, cVar);
        float a11 = this.f1562d.a(j3, cVar);
        float c3 = e1.e.c(j3);
        float f10 = a6 + a11;
        if (f10 > c3) {
            float f11 = c3 / f10;
            a6 *= f11;
            a11 *= f11;
        }
        float f12 = a8 + a10;
        if (f12 > c3) {
            float f13 = c3 / f12;
            a8 *= f13;
            a10 *= f13;
        }
        if (a6 < 0.0f || a8 < 0.0f || a10 < 0.0f || a11 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a6 + ", topEnd = " + a8 + ", bottomEnd = " + a10 + ", bottomStart = " + a11 + ")!").toString());
        }
        if (a6 + a8 + a10 + a11 == 0.0f) {
            return new z(f.r(0L, j3));
        }
        e1.c r5 = f.r(0L, j3);
        l lVar2 = l.f6396g;
        long a12 = i7.b.a(lVar == lVar2 ? a6 : a8);
        if (lVar == lVar2) {
            a6 = a8;
        }
        long a13 = i7.b.a(a6);
        long a14 = i7.b.a(lVar == lVar2 ? a10 : a11);
        if (lVar != lVar2) {
            a11 = a10;
        }
        return new a0(new e1.d(r5.f1931a, r5.f1932b, r5.f1933c, r5.f1934d, a12, a13, a14, i7.b.a(a11)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return j.a(this.f1559a, dVar.f1559a) && j.a(this.f1560b, dVar.f1560b) && j.a(this.f1561c, dVar.f1561c) && j.a(this.f1562d, dVar.f1562d);
    }

    public final int hashCode() {
        return this.f1562d.hashCode() + ((this.f1561c.hashCode() + ((this.f1560b.hashCode() + (this.f1559a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f1559a + ", topEnd = " + this.f1560b + ", bottomEnd = " + this.f1561c + ", bottomStart = " + this.f1562d + ')';
    }
}
