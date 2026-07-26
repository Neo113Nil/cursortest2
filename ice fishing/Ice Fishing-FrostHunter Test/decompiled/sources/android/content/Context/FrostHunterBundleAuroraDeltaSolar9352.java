package android.content.Context;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterBundleAuroraDeltaSolar9352 extends FrostHunterGestureDetectorNovaPrimeHero2555 {
    public static String FrostHunterServiceConnectionTurboPhoenixOmega6719(String str) {
        if (FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterServiceInfoHyperionSparkMax9966("|")) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("marginPrefix must be non-blank string.");
            return null;
        }
        List FrostHunterDatabaseEliteShadowUltra2452 = FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterDatabaseEliteShadowUltra2452(str);
        int length = str.length();
        FrostHunterDatabaseEliteShadowUltra2452.size();
        int size = FrostHunterDatabaseEliteShadowUltra2452.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : FrostHunterDatabaseEliteShadowUltra2452) {
            int i2 = i + 1;
            if (i < 0) {
                FrostHunterCardViewHyperionAurora3829.FrostHunterNestedScrollViewThunderNovaX6772();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterServiceInfoHyperionSparkMax9966(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!FrostHunterVectorDrawableForceMax1351.FrostHunterLooperHyperionForce4133(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String substring = (i3 != -1 && FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterLintTitanVortexQuantum9911(i3, str2, "|", false)) ? str2.substring("|".length() + i3) : null;
                if (substring != null) {
                    str2 = substring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterAnimatorSetEliteQuantum4520(arrayList, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
