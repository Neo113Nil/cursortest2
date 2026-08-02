package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class o43 {
    public final String a;
    public final String b;

    public o43(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        String str = this.a;
        if (StringsKt.U(str)) {
            return null;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o43)) {
            return false;
        }
        o43 o43Var = (o43) obj;
        return Intrinsics.d(this.a, o43Var.a) && Intrinsics.d(this.b, o43Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return hrg.s("BlockAction(deeplink=", this.a, ", weblink=", this.b, ")");
    }
}
