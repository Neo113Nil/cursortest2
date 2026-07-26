package android.content.Context;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterEditTextSpeedStrikeUltra4638 implements ServiceConnection {
    public final long FrostHunterAlphaAnimationNeoCosmos5761;
    public boolean FrostHunterConstraintSetCloneMasterUltraRogue2633 = false;
    public final LinkedBlockingQueue FrostHunterBundlePulseFusionHero2475 = new LinkedBlockingQueue(1);

    public FrostHunterEditTextSpeedStrikeUltra4638(long j) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = j;
    }

    public final IBinder FrostHunterAlphaAnimationNeoCosmos5761() {
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
            return null;
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = true;
        return (IBinder) this.FrostHunterBundlePulseFusionHero2475.poll(this.FrostHunterAlphaAnimationNeoCosmos5761, TimeUnit.MILLISECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.FrostHunterBundlePulseFusionHero2475.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
