package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterClipboardManagerDragonPhoenix5955 extends FrostHunterVectorDrawableNovaXNebula4109 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FrostHunterClipboardManagerDragonPhoenix5955(String str, String str2) {
        super(new FrostHunterPreviewInfernoNeoDragon1742(str, r3), (Character) '=');
        char[] charArray = str2.toCharArray();
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(charArray.length == 64);
    }

    @Override // android.content.Context.FrostHunterVectorDrawableNovaXNebula4109
    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        FrostHunterCanvasInfernoVortex4700.FrostHunterDatabaseEliteShadowUltra2452(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            FrostHunterPreviewInfernoNeoDragon1742 frostHunterPreviewInfernoNeoDragon1742 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            char[] cArr = frostHunterPreviewInfernoNeoDragon1742.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            char[] cArr2 = frostHunterPreviewInfernoNeoDragon1742.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            FrostHunterAlphaAnimationNeoCosmos5761(sb, bArr, i2, i - i2);
        }
    }
}
