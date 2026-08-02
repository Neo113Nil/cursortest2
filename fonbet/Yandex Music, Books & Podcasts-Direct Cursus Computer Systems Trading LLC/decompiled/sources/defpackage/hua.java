package defpackage;

/* loaded from: classes3.dex */
public final class hua implements iua {
    public final eua a;

    public hua(eua euaVar) {
        this.a = euaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hua) && this.a.equals(((hua) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(banner=" + this.a + ")";
    }
}
