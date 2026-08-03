package r0;

import java.util.Iterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class l implements Iterator, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public Object[] f5921g = k.f5916e.f5920d;

    /* renamed from: h, reason: collision with root package name */
    public int f5922h;

    /* renamed from: i, reason: collision with root package name */
    public int f5923i;

    public final void a(Object[] objArr, int i10, int i11) {
        this.f5921g = objArr;
        this.f5922h = i10;
        this.f5923i = i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5923i < this.f5922h;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
