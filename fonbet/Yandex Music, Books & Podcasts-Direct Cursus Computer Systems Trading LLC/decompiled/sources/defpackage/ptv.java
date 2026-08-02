package defpackage;

/* loaded from: classes4.dex */
public final class ptv implements uvn {
    public final nrf a;
    public final onq b;

    public ptv(nrf nrfVar, onq onqVar) {
        this.a = nrfVar;
        this.b = onqVar;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    @Override // defpackage.uvn
    public final onq e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptv)) {
            return false;
        }
        ptv ptvVar = (ptv) obj;
        return this.a.equals(ptvVar.a) && this.b.equals(ptvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WizardBlock(meta=" + this.a + ", source=" + this.b + ")";
    }
}
