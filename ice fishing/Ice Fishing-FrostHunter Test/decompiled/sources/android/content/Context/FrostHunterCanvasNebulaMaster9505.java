package android.content.Context;

import android.content.Context;
import com.adjust.sdk.Reflection;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCanvasNebulaMaster9505 implements Callable {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ Object FrostHunterBundlePulseFusionHero2475;
    public final /* synthetic */ Context FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public /* synthetic */ FrostHunterCanvasNebulaMaster9505(int i, Context context, Object obj) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = context;
        this.FrostHunterBundlePulseFusionHero2475 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Reflection.getPlayAdId(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterBundlePulseFusionHero2475);
            default:
                return Reflection.isPlayTrackingEnabled(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterBundlePulseFusionHero2475);
        }
    }
}
