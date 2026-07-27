package android.content.Context;

import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterVectorDrawableNovaXNebula4109 {
    public static final FrostHunterInputFilterInfernoSolarCosmos2540 FrostHunterServiceEliteCelestialThunder1757;
    public final FrostHunterPreviewInfernoNeoDragon1742 FrostHunterAlphaAnimationNeoCosmos5761;
    public volatile FrostHunterVectorDrawableNovaXNebula4109 FrostHunterBundlePulseFusionHero2475;
    public final Character FrostHunterConstraintSetCloneMasterUltraRogue2633;

    static {
        new FrostHunterClipboardManagerDragonPhoenix5955("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new FrostHunterClipboardManagerDragonPhoenix5955("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new FrostHunterVectorDrawableNovaXNebula4109("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new FrostHunterVectorDrawableNovaXNebula4109("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterInputFilterInfernoSolarCosmos2540(new FrostHunterPreviewInfernoNeoDragon1742("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public FrostHunterVectorDrawableNovaXNebula4109(FrostHunterPreviewInfernoNeoDragon1742 frostHunterPreviewInfernoNeoDragon1742, Character ch) {
        boolean z;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterPreviewInfernoNeoDragon1742;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = frostHunterPreviewInfernoNeoDragon1742.FrostHunterRemoteConfigSpeedSpeed8566;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z = false;
                FrostHunterCanvasInfernoVortex4700.FrostHunterMotionSceneAuroraMega2271(z, "Padding character %s was already in alphabet", ch);
                this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = ch;
            }
        }
        z = true;
        FrostHunterCanvasInfernoVortex4700.FrostHunterMotionSceneAuroraMega2271(z, "Padding character %s was already in alphabet", ch);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = ch;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(StringBuilder sb, byte[] bArr, int i, int i2) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterDatabaseEliteShadowUltra2452(i, i + i2, bArr.length);
        FrostHunterPreviewInfernoNeoDragon1742 frostHunterPreviewInfernoNeoDragon1742 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i3 = frostHunterPreviewInfernoNeoDragon1742.FrostHunterLevelListDrawableFusionDragonHero2232;
        int i4 = frostHunterPreviewInfernoNeoDragon1742.FrostHunterServiceEliteCelestialThunder1757;
        int i5 = 0;
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | (bArr[i + i6] & 255)) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(frostHunterPreviewInfernoNeoDragon1742.FrostHunterConstraintSetCloneMasterUltraRogue2633[((int) (j >>> (i7 - i5))) & frostHunterPreviewInfernoNeoDragon1742.FrostHunterBundlePulseFusionHero2475]);
            i5 += i4;
        }
        Character ch = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (ch != null) {
            while (i5 < frostHunterPreviewInfernoNeoDragon1742.FrostHunterLevelListDrawableFusionDragonHero2232 * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public void FrostHunterConstraintSetCloneMasterUltraRogue2633(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        FrostHunterCanvasInfernoVortex4700.FrostHunterDatabaseEliteShadowUltra2452(0, i, bArr.length);
        while (i2 < i) {
            FrostHunterPreviewInfernoNeoDragon1742 frostHunterPreviewInfernoNeoDragon1742 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterAlphaAnimationNeoCosmos5761(sb, bArr, i2, Math.min(frostHunterPreviewInfernoNeoDragon1742.FrostHunterLevelListDrawableFusionDragonHero2232, i - i2));
            i2 += frostHunterPreviewInfernoNeoDragon1742.FrostHunterLevelListDrawableFusionDragonHero2232;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FrostHunterVectorDrawableNovaXNebula4109) {
            FrostHunterVectorDrawableNovaXNebula4109 frostHunterVectorDrawableNovaXNebula4109 = (FrostHunterVectorDrawableNovaXNebula4109) obj;
            if (this.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterVectorDrawableNovaXNebula4109.FrostHunterAlphaAnimationNeoCosmos5761) && Objects.equals(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterVectorDrawableNovaXNebula4109.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.FrostHunterConstraintSetCloneMasterUltraRogue2633) ^ this.FrostHunterAlphaAnimationNeoCosmos5761.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        FrostHunterPreviewInfernoNeoDragon1742 frostHunterPreviewInfernoNeoDragon1742 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        sb.append(frostHunterPreviewInfernoNeoDragon1742);
        if (8 % frostHunterPreviewInfernoNeoDragon1742.FrostHunterServiceEliteCelestialThunder1757 != 0) {
            Character ch = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public FrostHunterVectorDrawableNovaXNebula4109(String str, String str2) {
        this(new FrostHunterPreviewInfernoNeoDragon1742(str, str2.toCharArray()), (Character) '=');
    }
}
