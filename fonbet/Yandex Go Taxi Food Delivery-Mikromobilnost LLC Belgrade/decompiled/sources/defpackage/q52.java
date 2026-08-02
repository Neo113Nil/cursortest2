package defpackage;

/* loaded from: classes10.dex */
public final class q52 implements vm10 {
    public final to5 a;
    public final to5 b;
    public final int c;

    public q52(to5 to5Var, to5 to5Var2, int i) {
        this.a = to5Var;
        this.b = to5Var2;
        this.c = i;
    }

    @Override // defpackage.vm10
    public final int a(f6w f6wVar, long j, int i) {
        int a = this.b.a(0, f6wVar.b());
        return f6wVar.b + a + (-this.a.a(0, i)) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q52)) {
            return false;
        }
        q52 q52Var = (q52) obj;
        return this.a.equals(q52Var.a) && this.b.equals(q52Var.b) && this.c == q52Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + g8e.c(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return oyr.s(sb, this.c, ')');
    }
}
