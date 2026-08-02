package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class nwr {
    public final f9b a;
    public final f9b b;

    public nwr() {
        f9b f9bVar = new f9b();
        f9b f9bVar2 = new f9b();
        this.a = f9bVar;
        this.b = f9bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwr)) {
            return false;
        }
        nwr nwrVar = (nwr) obj;
        return Intrinsics.d(this.a, nwrVar.a) && Intrinsics.d(this.b, nwrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SyncEntities(existingEntities=" + this.a + ", newEntities=" + this.b + ")";
    }
}
