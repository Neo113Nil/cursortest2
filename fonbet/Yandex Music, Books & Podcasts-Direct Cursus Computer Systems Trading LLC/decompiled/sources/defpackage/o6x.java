package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class o6x extends q5x {
    public static final o6x g = new o6x(0, new Object[0]);
    public final transient Object[] e;
    public final transient int f;

    public o6x(int i, Object[] objArr) {
        super(0);
        this.e = objArr;
        this.f = i;
    }

    @Override // defpackage.q5x, defpackage.r4x
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.e;
        int i = this.f;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.r4x
    public final int g() {
        return this.f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        gdg.Q(i, this.f);
        Object obj = this.e[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.r4x
    public final int n() {
        return 0;
    }

    @Override // defpackage.r4x
    public final Object[] q() {
        return this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
