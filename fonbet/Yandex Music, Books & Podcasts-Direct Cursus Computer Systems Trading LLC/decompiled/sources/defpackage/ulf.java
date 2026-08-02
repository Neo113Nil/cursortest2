package defpackage;

/* loaded from: classes4.dex */
public final class ulf {
    public final llf a;

    public ulf(llf llfVar) {
        this.a = llfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ulf) && this.a.equals(((ulf) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Default(playingState=" + this.a + ", showWithAnimation=false)";
    }
}
