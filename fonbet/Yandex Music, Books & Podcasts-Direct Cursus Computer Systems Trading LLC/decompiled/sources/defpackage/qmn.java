package defpackage;

/* loaded from: classes4.dex */
public final class qmn extends umn {
    public final pmn a;

    public qmn(pmn pmnVar) {
        this.a = pmnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qmn) && this.a == ((qmn) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(code=" + this.a + ")";
    }
}
