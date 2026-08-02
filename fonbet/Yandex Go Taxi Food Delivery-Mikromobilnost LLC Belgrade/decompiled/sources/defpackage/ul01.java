package defpackage;

import com.ybsdk.feature.transfer.version2.api.TransferSkeletonType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ul01 implements wl01 {
    public final boolean a;
    public final TransferSkeletonType b;

    public ul01(boolean z, TransferSkeletonType transferSkeletonType) {
        this.a = z;
        this.b = transferSkeletonType;
    }

    public final TransferSkeletonType a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul01)) {
            return false;
        }
        ul01 ul01Var = (ul01) obj;
        return this.a == ul01Var.a && this.b == ul01Var.b;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        TransferSkeletonType transferSkeletonType = this.b;
        return hashCode + (transferSkeletonType == null ? 0 : transferSkeletonType.hashCode());
    }

    public final String toString() {
        return "Loading(transparentBackground=" + this.a + ", skeletonType=" + this.b + Extension.C_BRAKE;
    }
}
