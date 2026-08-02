package defpackage;

/* loaded from: classes4.dex */
public final class ltq implements otq {
    public final o54 a;

    public ltq(o54 o54Var) {
        this.a = o54Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ltq) && this.a.equals(((ltq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CarouselSavedInfo(carouselUiState=" + this.a + ")";
    }
}
