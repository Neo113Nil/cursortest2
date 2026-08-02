package defpackage;

/* loaded from: classes.dex */
public final class xf70 extends yf70 {
    public final Object a;

    public xf70(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xf70) && jl40.l(this.a, ((xf70) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return qv10.r(new StringBuilder("Present(value="), this.a, ')');
    }
}
