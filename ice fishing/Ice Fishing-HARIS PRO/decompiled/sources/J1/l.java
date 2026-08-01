package J1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class l implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f372a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f373b;

    /* renamed from: c, reason: collision with root package name */
    public final D1.j f374c;

    /* JADX WARN: Multi-variable type inference failed */
    public l(f fVar, C1.l lVar, int i) {
        this.f372a = i;
        switch (i) {
            case 1:
                this.f373b = fVar;
                this.f374c = (D1.j) lVar;
                break;
            default:
                this.f373b = fVar;
                this.f374c = (D1.j) lVar;
                break;
        }
    }

    @Override // J1.f
    public final Iterator iterator() {
        switch (this.f372a) {
            case 0:
                return new c(this);
            case 1:
                return new m(this);
            default:
                return new e(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(j jVar, C1.l lVar) {
        this.f372a = 2;
        this.f373b = jVar;
        this.f374c = (D1.j) lVar;
    }
}
