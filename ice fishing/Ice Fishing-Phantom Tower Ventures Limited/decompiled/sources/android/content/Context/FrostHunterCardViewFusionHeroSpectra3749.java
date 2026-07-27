package android.content.Context;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.HandlerThread;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCardViewFusionHeroSpectra3749 {
    public static FrostHunterCardViewFusionHeroSpectra3749 FrostHunterLifecycleBlazeGammaElite2889;
    public int FrostHunterAlphaAnimationNeoCosmos5761;
    public Object FrostHunterBundlePulseFusionHero2475;
    public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public Object FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterCardViewFusionHeroSpectra3749(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterDataBindingNovaXMax2962(this);
        this.FrostHunterAlphaAnimationNeoCosmos5761 = 1;
        this.FrostHunterBundlePulseFusionHero2475 = scheduledExecutorService;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = context.getApplicationContext();
    }

    public static synchronized FrostHunterCardViewFusionHeroSpectra3749 FrostHunterFragmentBetaMegaVortex6025(Context context) {
        FrostHunterCardViewFusionHeroSpectra3749 frostHunterCardViewFusionHeroSpectra3749;
        synchronized (FrostHunterCardViewFusionHeroSpectra3749.class) {
            try {
                if (FrostHunterLifecycleBlazeGammaElite2889 == null) {
                    FrostHunterLifecycleBlazeGammaElite2889 = new FrostHunterCardViewFusionHeroSpectra3749(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new FrostHunterJobSchedulerPhoenixRogue9514("MessengerIpcClient"))));
                }
                frostHunterCardViewFusionHeroSpectra3749 = FrostHunterLifecycleBlazeGammaElite2889;
            } catch (Throwable th) {
                throw th;
            }
        }
        return frostHunterCardViewFusionHeroSpectra3749;
    }

    public void FrostHunterAlertDialogAuroraDelta3200() {
        ((Paint) this.FrostHunterConstraintSetCloneMasterUltraRogue2633).setStrokeJoin(Paint.Join.MITER);
    }

    public int FrostHunterAlphaAnimationNeoCosmos5761() {
        Paint.Cap strokeCap = ((Paint) this.FrostHunterConstraintSetCloneMasterUltraRogue2633).getStrokeCap();
        int i = strokeCap == null ? -1 : FrostHunterPermissionDragonBlazeHyperion6653.FrostHunterAlphaAnimationNeoCosmos5761[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public void FrostHunterBundlePulseFusionHero2475() {
        HandlerThread handlerThread;
        synchronized (this.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            try {
                FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(this.FrostHunterAlphaAnimationNeoCosmos5761 > 0);
                int i = this.FrostHunterAlphaAnimationNeoCosmos5761 - 1;
                this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.FrostHunterServiceEliteCelestialThunder1757) != null) {
                    handlerThread.quit();
                    this.FrostHunterServiceEliteCelestialThunder1757 = null;
                    this.FrostHunterBundlePulseFusionHero2475 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void FrostHunterCameraXPixelTurboCosmos9814(Shader shader) {
        this.FrostHunterBundlePulseFusionHero2475 = shader;
        ((Paint) this.FrostHunterConstraintSetCloneMasterUltraRogue2633).setShader(shader);
    }

    public int FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        Paint.Join strokeJoin = ((Paint) this.FrostHunterConstraintSetCloneMasterUltraRogue2633).getStrokeJoin();
        int i = strokeJoin == null ? -1 : FrostHunterPermissionDragonBlazeHyperion6653.FrostHunterConstraintSetCloneMasterUltraRogue2633[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public void FrostHunterFlowMaxDragonHero5809(int i) {
        ((Paint) this.FrostHunterConstraintSetCloneMasterUltraRogue2633).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void FrostHunterKeyframeGammaGamma1197(int i) {
        ((Paint) this.FrostHunterConstraintSetCloneMasterUltraRogue2633).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public void FrostHunterLevelListDrawableFusionDragonHero2232(long j) {
        ((Paint) this.FrostHunterConstraintSetCloneMasterUltraRogue2633).setColor(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterRemoteConfigThunderShadow4435(j));
    }

    public void FrostHunterLifecycleBlazeGammaElite2889(int i) {
        if (this.FrostHunterAlphaAnimationNeoCosmos5761 == i) {
            return;
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        Paint paint = (Paint) this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(FrostHunterRemoteConfigPhantomDelta1739.FrostHunterTransitionListenerPulseVortexCosmos7949(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(FrostHunterRemoteConfigPhantomDelta1739.FrostHunterRemoteConfigThunderShadow4435(i)));
        }
    }

    public void FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterAlphaAnimationTurboTitanium9413 frostHunterAlphaAnimationTurboTitanium9413) {
        this.FrostHunterServiceEliteCelestialThunder1757 = frostHunterAlphaAnimationTurboTitanium9413;
        ((Paint) this.FrostHunterConstraintSetCloneMasterUltraRogue2633).setColorFilter(frostHunterAlphaAnimationTurboTitanium9413 != null ? frostHunterAlphaAnimationTurboTitanium9413.FrostHunterAlphaAnimationNeoCosmos5761 : null);
    }

    public synchronized FrostHunterGradientDrawablePrimeSpectraUltra1716 FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterShapeAppearanceNebulaAurora4980 frostHunterShapeAppearanceNebulaAurora4980) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(frostHunterShapeAppearanceNebulaAurora4980.toString());
            }
            if (!((FrostHunterDataBindingNovaXMax2962) this.FrostHunterServiceEliteCelestialThunder1757).FrostHunterServiceEliteCelestialThunder1757(frostHunterShapeAppearanceNebulaAurora4980)) {
                FrostHunterDataBindingNovaXMax2962 frostHunterDataBindingNovaXMax2962 = new FrostHunterDataBindingNovaXMax2962(this);
                this.FrostHunterServiceEliteCelestialThunder1757 = frostHunterDataBindingNovaXMax2962;
                frostHunterDataBindingNovaXMax2962.FrostHunterServiceEliteCelestialThunder1757(frostHunterShapeAppearanceNebulaAurora4980);
            }
        } catch (Throwable th) {
            throw th;
        }
        return frostHunterShapeAppearanceNebulaAurora4980.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    public void FrostHunterServiceEliteCelestialThunder1757(float f) {
        ((Paint) this.FrostHunterConstraintSetCloneMasterUltraRogue2633).setAlpha((int) Math.rint(f * 255.0f));
    }

    public FrostHunterCardViewFusionHeroSpectra3749(Paint paint) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = paint;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = 3;
    }

    public FrostHunterCardViewFusionHeroSpectra3749() {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new Object();
        this.FrostHunterBundlePulseFusionHero2475 = null;
        this.FrostHunterServiceEliteCelestialThunder1757 = null;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = 0;
    }
}
