package defpackage;

/* loaded from: classes4.dex */
public final class ajw implements ejw {
    public final baq a;

    public ajw(baq baqVar) {
        this.a = baqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajw) && this.a.equals(((ajw) obj).a);
    }

    @Override // defpackage.ejw
    public final f5q getEntity() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GenerativeEntity(entity=" + this.a + ")";
    }
}
