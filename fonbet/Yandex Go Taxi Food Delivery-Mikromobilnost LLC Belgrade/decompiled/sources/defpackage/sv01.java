package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.TransfersDashboardSlideableView$State$Loading$SkeletonType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sv01 implements uv01 {
    public final TransfersDashboardSlideableView$State$Loading$SkeletonType a;

    public sv01(TransfersDashboardSlideableView$State$Loading$SkeletonType transfersDashboardSlideableView$State$Loading$SkeletonType) {
        this.a = transfersDashboardSlideableView$State$Loading$SkeletonType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sv01) && this.a == ((sv01) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(skeletonType=" + this.a + Extension.C_BRAKE;
    }
}
