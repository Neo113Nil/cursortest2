package defpackage;

/* loaded from: classes12.dex */
public final class sqf0 implements vqf0 {
    public final xy40 a;

    public sqf0(xy40 xy40Var) {
        this.a = xy40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sqf0) && this.a.equals(((sqf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
