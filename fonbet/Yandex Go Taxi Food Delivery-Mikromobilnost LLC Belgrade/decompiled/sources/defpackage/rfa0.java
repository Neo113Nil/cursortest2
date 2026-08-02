package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrfa0;", "", "Companion", "pfa0", "qfa0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class rfa0 {
    public static final qfa0 Companion = new qfa0();
    public static final i3y[] f;
    public final PaymentMethod$Type a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final List e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{a.b(lazyThreadSafetyMode, new f9a0(17)), null, null, null, a.b(lazyThreadSafetyMode, new f9a0(18))};
    }

    public /* synthetic */ rfa0(int i, PaymentMethod$Type paymentMethod$Type, String str, String str2, Boolean bool, List list) {
        this.a = (i & 1) == 0 ? PaymentMethod$Type.CASH : paymentMethod$Type;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfa0)) {
            return false;
        }
        rfa0 rfa0Var = (rfa0) obj;
        return this.a == rfa0Var.a && jl40.l(this.b, rfa0Var.b) && jl40.l(this.c, rfa0Var.c) && jl40.l(this.d, rfa0Var.d) && jl40.l(this.e, rfa0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.e;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentParam(type=");
        sb.append(this.a);
        sb.append(", paymentMethodId=");
        sb.append(this.b);
        sb.append(", withdrawAmount=");
        tse0.A(sb, this.c, ", hasLimits=", this.d, ", complements=");
        return ly3.s(sb, this.e, Extension.C_BRAKE);
    }

    public rfa0() {
        this((PaymentMethod$Type) null, (String) null, (String) null, (Boolean) null, (List) null, 31);
    }

    public rfa0(PaymentMethod$Type paymentMethod$Type, String str, String str2, Boolean bool, List list, int i) {
        paymentMethod$Type = (i & 1) != 0 ? PaymentMethod$Type.CASH : paymentMethod$Type;
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        bool = (i & 8) != 0 ? null : bool;
        list = (i & 16) != 0 ? null : list;
        this.a = paymentMethod$Type;
        this.b = str;
        this.c = str2;
        this.d = bool;
        this.e = list;
    }
}
