package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLiveDataScopeSparkCelestial7733 {
    public final boolean FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterMenuHyperShadowInferno4622 FrostHunterBundlePulseFusionHero2475;
    public final String FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final byte[] FrostHunterLifecycleBlazeGammaElite2889;
    public final int FrostHunterServiceEliteCelestialThunder1757;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r6.equals("cbc1") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FrostHunterLiveDataScopeSparkCelestial7733(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        char c = 0;
        int i4 = 1;
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823((i == 0) ^ (bArr2 == null));
        this.FrostHunterAlphaAnimationNeoCosmos5761 = z;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str;
        this.FrostHunterServiceEliteCelestialThunder1757 = i;
        this.FrostHunterLifecycleBlazeGammaElite2889 = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3049879:
                    if (str.equals("cenc")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                case 1:
                    i4 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.FrostHunterBundlePulseFusionHero2475 = new FrostHunterMenuHyperShadowInferno4622(i4, i2, i3, bArr);
    }
}
