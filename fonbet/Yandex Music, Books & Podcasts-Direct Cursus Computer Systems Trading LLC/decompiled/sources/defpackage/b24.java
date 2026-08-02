package defpackage;

/* loaded from: classes4.dex */
public final class b24 implements c24 {
    public final klu a;
    public final dou b;

    public b24(klu kluVar, dou douVar) {
        this.a = kluVar;
        this.b = douVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b24)) {
            return false;
        }
        b24 b24Var = (b24) obj;
        return this.a.equals(b24Var.a) && this.b.equals(b24Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WaveAgent(uiData=" + this.a + ", wave=" + this.b + ")";
    }
}
