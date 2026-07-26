package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFontFamilyCyberThunder5948 {
    public static final byte[] FrostHunterLifecycleBlazeGammaElite2889 = {0, 0, 1};
    public boolean FrostHunterAlphaAnimationNeoCosmos5761;
    public int FrostHunterBundlePulseFusionHero2475;
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public byte[] FrostHunterServiceEliteCelestialThunder1757;

    public final void FrostHunterAlphaAnimationNeoCosmos5761(byte[] bArr, int i, int i2) {
        if (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            int i3 = i2 - i;
            byte[] bArr2 = this.FrostHunterServiceEliteCelestialThunder1757;
            int length = bArr2.length;
            int i4 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + i3;
            if (length < i4) {
                this.FrostHunterServiceEliteCelestialThunder1757 = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.FrostHunterServiceEliteCelestialThunder1757, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, i3);
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 += i3;
        }
    }
}
