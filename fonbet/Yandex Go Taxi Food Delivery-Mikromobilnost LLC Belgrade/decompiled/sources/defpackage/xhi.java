package defpackage;

import com.yandex.go.payments.payment.DeliveryPayment$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xhi {
    public final DeliveryPayment$Type a;
    public final String b;
    public final String c;
    public final whi d;

    public xhi(DeliveryPayment$Type deliveryPayment$Type, String str, String str2, whi whiVar) {
        this.a = deliveryPayment$Type;
        this.b = str;
        this.c = str2;
        this.d = whiVar;
    }

    public final whi a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final DeliveryPayment$Type c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhi)) {
            return false;
        }
        xhi xhiVar = (xhi) obj;
        return this.a == xhiVar.a && jl40.l(this.b, xhiVar.b) && jl40.l(this.c, xhiVar.c) && jl40.l(this.d, xhiVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        whi whiVar = this.d;
        return b + (whiVar == null ? 0 : whiVar.hashCode());
    }

    public final String toString() {
        return "Display(type=" + this.a + ", imageTag=" + this.b + ", title=" + this.c + ", disableReason=" + this.d + Extension.C_BRAKE;
    }

    public xhi() {
        this(DeliveryPayment$Type.UNSUPPORTED, "", "", null);
    }
}
