package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class sd3 extends zd3 {
    public final String b;
    public final String c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd3(String str, String str2, String str3) {
        super(ae3.a);
        str3.getClass();
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd3)) {
            return false;
        }
        sd3 sd3Var = (sd3) obj;
        return Intrinsics.d(this.b, sd3Var.b) && Intrinsics.d(this.c, sd3Var.c) && Intrinsics.d(this.d, sd3Var.d);
    }

    public final int hashCode() {
        String str = this.b;
        return this.d.hashCode() + k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
    }

    public final String toString() {
        return su4.o(f1d.m("ActionButton(imageUrl=", this.b, ", title=", this.c, ", deeplink="), this.d, ")");
    }
}
