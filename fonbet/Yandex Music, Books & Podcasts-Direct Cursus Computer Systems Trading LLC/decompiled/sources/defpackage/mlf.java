package defpackage;

/* loaded from: classes4.dex */
public final class mlf implements vlf {
    public final ulf a;
    public final tlf b;

    public mlf(ulf ulfVar, tlf tlfVar) {
        this.a = ulfVar;
        this.b = tlfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlf)) {
            return false;
        }
        mlf mlfVar = (mlf) obj;
        return this.a.equals(mlfVar.a) && this.b.equals(mlfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowWaveButton(waveButtonState=" + this.a + ", suggestsUiState=" + this.b + ")";
    }
}
