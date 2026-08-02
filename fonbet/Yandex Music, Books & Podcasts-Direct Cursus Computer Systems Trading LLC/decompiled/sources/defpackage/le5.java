package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class le5 implements me5 {
    public final iil a;
    public final n7q b;
    public final ne5 c;

    public le5(iil iilVar, n7q n7qVar, ne5 ne5Var) {
        n7qVar.getClass();
        this.a = iilVar;
        this.b = n7qVar;
        this.c = ne5Var;
    }

    @Override // defpackage.me5
    public final jil a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le5)) {
            return false;
        }
        le5 le5Var = (le5) obj;
        return this.a.equals(le5Var.a) && Intrinsics.d(this.b, le5Var.b) && this.c.equals(le5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Ready(uiState=" + this.a + ", queueState=" + this.b + ", analyticsState=" + this.c + ")";
    }
}
