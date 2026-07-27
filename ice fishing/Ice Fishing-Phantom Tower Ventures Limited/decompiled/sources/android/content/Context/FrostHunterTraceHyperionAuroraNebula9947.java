package android.content.Context;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.webkit.WebView;
import androidx.core.graphics.drawable.IconCompat;
import com.adjust.sdk.Constants;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.GlassNewActivity;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;
import java.util.regex.Matcher;
import java.util.zip.Adler32;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTraceHyperionAuroraNebula9947 implements FrostHunterTraceAuroraFusion8204, FrostHunterPermissionAuroraQuantumCyber5289 {
    public static volatile FrostHunterTraceHyperionAuroraNebula9947 FrostHunterFragmentBetaMegaVortex6025;
    public static final FrostHunterRoomUltraForce5592 FrostHunterLightSensorForceFusion4241;
    public static final FrostHunterRoomUltraForce5592 FrostHunterScaleAnimationStrikeSpark5059;
    public static final Object FrostHunterServiceConnectionTurboPhoenixOmega6719 = new Object();
    public Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public Object FrostHunterFlowMaxDragonHero5809;
    public Object FrostHunterKeyframeGammaGamma1197;

    static {
        long j = -9223372036854775807L;
        FrostHunterLightSensorForceFusion4241 = new FrostHunterRoomUltraForce5592(2, j);
        FrostHunterScaleAnimationStrikeSpark5059 = new FrostHunterRoomUltraForce5592(3, j);
    }

    public FrostHunterTraceHyperionAuroraNebula9947(int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        int i2 = 27;
        switch (i) {
            case 3:
                this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterVectorDrawablePulseMaxStorm8774(16);
                long[] jArr = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761;
                this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterToastHyperTitanThunder2275();
                this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterServiceInfoEclipseAurora7011(i2);
                break;
            case 15:
                this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterSQLiteMasterUltra9956(6);
                this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterSQLiteMasterUltra9956(6);
                this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterSQLiteMasterUltra9956(6);
                break;
            case 23:
                this.FrostHunterFlowMaxDragonHero5809 = new LinkedList();
                FrostHunterPaintOlympianEliteTitanium2519 frostHunterPaintOlympianEliteTitanium2519 = new FrostHunterPaintOlympianEliteTitanium2519(true);
                frostHunterPaintOlympianEliteTitanium2519.FrostHunterPagingSourceEclipseDelta8255(null);
                this.FrostHunterKeyframeGammaGamma1197 = frostHunterPaintOlympianEliteTitanium2519;
                break;
            case 24:
                FrostHunterFlowHyperionVortexDelta5013 frostHunterFlowHyperionVortexDelta5013 = FrostHunterFlowHyperionVortexDelta5013.FrostHunterKeyframeGammaGamma1197;
                this.FrostHunterAlertDialogAuroraDelta3200 = new HashSet();
                this.FrostHunterFlowMaxDragonHero5809 = frostHunterFlowHyperionVortexDelta5013;
                break;
            default:
                this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterServiceInfoEclipseAurora7011(i2);
                break;
        }
    }

    public static FrostHunterTraceHyperionAuroraNebula9947 FrostHunterServiceConnectionTurboPhoenixOmega6719(Context context) {
        if (FrostHunterFragmentBetaMegaVortex6025 == null) {
            synchronized (FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                try {
                    if (FrostHunterFragmentBetaMegaVortex6025 == null) {
                        FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterTraceHyperionAuroraNebula9947(context, 0);
                    }
                } finally {
                }
            }
        }
        return FrostHunterFragmentBetaMegaVortex6025;
    }

    public FrostHunterGradientDrawableHeroOmegaQuantum3976 FrostHunterAlertDialogAuroraDelta3200() {
        return ((FrostHunterTimerMaxMega5472) this.FrostHunterKeyframeGammaGamma1197).FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475;
    }

    @Override // android.content.Context.FrostHunterTraceAuroraFusion8204
    public FrostHunterProfilerPhantomLegendPhoenix6109 FrostHunterAlphaAnimationNeoCosmos5761() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                return (FrostHunterConstraintSetBlazeSpectra9155) this.FrostHunterKeyframeGammaGamma1197;
            default:
                return (FrostHunterLifecycleCameraControllerPulseMax9733) this.FrostHunterFlowMaxDragonHero5809;
        }
    }

    public void FrostHunterBitmapTurboDeltaNebula8743(FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350, int i, boolean z) {
        FrostHunterRoomEliteNovaCelestial5870 frostHunterRoomEliteNovaCelestial5870 = (FrostHunterRoomEliteNovaCelestial5870) this.FrostHunterAlertDialogAuroraDelta3200;
        Context context = (Context) this.FrostHunterKeyframeGammaGamma1197;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(Constants.ENCODING)));
        String str = frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterAlphaAnimationNeoCosmos5761;
        adler32.update(str.getBytes(Charset.forName(Constants.ENCODING)));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        FrostHunterAnimatorPixelNovaSolar6777 frostHunterAnimatorPixelNovaSolar6777 = frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterBundlePulseFusionHero2475;
        adler32.update(allocate.putInt(FrostHunterMotionSceneInfernoBlaze1856.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatorPixelNovaSolar6777)).array());
        byte[] bArr = frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        FrostHunterBannerAdTitanVisionDragon3523.FrostHunterResourcesTitanHyperVision5823("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((FrostHunterModelInputOutputTitanHyperion7556) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(FrostHunterMotionSceneInfernoBlaze1856.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatorPixelNovaSolar6777))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(frostHunterRoomEliteNovaCelestial5870.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatorPixelNovaSolar6777, longValue, i));
            Set set = ((FrostHunterLifecycleCameraControllerSpeedPrimeQuantum1318) frostHunterRoomEliteNovaCelestial5870.FrostHunterConstraintSetCloneMasterUltraRogue2633.get(frostHunterAnimatorPixelNovaSolar6777)).FrostHunterBundlePulseFusionHero2475;
            if (set.contains(FrostHunterKotlinEpicNebulaForce5304.FrostHunterCameraXPixelTurboCosmos9814)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(FrostHunterKotlinEpicNebulaForce5304.FrostHunterAlertDialogAuroraDelta3200)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(FrostHunterKotlinEpicNebulaForce5304.FrostHunterFlowMaxDragonHero5809)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", FrostHunterMotionSceneInfernoBlaze1856.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatorPixelNovaSolar6777));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350, Integer.valueOf(value), Long.valueOf(frostHunterRoomEliteNovaCelestial5870.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatorPixelNovaSolar6777, longValue, i)), valueOf, Integer.valueOf(i)};
            if (Log.isLoggable(FrostHunterBannerAdTitanVisionDragon3523.FrostHunterMediaPlayerCelestialBetaTitan3868("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // android.content.Context.FrostHunterPermissionAuroraQuantumCyber5289
    public void FrostHunterBundlePulseFusionHero2475(FrostHunterPaintFlagsDrawFilterPhantomRogue4543 frostHunterPaintFlagsDrawFilterPhantomRogue4543, FrostHunterAnimatorAlphaBetaNeo3591 frostHunterAnimatorAlphaBetaNeo3591, FrostHunterAnalyticsOlympianFusionOlympian6086 frostHunterAnalyticsOlympianFusionOlympian6086) {
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterPaintFlagsDrawFilterPhantomRogue4543;
        frostHunterAnalyticsOlympianFusionOlympian6086.FrostHunterAlphaAnimationNeoCosmos5761();
        frostHunterAnalyticsOlympianFusionOlympian6086.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        FrostHunterIntentServiceBetaPhoenixSolar4672 FrostHunterFragmentBetaMegaVortex60252 = frostHunterAnimatorAlphaBetaNeo3591.FrostHunterFragmentBetaMegaVortex6025(frostHunterAnalyticsOlympianFusionOlympian6086.FrostHunterServiceEliteCelestialThunder1757, 5);
        this.FrostHunterKeyframeGammaGamma1197 = FrostHunterFragmentBetaMegaVortex60252;
        FrostHunterFragmentBetaMegaVortex60252.FrostHunterBundlePulseFusionHero2475((FrostHunterFirebaseOlympianMax4818) this.FrostHunterFlowMaxDragonHero5809);
    }

    public Object FrostHunterCameraXPixelTurboCosmos9814(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.FrostHunterFlowMaxDragonHero5809;
        if (FrostHunterLooperThreadStormCyberElite6638.FrostHunterFlowMaxDragonHero5809()) {
            try {
                FrostHunterLooperThreadStormCyberElite6638.FrostHunterBundlePulseFusionHero2475(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                FrostHunterGraphMegaElite8576 frostHunterGraphMegaElite8576 = (FrostHunterGraphMegaElite8576) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterGraphMegaElite8576.FrostHunterAlphaAnimationNeoCosmos5761();
                if (!FrostHunterAlphaAnimationNeoCosmos5761.isEmpty()) {
                    for (Class cls2 : FrostHunterAlphaAnimationNeoCosmos5761) {
                        if (!hashMap.containsKey(cls2)) {
                            FrostHunterCameraXPixelTurboCosmos9814(cls2, hashSet);
                        }
                    }
                }
                obj = frostHunterGraphMegaElite8576.FrostHunterConstraintSetCloneMasterUltraRogue2633((Context) this.FrostHunterKeyframeGammaGamma1197);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new FrostHunterLinearLayoutSolarTurboSpark3070(th);
            }
        }
        return obj;
    }

    public boolean FrostHunterCameraXTurboCelestialHero5430() {
        return ((FrostHunterBarrierThunderRogue6719) this.FrostHunterAlertDialogAuroraDelta3200) != null;
    }

    public WebView FrostHunterCardViewSpectraCyber7714() {
        return (WebView) ((LinkedList) this.FrostHunterFlowMaxDragonHero5809).peekLast();
    }

    @Override // android.content.Context.FrostHunterPermissionAuroraQuantumCyber5289
    public void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868) {
        long FrostHunterServiceEliteCelestialThunder1757;
        long j;
        ((FrostHunterPaintFlagsDrawFilterPhantomRogue4543) this.FrostHunterAlertDialogAuroraDelta3200).getClass();
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterPaintFlagsDrawFilterPhantomRogue4543 frostHunterPaintFlagsDrawFilterPhantomRogue4543 = (FrostHunterPaintFlagsDrawFilterPhantomRogue4543) this.FrostHunterAlertDialogAuroraDelta3200;
        synchronized (frostHunterPaintFlagsDrawFilterPhantomRogue4543) {
            try {
                long j2 = frostHunterPaintFlagsDrawFilterPhantomRogue4543.FrostHunterBundlePulseFusionHero2475;
                FrostHunterServiceEliteCelestialThunder1757 = j2 != -9223372036854775807L ? j2 + frostHunterPaintFlagsDrawFilterPhantomRogue4543.FrostHunterConstraintSetCloneMasterUltraRogue2633 : frostHunterPaintFlagsDrawFilterPhantomRogue4543.FrostHunterServiceEliteCelestialThunder1757();
            } finally {
            }
        }
        FrostHunterPaintFlagsDrawFilterPhantomRogue4543 frostHunterPaintFlagsDrawFilterPhantomRogue45432 = (FrostHunterPaintFlagsDrawFilterPhantomRogue4543) this.FrostHunterAlertDialogAuroraDelta3200;
        synchronized (frostHunterPaintFlagsDrawFilterPhantomRogue45432) {
            j = frostHunterPaintFlagsDrawFilterPhantomRogue45432.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        }
        if (FrostHunterServiceEliteCelestialThunder1757 == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = (FrostHunterFirebaseOlympianMax4818) this.FrostHunterFlowMaxDragonHero5809;
        if (j != frostHunterFirebaseOlympianMax4818.FrostHunterTextViewDragonStormMega4297) {
            FrostHunterCamera2EpicNovaX6250 FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterFirebaseOlympianMax4818.FrostHunterAlphaAnimationNeoCosmos5761();
            FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterResourcesTitanHyperVision5823 = j;
            FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48182 = new FrostHunterFirebaseOlympianMax4818(FrostHunterAlphaAnimationNeoCosmos5761);
            this.FrostHunterFlowMaxDragonHero5809 = frostHunterFirebaseOlympianMax48182;
            ((FrostHunterIntentServiceBetaPhoenixSolar4672) this.FrostHunterKeyframeGammaGamma1197).FrostHunterBundlePulseFusionHero2475(frostHunterFirebaseOlympianMax48182);
        }
        int FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761();
        ((FrostHunterIntentServiceBetaPhoenixSolar4672) this.FrostHunterKeyframeGammaGamma1197).FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterAlphaAnimationNeoCosmos57612, frostHunterLicensingSpectraPulse8868);
        ((FrostHunterIntentServiceBetaPhoenixSolar4672) this.FrostHunterKeyframeGammaGamma1197).FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterServiceEliteCelestialThunder1757, 1, FrostHunterAlphaAnimationNeoCosmos57612, 0, null);
    }

    public void FrostHunterDatabaseEliteShadowUltra2452(long j) {
        ((FrostHunterTimerMaxMega5472) this.FrostHunterKeyframeGammaGamma1197).FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceEliteCelestialThunder1757 = j;
    }

    public void FrostHunterDialogFragmentTurboPhoenixDragon7627(int i) {
        LoudnessCodecController create;
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.FrostHunterKeyframeGammaGamma1197;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.FrostHunterKeyframeGammaGamma1197 = null;
        }
        create = LoudnessCodecController.create(i, FrostHunterDrawablePhoenixMaxGamma4162.FrostHunterCameraXPixelTurboCosmos9814, new FrostHunterRoomEntityHyperionAlphaOlympian1469(this));
        this.FrostHunterKeyframeGammaGamma1197 = create;
        Iterator it = ((HashSet) this.FrostHunterAlertDialogAuroraDelta3200).iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec((MediaCodec) it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }

    public void FrostHunterEditTextPulseHyperion1262(FrostHunterViewLegendStormDelta9630 frostHunterViewLegendStormDelta9630) {
        ((FrostHunterTimerMaxMega5472) this.FrostHunterKeyframeGammaGamma1197).FrostHunterCameraXPixelTurboCosmos9814.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterViewLegendStormDelta9630;
    }

    public boolean FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(CharSequence charSequence, int i, int i2, FrostHunterSupervisorJobLegendNova9809 frostHunterSupervisorJobLegendNova9809) {
        if ((frostHunterSupervisorJobLegendNova9809.FrostHunterBundlePulseFusionHero2475 & 3) == 0) {
            FrostHunterLinearLayoutShadowHeroPixel9710 frostHunterLinearLayoutShadowHeroPixel9710 = (FrostHunterLinearLayoutShadowHeroPixel9710) this.FrostHunterKeyframeGammaGamma1197;
            FrostHunterInterpolatorAuroraPixel1637 FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterSupervisorJobLegendNova9809.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            int FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761(8);
            if (FrostHunterAlphaAnimationNeoCosmos5761 != 0) {
                ((ByteBuffer) FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterKeyframeGammaGamma1197).getShort(FrostHunterAlphaAnimationNeoCosmos5761 + FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterCameraXPixelTurboCosmos9814);
            }
            frostHunterLinearLayoutShadowHeroPixel9710.getClass();
            ThreadLocal threadLocal = FrostHunterLinearLayoutShadowHeroPixel9710.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = frostHunterLinearLayoutShadowHeroPixel9710.FrostHunterAlphaAnimationNeoCosmos5761.hasGlyph(sb.toString());
            int i3 = frostHunterSupervisorJobLegendNova9809.FrostHunterBundlePulseFusionHero2475 & 4;
            frostHunterSupervisorJobLegendNova9809.FrostHunterBundlePulseFusionHero2475 = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (frostHunterSupervisorJobLegendNova9809.FrostHunterBundlePulseFusionHero2475 & 3) == 2;
    }

    public void FrostHunterFlowMaxDragonHero5809(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterGestureDetectorNebulaHyperEclipse2771 frostHunterGestureDetectorNebulaHyperEclipse2771 = new FrostHunterGestureDetectorNebulaHyperEclipse2771(byteArrayOutputStream, hashMap, (HashMap) this.FrostHunterAlertDialogAuroraDelta3200, (FrostHunterPagingDataBetaGammaSolar8478) this.FrostHunterKeyframeGammaGamma1197);
        FrostHunterPagingDataBetaGammaSolar8478 frostHunterPagingDataBetaGammaSolar8478 = (FrostHunterPagingDataBetaGammaSolar8478) hashMap.get(obj.getClass());
        if (frostHunterPagingDataBetaGammaSolar8478 != null) {
            frostHunterPagingDataBetaGammaSolar8478.FrostHunterAlphaAnimationNeoCosmos5761(obj, frostHunterGestureDetectorNebulaHyperEclipse2771);
            return;
        }
        throw new FrostHunterOnItemLongClickListenerPhoenixShadowDelta1361("No encoder for " + obj.getClass());
    }

    public List FrostHunterFragmentBetaMegaVortex6025() {
        if (((FrostHunterFocusMeteringActionNebulaSpectra6776) this.FrostHunterKeyframeGammaGamma1197) == null) {
            this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterFocusMeteringActionNebulaSpectra6776(this);
        }
        FrostHunterFocusMeteringActionNebulaSpectra6776 frostHunterFocusMeteringActionNebulaSpectra6776 = (FrostHunterFocusMeteringActionNebulaSpectra6776) this.FrostHunterKeyframeGammaGamma1197;
        frostHunterFocusMeteringActionNebulaSpectra6776.getClass();
        return frostHunterFocusMeteringActionNebulaSpectra6776;
    }

    public long FrostHunterKeyframeGammaGamma1197() {
        FrostHunterLevelListDrawableEpicStormPhoenix9427 frostHunterLevelListDrawableEpicStormPhoenix9427 = (FrostHunterLevelListDrawableEpicStormPhoenix9427) this.FrostHunterKeyframeGammaGamma1197;
        if (frostHunterLevelListDrawableEpicStormPhoenix9427 != null) {
            return frostHunterLevelListDrawableEpicStormPhoenix9427.FrostHunterKeyframeGammaGamma1197;
        }
        return -1L;
    }

    public FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 FrostHunterLevelListDrawableFusionDragonHero2232() {
        String str = ((String) this.FrostHunterFlowMaxDragonHero5809) == null ? " backendName" : "";
        if (((FrostHunterAnimatorPixelNovaSolar6777) this.FrostHunterKeyframeGammaGamma1197) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350((String) this.FrostHunterFlowMaxDragonHero5809, (byte[]) this.FrostHunterAlertDialogAuroraDelta3200, (FrostHunterAnimatorPixelNovaSolar6777) this.FrostHunterKeyframeGammaGamma1197);
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Missing required properties:".concat(str));
        return null;
    }

    public void FrostHunterLifecycleBlazeGammaElite2889(FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439, FrostHunterRoomEntityAuroraPixel7517 frostHunterRoomEntityAuroraPixel7517) {
        FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = (FrostHunterSQLiteMasterUltra9956) this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra99562 = (FrostHunterSQLiteMasterUltra9956) this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra99563 = (FrostHunterSQLiteMasterUltra9956) this.FrostHunterKeyframeGammaGamma1197;
        int ordinal = frostHunterRoomEntityAuroraPixel7517.ordinal();
        if (ordinal == 0) {
            frostHunterSQLiteMasterUltra9956.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439);
            frostHunterSQLiteMasterUltra99563.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439);
            return;
        }
        if (ordinal == 1) {
            frostHunterSQLiteMasterUltra99562.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439);
            frostHunterSQLiteMasterUltra99563.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439);
            return;
        }
        if (ordinal == 2) {
            if (frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterLightSensorForceFusion4241 != null) {
                frostHunterSQLiteMasterUltra99563.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439);
                return;
            } else {
                frostHunterSQLiteMasterUltra9956.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439);
                return;
            }
        }
        if (ordinal != 3) {
            FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        } else if (frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterLightSensorForceFusion4241 != null) {
            frostHunterSQLiteMasterUltra99563.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439);
        } else {
            frostHunterSQLiteMasterUltra99562.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439);
        }
    }

    public long FrostHunterLightSensorForceFusion4241() {
        return ((FrostHunterTimerMaxMega5472) this.FrostHunterKeyframeGammaGamma1197).FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceEliteCelestialThunder1757;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r1.FrostHunterKeyframeGammaGamma1197 != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        if (r1.FrostHunterKeyframeGammaGamma1197 != r11) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void FrostHunterLintTitanVortexQuantum9911(FrostHunterDigitalInkRecognitionForceHyper4284 frostHunterDigitalInkRecognitionForceHyper4284, Uri uri, Map map, long j, long j2, FrostHunterBundleCelestialNovaXRogue4240 frostHunterBundleCelestialNovaXRogue4240) {
        FrostHunterLevelListDrawableEpicStormPhoenix9427 frostHunterLevelListDrawableEpicStormPhoenix9427 = new FrostHunterLevelListDrawableEpicStormPhoenix9427(frostHunterDigitalInkRecognitionForceHyper4284, j, j2);
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterLevelListDrawableEpicStormPhoenix9427;
        if (((FrostHunterJobSchedulerBlazeCyberMega7710) this.FrostHunterAlertDialogAuroraDelta3200) != null) {
            return;
        }
        FrostHunterJobSchedulerBlazeCyberMega7710[] FrostHunterLifecycleBlazeGammaElite2889 = ((FrostHunterJavaAlphaSpark6799) this.FrostHunterFlowMaxDragonHero5809).FrostHunterLifecycleBlazeGammaElite2889(uri, map);
        int length = FrostHunterLifecycleBlazeGammaElite2889.length;
        FrostHunterAnimatorOlympianPhantomElite2405 frostHunterAnimatorOlympianPhantomElite2405 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFlowMaxDragonHero5809;
        FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterKeyframeGammaGamma1197("expectedSize", length);
        FrostHunterTextureViewBlazePhantomDragon5593 frostHunterTextureViewBlazePhantomDragon5593 = new FrostHunterTextureViewBlazePhantomDragon5593(length);
        boolean z = true;
        if (FrostHunterLifecycleBlazeGammaElite2889.length == 1) {
            this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterLifecycleBlazeGammaElite2889[0];
        } else {
            int length2 = FrostHunterLifecycleBlazeGammaElite2889.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    break;
                }
                FrostHunterJobSchedulerBlazeCyberMega7710 frostHunterJobSchedulerBlazeCyberMega7710 = FrostHunterLifecycleBlazeGammaElite2889[i];
                try {
                } catch (EOFException unused) {
                    if (((FrostHunterJobSchedulerBlazeCyberMega7710) this.FrostHunterAlertDialogAuroraDelta3200) == null) {
                    }
                } catch (Throwable th) {
                    if (((FrostHunterJobSchedulerBlazeCyberMega7710) this.FrostHunterAlertDialogAuroraDelta3200) == null && frostHunterLevelListDrawableEpicStormPhoenix9427.FrostHunterKeyframeGammaGamma1197 != j) {
                        z = false;
                    }
                    FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(z);
                    frostHunterLevelListDrawableEpicStormPhoenix9427.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 0;
                    throw th;
                }
                if (frostHunterJobSchedulerBlazeCyberMega7710.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterLevelListDrawableEpicStormPhoenix9427)) {
                    this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterJobSchedulerBlazeCyberMega7710;
                    frostHunterLevelListDrawableEpicStormPhoenix9427.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 0;
                    break;
                }
                frostHunterTextureViewBlazePhantomDragon5593.FrostHunterBundlePulseFusionHero2475(frostHunterJobSchedulerBlazeCyberMega7710.FrostHunterLifecycleBlazeGammaElite2889());
                if (((FrostHunterJobSchedulerBlazeCyberMega7710) this.FrostHunterAlertDialogAuroraDelta3200) == null) {
                }
                boolean z2 = true;
                FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(z2);
                frostHunterLevelListDrawableEpicStormPhoenix9427.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 0;
                i++;
            }
            if (((FrostHunterJobSchedulerBlazeCyberMega7710) this.FrostHunterAlertDialogAuroraDelta3200) == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                FrostHunterWorkManagerMaxTurbo1858 frostHunterWorkManagerMaxTurbo1858 = new FrostHunterWorkManagerMaxTurbo1858(", ");
                Iterator it = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterConstraintSetCloneOmegaHyperion9304(FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFragmentBetaMegaVortex6025(FrostHunterLifecycleBlazeGammaElite2889), new FrostHunterFlowHyperionVortexDelta5013(19)).iterator();
                StringBuilder sb2 = new StringBuilder();
                frostHunterWorkManagerMaxTurbo1858.FrostHunterAlphaAnimationNeoCosmos5761(sb2, it);
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                String sb3 = sb.toString();
                uri.getClass();
                throw new FrostHunterDigitalInkRecognitionForceHyperNovaX4080(sb3, frostHunterTextureViewBlazePhantomDragon5593.FrostHunterLevelListDrawableFusionDragonHero2232());
            }
        }
        ((FrostHunterJobSchedulerBlazeCyberMega7710) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterBundlePulseFusionHero2475(frostHunterBundleCelestialNovaXRogue4240);
    }

    public void FrostHunterLooperHyperionForce4133(String str) {
        if (str != null) {
            this.FrostHunterFlowMaxDragonHero5809 = str;
        } else {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterCameraXPixelTurboCosmos9814("Null backendName");
        }
    }

    public void FrostHunterLooperThreadBetaHyperionMax1000(FrostHunterVectorDrawableCompatSparkNeoNebula6539 frostHunterVectorDrawableCompatSparkNeoNebula6539) {
        FrostHunterToolbarPixelHyperion1536 frostHunterToolbarPixelHyperion1536 = (FrostHunterToolbarPixelHyperion1536) ((HashMap) this.FrostHunterFlowMaxDragonHero5809).remove(frostHunterVectorDrawableCompatSparkNeoNebula6539);
        frostHunterToolbarPixelHyperion1536.getClass();
        FrostHunterTransformForceShadowSolar6619 frostHunterTransformForceShadowSolar6619 = (FrostHunterTransformForceShadowSolar6619) ((FrostHunterMeteringPointEclipseTitan1504) this.FrostHunterKeyframeGammaGamma1197).FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.get(frostHunterToolbarPixelHyperion1536);
        if (frostHunterTransformForceShadowSolar6619 != null) {
            synchronized (frostHunterTransformForceShadowSolar6619) {
                frostHunterTransformForceShadowSolar6619.FrostHunterServiceEliteCelestialThunder1757--;
            }
        }
    }

    public void FrostHunterMeteringPointBetaCyber9571(FrostHunterGradientDrawableHeroOmegaQuantum3976 frostHunterGradientDrawableHeroOmegaQuantum3976) {
        ((FrostHunterTimerMaxMega5472) this.FrostHunterKeyframeGammaGamma1197).FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475 = frostHunterGradientDrawableHeroOmegaQuantum3976;
    }

    public void FrostHunterMotionSceneAuroraMega2271(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.FrostHunterAlertDialogAuroraDelta3200).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.FrostHunterKeyframeGammaGamma1197) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void FrostHunterRemoteConfigSpeedSpeed8566(Bundle bundle) {
        HashSet hashSet = (HashSet) this.FrostHunterAlertDialogAuroraDelta3200;
        String string = ((Context) this.FrostHunterKeyframeGammaGamma1197).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (FrostHunterGraphMegaElite8576.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    FrostHunterCameraXPixelTurboCosmos9814((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new FrostHunterLinearLayoutSolarTurboSpark3070(e);
            }
        }
    }

    public boolean FrostHunterResourcesTitanHyperVision5823() {
        return !(((FrostHunterConfigurationSpectraTitaniumTitan1011) ((FrostHunterSQLiteMasterUltra9956) this.FrostHunterFlowMaxDragonHero5809).FrostHunterFlowMaxDragonHero5809).isEmpty() && ((FrostHunterConfigurationSpectraTitaniumTitan1011) ((FrostHunterSQLiteMasterUltra9956) this.FrostHunterKeyframeGammaGamma1197).FrostHunterFlowMaxDragonHero5809).isEmpty() && ((FrostHunterConfigurationSpectraTitaniumTitan1011) ((FrostHunterSQLiteMasterUltra9956) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterFlowMaxDragonHero5809).isEmpty());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(86:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(83:268|269|(1:24)|25|26|27|(1:29)|265|31|32|(3:243|244|(72:246|(1:248)|250|(1:252)|254|(3:256|(1:258)(1:260)|259)|261|35|(1:37)|38|(1:40)|41|(3:230|(2:238|239)|(1:237))|47|(1:49)|50|(1:52)(2:220|(1:225)(1:224))|53|(1:55)(1:219)|56|(1:58)(5:209|(1:211)|212|(1:214)(1:218)|(1:216)(1:217))|59|(1:61)(6:191|(4:194|(2:202|203)(1:200)|201|192)|204|205|(1:207)|208)|62|(1:64)(1:190)|(1:66)|67|(40:186|187|(1:73)|74|(1:76)(1:181)|77|(1:79)|80|(1:82)|(1:84)|85|(1:87)|(1:89)|90|(1:92)|(1:94)|95|(23:167|168|(1:99)|100|(3:157|158|(20:160|(1:162)|163|(1:104)|105|(4:142|143|144|(2:146|(14:148|(3:109|(1:114)(1:112)|113)|115|(1:117)|118|(1:120)|121|(1:123)|124|(1:141)|126|(4:130|131|(1:133)(1:136)|134)|128|129)(2:149|150))(2:151|152))|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)(2:164|165))|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)|69|(43:182|183|(0)|74|(0)(0)|77|(0)|80|(1:177)|82|(0)|85|(1:173)|87|(0)|90|(1:171)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)|71|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129))|34|35|(0)|38|(0)|41|(2:43|226)|230|(1:232)|238|239|(1:235)|237|47|(0)|50|(0)(0)|53|(0)(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129)|22|(0)|25|26|27|(0)|265|31|32|(0)|34|35|(0)|38|(0)|41|(0)|230|(0)|238|239|(0)|237|47|(0)|50|(0)(0)|53|(0)(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129) */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01a5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x01a6, code lost:
    
        r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x00e3, code lost:
    
        if (r10 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x00f6, code lost:
    
        if (r10 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x00ab, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x00ac, code lost:
    
        r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
    
        if (r0 != null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x032f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x031e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[Catch: NameNotFoundException -> 0x00ab, TRY_LEAVE, TryCatch #12 {NameNotFoundException -> 0x00ab, blocks: (B:27:0x009f, B:29:0x00a5), top: B:26:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03e5  */
    /* JADX WARN: Type inference failed for: r0v101, types: [int] */
    /* JADX WARN: Type inference failed for: r0v121 */
    /* JADX WARN: Type inference failed for: r0v173 */
    /* JADX WARN: Type inference failed for: r0v174 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean FrostHunterScaleAnimationStrikeSpark5059() {
        FrostHunterRewardedAdStormUltra7947 frostHunterRewardedAdStormUltra7947;
        FirebaseMessagingService firebaseMessagingService;
        FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956;
        Bundle bundle;
        NotificationChannel notificationChannel;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        String packageName;
        PackageManager packageManager;
        String FrostHunterLintTitanVortexQuantum9911;
        String FrostHunterLintTitanVortexQuantum99112;
        String FrostHunterTextViewDragonStormMega4297;
        int i;
        String FrostHunterTextViewDragonStormMega42972;
        Uri defaultUri;
        String FrostHunterTextViewDragonStormMega42973;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String FrostHunterTextViewDragonStormMega42974;
        Integer valueOf;
        boolean FrostHunterLevelListDrawableFusionDragonHero2232;
        String FrostHunterTextViewDragonStormMega42975;
        Integer FrostHunterScaleAnimationStrikeSpark50592;
        Integer FrostHunterScaleAnimationStrikeSpark50593;
        Integer FrostHunterScaleAnimationStrikeSpark50594;
        String FrostHunterTextViewDragonStormMega42976;
        Long valueOf2;
        JSONArray FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        long[] jArr;
        JSONArray FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232;
        int[] iArr;
        ?? r0;
        String FrostHunterTextViewDragonStormMega42977;
        IconCompat iconCompat;
        boolean z;
        int i2;
        ApplicationInfo applicationInfo;
        if (((FrostHunterSQLiteMasterUltra9956) this.FrostHunterKeyframeGammaGamma1197).FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.FrostHunterAlertDialogAuroraDelta3200;
        if (!((KeyguardManager) firebaseMessagingService2.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService2.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String FrostHunterTextViewDragonStormMega42978 = ((FrostHunterSQLiteMasterUltra9956) this.FrostHunterKeyframeGammaGamma1197).FrostHunterTextViewDragonStormMega4297("gcm.n.image");
        if (!TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42978)) {
            try {
                frostHunterRewardedAdStormUltra7947 = new FrostHunterRewardedAdStormUltra7947(new URL(FrostHunterTextViewDragonStormMega42978));
            } catch (MalformedURLException unused) {
            }
            if (frostHunterRewardedAdStormUltra7947 != null) {
                ExecutorService executorService = (ExecutorService) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterIntentBetaElite8730 frostHunterIntentBetaElite8730 = new FrostHunterIntentBetaElite8730();
                frostHunterRewardedAdStormUltra7947.FrostHunterFlowMaxDragonHero5809 = executorService.submit(new FrostHunterDialogQuantumTurbo8340(20, frostHunterRewardedAdStormUltra7947, frostHunterIntentBetaElite8730));
                frostHunterRewardedAdStormUltra7947.FrostHunterAlertDialogAuroraDelta3200 = frostHunterIntentBetaElite8730.FrostHunterAlphaAnimationNeoCosmos5761;
            }
            firebaseMessagingService = (FirebaseMessagingService) this.FrostHunterAlertDialogAuroraDelta3200;
            frostHunterSQLiteMasterUltra9956 = (FrostHunterSQLiteMasterUltra9956) this.FrostHunterKeyframeGammaGamma1197;
            AtomicInteger atomicInteger = FrostHunterEventUltraFusion6240.FrostHunterAlphaAnimationNeoCosmos5761;
            applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String FrostHunterTextViewDragonStormMega42979 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.android_channel_id");
            if (Build.VERSION.SDK_INT >= 26) {
                if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                    if (!TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42979)) {
                        notificationChannel3 = notificationManager.getNotificationChannel(FrostHunterTextViewDragonStormMega42979);
                    }
                    FrostHunterTextViewDragonStormMega42979 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42979)) {
                        notificationChannel2 = notificationManager.getNotificationChannel(FrostHunterTextViewDragonStormMega42979);
                    }
                    notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
                    if (notificationChannel == null) {
                        int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                        notificationManager.createNotificationChannel(FrostHunterHandlerSparkNebula5537.FrostHunterBundlePulseFusionHero2475(identifier == 0 ? "Misc" : firebaseMessagingService.getString(identifier)));
                    }
                    FrostHunterTextViewDragonStormMega42979 = "fcm_fallback_notification_channel";
                    AtomicInteger atomicInteger2 = FrostHunterEventUltraFusion6240.FrostHunterAlphaAnimationNeoCosmos5761;
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    FrostHunterValueAnimatorShadowForceCosmos2424 frostHunterValueAnimatorShadowForceCosmos2424 = new FrostHunterValueAnimatorShadowForceCosmos2424(firebaseMessagingService, FrostHunterTextViewDragonStormMega42979);
                    FrostHunterLintTitanVortexQuantum9911 = frostHunterSQLiteMasterUltra9956.FrostHunterLintTitanVortexQuantum9911(resources, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(FrostHunterLintTitanVortexQuantum9911)) {
                        frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterValueAnimatorShadowForceCosmos2424.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterLintTitanVortexQuantum9911);
                    }
                    FrostHunterLintTitanVortexQuantum99112 = frostHunterSQLiteMasterUltra9956.FrostHunterLintTitanVortexQuantum9911(resources, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(FrostHunterLintTitanVortexQuantum99112)) {
                        frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterValueAnimatorShadowForceCosmos2424.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterLintTitanVortexQuantum99112);
                        FrostHunterRemoteModelManagerSparkNovaXSpark4008 frostHunterRemoteModelManagerSparkNovaXSpark4008 = new FrostHunterRemoteModelManagerSparkNovaXSpark4008();
                        frostHunterRemoteModelManagerSparkNovaXSpark4008.FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterValueAnimatorShadowForceCosmos2424.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterLintTitanVortexQuantum99112);
                        frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterServiceEliteCelestialThunder1757(frostHunterRemoteModelManagerSparkNovaXSpark4008);
                    }
                    FrostHunterTextViewDragonStormMega4297 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.icon");
                    if (!TextUtils.isEmpty(FrostHunterTextViewDragonStormMega4297) || (((i = resources.getIdentifier(FrostHunterTextViewDragonStormMega4297, "drawable", packageName)) == 0 || !FrostHunterEventUltraFusion6240.FrostHunterAlphaAnimationNeoCosmos5761(resources, i)) && ((i = resources.getIdentifier(FrostHunterTextViewDragonStormMega4297, "mipmap", packageName)) == 0 || !FrostHunterEventUltraFusion6240.FrostHunterAlphaAnimationNeoCosmos5761(resources, i)))) {
                        i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i != 0 || !FrostHunterEventUltraFusion6240.FrostHunterAlphaAnimationNeoCosmos5761(resources, i)) {
                            i = packageManager.getApplicationInfo(packageName, 0).icon;
                        }
                        if (i != 0 || !FrostHunterEventUltraFusion6240.FrostHunterAlphaAnimationNeoCosmos5761(resources, i)) {
                            i = 17301651;
                        }
                    }
                    frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823.icon = i;
                    FrostHunterTextViewDragonStormMega42972 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.sound2");
                    if (TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42972)) {
                        FrostHunterTextViewDragonStormMega42972 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.sound");
                    }
                    if (TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42972)) {
                        defaultUri = null;
                    } else if ("default".equals(FrostHunterTextViewDragonStormMega42972) || resources.getIdentifier(FrostHunterTextViewDragonStormMega42972, "raw", packageName) == 0) {
                        defaultUri = RingtoneManager.getDefaultUri(2);
                    } else {
                        defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + FrostHunterTextViewDragonStormMega42972);
                    }
                    if (defaultUri != null) {
                        Notification notification = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823;
                        notification.sound = defaultUri;
                        notification.audioStreamType = -1;
                        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
                    }
                    FrostHunterTextViewDragonStormMega42973 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.click_action");
                    if (TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42973)) {
                        String FrostHunterTextViewDragonStormMega429710 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.link_android");
                        if (TextUtils.isEmpty(FrostHunterTextViewDragonStormMega429710)) {
                            FrostHunterTextViewDragonStormMega429710 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.link");
                        }
                        Uri parse = !TextUtils.isEmpty(FrostHunterTextViewDragonStormMega429710) ? Uri.parse(FrostHunterTextViewDragonStormMega429710) : null;
                        if (parse != null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setPackage(packageName);
                            launchIntentForPackage.setData(parse);
                        } else {
                            launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                        }
                    } else {
                        launchIntentForPackage = new Intent(FrostHunterTextViewDragonStormMega42973);
                        launchIntentForPackage.setPackage(packageName);
                        launchIntentForPackage.setFlags(268435456);
                    }
                    if (launchIntentForPackage == null) {
                        activity = null;
                    } else {
                        launchIntentForPackage.addFlags(67108864);
                        Bundle bundle3 = (Bundle) frostHunterSQLiteMasterUltra9956.FrostHunterFlowMaxDragonHero5809;
                        Bundle bundle4 = new Bundle(bundle3);
                        for (String str : bundle3.keySet()) {
                            if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                bundle4.remove(str);
                            }
                        }
                        launchIntentForPackage.putExtras(bundle4);
                        if (frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("google.c.a.e")) {
                            launchIntentForPackage.putExtra("gcm.n.analytics_data", frostHunterSQLiteMasterUltra9956.FrostHunterMeteringPointBetaCyber9571());
                        }
                        activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
                    }
                    frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterRemoteConfigSpeedSpeed8566 = activity;
                    broadcast = !frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(frostHunterSQLiteMasterUltra9956.FrostHunterMeteringPointBetaCyber9571())), 1140850688);
                    if (broadcast != null) {
                        frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823.deleteIntent = broadcast;
                    }
                    FrostHunterTextViewDragonStormMega42974 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.color");
                    if (!TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42974)) {
                        try {
                            valueOf = Integer.valueOf(Color.parseColor(FrostHunterTextViewDragonStormMega42974));
                        } catch (IllegalArgumentException unused2) {
                        }
                        if (valueOf != null) {
                            frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterScaleAnimationStrikeSpark5059 = valueOf.intValue();
                        }
                        FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.sticky");
                        Notification notification2 = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823;
                        if (FrostHunterLevelListDrawableFusionDragonHero2232) {
                            notification2.flags &= -17;
                        } else {
                            notification2.flags |= 16;
                        }
                        frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.local_only");
                        FrostHunterTextViewDragonStormMega42975 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.ticker");
                        if (FrostHunterTextViewDragonStormMega42975 != null) {
                            frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823.tickerText = FrostHunterValueAnimatorShadowForceCosmos2424.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterTextViewDragonStormMega42975);
                        }
                        FrostHunterScaleAnimationStrikeSpark50592 = frostHunterSQLiteMasterUltra9956.FrostHunterScaleAnimationStrikeSpark5059("gcm.n.notification_priority");
                        if (FrostHunterScaleAnimationStrikeSpark50592 != null || FrostHunterScaleAnimationStrikeSpark50592.intValue() < -2 || FrostHunterScaleAnimationStrikeSpark50592.intValue() > 2) {
                            FrostHunterScaleAnimationStrikeSpark50592 = null;
                        }
                        if (FrostHunterScaleAnimationStrikeSpark50592 != null) {
                            frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterScaleAnimationStrikeSpark50592.intValue();
                        }
                        FrostHunterScaleAnimationStrikeSpark50593 = frostHunterSQLiteMasterUltra9956.FrostHunterScaleAnimationStrikeSpark5059("gcm.n.visibility");
                        if (FrostHunterScaleAnimationStrikeSpark50593 != null || FrostHunterScaleAnimationStrikeSpark50593.intValue() < -1 || FrostHunterScaleAnimationStrikeSpark50593.intValue() > 1) {
                            FrostHunterScaleAnimationStrikeSpark50593 = null;
                        }
                        if (FrostHunterScaleAnimationStrikeSpark50593 != null) {
                            frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = FrostHunterScaleAnimationStrikeSpark50593.intValue();
                        }
                        FrostHunterScaleAnimationStrikeSpark50594 = frostHunterSQLiteMasterUltra9956.FrostHunterScaleAnimationStrikeSpark5059("gcm.n.notification_count");
                        if (FrostHunterScaleAnimationStrikeSpark50594 != null || FrostHunterScaleAnimationStrikeSpark50594.intValue() < 0) {
                            FrostHunterScaleAnimationStrikeSpark50594 = null;
                        }
                        if (FrostHunterScaleAnimationStrikeSpark50594 != null) {
                            frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterFlowMaxDragonHero5809 = FrostHunterScaleAnimationStrikeSpark50594.intValue();
                        }
                        FrostHunterTextViewDragonStormMega42976 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.event_time");
                        if (!TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42976)) {
                            try {
                                valueOf2 = Long.valueOf(Long.parseLong(FrostHunterTextViewDragonStormMega42976));
                            } catch (NumberFormatException unused3) {
                                FrostHunterSQLiteMasterUltra9956.FrostHunterMediaPlayerCelestialBetaTitan3868("gcm.n.event_time");
                            }
                            if (valueOf2 != null) {
                                frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterKeyframeGammaGamma1197 = true;
                                frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823.when = valueOf2.longValue();
                            }
                            FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterSQLiteMasterUltra9956.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223("gcm.n.vibrate_timings");
                            if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 != null) {
                                try {
                                } catch (NumberFormatException | JSONException unused4) {
                                    FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.toString();
                                }
                                if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.length() <= 1) {
                                    throw new JSONException("vibrateTimings have invalid length");
                                }
                                int length = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.length();
                                jArr = new long[length];
                                for (int i3 = 0; i3 < length; i3++) {
                                    jArr[i3] = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.optLong(i3);
                                }
                                if (jArr != null) {
                                    frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823.vibrate = jArr;
                                }
                                FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232 = frostHunterSQLiteMasterUltra9956.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223("gcm.n.light_settings");
                                if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232 != null) {
                                    iArr = new int[3];
                                    try {
                                    } catch (IllegalArgumentException e) {
                                        FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232.toString();
                                        e.getMessage();
                                    } catch (JSONException unused5) {
                                        FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232.toString();
                                    }
                                    if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232.length() != 3) {
                                        throw new JSONException("lightSettings don't have all three fields");
                                    }
                                    int parseColor = Color.parseColor(FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232.optString(0));
                                    if (parseColor == -16777216) {
                                        throw new IllegalArgumentException("Transparent color is invalid");
                                    }
                                    iArr[0] = parseColor;
                                    iArr[1] = FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232.optInt(1);
                                    iArr[2] = FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232.optInt(2);
                                    if (iArr != null) {
                                        int i4 = iArr[0];
                                        int i5 = iArr[1];
                                        int i6 = iArr[2];
                                        Notification notification3 = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823;
                                        notification3.ledARGB = i4;
                                        notification3.ledOnMS = i5;
                                        notification3.ledOffMS = i6;
                                        notification3.flags = ((i5 == 0 || i6 == 0) ? 0 : 1) | ((-2) & notification3.flags);
                                    }
                                    boolean FrostHunterLevelListDrawableFusionDragonHero22322 = frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_sound");
                                    boolean z2 = FrostHunterLevelListDrawableFusionDragonHero22322;
                                    if (frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_vibrate_timings")) {
                                        z2 = (FrostHunterLevelListDrawableFusionDragonHero22322 ? 1 : 0) | 2;
                                    }
                                    r0 = z2;
                                    if (frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_light_settings")) {
                                        r0 = (z2 ? 1 : 0) | 4;
                                    }
                                    Notification notification4 = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823;
                                    notification4.defaults = r0;
                                    if ((r0 & 4) != 0) {
                                        notification4.flags |= 1;
                                    }
                                    FrostHunterTextViewDragonStormMega42977 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.tag");
                                    if (TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42977)) {
                                        FrostHunterTextViewDragonStormMega42977 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                    }
                                    String str2 = FrostHunterTextViewDragonStormMega42977;
                                    if (frostHunterRewardedAdStormUltra7947 != null) {
                                        try {
                                            FrostHunterGradientDrawablePrimeSpectraUltra1716 frostHunterGradientDrawablePrimeSpectraUltra1716 = frostHunterRewardedAdStormUltra7947.FrostHunterAlertDialogAuroraDelta3200;
                                            FrostHunterCardViewHyperionAurora3829.FrostHunterScaleAnimationStrikeSpark5059(frostHunterGradientDrawablePrimeSpectraUltra1716);
                                            Bitmap bitmap = (Bitmap) FrostHunterChipNovaPhantomElite7665.FrostHunterServiceEliteCelestialThunder1757(frostHunterGradientDrawablePrimeSpectraUltra1716, 5L);
                                            frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterBundlePulseFusionHero2475(bitmap);
                                            FrostHunterToastStrikeStrike1724 frostHunterToastStrikeStrike1724 = new FrostHunterToastStrikeStrike1724();
                                            if (bitmap == null) {
                                                iconCompat = null;
                                                z = true;
                                            } else {
                                                z = true;
                                                iconCompat = new IconCompat(1);
                                                iconCompat.FrostHunterConstraintSetCloneMasterUltraRogue2633 = bitmap;
                                            }
                                            frostHunterToastStrikeStrike1724.FrostHunterConstraintSetCloneMasterUltraRogue2633 = iconCompat;
                                            frostHunterToastStrikeStrike1724.FrostHunterBundlePulseFusionHero2475 = null;
                                            frostHunterToastStrikeStrike1724.FrostHunterServiceEliteCelestialThunder1757 = z;
                                            frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterServiceEliteCelestialThunder1757(frostHunterToastStrikeStrike1724);
                                        } catch (InterruptedException unused6) {
                                            frostHunterRewardedAdStormUltra7947.close();
                                            Thread.currentThread().interrupt();
                                        } catch (ExecutionException e2) {
                                            Objects.toString(e2.getCause());
                                        } catch (TimeoutException unused7) {
                                            frostHunterRewardedAdStormUltra7947.close();
                                        }
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.FrostHunterAlertDialogAuroraDelta3200).getSystemService("notification")).notify(str2, 0, frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterAlphaAnimationNeoCosmos5761());
                                    return true;
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean FrostHunterLevelListDrawableFusionDragonHero223222 = frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_sound");
                                boolean z22 = FrostHunterLevelListDrawableFusionDragonHero223222;
                                if (frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_vibrate_timings")) {
                                }
                                r0 = z22;
                                if (frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_light_settings")) {
                                }
                                Notification notification42 = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823;
                                notification42.defaults = r0;
                                if ((r0 & 4) != 0) {
                                }
                                FrostHunterTextViewDragonStormMega42977 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.tag");
                                if (TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42977)) {
                                }
                                String str22 = FrostHunterTextViewDragonStormMega42977;
                                if (frostHunterRewardedAdStormUltra7947 != null) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.FrostHunterAlertDialogAuroraDelta3200).getSystemService("notification")).notify(str22, 0, frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterAlphaAnimationNeoCosmos5761());
                                return true;
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232 = frostHunterSQLiteMasterUltra9956.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223("gcm.n.light_settings");
                            if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean FrostHunterLevelListDrawableFusionDragonHero2232222 = frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_sound");
                            boolean z222 = FrostHunterLevelListDrawableFusionDragonHero2232222;
                            if (frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_vibrate_timings")) {
                            }
                            r0 = z222;
                            if (frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_light_settings")) {
                            }
                            Notification notification422 = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823;
                            notification422.defaults = r0;
                            if ((r0 & 4) != 0) {
                            }
                            FrostHunterTextViewDragonStormMega42977 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.tag");
                            if (TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42977)) {
                            }
                            String str222 = FrostHunterTextViewDragonStormMega42977;
                            if (frostHunterRewardedAdStormUltra7947 != null) {
                            }
                            ((NotificationManager) ((FirebaseMessagingService) this.FrostHunterAlertDialogAuroraDelta3200).getSystemService("notification")).notify(str222, 0, frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterAlphaAnimationNeoCosmos5761());
                            return true;
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterSQLiteMasterUltra9956.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223("gcm.n.vibrate_timings");
                        if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232 = frostHunterSQLiteMasterUltra9956.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223("gcm.n.light_settings");
                        if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean FrostHunterLevelListDrawableFusionDragonHero22322222 = frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_sound");
                        boolean z2222 = FrostHunterLevelListDrawableFusionDragonHero22322222;
                        if (frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_vibrate_timings")) {
                        }
                        r0 = z2222;
                        if (frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_light_settings")) {
                        }
                        Notification notification4222 = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823;
                        notification4222.defaults = r0;
                        if ((r0 & 4) != 0) {
                        }
                        FrostHunterTextViewDragonStormMega42977 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.tag");
                        if (TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42977)) {
                        }
                        String str2222 = FrostHunterTextViewDragonStormMega42977;
                        if (frostHunterRewardedAdStormUltra7947 != null) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.FrostHunterAlertDialogAuroraDelta3200).getSystemService("notification")).notify(str2222, 0, frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterAlphaAnimationNeoCosmos5761());
                        return true;
                    }
                    i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i2 != 0) {
                        try {
                            valueOf = Integer.valueOf(firebaseMessagingService.getColor(i2));
                        } catch (Resources.NotFoundException unused8) {
                        }
                        if (valueOf != null) {
                        }
                        FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.sticky");
                        Notification notification22 = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823;
                        if (FrostHunterLevelListDrawableFusionDragonHero2232) {
                        }
                        frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.local_only");
                        FrostHunterTextViewDragonStormMega42975 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.ticker");
                        if (FrostHunterTextViewDragonStormMega42975 != null) {
                        }
                        FrostHunterScaleAnimationStrikeSpark50592 = frostHunterSQLiteMasterUltra9956.FrostHunterScaleAnimationStrikeSpark5059("gcm.n.notification_priority");
                        if (FrostHunterScaleAnimationStrikeSpark50592 != null) {
                        }
                        FrostHunterScaleAnimationStrikeSpark50592 = null;
                        if (FrostHunterScaleAnimationStrikeSpark50592 != null) {
                        }
                        FrostHunterScaleAnimationStrikeSpark50593 = frostHunterSQLiteMasterUltra9956.FrostHunterScaleAnimationStrikeSpark5059("gcm.n.visibility");
                        if (FrostHunterScaleAnimationStrikeSpark50593 != null) {
                        }
                        FrostHunterScaleAnimationStrikeSpark50593 = null;
                        if (FrostHunterScaleAnimationStrikeSpark50593 != null) {
                        }
                        FrostHunterScaleAnimationStrikeSpark50594 = frostHunterSQLiteMasterUltra9956.FrostHunterScaleAnimationStrikeSpark5059("gcm.n.notification_count");
                        if (FrostHunterScaleAnimationStrikeSpark50594 != null) {
                        }
                        FrostHunterScaleAnimationStrikeSpark50594 = null;
                        if (FrostHunterScaleAnimationStrikeSpark50594 != null) {
                        }
                        FrostHunterTextViewDragonStormMega42976 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.event_time");
                        if (!TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42976)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterSQLiteMasterUltra9956.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223("gcm.n.vibrate_timings");
                        if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232 = frostHunterSQLiteMasterUltra9956.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223("gcm.n.light_settings");
                        if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean FrostHunterLevelListDrawableFusionDragonHero223222222 = frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_sound");
                        boolean z22222 = FrostHunterLevelListDrawableFusionDragonHero223222222;
                        if (frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_vibrate_timings")) {
                        }
                        r0 = z22222;
                        if (frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_light_settings")) {
                        }
                        Notification notification42222 = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823;
                        notification42222.defaults = r0;
                        if ((r0 & 4) != 0) {
                        }
                        FrostHunterTextViewDragonStormMega42977 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.tag");
                        if (TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42977)) {
                        }
                        String str22222 = FrostHunterTextViewDragonStormMega42977;
                        if (frostHunterRewardedAdStormUltra7947 != null) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.FrostHunterAlertDialogAuroraDelta3200).getSystemService("notification")).notify(str22222, 0, frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterAlphaAnimationNeoCosmos5761());
                        return true;
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.sticky");
                    Notification notification222 = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823;
                    if (FrostHunterLevelListDrawableFusionDragonHero2232) {
                    }
                    frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.local_only");
                    FrostHunterTextViewDragonStormMega42975 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.ticker");
                    if (FrostHunterTextViewDragonStormMega42975 != null) {
                    }
                    FrostHunterScaleAnimationStrikeSpark50592 = frostHunterSQLiteMasterUltra9956.FrostHunterScaleAnimationStrikeSpark5059("gcm.n.notification_priority");
                    if (FrostHunterScaleAnimationStrikeSpark50592 != null) {
                    }
                    FrostHunterScaleAnimationStrikeSpark50592 = null;
                    if (FrostHunterScaleAnimationStrikeSpark50592 != null) {
                    }
                    FrostHunterScaleAnimationStrikeSpark50593 = frostHunterSQLiteMasterUltra9956.FrostHunterScaleAnimationStrikeSpark5059("gcm.n.visibility");
                    if (FrostHunterScaleAnimationStrikeSpark50593 != null) {
                    }
                    FrostHunterScaleAnimationStrikeSpark50593 = null;
                    if (FrostHunterScaleAnimationStrikeSpark50593 != null) {
                    }
                    FrostHunterScaleAnimationStrikeSpark50594 = frostHunterSQLiteMasterUltra9956.FrostHunterScaleAnimationStrikeSpark5059("gcm.n.notification_count");
                    if (FrostHunterScaleAnimationStrikeSpark50594 != null) {
                    }
                    FrostHunterScaleAnimationStrikeSpark50594 = null;
                    if (FrostHunterScaleAnimationStrikeSpark50594 != null) {
                    }
                    FrostHunterTextViewDragonStormMega42976 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.event_time");
                    if (!TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42976)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterSQLiteMasterUltra9956.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223("gcm.n.vibrate_timings");
                    if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232 = frostHunterSQLiteMasterUltra9956.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223("gcm.n.light_settings");
                    if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean FrostHunterLevelListDrawableFusionDragonHero2232222222 = frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_sound");
                    boolean z222222 = FrostHunterLevelListDrawableFusionDragonHero2232222222;
                    if (frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_vibrate_timings")) {
                    }
                    r0 = z222222;
                    if (frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_light_settings")) {
                    }
                    Notification notification422222 = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823;
                    notification422222.defaults = r0;
                    if ((r0 & 4) != 0) {
                    }
                    FrostHunterTextViewDragonStormMega42977 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.tag");
                    if (TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42977)) {
                    }
                    String str222222 = FrostHunterTextViewDragonStormMega42977;
                    if (frostHunterRewardedAdStormUltra7947 != null) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.FrostHunterAlertDialogAuroraDelta3200).getSystemService("notification")).notify(str222222, 0, frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterAlphaAnimationNeoCosmos5761());
                    return true;
                }
            }
            FrostHunterTextViewDragonStormMega42979 = null;
            AtomicInteger atomicInteger22 = FrostHunterEventUltraFusion6240.FrostHunterAlphaAnimationNeoCosmos5761;
            packageName = firebaseMessagingService.getPackageName();
            Resources resources2 = firebaseMessagingService.getResources();
            packageManager = firebaseMessagingService.getPackageManager();
            FrostHunterValueAnimatorShadowForceCosmos2424 frostHunterValueAnimatorShadowForceCosmos24242 = new FrostHunterValueAnimatorShadowForceCosmos2424(firebaseMessagingService, FrostHunterTextViewDragonStormMega42979);
            FrostHunterLintTitanVortexQuantum9911 = frostHunterSQLiteMasterUltra9956.FrostHunterLintTitanVortexQuantum9911(resources2, packageName, "gcm.n.title");
            if (!TextUtils.isEmpty(FrostHunterLintTitanVortexQuantum9911)) {
            }
            FrostHunterLintTitanVortexQuantum99112 = frostHunterSQLiteMasterUltra9956.FrostHunterLintTitanVortexQuantum9911(resources2, packageName, "gcm.n.body");
            if (!TextUtils.isEmpty(FrostHunterLintTitanVortexQuantum99112)) {
            }
            FrostHunterTextViewDragonStormMega4297 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.icon");
            if (!TextUtils.isEmpty(FrostHunterTextViewDragonStormMega4297)) {
            }
            i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i != 0) {
            }
            i = packageManager.getApplicationInfo(packageName, 0).icon;
            if (i != 0) {
            }
            i = 17301651;
            frostHunterValueAnimatorShadowForceCosmos24242.FrostHunterResourcesTitanHyperVision5823.icon = i;
            FrostHunterTextViewDragonStormMega42972 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.sound2");
            if (TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42972)) {
            }
            if (TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42972)) {
            }
            if (defaultUri != null) {
            }
            FrostHunterTextViewDragonStormMega42973 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.click_action");
            if (TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42973)) {
            }
            if (launchIntentForPackage == null) {
            }
            frostHunterValueAnimatorShadowForceCosmos24242.FrostHunterRemoteConfigSpeedSpeed8566 = activity;
            if (!frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            FrostHunterTextViewDragonStormMega42974 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.color");
            if (!TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42974)) {
            }
            i2 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i2 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.sticky");
            Notification notification2222 = frostHunterValueAnimatorShadowForceCosmos24242.FrostHunterResourcesTitanHyperVision5823;
            if (FrostHunterLevelListDrawableFusionDragonHero2232) {
            }
            frostHunterValueAnimatorShadowForceCosmos24242.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.local_only");
            FrostHunterTextViewDragonStormMega42975 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.ticker");
            if (FrostHunterTextViewDragonStormMega42975 != null) {
            }
            FrostHunterScaleAnimationStrikeSpark50592 = frostHunterSQLiteMasterUltra9956.FrostHunterScaleAnimationStrikeSpark5059("gcm.n.notification_priority");
            if (FrostHunterScaleAnimationStrikeSpark50592 != null) {
            }
            FrostHunterScaleAnimationStrikeSpark50592 = null;
            if (FrostHunterScaleAnimationStrikeSpark50592 != null) {
            }
            FrostHunterScaleAnimationStrikeSpark50593 = frostHunterSQLiteMasterUltra9956.FrostHunterScaleAnimationStrikeSpark5059("gcm.n.visibility");
            if (FrostHunterScaleAnimationStrikeSpark50593 != null) {
            }
            FrostHunterScaleAnimationStrikeSpark50593 = null;
            if (FrostHunterScaleAnimationStrikeSpark50593 != null) {
            }
            FrostHunterScaleAnimationStrikeSpark50594 = frostHunterSQLiteMasterUltra9956.FrostHunterScaleAnimationStrikeSpark5059("gcm.n.notification_count");
            if (FrostHunterScaleAnimationStrikeSpark50594 != null) {
            }
            FrostHunterScaleAnimationStrikeSpark50594 = null;
            if (FrostHunterScaleAnimationStrikeSpark50594 != null) {
            }
            FrostHunterTextViewDragonStormMega42976 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.event_time");
            if (!TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42976)) {
            }
            valueOf2 = null;
            if (valueOf2 != null) {
            }
            FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterSQLiteMasterUltra9956.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223("gcm.n.vibrate_timings");
            if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 != null) {
            }
            jArr = null;
            if (jArr != null) {
            }
            FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232 = frostHunterSQLiteMasterUltra9956.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223("gcm.n.light_settings");
            if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232 != null) {
            }
            iArr = null;
            if (iArr != null) {
            }
            boolean FrostHunterLevelListDrawableFusionDragonHero22322222222 = frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_sound");
            boolean z2222222 = FrostHunterLevelListDrawableFusionDragonHero22322222222;
            if (frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_vibrate_timings")) {
            }
            r0 = z2222222;
            if (frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_light_settings")) {
            }
            Notification notification4222222 = frostHunterValueAnimatorShadowForceCosmos24242.FrostHunterResourcesTitanHyperVision5823;
            notification4222222.defaults = r0;
            if ((r0 & 4) != 0) {
            }
            FrostHunterTextViewDragonStormMega42977 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.tag");
            if (TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42977)) {
            }
            String str2222222 = FrostHunterTextViewDragonStormMega42977;
            if (frostHunterRewardedAdStormUltra7947 != null) {
            }
            ((NotificationManager) ((FirebaseMessagingService) this.FrostHunterAlertDialogAuroraDelta3200).getSystemService("notification")).notify(str2222222, 0, frostHunterValueAnimatorShadowForceCosmos24242.FrostHunterAlphaAnimationNeoCosmos5761());
            return true;
        }
        frostHunterRewardedAdStormUltra7947 = null;
        if (frostHunterRewardedAdStormUltra7947 != null) {
        }
        firebaseMessagingService = (FirebaseMessagingService) this.FrostHunterAlertDialogAuroraDelta3200;
        frostHunterSQLiteMasterUltra9956 = (FrostHunterSQLiteMasterUltra9956) this.FrostHunterKeyframeGammaGamma1197;
        AtomicInteger atomicInteger3 = FrostHunterEventUltraFusion6240.FrostHunterAlphaAnimationNeoCosmos5761;
        applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String FrostHunterTextViewDragonStormMega429792 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT >= 26) {
        }
        FrostHunterTextViewDragonStormMega429792 = null;
        AtomicInteger atomicInteger222 = FrostHunterEventUltraFusion6240.FrostHunterAlphaAnimationNeoCosmos5761;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources22 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        FrostHunterValueAnimatorShadowForceCosmos2424 frostHunterValueAnimatorShadowForceCosmos242422 = new FrostHunterValueAnimatorShadowForceCosmos2424(firebaseMessagingService, FrostHunterTextViewDragonStormMega429792);
        FrostHunterLintTitanVortexQuantum9911 = frostHunterSQLiteMasterUltra9956.FrostHunterLintTitanVortexQuantum9911(resources22, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(FrostHunterLintTitanVortexQuantum9911)) {
        }
        FrostHunterLintTitanVortexQuantum99112 = frostHunterSQLiteMasterUltra9956.FrostHunterLintTitanVortexQuantum9911(resources22, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(FrostHunterLintTitanVortexQuantum99112)) {
        }
        FrostHunterTextViewDragonStormMega4297 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.icon");
        if (!TextUtils.isEmpty(FrostHunterTextViewDragonStormMega4297)) {
        }
        i = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i != 0) {
        }
        i = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i != 0) {
        }
        i = 17301651;
        frostHunterValueAnimatorShadowForceCosmos242422.FrostHunterResourcesTitanHyperVision5823.icon = i;
        FrostHunterTextViewDragonStormMega42972 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.sound2");
        if (TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42972)) {
        }
        if (TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42972)) {
        }
        if (defaultUri != null) {
        }
        FrostHunterTextViewDragonStormMega42973 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.click_action");
        if (TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42973)) {
        }
        if (launchIntentForPackage == null) {
        }
        frostHunterValueAnimatorShadowForceCosmos242422.FrostHunterRemoteConfigSpeedSpeed8566 = activity;
        if (!frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        FrostHunterTextViewDragonStormMega42974 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.color");
        if (!TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42974)) {
        }
        i2 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i2 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.sticky");
        Notification notification22222 = frostHunterValueAnimatorShadowForceCosmos242422.FrostHunterResourcesTitanHyperVision5823;
        if (FrostHunterLevelListDrawableFusionDragonHero2232) {
        }
        frostHunterValueAnimatorShadowForceCosmos242422.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.local_only");
        FrostHunterTextViewDragonStormMega42975 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.ticker");
        if (FrostHunterTextViewDragonStormMega42975 != null) {
        }
        FrostHunterScaleAnimationStrikeSpark50592 = frostHunterSQLiteMasterUltra9956.FrostHunterScaleAnimationStrikeSpark5059("gcm.n.notification_priority");
        if (FrostHunterScaleAnimationStrikeSpark50592 != null) {
        }
        FrostHunterScaleAnimationStrikeSpark50592 = null;
        if (FrostHunterScaleAnimationStrikeSpark50592 != null) {
        }
        FrostHunterScaleAnimationStrikeSpark50593 = frostHunterSQLiteMasterUltra9956.FrostHunterScaleAnimationStrikeSpark5059("gcm.n.visibility");
        if (FrostHunterScaleAnimationStrikeSpark50593 != null) {
        }
        FrostHunterScaleAnimationStrikeSpark50593 = null;
        if (FrostHunterScaleAnimationStrikeSpark50593 != null) {
        }
        FrostHunterScaleAnimationStrikeSpark50594 = frostHunterSQLiteMasterUltra9956.FrostHunterScaleAnimationStrikeSpark5059("gcm.n.notification_count");
        if (FrostHunterScaleAnimationStrikeSpark50594 != null) {
        }
        FrostHunterScaleAnimationStrikeSpark50594 = null;
        if (FrostHunterScaleAnimationStrikeSpark50594 != null) {
        }
        FrostHunterTextViewDragonStormMega42976 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.event_time");
        if (!TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42976)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterSQLiteMasterUltra9956.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223("gcm.n.vibrate_timings");
        if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232 = frostHunterSQLiteMasterUltra9956.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223("gcm.n.light_settings");
        if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean FrostHunterLevelListDrawableFusionDragonHero223222222222 = frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_sound");
        boolean z22222222 = FrostHunterLevelListDrawableFusionDragonHero223222222222;
        if (frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_vibrate_timings")) {
        }
        r0 = z22222222;
        if (frostHunterSQLiteMasterUltra9956.FrostHunterLevelListDrawableFusionDragonHero2232("gcm.n.default_light_settings")) {
        }
        Notification notification42222222 = frostHunterValueAnimatorShadowForceCosmos242422.FrostHunterResourcesTitanHyperVision5823;
        notification42222222.defaults = r0;
        if ((r0 & 4) != 0) {
        }
        FrostHunterTextViewDragonStormMega42977 = frostHunterSQLiteMasterUltra9956.FrostHunterTextViewDragonStormMega4297("gcm.n.tag");
        if (TextUtils.isEmpty(FrostHunterTextViewDragonStormMega42977)) {
        }
        String str22222222 = FrostHunterTextViewDragonStormMega42977;
        if (frostHunterRewardedAdStormUltra7947 != null) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.FrostHunterAlertDialogAuroraDelta3200).getSystemService("notification")).notify(str22222222, 0, frostHunterValueAnimatorShadowForceCosmos242422.FrostHunterAlphaAnimationNeoCosmos5761());
        return true;
    }

    @Override // android.content.Context.FrostHunterTraceAuroraFusion8204
    public FrostHunterFontFamilySolarSpeedCelestial8941 FrostHunterServiceEliteCelestialThunder1757() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                return (FrostHunterConstraintLayoutBetaAlphaNebula8582) this.FrostHunterAlertDialogAuroraDelta3200;
            default:
                return (FrostHunterStateListAnimatorAlphaHero4837) this.FrostHunterAlertDialogAuroraDelta3200;
        }
    }

    public void FrostHunterServiceInfoHyperionSparkMax9966(FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed4562) {
        ((FrostHunterTimerMaxMega5472) this.FrostHunterKeyframeGammaGamma1197).FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterDispatchersPrimeHeroSpeed4562;
    }

    public Object FrostHunterTextViewDragonStormMega4297(CharSequence charSequence, int i, int i2, int i3, boolean z, FrostHunterAccelerometerInfernoVortexMax5334 frostHunterAccelerometerInfernoVortexMax5334) {
        int i4;
        char c;
        FrostHunterTransitionInfernoForce6054 frostHunterTransitionInfernoForce6054 = new FrostHunterTransitionInfernoForce6054((FrostHunterDialogFragmentEpicCyber2913) ((FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterKeyframeGammaGamma1197);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                SparseArray sparseArray = frostHunterTransitionInfernoForce6054.FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterDialogFragmentEpicCyber2913 frostHunterDialogFragmentEpicCyber2913 = sparseArray == null ? null : (FrostHunterDialogFragmentEpicCyber2913) sparseArray.get(codePointAt);
                if (frostHunterTransitionInfernoForce6054.FrostHunterAlphaAnimationNeoCosmos5761 == 2) {
                    if (frostHunterDialogFragmentEpicCyber2913 != null) {
                        frostHunterTransitionInfernoForce6054.FrostHunterBundlePulseFusionHero2475 = frostHunterDialogFragmentEpicCyber2913;
                        frostHunterTransitionInfernoForce6054.FrostHunterLevelListDrawableFusionDragonHero2232++;
                    } else {
                        if (codePointAt == 65038) {
                            frostHunterTransitionInfernoForce6054.FrostHunterAlphaAnimationNeoCosmos5761();
                        } else if (codePointAt != 65039) {
                            FrostHunterDialogFragmentEpicCyber2913 frostHunterDialogFragmentEpicCyber29132 = frostHunterTransitionInfernoForce6054.FrostHunterBundlePulseFusionHero2475;
                            if (frostHunterDialogFragmentEpicCyber29132.FrostHunterConstraintSetCloneMasterUltraRogue2633 != null) {
                                if (frostHunterTransitionInfernoForce6054.FrostHunterLevelListDrawableFusionDragonHero2232 != 1) {
                                    frostHunterTransitionInfernoForce6054.FrostHunterServiceEliteCelestialThunder1757 = frostHunterDialogFragmentEpicCyber29132;
                                    frostHunterTransitionInfernoForce6054.FrostHunterAlphaAnimationNeoCosmos5761();
                                } else if (frostHunterTransitionInfernoForce6054.FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                                    frostHunterTransitionInfernoForce6054.FrostHunterServiceEliteCelestialThunder1757 = frostHunterTransitionInfernoForce6054.FrostHunterBundlePulseFusionHero2475;
                                    frostHunterTransitionInfernoForce6054.FrostHunterAlphaAnimationNeoCosmos5761();
                                } else {
                                    frostHunterTransitionInfernoForce6054.FrostHunterAlphaAnimationNeoCosmos5761();
                                }
                                c = 3;
                            } else {
                                frostHunterTransitionInfernoForce6054.FrostHunterAlphaAnimationNeoCosmos5761();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (frostHunterDialogFragmentEpicCyber2913 == null) {
                    frostHunterTransitionInfernoForce6054.FrostHunterAlphaAnimationNeoCosmos5761();
                    c = 1;
                } else {
                    frostHunterTransitionInfernoForce6054.FrostHunterAlphaAnimationNeoCosmos5761 = 2;
                    frostHunterTransitionInfernoForce6054.FrostHunterBundlePulseFusionHero2475 = frostHunterDialogFragmentEpicCyber2913;
                    frostHunterTransitionInfernoForce6054.FrostHunterLevelListDrawableFusionDragonHero2232 = 1;
                    c = 2;
                }
                frostHunterTransitionInfernoForce6054.FrostHunterLifecycleBlazeGammaElite2889 = codePointAt;
                if (c == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(charSequence, i4, i6, frostHunterTransitionInfernoForce6054.FrostHunterServiceEliteCelestialThunder1757.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
                        z2 = frostHunterAccelerometerInfernoVortexMax5334.FrostHunterLifecycleBlazeGammaElite2889(charSequence, i4, i6, frostHunterTransitionInfernoForce6054.FrostHunterServiceEliteCelestialThunder1757.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                        i5++;
                    }
                }
            }
        }
        if (frostHunterTransitionInfernoForce6054.FrostHunterAlphaAnimationNeoCosmos5761 == 2 && frostHunterTransitionInfernoForce6054.FrostHunterBundlePulseFusionHero2475.FrostHunterConstraintSetCloneMasterUltraRogue2633 != null && ((frostHunterTransitionInfernoForce6054.FrostHunterLevelListDrawableFusionDragonHero2232 > 1 || frostHunterTransitionInfernoForce6054.FrostHunterConstraintSetCloneMasterUltraRogue2633()) && i5 < i3 && z2 && (z || !FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(charSequence, i4, i6, frostHunterTransitionInfernoForce6054.FrostHunterBundlePulseFusionHero2475.FrostHunterConstraintSetCloneMasterUltraRogue2633)))) {
            frostHunterAccelerometerInfernoVortexMax5334.FrostHunterLifecycleBlazeGammaElite2889(charSequence, i4, i6, frostHunterTransitionInfernoForce6054.FrostHunterBundlePulseFusionHero2475.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        }
        return frostHunterAccelerometerInfernoVortexMax5334.FrostHunterConstraintSetCloneMasterUltraRogue2633();
    }

    @Override // android.content.Context.FrostHunterTraceAuroraFusion8204
    public void cancel() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                ((FrostHunterTraceAuroraFusion8204) this.FrostHunterFlowMaxDragonHero5809).cancel();
                break;
            default:
                ((FrostHunterLayoutInflaterNovaXTitan5170) ((FrostHunterAudioManagerNovaNovaXAurora2834) this.FrostHunterKeyframeGammaGamma1197).FrostHunterKeyframeGammaGamma1197).cancel();
                break;
        }
    }

    public /* synthetic */ FrostHunterTraceHyperionAuroraNebula9947(int i, boolean z) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
    }

    public /* synthetic */ FrostHunterTraceHyperionAuroraNebula9947(Context context, Object obj, Object obj2, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterKeyframeGammaGamma1197 = context;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj2;
    }

    public /* synthetic */ FrostHunterTraceHyperionAuroraNebula9947(Object obj, Object obj2, Object obj3, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj2;
        this.FrostHunterKeyframeGammaGamma1197 = obj3;
    }

    public FrostHunterTraceHyperionAuroraNebula9947(FrostHunterTraceAuroraFusion8204 frostHunterTraceAuroraFusion8204) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 6;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterTraceAuroraFusion8204;
        FrostHunterFontFamilySolarSpeedCelestial8941 FrostHunterServiceEliteCelestialThunder1757 = frostHunterTraceAuroraFusion8204.FrostHunterServiceEliteCelestialThunder1757();
        FrostHunterServiceEliteCelestialThunder1757.getClass();
        this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterConstraintLayoutBetaAlphaNebula8582(FrostHunterServiceEliteCelestialThunder1757);
        FrostHunterProfilerPhantomLegendPhoenix6109 FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterTraceAuroraFusion8204.FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterAlphaAnimationNeoCosmos5761.getClass();
        this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterConstraintSetBlazeSpectra9155(FrostHunterAlphaAnimationNeoCosmos5761);
    }

    public /* synthetic */ FrostHunterTraceHyperionAuroraNebula9947(int i, Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
    }

    public FrostHunterTraceHyperionAuroraNebula9947(FirebaseMessagingService firebaseMessagingService, FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956, ExecutorService executorService) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 16;
        this.FrostHunterFlowMaxDragonHero5809 = executorService;
        this.FrostHunterAlertDialogAuroraDelta3200 = firebaseMessagingService;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterSQLiteMasterUltra9956;
    }

    public FrostHunterTraceHyperionAuroraNebula9947(FrostHunterTimerMaxMega5472 frostHunterTimerMaxMega5472) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 8;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterTimerMaxMega5472;
        this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterLayoutInflaterTurboHyperion3832(24, this);
    }

    public FrostHunterTraceHyperionAuroraNebula9947(Context context, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        switch (i) {
            case 21:
                this.FrostHunterKeyframeGammaGamma1197 = context.getApplicationContext();
                this.FrostHunterFlowMaxDragonHero5809 = FrostHunterColorDrawableOlympianRogue6537.FrostHunterScaleAnimationStrikeSpark5059;
                this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterProximitySensorVortexUltraTitanium2580();
                break;
            default:
                this.FrostHunterKeyframeGammaGamma1197 = context.getApplicationContext();
                this.FrostHunterAlertDialogAuroraDelta3200 = new HashSet();
                this.FrostHunterFlowMaxDragonHero5809 = new HashMap();
                break;
        }
    }

    public FrostHunterTraceHyperionAuroraNebula9947(FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849, FrostHunterMagnetometerInfernoDragon1607 frostHunterMagnetometerInfernoDragon1607, FrostHunterLinearLayoutShadowHeroPixel9710 frostHunterLinearLayoutShadowHeroPixel9710, Set set) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 17;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterMagnetometerInfernoDragon1607;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterLinearLayoutShadowHeroPixel9710;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            FrostHunterTextViewDragonStormMega4297(str, 0, str.length(), 1, true, new FrostHunterWorkManagerMaxTurbo1858(str, 1));
        }
    }

    public FrostHunterTraceHyperionAuroraNebula9947(FrostHunterAudioManagerNovaNovaXAurora2834 frostHunterAudioManagerNovaNovaXAurora2834) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 18;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterAudioManagerNovaNovaXAurora2834;
        FrostHunterLayoutInflaterNovaXTitan5170 frostHunterLayoutInflaterNovaXTitan5170 = (FrostHunterLayoutInflaterNovaXTitan5170) frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterKeyframeGammaGamma1197;
        this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterLifecycleCameraControllerPulseMax9733(frostHunterAudioManagerNovaNovaXAurora2834, frostHunterLayoutInflaterNovaXTitan5170.FrostHunterServiceEliteCelestialThunder1757().FrostHunterAlphaAnimationNeoCosmos5761(), -1L, true);
        this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterStateListAnimatorAlphaHero4837(frostHunterAudioManagerNovaNovaXAurora2834, frostHunterLayoutInflaterNovaXTitan5170.FrostHunterServiceEliteCelestialThunder1757().FrostHunterServiceEliteCelestialThunder1757(), -1L, true);
    }

    public FrostHunterTraceHyperionAuroraNebula9947(FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336[] frostHunterPaintFlagsDrawFilterSparkSpectraMega2336Arr) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 13;
        FrostHunterProximitySensorHyperionNovaXPixel7745 frostHunterProximitySensorHyperionNovaXPixel7745 = new FrostHunterProximitySensorHyperionNovaXPixel7745();
        FrostHunterPermissionInfoCyberStorm3295 frostHunterPermissionInfoCyberStorm3295 = new FrostHunterPermissionInfoCyberStorm3295();
        frostHunterPermissionInfoCyberStorm3295.FrostHunterBundlePulseFusionHero2475 = 1.0f;
        frostHunterPermissionInfoCyberStorm3295.FrostHunterServiceEliteCelestialThunder1757 = 1.0f;
        FrostHunterConstraintSetHeroOlympian6218 frostHunterConstraintSetHeroOlympian6218 = FrostHunterConstraintSetHeroOlympian6218.FrostHunterLifecycleBlazeGammaElite2889;
        frostHunterPermissionInfoCyberStorm3295.FrostHunterLifecycleBlazeGammaElite2889 = frostHunterConstraintSetHeroOlympian6218;
        frostHunterPermissionInfoCyberStorm3295.FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterConstraintSetHeroOlympian6218;
        frostHunterPermissionInfoCyberStorm3295.FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterConstraintSetHeroOlympian6218;
        frostHunterPermissionInfoCyberStorm3295.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterConstraintSetHeroOlympian6218;
        ByteBuffer byteBuffer = FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterPermissionInfoCyberStorm3295.FrostHunterKeyframeGammaGamma1197 = byteBuffer;
        frostHunterPermissionInfoCyberStorm3295.FrostHunterFragmentBetaMegaVortex6025 = byteBuffer;
        frostHunterPermissionInfoCyberStorm3295.FrostHunterConstraintSetCloneMasterUltraRogue2633 = -1;
        FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336[] frostHunterPaintFlagsDrawFilterSparkSpectraMega2336Arr2 = new FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336[frostHunterPaintFlagsDrawFilterSparkSpectraMega2336Arr.length + 2];
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterPaintFlagsDrawFilterSparkSpectraMega2336Arr2;
        System.arraycopy(frostHunterPaintFlagsDrawFilterSparkSpectraMega2336Arr, 0, frostHunterPaintFlagsDrawFilterSparkSpectraMega2336Arr2, 0, frostHunterPaintFlagsDrawFilterSparkSpectraMega2336Arr.length);
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterProximitySensorHyperionNovaXPixel7745;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterPermissionInfoCyberStorm3295;
        frostHunterPaintFlagsDrawFilterSparkSpectraMega2336Arr2[frostHunterPaintFlagsDrawFilterSparkSpectraMega2336Arr.length] = frostHunterProximitySensorHyperionNovaXPixel7745;
        frostHunterPaintFlagsDrawFilterSparkSpectraMega2336Arr2[frostHunterPaintFlagsDrawFilterSparkSpectraMega2336Arr.length + 1] = frostHunterPermissionInfoCyberStorm3295;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FrostHunterTraceHyperionAuroraNebula9947(String str, int i) {
        this(1, new FrostHunterRemoteModelManagerVortexOlympianForce8190(Executors.newSingleThreadExecutor(new FrostHunterInterpolatorVortexOlympian7007(r3, 1)), new FrostHunterVibratorSpectraBetaNovaX4683(25)));
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        switch (i) {
            case 28:
                FrostHunterCamera2EpicNovaX6250 frostHunterCamera2EpicNovaX6250 = new FrostHunterCamera2EpicNovaX6250();
                frostHunterCamera2EpicNovaX6250.FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterKeyframeGammaGamma1197("video/mp2t");
                frostHunterCamera2EpicNovaX6250.FrostHunterLightSensorForceFusion4241 = FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterKeyframeGammaGamma1197(str);
                this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterFirebaseOlympianMax4818(frostHunterCamera2EpicNovaX6250);
                break;
            default:
                String concat = "ExoPlayer:Loader:".concat(str);
                String str2 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                break;
        }
    }

    public FrostHunterTraceHyperionAuroraNebula9947(Matcher matcher, CharSequence charSequence) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 26;
        charSequence.getClass();
        this.FrostHunterFlowMaxDragonHero5809 = matcher;
        this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterPushNotificationDragonVision6411(0, this);
    }

    public FrostHunterTraceHyperionAuroraNebula9947(FrostHunterFirestoreVortexBeta2433 frostHunterFirestoreVortexBeta2433) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 4;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterFirestoreVortexBeta2433;
        Handler FrostHunterKeyframeGammaGamma1197 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterKeyframeGammaGamma1197(null);
        this.FrostHunterFlowMaxDragonHero5809 = FrostHunterKeyframeGammaGamma1197;
        FrostHunterProcessCameraProviderAuroraForce2188 frostHunterProcessCameraProviderAuroraForce2188 = new FrostHunterProcessCameraProviderAuroraForce2188(this);
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterProcessCameraProviderAuroraForce2188;
        frostHunterFirestoreVortexBeta2433.FrostHunterAlphaAnimationNeoCosmos5761.registerStreamEventCallback(new FrostHunterOnItemLongClickListenerTitanMegaMaster3013(0, FrostHunterKeyframeGammaGamma1197), frostHunterProcessCameraProviderAuroraForce2188);
    }

    public FrostHunterTraceHyperionAuroraNebula9947(FrostHunterMeteringPointEclipseTitan1504 frostHunterMeteringPointEclipseTitan1504, FrostHunterToolbarPixelHyperion1536 frostHunterToolbarPixelHyperion1536) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 14;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterMeteringPointEclipseTitan1504;
        this.FrostHunterFlowMaxDragonHero5809 = new HashMap();
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterToolbarPixelHyperion1536;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context.FrostHunterButtonStrikeHeroMaster5769, java.lang.Object] */
    public FrostHunterTraceHyperionAuroraNebula9947(FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma2307, GlassNewActivity glassNewActivity) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 19;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterThreadSpectraShadowGamma2307;
        this.FrostHunterFlowMaxDragonHero5809 = new WeakReference(glassNewActivity);
        ?? r0 = new IntConsumer() { // from class: android.content.Context.FrostHunterButtonStrikeHeroMaster5769
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma23072 = (FrostHunterThreadSpectraShadowGamma2307) FrostHunterTraceHyperionAuroraNebula9947.this.FrostHunterKeyframeGammaGamma1197;
                if (frostHunterThreadSpectraShadowGamma23072.FrostHunterColorStateListInflaterNovaQuantum4229) {
                    return;
                }
                frostHunterThreadSpectraShadowGamma23072.FrostHunterTextViewDragonStormMega4297(1, 19, Integer.valueOf(i));
            }
        };
        this.FrostHunterAlertDialogAuroraDelta3200 = r0;
        glassNewActivity.registerDeviceIdChangeListener(new FrostHunterOnItemLongClickListenerTitanMegaMaster3013(1, frostHunterThreadSpectraShadowGamma2307.FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterThreadSpectraShadowGamma2307.FrostHunterResourcesTitanHyperVision5823, null)), r0);
    }
}
