package defpackage;

import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import com.yandex.go.chargers.offer.data.api.i;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class x8a {
    public final ChargersOfferResponseDto a;
    public final String b;
    public final boolean c;

    static {
        i iVar = ChargersOfferResponseDto.Companion;
    }

    public x8a(ChargersOfferResponseDto chargersOfferResponseDto, String str, boolean z) {
        this.a = chargersOfferResponseDto;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8a)) {
            return false;
        }
        x8a x8aVar = (x8a) obj;
        return jl40.l(this.a, x8aVar.a) && jl40.l(this.b, x8aVar.b) && this.c == x8aVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargersOfferResponse(dto=");
        sb.append(this.a);
        sb.append(", traceId=");
        sb.append(this.b);
        sb.append(", useMultiOffer=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
