package yads;

import defpackage.oaa1;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class al2 extends t31 {
    public final transient Object[] c;
    public final transient int w;
    public final transient int x;

    public al2(int i, int i2, Object[] objArr) {
        this.c = objArr;
        this.w = i;
        this.x = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        oaa1.f(i, this.x);
        Object obj = this.c[(i * 2) + this.w];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // yads.n31
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.x;
    }
}
