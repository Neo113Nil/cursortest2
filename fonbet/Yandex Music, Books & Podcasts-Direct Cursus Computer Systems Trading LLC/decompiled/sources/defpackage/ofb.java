package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ofb extends qld {
    public final ild p;
    public final ufb q;

    public ofb(ild ildVar, ufb ufbVar) {
        ufbVar.getClass();
        this.p = ildVar;
        this.q = ufbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofb)) {
            return false;
        }
        ofb ofbVar = (ofb) obj;
        return this.p.equals(ofbVar.p) && Intrinsics.d(this.q, ofbVar.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + (this.p.hashCode() * 31);
    }

    public final String toString() {
        return "Handled(decision=" + this.p + ", rule=" + this.q + ')';
    }
}
