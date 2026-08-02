package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class t7x extends i6x {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public t7x(int i, int i2, Object[] objArr) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hag.L(i, this.e);
        Object obj = this.c[i + i + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.a6x
    public final boolean q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
