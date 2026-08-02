package com.yandex.plus.plaquesdk.plaque.api.models;

/* loaded from: classes5.dex */
public final class d0 implements g0 {
    public final int a;
    public final f0 b;

    public d0(int i, f0 f0Var) {
        this.a = i;
        this.b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.a == d0Var.a && this.b == d0Var.b;
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.models.g0
    public final f0 getPosition() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Count(count=" + this.a + ", position=" + this.b + ')';
    }
}
