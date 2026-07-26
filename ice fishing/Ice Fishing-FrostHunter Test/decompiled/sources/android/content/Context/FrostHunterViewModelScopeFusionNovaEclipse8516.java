package android.content.Context;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterViewModelScopeFusionNovaEclipse8516 {
    public static volatile ScheduledExecutorService FrostHunterLightSensorForceFusion4241;
    public static final Object FrostHunterScaleAnimationStrikeSpark5059 = new Object();
    public final String FrostHunterAlertDialogAuroraDelta3200;
    public final Object FrostHunterAlphaAnimationNeoCosmos5761;
    public int FrostHunterBundlePulseFusionHero2475;
    public FrostHunterFragmentRogueNovaXPhantom8209 FrostHunterCameraXPixelTurboCosmos9814;
    public final PowerManager.WakeLock FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final FrostHunterChipSpeedTitan5326 FrostHunterFlowMaxDragonHero5809;
    public final AtomicInteger FrostHunterFragmentBetaMegaVortex6025;
    public final HashMap FrostHunterKeyframeGammaGamma1197;
    public final HashSet FrostHunterLevelListDrawableFusionDragonHero2232;
    public long FrostHunterLifecycleBlazeGammaElite2889;
    public boolean FrostHunterRemoteConfigSpeedSpeed8566;
    public final ScheduledExecutorService FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public ScheduledFuture FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterViewModelScopeFusionNovaEclipse8516(Context context) {
        boolean z;
        String packageName = context.getPackageName();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = new Object();
        this.FrostHunterBundlePulseFusionHero2475 = 0;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = new HashSet();
        this.FrostHunterRemoteConfigSpeedSpeed8566 = true;
        this.FrostHunterFlowMaxDragonHero5809 = FrostHunterChipSpeedTitan5326.FrostHunterFragmentBetaMegaVortex6025;
        this.FrostHunterKeyframeGammaGamma1197 = new HashMap();
        this.FrostHunterFragmentBetaMegaVortex6025 = new AtomicInteger(0);
        FrostHunterCardViewHyperionAurora3829.FrostHunterServiceConnectionTurboPhoenixOmega6719("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.FrostHunterCameraXPixelTurboCosmos9814 = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.FrostHunterAlertDialogAuroraDelta3200 = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.FrostHunterAlertDialogAuroraDelta3200 = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new FrostHunterLinearLayoutSolarTurboSpark3070(sb.toString());
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = FrostHunterIntentServiceSparkSolar2292.FrostHunterAlphaAnimationNeoCosmos5761;
        synchronized (FrostHunterIntentServiceSparkSolar2292.class) {
            Boolean bool = FrostHunterIntentServiceSparkSolar2292.FrostHunterBundlePulseFusionHero2475;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterCameraXTurboCelestialHero5430(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                FrostHunterIntentServiceSparkSolar2292.FrostHunterBundlePulseFusionHero2475 = Boolean.valueOf(z);
            }
        }
        if (z) {
            int i = FrostHunterBarrierStormStrikeAurora2821.FrostHunterAlphaAnimationNeoCosmos5761;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfo = FrostHunterScaleDrawableDragonStormUltra4635.FrostHunterAlphaAnimationNeoCosmos5761(context).FrostHunterAlphaAnimationNeoCosmos5761.getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        "Could not get applicationInfo from package: ".concat(packageName);
                    } else {
                        int i2 = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method2 = FrostHunterIntentServiceSparkSolar2292.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        try {
                            if (method2 != null) {
                                method2.invoke(workSource, Integer.valueOf(i2), packageName);
                            } else {
                                Method method3 = FrostHunterIntentServiceSparkSolar2292.FrostHunterAlphaAnimationNeoCosmos5761;
                                if (method3 != null) {
                                    method3.invoke(workSource, Integer.valueOf(i2));
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    "Could not find package: ".concat(packageName);
                }
            }
            if (workSource != null) {
                try {
                    this.FrostHunterConstraintSetCloneMasterUltraRogue2633.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    e.toString();
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = FrostHunterLightSensorForceFusion4241;
        if (scheduledExecutorService == null) {
            synchronized (FrostHunterScaleAnimationStrikeSpark5059) {
                try {
                    scheduledExecutorService = FrostHunterLightSensorForceFusion4241;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        FrostHunterLightSensorForceFusion4241 = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = scheduledExecutorService;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        this.FrostHunterFragmentBetaMegaVortex6025.incrementAndGet();
        long min = Math.min(60000L, Math.max(Math.min(Long.MAX_VALUE, 31622400000L), 1L));
        synchronized (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            try {
                if (!FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                    this.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterFragmentRogueNovaXPhantom8209.FrostHunterCameraXPixelTurboCosmos9814;
                    this.FrostHunterConstraintSetCloneMasterUltraRogue2633.acquire();
                    this.FrostHunterFlowMaxDragonHero5809.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.FrostHunterBundlePulseFusionHero2475++;
                if (this.FrostHunterRemoteConfigSpeedSpeed8566) {
                    TextUtils.isEmpty(null);
                }
                FrostHunterMapBlazeEclipseFusion9470 frostHunterMapBlazeEclipseFusion9470 = (FrostHunterMapBlazeEclipseFusion9470) this.FrostHunterKeyframeGammaGamma1197.get(null);
                if (frostHunterMapBlazeEclipseFusion9470 == null) {
                    frostHunterMapBlazeEclipseFusion9470 = new FrostHunterMapBlazeEclipseFusion9470();
                    this.FrostHunterKeyframeGammaGamma1197.put(null, frostHunterMapBlazeEclipseFusion9470);
                }
                frostHunterMapBlazeEclipseFusion9470.FrostHunterAlphaAnimationNeoCosmos5761++;
                this.FrostHunterFlowMaxDragonHero5809.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = Long.MAX_VALUE - elapsedRealtime > min ? elapsedRealtime + min : Long.MAX_VALUE;
                if (j > this.FrostHunterLifecycleBlazeGammaElite2889) {
                    this.FrostHunterLifecycleBlazeGammaElite2889 = j;
                    ScheduledFuture scheduledFuture = this.FrostHunterServiceEliteCelestialThunder1757;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.FrostHunterServiceEliteCelestialThunder1757 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719.schedule(new FrostHunterPlaceholderInfernoSparkTurbo6992(14, this), min, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void FrostHunterBundlePulseFusionHero2475() {
        if (this.FrostHunterFragmentBetaMegaVortex6025.decrementAndGet() < 0) {
            String.valueOf(this.FrostHunterAlertDialogAuroraDelta3200).concat(" release without a matched acquire!");
        }
        synchronized (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            try {
                if (this.FrostHunterRemoteConfigSpeedSpeed8566) {
                    TextUtils.isEmpty(null);
                }
                if (this.FrostHunterKeyframeGammaGamma1197.containsKey(null)) {
                    FrostHunterMapBlazeEclipseFusion9470 frostHunterMapBlazeEclipseFusion9470 = (FrostHunterMapBlazeEclipseFusion9470) this.FrostHunterKeyframeGammaGamma1197.get(null);
                    if (frostHunterMapBlazeEclipseFusion9470 != null) {
                        int i = frostHunterMapBlazeEclipseFusion9470.FrostHunterAlphaAnimationNeoCosmos5761 - 1;
                        frostHunterMapBlazeEclipseFusion9470.FrostHunterAlphaAnimationNeoCosmos5761 = i;
                        if (i == 0) {
                            this.FrostHunterKeyframeGammaGamma1197.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.FrostHunterAlertDialogAuroraDelta3200).concat(" counter does not exist");
                }
                FrostHunterLifecycleBlazeGammaElite2889();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        boolean z;
        synchronized (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            z = this.FrostHunterBundlePulseFusionHero2475 > 0;
        }
        return z;
    }

    public final void FrostHunterLifecycleBlazeGammaElite2889() {
        synchronized (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            try {
                if (FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                    if (this.FrostHunterRemoteConfigSpeedSpeed8566) {
                        int i = this.FrostHunterBundlePulseFusionHero2475 - 1;
                        this.FrostHunterBundlePulseFusionHero2475 = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.FrostHunterBundlePulseFusionHero2475 = 0;
                    }
                    FrostHunterServiceEliteCelestialThunder1757();
                    Iterator it = this.FrostHunterKeyframeGammaGamma1197.values().iterator();
                    while (it.hasNext()) {
                        ((FrostHunterMapBlazeEclipseFusion9470) it.next()).FrostHunterAlphaAnimationNeoCosmos5761 = 0;
                    }
                    this.FrostHunterKeyframeGammaGamma1197.clear();
                    ScheduledFuture scheduledFuture = this.FrostHunterServiceEliteCelestialThunder1757;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.FrostHunterServiceEliteCelestialThunder1757 = null;
                        this.FrostHunterLifecycleBlazeGammaElite2889 = 0L;
                    }
                    if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633.isHeld()) {
                        try {
                            try {
                                this.FrostHunterConstraintSetCloneMasterUltraRogue2633.release();
                                if (this.FrostHunterCameraXPixelTurboCosmos9814 != null) {
                                    this.FrostHunterCameraXPixelTurboCosmos9814 = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                String.valueOf(this.FrostHunterAlertDialogAuroraDelta3200).concat(" failed to release!");
                                if (this.FrostHunterCameraXPixelTurboCosmos9814 != null) {
                                    this.FrostHunterCameraXPixelTurboCosmos9814 = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.FrostHunterCameraXPixelTurboCosmos9814 != null) {
                                this.FrostHunterCameraXPixelTurboCosmos9814 = null;
                            }
                            throw th;
                        }
                    } else {
                        String.valueOf(this.FrostHunterAlertDialogAuroraDelta3200).concat(" should be held!");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void FrostHunterServiceEliteCelestialThunder1757() {
        HashSet hashSet = this.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
    }
}
