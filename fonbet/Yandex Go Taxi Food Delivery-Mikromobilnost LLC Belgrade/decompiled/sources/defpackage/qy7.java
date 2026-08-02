package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qy7 {
    public static final qy7 e = new qy7(0, null, null, null);
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;

    public qy7(Integer num, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
    }

    public static qy7 a(qy7 qy7Var, String str, String str2, Integer num, String str3, int i) {
        if ((i & 1) != 0) {
            str = qy7Var.a;
        }
        if ((i & 2) != 0) {
            str2 = qy7Var.b;
        }
        if ((i & 4) != 0) {
            num = qy7Var.c;
        }
        if ((i & 8) != 0) {
            str3 = qy7Var.d;
        }
        qy7Var.getClass();
        return new qy7(num, str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy7)) {
            return false;
        }
        qy7 qy7Var = (qy7) obj;
        return jl40.l(this.a, qy7Var.a) && jl40.l(this.b, qy7Var.b) && jl40.l(this.c, qy7Var.c) && jl40.l(this.d, qy7Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CancelReasonsV3State(selectedReasonId=", this.a, ", selectedGroupId=", this.b, ", selectedRating=");
        v.append(this.c);
        v.append(", comment=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
