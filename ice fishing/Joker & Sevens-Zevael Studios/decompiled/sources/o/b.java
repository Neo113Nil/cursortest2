package o;

import java.util.Iterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: g, reason: collision with root package name */
    public c f5113g;

    /* renamed from: h, reason: collision with root package name */
    public c f5114h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5115i;

    public b(c cVar, c cVar2, int i10) {
        this.f5115i = i10;
        this.f5113g = cVar2;
        this.f5114h = cVar;
    }

    @Override // o.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f5113g == cVar && cVar == this.f5114h) {
            this.f5114h = null;
            this.f5113g = null;
        }
        c cVar4 = this.f5113g;
        if (cVar4 == cVar) {
            switch (this.f5115i) {
                case 0:
                    cVar2 = cVar4.f5119j;
                    break;
                default:
                    cVar2 = cVar4.f5118i;
                    break;
            }
            this.f5113g = cVar2;
        }
        c cVar5 = this.f5114h;
        if (cVar5 == cVar) {
            c cVar6 = this.f5113g;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f5114h = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f5115i) {
            case 0:
                return cVar.f5118i;
            default:
                return cVar.f5119j;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5114h != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f5114h;
        c cVar2 = this.f5113g;
        this.f5114h = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
