package android.content.Context;

import android.os.HandlerThread;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterFlatMapSparkVortex7204 implements FrostHunterFragmentTransactionTitanHero2107 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ int FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterFlatMapSparkVortex7204(int i, int i2) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i2;
        this.FrostHunterFlowMaxDragonHero5809 = i;
    }

    @Override // android.content.Context.FrostHunterFragmentTransactionTitanHero2107
    public final Object get() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i2 = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new HandlerThread(FrostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterFragmentBetaMegaVortex6025("ExoPlayer:MediaCodecAsyncAdapter:", i2));
            default:
                return new HandlerThread(FrostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterFragmentBetaMegaVortex6025("ExoPlayer:MediaCodecQueueingThread:", i2));
        }
    }
}
