package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLocationManagerSparkInfernoQuantum6284 implements Comparator {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public static final FrostHunterLocationManagerSparkInfernoQuantum6284 FrostHunterFlowMaxDragonHero5809 = new FrostHunterLocationManagerSparkInfernoQuantum6284(0);
    public static final FrostHunterLocationManagerSparkInfernoQuantum6284 FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterLocationManagerSparkInfernoQuantum6284(1);

    public /* synthetic */ FrostHunterLocationManagerSparkInfernoQuantum6284(int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                comparable4.getClass();
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return FrostHunterAlertDialogAuroraDelta3200;
            default:
                return FrostHunterFlowMaxDragonHero5809;
        }
    }
}
