package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q27 {
    public final List a;
    public final int b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final Map g;
    public final String h;

    public q27(List list, int i, boolean z, String str, String str2, String str3, Map map, String str4) {
        this.a = list;
        this.b = i;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = map;
        this.h = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    public static q27 a(q27 q27Var, ArrayList arrayList, String str, int i) {
        ArrayList arrayList2 = arrayList;
        if ((i & 1) != 0) {
            arrayList2 = q27Var.a;
        }
        ArrayList arrayList3 = arrayList2;
        int i2 = q27Var.b;
        boolean z = q27Var.c;
        String str2 = q27Var.d;
        String str3 = q27Var.e;
        String str4 = q27Var.f;
        Map map = q27Var.g;
        if ((i & 128) != 0) {
            str = q27Var.h;
        }
        q27Var.getClass();
        return new q27(arrayList3, i2, z, str2, str3, str4, map, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q27)) {
            return false;
        }
        q27 q27Var = (q27) obj;
        return this.a.equals(q27Var.a) && this.b == q27Var.b && this.c == q27Var.c && Intrinsics.d(this.d, q27Var.d) && Intrinsics.d(this.e, q27Var.e) && Intrinsics.d(this.f, q27Var.f) && Intrinsics.d(this.g, q27Var.g) && Intrinsics.d(this.h, q27Var.h);
    }

    public final int hashCode() {
        int e = k5r.e(f1d.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map map = this.g;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.h;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DKPaymentMethods(paymentMethodsList=");
        sb.append(this.a);
        sb.append(", selectedMethod=");
        sb.append(this.b);
        sb.append(", shouldOpenPlusCard=");
        sb.append(this.c);
        sb.append(", orderAmount=");
        sb.append(this.d);
        sb.append(", orderAmountCurrency=");
        su4.v(sb, this.e, ", metaJson=", this.f, ", legalUrlsMap=");
        sb.append(this.g);
        sb.append(", payload=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
