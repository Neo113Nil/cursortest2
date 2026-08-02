package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z6p extends j7p {
    public final az2 a;
    public final lt b;
    public final e4p c;
    public final String d;

    public z6p(az2 az2Var, lt ltVar, e4p e4pVar, String str) {
        ltVar.getClass();
        str.getClass();
        this.a = az2Var;
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
        if (!(obj instanceof z6p)) {
            return false;
        }
        z6p z6pVar = (z6p) obj;
        return this.a.equals(z6pVar.a) && Intrinsics.d(this.b, z6pVar.b) && this.c == z6pVar.c && Intrinsics.d(this.d, z6pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NonMusic(uiData=" + this.a + ", model=" + this.b + ", source=" + this.c + ", id=" + this.d + ")";
    }
}
