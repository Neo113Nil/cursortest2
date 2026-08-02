package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class snr0 extends lea0 {
    public final String a;
    public final String b;
    public final SharedAccountType c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final rnr0 h;

    public snr0(String str, String str2, SharedAccountType sharedAccountType, String str3, boolean z, boolean z2, boolean z3, rnr0 rnr0Var) {
        this.a = str;
        this.b = str2;
        this.c = sharedAccountType;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = rnr0Var;
    }

    @Override // defpackage.lea0
    public final String b() {
        return this.b;
    }

    @Override // defpackage.lea0
    public final PaymentMethod$Type c() {
        return PaymentMethod$Type.SHARED;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof snr0) {
                snr0 snr0Var = (snr0) obj;
                if (jl40.l(this.a, snr0Var.a)) {
                    String str = snr0Var.b;
                    String str2 = this.b;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals && this.c == snr0Var.c && jl40.l(this.d, snr0Var.d) && this.e == snr0Var.e && this.f == snr0Var.f && this.g == snr0Var.g && this.h.equals(snr0Var.h)) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (str != null) {
                            equals = str2.equals(str);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final rnr0 g() {
        return this.h;
    }

    @Override // defpackage.lea0, defpackage.f731
    public final String getId() {
        return this.a;
    }

    public final SharedAccountType h() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.h.hashCode() + unr0.e(unr0.e(unr0.e(unr0.b((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final boolean i() {
        return this.e;
    }

    public final boolean j() {
        return this.f;
    }

    public final String toString() {
        String str = this.b;
        StringBuilder v = b64.v("SharedPayment(id=", this.a, ", disabled=", str == null ? "null" : of91.e(str), ", type=");
        v.append(this.c);
        v.append(", description=");
        v.append(this.d);
        v.append(", isActive=");
        nnm.v(", isMine=", ", isInvitationRead=", v, this.e, this.f);
        v.append(this.g);
        v.append(", details=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
