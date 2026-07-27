package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterSharedFlowSolarNovaXPhantom8344 extends FrostHunterManifestEclipseGammaTitanium1788 {
    public final int FrostHunterFragmentBetaMegaVortex6025;
    public final int FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public FrostHunterSharedFlowSolarNovaXPhantom8344(byte[] bArr, int i, int i2) {
        super(bArr);
        FrostHunterManifestEclipseGammaTitanium1788.FrostHunterBundlePulseFusionHero2475(i, i + i2, bArr.length);
        this.FrostHunterFragmentBetaMegaVortex6025 = i;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i2;
    }

    @Override // android.content.Context.FrostHunterManifestEclipseGammaTitanium1788
    public final byte FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        int i2 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.FrostHunterFlowMaxDragonHero5809[this.FrostHunterFragmentBetaMegaVortex6025 + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, i2, "Index > length: ", ", "));
    }

    @Override // android.content.Context.FrostHunterManifestEclipseGammaTitanium1788
    public final int FrostHunterLevelListDrawableFusionDragonHero2232() {
        return this.FrostHunterFragmentBetaMegaVortex6025;
    }

    @Override // android.content.Context.FrostHunterManifestEclipseGammaTitanium1788
    public final void FrostHunterLifecycleBlazeGammaElite2889(byte[] bArr, int i) {
        System.arraycopy(this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterFragmentBetaMegaVortex6025, bArr, 0, i);
    }

    @Override // android.content.Context.FrostHunterManifestEclipseGammaTitanium1788
    public final byte FrostHunterRemoteConfigSpeedSpeed8566(int i) {
        return this.FrostHunterFlowMaxDragonHero5809[this.FrostHunterFragmentBetaMegaVortex6025 + i];
    }

    @Override // android.content.Context.FrostHunterManifestEclipseGammaTitanium1788
    public final int size() {
        return this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
    }
}
