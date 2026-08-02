package defpackage;

/* loaded from: classes4.dex */
public final class cjw implements ejw {
    public final taq a;

    public cjw(taq taqVar) {
        this.a = taqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cjw) && this.a.equals(((cjw) obj).a);
    }

    @Override // defpackage.ejw
    public final f5q getEntity() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "VideoWaveEntity(entity=" + this.a + ")";
    }
}
