package android.content.Context;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterValueAnimatorShadowForceCosmos2424 {
    public int FrostHunterAlertDialogAuroraDelta3200;
    public final Context FrostHunterAlphaAnimationNeoCosmos5761;
    public IconCompat FrostHunterCameraXPixelTurboCosmos9814;
    public final boolean FrostHunterCameraXTurboCelestialHero5430;
    public int FrostHunterFlowMaxDragonHero5809;
    public FrostHunterLooperShadowNovaXFusion5903 FrostHunterFragmentBetaMegaVortex6025;
    public CharSequence FrostHunterLevelListDrawableFusionDragonHero2232;
    public CharSequence FrostHunterLifecycleBlazeGammaElite2889;
    public Bundle FrostHunterLightSensorForceFusion4241;
    public String FrostHunterLintTitanVortexQuantum9911;
    public PendingIntent FrostHunterRemoteConfigSpeedSpeed8566;
    public final Notification FrostHunterResourcesTitanHyperVision5823;
    public final ArrayList FrostHunterTextViewDragonStormMega4297;
    public final ArrayList FrostHunterConstraintSetCloneMasterUltraRogue2633 = new ArrayList();
    public final ArrayList FrostHunterBundlePulseFusionHero2475 = new ArrayList();
    public final ArrayList FrostHunterServiceEliteCelestialThunder1757 = new ArrayList();
    public boolean FrostHunterKeyframeGammaGamma1197 = true;
    public boolean FrostHunterServiceConnectionTurboPhoenixOmega6719 = false;
    public int FrostHunterScaleAnimationStrikeSpark5059 = 0;
    public int FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = 0;

    public FrostHunterValueAnimatorShadowForceCosmos2424(Context context, String str) {
        Notification notification = new Notification();
        this.FrostHunterResourcesTitanHyperVision5823 = notification;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = context;
        this.FrostHunterLintTitanVortexQuantum9911 = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.FrostHunterAlertDialogAuroraDelta3200 = 0;
        this.FrostHunterTextViewDragonStormMega4297 = new ArrayList();
        this.FrostHunterCameraXTurboCelestialHero5430 = true;
    }

    public static CharSequence FrostHunterConstraintSetCloneMasterUltraRogue2633(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification FrostHunterAlphaAnimationNeoCosmos5761() {
        Bundle bundle;
        FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 = new FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(this);
        FrostHunterValueAnimatorShadowForceCosmos2424 frostHunterValueAnimatorShadowForceCosmos2424 = (FrostHunterValueAnimatorShadowForceCosmos2424) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterKeyframeGammaGamma1197;
        FrostHunterLooperShadowNovaXFusion5903 frostHunterLooperShadowNovaXFusion5903 = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterFragmentBetaMegaVortex6025;
        if (frostHunterLooperShadowNovaXFusion5903 != null) {
            frostHunterLooperShadowNovaXFusion5903.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterAlertDialogAuroraDelta3200;
        Notification build = i >= 26 ? builder.build() : builder.build();
        if (frostHunterLooperShadowNovaXFusion5903 != null) {
            frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterFragmentBetaMegaVortex6025.getClass();
        }
        if (frostHunterLooperShadowNovaXFusion5903 != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", frostHunterLooperShadowNovaXFusion5903.FrostHunterBundlePulseFusionHero2475());
        }
        return build;
    }

    public final void FrostHunterBundlePulseFusionHero2475(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.FrostHunterAlphaAnimationNeoCosmos5761.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.FrostHunterKeyframeGammaGamma1197;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.FrostHunterConstraintSetCloneMasterUltraRogue2633 = bitmap;
            iconCompat = iconCompat2;
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = iconCompat;
    }

    public final void FrostHunterServiceEliteCelestialThunder1757(FrostHunterLooperShadowNovaXFusion5903 frostHunterLooperShadowNovaXFusion5903) {
        if (this.FrostHunterFragmentBetaMegaVortex6025 != frostHunterLooperShadowNovaXFusion5903) {
            this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterLooperShadowNovaXFusion5903;
            if (((FrostHunterValueAnimatorShadowForceCosmos2424) frostHunterLooperShadowNovaXFusion5903.FrostHunterAlphaAnimationNeoCosmos5761) != this) {
                frostHunterLooperShadowNovaXFusion5903.FrostHunterAlphaAnimationNeoCosmos5761 = this;
                FrostHunterServiceEliteCelestialThunder1757(frostHunterLooperShadowNovaXFusion5903);
            }
        }
    }
}
