package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class p7x extends i6x {
    public static final p7x e = new p7x(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public p7x(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.i6x, defpackage.a6x
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.a6x
    public final int g() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hag.L(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.a6x
    public final int n() {
        return 0;
    }

    @Override // defpackage.a6x
    public final boolean q() {
        return false;
    }

    @Override // defpackage.a6x
    public final Object[] r() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
