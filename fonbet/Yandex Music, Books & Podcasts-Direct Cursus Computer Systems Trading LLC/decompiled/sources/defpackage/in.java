package defpackage;

/* loaded from: classes4.dex */
public final class in extends kn {
    public final kpo a;

    public in(kpo kpoVar) {
        this.a = kpoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof in) && this.a.equals(((in) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SHOW_CHALLENGE(challengeInfo=" + this.a + ")";
    }
}
