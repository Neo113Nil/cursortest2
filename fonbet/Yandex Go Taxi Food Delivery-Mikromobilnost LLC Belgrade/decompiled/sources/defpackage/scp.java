package defpackage;

import com.yandex.go.address.models.FavoriteAddressRequest;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lscp;", "", "Companion", "qcp", "rcp", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class scp {
    public static final rcp Companion = new rcp();
    public final FavoriteAddressRequest a;

    public /* synthetic */ scp(int i, FavoriteAddressRequest favoriteAddressRequest) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = favoriteAddressRequest;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof scp) && jl40.l(this.a, ((scp) obj).a);
    }

    public final int hashCode() {
        FavoriteAddressRequest favoriteAddressRequest = this.a;
        if (favoriteAddressRequest == null) {
            return 0;
        }
        return favoriteAddressRequest.hashCode();
    }

    public final String toString() {
        return "Request(address=" + this.a + Extension.C_BRAKE;
    }

    public scp(FavoriteAddressRequest favoriteAddressRequest) {
        this.a = favoriteAddressRequest;
    }

    public scp() {
        this(null);
    }
}
