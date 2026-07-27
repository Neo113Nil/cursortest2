package androidx.profileinstaller;

import android.content.Context;
import android.content.Context.FrostHunterGraphMegaElite8576;
import android.content.Context.FrostHunterMagnetometerInfernoDragon1607;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements FrostHunterGraphMegaElite8576 {
    @Override // android.content.Context.FrostHunterGraphMegaElite8576
    public final List FrostHunterAlphaAnimationNeoCosmos5761() {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.Context.FrostHunterGraphMegaElite8576
    public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: android.content.Context.FrostHunterActionBarThunderOlympianForce5770
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new FrostHunterTextureViewFusionBlazeSpark6411(applicationContext, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new FrostHunterMagnetometerInfernoDragon1607();
    }
}
