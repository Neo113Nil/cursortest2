package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.ui_models.progress_bar.PartialProgressBarStyleSides;

/* loaded from: classes5.dex */
public final class rg90 {
    public final long a;
    public final long b;
    public final int c;
    public final PartialProgressBarStyleSides d;
    public final int e;

    public rg90(long j, long j2, int i, PartialProgressBarStyleSides partialProgressBarStyleSides, int i2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = partialProgressBarStyleSides;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg90)) {
            return false;
        }
        rg90 rg90Var = (rg90) obj;
        return ldc.c(this.a, rg90Var.a) && ldc.c(this.b, rg90Var.b) && this.c == rg90Var.c && this.d == rg90Var.d && this.e == rg90Var.e;
    }

    public final int hashCode() {
        int i = ldc.n;
        return Integer.hashCode(this.e) + ((this.d.hashCode() + oyr.b(this.c, qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("PartialProgressBarStyle(color=", ldc.i(this.a), ", fillColor=", ldc.i(this.b), ", count=");
        v.append(this.c);
        v.append(", sides=");
        v.append(this.d);
        v.append(", spaceBetween=");
        return oyr.m(this.e, Extension.C_BRAKE, v);
    }
}
