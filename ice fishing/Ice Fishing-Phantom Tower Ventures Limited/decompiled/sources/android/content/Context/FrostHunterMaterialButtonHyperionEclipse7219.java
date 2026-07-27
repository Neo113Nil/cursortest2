package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMaterialButtonHyperionEclipse7219 extends FrostHunterInsetDrawableNeoHyper5567 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterDialogBlazeStrike2998 FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterMaterialButtonHyperionEclipse7219(FrostHunterDialogBlazeStrike2998 frostHunterDialogBlazeStrike2998, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterDialogBlazeStrike2998;
    }

    @Override // android.content.Context.FrostHunterHandlerThreadNovaXStorm1704
    public final int FrostHunterAlphaAnimationNeoCosmos5761() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterDialogBlazeStrike2998 frostHunterDialogBlazeStrike2998 = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                frostHunterDialogBlazeStrike2998.getClass();
                break;
            default:
                frostHunterDialogBlazeStrike2998.getClass();
                break;
        }
        return frostHunterDialogBlazeStrike2998.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // android.content.Context.FrostHunterHandlerThreadNovaXStorm1704, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterDialogBlazeStrike2998 frostHunterDialogBlazeStrike2998 = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = frostHunterDialogBlazeStrike2998.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && frostHunterDialogBlazeStrike2998.containsKey(entry.getKey());
            default:
                return frostHunterDialogBlazeStrike2998.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterViewBindingEpicEpicLegend9995 frostHunterViewBindingEpicEpicLegend9995 = this.FrostHunterFlowMaxDragonHero5809.FrostHunterCameraXPixelTurboCosmos9814;
                FrostHunterTextRecognitionUltraSpectra7563[] frostHunterTextRecognitionUltraSpectra7563Arr = new FrostHunterTextRecognitionUltraSpectra7563[8];
                for (int i = 0; i < 8; i++) {
                    frostHunterTextRecognitionUltraSpectra7563Arr[i] = new FrostHunterPlaceholderCosmosRogueShadow5345(0);
                }
                return new FrostHunterFragmentTransactionPixelFusion2476(frostHunterViewBindingEpicEpicLegend9995, frostHunterTextRecognitionUltraSpectra7563Arr);
            default:
                FrostHunterViewBindingEpicEpicLegend9995 frostHunterViewBindingEpicEpicLegend99952 = this.FrostHunterFlowMaxDragonHero5809.FrostHunterCameraXPixelTurboCosmos9814;
                FrostHunterTextRecognitionUltraSpectra7563[] frostHunterTextRecognitionUltraSpectra7563Arr2 = new FrostHunterTextRecognitionUltraSpectra7563[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    frostHunterTextRecognitionUltraSpectra7563Arr2[i2] = new FrostHunterPlaceholderCosmosRogueShadow5345(1);
                }
                return new FrostHunterFragmentTransactionPixelFusion2476(frostHunterViewBindingEpicEpicLegend99952, frostHunterTextRecognitionUltraSpectra7563Arr2);
        }
    }
}
