package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n7p extends y7p {
    public final kbj a;
    public final oq b;
    public final e4p c;

    public n7p(kbj kbjVar, oq oqVar, e4p e4pVar) {
        oqVar.getClass();
        this.a = kbjVar;
        this.b = oqVar;
        this.c = e4pVar;
    }

    @Override // defpackage.y7p
    public final e4p b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7p)) {
            return false;
        }
        n7p n7pVar = (n7p) obj;
        return this.a.equals(n7pVar.a) && Intrinsics.d(this.b, n7pVar.b) && this.c == n7pVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        return "NonMusic(uiData=" + this.a + ", model=" + this.b + ", source=" + this.c + ")";
    }
}
