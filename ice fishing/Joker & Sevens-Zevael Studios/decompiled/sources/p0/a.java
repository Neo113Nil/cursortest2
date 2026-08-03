package p0;

import bc.e;
import java.util.List;
import q0.c;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: g, reason: collision with root package name */
    public final c f5405g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5406h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5407i;

    public a(c cVar, int i10, int i11) {
        this.f5405g = cVar;
        this.f5406h = i10;
        a.a.o(i10, i11, cVar.a());
        this.f5407i = i11 - i10;
    }

    @Override // bc.a
    public final int a() {
        return this.f5407i;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        a.a.l(i10, this.f5407i);
        return this.f5405g.get(this.f5406h + i10);
    }

    @Override // bc.e, java.util.List
    public final List subList(int i10, int i11) {
        a.a.o(i10, i11, this.f5407i);
        int i12 = this.f5406h;
        return new a(this.f5405g, i10 + i12, i12 + i11);
    }
}
