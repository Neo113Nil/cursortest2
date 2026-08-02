package defpackage;

/* loaded from: classes4.dex */
public final class lfr implements mfr {
    public final String a;

    public lfr(String str) {
        this.a = str;
    }

    @Override // defpackage.w43
    public final /* bridge */ /* synthetic */ n70 a() {
        return i70.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lfr) && this.a.equals(((lfr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Erid(text=", this.a, ")");
    }
}
