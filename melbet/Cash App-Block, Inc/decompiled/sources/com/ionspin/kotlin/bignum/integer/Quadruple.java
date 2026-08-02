package com.ionspin.kotlin.bignum.integer;

/* loaded from: classes4.dex */
public final class Quadruple {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public Quadruple(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Quadruple)) {
            return false;
        }
        Quadruple quadruple = (Quadruple) obj;
        return this.a.equals(quadruple.a) && this.b.equals(quadruple.b) && this.c.equals(quadruple.c) && this.d.equals(quadruple.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Quadruple(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ")";
    }
}
