package defpackage;

import com.ybsdk.feature.merchant.offers.internal.screens.root.ShimmerType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vp10 implements wp10 {
    public final ShimmerType a;

    public vp10(ShimmerType shimmerType) {
        this.a = shimmerType;
    }

    public final ShimmerType a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vp10) && this.a == ((vp10) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(shimmerType=" + this.a + Extension.C_BRAKE;
    }
}
