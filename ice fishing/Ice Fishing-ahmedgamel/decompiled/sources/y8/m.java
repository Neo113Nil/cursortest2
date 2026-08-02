package y8;

import java.util.RandomAccess;
import v7.AbstractC5113d;

/* loaded from: classes2.dex */
public final class m extends AbstractC5113d implements RandomAccess {

    /* renamed from: n, reason: collision with root package name */
    public final h[] f41941n;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f41942u;

    public m(h[] hVarArr, int[] iArr) {
        this.f41941n = hVarArr;
        this.f41942u = iArr;
    }

    @Override // v7.AbstractC5110a
    public final int a() {
        return this.f41941n.length;
    }

    @Override // v7.AbstractC5110a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return super.contains((h) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f41941n[i];
    }

    @Override // v7.AbstractC5113d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return super.indexOf((h) obj);
        }
        return -1;
    }

    @Override // v7.AbstractC5113d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return super.lastIndexOf((h) obj);
        }
        return -1;
    }
}
