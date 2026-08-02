package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.OfferTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class vmv implements gov {
    public static final umv Companion = new umv();
    public static final i3y[] d;
    public final String a;
    public final PurchaseTypeDto b;
    public final OfferTypeDto c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, a.b(lazyThreadSafetyMode, new syu(29)), a.b(lazyThreadSafetyMode, new smv(0))};
    }

    public /* synthetic */ vmv(int i, String str, PurchaseTypeDto purchaseTypeDto, OfferTypeDto offerTypeDto) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, tmv.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = purchaseTypeDto;
        this.c = offerTypeDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmv)) {
            return false;
        }
        vmv vmvVar = (vmv) obj;
        return jl40.l(this.a, vmvVar.a) && this.b == vmvVar.b && this.c == vmvVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "PurchaseProductAutoStart(trackId=" + this.a + ", purchaseType=" + this.b + ", offerType=" + this.c + ')';
    }

    public vmv(String str, PurchaseTypeDto purchaseTypeDto, OfferTypeDto offerTypeDto) {
        this.a = str;
        this.b = purchaseTypeDto;
        this.c = offerTypeDto;
    }
}
