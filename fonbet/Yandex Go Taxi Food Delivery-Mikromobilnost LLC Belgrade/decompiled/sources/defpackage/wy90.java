package defpackage;

import com.yandex.go.payments.paymentdomain.data.DomainConfigDto;
import com.yandex.go.payments.paymentdomain.data.DomainConfigPublicKeyDto;
import com.yandex.go.payments.paymentdomain.data.DomainConfigSignatureDto;
import com.yandex.go.payments.paymentdomain.data.VerifiedDomainConfigDto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes13.dex */
public final class wy90 {
    public final umx a;
    public final drg b = new drg();

    public wy90(umx umxVar) {
        this.a = umxVar;
    }

    public final p370 a(DomainConfigDto domainConfigDto) {
        String str = domainConfigDto.a;
        List<DomainConfigPublicKeyDto> list = domainConfigDto.c;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (DomainConfigPublicKeyDto domainConfigPublicKeyDto : list) {
            Date c = this.b.c(domainConfigPublicKeyDto.d);
            if (c == null) {
                ny61.g("Payment domain public key has invalid valid_before");
                return null;
            }
            arrayList.add(new hz90(domainConfigPublicKeyDto.b, domainConfigPublicKeyDto.a, domainConfigPublicKeyDto.f, domainConfigPublicKeyDto.e, domainConfigPublicKeyDto.g, c, domainConfigPublicKeyDto.d));
        }
        List<DomainConfigSignatureDto> list2 = domainConfigDto.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        for (DomainConfigSignatureDto domainConfigSignatureDto : list2) {
            arrayList2.add(new jz90(domainConfigSignatureDto.b, domainConfigSignatureDto.c, domainConfigSignatureDto.a));
        }
        return new p370(22, str, arrayList, arrayList2);
    }

    public final uy90 b(p370 p370Var, String str, String str2) {
        kwu kwuVar;
        sbx a = this.a.a();
        String str3 = (String) p370Var.b;
        a.getClass();
        VerifiedDomainConfigDto verifiedDomainConfigDto = (VerifiedDomainConfigDto) a.b(VerifiedDomainConfigDto.Companion.serializer(), str3);
        String str4 = verifiedDomainConfigDto.a;
        String str5 = verifiedDomainConfigDto.b;
        try {
            jwu jwuVar = new jwu();
            jwuVar.i(null, str4);
            kwuVar = jwuVar.e();
        } catch (IllegalArgumentException unused) {
            kwuVar = null;
        }
        if (kwuVar == null) {
            ny61.g("Payment domain host is not a valid URL");
            return null;
        }
        if (!kwuVar.f()) {
            ny61.g("Payment domain host must use HTTPS");
            return null;
        }
        if (evu0.J(str5)) {
            ny61.g("Payment merchant domain is blank");
            return null;
        }
        if (evu0.J(str)) {
            ny61.g("Payment domain currency is blank");
            return null;
        }
        if (!evu0.J(str2)) {
            return new uy90(kwuVar.i, str5, str, str2);
        }
        ny61.g("Payment domain request ID is blank");
        return null;
    }
}
