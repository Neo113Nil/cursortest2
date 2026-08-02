package defpackage;

import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tb9 {
    public final String a;
    public final String b;
    public final ChangeOrderState$Source c;

    public tb9(String str, String str2, ChangeOrderState$Source changeOrderState$Source) {
        this.a = str;
        this.b = str2;
        this.c = changeOrderState$Source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb9)) {
            return false;
        }
        tb9 tb9Var = (tb9) obj;
        return jl40.l(this.a, tb9Var.a) && jl40.l(this.b, tb9Var.b) && this.c == tb9Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("ChangeOrderPayload(orderId=", this.a, ", changeId=", this.b, ", source=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
