package android.content.Context;

import android.util.Base64;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterCameraFusionOlympian7678 implements FrostHunterFragmentTransactionTitanHero2107 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;

    public /* synthetic */ FrostHunterCameraFusionOlympian7678(int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
    }

    @Override // android.content.Context.FrostHunterFragmentTransactionTitanHero2107
    public final Object get() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                byte[] bArr = new byte[12];
                FrostHunterLayoutVisionBlaze2953.FrostHunterFlowMaxDragonHero5809.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 1:
                return new FrostHunterMeteringPointEclipseTitan1504();
            case 2:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            default:
                throw new IllegalStateException();
        }
    }
}
