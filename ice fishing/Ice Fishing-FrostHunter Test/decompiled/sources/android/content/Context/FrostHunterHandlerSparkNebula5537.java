package android.content.Context;

import android.app.NotificationChannel;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager$AutofillCallback;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract /* synthetic */ class FrostHunterHandlerSparkNebula5537 {
    public static /* synthetic */ NotificationChannel FrostHunterBundlePulseFusionHero2475(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* synthetic */ NotificationChannel FrostHunterDatabaseEliteShadowUltra2452(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* bridge */ /* synthetic */ AutofillManager$AutofillCallback FrostHunterLevelListDrawableFusionDragonHero2232(Object obj) {
        return (AutofillManager$AutofillCallback) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillId FrostHunterLifecycleBlazeGammaElite2889(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ boolean FrostHunterMeteringPointBetaCyber9571(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }
}
