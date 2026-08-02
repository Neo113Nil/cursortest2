package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v7p extends y7p {
    public final po6 a;
    public final mqs b;
    public final e4p c;

    public v7p(po6 po6Var, mqs mqsVar, e4p e4pVar) {
        mqsVar.getClass();
        this.a = po6Var;
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
        if (!(obj instanceof v7p)) {
            return false;
        }
        v7p v7pVar = (v7p) obj;
        return this.a.equals(v7pVar.a) && Intrinsics.d(this.b, v7pVar.b) && this.c == v7pVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        return "Track(uiData=" + this.a + ", model=" + this.b + ", source=" + this.c + ")";
    }
}
