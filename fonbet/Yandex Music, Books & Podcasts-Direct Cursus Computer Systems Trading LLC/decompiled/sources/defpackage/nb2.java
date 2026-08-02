package defpackage;

/* loaded from: classes.dex */
public final class nb2 extends go4 {
    public final kb2 a;

    public nb2(kb2 kb2Var) {
        this.a = kb2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof go4)) {
            return false;
        }
        go4 go4Var = (go4) obj;
        Object obj2 = fo4.a;
        if (obj2.equals(obj2)) {
            return this.a.equals(((nb2) go4Var).a);
        }
        return false;
    }

    public final int hashCode() {
        return ((fo4.a.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + fo4.a + ", androidClientInfo=" + this.a + "}";
    }
}
