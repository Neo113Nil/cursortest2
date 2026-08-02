package defpackage;

/* loaded from: classes.dex */
public final class pyn implements wdc {
    public final int a;
    public final act b;
    public final jyn c;
    public final long d;

    public pyn(int i, act actVar, jyn jynVar, long j) {
        this.a = i;
        this.b = actVar;
        this.c = jynVar;
        this.d = j;
    }

    @Override // defpackage.tm0
    public final rzt a(oct octVar) {
        return new oio(this.a, this.b.a(octVar), this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pyn) {
            pyn pynVar = (pyn) obj;
            if (pynVar.a == this.a && pynVar.b.equals(this.b) && pynVar.c == this.c && pynVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a * 31)) * 31)) * 31);
    }
}
