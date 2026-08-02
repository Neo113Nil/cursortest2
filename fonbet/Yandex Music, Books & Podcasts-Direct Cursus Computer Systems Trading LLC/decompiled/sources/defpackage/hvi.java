package defpackage;

/* loaded from: classes3.dex */
public final class hvi implements jvi {
    public final mvi a;

    public hvi(mvi mviVar) {
        this.a = mviVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hvi) && this.a.equals(((hvi) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Promo(data=" + this.a + ")";
    }
}
