package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qor {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public qor(String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qor)) {
            return false;
        }
        qor qorVar = (qor) obj;
        return Intrinsics.d(this.a, qorVar.a) && Intrinsics.d(this.b, qorVar.b) && Intrinsics.d(this.c, qorVar.c) && this.d == qorVar.d;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("SubscriptionBlockState(title=", this.a, ", titleA11y=", this.b, ", subtitle=");
        m.append(this.c);
        m.append(", isAfterShake=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }

    public /* synthetic */ qor(String str, String str2, String str3, int i) {
        this(str, str2, (i & 4) != 0 ? null : str3, false);
    }
}
