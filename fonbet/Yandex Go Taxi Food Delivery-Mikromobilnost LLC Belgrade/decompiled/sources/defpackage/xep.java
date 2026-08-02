package defpackage;

import com.yandex.go.address.models.FavoriteAddressRequest;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lxep;", "Lnka1;", "Companion", "vep", "wep", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class xep extends nka1 {
    public static final wep Companion = new wep();
    public final String a;
    public final Integer b;
    public final FavoriteAddressRequest c;

    public xep(int i, String str, Integer num, FavoriteAddressRequest favoriteAddressRequest) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = favoriteAddressRequest;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xep)) {
            return false;
        }
        xep xepVar = (xep) obj;
        return jl40.l(this.a, xepVar.a) && jl40.l(this.b, xepVar.b) && jl40.l(this.c, xepVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        FavoriteAddressRequest favoriteAddressRequest = this.c;
        return hashCode2 + (favoriteAddressRequest != null ? favoriteAddressRequest.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = n.q("Request(id=", this.b, this.a, ", version=", ", address=");
        q.append(this.c);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    public xep(String str, Integer num, FavoriteAddressRequest favoriteAddressRequest) {
        this.a = str;
        this.b = num;
        this.c = favoriteAddressRequest;
    }

    public xep() {
        this(null, null, null);
    }
}
