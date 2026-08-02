package defpackage;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Luki;", "", "Companion", "ski", "tki", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class uki {
    public static final tki Companion = new tki();
    public final String a;
    public final Preorder b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ uki(int i, String str, Preorder preorder, boolean z, String str2, String str3, String str4) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new Preorder(0);
        } else {
            this.b = preorder;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uki)) {
            return false;
        }
        uki ukiVar = (uki) obj;
        return jl40.l(this.a, ukiVar.a) && jl40.l(this.b, ukiVar.b) && this.c == ukiVar.c && jl40.l(this.d, ukiVar.d) && jl40.l(this.e, ukiVar.e) && jl40.l(this.f, ukiVar.f);
    }

    public final int hashCode() {
        int e = unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryPreorderData(uuid=");
        sb.append(this.a);
        sb.append(", preorder=");
        sb.append(this.b);
        sb.append(", isPayOnDeliverySelected=");
        unr0.A(", courierComment=", this.d, ", selectedAltChoiceKey=", sb, this.c);
        return g8e.r(sb, this.e, ", selectedAltChoiceTitle=", this.f, Extension.C_BRAKE);
    }

    public uki(String str, Preorder preorder, boolean z, String str2, String str3, String str4) {
        this.a = str;
        this.b = preorder;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public uki() {
        this("", new Preorder(0), false, null, null, null);
    }
}
