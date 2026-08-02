package com.yandex.plus.plaquesdk.plaque.api.models;

/* loaded from: classes5.dex */
public final class e0 implements g0 {
    public final q a;
    public final f0 b;

    public e0(q qVar, f0 f0Var) {
        f0Var.getClass();
        this.a = qVar;
        this.b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.a.equals(e0Var.a) && this.b == e0Var.b;
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.models.g0
    public final f0 getPosition() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ", position=" + this.b + ')';
    }
}
