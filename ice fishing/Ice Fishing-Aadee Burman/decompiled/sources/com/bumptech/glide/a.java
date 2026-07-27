package com.bumptech.glide;

/* loaded from: classes.dex */
public final class a implements Cloneable {

    /* renamed from: n, reason: collision with root package name */
    public L1.a f23367n;

    public final boolean equals(Object obj) {
        return (obj instanceof a) && i(obj);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e9) {
            throw new RuntimeException(e9);
        }
    }

    public final int hashCode() {
        return j();
    }

    public final boolean i(Object obj) {
        if (obj instanceof a) {
            return N1.p.b(this.f23367n, ((a) obj).f23367n);
        }
        return false;
    }

    public final int j() {
        L1.a aVar = this.f23367n;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }
}
