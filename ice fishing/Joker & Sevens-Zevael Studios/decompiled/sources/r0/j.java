package r0;

import java.util.Iterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends bc.a {

    /* renamed from: g, reason: collision with root package name */
    public final c f5915g;

    public j(c cVar) {
        this.f5915g = cVar;
    }

    @Override // bc.a
    public final int a() {
        c cVar = this.f5915g;
        cVar.getClass();
        return cVar.f5903h;
    }

    @Override // bc.a, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5915g.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        k kVar = this.f5915g.f5902g;
        l[] lVarArr = new l[8];
        for (int i10 = 0; i10 < 8; i10++) {
            lVarArr[i10] = new m(2);
        }
        return new i(kVar, lVarArr);
    }
}
