package defpackage;

import com.ybsdk.feature.transfer.version2.api.TransferSkeletonType;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vk01 implements xk01 {
    public final TransferSkeletonType a;
    public final Set b;

    public vk01(TransferSkeletonType transferSkeletonType, Set set) {
        this.a = transferSkeletonType;
        this.b = set;
    }

    @Override // defpackage.xk01
    public final Set a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk01)) {
            return false;
        }
        vk01 vk01Var = (vk01) obj;
        return this.a == vk01Var.a && jl40.l(this.b, vk01Var.b);
    }

    public final int hashCode() {
        TransferSkeletonType transferSkeletonType = this.a;
        return this.b.hashCode() + ((transferSkeletonType == null ? 0 : transferSkeletonType.hashCode()) * 31);
    }

    public final String toString() {
        return "Loading(skeletonType=" + this.a + ", m2mSelectedActionCompletedBankIds=" + this.b + Extension.C_BRAKE;
    }
}
