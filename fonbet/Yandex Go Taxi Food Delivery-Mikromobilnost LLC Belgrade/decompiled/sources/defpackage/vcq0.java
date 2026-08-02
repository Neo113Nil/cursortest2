package defpackage;

import android.net.Uri;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class vcq0 {
    public final PaymentMethod a;
    public final boolean b;
    public final boolean c;
    public final Uri d;
    public final String e;

    public vcq0(PaymentMethod paymentMethod, boolean z, boolean z2, Uri uri, String str) {
        this.a = paymentMethod;
        this.b = z;
        this.c = z2;
        this.d = uri;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcq0)) {
            return false;
        }
        vcq0 vcq0Var = (vcq0) obj;
        return this.a.equals(vcq0Var.a) && this.b == vcq0Var.b && this.c == vcq0Var.c && jl40.l(this.d, vcq0Var.d) && jl40.l(this.e, vcq0Var.e);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
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
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
