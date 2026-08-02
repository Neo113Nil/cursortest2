package defpackage;

/* loaded from: classes4.dex */
public final class wwk {
    public final kiw a;
    public final int b;

    public wwk(kiw kiwVar, int i) {
        this.a = kiwVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwk)) {
            return false;
        }
        wwk wwkVar = (wwk) obj;
        return this.a.equals(wwkVar.a) && this.b == wwkVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayableKey(loaderId=" + this.a + ", occurance=" + this.b + ")";
    }
}
