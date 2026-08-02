package defpackage;

/* loaded from: classes4.dex */
public final class pxu implements qxu {
    public final tfo a;
    public final q4q b;
    public final boolean c;

    public pxu(tfo tfoVar, q4q q4qVar, boolean z) {
        this.a = tfoVar;
        this.b = q4qVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxu)) {
            return false;
        }
        pxu pxuVar = (pxu) obj;
        return this.a.equals(pxuVar.a) && this.b.equals(pxuVar.b) && this.c == pxuVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionStarted(batch=");
        sb.append(this.a);
        sb.append(", entity=");
        sb.append(this.b);
        sb.append(", offlineMode=");
        return ouj.r(sb, this.c, ")");
    }
}
