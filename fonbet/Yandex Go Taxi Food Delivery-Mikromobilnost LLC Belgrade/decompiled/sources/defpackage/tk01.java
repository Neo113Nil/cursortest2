package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.view.TransferMainSkeletonView$State$CircleButtonsCount;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.view.TransferMainSkeletonView$State$SuggestsCount;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tk01 {
    public final TransferMainSkeletonView$State$SuggestsCount a;
    public final TransferMainSkeletonView$State$CircleButtonsCount b;

    public tk01(TransferMainSkeletonView$State$SuggestsCount transferMainSkeletonView$State$SuggestsCount, TransferMainSkeletonView$State$CircleButtonsCount transferMainSkeletonView$State$CircleButtonsCount) {
        this.a = transferMainSkeletonView$State$SuggestsCount;
        this.b = transferMainSkeletonView$State$CircleButtonsCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk01)) {
            return false;
        }
        tk01 tk01Var = (tk01) obj;
        return this.a == tk01Var.a && this.b == tk01Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "State(suggestsCount=" + this.a + ", circleButtonsCount=" + this.b + Extension.C_BRAKE;
    }
}
