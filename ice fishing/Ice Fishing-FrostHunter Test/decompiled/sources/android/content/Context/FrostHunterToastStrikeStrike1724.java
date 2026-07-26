package android.content.Context;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterToastStrikeStrike1724 extends FrostHunterLooperShadowNovaXFusion5903 {
    public IconCompat FrostHunterBundlePulseFusionHero2475;
    public IconCompat FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public boolean FrostHunterServiceEliteCelestialThunder1757;

    @Override // android.content.Context.FrostHunterLooperShadowNovaXFusion5903
    public final void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849) {
        Bitmap FrostHunterAlphaAnimationNeoCosmos5761;
        Notification.Builder builder = (Notification.Builder) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterAlertDialogAuroraDelta3200;
        Context context = (Context) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterFlowMaxDragonHero5809;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                FrostHunterAnalyticsEpicMax8998.FrostHunterAlphaAnimationNeoCosmos5761(bigContentTitle, iconCompat.FrostHunterLevelListDrawableFusionDragonHero2232(context));
            } else if (iconCompat.FrostHunterServiceEliteCelestialThunder1757() == 1) {
                IconCompat iconCompat2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                int i = iconCompat2.FrostHunterAlphaAnimationNeoCosmos5761;
                if (i == -1) {
                    Object obj = iconCompat2.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    FrostHunterAlphaAnimationNeoCosmos5761 = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    FrostHunterAlphaAnimationNeoCosmos5761 = (Bitmap) iconCompat2.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                } else {
                    if (i != 5) {
                        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(iconCompat2, "called getBitmap() on ");
                        return;
                    }
                    FrostHunterAlphaAnimationNeoCosmos5761 = IconCompat.FrostHunterAlphaAnimationNeoCosmos5761((Bitmap) iconCompat2.FrostHunterConstraintSetCloneMasterUltraRogue2633, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(FrostHunterAlphaAnimationNeoCosmos5761);
            }
        }
        if (this.FrostHunterServiceEliteCelestialThunder1757) {
            IconCompat iconCompat3 = this.FrostHunterBundlePulseFusionHero2475;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.FrostHunterLevelListDrawableFusionDragonHero2232(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            FrostHunterAnalyticsEpicMax8998.FrostHunterBundlePulseFusionHero2475(bigContentTitle, false);
            FrostHunterAnalyticsEpicMax8998.FrostHunterConstraintSetCloneMasterUltraRogue2633(bigContentTitle, null);
        }
    }

    @Override // android.content.Context.FrostHunterLooperShadowNovaXFusion5903
    public final String FrostHunterBundlePulseFusionHero2475() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
