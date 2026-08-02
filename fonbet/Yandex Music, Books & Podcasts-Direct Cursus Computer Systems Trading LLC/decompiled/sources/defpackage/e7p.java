package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e7p extends j7p {
    public final zy2 a;
    public final lt b;
    public final e4p c;
    public final String d;

    public e7p(zy2 zy2Var, lt ltVar, e4p e4pVar, String str) {
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
        if (!(obj instanceof e7p)) {
            return false;
        }
        e7p e7pVar = (e7p) obj;
        return this.a.equals(e7pVar.a) && Intrinsics.d(this.b, e7pVar.b) && this.c == e7pVar.c && Intrinsics.d(this.d, e7pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RecentRelease(uiData=" + this.a + ", model=" + this.b + ", source=" + this.c + ", id=" + this.d + ")";
    }
}
