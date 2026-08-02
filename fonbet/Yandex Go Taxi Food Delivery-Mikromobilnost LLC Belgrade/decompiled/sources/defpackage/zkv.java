package defpackage;

/* loaded from: classes2.dex */
public final class zkv {
    public final String a;
    public final String b;
    public final String c;

    public zkv(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkv)) {
            return false;
        }
        zkv zkvVar = (zkv) obj;
        return this.a.equals(zkvVar.a) && jl40.l(this.b, zkvVar.b) && this.c.equals(zkvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InAppPurchaseInput(orderId=");
        sb.append(this.a);
        sb.append(", productId=");
        sb.append(this.b);
        sb.append(", purchaseToken=");
        return b64.p(sb, this.c, ')');
    }
}
