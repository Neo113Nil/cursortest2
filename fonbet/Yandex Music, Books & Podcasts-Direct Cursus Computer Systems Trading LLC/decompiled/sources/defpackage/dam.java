package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dam {
    public final iab a;
    public final gvd b;
    public final j0s c;

    public dam(iab iabVar, ivd ivdVar, j0s j0sVar) {
        ivdVar.getClass();
        this.a = iabVar;
        this.b = ivdVar;
        this.c = j0sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dam)) {
            return false;
        }
        dam damVar = (dam) obj;
        return this.a.equals(damVar.a) && Intrinsics.d(this.b, damVar.b) && this.c == damVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PodcastHeaderBlock(header=" + this.a + ", coverLoadState=" + this.b + ", defaultSelectedTab=" + this.c + ")";
    }
}
