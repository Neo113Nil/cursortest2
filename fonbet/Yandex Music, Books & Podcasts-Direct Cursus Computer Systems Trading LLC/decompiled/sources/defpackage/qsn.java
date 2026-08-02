package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class qsn extends yde {
    public static final qsn e = new qsn(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public qsn(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.yde, defpackage.qde
    public final int g(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        o2g.N(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.qde
    public final Object[] n() {
        return this.c;
    }

    @Override // defpackage.qde
    public final int o() {
        return this.d;
    }

    @Override // defpackage.qde
    public final int q() {
        return 0;
    }

    @Override // defpackage.qde
    public final boolean r() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.yde, defpackage.qde
    public Object writeReplace() {
        return super.writeReplace();
    }
}
