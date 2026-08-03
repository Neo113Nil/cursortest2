package s;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends AbstractSet {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f6218g;

    public a(f fVar) {
        this.f6218g = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new d(this.f6218g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f6218g.f6325i;
    }
}
