package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterInputFilterInfernoSolarCosmos2540 extends FrostHunterVectorDrawableNovaXNebula4109 {
    public final char[] FrostHunterLifecycleBlazeGammaElite2889;

    public FrostHunterInputFilterInfernoSolarCosmos2540(FrostHunterPreviewInfernoNeoDragon1742 frostHunterPreviewInfernoNeoDragon1742) {
        super(frostHunterPreviewInfernoNeoDragon1742, (Character) null);
        this.FrostHunterLifecycleBlazeGammaElite2889 = new char[512];
        char[] cArr = frostHunterPreviewInfernoNeoDragon1742.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.FrostHunterLifecycleBlazeGammaElite2889;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // android.content.Context.FrostHunterVectorDrawableNovaXNebula4109
    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(StringBuilder sb, byte[] bArr, int i) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterDatabaseEliteShadowUltra2452(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.FrostHunterLifecycleBlazeGammaElite2889;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
