package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g7p extends j7p {
    public final cz2 a;
    public final kjm b;
    public final e4p c;
    public final String d;

    public g7p(cz2 cz2Var, kjm kjmVar, e4p e4pVar, String str) {
        kjmVar.getClass();
        str.getClass();
        this.a = cz2Var;
        this.b = kjmVar;
        this.c = e4pVar;
        this.d = str;
    }

    @Override // defpackage.y7p
    public final e4p b() {
        return this.c;
    }

    @Override // defpackage.j7p
    public final String c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7p)) {
            return false;
        }
        g7p g7pVar = (g7p) obj;
        return this.a.equals(g7pVar.a) && Intrinsics.d(this.b, g7pVar.b) && this.c == g7pVar.c && Intrinsics.d(this.d, g7pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Upcoming(uiData=" + this.a + ", model=" + this.b + ", source=" + this.c + ", id=" + this.d + ")";
    }
}
