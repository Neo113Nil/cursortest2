package defpackage;

/* loaded from: classes2.dex */
public final class yxw {
    public final String a;
    public final Object b;
    public final String c;
    public final Object d;

    public yxw(String str, Object obj, String str2, Object obj2) {
        this.a = str;
        this.b = obj;
        this.c = str2;
        this.d = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxw)) {
            return false;
        }
        yxw yxwVar = (yxw) obj;
        return this.a.equals(yxwVar.a) && jl40.l(this.b, yxwVar.b) && jl40.l(this.c, yxwVar.c) && this.d.equals(yxwVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvoicePayment(id=");
        sb.append(this.a);
        sb.append(", respCode=");
        sb.append(this.b);
        sb.append(", respDesc=");
        sb.append(this.c);
        sb.append(", status=");
        return qv10.r(sb, this.d, ')');
    }
}
