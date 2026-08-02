package defpackage;

/* loaded from: classes4.dex */
public final class brk implements crk {
    public final wpk a;

    public brk(wpk wpkVar) {
        this.a = wpkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof brk) && this.a == ((brk) obj).a;
    }

    public final int hashCode() {
        wpk wpkVar = this.a;
        if (wpkVar == null) {
            return 0;
        }
        return wpkVar.hashCode();
    }

    public final String toString() {
        return "Error(syncError=" + this.a + ")";
    }
}
