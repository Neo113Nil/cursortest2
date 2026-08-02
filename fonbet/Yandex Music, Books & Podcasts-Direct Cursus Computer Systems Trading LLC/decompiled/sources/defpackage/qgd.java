package defpackage;

/* loaded from: classes5.dex */
public final class qgd extends vgd {
    public final IllegalStateException a;

    public qgd(String str) {
        this.a = new IllegalStateException(str);
    }

    public final String toString() {
        return hrg.q("Illegal(", this.a.getMessage(), ")");
    }
}
