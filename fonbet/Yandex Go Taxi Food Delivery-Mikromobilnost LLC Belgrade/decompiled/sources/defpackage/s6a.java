package defpackage;

import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class s6a {
    public final hl3 a;
    public final hfa0 b;
    public final n9a c;
    public final ChargersOfferResponseDto d;
    public final String e;
    public final boolean f;

    public s6a(hl3 hl3Var, hfa0 hfa0Var, n9a n9aVar, ChargersOfferResponseDto chargersOfferResponseDto, String str, boolean z) {
        this.a = hl3Var;
        this.b = hfa0Var;
        this.c = n9aVar;
        this.d = chargersOfferResponseDto;
        this.e = str;
        this.f = z;
    }

    public static s6a a(s6a s6aVar, hfa0 hfa0Var, n9a n9aVar, ChargersOfferResponseDto chargersOfferResponseDto, int i) {
        hl3 hl3Var = s6aVar.a;
        if ((i & 2) != 0) {
            hfa0Var = s6aVar.b;
        }
        hfa0 hfa0Var2 = hfa0Var;
        if ((i & 4) != 0) {
            n9aVar = s6aVar.c;
        }
        n9a n9aVar2 = n9aVar;
        if ((i & 8) != 0) {
            chargersOfferResponseDto = s6aVar.d;
        }
        String str = s6aVar.e;
        boolean z = s6aVar.f;
        s6aVar.getClass();
        return new s6a(hl3Var, hfa0Var2, n9aVar2, chargersOfferResponseDto, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6a)) {
            return false;
        }
        s6a s6aVar = (s6a) obj;
        return jl40.l(this.a, s6aVar.a) && jl40.l(this.b, s6aVar.b) && jl40.l(this.c, s6aVar.c) && jl40.l(this.d, s6aVar.d) && jl40.l(this.e, s6aVar.e) && this.f == s6aVar.f;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        n9a n9aVar = this.c;
        int hashCode2 = (this.d.hashCode() + ((hashCode + (n9aVar == null ? 0 : n9aVar.hashCode())) * 31)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.f) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargersOffer(authStatus=");
        sb.append(this.a);
        sb.append(", paymentOptions=");
        sb.append(this.b);
        sb.append(", toggle=");
        sb.append(this.c);
        sb.append(", dto=");
        sb.append(this.d);
        sb.append(", traceId=");
        return nnm.i(this.e, ", useMultiOffer=", Extension.C_BRAKE, sb, this.f);
    }
}
