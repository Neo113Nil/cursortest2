package android.content.Context;

import android.R;
import android.app.ActivityOptions;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.activity.ComponentActivity;
import androidx.core.graphics.drawable.IconCompat;
import com.adjust.sdk.network.ErrorCodes;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Inflater;
import org.json.JSONObject;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 implements FrostHunterOnDeviceTranslatorPhantomHyperion5683, FrostHunterTraceAuroraFusion8204, FrostHunterActionBarHyperMax6338, FrostHunterScrollViewTitanNovaMega7126, FrostHunterProGuardCyberHyper2901 {
    public static FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public Object FrostHunterFlowMaxDragonHero5809;
    public Object FrostHunterFragmentBetaMegaVortex6025;
    public Object FrostHunterKeyframeGammaGamma1197;

    /* JADX WARN: Multi-variable type inference failed */
    public FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(FrostHunterValueAnimatorShadowForceCosmos2424 frostHunterValueAnimatorShadowForceCosmos2424) {
        int i;
        ArrayList arrayList;
        int i2;
        this.FrostHunterCameraXPixelTurboCosmos9814 = 12;
        this.FrostHunterFragmentBetaMegaVortex6025 = new Bundle();
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterValueAnimatorShadowForceCosmos2424;
        Context context = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterAlphaAnimationNeoCosmos5761;
        ArrayList arrayList2 = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterTextViewDragonStormMega4297;
        ArrayList arrayList3 = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterBundlePulseFusionHero2475;
        ArrayList arrayList4 = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterServiceEliteCelestialThunder1757;
        this.FrostHunterFlowMaxDragonHero5809 = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterProximitySensorNeoMaster3330.FrostHunterConstraintSetCloneMasterUltraRogue2633(context, frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterLintTitanVortexQuantum9911);
        } else {
            this.FrostHunterAlertDialogAuroraDelta3200 = new Notification.Builder(context);
        }
        Notification notification = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterResourcesTitanHyperVision5823;
        Context context2 = null;
        ((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterLifecycleBlazeGammaElite2889).setContentText(frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterLevelListDrawableFusionDragonHero2232).setContentInfo(null).setContentIntent(frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterRemoteConfigSpeedSpeed8566).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterFlowMaxDragonHero5809).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200;
        IconCompat iconCompat = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterCameraXPixelTurboCosmos9814;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.FrostHunterLevelListDrawableFusionDragonHero2232(context));
        ((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200).setSubText(null).setUsesChronometer(false).setPriority(frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterAlertDialogAuroraDelta3200);
        ArrayList arrayList5 = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int size = arrayList5.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList5.get(i3);
            i3++;
            FrostHunterLevelListDrawableRoguePixelSolar7539 frostHunterLevelListDrawableRoguePixelSolar7539 = (FrostHunterLevelListDrawableRoguePixelSolar7539) obj;
            if (frostHunterLevelListDrawableRoguePixelSolar7539.FrostHunterConstraintSetCloneMasterUltraRogue2633 == null && (i2 = frostHunterLevelListDrawableRoguePixelSolar7539.FrostHunterLifecycleBlazeGammaElite2889) != 0) {
                frostHunterLevelListDrawableRoguePixelSolar7539.FrostHunterConstraintSetCloneMasterUltraRogue2633 = IconCompat.FrostHunterConstraintSetCloneMasterUltraRogue2633(i2);
            }
            IconCompat iconCompat2 = frostHunterLevelListDrawableRoguePixelSolar7539.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            boolean z = frostHunterLevelListDrawableRoguePixelSolar7539.FrostHunterBundlePulseFusionHero2475;
            Bundle bundle = frostHunterLevelListDrawableRoguePixelSolar7539.FrostHunterAlphaAnimationNeoCosmos5761;
            ArrayList arrayList6 = arrayList5;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.FrostHunterLevelListDrawableFusionDragonHero2232(context2) : context2, frostHunterLevelListDrawableRoguePixelSolar7539.FrostHunterLevelListDrawableFusionDragonHero2232, frostHunterLevelListDrawableRoguePixelSolar7539.FrostHunterRemoteConfigSpeedSpeed8566);
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder2.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", 0);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                FrostHunterLiveDataScopeForcePhoenix6923.FrostHunterKeyframeGammaGamma1197(builder2);
            }
            if (i4 >= 29) {
                FrostHunterRemoteConfigPulseLegendStorm6177.FrostHunterFragmentBetaMegaVortex6025(builder2);
            }
            if (i4 >= 31) {
                FrostHunterThreadSolarEpicInferno6752.FrostHunterServiceEliteCelestialThunder1757(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", frostHunterLevelListDrawableRoguePixelSolar7539.FrostHunterServiceEliteCelestialThunder1757);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200).addAction(builder2.build());
            arrayList5 = arrayList6;
            context2 = null;
        }
        Bundle bundle3 = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterLightSensorForceFusion4241;
        if (bundle3 != null) {
            ((Bundle) this.FrostHunterFragmentBetaMegaVortex6025).putAll(bundle3);
        }
        ((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200).setShowWhen(frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterKeyframeGammaGamma1197);
        ((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200).setLocalOnly(frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterServiceConnectionTurboPhoenixOmega6719);
        ((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200).setGroup(null);
        ((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200).setSortKey(null);
        ((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200).setGroupSummary(false);
        ((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200).setCategory(null);
        ((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200).setColor(frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterScaleAnimationStrikeSpark5059);
        ((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200).setVisibility(frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223);
        ((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200).setPublicVersion(null);
        ((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
                    throw null;
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    FrostHunterEditTextPhoenixMaster1089 frostHunterEditTextPhoenixMaster1089 = new FrostHunterEditTextPhoenixMaster1089(arrayList2.size() + arrayList.size());
                    frostHunterEditTextPhoenixMaster1089.addAll(arrayList);
                    frostHunterEditTextPhoenixMaster1089.addAll(arrayList2);
                    arrayList2 = new ArrayList(frostHunterEditTextPhoenixMaster1089);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList2.get(i5);
                i5++;
                ((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200).addPerson((String) obj2);
            }
        }
        if (arrayList4.size() > 0) {
            if (frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterLightSensorForceFusion4241 == null) {
                frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterLightSensorForceFusion4241 = new Bundle();
            }
            Bundle bundle4 = frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterLightSensorForceFusion4241.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                String num = Integer.toString(i6);
                FrostHunterLevelListDrawableRoguePixelSolar7539 frostHunterLevelListDrawableRoguePixelSolar75392 = (FrostHunterLevelListDrawableRoguePixelSolar7539) arrayList4.get(i6);
                Bundle bundle7 = new Bundle();
                if (frostHunterLevelListDrawableRoguePixelSolar75392.FrostHunterConstraintSetCloneMasterUltraRogue2633 == null && (i = frostHunterLevelListDrawableRoguePixelSolar75392.FrostHunterLifecycleBlazeGammaElite2889) != 0) {
                    frostHunterLevelListDrawableRoguePixelSolar75392.FrostHunterConstraintSetCloneMasterUltraRogue2633 = IconCompat.FrostHunterConstraintSetCloneMasterUltraRogue2633(i);
                }
                IconCompat iconCompat3 = frostHunterLevelListDrawableRoguePixelSolar75392.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                Bundle bundle8 = frostHunterLevelListDrawableRoguePixelSolar75392.FrostHunterAlphaAnimationNeoCosmos5761;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.FrostHunterBundlePulseFusionHero2475() : 0);
                bundle7.putCharSequence("title", frostHunterLevelListDrawableRoguePixelSolar75392.FrostHunterLevelListDrawableFusionDragonHero2232);
                bundle7.putParcelable("actionIntent", frostHunterLevelListDrawableRoguePixelSolar75392.FrostHunterRemoteConfigSpeedSpeed8566);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", frostHunterLevelListDrawableRoguePixelSolar75392.FrostHunterBundlePulseFusionHero2475);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", frostHunterLevelListDrawableRoguePixelSolar75392.FrostHunterServiceEliteCelestialThunder1757);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(num, bundle7);
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterLightSensorForceFusion4241 == null) {
                frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterLightSensorForceFusion4241 = new Bundle();
            }
            frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterLightSensorForceFusion4241.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.FrostHunterFragmentBetaMegaVortex6025).putBundle("android.car.EXTENSIONS", bundle5);
        }
        ((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200).setExtras(frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterLightSensorForceFusion4241);
        ((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200).setRemoteInputHistory(null);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            FrostHunterProximitySensorNeoMaster3330.FrostHunterAlertDialogAuroraDelta3200((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200);
            FrostHunterProximitySensorNeoMaster3330.FrostHunterFragmentBetaMegaVortex6025((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200);
            FrostHunterProximitySensorNeoMaster3330.FrostHunterServiceConnectionTurboPhoenixOmega6719((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200);
            FrostHunterProximitySensorNeoMaster3330.FrostHunterLightSensorForceFusion4241((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200);
            FrostHunterProximitySensorNeoMaster3330.FrostHunterKeyframeGammaGamma1197((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200);
            if (!TextUtils.isEmpty(frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterLintTitanVortexQuantum9911)) {
                ((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i7 >= 28) {
            Iterator it2 = arrayList3.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
                throw null;
            }
        }
        if (i7 >= 29) {
            FrostHunterRemoteConfigPulseLegendStorm6177.FrostHunterAlertDialogAuroraDelta3200((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200, frostHunterValueAnimatorShadowForceCosmos2424.FrostHunterCameraXTurboCelestialHero5430);
            FrostHunterRemoteConfigPulseLegendStorm6177.FrostHunterKeyframeGammaGamma1197((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200);
        }
        if (i7 >= 36) {
            FrostHunterJavaSpeedShadowPrime9230.FrostHunterLevelListDrawableFusionDragonHero2232((Notification.Builder) this.FrostHunterAlertDialogAuroraDelta3200);
        }
    }

    public static void FrostHunterEditTextPulseHyperion1262(FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849, FrostHunterCanvasHyperGammaForce7674 frostHunterCanvasHyperGammaForce7674, FrostHunterCanvasHyperGammaForce7674 frostHunterCanvasHyperGammaForce76742, int i) {
        FrostHunterContentObserverCelestialAuroraBlaze7297 frostHunterContentObserverCelestialAuroraBlaze7297;
        FrostHunterCanvasHyperGammaForce7674 FrostHunterTextViewDragonStormMega4297;
        if ((i & 1) != 0) {
            frostHunterCanvasHyperGammaForce7674 = null;
        }
        if ((i & 4) != 0) {
            frostHunterCanvasHyperGammaForce76742 = null;
        }
        frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.getClass();
        TimeZone timeZone = FrostHunterTextureViewForceEpicQuantum6388.FrostHunterAlphaAnimationNeoCosmos5761;
        boolean isShutdown = ((ThreadPoolExecutor) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterLintTitanVortexQuantum9911()).isShutdown();
        synchronized (frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849) {
            if (frostHunterCanvasHyperGammaForce76742 != null) {
                try {
                    frostHunterCanvasHyperGammaForce76742.FrostHunterFlowMaxDragonHero5809.decrementAndGet();
                    if (!((ArrayDeque) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterAlertDialogAuroraDelta3200).remove(frostHunterCanvasHyperGammaForce76742)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (frostHunterCanvasHyperGammaForce7674 != null) {
                ((ArrayDeque) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterFragmentBetaMegaVortex6025).add(frostHunterCanvasHyperGammaForce7674);
                FrostHunterSurfaceViewPrimeAlphaPulse4865 frostHunterSurfaceViewPrimeAlphaPulse4865 = frostHunterCanvasHyperGammaForce7674.FrostHunterAlertDialogAuroraDelta3200;
                if (!frostHunterSurfaceViewPrimeAlphaPulse4865.FrostHunterAlertDialogAuroraDelta3200 && (FrostHunterTextViewDragonStormMega4297 = frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterTextViewDragonStormMega4297(frostHunterSurfaceViewPrimeAlphaPulse4865.FrostHunterFlowMaxDragonHero5809.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceEliteCelestialThunder1757)) != null) {
                    frostHunterCanvasHyperGammaForce7674.FrostHunterFlowMaxDragonHero5809 = FrostHunterTextViewDragonStormMega4297.FrostHunterFlowMaxDragonHero5809;
                }
            }
            if (frostHunterCanvasHyperGammaForce76742 != null && (isShutdown || ((ArrayDeque) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterAlertDialogAuroraDelta3200).isEmpty())) {
                ((ArrayDeque) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterKeyframeGammaGamma1197).isEmpty();
            }
            if (isShutdown) {
                List FrostHunterGyroscopeOmegaEclipseOlympian7225 = FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterGyroscopeOmegaEclipseOlympian7225((ArrayDeque) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterFragmentBetaMegaVortex6025);
                ((ArrayDeque) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterFragmentBetaMegaVortex6025).clear();
                frostHunterContentObserverCelestialAuroraBlaze7297 = new FrostHunterContentObserverCelestialAuroraBlaze7297(FrostHunterGyroscopeOmegaEclipseOlympian7225);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterFragmentBetaMegaVortex6025).iterator();
                it.getClass();
                while (it.hasNext()) {
                    FrostHunterCanvasHyperGammaForce7674 frostHunterCanvasHyperGammaForce76743 = (FrostHunterCanvasHyperGammaForce7674) it.next();
                    if (((ArrayDeque) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterAlertDialogAuroraDelta3200).size() >= 64) {
                        break;
                    }
                    if (frostHunterCanvasHyperGammaForce76743.FrostHunterFlowMaxDragonHero5809.get() < 5) {
                        it.remove();
                        frostHunterCanvasHyperGammaForce76743.FrostHunterFlowMaxDragonHero5809.incrementAndGet();
                        arrayList.add(frostHunterCanvasHyperGammaForce76743);
                        ((ArrayDeque) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterAlertDialogAuroraDelta3200).add(frostHunterCanvasHyperGammaForce76743);
                    }
                }
                frostHunterContentObserverCelestialAuroraBlaze7297 = new FrostHunterContentObserverCelestialAuroraBlaze7297(arrayList);
            }
        }
        int size = frostHunterContentObserverCelestialAuroraBlaze7297.FrostHunterCameraXPixelTurboCosmos9814.size();
        for (int i2 = 0; i2 < size; i2++) {
            FrostHunterCanvasHyperGammaForce7674 frostHunterCanvasHyperGammaForce76744 = (FrostHunterCanvasHyperGammaForce7674) frostHunterContentObserverCelestialAuroraBlaze7297.FrostHunterCameraXPixelTurboCosmos9814.get(i2);
            if (frostHunterCanvasHyperGammaForce76744 != frostHunterCanvasHyperGammaForce7674) {
                FrostHunterSurfaceViewPrimeAlphaPulse4865 frostHunterSurfaceViewPrimeAlphaPulse48652 = frostHunterCanvasHyperGammaForce76744.FrostHunterAlertDialogAuroraDelta3200;
            }
            if (isShutdown) {
                frostHunterCanvasHyperGammaForce76744.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                FrostHunterSurfaceViewPrimeAlphaPulse4865 frostHunterSurfaceViewPrimeAlphaPulse48653 = frostHunterCanvasHyperGammaForce76744.FrostHunterAlertDialogAuroraDelta3200;
                frostHunterSurfaceViewPrimeAlphaPulse48653.FrostHunterFlowMaxDragonHero5809(interruptedIOException);
                frostHunterCanvasHyperGammaForce76744.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterSurfaceViewPrimeAlphaPulse48653, interruptedIOException);
            } else {
                ExecutorService FrostHunterLintTitanVortexQuantum9911 = frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterLintTitanVortexQuantum9911();
                frostHunterCanvasHyperGammaForce76744.getClass();
                FrostHunterSurfaceViewPrimeAlphaPulse4865 frostHunterSurfaceViewPrimeAlphaPulse48654 = frostHunterCanvasHyperGammaForce76744.FrostHunterAlertDialogAuroraDelta3200;
                frostHunterSurfaceViewPrimeAlphaPulse48654.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) FrostHunterLintTitanVortexQuantum9911).execute(frostHunterCanvasHyperGammaForce76744);
                    } catch (Throwable th2) {
                        FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum88492 = frostHunterSurfaceViewPrimeAlphaPulse48654.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761;
                        frostHunterOnAttachStateChangeListenerVortexNeoQuantum88492.getClass();
                        FrostHunterEditTextPulseHyperion1262(frostHunterOnAttachStateChangeListenerVortexNeoQuantum88492, null, frostHunterCanvasHyperGammaForce76744, 3);
                        throw th2;
                    }
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                    interruptedIOException2.initCause(e);
                    FrostHunterSurfaceViewPrimeAlphaPulse4865 frostHunterSurfaceViewPrimeAlphaPulse48655 = frostHunterCanvasHyperGammaForce76744.FrostHunterAlertDialogAuroraDelta3200;
                    frostHunterSurfaceViewPrimeAlphaPulse48655.FrostHunterFlowMaxDragonHero5809(interruptedIOException2);
                    frostHunterCanvasHyperGammaForce76744.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterSurfaceViewPrimeAlphaPulse48655, interruptedIOException2);
                    FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum88493 = frostHunterSurfaceViewPrimeAlphaPulse48654.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761;
                    frostHunterOnAttachStateChangeListenerVortexNeoQuantum88493.getClass();
                    FrostHunterEditTextPulseHyperion1262(frostHunterOnAttachStateChangeListenerVortexNeoQuantum88493, null, frostHunterCanvasHyperGammaForce76744, 3);
                }
            }
        }
    }

    public static void FrostHunterLifecycleBlazeGammaElite2889(FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849, FrostHunterShapeAppearanceCelestialBlaze9124 frostHunterShapeAppearanceCelestialBlaze9124) {
        frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.getClass();
        frostHunterShapeAppearanceCelestialBlaze9124.getClass();
        if (((LinkedHashSet) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterKeyframeGammaGamma1197).add(frostHunterShapeAppearanceCelestialBlaze9124)) {
            FrostHunterThemeOverlayEclipseSolar8293 frostHunterThemeOverlayEclipseSolar8293 = (FrostHunterThemeOverlayEclipseSolar8293) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterAlertDialogAuroraDelta3200;
            frostHunterThemeOverlayEclipseSolar8293.getClass();
            if (frostHunterShapeAppearanceCelestialBlaze9124.FrostHunterBundlePulseFusionHero2475 != null) {
                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterLightSensorForceFusion4241("Handler '", frostHunterShapeAppearanceCelestialBlaze9124, "' is already registered with a dispatcher");
                return;
            }
            frostHunterThemeOverlayEclipseSolar8293.FrostHunterLifecycleBlazeGammaElite2889.addFirst(frostHunterShapeAppearanceCelestialBlaze9124);
            frostHunterShapeAppearanceCelestialBlaze9124.FrostHunterBundlePulseFusionHero2475 = frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849;
            frostHunterThemeOverlayEclipseSolar8293.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        }
    }

    public static synchronized FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 FrostHunterLooperThreadBetaHyperionMax1000() {
        FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849;
        synchronized (FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.class) {
            try {
                if (FrostHunterServiceConnectionTurboPhoenixOmega6719 == null) {
                    FrostHunterServiceConnectionTurboPhoenixOmega6719 = new FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(0);
                }
                frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 = FrostHunterServiceConnectionTurboPhoenixOmega6719;
            } catch (Throwable th) {
                throw th;
            }
        }
        return frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849;
    }

    public void FrostHunterAlertDialogAuroraDelta3200(FrostHunterResourcePixelEpic4102 frostHunterResourcePixelEpic4102, boolean z) {
        FrostHunterActionBarMegaTurboNova4043 frostHunterActionBarMegaTurboNova4043 = (FrostHunterActionBarMegaTurboNova4043) this.FrostHunterFragmentBetaMegaVortex6025;
        List list = frostHunterResourcePixelEpic4102.FrostHunterAlphaAnimationNeoCosmos5761;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((FrostHunterViewHyperEliteHyper5851) list.get(i)).FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                FrostHunterViewPhantomNeo1634(frostHunterResourcePixelEpic4102);
                return;
            }
        }
        FrostHunterModelInputOutputEliteHyperForce8871 frostHunterModelInputOutputEliteHyperForce8871 = (FrostHunterModelInputOutputEliteHyperForce8871) this.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterModelInputOutputEliteHyperForce8871 == null) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("layoutCoordinates not set");
            return;
        }
        FrostHunterBindingAdapterSpeedNeo6677.FrostHunterPagingSourceEclipseDelta8255(frostHunterResourcePixelEpic4102, frostHunterModelInputOutputEliteHyperForce8871.FrostHunterViewPhantomNeo1634(0L), new FrostHunterViewModelScopePhoenixVision2028(8, this, frostHunterActionBarMegaTurboNova4043), false);
        if (((FrostHunterLinearLayoutTurboPhoenixRogue2132) this.FrostHunterAlertDialogAuroraDelta3200) == FrostHunterLinearLayoutTurboPhoenixRogue2132.FrostHunterFlowMaxDragonHero5809) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((FrostHunterViewHyperEliteHyper5851) list.get(i2)).FrostHunterAlphaAnimationNeoCosmos5761();
                }
            }
            FrostHunterPushNotificationUltraQuantum3493 frostHunterPushNotificationUltraQuantum3493 = frostHunterResourcePixelEpic4102.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (frostHunterPushNotificationUltraQuantum3493 != null) {
                frostHunterPushNotificationUltraQuantum3493.FrostHunterCameraXPixelTurboCosmos9814 = !frostHunterActionBarMegaTurboNova4043.FrostHunterServiceEliteCelestialThunder1757;
            }
        }
    }

    @Override // android.content.Context.FrostHunterTraceAuroraFusion8204
    public FrostHunterProfilerPhantomLegendPhoenix6109 FrostHunterAlphaAnimationNeoCosmos5761() {
        return (FrostHunterFragmentTransactionAuroraForceRogue8349) this.FrostHunterFragmentBetaMegaVortex6025;
    }

    public FrostHunterFragmentCosmosSolar3628 FrostHunterBitmapTurboDeltaNebula8743(FrostHunterRewardedAdAlphaPhoenixVortex4789 frostHunterRewardedAdAlphaPhoenixVortex4789, String str) {
        FrostHunterFragmentCosmosSolar3628 frostHunterFragmentCosmosSolar3628;
        FrostHunterFragmentCosmosSolar3628 FrostHunterAlphaAnimationNeoCosmos5761;
        synchronized (((FrostHunterBottomSheetEclipseUltraShadow6009) this.FrostHunterFragmentBetaMegaVortex6025)) {
            try {
                FrostHunterPropertyValuesHolderMaxSpeed2945 frostHunterPropertyValuesHolderMaxSpeed2945 = (FrostHunterPropertyValuesHolderMaxSpeed2945) this.FrostHunterFlowMaxDragonHero5809;
                frostHunterPropertyValuesHolderMaxSpeed2945.getClass();
                frostHunterFragmentCosmosSolar3628 = (FrostHunterFragmentCosmosSolar3628) frostHunterPropertyValuesHolderMaxSpeed2945.FrostHunterAlphaAnimationNeoCosmos5761.get(str);
                if (frostHunterRewardedAdAlphaPhoenixVortex4789.FrostHunterServiceEliteCelestialThunder1757(frostHunterFragmentCosmosSolar3628)) {
                    FrostHunterAdapterDelegatePhantomTitanium6932 frostHunterAdapterDelegatePhantomTitanium6932 = (FrostHunterAdapterDelegatePhantomTitanium6932) this.FrostHunterAlertDialogAuroraDelta3200;
                    if (frostHunterAdapterDelegatePhantomTitanium6932 instanceof FrostHunterRewardedAdGammaThunder6003) {
                        FrostHunterRewardedAdGammaThunder6003 frostHunterRewardedAdGammaThunder6003 = (FrostHunterRewardedAdGammaThunder6003) frostHunterAdapterDelegatePhantomTitanium6932;
                        frostHunterFragmentCosmosSolar3628.getClass();
                        FrostHunterDrawerLayoutEpicFusionShadow4742 frostHunterDrawerLayoutEpicFusionShadow4742 = frostHunterRewardedAdGammaThunder6003.FrostHunterServiceEliteCelestialThunder1757;
                        if (frostHunterDrawerLayoutEpicFusionShadow4742 != null) {
                            FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892 = frostHunterRewardedAdGammaThunder6003.FrostHunterLifecycleBlazeGammaElite2889;
                            frostHunterKotlinQuantumRogue5892.getClass();
                            FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterFragmentCosmosSolar3628, frostHunterKotlinQuantumRogue5892, frostHunterDrawerLayoutEpicFusionShadow4742);
                        }
                    }
                    frostHunterFragmentCosmosSolar3628.getClass();
                } else {
                    FrostHunterGraphNebulaHyperionOlympian8801 frostHunterGraphNebulaHyperionOlympian8801 = new FrostHunterGraphNebulaHyperionOlympian8801((FrostHunterAnimatorSetThunderSpark5581) this.FrostHunterKeyframeGammaGamma1197);
                    frostHunterGraphNebulaHyperionOlympian8801.FrostHunterAlphaAnimationNeoCosmos5761.put(FrostHunterLayoutInflaterTurboHyperion3832.FrostHunterScaleAnimationStrikeSpark5059, str);
                    FrostHunterAdapterDelegatePhantomTitanium6932 frostHunterAdapterDelegatePhantomTitanium69322 = (FrostHunterAdapterDelegatePhantomTitanium6932) this.FrostHunterAlertDialogAuroraDelta3200;
                    try {
                        try {
                            FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterAdapterDelegatePhantomTitanium69322.FrostHunterBundlePulseFusionHero2475(frostHunterRewardedAdAlphaPhoenixVortex4789, frostHunterGraphNebulaHyperionOlympian8801);
                        } catch (AbstractMethodError unused) {
                            FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterAdapterDelegatePhantomTitanium69322.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterBillingClientFusionVortex9008(frostHunterRewardedAdAlphaPhoenixVortex4789));
                        }
                    } catch (AbstractMethodError unused2) {
                        FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterAdapterDelegatePhantomTitanium69322.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterBillingClientFusionVortex9008(frostHunterRewardedAdAlphaPhoenixVortex4789), frostHunterGraphNebulaHyperionOlympian8801);
                    }
                    frostHunterFragmentCosmosSolar3628 = FrostHunterAlphaAnimationNeoCosmos5761;
                    FrostHunterPropertyValuesHolderMaxSpeed2945 frostHunterPropertyValuesHolderMaxSpeed29452 = (FrostHunterPropertyValuesHolderMaxSpeed2945) this.FrostHunterFlowMaxDragonHero5809;
                    frostHunterPropertyValuesHolderMaxSpeed29452.getClass();
                    frostHunterFragmentCosmosSolar3628.getClass();
                    FrostHunterFragmentCosmosSolar3628 frostHunterFragmentCosmosSolar36282 = (FrostHunterFragmentCosmosSolar3628) frostHunterPropertyValuesHolderMaxSpeed29452.FrostHunterAlphaAnimationNeoCosmos5761.put(str, frostHunterFragmentCosmosSolar3628);
                    if (frostHunterFragmentCosmosSolar36282 != null) {
                        frostHunterFragmentCosmosSolar36282.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return frostHunterFragmentCosmosSolar3628;
    }

    @Override // android.content.Context.FrostHunterThemeOverlaySparkInfernoAurora4808
    public long FrostHunterBundlePulseFusionHero2475(FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue2483, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24832, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24833) {
        int FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterMaterialCardViewEliteRogue2483.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        long j = 0;
        for (int i = 0; i < FrostHunterConstraintSetCloneMasterUltraRogue2633; i++) {
            j = Math.max(j, ((FrostHunterAnimatorQuantumFusionMaster8565) this.FrostHunterFlowMaxDragonHero5809).FrostHunterLooperThreadBetaHyperionMax1000(i).FrostHunterServiceEliteCelestialThunder1757(frostHunterMaterialCardViewEliteRogue2483.FrostHunterAlphaAnimationNeoCosmos5761(i), frostHunterMaterialCardViewEliteRogue24832.FrostHunterAlphaAnimationNeoCosmos5761(i), frostHunterMaterialCardViewEliteRogue24833.FrostHunterAlphaAnimationNeoCosmos5761(i)));
        }
        return j;
    }

    public FrostHunterStateFlowUltraSolar4848 FrostHunterCameraXPixelTurboCosmos9814(String str) {
        FrostHunterContentObserverCelestialAuroraBlaze7297 frostHunterContentObserverCelestialAuroraBlaze7297 = (FrostHunterContentObserverCelestialAuroraBlaze7297) this.FrostHunterAlertDialogAuroraDelta3200;
        if (frostHunterContentObserverCelestialAuroraBlaze7297.FrostHunterServiceEliteCelestialThunder1757(str) && FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterLooperThreadBetaHyperionMax1000(str, (String) this.FrostHunterFlowMaxDragonHero5809)) {
            return new FrostHunterFlatMapEliteNeo7389("gpay-loading");
        }
        if (frostHunterContentObserverCelestialAuroraBlaze7297.FrostHunterServiceEliteCelestialThunder1757(str)) {
            return new FrostHunterAssetManagerDeltaCyber1996(FrostHunterDatabaseEliteShadowUltra2452(str));
        }
        List list = (List) this.FrostHunterFragmentBetaMegaVortex6025;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterCameraXTurboCelestialHero5430(str, (String) it.next(), false)) {
                    return new FrostHunterFirebaseSpeedMasterEpic2735(str);
                }
            }
        }
        return FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterCameraXTurboCelestialHero5430(str, "http", false) ? FrostHunterRippleDrawableBlazeBetaStorm6320.FrostHunterLintTitanVortexQuantum9911 : new FrostHunterOnDeviceTranslatorDeltaLegendPhoenix9182(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0058, code lost:
    
        if (r10.FrostHunterLifecycleBlazeGammaElite2889(r1) == r7) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x005b, B:29:0x0065), top: B:24:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FrostHunterCardViewSpectraCyber7714(FrostHunterViewBindingCelestialVortex7351 frostHunterViewBindingCelestialVortex7351) {
        FrostHunterPoseDetectionCosmosLegend3128 frostHunterPoseDetectionCosmosLegend3128;
        int i;
        FrostHunterAdapterEliteSpectraSolar8984 frostHunterAdapterEliteSpectraSolar8984;
        Throwable th;
        FrostHunterAdapterEliteSpectraSolar8984 frostHunterAdapterEliteSpectraSolar89842;
        FrostHunterPaintOlympianEliteTitanium2519 frostHunterPaintOlympianEliteTitanium2519 = (FrostHunterPaintOlympianEliteTitanium2519) this.FrostHunterAlertDialogAuroraDelta3200;
        try {
            if (frostHunterViewBindingCelestialVortex7351 instanceof FrostHunterPoseDetectionCosmosLegend3128) {
                frostHunterPoseDetectionCosmosLegend3128 = (FrostHunterPoseDetectionCosmosLegend3128) frostHunterViewBindingCelestialVortex7351;
                int i2 = frostHunterPoseDetectionCosmosLegend3128.FrostHunterLightSensorForceFusion4241;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    frostHunterPoseDetectionCosmosLegend3128.FrostHunterLightSensorForceFusion4241 = i2 - Integer.MIN_VALUE;
                    Object obj = frostHunterPoseDetectionCosmosLegend3128.FrostHunterFragmentBetaMegaVortex6025;
                    i = frostHunterPoseDetectionCosmosLegend3128.FrostHunterLightSensorForceFusion4241;
                    FrostHunterLinearLayoutSolarHero7990 frostHunterLinearLayoutSolarHero7990 = FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                    Object obj2 = FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814;
                    if (i != 0) {
                        FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj);
                        if (frostHunterPaintOlympianEliteTitanium2519.FrostHunterTransitionListenerPulseVortexCosmos7949()) {
                            return frostHunterLinearLayoutSolarHero7990;
                        }
                        frostHunterAdapterEliteSpectraSolar8984 = (FrostHunterAdapterEliteSpectraSolar8984) this.FrostHunterFlowMaxDragonHero5809;
                        frostHunterPoseDetectionCosmosLegend3128.FrostHunterKeyframeGammaGamma1197 = frostHunterAdapterEliteSpectraSolar8984;
                        frostHunterPoseDetectionCosmosLegend3128.FrostHunterLightSensorForceFusion4241 = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            frostHunterAdapterEliteSpectraSolar89842 = frostHunterPoseDetectionCosmosLegend3128.FrostHunterKeyframeGammaGamma1197;
                            try {
                                FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj);
                                frostHunterPaintOlympianEliteTitanium2519.FrostHunterRemoteConfigThunderShadow4435(frostHunterLinearLayoutSolarHero7990);
                                frostHunterAdapterEliteSpectraSolar89842.FrostHunterRemoteConfigSpeedSpeed8566(null);
                                return frostHunterLinearLayoutSolarHero7990;
                            } catch (Throwable th2) {
                                th = th2;
                                frostHunterAdapterEliteSpectraSolar89842.FrostHunterRemoteConfigSpeedSpeed8566(null);
                                throw th;
                            }
                        }
                        FrostHunterAdapterEliteSpectraSolar8984 frostHunterAdapterEliteSpectraSolar89843 = frostHunterPoseDetectionCosmosLegend3128.FrostHunterKeyframeGammaGamma1197;
                        FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj);
                        frostHunterAdapterEliteSpectraSolar8984 = frostHunterAdapterEliteSpectraSolar89843;
                    }
                    if (!frostHunterPaintOlympianEliteTitanium2519.FrostHunterTransitionListenerPulseVortexCosmos7949()) {
                        frostHunterAdapterEliteSpectraSolar8984.FrostHunterRemoteConfigSpeedSpeed8566(null);
                        return frostHunterLinearLayoutSolarHero7990;
                    }
                    frostHunterPoseDetectionCosmosLegend3128.FrostHunterKeyframeGammaGamma1197 = frostHunterAdapterEliteSpectraSolar8984;
                    frostHunterPoseDetectionCosmosLegend3128.FrostHunterLightSensorForceFusion4241 = 2;
                    if (FrostHunterKeyframeGammaGamma1197(frostHunterPoseDetectionCosmosLegend3128) != obj2) {
                        frostHunterAdapterEliteSpectraSolar89842 = frostHunterAdapterEliteSpectraSolar8984;
                        frostHunterPaintOlympianEliteTitanium2519.FrostHunterRemoteConfigThunderShadow4435(frostHunterLinearLayoutSolarHero7990);
                        frostHunterAdapterEliteSpectraSolar89842.FrostHunterRemoteConfigSpeedSpeed8566(null);
                        return frostHunterLinearLayoutSolarHero7990;
                    }
                    return obj2;
                }
            }
            if (!frostHunterPaintOlympianEliteTitanium2519.FrostHunterTransitionListenerPulseVortexCosmos7949()) {
            }
        } catch (Throwable th3) {
            FrostHunterAdapterEliteSpectraSolar8984 frostHunterAdapterEliteSpectraSolar89844 = frostHunterAdapterEliteSpectraSolar8984;
            th = th3;
            frostHunterAdapterEliteSpectraSolar89842 = frostHunterAdapterEliteSpectraSolar89844;
            frostHunterAdapterEliteSpectraSolar89842.FrostHunterRemoteConfigSpeedSpeed8566(null);
            throw th;
        }
        frostHunterPoseDetectionCosmosLegend3128 = new FrostHunterPoseDetectionCosmosLegend3128(this, frostHunterViewBindingCelestialVortex7351);
        Object obj3 = frostHunterPoseDetectionCosmosLegend3128.FrostHunterFragmentBetaMegaVortex6025;
        i = frostHunterPoseDetectionCosmosLegend3128.FrostHunterLightSensorForceFusion4241;
        FrostHunterLinearLayoutSolarHero7990 frostHunterLinearLayoutSolarHero79902 = FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
        Object obj22 = FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context.FrostHunterRealtimeDatabaseBetaOlympianPhoenix2409] */
    public String FrostHunterDatabaseEliteShadowUltra2452(String str) {
        String frostHunterRealtimeDatabaseBetaOlympianPhoenix2409;
        ((FrostHunterMagnetometerInfernoDragon1607) this.FrostHunterKeyframeGammaGamma1197).getClass();
        int FrostHunterLooperHyperionForce4133 = FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterLooperHyperionForce4133(str, "#__WA__=", 0, 6);
        if (FrostHunterLooperHyperionForce4133 != -1) {
            try {
                frostHunterRealtimeDatabaseBetaOlympianPhoenix2409 = new JSONObject(URLDecoder.decode(str.substring(FrostHunterLooperHyperionForce4133 + 8), FrostHunterMeteringPointRogueDeltaNebula9629.FrostHunterAlphaAnimationNeoCosmos5761.name())).optString("returnUrl", null);
            } catch (Throwable th) {
                frostHunterRealtimeDatabaseBetaOlympianPhoenix2409 = new FrostHunterRealtimeDatabaseBetaOlympianPhoenix2409(th);
            }
            r1 = frostHunterRealtimeDatabaseBetaOlympianPhoenix2409 instanceof FrostHunterRealtimeDatabaseBetaOlympianPhoenix2409 ? null : frostHunterRealtimeDatabaseBetaOlympianPhoenix2409;
        }
        return r1 == null ? str : r1;
    }

    public boolean FrostHunterDialogFragmentTurboPhoenixDragon7627(Context context) {
        if (((Boolean) this.FrostHunterKeyframeGammaGamma1197) == null) {
            this.FrostHunterKeyframeGammaGamma1197 = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        ((Boolean) this.FrostHunterAlertDialogAuroraDelta3200).booleanValue();
        return ((Boolean) this.FrostHunterKeyframeGammaGamma1197).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.Context.FrostHunterActionBarHyperMax6338
    public void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(byte[] bArr, int i, int i2, FrostHunterLaunchGammaTitanium8407 frostHunterLaunchGammaTitanium8407, FrostHunterLayoutInflaterNebulaVision6522 frostHunterLayoutInflaterNebulaVision6522) {
        int[] iArr;
        FrostHunterConstraintSetPhoenixVision2576 frostHunterConstraintSetPhoenixVision2576;
        int i3;
        int i4;
        int i5;
        int FrostHunterDatabaseEliteShadowUltra2452;
        FrostHunterLayerBlazeAurora9948 frostHunterLayerBlazeAurora9948 = (FrostHunterLayerBlazeAurora9948) this.FrostHunterKeyframeGammaGamma1197;
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868 = (FrostHunterLicensingSpectraPulse8868) this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse88682 = (FrostHunterLicensingSpectraPulse8868) this.FrostHunterFlowMaxDragonHero5809;
        frostHunterLicensingSpectraPulse88682.FrostHunterMagnetometerFusionTitanium8202(bArr, i + i2);
        frostHunterLicensingSpectraPulse88682.FrostHunterR8MasterNebulaSpark7247(i);
        if (((Inflater) this.FrostHunterFragmentBetaMegaVortex6025) == null) {
            this.FrostHunterFragmentBetaMegaVortex6025 = new Inflater();
        }
        if (FrostHunterGyroscopeHeroAlpha1995.FrostHunterEditTextPulseHyperion1262(frostHunterLicensingSpectraPulse88682, frostHunterLicensingSpectraPulse8868, (Inflater) this.FrostHunterFragmentBetaMegaVortex6025)) {
            frostHunterLicensingSpectraPulse88682.FrostHunterMagnetometerFusionTitanium8202(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterLicensingSpectraPulse8868.FrostHunterBundlePulseFusionHero2475);
        }
        int i6 = 0;
        frostHunterLayerBlazeAurora9948.FrostHunterServiceEliteCelestialThunder1757 = 0;
        int[] iArr2 = frostHunterLayerBlazeAurora9948.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse88683 = frostHunterLayerBlazeAurora9948.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterLayerBlazeAurora9948.FrostHunterLifecycleBlazeGammaElite2889 = 0;
        frostHunterLayerBlazeAurora9948.FrostHunterLevelListDrawableFusionDragonHero2232 = 0;
        frostHunterLayerBlazeAurora9948.FrostHunterRemoteConfigSpeedSpeed8566 = 0;
        frostHunterLayerBlazeAurora9948.FrostHunterCameraXPixelTurboCosmos9814 = 0;
        frostHunterLayerBlazeAurora9948.FrostHunterFlowMaxDragonHero5809 = 0;
        frostHunterLicensingSpectraPulse88683.FrostHunterStateCelestialNovaPixel8414(0);
        frostHunterLayerBlazeAurora9948.FrostHunterBundlePulseFusionHero2475 = false;
        ArrayList arrayList = new ArrayList();
        while (frostHunterLicensingSpectraPulse88682.FrostHunterAlphaAnimationNeoCosmos5761() >= 3) {
            int i7 = frostHunterLicensingSpectraPulse88682.FrostHunterBundlePulseFusionHero2475;
            int FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse88682.FrostHunterMeteringPointBetaCyber9571();
            int FrostHunterBillingClientFusionVortex9008 = frostHunterLicensingSpectraPulse88682.FrostHunterBillingClientFusionVortex9008();
            int i8 = frostHunterLicensingSpectraPulse88682.FrostHunterConstraintSetCloneMasterUltraRogue2633 + FrostHunterBillingClientFusionVortex9008;
            if (i8 > i7) {
                frostHunterLicensingSpectraPulse88682.FrostHunterR8MasterNebulaSpark7247(i7);
                i3 = i6;
                iArr = iArr2;
                frostHunterConstraintSetPhoenixVision2576 = null;
            } else {
                char c = 128;
                if (FrostHunterMeteringPointBetaCyber9571 != 128) {
                    switch (FrostHunterMeteringPointBetaCyber9571) {
                        case 20:
                            if (FrostHunterBillingClientFusionVortex9008 % 5 == 2) {
                                frostHunterLicensingSpectraPulse88682.FrostHunterFCMDeltaQuantumHero8364(2);
                                Arrays.fill(iArr2, i6);
                                int i9 = FrostHunterBillingClientFusionVortex9008 / 5;
                                int i10 = i6;
                                while (i10 < i9) {
                                    int FrostHunterMeteringPointBetaCyber95712 = frostHunterLicensingSpectraPulse88682.FrostHunterMeteringPointBetaCyber9571();
                                    char c2 = c;
                                    double FrostHunterMeteringPointBetaCyber95713 = frostHunterLicensingSpectraPulse88682.FrostHunterMeteringPointBetaCyber9571();
                                    double FrostHunterMeteringPointBetaCyber95714 = frostHunterLicensingSpectraPulse88682.FrostHunterMeteringPointBetaCyber9571() - 128;
                                    int[] iArr3 = iArr2;
                                    double FrostHunterMeteringPointBetaCyber95715 = frostHunterLicensingSpectraPulse88682.FrostHunterMeteringPointBetaCyber9571() - 128;
                                    iArr3[FrostHunterMeteringPointBetaCyber95712] = FrostHunterGyroscopeHeroAlpha1995.FrostHunterRemoteConfigSpeedSpeed8566((int) ((FrostHunterMeteringPointBetaCyber95715 * 1.772d) + FrostHunterMeteringPointBetaCyber95713), 0, 255) | (frostHunterLicensingSpectraPulse88682.FrostHunterMeteringPointBetaCyber9571() << 24) | (FrostHunterGyroscopeHeroAlpha1995.FrostHunterRemoteConfigSpeedSpeed8566((int) ((1.402d * FrostHunterMeteringPointBetaCyber95714) + FrostHunterMeteringPointBetaCyber95713), 0, 255) << 16) | (FrostHunterGyroscopeHeroAlpha1995.FrostHunterRemoteConfigSpeedSpeed8566((int) ((FrostHunterMeteringPointBetaCyber95713 - (0.34414d * FrostHunterMeteringPointBetaCyber95715)) - (FrostHunterMeteringPointBetaCyber95714 * 0.71414d)), 0, 255) << 8);
                                    i10++;
                                    c = c2;
                                    iArr2 = iArr3;
                                }
                                iArr = iArr2;
                                frostHunterLayerBlazeAurora9948.FrostHunterBundlePulseFusionHero2475 = true;
                                break;
                            }
                            iArr = iArr2;
                            break;
                        case 21:
                            if (FrostHunterBillingClientFusionVortex9008 >= 4) {
                                frostHunterLicensingSpectraPulse88682.FrostHunterFCMDeltaQuantumHero8364(3);
                                int i11 = FrostHunterBillingClientFusionVortex9008 - 4;
                                if (((128 & frostHunterLicensingSpectraPulse88682.FrostHunterMeteringPointBetaCyber9571()) != 0 ? 1 : i6) != 0) {
                                    if (i11 >= 7 && (FrostHunterDatabaseEliteShadowUltra2452 = frostHunterLicensingSpectraPulse88682.FrostHunterDatabaseEliteShadowUltra2452()) >= 4) {
                                        frostHunterLayerBlazeAurora9948.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterLicensingSpectraPulse88682.FrostHunterBillingClientFusionVortex9008();
                                        frostHunterLayerBlazeAurora9948.FrostHunterFlowMaxDragonHero5809 = frostHunterLicensingSpectraPulse88682.FrostHunterBillingClientFusionVortex9008();
                                        frostHunterLicensingSpectraPulse88683.FrostHunterStateCelestialNovaPixel8414(FrostHunterDatabaseEliteShadowUltra2452 - 4);
                                        i11 = FrostHunterBillingClientFusionVortex9008 - 11;
                                    }
                                }
                                int i12 = frostHunterLicensingSpectraPulse88683.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                int i13 = frostHunterLicensingSpectraPulse88683.FrostHunterBundlePulseFusionHero2475;
                                if (i12 < i13 && i11 > 0) {
                                    int min = Math.min(i11, i13 - i12);
                                    frostHunterLicensingSpectraPulse88682.FrostHunterKeyframeGammaGamma1197(frostHunterLicensingSpectraPulse88683.FrostHunterAlphaAnimationNeoCosmos5761, i12, min);
                                    frostHunterLicensingSpectraPulse88683.FrostHunterR8MasterNebulaSpark7247(i12 + min);
                                }
                            }
                            iArr = iArr2;
                            break;
                        case 22:
                            if (FrostHunterBillingClientFusionVortex9008 >= 19) {
                                frostHunterLayerBlazeAurora9948.FrostHunterServiceEliteCelestialThunder1757 = frostHunterLicensingSpectraPulse88682.FrostHunterBillingClientFusionVortex9008();
                                frostHunterLayerBlazeAurora9948.FrostHunterLifecycleBlazeGammaElite2889 = frostHunterLicensingSpectraPulse88682.FrostHunterBillingClientFusionVortex9008();
                                frostHunterLicensingSpectraPulse88682.FrostHunterFCMDeltaQuantumHero8364(11);
                                frostHunterLayerBlazeAurora9948.FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterLicensingSpectraPulse88682.FrostHunterBillingClientFusionVortex9008();
                                frostHunterLayerBlazeAurora9948.FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterLicensingSpectraPulse88682.FrostHunterBillingClientFusionVortex9008();
                            }
                            iArr = iArr2;
                            break;
                        default:
                            iArr = iArr2;
                            break;
                    }
                    i3 = 0;
                    frostHunterConstraintSetPhoenixVision2576 = null;
                } else {
                    iArr = iArr2;
                    if (frostHunterLayerBlazeAurora9948.FrostHunterServiceEliteCelestialThunder1757 == 0 || frostHunterLayerBlazeAurora9948.FrostHunterLifecycleBlazeGammaElite2889 == 0 || frostHunterLayerBlazeAurora9948.FrostHunterCameraXPixelTurboCosmos9814 == 0 || frostHunterLayerBlazeAurora9948.FrostHunterFlowMaxDragonHero5809 == 0 || (i4 = frostHunterLicensingSpectraPulse88683.FrostHunterBundlePulseFusionHero2475) == 0 || frostHunterLicensingSpectraPulse88683.FrostHunterConstraintSetCloneMasterUltraRogue2633 != i4 || !frostHunterLayerBlazeAurora9948.FrostHunterBundlePulseFusionHero2475) {
                        frostHunterConstraintSetPhoenixVision2576 = null;
                    } else {
                        frostHunterLicensingSpectraPulse88683.FrostHunterR8MasterNebulaSpark7247(0);
                        int i14 = frostHunterLayerBlazeAurora9948.FrostHunterCameraXPixelTurboCosmos9814 * frostHunterLayerBlazeAurora9948.FrostHunterFlowMaxDragonHero5809;
                        int[] iArr4 = new int[i14];
                        int i15 = 0;
                        while (i15 < i14) {
                            int FrostHunterMeteringPointBetaCyber95716 = frostHunterLicensingSpectraPulse88683.FrostHunterMeteringPointBetaCyber9571();
                            if (FrostHunterMeteringPointBetaCyber95716 != 0) {
                                i5 = i15 + 1;
                                iArr4[i15] = iArr[FrostHunterMeteringPointBetaCyber95716];
                            } else {
                                int FrostHunterMeteringPointBetaCyber95717 = frostHunterLicensingSpectraPulse88683.FrostHunterMeteringPointBetaCyber9571();
                                if (FrostHunterMeteringPointBetaCyber95717 != 0) {
                                    i5 = ((FrostHunterMeteringPointBetaCyber95717 & 64) == 0 ? FrostHunterMeteringPointBetaCyber95717 & 63 : ((FrostHunterMeteringPointBetaCyber95717 & 63) << 8) | frostHunterLicensingSpectraPulse88683.FrostHunterMeteringPointBetaCyber9571()) + i15;
                                    Arrays.fill(iArr4, i15, i5, (FrostHunterMeteringPointBetaCyber95717 & 128) == 0 ? iArr[0] : iArr[frostHunterLicensingSpectraPulse88683.FrostHunterMeteringPointBetaCyber9571()]);
                                }
                            }
                            i15 = i5;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr4, frostHunterLayerBlazeAurora9948.FrostHunterCameraXPixelTurboCosmos9814, frostHunterLayerBlazeAurora9948.FrostHunterFlowMaxDragonHero5809, Bitmap.Config.ARGB_8888);
                        float f = frostHunterLayerBlazeAurora9948.FrostHunterLevelListDrawableFusionDragonHero2232;
                        float f2 = frostHunterLayerBlazeAurora9948.FrostHunterServiceEliteCelestialThunder1757;
                        float f3 = f / f2;
                        float f4 = frostHunterLayerBlazeAurora9948.FrostHunterRemoteConfigSpeedSpeed8566;
                        float f5 = frostHunterLayerBlazeAurora9948.FrostHunterLifecycleBlazeGammaElite2889;
                        frostHunterConstraintSetPhoenixVision2576 = new FrostHunterConstraintSetPhoenixVision2576(null, null, null, createBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, frostHunterLayerBlazeAurora9948.FrostHunterCameraXPixelTurboCosmos9814 / f2, frostHunterLayerBlazeAurora9948.FrostHunterFlowMaxDragonHero5809 / f5, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    }
                    i3 = 0;
                    frostHunterLayerBlazeAurora9948.FrostHunterServiceEliteCelestialThunder1757 = 0;
                    frostHunterLayerBlazeAurora9948.FrostHunterLifecycleBlazeGammaElite2889 = 0;
                    frostHunterLayerBlazeAurora9948.FrostHunterLevelListDrawableFusionDragonHero2232 = 0;
                    frostHunterLayerBlazeAurora9948.FrostHunterRemoteConfigSpeedSpeed8566 = 0;
                    frostHunterLayerBlazeAurora9948.FrostHunterCameraXPixelTurboCosmos9814 = 0;
                    frostHunterLayerBlazeAurora9948.FrostHunterFlowMaxDragonHero5809 = 0;
                    frostHunterLicensingSpectraPulse88683.FrostHunterStateCelestialNovaPixel8414(0);
                    frostHunterLayerBlazeAurora9948.FrostHunterBundlePulseFusionHero2475 = false;
                }
                frostHunterLicensingSpectraPulse88682.FrostHunterR8MasterNebulaSpark7247(i8);
            }
            if (frostHunterConstraintSetPhoenixVision2576 != null) {
                arrayList.add(frostHunterConstraintSetPhoenixVision2576);
            }
            i6 = i3;
            iArr2 = iArr;
        }
        frostHunterLayoutInflaterNebulaVision6522.accept(new FrostHunterWindowManagerInfernoOlympianVortex6395(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public void FrostHunterFlowMaxDragonHero5809(FrostHunterVectorDrawableMasterTitanium6371 frostHunterVectorDrawableMasterTitanium6371, FrostHunterZoomStateTurboEpicEpic2510 frostHunterZoomStateTurboEpicEpic2510) {
        FrostHunterThemeOverlayEclipseSolar8293 frostHunterThemeOverlayEclipseSolar8293 = (FrostHunterThemeOverlayEclipseSolar8293) this.FrostHunterAlertDialogAuroraDelta3200;
        frostHunterThemeOverlayEclipseSolar8293.getClass();
        if (frostHunterThemeOverlayEclipseSolar8293.FrostHunterRemoteConfigSpeedSpeed8566 != 0) {
            return;
        }
        FrostHunterShapeAppearanceCelestialBlaze9124 FrostHunterBundlePulseFusionHero2475 = frostHunterThemeOverlayEclipseSolar8293.FrostHunterBundlePulseFusionHero2475(-1);
        frostHunterThemeOverlayEclipseSolar8293.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterBundlePulseFusionHero2475;
        frostHunterThemeOverlayEclipseSolar8293.FrostHunterRemoteConfigSpeedSpeed8566 = -1;
        frostHunterThemeOverlayEclipseSolar8293.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterVectorDrawableMasterTitanium6371;
        if (frostHunterZoomStateTurboEpicEpic2510 != null) {
            if (FrostHunterBundlePulseFusionHero2475 != null) {
                FrostHunterBundlePulseFusionHero2475.FrostHunterServiceEliteCelestialThunder1757(frostHunterZoomStateTurboEpicEpic2510);
            }
            FrostHunterPreviewPixelBetaQuantum7840 frostHunterPreviewPixelBetaQuantum7840 = frostHunterThemeOverlayEclipseSolar8293.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterDatabaseTurboRogueForce3997 frostHunterDatabaseTurboRogueForce3997 = new FrostHunterDatabaseTurboRogueForce3997(frostHunterZoomStateTurboEpicEpic2510);
            frostHunterPreviewPixelBetaQuantum7840.getClass();
            frostHunterPreviewPixelBetaQuantum7840.FrostHunterKeyframeGammaGamma1197(null, frostHunterDatabaseTurboRogueForce3997);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FrostHunterKeyframeGammaGamma1197(FrostHunterViewBindingCelestialVortex7351 frostHunterViewBindingCelestialVortex7351) {
        FrostHunterBannerAdAuroraAlpha3260 frostHunterBannerAdAuroraAlpha3260;
        int i;
        FrostHunterBottomSheetSpectraPixel6658 frostHunterBottomSheetSpectraPixel6658;
        FrostHunterCameraViewAlphaPixel2285 frostHunterCameraViewAlphaPixel2285 = (FrostHunterCameraViewAlphaPixel2285) this.FrostHunterFragmentBetaMegaVortex6025;
        if (frostHunterViewBindingCelestialVortex7351 instanceof FrostHunterBannerAdAuroraAlpha3260) {
            frostHunterBannerAdAuroraAlpha3260 = (FrostHunterBannerAdAuroraAlpha3260) frostHunterViewBindingCelestialVortex7351;
            int i2 = frostHunterBannerAdAuroraAlpha3260.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                frostHunterBannerAdAuroraAlpha3260.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i2 - Integer.MIN_VALUE;
                Object obj = frostHunterBannerAdAuroraAlpha3260.FrostHunterKeyframeGammaGamma1197;
                i = frostHunterBannerAdAuroraAlpha3260.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                if (i != 0) {
                    FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj);
                    List list = (List) this.FrostHunterKeyframeGammaGamma1197;
                    FrostHunterAuthMasterNovaXMax8430 frostHunterAuthMasterNovaXMax8430 = FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814;
                    if (list == null || list.isEmpty()) {
                        frostHunterBannerAdAuroraAlpha3260.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 1;
                        obj = FrostHunterCameraViewAlphaPixel2285.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterCameraViewAlphaPixel2285, false, frostHunterBannerAdAuroraAlpha3260);
                    } else {
                        FrostHunterActivityInfoOlympianTitanium4468 FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterCameraViewAlphaPixel2285.FrostHunterRemoteConfigSpeedSpeed8566();
                        FrostHunterJobIntentServiceOlympianShadowBeta7116 frostHunterJobIntentServiceOlympianShadowBeta7116 = new FrostHunterJobIntentServiceOlympianShadowBeta7116(frostHunterCameraViewAlphaPixel2285, this, null);
                        frostHunterBannerAdAuroraAlpha3260.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 2;
                        obj = FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterJobIntentServiceOlympianShadowBeta7116, frostHunterBannerAdAuroraAlpha3260);
                    }
                    return frostHunterAuthMasterNovaXMax8430;
                }
                if (i == 1) {
                    FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj);
                    frostHunterBottomSheetSpectraPixel6658 = (FrostHunterBottomSheetSpectraPixel6658) obj;
                } else {
                    if (i != 2) {
                        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj);
                    frostHunterBottomSheetSpectraPixel6658 = (FrostHunterBottomSheetSpectraPixel6658) obj;
                }
                frostHunterCameraViewAlphaPixel2285.FrostHunterLightSensorForceFusion4241.FrostHunterBillingClientFusionVortex9008(frostHunterBottomSheetSpectraPixel6658);
                return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
            }
        }
        frostHunterBannerAdAuroraAlpha3260 = new FrostHunterBannerAdAuroraAlpha3260(this, frostHunterViewBindingCelestialVortex7351);
        Object obj2 = frostHunterBannerAdAuroraAlpha3260.FrostHunterKeyframeGammaGamma1197;
        i = frostHunterBannerAdAuroraAlpha3260.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        if (i != 0) {
        }
        frostHunterCameraViewAlphaPixel2285.FrostHunterLightSensorForceFusion4241.FrostHunterBillingClientFusionVortex9008(frostHunterBottomSheetSpectraPixel6658);
        return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    public void FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterVectorDrawableMasterTitanium6371 frostHunterVectorDrawableMasterTitanium6371) {
        if (((LinkedHashSet) this.FrostHunterFragmentBetaMegaVortex6025).add(frostHunterVectorDrawableMasterTitanium6371)) {
            ((FrostHunterThemeOverlayEclipseSolar8293) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterAlphaAnimationNeoCosmos5761(this, frostHunterVectorDrawableMasterTitanium6371, -1);
        }
    }

    public synchronized ExecutorService FrostHunterLintTitanVortexQuantum9911() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.FrostHunterFlowMaxDragonHero5809) == null) {
                this.FrostHunterFlowMaxDragonHero5809 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new FrostHunterPaintPulseTitan9386(FrostHunterTextureViewForceEpicQuantum6388.FrostHunterConstraintSetCloneMasterUltraRogue2633 + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.FrostHunterFlowMaxDragonHero5809;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public boolean FrostHunterLooperHyperionForce4133(Context context) {
        if (((Boolean) this.FrostHunterAlertDialogAuroraDelta3200) == null) {
            this.FrostHunterAlertDialogAuroraDelta3200 = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        ((Boolean) this.FrostHunterAlertDialogAuroraDelta3200).booleanValue();
        return ((Boolean) this.FrostHunterAlertDialogAuroraDelta3200).booleanValue();
    }

    public void FrostHunterMeteringPointBetaCyber9571(FrostHunterMagnetometerTitaniumCyber5302 frostHunterMagnetometerTitaniumCyber5302, FrostHunterThemeOverlayAlphaUltra2883 frostHunterThemeOverlayAlphaUltra2883) {
        String str = ((FrostHunterServiceBetaQuantumElite9186) ((FrostHunterSQLiteMasterUltra9956) this.FrostHunterFlowMaxDragonHero5809).FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761;
        str.getClass();
        FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836 = FrostHunterBarrierStrikeDragonOlympian9836.FrostHunterKeyframeGammaGamma1197;
        FrostHunterBarrierStrikeDragonOlympian9836 FrostHunterScaleAnimationStrikeSpark5059 = FrostHunterChipSpeedTitan5326.FrostHunterScaleAnimationStrikeSpark5059(str);
        synchronized (frostHunterMagnetometerTitaniumCyber5302) {
            if (!frostHunterMagnetometerTitaniumCyber5302.FrostHunterLooperThreadBetaHyperionMax1000 && !frostHunterMagnetometerTitaniumCyber5302.FrostHunterCameraXTurboCelestialHero5430) {
                long j = frostHunterMagnetometerTitaniumCyber5302.FrostHunterLintTitanVortexQuantum9911;
                byte[] bArr = FrostHunterScaleAnimationStrikeSpark5059.FrostHunterCameraXPixelTurboCosmos9814;
                if (bArr.length + j > 16777216) {
                    frostHunterMagnetometerTitaniumCyber5302.FrostHunterConstraintSetCloneMasterUltraRogue2633(null, ErrorCodes.SERVER_RETRY_IN);
                    return;
                }
                frostHunterMagnetometerTitaniumCyber5302.FrostHunterLintTitanVortexQuantum9911 = j + bArr.length;
                frostHunterMagnetometerTitaniumCyber5302.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.add(new FrostHunterViewPagerPhoenixSolar1933(FrostHunterScaleAnimationStrikeSpark5059));
                frostHunterMagnetometerTitaniumCyber5302.FrostHunterLifecycleBlazeGammaElite2889();
            }
        }
    }

    public FrostHunterMaterialCardViewEliteRogue2483 FrostHunterMotionSceneAuroraMega2271(long j, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue2483, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24832) {
        if (((FrostHunterMaterialCardViewEliteRogue2483) this.FrostHunterKeyframeGammaGamma1197) == null) {
            this.FrostHunterKeyframeGammaGamma1197 = frostHunterMaterialCardViewEliteRogue2483.FrostHunterBundlePulseFusionHero2475();
        }
        FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24833 = (FrostHunterMaterialCardViewEliteRogue2483) this.FrostHunterKeyframeGammaGamma1197;
        if (frostHunterMaterialCardViewEliteRogue24833 == null) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("velocityVector");
            throw null;
        }
        int FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterMaterialCardViewEliteRogue24833.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        int i = 0;
        while (true) {
            FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24834 = (FrostHunterMaterialCardViewEliteRogue2483) this.FrostHunterKeyframeGammaGamma1197;
            if (i >= FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                if (frostHunterMaterialCardViewEliteRogue24834 != null) {
                    return frostHunterMaterialCardViewEliteRogue24834;
                }
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("velocityVector");
                throw null;
            }
            if (frostHunterMaterialCardViewEliteRogue24834 == null) {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("velocityVector");
                throw null;
            }
            FrostHunterAnimatorQuantumFusionMaster8565 frostHunterAnimatorQuantumFusionMaster8565 = (FrostHunterAnimatorQuantumFusionMaster8565) this.FrostHunterFlowMaxDragonHero5809;
            frostHunterMaterialCardViewEliteRogue2483.getClass();
            long j2 = j / 1000000;
            FrostHunterChipRogueLegendPrime1200 FrostHunterAlphaAnimationNeoCosmos5761 = ((FrostHunterMenuNovaBlaze4722) frostHunterAnimatorQuantumFusionMaster8565.FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761(frostHunterMaterialCardViewEliteRogue24832.FrostHunterAlphaAnimationNeoCosmos5761(i));
            long j3 = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterBundlePulseFusionHero2475;
            frostHunterMaterialCardViewEliteRogue24834.FrostHunterLifecycleBlazeGammaElite2889((((Math.signum(FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761) * FrostHunterAnimatorSetPixelRogueTitanium7694.FrostHunterAlphaAnimationNeoCosmos5761(j3 > 0 ? j2 / j3 : 1.0f).FrostHunterConstraintSetCloneMasterUltraRogue2633) * FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633) / j3) * 1000.0f, i);
            i++;
        }
    }

    public void FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterPermissionFusionStrike2494 frostHunterPermissionFusionStrike2494, int i) {
        if (i != 1 && i != 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Unsupported priority value: ", i));
        } else if (((LinkedHashSet) this.FrostHunterFragmentBetaMegaVortex6025).add(frostHunterPermissionFusionStrike2494)) {
            ((FrostHunterThemeOverlayEclipseSolar8293) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterAlphaAnimationNeoCosmos5761(this, frostHunterPermissionFusionStrike2494, i);
        }
    }

    @Override // android.content.Context.FrostHunterThemeOverlaySparkInfernoAurora4808
    public FrostHunterMaterialCardViewEliteRogue2483 FrostHunterResourcesTitanHyperVision5823(long j, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue2483, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24832, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24833) {
        if (((FrostHunterMaterialCardViewEliteRogue2483) this.FrostHunterAlertDialogAuroraDelta3200) == null) {
            this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterMaterialCardViewEliteRogue2483.FrostHunterBundlePulseFusionHero2475();
        }
        FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24834 = (FrostHunterMaterialCardViewEliteRogue2483) this.FrostHunterAlertDialogAuroraDelta3200;
        if (frostHunterMaterialCardViewEliteRogue24834 == null) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("valueVector");
            throw null;
        }
        int FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterMaterialCardViewEliteRogue24834.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        int i = 0;
        while (true) {
            FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24835 = (FrostHunterMaterialCardViewEliteRogue2483) this.FrostHunterAlertDialogAuroraDelta3200;
            if (i >= FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                if (frostHunterMaterialCardViewEliteRogue24835 != null) {
                    return frostHunterMaterialCardViewEliteRogue24835;
                }
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("valueVector");
                throw null;
            }
            if (frostHunterMaterialCardViewEliteRogue24835 == null) {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("valueVector");
                throw null;
            }
            frostHunterMaterialCardViewEliteRogue24835.FrostHunterLifecycleBlazeGammaElite2889(((FrostHunterAnimatorQuantumFusionMaster8565) this.FrostHunterFlowMaxDragonHero5809).FrostHunterLooperThreadBetaHyperionMax1000(i).FrostHunterConstraintSetCloneMasterUltraRogue2633(j, frostHunterMaterialCardViewEliteRogue2483.FrostHunterAlphaAnimationNeoCosmos5761(i), frostHunterMaterialCardViewEliteRogue24832.FrostHunterAlphaAnimationNeoCosmos5761(i), frostHunterMaterialCardViewEliteRogue24833.FrostHunterAlphaAnimationNeoCosmos5761(i)), i);
            i++;
        }
    }

    @Override // android.content.Context.FrostHunterThemeOverlaySparkInfernoAurora4808
    public FrostHunterMaterialCardViewEliteRogue2483 FrostHunterScaleAnimationStrikeSpark5059(long j, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue2483, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24832, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24833) {
        if (((FrostHunterMaterialCardViewEliteRogue2483) this.FrostHunterKeyframeGammaGamma1197) == null) {
            this.FrostHunterKeyframeGammaGamma1197 = frostHunterMaterialCardViewEliteRogue24833.FrostHunterBundlePulseFusionHero2475();
        }
        FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24834 = (FrostHunterMaterialCardViewEliteRogue2483) this.FrostHunterKeyframeGammaGamma1197;
        if (frostHunterMaterialCardViewEliteRogue24834 == null) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("velocityVector");
            throw null;
        }
        int FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterMaterialCardViewEliteRogue24834.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        int i = 0;
        while (true) {
            FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24835 = (FrostHunterMaterialCardViewEliteRogue2483) this.FrostHunterKeyframeGammaGamma1197;
            if (i >= FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                if (frostHunterMaterialCardViewEliteRogue24835 != null) {
                    return frostHunterMaterialCardViewEliteRogue24835;
                }
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("velocityVector");
                throw null;
            }
            if (frostHunterMaterialCardViewEliteRogue24835 == null) {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("velocityVector");
                throw null;
            }
            frostHunterMaterialCardViewEliteRogue24835.FrostHunterLifecycleBlazeGammaElite2889(((FrostHunterAnimatorQuantumFusionMaster8565) this.FrostHunterFlowMaxDragonHero5809).FrostHunterLooperThreadBetaHyperionMax1000(i).FrostHunterBundlePulseFusionHero2475(j, frostHunterMaterialCardViewEliteRogue2483.FrostHunterAlphaAnimationNeoCosmos5761(i), frostHunterMaterialCardViewEliteRogue24832.FrostHunterAlphaAnimationNeoCosmos5761(i), frostHunterMaterialCardViewEliteRogue24833.FrostHunterAlphaAnimationNeoCosmos5761(i)), i);
            i++;
        }
    }

    @Override // android.content.Context.FrostHunterThemeOverlaySparkInfernoAurora4808
    public FrostHunterMaterialCardViewEliteRogue2483 FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue2483, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24832, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24833) {
        if (((FrostHunterMaterialCardViewEliteRogue2483) this.FrostHunterFragmentBetaMegaVortex6025) == null) {
            this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterMaterialCardViewEliteRogue24833.FrostHunterBundlePulseFusionHero2475();
        }
        FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24834 = (FrostHunterMaterialCardViewEliteRogue2483) this.FrostHunterFragmentBetaMegaVortex6025;
        if (frostHunterMaterialCardViewEliteRogue24834 == null) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("endVelocityVector");
            throw null;
        }
        int FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterMaterialCardViewEliteRogue24834.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        int i = 0;
        while (true) {
            FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24835 = (FrostHunterMaterialCardViewEliteRogue2483) this.FrostHunterFragmentBetaMegaVortex6025;
            if (i >= FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                if (frostHunterMaterialCardViewEliteRogue24835 != null) {
                    return frostHunterMaterialCardViewEliteRogue24835;
                }
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("endVelocityVector");
                throw null;
            }
            if (frostHunterMaterialCardViewEliteRogue24835 == null) {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("endVelocityVector");
                throw null;
            }
            frostHunterMaterialCardViewEliteRogue24835.FrostHunterLifecycleBlazeGammaElite2889(((FrostHunterAnimatorQuantumFusionMaster8565) this.FrostHunterFlowMaxDragonHero5809).FrostHunterLooperThreadBetaHyperionMax1000(i).FrostHunterLifecycleBlazeGammaElite2889(frostHunterMaterialCardViewEliteRogue2483.FrostHunterAlphaAnimationNeoCosmos5761(i), frostHunterMaterialCardViewEliteRogue24832.FrostHunterAlphaAnimationNeoCosmos5761(i), frostHunterMaterialCardViewEliteRogue24833.FrostHunterAlphaAnimationNeoCosmos5761(i)), i);
            i++;
        }
    }

    @Override // android.content.Context.FrostHunterTraceAuroraFusion8204
    public FrostHunterFontFamilySolarSpeedCelestial8941 FrostHunterServiceEliteCelestialThunder1757() {
        return (FrostHunterTextInputLayoutHyperEpic7981) this.FrostHunterKeyframeGammaGamma1197;
    }

    public void FrostHunterServiceInfoHyperionSparkMax9966(String str) {
        Object frostHunterRealtimeDatabaseBetaOlympianPhoenix2409;
        ComponentActivity componentActivity;
        str.getClass();
        if (((FrostHunterTextWatcherMasterFusionEpic6803) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761) {
            return;
        }
        this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterTextWatcherMasterFusionEpic6803(str, 4);
        try {
            componentActivity = (ComponentActivity) this.FrostHunterFragmentBetaMegaVortex6025;
        } catch (Throwable th) {
            frostHunterRealtimeDatabaseBetaOlympianPhoenix2409 = new FrostHunterRealtimeDatabaseBetaOlympianPhoenix2409(th);
        }
        if (componentActivity == null) {
            return;
        }
        FrostHunterMeteringPointDeltaPrimeSolar9676 frostHunterMeteringPointDeltaPrimeSolar9676 = new FrostHunterMeteringPointDeltaPrimeSolar9676((FrostHunterTraceHyperionAuroraNebula9947) this.FrostHunterAlertDialogAuroraDelta3200);
        Intent intent = (Intent) frostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterAlertDialogAuroraDelta3200;
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", -1);
        bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", -1);
        frostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterServiceConnectionTurboPhoenixOmega6719 = bundle;
        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 0);
        intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
        frostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterCameraXPixelTurboCosmos9814 = 2;
        intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        frostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterFragmentBetaMegaVortex6025 = ActivityOptions.makeCustomAnimation(componentActivity, R.anim.slide_in_left, R.anim.slide_out_right);
        intent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(componentActivity, R.anim.slide_in_left, R.anim.slide_out_right).toBundle());
        FrostHunterIntentForceSpeed4935 FrostHunterFlowMaxDragonHero5809 = frostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterFlowMaxDragonHero5809();
        try {
            componentActivity.getPackageManager().getPackageInfo("com.android.chrome", 0);
            ((Intent) FrostHunterFlowMaxDragonHero5809.FrostHunterFlowMaxDragonHero5809).setPackage("com.android.chrome");
        } catch (Throwable unused) {
        }
        Uri parse = Uri.parse(str);
        Intent intent2 = (Intent) FrostHunterFlowMaxDragonHero5809.FrostHunterFlowMaxDragonHero5809;
        intent2.setData(parse);
        componentActivity.startActivity(intent2, (Bundle) FrostHunterFlowMaxDragonHero5809.FrostHunterAlertDialogAuroraDelta3200);
        frostHunterRealtimeDatabaseBetaOlympianPhoenix2409 = FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
        if (FrostHunterProximitySensorLegendAuroraPrime1541.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRealtimeDatabaseBetaOlympianPhoenix2409) != null) {
            try {
                ComponentActivity componentActivity2 = (ComponentActivity) this.FrostHunterFragmentBetaMegaVortex6025;
                if (componentActivity2 != null) {
                    componentActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                }
            } catch (Throwable unused2) {
            }
            this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterTextWatcherMasterFusionEpic6803(null, 7);
        }
    }

    public FrostHunterCanvasHyperGammaForce7674 FrostHunterTextViewDragonStormMega4297(String str) {
        Iterator it = ((ArrayDeque) this.FrostHunterAlertDialogAuroraDelta3200).iterator();
        it.getClass();
        while (it.hasNext()) {
            FrostHunterCanvasHyperGammaForce7674 frostHunterCanvasHyperGammaForce7674 = (FrostHunterCanvasHyperGammaForce7674) it.next();
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterCanvasHyperGammaForce7674.FrostHunterAlertDialogAuroraDelta3200.FrostHunterFlowMaxDragonHero5809.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceEliteCelestialThunder1757, str)) {
                return frostHunterCanvasHyperGammaForce7674;
            }
        }
        Iterator it2 = ((ArrayDeque) this.FrostHunterFragmentBetaMegaVortex6025).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            FrostHunterCanvasHyperGammaForce7674 frostHunterCanvasHyperGammaForce76742 = (FrostHunterCanvasHyperGammaForce7674) it2.next();
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterCanvasHyperGammaForce76742.FrostHunterAlertDialogAuroraDelta3200.FrostHunterFlowMaxDragonHero5809.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceEliteCelestialThunder1757, str)) {
                return frostHunterCanvasHyperGammaForce76742;
            }
        }
        return null;
    }

    public void FrostHunterViewPhantomNeo1634(FrostHunterResourcePixelEpic4102 frostHunterResourcePixelEpic4102) {
        if (((FrostHunterLinearLayoutTurboPhoenixRogue2132) this.FrostHunterAlertDialogAuroraDelta3200) == FrostHunterLinearLayoutTurboPhoenixRogue2132.FrostHunterFlowMaxDragonHero5809) {
            FrostHunterModelInputOutputEliteHyperForce8871 frostHunterModelInputOutputEliteHyperForce8871 = (FrostHunterModelInputOutputEliteHyperForce8871) this.FrostHunterFlowMaxDragonHero5809;
            if (frostHunterModelInputOutputEliteHyperForce8871 == null) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("layoutCoordinates not set");
                return;
            } else {
                FrostHunterBindingAdapterSpeedNeo6677.FrostHunterPagingSourceEclipseDelta8255(frostHunterResourcePixelEpic4102, frostHunterModelInputOutputEliteHyperForce8871.FrostHunterViewPhantomNeo1634(0L), new FrostHunterOnAttachStateChangeListenerStrikeOmegaElite9598(16, (FrostHunterActionBarMegaTurboNova4043) this.FrostHunterFragmentBetaMegaVortex6025), true);
            }
        }
        this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterLinearLayoutTurboPhoenixRogue2132.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // android.content.Context.FrostHunterTraceAuroraFusion8204
    public void cancel() {
        ((Socket) this.FrostHunterFlowMaxDragonHero5809).close();
    }

    @Override // android.content.Context.FrostHunterClipboardManagerMegaRogue2930
    public Object get() {
        return new FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849((Executor) ((FrostHunterClipboardManagerMegaRogue2930) this.FrostHunterFlowMaxDragonHero5809).get(), (FrostHunterModelInputOutputTitanHyperion7556) ((FrostHunterClipboardManagerMegaRogue2930) this.FrostHunterAlertDialogAuroraDelta3200).get(), (FrostHunterTraceHyperionAuroraNebula9947) ((FrostHunterServicePhantomGammaTitan7103) this.FrostHunterKeyframeGammaGamma1197).get(), (FrostHunterModelInputOutputTitanHyperion7556) ((FrostHunterClipboardManagerMegaRogue2930) this.FrostHunterFragmentBetaMegaVortex6025).get(), 22);
    }

    public String toString() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                String socket = ((Socket) this.FrostHunterFlowMaxDragonHero5809).toString();
                socket.getClass();
                return socket;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(int i, boolean z) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
    }

    public /* synthetic */ FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj2;
        this.FrostHunterKeyframeGammaGamma1197 = obj3;
        this.FrostHunterFragmentBetaMegaVortex6025 = obj4;
    }

    public FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(FrostHunterRunnableCosmosNebulaRogue7208 frostHunterRunnableCosmosNebulaRogue7208, FrostHunterActionBarOmegaThunder1246 frostHunterActionBarOmegaThunder1246, FrostHunterRunnableForceDelta6202 frostHunterRunnableForceDelta6202, FrostHunterThemeOverlayNebulaDelta6405 frostHunterThemeOverlayNebulaDelta6405) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 3;
        frostHunterActionBarOmegaThunder1246.getClass();
        frostHunterRunnableForceDelta6202.getClass();
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterRunnableCosmosNebulaRogue7208;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterActionBarOmegaThunder1246;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterRunnableForceDelta6202;
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterThemeOverlayNebulaDelta6405;
    }

    public FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(FrostHunterViewModelScopeSparkBlaze1575 frostHunterViewModelScopeSparkBlaze1575, FrostHunterDatabaseMasterPrimeSpeed8049 frostHunterDatabaseMasterPrimeSpeed8049, FrostHunterLaunchEclipseAurora4535 frostHunterLaunchEclipseAurora4535, FrostHunterGuidelineCyberShadow5104 frostHunterGuidelineCyberShadow5104) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 17;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterViewModelScopeSparkBlaze1575;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterGuidelineCyberShadow5104;
        this.FrostHunterKeyframeGammaGamma1197 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterBundlePulseFusionHero2475(Integer.MAX_VALUE, null, 6);
        this.FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterLayoutInflaterTurboHyperion3832(14);
        FrostHunterContentObserverLegendUltraVortex4209 frostHunterContentObserverLegendUltraVortex4209 = (FrostHunterContentObserverLegendUltraVortex4209) frostHunterViewModelScopeSparkBlaze1575.FrostHunterFlowMaxDragonHero5809().FrostHunterKeyframeGammaGamma1197(FrostHunterRewardedAdHyperStrike1151.FrostHunterCardViewSpectraCyber7714);
        if (frostHunterContentObserverLegendUltraVortex4209 != null) {
            frostHunterContentObserverLegendUltraVortex4209.FrostHunterBitmapTurboDeltaNebula8743(new FrostHunterPagingDataAuroraSpark1825(frostHunterDatabaseMasterPrimeSpeed8049, this, frostHunterLaunchEclipseAurora4535, 5));
        }
    }

    public FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(FrostHunterPropertyValuesHolderMaxSpeed2945 frostHunterPropertyValuesHolderMaxSpeed2945, FrostHunterAdapterDelegatePhantomTitanium6932 frostHunterAdapterDelegatePhantomTitanium6932, FrostHunterAnimatorSetThunderSpark5581 frostHunterAnimatorSetThunderSpark5581) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 21;
        frostHunterPropertyValuesHolderMaxSpeed2945.getClass();
        frostHunterAnimatorSetThunderSpark5581.getClass();
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterPropertyValuesHolderMaxSpeed2945;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterAdapterDelegatePhantomTitanium6932;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterAnimatorSetThunderSpark5581;
        this.FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterBottomSheetEclipseUltraShadow6009(27);
    }

    public FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(Socket socket) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 6;
        this.FrostHunterFlowMaxDragonHero5809 = socket;
        this.FrostHunterAlertDialogAuroraDelta3200 = new AtomicInteger();
        this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterTextInputLayoutHyperEpic7981(this);
        this.FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterFragmentTransactionAuroraForceRogue8349(this);
    }

    public FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(FrostHunterFilterSpectraTitan5298 frostHunterFilterSpectraTitan5298, FrostHunterDatabaseDeltaTitaniumInferno8363 frostHunterDatabaseDeltaTitaniumInferno8363) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 1;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterFilterSpectraTitan5298;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterDatabaseDeltaTitaniumInferno8363;
        AutofillManager FrostHunterLightSensorForceFusion4241 = FrostHunterDigitalInkRecognitionCosmosAlpha4116.FrostHunterLightSensorForceFusion4241(frostHunterFilterSpectraTitan5298.getContext().getSystemService(FrostHunterDigitalInkRecognitionCosmosAlpha4116.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()));
        if (FrostHunterLightSensorForceFusion4241 != null) {
            this.FrostHunterKeyframeGammaGamma1197 = FrostHunterLightSensorForceFusion4241;
            frostHunterFilterSpectraTitan5298.setImportantForAutofill(1);
            FrostHunterInstrumentationStrikeBlazeThunder7469 FrostHunterBundlePulseFusionHero2475 = FrostHunterCardViewLegendUltra9902.FrostHunterBundlePulseFusionHero2475(frostHunterFilterSpectraTitan5298);
            AutofillId FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterBundlePulseFusionHero2475 != null ? FrostHunterHandlerSparkNebula5537.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterBundlePulseFusionHero2475.FrostHunterCameraXPixelTurboCosmos9814) : null;
            if (FrostHunterLifecycleBlazeGammaElite2889 != null) {
                this.FrostHunterFragmentBetaMegaVortex6025 = FrostHunterLifecycleBlazeGammaElite2889;
                return;
            }
            throw FrostHunterKeyEventNovaXAlpha1220.FrostHunterLevelListDrawableFusionDragonHero2232("Required value was null.");
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Autofill service could not be located.");
        throw null;
    }

    public FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(FrostHunterActionBarMegaTurboNova4043 frostHunterActionBarMegaTurboNova4043) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 15;
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterActionBarMegaTurboNova4043;
        this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterLinearLayoutTurboPhoenixRogue2132.FrostHunterCameraXPixelTurboCosmos9814;
    }

    public FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(FrostHunterRippleDrawableMaxElite5227 frostHunterRippleDrawableMaxElite5227) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 11;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterRippleDrawableMaxElite5227;
        this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterThemeOverlayEclipseSolar8293();
        new LinkedHashSet();
        this.FrostHunterKeyframeGammaGamma1197 = new LinkedHashSet();
        this.FrostHunterFragmentBetaMegaVortex6025 = new LinkedHashSet();
    }

    public /* synthetic */ FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(int i, Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
    }

    public FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(Typeface typeface, FrostHunterWindowManagerPrimeForce7319 frostHunterWindowManagerPrimeForce7319) {
        int i;
        int i2;
        int i3;
        int i4;
        this.FrostHunterCameraXPixelTurboCosmos9814 = 9;
        this.FrostHunterFragmentBetaMegaVortex6025 = typeface;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterWindowManagerPrimeForce7319;
        this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterDialogFragmentEpicCyber2913(1024);
        int FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterWindowManagerPrimeForce7319.FrostHunterAlphaAnimationNeoCosmos5761(6);
        if (FrostHunterAlphaAnimationNeoCosmos5761 != 0) {
            int i5 = FrostHunterAlphaAnimationNeoCosmos5761 + frostHunterWindowManagerPrimeForce7319.FrostHunterCameraXPixelTurboCosmos9814;
            i = ((ByteBuffer) frostHunterWindowManagerPrimeForce7319.FrostHunterKeyframeGammaGamma1197).getInt(((ByteBuffer) frostHunterWindowManagerPrimeForce7319.FrostHunterKeyframeGammaGamma1197).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.FrostHunterAlertDialogAuroraDelta3200 = new char[i * 2];
        int FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterWindowManagerPrimeForce7319.FrostHunterAlphaAnimationNeoCosmos5761(6);
        if (FrostHunterAlphaAnimationNeoCosmos57612 != 0) {
            int i6 = FrostHunterAlphaAnimationNeoCosmos57612 + frostHunterWindowManagerPrimeForce7319.FrostHunterCameraXPixelTurboCosmos9814;
            i2 = ((ByteBuffer) frostHunterWindowManagerPrimeForce7319.FrostHunterKeyframeGammaGamma1197).getInt(((ByteBuffer) frostHunterWindowManagerPrimeForce7319.FrostHunterKeyframeGammaGamma1197).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            FrostHunterSupervisorJobLegendNova9809 frostHunterSupervisorJobLegendNova9809 = new FrostHunterSupervisorJobLegendNova9809(this, i7);
            FrostHunterInterpolatorAuroraPixel1637 FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterSupervisorJobLegendNova9809.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            int FrostHunterAlphaAnimationNeoCosmos57613 = FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761(4);
            Character.toChars(FrostHunterAlphaAnimationNeoCosmos57613 != 0 ? ((ByteBuffer) FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterKeyframeGammaGamma1197).getInt(FrostHunterAlphaAnimationNeoCosmos57613 + FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterCameraXPixelTurboCosmos9814) : 0, (char[]) this.FrostHunterAlertDialogAuroraDelta3200, i7 * 2);
            FrostHunterInterpolatorAuroraPixel1637 FrostHunterConstraintSetCloneMasterUltraRogue26332 = frostHunterSupervisorJobLegendNova9809.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            int FrostHunterAlphaAnimationNeoCosmos57614 = FrostHunterConstraintSetCloneMasterUltraRogue26332.FrostHunterAlphaAnimationNeoCosmos5761(16);
            if (FrostHunterAlphaAnimationNeoCosmos57614 != 0) {
                int i8 = FrostHunterAlphaAnimationNeoCosmos57614 + FrostHunterConstraintSetCloneMasterUltraRogue26332.FrostHunterCameraXPixelTurboCosmos9814;
                i3 = ((ByteBuffer) FrostHunterConstraintSetCloneMasterUltraRogue26332.FrostHunterKeyframeGammaGamma1197).getInt(((ByteBuffer) FrostHunterConstraintSetCloneMasterUltraRogue26332.FrostHunterKeyframeGammaGamma1197).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (i3 > 0) {
                FrostHunterDialogFragmentEpicCyber2913 frostHunterDialogFragmentEpicCyber2913 = (FrostHunterDialogFragmentEpicCyber2913) this.FrostHunterKeyframeGammaGamma1197;
                FrostHunterInterpolatorAuroraPixel1637 FrostHunterConstraintSetCloneMasterUltraRogue26333 = frostHunterSupervisorJobLegendNova9809.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                int FrostHunterAlphaAnimationNeoCosmos57615 = FrostHunterConstraintSetCloneMasterUltraRogue26333.FrostHunterAlphaAnimationNeoCosmos5761(16);
                if (FrostHunterAlphaAnimationNeoCosmos57615 != 0) {
                    int i9 = FrostHunterAlphaAnimationNeoCosmos57615 + FrostHunterConstraintSetCloneMasterUltraRogue26333.FrostHunterCameraXPixelTurboCosmos9814;
                    i4 = ((ByteBuffer) FrostHunterConstraintSetCloneMasterUltraRogue26333.FrostHunterKeyframeGammaGamma1197).getInt(((ByteBuffer) FrostHunterConstraintSetCloneMasterUltraRogue26333.FrostHunterKeyframeGammaGamma1197).getInt(i9) + i9);
                } else {
                    i4 = 0;
                }
                frostHunterDialogFragmentEpicCyber2913.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterSupervisorJobLegendNova9809, 0, i4 - 1);
            } else {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("invalid metadata codepoint length");
                throw null;
            }
        }
    }

    public FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        switch (i) {
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                this.FrostHunterFragmentBetaMegaVortex6025 = new ArrayDeque();
                this.FrostHunterAlertDialogAuroraDelta3200 = new ArrayDeque();
                this.FrostHunterKeyframeGammaGamma1197 = new ArrayDeque();
                break;
            case 13:
                this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterContentObserverCelestialAuroraBlaze7297(FrostHunterCardViewHyperionAurora3829.FrostHunterFCMDeltaQuantumHero8364("pay.google.com", "payments.google.com", "wallet.google.com"));
                this.FrostHunterFlowMaxDragonHero5809 = "/gp/p/loading";
                this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterMagnetometerInfernoDragon1607();
                this.FrostHunterFragmentBetaMegaVortex6025 = FrostHunterCardViewHyperionAurora3829.FrostHunterFCMDeltaQuantumHero8364("googlepay://", "tez://", "intent://");
                break;
            case 14:
                this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterLicensingSpectraPulse8868();
                this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterLicensingSpectraPulse8868();
                this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterLayerBlazeAurora9948();
                break;
            default:
                this.FrostHunterFlowMaxDragonHero5809 = null;
                this.FrostHunterAlertDialogAuroraDelta3200 = null;
                this.FrostHunterKeyframeGammaGamma1197 = null;
                this.FrostHunterFragmentBetaMegaVortex6025 = new ArrayDeque();
                break;
        }
    }

    public FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(FrostHunterBitmapNeoCosmos7205 frostHunterBitmapNeoCosmos7205, FrostHunterInstrumentationSpectraPixelMax7909 frostHunterInstrumentationSpectraPixelMax7909, FrostHunterInstrumentationSpectraPixelMax7909 frostHunterInstrumentationSpectraPixelMax79092, FrostHunterInstrumentationSpectraPixelMax7909 frostHunterInstrumentationSpectraPixelMax79093) {
        Object obj;
        this.FrostHunterCameraXPixelTurboCosmos9814 = 10;
        if (frostHunterBitmapNeoCosmos7205 != null) {
            obj = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterKeyframeGammaGamma1197(frostHunterBitmapNeoCosmos7205);
        } else {
            FrostHunterAnimatorOlympianPhantomElite2405 frostHunterAnimatorOlympianPhantomElite2405 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFlowMaxDragonHero5809;
            obj = FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025;
        }
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterInstrumentationSpectraPixelMax7909;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterInstrumentationSpectraPixelMax79092;
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterInstrumentationSpectraPixelMax79093;
    }

    public FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(FrostHunterCameraViewAlphaPixel2285 frostHunterCameraViewAlphaPixel2285, List list) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 5;
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterCameraViewAlphaPixel2285;
        this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterAdapterEliteSpectraSolar8984();
        FrostHunterPaintOlympianEliteTitanium2519 frostHunterPaintOlympianEliteTitanium2519 = new FrostHunterPaintOlympianEliteTitanium2519(true);
        frostHunterPaintOlympianEliteTitanium2519.FrostHunterPagingSourceEclipseDelta8255(null);
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterPaintOlympianEliteTitanium2519;
        this.FrostHunterKeyframeGammaGamma1197 = FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterGyroscopeOmegaEclipseOlympian7225(list);
    }

    public FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(AudioTrack audioTrack, FrostHunterLayoutInflaterTurboHyperion3832 frostHunterLayoutInflaterTurboHyperion3832) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 2;
        this.FrostHunterFlowMaxDragonHero5809 = audioTrack;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterLayoutInflaterTurboHyperion3832;
        Handler FrostHunterKeyframeGammaGamma1197 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterKeyframeGammaGamma1197(null);
        this.FrostHunterKeyframeGammaGamma1197 = FrostHunterKeyframeGammaGamma1197;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: android.content.Context.FrostHunterGradlePluginMegaShadow1674
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 = FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.this;
                if (((FrostHunterGradlePluginMegaShadow1674) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterFragmentBetaMegaVortex6025) == null) {
                    return;
                }
                FrostHunterPaintCyberPulse5979.FrostHunterServiceInfoHyperionSparkMax9966().execute(new FrostHunterDialogQuantumTurbo8340(7, frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849, audioRouting));
            }
        };
        this.FrostHunterFragmentBetaMegaVortex6025 = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, FrostHunterKeyframeGammaGamma1197);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(FrostHunterBitmapTurboStormHyperion1313 frostHunterBitmapTurboStormHyperion1313) {
        this(19, new FrostHunterAnimatorQuantumFusionMaster8565(28, frostHunterBitmapTurboStormHyperion1313));
        this.FrostHunterCameraXPixelTurboCosmos9814 = 19;
    }

    public FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(FrostHunterMergeHyperTitan4255 frostHunterMergeHyperTitan4255, boolean[] zArr) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 16;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterMergeHyperTitan4255;
        this.FrostHunterAlertDialogAuroraDelta3200 = zArr;
        int i = frostHunterMergeHyperTitan4255.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterKeyframeGammaGamma1197 = new boolean[i];
        this.FrostHunterFragmentBetaMegaVortex6025 = new boolean[i];
    }
}
