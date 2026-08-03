package l1;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f0 implements Iterator, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4000g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final Iterator f4001h;

    public f0(u0.h hVar) {
        r0.l[] lVarArr = new r0.l[8];
        for (int i10 = 0; i10 < 8; i10++) {
            lVarArr[i10] = new r0.n(this);
        }
        this.f4001h = new r0.e(hVar, lVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4000g) {
            case 0:
                return this.f4001h.hasNext();
            default:
                return ((r0.e) this.f4001h).f5906i;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4000g) {
            case 0:
                return (i0) this.f4001h.next();
            default:
                return (Map.Entry) ((r0.e) this.f4001h).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4000g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((r0.e) this.f4001h).remove();
                return;
        }
    }

    public f0(g0 g0Var) {
        this.f4001h = g0Var.f4014p.iterator();
    }
}
