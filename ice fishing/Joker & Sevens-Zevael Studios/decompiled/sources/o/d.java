package o;

import java.util.Iterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: g, reason: collision with root package name */
    public c f5120g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5121h = true;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f5122i;

    public d(f fVar) {
        this.f5122i = fVar;
    }

    @Override // o.e
    public final void a(c cVar) {
        c cVar2 = this.f5120g;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f5119j;
            this.f5120g = cVar3;
            this.f5121h = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f5121h) {
            return this.f5122i.f5123g != null;
        }
        c cVar = this.f5120g;
        return (cVar == null || cVar.f5118i == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f5121h) {
            this.f5121h = false;
            this.f5120g = this.f5122i.f5123g;
        } else {
            c cVar = this.f5120g;
            this.f5120g = cVar != null ? cVar.f5118i : null;
        }
        return this.f5120g;
    }
}
