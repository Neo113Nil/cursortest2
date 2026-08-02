package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.OfferTypeDto;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltv80;", "Lpw80;", "Companion", "rv80", "sv80", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class tv80 implements pw80 {
    public static final sv80 Companion = new sv80();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new yi80(28))};
    public final String a;
    public final OfferTypeDto b;

    public /* synthetic */ tv80(int i, String str, OfferTypeDto offerTypeDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = offerTypeDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv80)) {
            return false;
        }
        tv80 tv80Var = (tv80) obj;
        return jl40.l(this.a, tv80Var.a) && this.b == tv80Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        OfferTypeDto offerTypeDto = this.b;
        return hashCode + (offerTypeDto != null ? offerTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuccessScreenButtonTapped(trackId=" + this.a + ", offerType=" + this.b + ')';
    }

    public tv80() {
        this.a = null;
        this.b = null;
    }
}
