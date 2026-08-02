package defpackage;

import com.yandex.go.benefits_center.data.model.BenefitsCenterBanner;
import com.yandex.go.benefits_center.data.model.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zl5 implements am5 {
    public final BenefitsCenterBanner a;

    static {
        c cVar = BenefitsCenterBanner.Companion;
    }

    public zl5(BenefitsCenterBanner benefitsCenterBanner) {
        this.a = benefitsCenterBanner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zl5) && jl40.l(this.a, ((zl5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(banner=" + this.a + Extension.C_BRAKE;
    }
}
