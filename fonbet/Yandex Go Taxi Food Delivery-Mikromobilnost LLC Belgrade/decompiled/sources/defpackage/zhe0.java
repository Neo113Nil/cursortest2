package defpackage;

/* loaded from: classes2.dex */
public final class zhe0 implements cie0 {
    public final Number a;

    public zhe0(Number number) {
        this.a = number;
    }

    public final Number a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zhe0) && jl40.l(this.a, ((zhe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Number(value=" + this.a + ')';
    }
}
