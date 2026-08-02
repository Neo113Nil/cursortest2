package defpackage;

/* loaded from: classes3.dex */
public final class tgs implements ugs {
    public final String a;
    public final qo6 b;
    public final long c;

    public tgs(String str, qo6 qo6Var, long j) {
        this.a = str;
        this.b = qo6Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgs)) {
            return false;
        }
        tgs tgsVar = (tgs) obj;
        return this.a.equals(tgsVar.a) && this.b == tgsVar.b && d85.c(this.c, tgsVar.c);
    }

    @Override // defpackage.ugs
    public final qo6 getType() {
        return this.b;
    }

    @Override // defpackage.ugs
    public final String getUrl() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.c) + hashCode;
    }

    public final String toString() {
        String i = d85.i(this.c);
        StringBuilder sb = new StringBuilder("WithAverageColor(url=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", color=");
        return su4.o(sb, i, ")");
    }
}
