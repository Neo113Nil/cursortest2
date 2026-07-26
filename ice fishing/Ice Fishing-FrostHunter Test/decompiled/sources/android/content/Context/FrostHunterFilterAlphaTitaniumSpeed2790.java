package android.content.Context;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFilterAlphaTitaniumSpeed2790 extends FrostHunterBannerAdTitaniumOmegaVortex9984 {
    @Override // android.content.Context.FrostHunterSQLiteAuroraEpicCyber8038, android.content.Context.FrostHunterGradientDrawableVortexMaxDelta9797, android.content.Context.FrostHunterColorStateListFusionNebulaPhantom2470
    public void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterAsyncTitaniumMaxNova3282 frostHunterAsyncTitaniumMaxNova3282, FrostHunterAsyncTitaniumMaxNova3282 frostHunterAsyncTitaniumMaxNova32822, Window window, View view, boolean z, boolean z2) {
        frostHunterAsyncTitaniumMaxNova3282.getClass();
        frostHunterAsyncTitaniumMaxNova32822.getClass();
        window.getClass();
        view.getClass();
        FrostHunterDisplayMetricsTurboMax7649.FrostHunterScaleAnimationStrikeSpark5059(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof FrostHunterLevelListDrawablePulseQuantumPixel6813)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        int i3 = Build.VERSION.SDK_INT;
        FrostHunterLiveDataEpicNeoPrime2305 frostHunterAssetManagerNovaAurora1369 = i3 >= 35 ? new FrostHunterAssetManagerNovaAurora1369(window) : i3 >= 30 ? new FrostHunterDebugUltraUltra2842(window) : i3 >= 26 ? new FrostHunterFlatMapPrimeHeroOlympian3220(window) : new FrostHunterGraphMegaSpark8818(window);
        frostHunterAssetManagerNovaAurora1369.FrostHunterFragmentBetaMegaVortex6025(!z);
        frostHunterAssetManagerNovaAurora1369.FrostHunterKeyframeGammaGamma1197(true ^ z2);
    }
}
