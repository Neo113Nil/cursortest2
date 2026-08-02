package defpackage;

/* loaded from: classes3.dex */
public final class oor implements por {
    public final tor a;

    public oor(tor torVar) {
        this.a = torVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oor) && this.a.equals(((oor) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(data=" + this.a + ")";
    }
}
