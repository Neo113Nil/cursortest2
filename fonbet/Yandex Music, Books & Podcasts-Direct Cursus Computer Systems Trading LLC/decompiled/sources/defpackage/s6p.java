package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s6p extends y7p {
    public final ru a;
    public final oq b;
    public final e4p c;

    public s6p(ru ruVar, oq oqVar, e4p e4pVar) {
        oqVar.getClass();
        this.a = ruVar;
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
        if (!(obj instanceof s6p)) {
            return false;
        }
        s6p s6pVar = (s6p) obj;
        return this.a.equals(s6pVar.a) && Intrinsics.d(this.b, s6pVar.b) && this.c == s6pVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        return "Album(uiData=" + this.a + ", model=" + this.b + ", source=" + this.c + ")";
    }
}
