package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.GregorianCalendar;

/* loaded from: classes4.dex */
public abstract class wr61 implements Cloneable {
    public abstract int a(wr61 wr61Var);

    public abstract void b(tv61 tv61Var);

    public abstract BigInteger c();

    public abstract Object clone();

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof wr61) && a((wr61) obj) == 0;
    }

    public abstract int f();

    public abstract void g(int i);

    public abstract BigInteger h();

    public int hashCode() {
        int l = l();
        if (l == Integer.MIN_VALUE) {
            l = 0;
        }
        if (l != 0) {
            this = t();
        }
        return this.r() + this.q() + this.p() + this.j() + this.i() + this.f();
    }

    public abstract int i();

    public abstract int j();

    public abstract int l();

    public abstract void m();

    public abstract int p();

    public abstract int q();

    public abstract int r();

    public abstract BigDecimal s();

    public abstract wr61 t();

    public final String toString() {
        return u();
    }

    public abstract String u();

    public abstract GregorianCalendar v();
}
