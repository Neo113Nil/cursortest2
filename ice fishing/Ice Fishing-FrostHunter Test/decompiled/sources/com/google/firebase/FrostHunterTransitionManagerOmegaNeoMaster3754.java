package com.google.firebase;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Context.FrostHunterAdapterDelegateForceForce1151;
import android.content.Context.FrostHunterAnimatorStormAurora6710;
import android.content.Context.FrostHunterBroadcastReceiverBlazePixelMax7154;
import android.content.Context.FrostHunterBroadcastReceiverShadowDragon9025;
import android.content.Context.FrostHunterCanvasInfernoVortex4700;
import android.content.Context.FrostHunterCardViewHyperionAurora3829;
import android.content.Context.FrostHunterColorStateListEpicQuantum4488;
import android.content.Context.FrostHunterEventShadowPulse9822;
import android.content.Context.FrostHunterEventSolarGammaStrike6218;
import android.content.Context.FrostHunterFlowDragonHyperionPixel5649;
import android.content.Context.FrostHunterFlowHyperionVortexDelta5013;
import android.content.Context.FrostHunterFragmentVortexDeltaHero2456;
import android.content.Context.FrostHunterItemDecorationForceEliteNebula8512;
import android.content.Context.FrostHunterKotlinQuantumRogue5892;
import android.content.Context.FrostHunterMeteringPointHyperHero4450;
import android.content.Context.FrostHunterObjectDetectionOlympianOlympian2873;
import android.content.Context.FrostHunterR8GammaHeroMaster6087;
import android.content.Context.FrostHunterRemoteConfigPhantomDelta1739;
import android.content.Context.FrostHunterRewardedAdHyperStrike1151;
import android.content.Context.FrostHunterServiceSpeedTurbo2699;
import android.content.Context.FrostHunterSurfaceViewStrikeAlphaStrike8734;
import android.content.Context.FrostHunterViewModelPhoenixDragon1261;
import android.content.Context.FrostHunterViewPager2SpectraForceVortex4544;
import android.content.Context.FrostHunterWorkManagerHyperionSpeed9013;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.util.Base64;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTransitionManagerOmegaNeoMaster3754 {
    public static final Object FrostHunterAlertDialogAuroraDelta3200 = new Object();
    public static final FrostHunterViewPager2SpectraForceVortex4544 FrostHunterKeyframeGammaGamma1197 = new FrostHunterViewPager2SpectraForceVortex4544(0);
    public final Context FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterFlowDragonHyperionPixel5649 FrostHunterBundlePulseFusionHero2475;
    public final FrostHunterAdapterDelegateForceForce1151 FrostHunterCameraXPixelTurboCosmos9814;
    public final String FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final FrostHunterWorkManagerHyperionSpeed9013 FrostHunterRemoteConfigSpeedSpeed8566;
    public final FrostHunterR8GammaHeroMaster6087 FrostHunterServiceEliteCelestialThunder1757;
    public final AtomicBoolean FrostHunterLifecycleBlazeGammaElite2889 = new AtomicBoolean(false);
    public final AtomicBoolean FrostHunterLevelListDrawableFusionDragonHero2232 = new AtomicBoolean();
    public final CopyOnWriteArrayList FrostHunterFlowMaxDragonHero5809 = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    public FrostHunterTransitionManagerOmegaNeoMaster3754(Context context, String str, FrostHunterFlowDragonHyperionPixel5649 frostHunterFlowDragonHyperionPixel5649) {
        ?? arrayList;
        int i = 0;
        new CopyOnWriteArrayList();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = context;
        FrostHunterCardViewHyperionAurora3829.FrostHunterFragmentBetaMegaVortex6025(str);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str;
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterFlowDragonHyperionPixel5649;
        FrostHunterBroadcastReceiverShadowDragon9025 frostHunterBroadcastReceiverShadowDragon9025 = FirebaseInitProvider.FrostHunterCameraXPixelTurboCosmos9814;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Objects.toString(ComponentDiscoveryService.class);
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new FrostHunterEventSolarGammaStrike6218(i, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        FrostHunterBroadcastReceiverBlazePixelMax7154 frostHunterBroadcastReceiverBlazePixelMax7154 = FrostHunterBroadcastReceiverBlazePixelMax7154.FrostHunterCameraXPixelTurboCosmos9814;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i2 = 1;
        arrayList3.add(new FrostHunterEventSolarGammaStrike6218(i2, new FirebaseCommonRegistrar()));
        arrayList3.add(new FrostHunterEventSolarGammaStrike6218(i2, new ExecutorsRegistrar()));
        arrayList4.add(FrostHunterAnimatorStormAurora6710.FrostHunterConstraintSetCloneMasterUltraRogue2633(context, Context.class, new Class[0]));
        arrayList4.add(FrostHunterAnimatorStormAurora6710.FrostHunterConstraintSetCloneMasterUltraRogue2633(this, FrostHunterTransitionManagerOmegaNeoMaster3754.class, new Class[0]));
        arrayList4.add(FrostHunterAnimatorStormAurora6710.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFlowDragonHyperionPixel5649, FrostHunterFlowDragonHyperionPixel5649.class, new Class[0]));
        FrostHunterRewardedAdHyperStrike1151 frostHunterRewardedAdHyperStrike1151 = new FrostHunterRewardedAdHyperStrike1151(27);
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.FrostHunterFlowMaxDragonHero5809.get()) {
            arrayList4.add(FrostHunterAnimatorStormAurora6710.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterBroadcastReceiverShadowDragon9025, FrostHunterBroadcastReceiverShadowDragon9025.class, new Class[0]));
        }
        FrostHunterBroadcastReceiverBlazePixelMax7154 frostHunterBroadcastReceiverBlazePixelMax71542 = FrostHunterBroadcastReceiverBlazePixelMax7154.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterR8GammaHeroMaster6087 frostHunterR8GammaHeroMaster6087 = new FrostHunterR8GammaHeroMaster6087();
        frostHunterR8GammaHeroMaster6087.FrostHunterCameraXPixelTurboCosmos9814 = new HashMap();
        frostHunterR8GammaHeroMaster6087.FrostHunterFlowMaxDragonHero5809 = new HashMap();
        frostHunterR8GammaHeroMaster6087.FrostHunterAlertDialogAuroraDelta3200 = new HashMap();
        frostHunterR8GammaHeroMaster6087.FrostHunterKeyframeGammaGamma1197 = new HashSet();
        frostHunterR8GammaHeroMaster6087.FrostHunterServiceConnectionTurboPhoenixOmega6719 = new AtomicReference();
        FrostHunterColorStateListEpicQuantum4488 frostHunterColorStateListEpicQuantum4488 = new FrostHunterColorStateListEpicQuantum4488();
        frostHunterR8GammaHeroMaster6087.FrostHunterFragmentBetaMegaVortex6025 = frostHunterColorStateListEpicQuantum4488;
        frostHunterR8GammaHeroMaster6087.FrostHunterLightSensorForceFusion4241 = frostHunterRewardedAdHyperStrike1151;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(FrostHunterAnimatorStormAurora6710.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterColorStateListEpicQuantum4488, FrostHunterColorStateListEpicQuantum4488.class, FrostHunterSurfaceViewStrikeAlphaStrike8734.class, FrostHunterItemDecorationForceEliteNebula8512.class));
        arrayList5.add(FrostHunterAnimatorStormAurora6710.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterR8GammaHeroMaster6087, FrostHunterR8GammaHeroMaster6087.class, new Class[0]));
        int size = arrayList4.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList4.get(i3);
            i3++;
            FrostHunterAnimatorStormAurora6710 frostHunterAnimatorStormAurora6710 = (FrostHunterAnimatorStormAurora6710) obj;
            if (frostHunterAnimatorStormAurora6710 != null) {
                arrayList5.add(frostHunterAnimatorStormAurora6710);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            arrayList6.add(obj2);
        }
        ArrayList arrayList7 = new ArrayList();
        synchronized (frostHunterR8GammaHeroMaster6087) {
            Iterator it2 = arrayList6.iterator();
            while (it2.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((FrostHunterAdapterDelegateForceForce1151) it2.next()).get();
                    if (componentRegistrar != null) {
                        arrayList5.addAll(((FrostHunterRewardedAdHyperStrike1151) frostHunterR8GammaHeroMaster6087.FrostHunterLightSensorForceFusion4241).FrostHunterServiceConnectionTurboPhoenixOmega6719(componentRegistrar));
                        it2.remove();
                    }
                } catch (FrostHunterViewModelPhoenixDragon1261 unused2) {
                    it2.remove();
                }
            }
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                Object[] array = ((FrostHunterAnimatorStormAurora6710) it3.next()).FrostHunterConstraintSetCloneMasterUltraRogue2633.toArray();
                int length = array.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        Object obj3 = array[i5];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) frostHunterR8GammaHeroMaster6087.FrostHunterKeyframeGammaGamma1197).contains(obj3.toString())) {
                                it3.remove();
                                break;
                            }
                            ((HashSet) frostHunterR8GammaHeroMaster6087.FrostHunterKeyframeGammaGamma1197).add(obj3.toString());
                        }
                        i5++;
                    }
                }
            }
            if (((HashMap) frostHunterR8GammaHeroMaster6087.FrostHunterCameraXPixelTurboCosmos9814).isEmpty()) {
                FrostHunterCanvasInfernoVortex4700.FrostHunterTranslateAnimationCyberSolarUltra7101(arrayList5);
            } else {
                ArrayList arrayList8 = new ArrayList(((HashMap) frostHunterR8GammaHeroMaster6087.FrostHunterCameraXPixelTurboCosmos9814).keySet());
                arrayList8.addAll(arrayList5);
                FrostHunterCanvasInfernoVortex4700.FrostHunterTranslateAnimationCyberSolarUltra7101(arrayList8);
            }
            int size3 = arrayList5.size();
            int i6 = 0;
            while (i6 < size3) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                FrostHunterAnimatorStormAurora6710 frostHunterAnimatorStormAurora67102 = (FrostHunterAnimatorStormAurora6710) obj4;
                ((HashMap) frostHunterR8GammaHeroMaster6087.FrostHunterCameraXPixelTurboCosmos9814).put(frostHunterAnimatorStormAurora67102, new FrostHunterWorkManagerHyperionSpeed9013(new FrostHunterEventShadowPulse9822(i, frostHunterR8GammaHeroMaster6087, frostHunterAnimatorStormAurora67102)));
            }
            arrayList7.addAll(frostHunterR8GammaHeroMaster6087.FrostHunterCameraXTurboCelestialHero5430(arrayList5));
            arrayList7.addAll(frostHunterR8GammaHeroMaster6087.FrostHunterResourcesTitanHyperVision5823());
            frostHunterR8GammaHeroMaster6087.FrostHunterLintTitanVortexQuantum9911();
        }
        int size4 = arrayList7.size();
        while (i < size4) {
            Object obj5 = arrayList7.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) frostHunterR8GammaHeroMaster6087.FrostHunterServiceConnectionTurboPhoenixOmega6719).get();
        if (bool != null) {
            frostHunterR8GammaHeroMaster6087.FrostHunterConstraintSetCloneMasterUltraRogue2633((HashMap) frostHunterR8GammaHeroMaster6087.FrostHunterCameraXPixelTurboCosmos9814, bool.booleanValue());
        }
        this.FrostHunterServiceEliteCelestialThunder1757 = frostHunterR8GammaHeroMaster6087;
        Trace.endSection();
        this.FrostHunterRemoteConfigSpeedSpeed8566 = new FrostHunterWorkManagerHyperionSpeed9013(new FrostHunterEventShadowPulse9822(2, this, context));
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterR8GammaHeroMaster6087.FrostHunterAlertDialogAuroraDelta3200(FrostHunterObjectDetectionOlympianOlympian2873.class);
        FrostHunterMeteringPointHyperHero4450 frostHunterMeteringPointHyperHero4450 = new FrostHunterMeteringPointHyperHero4450(this);
        FrostHunterAlphaAnimationNeoCosmos5761();
        if (this.FrostHunterLifecycleBlazeGammaElite2889.get()) {
            FrostHunterFragmentVortexDeltaHero2456.FrostHunterFragmentBetaMegaVortex6025.FrostHunterCameraXPixelTurboCosmos9814.get();
        }
        this.FrostHunterFlowMaxDragonHero5809.add(frostHunterMeteringPointHyperHero4450);
        Trace.endSection();
    }

    public static FrostHunterTransitionManagerOmegaNeoMaster3754 FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754;
        synchronized (FrostHunterAlertDialogAuroraDelta3200) {
            try {
                frostHunterTransitionManagerOmegaNeoMaster3754 = (FrostHunterTransitionManagerOmegaNeoMaster3754) FrostHunterKeyframeGammaGamma1197.get("[DEFAULT]");
                if (frostHunterTransitionManagerOmegaNeoMaster3754 == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + FrostHunterRemoteConfigPhantomDelta1739.FrostHunterDatabaseEliteShadowUltra2452() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((FrostHunterObjectDetectionOlympianOlympian2873) frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterCameraXPixelTurboCosmos9814.get()).FrostHunterConstraintSetCloneMasterUltraRogue2633();
            } catch (Throwable th) {
                throw th;
            }
        }
        return frostHunterTransitionManagerOmegaNeoMaster3754;
    }

    public static FrostHunterTransitionManagerOmegaNeoMaster3754 FrostHunterLifecycleBlazeGammaElite2889(Context context, FrostHunterFlowDragonHyperionPixel5649 frostHunterFlowDragonHyperionPixel5649) {
        FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754;
        AtomicReference atomicReference = FrostHunterServiceSpeedTurbo2699.FrostHunterAlphaAnimationNeoCosmos5761;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = FrostHunterServiceSpeedTurbo2699.FrostHunterAlphaAnimationNeoCosmos5761;
            if (atomicReference2.get() == null) {
                FrostHunterServiceSpeedTurbo2699 frostHunterServiceSpeedTurbo2699 = new FrostHunterServiceSpeedTurbo2699();
                while (true) {
                    if (atomicReference2.compareAndSet(null, frostHunterServiceSpeedTurbo2699)) {
                        FrostHunterFragmentVortexDeltaHero2456.FrostHunterAlphaAnimationNeoCosmos5761(application);
                        FrostHunterFragmentVortexDeltaHero2456 frostHunterFragmentVortexDeltaHero2456 = FrostHunterFragmentVortexDeltaHero2456.FrostHunterFragmentBetaMegaVortex6025;
                        frostHunterFragmentVortexDeltaHero2456.getClass();
                        synchronized (frostHunterFragmentVortexDeltaHero2456) {
                            frostHunterFragmentVortexDeltaHero2456.FrostHunterAlertDialogAuroraDelta3200.add(frostHunterServiceSpeedTurbo2699);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (FrostHunterAlertDialogAuroraDelta3200) {
            FrostHunterViewPager2SpectraForceVortex4544 frostHunterViewPager2SpectraForceVortex4544 = FrostHunterKeyframeGammaGamma1197;
            String str = "FirebaseApp name [DEFAULT] already exists!";
            if (frostHunterViewPager2SpectraForceVortex4544.containsKey("[DEFAULT]")) {
                throw new IllegalStateException(str);
            }
            FrostHunterCardViewHyperionAurora3829.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(context, "Application context cannot be null.");
            frostHunterTransitionManagerOmegaNeoMaster3754 = new FrostHunterTransitionManagerOmegaNeoMaster3754(context, "[DEFAULT]", frostHunterFlowDragonHyperionPixel5649);
            frostHunterViewPager2SpectraForceVortex4544.put("[DEFAULT]", frostHunterTransitionManagerOmegaNeoMaster3754);
        }
        frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterServiceEliteCelestialThunder1757();
        return frostHunterTransitionManagerOmegaNeoMaster3754;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        if (this.FrostHunterLevelListDrawableFusionDragonHero2232.get()) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("FirebaseApp was deleted");
        }
    }

    public final String FrostHunterBundlePulseFusionHero2475() {
        StringBuilder sb = new StringBuilder();
        FrostHunterAlphaAnimationNeoCosmos5761();
        byte[] bytes = this.FrostHunterConstraintSetCloneMasterUltraRogue2633.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        FrostHunterAlphaAnimationNeoCosmos5761();
        byte[] bytes2 = this.FrostHunterBundlePulseFusionHero2475.FrostHunterConstraintSetCloneMasterUltraRogue2633.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void FrostHunterServiceEliteCelestialThunder1757() {
        HashMap hashMap;
        if (!((UserManager) this.FrostHunterAlphaAnimationNeoCosmos5761.getSystemService(UserManager.class)).isUserUnlocked()) {
            FrostHunterAlphaAnimationNeoCosmos5761();
            Context context = this.FrostHunterAlphaAnimationNeoCosmos5761;
            AtomicReference atomicReference = FirebaseApp$UserUnlockReceiver.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (atomicReference.get() == null) {
                FirebaseApp$UserUnlockReceiver firebaseApp$UserUnlockReceiver = new FirebaseApp$UserUnlockReceiver(context);
                while (!atomicReference.compareAndSet(null, firebaseApp$UserUnlockReceiver)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(firebaseApp$UserUnlockReceiver, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterR8GammaHeroMaster6087 frostHunterR8GammaHeroMaster6087 = this.FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterAlphaAnimationNeoCosmos5761();
        boolean equals = "[DEFAULT]".equals(this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        AtomicReference atomicReference2 = (AtomicReference) frostHunterR8GammaHeroMaster6087.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (frostHunterR8GammaHeroMaster6087) {
                    hashMap = new HashMap((HashMap) frostHunterR8GammaHeroMaster6087.FrostHunterCameraXPixelTurboCosmos9814);
                }
                frostHunterR8GammaHeroMaster6087.FrostHunterConstraintSetCloneMasterUltraRogue2633(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((FrostHunterObjectDetectionOlympianOlympian2873) this.FrostHunterCameraXPixelTurboCosmos9814.get()).FrostHunterConstraintSetCloneMasterUltraRogue2633();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FrostHunterTransitionManagerOmegaNeoMaster3754)) {
            return false;
        }
        FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754 = (FrostHunterTransitionManagerOmegaNeoMaster3754) obj;
        frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761();
        return this.FrostHunterConstraintSetCloneMasterUltraRogue2633.equals(frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633);
    }

    public final int hashCode() {
        return this.FrostHunterConstraintSetCloneMasterUltraRogue2633.hashCode();
    }

    public final String toString() {
        FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892 = new FrostHunterKotlinQuantumRogue5892(12, this);
        frostHunterKotlinQuantumRogue5892.FrostHunterCameraXPixelTurboCosmos9814(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, "name");
        frostHunterKotlinQuantumRogue5892.FrostHunterCameraXPixelTurboCosmos9814(this.FrostHunterBundlePulseFusionHero2475, "options");
        return frostHunterKotlinQuantumRogue5892.toString();
    }
}
