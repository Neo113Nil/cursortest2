package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class su80 implements pw80 {
    public static final ru80 Companion = new ru80();
    public static final i3y[] f = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new yi80(27)), null, null, null};
    public final String a;
    public final PurchaseTypeDto b;
    public final String c;
    public final String d;
    public final Boolean e;

    public /* synthetic */ su80(int i, String str, PurchaseTypeDto purchaseTypeDto, String str2, String str3, Boolean bool) {
        if (6 != (i & 6)) {
            qje.Z(i, 6, qu80.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = purchaseTypeDto;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su80)) {
            return false;
        }
        su80 su80Var = (su80) obj;
        return jl40.l(this.a, su80Var.a) && this.b == su80Var.b && jl40.l(this.c, su80Var.c) && jl40.l(this.d, su80Var.d) && jl40.l(this.e, su80Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c);
        String str2 = this.d;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.e;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PurchaseProductRequest(trackId=");
        sb.append(this.a);
        sb.append(", purchaseType=");
        sb.append(this.b);
        sb.append(", productId=");
        sb.append(this.c);
        sb.append(", target=");
        sb.append(this.d);
        sb.append(", forceSelectCard=");
        return oo31.i(sb, this.e, ')');
    }
}
