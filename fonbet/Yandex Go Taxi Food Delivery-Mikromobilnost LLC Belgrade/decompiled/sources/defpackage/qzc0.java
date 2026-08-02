package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class qzc0 implements xzc0 {
    public final String a;
    public final String b;
    public final NoSuchElementException c;

    public qzc0(String str, String str2, NoSuchElementException noSuchElementException) {
        this.a = str;
        this.b = str2;
        this.c = noSuchElementException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzc0)) {
            return false;
        }
        qzc0 qzc0Var = (qzc0) obj;
        return jl40.l(this.a, qzc0Var.a) && jl40.l(this.b, qzc0Var.b) && this.c.equals(qzc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Error(page=" + this.a + ", place=" + this.b + ", cause=" + this.c + ')';
    }
}
