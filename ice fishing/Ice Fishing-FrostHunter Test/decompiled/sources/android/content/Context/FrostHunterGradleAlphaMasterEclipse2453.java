package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterGradleAlphaMasterEclipse2453 implements Comparator {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Object FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterGradleAlphaMasterEclipse2453(int i, Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj3 = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                for (FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473 : (FrostHunterCombineLegendMegaPrime5473[]) obj3) {
                    int FrostHunterTextViewDragonStormMega4297 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterTextViewDragonStormMega4297((Comparable) frostHunterCombineLegendMegaPrime5473.FrostHunterAlphaAnimationNeoCosmos5761(obj), (Comparable) frostHunterCombineLegendMegaPrime5473.FrostHunterAlphaAnimationNeoCosmos5761(obj2));
                    if (FrostHunterTextViewDragonStormMega4297 != 0) {
                        return FrostHunterTextViewDragonStormMega4297;
                    }
                }
                return 0;
            case 1:
                FrostHunterNavigationAlphaCelestial5898 frostHunterNavigationAlphaCelestial5898 = (FrostHunterNavigationAlphaCelestial5898) obj3;
                return frostHunterNavigationAlphaCelestial5898.FrostHunterServiceEliteCelestialThunder1757(obj2) - frostHunterNavigationAlphaCelestial5898.FrostHunterServiceEliteCelestialThunder1757(obj);
            default:
                return ((Number) ((FrostHunterFontFamilyNeoBetaEpic8574) obj3).FrostHunterCameraXPixelTurboCosmos9814(obj, obj2)).intValue();
        }
    }
}
