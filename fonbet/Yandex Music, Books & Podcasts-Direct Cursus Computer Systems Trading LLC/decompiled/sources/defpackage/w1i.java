package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w1i {
    public final rab a;
    public final cvl b;

    public w1i(rab rabVar, cvl cvlVar) {
        cvlVar.getClass();
        this.a = rabVar;
        this.b = cvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1i)) {
            return false;
        }
        w1i w1iVar = (w1i) obj;
        return this.a.equals(w1iVar.a) && Intrinsics.d(this.b, w1iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MetaTagPlaylistListItem(uiData=" + this.a + ", playlist=" + this.b + ")";
    }
}
