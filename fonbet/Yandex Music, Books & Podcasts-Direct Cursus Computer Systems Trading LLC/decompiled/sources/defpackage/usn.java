package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class usn extends yde {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public usn(int i, int i2, Object[] objArr) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        o2g.N(i, this.e);
        Object obj = this.c[(i * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.qde
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }

    @Override // defpackage.yde, defpackage.qde
    public Object writeReplace() {
        return super.writeReplace();
    }
}
