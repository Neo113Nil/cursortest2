package yads;

import defpackage.oaa1;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class wk2 extends t31 {
    public static final wk2 x = new wk2(0, new Object[0]);
    public final transient Object[] c;
    public final transient int w;

    public wk2(int i, Object[] objArr) {
        this.c = objArr;
        this.w = i;
    }

    @Override // yads.t31, yads.n31
    public final int a(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.w;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // yads.n31
    public final Object[] f() {
        return this.c;
    }

    @Override // yads.n31
    public final int g() {
        return this.w;
    }

    @Override // java.util.List
    public final Object get(int i) {
        oaa1.f(i, this.w);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // yads.n31
    public final int h() {
        return 0;
    }

    @Override // yads.n31
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }
}
