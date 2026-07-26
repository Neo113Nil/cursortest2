package android.content.Context;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterOnItemLongClickListenerForcePhantom5597 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ FrostHunterLocationManagerBlazeTitanium3991 FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public /* synthetic */ FrostHunterOnItemLongClickListenerForcePhantom5597(FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber8582, FrostHunterLocationManagerBlazeTitanium3991 frostHunterLocationManagerBlazeTitanium3991, int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterLocationManagerBlazeTitanium3991;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterLocationManagerBlazeTitanium3991 frostHunterLocationManagerBlazeTitanium3991 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Handler handler = frostHunterLocationManagerBlazeTitanium3991.FrostHunterCameraXPixelTurboCosmos9814;
                if (Build.VERSION.SDK_INT >= 30) {
                    frostHunterLocationManagerBlazeTitanium3991.FrostHunterAlphaAnimationNeoCosmos5761(j);
                    break;
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    break;
                }
            default:
                Handler handler2 = frostHunterLocationManagerBlazeTitanium3991.FrostHunterCameraXPixelTurboCosmos9814;
                if (Build.VERSION.SDK_INT >= 30) {
                    frostHunterLocationManagerBlazeTitanium3991.FrostHunterAlphaAnimationNeoCosmos5761(j);
                    break;
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    break;
                }
        }
    }
}
