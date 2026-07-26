package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPushNotificationDragonVision6411 extends FrostHunterHandlerThreadNovaXStorm1704 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final Object FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterPushNotificationDragonVision6411(int i, Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
    }

    @Override // android.content.Context.FrostHunterHandlerThreadNovaXStorm1704
    public final int FrostHunterAlphaAnimationNeoCosmos5761() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((Matcher) ((FrostHunterTraceHyperionAuroraNebula9947) obj).FrostHunterFlowMaxDragonHero5809).groupCount() + 1;
            default:
                FrostHunterDialogBlazeStrike2998 frostHunterDialogBlazeStrike2998 = (FrostHunterDialogBlazeStrike2998) obj;
                frostHunterDialogBlazeStrike2998.getClass();
                return frostHunterDialogBlazeStrike2998.FrostHunterFlowMaxDragonHero5809;
        }
    }

    public FrostHunterCameraForceNovaXCosmos3808 FrostHunterBundlePulseFusionHero2475(int i) {
        Matcher matcher = (Matcher) ((FrostHunterTraceHyperionAuroraNebula9947) this.FrostHunterFlowMaxDragonHero5809).FrostHunterFlowMaxDragonHero5809;
        FrostHunterFirebaseModelInterpreterOlympianStorm9227 FrostHunterRunnableCosmosCelestial4235 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(matcher.start(i), matcher.end(i));
        if (FrostHunterRunnableCosmosCelestial4235.FrostHunterCameraXPixelTurboCosmos9814 < 0) {
            return null;
        }
        String group = matcher.group(i);
        group.getClass();
        return new FrostHunterCameraForceNovaXCosmos3808(group, FrostHunterRunnableCosmosCelestial4235);
    }

    @Override // android.content.Context.FrostHunterHandlerThreadNovaXStorm1704, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj == null ? true : obj instanceof FrostHunterCameraForceNovaXCosmos3808) {
                    return super.contains((FrostHunterCameraForceNovaXCosmos3808) obj);
                }
                return false;
            default:
                return ((FrostHunterDialogBlazeStrike2998) this.FrostHunterFlowMaxDragonHero5809).containsValue(obj);
        }
    }

    @Override // android.content.Context.FrostHunterHandlerThreadNovaXStorm1704, java.util.Collection
    public boolean isEmpty() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new FrostHunterTabLayoutStrikeOmegaCosmos4128(new FrostHunterThemeOverlayNovaXMaster6614(new FrostHunterServiceConnectionHyperThunderFusion2305(0, new FrostHunterFirebaseModelInterpreterOlympianStorm9227(0, size() - 1, 1)), new FrostHunterDatabaseMasterPrimeSpeed8049(11, this), 2));
            default:
                FrostHunterViewBindingEpicEpicLegend9995 frostHunterViewBindingEpicEpicLegend9995 = ((FrostHunterDialogBlazeStrike2998) this.FrostHunterFlowMaxDragonHero5809).FrostHunterCameraXPixelTurboCosmos9814;
                FrostHunterTextRecognitionUltraSpectra7563[] frostHunterTextRecognitionUltraSpectra7563Arr = new FrostHunterTextRecognitionUltraSpectra7563[8];
                for (int i = 0; i < 8; i++) {
                    frostHunterTextRecognitionUltraSpectra7563Arr[i] = new FrostHunterPlaceholderCosmosRogueShadow5345(2);
                }
                return new FrostHunterFragmentTransactionPixelFusion2476(frostHunterViewBindingEpicEpicLegend9995, frostHunterTextRecognitionUltraSpectra7563Arr);
        }
    }
}
