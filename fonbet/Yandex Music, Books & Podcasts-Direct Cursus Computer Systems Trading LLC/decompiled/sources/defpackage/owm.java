package defpackage;

/* loaded from: classes6.dex */
public final class owm {
    public final boolean a;
    public final String b;

    public owm(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owm)) {
            return false;
        }
        owm owmVar = (owm) obj;
        return this.a == owmVar.a && this.b.equals(owmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PromoCodeData(isSubscribed=" + this.a + ", promoCode=" + this.b + ")";
    }
}
