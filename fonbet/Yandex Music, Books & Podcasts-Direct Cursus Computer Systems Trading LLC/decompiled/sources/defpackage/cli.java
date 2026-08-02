package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class cli implements eli {
    public final f20 a;
    public final w70 b;
    public final w2r c;

    public cli(f20 f20Var, w70 w70Var, w2r w2rVar) {
        w70Var.getClass();
        this.a = f20Var;
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
        if (!(obj instanceof cli)) {
            return false;
        }
        cli cliVar = (cli) obj;
        return this.a.equals(cliVar.a) && Intrinsics.d(this.b, cliVar.b) && this.c.equals(cliVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Album(uiData=" + this.a + ", analyticsEntityPosition=" + this.b + ", trackData=" + this.c + ")";
    }
}
