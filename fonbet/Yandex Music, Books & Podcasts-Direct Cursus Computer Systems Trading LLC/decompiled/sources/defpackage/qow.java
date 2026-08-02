package defpackage;

/* loaded from: classes4.dex */
public final class qow implements row {
    public final sow a;

    public qow(sow sowVar) {
        this.a = sowVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qow) && this.a == ((qow) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AdditionalInfoVideoClip(recommendationType=" + this.a + ")";
    }
}
