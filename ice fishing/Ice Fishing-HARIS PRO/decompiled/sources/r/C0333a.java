package r;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333a extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0338f f4298a;

    public C0333a(C0338f c0338f) {
        this.f4298a = c0338f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0336d(this.f4298a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4298a.f4322c;
    }
}
