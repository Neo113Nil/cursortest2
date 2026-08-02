package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u6p extends j7p {
    public final zy2 a;
    public final lt b;
    public final e4p c;
    public final String d;

    public u6p(zy2 zy2Var, lt ltVar, e4p e4pVar, String str) {
        ltVar.getClass();
        str.getClass();
        this.a = zy2Var;
        this.b = ltVar;
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
        if (!(obj instanceof u6p)) {
            return false;
        }
        u6p u6pVar = (u6p) obj;
        return this.a.equals(u6pVar.a) && Intrinsics.d(this.b, u6pVar.b) && this.c == u6pVar.c && Intrinsics.d(this.d, u6pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Album(uiData=" + this.a + ", model=" + this.b + ", source=" + this.c + ", id=" + this.d + ")";
    }
}
