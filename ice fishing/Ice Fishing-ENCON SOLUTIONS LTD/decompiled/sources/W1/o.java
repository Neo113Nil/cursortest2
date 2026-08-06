package W1;

import i1.AbstractC0248e;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class o extends AbstractC0248e implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final j[] f1891a;

    public o(j[] jVarArr) {
        this.f1891a = jVarArr;
    }

    @Override // i1.AbstractC0248e
    public final int a() {
        return this.f1891a.length;
    }

    @Override // i1.AbstractC0248e, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof j) {
            return super.contains((j) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        return this.f1891a[i2];
    }

    @Override // i1.AbstractC0248e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof j) {
            return super.indexOf((j) obj);
        }
        return -1;
    }

    @Override // i1.AbstractC0248e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof j) {
            return super.lastIndexOf((j) obj);
        }
        return -1;
    }
}
