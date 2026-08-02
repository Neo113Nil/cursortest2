package defpackage;

/* loaded from: classes2.dex */
public final class ykv {
    public final String a;
    public final String b;
    public final String c;

    public ykv(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykv)) {
            return false;
        }
        ykv ykvVar = (ykv) obj;
        return this.a.equals(ykvVar.a) && this.b.equals(ykvVar.b) && jl40.l(this.c, ykvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InAppPurchase(token=");
        sb.append(this.a);
        sb.append(", orderId=");
        sb.append(this.b);
        sb.append(", productId=");
        return b64.p(sb, this.c, ')');
    }
}
