package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dli implements eli {
    public final po6 a;
    public final w70 b;
    public final w2r c;

    public dli(po6 po6Var, w70 w70Var, w2r w2rVar) {
        w70Var.getClass();
        this.a = po6Var;
        this.b = w70Var;
        this.c = w2rVar;
    }

    @Override // defpackage.eli
    public final w70 a() {
        return this.b;
    }

    @Override // defpackage.eli
    public final w2r b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dli)) {
            return false;
        }
        dli dliVar = (dli) obj;
        return this.a.equals(dliVar.a) && Intrinsics.d(this.b, dliVar.b) && this.c.equals(dliVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Cover(uiData=" + this.a + ", analyticsEntityPosition=" + this.b + ", trackData=" + this.c + ")";
    }
}
