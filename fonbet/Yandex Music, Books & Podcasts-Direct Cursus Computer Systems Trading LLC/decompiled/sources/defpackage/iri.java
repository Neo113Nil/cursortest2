package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class iri implements kri {
    public final k10 a;
    public final mqs b;

    public iri(k10 k10Var, mqs mqsVar) {
        k10Var.getClass();
        mqsVar.getClass();
        this.a = k10Var;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iri)) {
            return false;
        }
        iri iriVar = (iri) obj;
        return Intrinsics.d(this.a, iriVar.a) && Intrinsics.d(this.b, iriVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QueueAlbumItem(albumTrack=" + this.a + ", track=" + this.b + ")";
    }
}
