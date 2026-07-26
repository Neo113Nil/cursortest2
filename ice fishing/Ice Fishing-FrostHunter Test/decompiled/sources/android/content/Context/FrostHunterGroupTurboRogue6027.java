package android.content.Context;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGroupTurboRogue6027 {
    public static final Pattern FrostHunterBundlePulseFusionHero2475 = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int FrostHunterAlphaAnimationNeoCosmos5761 = -1;
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633 = -1;

    public final boolean FrostHunterAlphaAnimationNeoCosmos5761(String str) {
        Matcher matcher = FrostHunterBundlePulseFusionHero2475.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            String str2 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.FrostHunterAlphaAnimationNeoCosmos5761 = parseInt;
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if ((r7.FrostHunterConstraintSetCloneMasterUltraRogue2633.equals("com.apple.iTunes") && r7.FrostHunterBundlePulseFusionHero2475.equals("iTunSMPB")) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterDialogFragmentTitaniumEpicMega8033 frostHunterDialogFragmentTitaniumEpicMega8033) {
        FrostHunterWithContextVisionPixelCosmos6861 frostHunterWithContextVisionPixelCosmos6861;
        frostHunterDialogFragmentTitaniumEpicMega8033.getClass();
        FrostHunterTextureViewBlazePhantomDragon5593 FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterAlertDialogAuroraDelta3200();
        FrostHunterWithContextVisionPixelCosmos6861[] frostHunterWithContextVisionPixelCosmos6861Arr = frostHunterDialogFragmentTitaniumEpicMega8033.FrostHunterAlphaAnimationNeoCosmos5761;
        int length = frostHunterWithContextVisionPixelCosmos6861Arr.length;
        int i = 0;
        while (true) {
            FrostHunterWithContextVisionPixelCosmos6861 frostHunterWithContextVisionPixelCosmos68612 = null;
            if (i >= length) {
                break;
            }
            FrostHunterWithContextVisionPixelCosmos6861 frostHunterWithContextVisionPixelCosmos68613 = frostHunterWithContextVisionPixelCosmos6861Arr[i];
            if (FrostHunterConfigurationQuantumEclipseRogue4956.class.isAssignableFrom(frostHunterWithContextVisionPixelCosmos68613.getClass())) {
                FrostHunterWithContextVisionPixelCosmos6861 frostHunterWithContextVisionPixelCosmos68614 = (FrostHunterWithContextVisionPixelCosmos6861) FrostHunterConfigurationQuantumEclipseRogue4956.class.cast(frostHunterWithContextVisionPixelCosmos68613);
                if (((FrostHunterConfigurationQuantumEclipseRogue4956) frostHunterWithContextVisionPixelCosmos68614).FrostHunterBundlePulseFusionHero2475.equals("iTunSMPB")) {
                    frostHunterWithContextVisionPixelCosmos68612 = frostHunterWithContextVisionPixelCosmos68614;
                }
            }
            if (frostHunterWithContextVisionPixelCosmos68612 != null) {
                FrostHunterAlertDialogAuroraDelta3200.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterWithContextVisionPixelCosmos68612);
            }
            i++;
        }
        FrostHunterAnimatorOlympianPhantomElite2405 listIterator = FrostHunterAlertDialogAuroraDelta3200.FrostHunterLevelListDrawableFusionDragonHero2232().listIterator(0);
        while (listIterator.hasNext()) {
            if (FrostHunterAlphaAnimationNeoCosmos5761(((FrostHunterConfigurationQuantumEclipseRogue4956) listIterator.next()).FrostHunterServiceEliteCelestialThunder1757)) {
                return;
            }
        }
        FrostHunterTextureViewBlazePhantomDragon5593 FrostHunterAlertDialogAuroraDelta32002 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterAlertDialogAuroraDelta3200();
        for (FrostHunterWithContextVisionPixelCosmos6861 frostHunterWithContextVisionPixelCosmos68615 : frostHunterWithContextVisionPixelCosmos6861Arr) {
            if (FrostHunterFragmentManagerPrimeVisionVortex8634.class.isAssignableFrom(frostHunterWithContextVisionPixelCosmos68615.getClass())) {
                frostHunterWithContextVisionPixelCosmos6861 = (FrostHunterWithContextVisionPixelCosmos6861) FrostHunterFragmentManagerPrimeVisionVortex8634.class.cast(frostHunterWithContextVisionPixelCosmos68615);
                FrostHunterFragmentManagerPrimeVisionVortex8634 frostHunterFragmentManagerPrimeVisionVortex8634 = (FrostHunterFragmentManagerPrimeVisionVortex8634) frostHunterWithContextVisionPixelCosmos6861;
            }
            frostHunterWithContextVisionPixelCosmos6861 = null;
            if (frostHunterWithContextVisionPixelCosmos6861 != null) {
                FrostHunterAlertDialogAuroraDelta32002.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterWithContextVisionPixelCosmos6861);
            }
        }
        FrostHunterAnimatorOlympianPhantomElite2405 listIterator2 = FrostHunterAlertDialogAuroraDelta32002.FrostHunterLevelListDrawableFusionDragonHero2232().listIterator(0);
        while (listIterator2.hasNext() && !FrostHunterAlphaAnimationNeoCosmos5761(((FrostHunterFragmentManagerPrimeVisionVortex8634) listIterator2.next()).FrostHunterServiceEliteCelestialThunder1757)) {
        }
    }
}
