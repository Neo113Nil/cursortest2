package defpackage;

/* loaded from: classes3.dex */
public final class ygk extends zgk {
    public final p3n a;

    public ygk(p3n p3nVar) {
        this.a = p3nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ygk) && this.a.equals(((ygk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(buttonState=" + this.a + ")";
    }
}
