package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliverySelectedFrom;

/* loaded from: classes9.dex */
public final class r0i {
    public static final r0i d;
    public final String a;
    public final String b;
    public final DeliverySelectedFrom c;

    static {
        String str = null;
        d = new r0i(str, str, 7);
    }

    public /* synthetic */ r0i(String str, String str2, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, DeliverySelectedFrom.MANUAL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0i)) {
            return false;
        }
        r0i r0iVar = (r0i) obj;
        return jl40.l(this.a, r0iVar.a) && jl40.l(this.b, r0iVar.b) && this.c == r0iVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeliveryContact(name=", this.a, ", phone=", this.b, ", from=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r0i() {
        this(r0, r0, 7);
        String str = null;
    }

    public r0i(String str, String str2, DeliverySelectedFrom deliverySelectedFrom) {
        this.a = str;
        this.b = str2;
        this.c = deliverySelectedFrom;
    }
}
