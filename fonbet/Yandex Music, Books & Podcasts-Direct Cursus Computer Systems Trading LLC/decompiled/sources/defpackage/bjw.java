package defpackage;

/* loaded from: classes4.dex */
public final class bjw implements ejw {
    public final oaq a;

    public bjw(oaq oaqVar) {
        this.a = oaqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bjw) && this.a.equals(((bjw) obj).a);
    }

    @Override // defpackage.ejw
    public final f5q getEntity() {
        return this.a;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "UnknownEntity(entity=" + this.a + ")";
    }
}
