package defpackage;

/* loaded from: classes4.dex */
public final class kfr implements mfr {
    public final String a;
    public final k70 b;

    public kfr(String str) {
        this.a = str;
        this.b = new k70(str);
    }

    @Override // defpackage.w43
    public final n70 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kfr) && this.a.equals(((kfr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Deeplink(uri=", this.a, ")");
    }
}
