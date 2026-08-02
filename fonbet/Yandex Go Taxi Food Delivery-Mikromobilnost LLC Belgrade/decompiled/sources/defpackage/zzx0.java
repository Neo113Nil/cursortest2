package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

/* loaded from: classes14.dex */
public final class zzx0 extends c0y0 {
    public final zzs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzx0(double d, double d2) {
        super(IssuingDistributionPointExtension.POINT);
        zzs zzsVar = new zzs(d, d2, 0, null, null, 28);
        this.b = zzsVar;
    }

    public final zzs b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzx0) && jl40.l(this.b, ((zzx0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Custom(point=" + this.b + Extension.C_BRAKE;
    }
}
