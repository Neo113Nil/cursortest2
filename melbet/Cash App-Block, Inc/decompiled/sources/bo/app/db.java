package bo.app;

/* loaded from: classes3.dex */
public final class db {
    public final cb a;
    public final cb b;

    public db(cb cbVar, cb cbVar2) {
        cbVar.getClass();
        cbVar2.getClass();
        this.a = cbVar;
        this.b = cbVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db)) {
            return false;
        }
        db dbVar = (db) obj;
        return this.a == dbVar.a && this.b == dbVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkLevelChangeEvent(oldNetworkLevel=" + this.a + ", newNetworkLevel=" + this.b + ")";
    }
}
