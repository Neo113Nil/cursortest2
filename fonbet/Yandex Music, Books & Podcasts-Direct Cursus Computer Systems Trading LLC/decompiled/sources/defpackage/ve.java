package defpackage;

/* loaded from: classes4.dex */
public final class ve {
    public final muo a;
    public final zqt b;

    public ve(muo muoVar, zqt zqtVar) {
        muoVar.getClass();
        this.a = muoVar;
        this.b = zqtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        return this.a == veVar.a && this.b == veVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionContext(screen=" + this.a + ", usage=" + this.b + ")";
    }
}
