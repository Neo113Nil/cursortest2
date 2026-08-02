package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qzh {
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d;

    public qzh(boolean z, boolean z2, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzh)) {
            return false;
        }
        qzh qzhVar = (qzh) obj;
        return this.a == qzhVar.a && this.b.equals(qzhVar.b) && jl40.l(this.c, qzhVar.c) && this.d == qzhVar.d;
    }

    public final int hashCode() {
        int b = unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return nnm.i(this.c, ", hasItemsAbove=", Extension.C_BRAKE, ly3.v("DeliveryCommentRequirementUiModel(isVisible=", ", title=", this.b, ", subtitle=", this.a), this.d);
    }
}
