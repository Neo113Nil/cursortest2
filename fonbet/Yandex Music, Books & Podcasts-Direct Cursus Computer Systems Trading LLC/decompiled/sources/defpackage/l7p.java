package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l7p extends y7p {
    public final raj a;
    public final mqs b;
    public final e4p c;

    public l7p(raj rajVar, mqs mqsVar, e4p e4pVar) {
        mqsVar.getClass();
        this.a = rajVar;
        this.b = mqsVar;
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
        if (!(obj instanceof l7p)) {
            return false;
        }
        l7p l7pVar = (l7p) obj;
        return this.a.equals(l7pVar.a) && Intrinsics.d(this.b, l7pVar.b) && this.c == l7pVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        return "Episode(uiData=" + this.a + ", model=" + this.b + ", source=" + this.c + ")";
    }
}
