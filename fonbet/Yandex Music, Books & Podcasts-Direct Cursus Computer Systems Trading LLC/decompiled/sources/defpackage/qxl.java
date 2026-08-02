package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qxl implements yxl {
    public final te a;
    public final nyl b;
    public final Object c;

    public qxl(te teVar, nyl nylVar) {
        teVar.getClass();
        this.a = teVar;
        this.b = nylVar;
        this.c = btf.a(bwf.c, new ril(12, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxl)) {
            return false;
        }
        qxl qxlVar = (qxl) obj;
        return Intrinsics.d(this.a, qxlVar.a) && this.b.equals(qxlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BrandedButtonBlock(data=" + this.a + ", playlistInfo=" + this.b + ")";
    }
}
