package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterVideoCaptureElitePhantomTurbo8587 {
    public final FrostHunterWindowManagerPrimeHeroMaster3405 FrostHunterAlphaAnimationNeoCosmos5761;
    public final byte[] FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterVideoCaptureElitePhantomTurbo8587(FrostHunterWindowManagerPrimeHeroMaster3405 frostHunterWindowManagerPrimeHeroMaster3405, byte[] bArr) {
        if (frostHunterWindowManagerPrimeHeroMaster3405 == null) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterCameraXPixelTurboCosmos9814("encoding is null");
            throw null;
        }
        if (bArr == null) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterCameraXPixelTurboCosmos9814("bytes is null");
            throw null;
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterWindowManagerPrimeHeroMaster3405;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterVideoCaptureElitePhantomTurbo8587)) {
            return false;
        }
        FrostHunterVideoCaptureElitePhantomTurbo8587 frostHunterVideoCaptureElitePhantomTurbo8587 = (FrostHunterVideoCaptureElitePhantomTurbo8587) obj;
        if (this.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterVideoCaptureElitePhantomTurbo8587.FrostHunterAlphaAnimationNeoCosmos5761)) {
            return Arrays.equals(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterVideoCaptureElitePhantomTurbo8587.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.FrostHunterConstraintSetCloneMasterUltraRogue2633) ^ ((this.FrostHunterAlphaAnimationNeoCosmos5761.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", bytes=[...]}";
    }
}
