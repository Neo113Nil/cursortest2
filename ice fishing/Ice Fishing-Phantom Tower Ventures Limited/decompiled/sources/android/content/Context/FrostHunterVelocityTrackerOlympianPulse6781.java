package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterVelocityTrackerOlympianPulse6781 extends FrostHunterFirebaseModelDownloadConditionsNovaXTurbo4953 {
    public static FrostHunterVelocityTrackerOlympianPulse6781 FrostHunterBundlePulseFusionHero2475;

    @Override // android.content.Context.FrostHunterFirebaseModelDownloadConditionsNovaXTurbo4953
    public final int[] FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        int length = FrostHunterBundlePulseFusionHero2475().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && FrostHunterBundlePulseFusionHero2475().charAt(i) == '\n' && (FrostHunterBundlePulseFusionHero2475().charAt(i) == '\n' || (i != 0 && FrostHunterBundlePulseFusionHero2475().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !FrostHunterLifecycleBlazeGammaElite2889(i2)) {
            i2++;
        }
        return FrostHunterConstraintSetCloneMasterUltraRogue2633(i, i2);
    }

    public final boolean FrostHunterLifecycleBlazeGammaElite2889(int i) {
        if (i <= 0 || FrostHunterBundlePulseFusionHero2475().charAt(i - 1) == '\n') {
            return false;
        }
        return i == FrostHunterBundlePulseFusionHero2475().length() || FrostHunterBundlePulseFusionHero2475().charAt(i) == '\n';
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // android.content.Context.FrostHunterFirebaseModelDownloadConditionsNovaXTurbo4953
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] FrostHunterServiceEliteCelestialThunder1757(int i) {
        int length = FrostHunterBundlePulseFusionHero2475().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && FrostHunterBundlePulseFusionHero2475().charAt(i - 1) == '\n' && !FrostHunterLifecycleBlazeGammaElite2889(i)) {
            i--;
        }
        int i2 = i - 1;
        while (i2 > 0 && (FrostHunterBundlePulseFusionHero2475().charAt(i2) == '\n' || (i2 != 0 && FrostHunterBundlePulseFusionHero2475().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return FrostHunterConstraintSetCloneMasterUltraRogue2633(i2, i);
    }
}
