package yads;

import defpackage.oaa1;
import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class xk2 extends t31 {
    public final /* synthetic */ yk2 d;

    public xk2(yk2 yk2Var) {
        this.d = yk2Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        oaa1.f(i, this.d.y);
        int i2 = i * 2;
        Object obj = this.d.x[i2];
        Objects.requireNonNull(obj);
        Object obj2 = this.d.x[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // yads.n31
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d.y;
    }
}
