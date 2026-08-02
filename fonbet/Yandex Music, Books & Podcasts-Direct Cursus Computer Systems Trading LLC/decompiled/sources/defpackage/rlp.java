package defpackage;

/* loaded from: classes3.dex */
public final class rlp {
    public final dmp a;
    public final iw0 b;

    public rlp(dmp dmpVar, iw0 iw0Var) {
        this.a = dmpVar;
        this.b = iw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlp)) {
            return false;
        }
        rlp rlpVar = (rlp) obj;
        return this.a.equals(rlpVar.a) && this.b.equals(rlpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (ojb.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + ojb.SESSION_START + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
