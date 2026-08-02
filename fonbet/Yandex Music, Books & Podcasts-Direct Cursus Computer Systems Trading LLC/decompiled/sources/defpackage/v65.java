package defpackage;

/* loaded from: classes3.dex */
public final class v65 implements uvn {
    public final nrf a;
    public final f73 b;
    public final onq c;

    public v65(f73 f73Var, nrf nrfVar, onq onqVar) {
        this.a = nrfVar;
        this.b = f73Var;
        this.c = onqVar;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    @Override // defpackage.wfm
    public final f73 d() {
        return this.b;
    }

    @Override // defpackage.uvn
    public final onq e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v65)) {
            return false;
        }
        v65 v65Var = (v65) obj;
        return this.a.equals(v65Var.a) && this.b == v65Var.b && this.c.equals(v65Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + eta.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CollectionWaveAgentBlock(meta=" + this.a + ", showPolicy=" + this.b + ", source=" + this.c + ")";
    }
}
