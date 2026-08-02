package defpackage;

/* loaded from: classes4.dex */
public final class ago {
    public final String a;
    public final tfo b;
    public final yku c;

    public ago(String str, tfo tfoVar, yku ykuVar) {
        this.a = str;
        this.b = tfoVar;
        this.c = ykuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ago)) {
            return false;
        }
        ago agoVar = (ago) obj;
        return this.a.equals(agoVar.a) && this.b.equals(agoVar.b) && this.c.equals(agoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RotorTrackSession(radioSessionId=" + this.a + ", batch=" + this.b + ", wave=" + this.c + ")";
    }
}
