package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v6p extends j7p {
    public final vm7 a;
    public final u51 b;
    public final e4p c;
    public final String d;

    public v6p(vm7 vm7Var, u51 u51Var, e4p e4pVar, String str) {
        u51Var.getClass();
        str.getClass();
        this.a = vm7Var;
        this.b = u51Var;
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
        if (!(obj instanceof v6p)) {
            return false;
        }
        v6p v6pVar = (v6p) obj;
        return this.a.equals(v6pVar.a) && Intrinsics.d(this.b, v6pVar.b) && this.c == v6pVar.c && Intrinsics.d(this.d, v6pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Artist(uiData=" + this.a + ", model=" + this.b + ", source=" + this.c + ", id=" + this.d + ")";
    }
}
