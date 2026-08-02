package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kcp {
    public final rfk a;
    public final boolean b;
    public final boolean c;
    public final Uri d;
    public final String e;

    public kcp(rfk rfkVar, boolean z, boolean z2, Uri uri, String str) {
        this.a = rfkVar;
        this.b = z;
        this.c = z2;
        this.d = uri;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcp)) {
            return false;
        }
        kcp kcpVar = (kcp) obj;
        return this.a.equals(kcpVar.a) && this.b == kcpVar.b && this.c == kcpVar.c && Intrinsics.d(this.d, kcpVar.d) && Intrinsics.d(this.e, kcpVar.e);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Uri uri = this.d;
        int hashCode = (e + (uri == null ? 0 : uri.hashCode())) * 31;
        String str = this.e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentSdkData(method=");
        sb.append(this.a);
        sb.append(", needCvn=");
        sb.append(this.b);
        sb.append(", isUnbind=");
        sb.append(this.c);
        sb.append(", imageUri=");
        sb.append(this.d);
        sb.append(", title=");
        return su4.o(sb, this.e, ")");
    }
}
