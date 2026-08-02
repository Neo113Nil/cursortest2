package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class gdx extends hcx {
    public final transient Object[] e;
    public final transient int f;
    public final transient int g;

    public gdx(int i, int i2, Object[] objArr) {
        super(1);
        this.e = objArr;
        this.f = i;
        this.g = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        tyf.P(i, this.g);
        Object obj = this.e[i + i + this.f];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }
}
