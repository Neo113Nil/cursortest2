package android.content.Context;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMotionLayoutNovaXSpeedAlpha4895 extends FrostHunterValueAnimatorHyperNebulaUltra9912 {
    public final Context FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ FrostHunterFragmentLegendHyperion4464 FrostHunterConstraintSetCloneMasterUltraRogue2633;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrostHunterMotionLayoutNovaXSpeedAlpha4895(FrostHunterFragmentLegendHyperion4464 frostHunterFragmentLegendHyperion4464, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterFragmentLegendHyperion4464;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        int i = FrostHunterFlipAnimationDragonTurbo1196.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterFragmentLegendHyperion4464 frostHunterFragmentLegendHyperion4464 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        Context context = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterFragmentLegendHyperion4464.FrostHunterConstraintSetCloneMasterUltraRogue2633(context, i);
        AtomicBoolean atomicBoolean = FrostHunterRunnablePhantomVisionHyperion4859.FrostHunterAlphaAnimationNeoCosmos5761;
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633 == 1 || FrostHunterConstraintSetCloneMasterUltraRogue2633 == 2 || FrostHunterConstraintSetCloneMasterUltraRogue2633 == 3 || FrostHunterConstraintSetCloneMasterUltraRogue2633 == 9) {
            Intent FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterFragmentLegendHyperion4464.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue2633, context, "n");
            frostHunterFragmentLegendHyperion4464.FrostHunterLevelListDrawableFusionDragonHero2232(context, FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterAlphaAnimationNeoCosmos5761 == null ? null : PendingIntent.getActivity(context, 0, FrostHunterAlphaAnimationNeoCosmos5761, 201326592));
        }
    }
}
