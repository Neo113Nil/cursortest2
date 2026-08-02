package defpackage;

import com.yandex.go.payments.payment.YbWalletPayment$YandexType;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class yy51 extends lea0 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final YbWalletPayment$YandexType e;

    public yy51(String str, String str2, List list, String str3, YbWalletPayment$YandexType ybWalletPayment$YandexType) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = ybWalletPayment$YandexType;
    }

    @Override // defpackage.lea0
    public final String b() {
        return this.b;
    }

    @Override // defpackage.lea0
    public final PaymentMethod$Type c() {
        return PaymentMethod$Type.YB_WALLET;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy51)) {
            return false;
        }
        yy51 yy51Var = (yy51) obj;
        if (!jl40.l(this.a, yy51Var.a)) {
            return false;
        }
        String str = yy51Var.b;
        String str2 = this.b;
        if (str2 == null) {
            if (str == null) {
                l = true;
            }
            l = false;
        } else {
            if (str != null) {
                l = jl40.l(str2, str);
            }
            l = false;
        }
        return l && jl40.l(this.c, yy51Var.c) && jl40.l(this.d, yy51Var.d) && this.e == yy51Var.e;
    }

    public final String f() {
        return this.d;
    }

    public final List g() {
        return this.c;
    }

    @Override // defpackage.lea0, defpackage.f731
    public final String getId() {
        return this.a;
    }

    public final YbWalletPayment$YandexType h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int c = unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int hashCode2 = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        YbWalletPayment$YandexType ybWalletPayment$YandexType = this.e;
        return hashCode2 + (ybWalletPayment$YandexType != null ? ybWalletPayment$YandexType.hashCode() : 0);
    }

    public final String toString() {
        String str = this.b;
        StringBuilder v = b64.v("YbWalletPayment(id=", this.a, ", disabled=", str == null ? "null" : of91.e(str), ", labels=");
        oyr.D(", cardIcon=", this.d, ", ybCardType=", v, this.c);
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
