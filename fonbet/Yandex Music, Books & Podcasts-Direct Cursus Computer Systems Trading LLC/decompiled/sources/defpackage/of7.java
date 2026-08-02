package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class of7 implements pf7 {
    public final String a;
    public final String b;
    public final int c;

    public of7(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of7)) {
            return false;
        }
        of7 of7Var = (of7) obj;
        return Intrinsics.d(this.a, of7Var.a) && Intrinsics.d(this.b, of7Var.b) && this.c == of7Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InfoButton(label=");
        sb.append(this.a);
        sb.append(", notificationText=");
        sb.append(this.b);
        sb.append(", background=");
        return vz1.r(sb, this.c, ')');
    }
}
