package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CreatePaymentDto$ErrorType;

/* loaded from: classes6.dex */
public final class r6f {
    public static final r6f h = new r6f(null, null, null, null, HProv.PP_VERSION_TIMESTAMP);
    public final String a;
    public final boolean b;
    public final CreatePaymentDto$ErrorType c;
    public final Throwable d;
    public final boolean e;
    public final boolean f;
    public final String g;

    public r6f(String str, CreatePaymentDto$ErrorType createPaymentDto$ErrorType, Throwable th, String str2, int i) {
        str = (i & 1) != 0 ? "" : str;
        boolean z = (i & 2) == 0;
        createPaymentDto$ErrorType = (i & 4) != 0 ? null : createPaymentDto$ErrorType;
        th = (i & 8) != 0 ? null : th;
        boolean z2 = (i & 16) == 0;
        boolean z3 = (i & 32) == 0;
        str2 = (i & 64) != 0 ? null : str2;
        this.a = str;
        this.b = z;
        this.c = createPaymentDto$ErrorType;
        this.d = th;
        this.e = z2;
        this.f = z3;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6f)) {
            return false;
        }
        r6f r6fVar = (r6f) obj;
        return jl40.l(this.a, r6fVar.a) && this.b == r6fVar.b && this.c == r6fVar.c && jl40.l(this.d, r6fVar.d) && this.e == r6fVar.e && this.f == r6fVar.f && jl40.l(this.g, r6fVar.g);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        CreatePaymentDto$ErrorType createPaymentDto$ErrorType = this.c;
        int hashCode = (e + (createPaymentDto$ErrorType == null ? 0 : createPaymentDto$ErrorType.hashCode())) * 31;
        Throwable th = this.d;
        int e2 = unr0.e(unr0.e((hashCode + (th == null ? 0 : th.hashCode())) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        return e2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("CreatePaymentState(paymentId=", this.a, ", isError=", ", errorType=", this.b);
        l.append(this.c);
        l.append(", throwable=");
        l.append(this.d);
        l.append(", isLoading=");
        nnm.v(", isSuccess=", ", createPaymentRequestId=", l, this.e, this.f);
        return oyr.t(l, this.g, Extension.C_BRAKE);
    }

    public r6f() {
        this(null, null, null, null, HProv.PP_VERSION_TIMESTAMP);
    }
}
