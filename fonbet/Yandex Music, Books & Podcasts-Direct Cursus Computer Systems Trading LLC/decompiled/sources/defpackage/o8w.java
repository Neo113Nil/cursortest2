package defpackage;

/* loaded from: classes3.dex */
public final class o8w {
    public final boolean a;
    public final boolean b;

    public o8w(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8w)) {
            return false;
        }
        o8w o8wVar = (o8w) obj;
        return this.a == o8wVar.a && this.b == o8wVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("YandexBooksUiData(contentAvailable=", this.a, ", fromYandexBooksCatalog=", this.b, ")");
    }
}
