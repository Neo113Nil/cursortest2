package defpackage;

import com.yandex.plus.core.graphql.type.UPSALE_STEP;

/* loaded from: classes2.dex */
public final class xib {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final UPSALE_STEP e;

    public xib(boolean z, String str, String str2, String str3, UPSALE_STEP upsale_step) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = upsale_step;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xib)) {
            return false;
        }
        xib xibVar = (xib) obj;
        return this.a == xibVar.a && jl40.l(this.b, xibVar.b) && jl40.l(this.c, xibVar.c) && jl40.l(this.d, xibVar.d) && this.e == xibVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "CheckoutAdditionalOfferInput(isSelected=" + this.a + ", offerName=" + this.b + ", offersBatchId=" + this.c + ", positionId=" + this.d + ", upsaleStep=" + this.e + ')';
    }
}
