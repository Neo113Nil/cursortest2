package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseErrorTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseStatusTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class ymv implements gov {
    public static final xmv Companion = new xmv();
    public static final i3y[] f;
    public final String a;
    public final PurchaseTypeDto b;
    public final PurchaseStatusTypeDto c;
    public final PurchaseErrorTypeDto d;
    public final String e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, a.b(lazyThreadSafetyMode, new smv(1)), a.b(lazyThreadSafetyMode, new smv(2)), a.b(lazyThreadSafetyMode, new smv(3)), null};
    }

    public /* synthetic */ ymv(int i, String str, PurchaseTypeDto purchaseTypeDto, PurchaseStatusTypeDto purchaseStatusTypeDto, PurchaseErrorTypeDto purchaseErrorTypeDto, String str2) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, wmv.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = purchaseTypeDto;
        this.c = purchaseStatusTypeDto;
        this.d = purchaseErrorTypeDto;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymv)) {
            return false;
        }
        ymv ymvVar = (ymv) obj;
        return jl40.l(this.a, ymvVar.a) && this.b == ymvVar.b && this.c == ymvVar.c && this.d == ymvVar.d && jl40.l(this.e, ymvVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        PurchaseErrorTypeDto purchaseErrorTypeDto = this.d;
        int hashCode2 = (hashCode + (purchaseErrorTypeDto == null ? 0 : purchaseErrorTypeDto.hashCode())) * 31;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PurchaseProductButtonStatus(trackId=");
        sb.append(this.a);
        sb.append(", purchaseType=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", errorType=");
        sb.append(this.d);
        sb.append(", errorMessage=");
        return b64.p(sb, this.e, ')');
    }

    public ymv(String str, PurchaseTypeDto purchaseTypeDto, PurchaseStatusTypeDto purchaseStatusTypeDto, PurchaseErrorTypeDto purchaseErrorTypeDto) {
        this.a = str;
        this.b = purchaseTypeDto;
        this.c = purchaseStatusTypeDto;
        this.d = purchaseErrorTypeDto;
        this.e = null;
    }
}
