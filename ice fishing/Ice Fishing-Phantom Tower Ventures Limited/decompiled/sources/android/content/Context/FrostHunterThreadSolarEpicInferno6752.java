package android.content.Context;

import android.app.Notification;
import android.content.Context;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterThreadSolarEpicInferno6752 {
    public static EdgeEffect FrostHunterAlphaAnimationNeoCosmos5761(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float FrostHunterBundlePulseFusionHero2475(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static float FrostHunterConstraintSetCloneMasterUltraRogue2633(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static void FrostHunterServiceEliteCelestialThunder1757(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }
}
