package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLayoutStormAlphaPhantom1645 extends FrostHunterWindowManagerTitaniumSpectraOlympian5970 implements Serializable {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public static final FrostHunterLayoutStormAlphaPhantom1645 FrostHunterFlowMaxDragonHero5809 = new FrostHunterLayoutStormAlphaPhantom1645(0);
    public static final FrostHunterLayoutStormAlphaPhantom1645 FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterLayoutStormAlphaPhantom1645(1);

    public /* synthetic */ FrostHunterLayoutStormAlphaPhantom1645(int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
    }

    @Override // android.content.Context.FrostHunterWindowManagerTitaniumSpectraOlympian5970
    public final FrostHunterWindowManagerTitaniumSpectraOlympian5970 FrostHunterAlphaAnimationNeoCosmos5761() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return FrostHunterAlertDialogAuroraDelta3200;
            default:
                return FrostHunterFlowMaxDragonHero5809;
        }
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
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
