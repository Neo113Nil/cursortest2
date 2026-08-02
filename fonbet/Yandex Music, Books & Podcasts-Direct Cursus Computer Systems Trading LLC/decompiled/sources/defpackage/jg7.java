package defpackage;

import com.appsflyer.internal.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class jg7 {
    public final String a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Boolean e;

    public /* synthetic */ jg7(String str, Integer num, Boolean bool, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0 : num, 0, 0, (i & 16) != 0 ? null : bool);
    }

    public static jg7 a(jg7 jg7Var, Integer num) {
        String str = jg7Var.a;
        Integer num2 = jg7Var.b;
        Integer num3 = jg7Var.d;
        Boolean bool = jg7Var.e;
        jg7Var.getClass();
        return new jg7(str, num2, num, num3, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg7)) {
            return false;
        }
        jg7 jg7Var = (jg7) obj;
        return Intrinsics.d(this.a, jg7Var.a) && Intrinsics.d(this.b, jg7Var.b) && Intrinsics.d(this.c, jg7Var.c) && Intrinsics.d(this.d, jg7Var.d) && Intrinsics.d(this.e, jg7Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.e;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecoderData(name=");
        sb.append(this.a);
        sb.append(", inits=");
        sb.append(this.b);
        sb.append(", reuses=");
        sb.append(this.c);
        sb.append(", releases=");
        sb.append(this.d);
        sb.append(", hardwareAccelerated=");
        return k.p(sb, this.e, ')');
    }

    public jg7(String str, Integer num, Integer num2, Integer num3, Boolean bool) {
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = bool;
    }
}
