package com.google.firebase;

import android.content.Context;
import android.content.Context.FrostHunterAnalyticsSpectraQuantumEclipse8606;
import android.content.Context.FrostHunterAnimatorSetInfernoNovaQuantum1874;
import android.content.Context.FrostHunterAnimatorStormAurora6710;
import android.content.Context.FrostHunterBottomSheetPhoenixSolarNovaX8145;
import android.content.Context.FrostHunterCardViewHyperionAurora3829;
import android.content.Context.FrostHunterClipDrawableAlphaTitanMaster5034;
import android.content.Context.FrostHunterCoroutineNovaXMasterMaster7803;
import android.content.Context.FrostHunterFaceDetectionBlazeDragonShadow9671;
import android.content.Context.FrostHunterFlowHyperionVortexDelta5013;
import android.content.Context.FrostHunterInputMethodManagerOmegaNovaX6073;
import android.content.Context.FrostHunterInsetDrawableLegendHyper8126;
import android.content.Context.FrostHunterObjectDetectionOlympianOlympian2873;
import android.content.Context.FrostHunterObserverVisionSpeed8931;
import android.content.Context.FrostHunterRippleDrawableBlazeBetaStorm6320;
import android.content.Context.FrostHunterShapeDrawablePhantomCosmos4573;
import android.content.Context.FrostHunterStateFlowMasterShadow1577;
import android.content.Context.FrostHunterTransitionTurboTurbo4252;
import android.content.Context.FrostHunterVibratorSpectraBetaNovaX4683;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String FrostHunterAlphaAnimationNeoCosmos5761(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(FrostHunterObserverVisionSpeed8931.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterShapeDrawablePhantomCosmos4573.class));
        for (Class cls : new Class[0]) {
            FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterKeyframeGammaGamma1197(cls, "Null interface");
            hashSet.add(FrostHunterObserverVisionSpeed8931.FrostHunterAlphaAnimationNeoCosmos5761(cls));
        }
        FrostHunterStateFlowMasterShadow1577 frostHunterStateFlowMasterShadow1577 = new FrostHunterStateFlowMasterShadow1577(2, 0, FrostHunterClipDrawableAlphaTitanMaster5034.class);
        String str = null;
        if (hashSet.contains(frostHunterStateFlowMasterShadow1577.FrostHunterAlphaAnimationNeoCosmos5761)) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Components are not allowed to depend on interfaces they themselves provide.");
            return null;
        }
        hashSet2.add(frostHunterStateFlowMasterShadow1577);
        arrayList.add(new FrostHunterAnimatorStormAurora6710(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new FrostHunterInputMethodManagerOmegaNovaX6073(21), hashSet3));
        FrostHunterObserverVisionSpeed8931 frostHunterObserverVisionSpeed8931 = new FrostHunterObserverVisionSpeed8931(FrostHunterTransitionTurboTurbo4252.class, Executor.class);
        FrostHunterFaceDetectionBlazeDragonShadow9671 frostHunterFaceDetectionBlazeDragonShadow9671 = new FrostHunterFaceDetectionBlazeDragonShadow9671(FrostHunterObjectDetectionOlympianOlympian2873.class, new Class[]{FrostHunterAnalyticsSpectraQuantumEclipse8606.class, FrostHunterInsetDrawableLegendHyper8126.class});
        frostHunterFaceDetectionBlazeDragonShadow9671.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterStateFlowMasterShadow1577.FrostHunterAlphaAnimationNeoCosmos5761(Context.class));
        frostHunterFaceDetectionBlazeDragonShadow9671.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterStateFlowMasterShadow1577.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterTransitionManagerOmegaNeoMaster3754.class));
        frostHunterFaceDetectionBlazeDragonShadow9671.FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterStateFlowMasterShadow1577(2, 0, FrostHunterRippleDrawableBlazeBetaStorm6320.class));
        frostHunterFaceDetectionBlazeDragonShadow9671.FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterStateFlowMasterShadow1577(1, 1, FrostHunterShapeDrawablePhantomCosmos4573.class));
        frostHunterFaceDetectionBlazeDragonShadow9671.FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterStateFlowMasterShadow1577(frostHunterObserverVisionSpeed8931, 1, 0));
        frostHunterFaceDetectionBlazeDragonShadow9671.FrostHunterLevelListDrawableFusionDragonHero2232 = new FrostHunterAnimatorSetInfernoNovaQuantum1874(frostHunterObserverVisionSpeed8931, i);
        arrayList.add(frostHunterFaceDetectionBlazeDragonShadow9671.FrostHunterConstraintSetCloneMasterUltraRogue2633());
        arrayList.add(FrostHunterCardViewHyperionAurora3829.FrostHunterCameraXTurboCelestialHero5430("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(FrostHunterCardViewHyperionAurora3829.FrostHunterCameraXTurboCelestialHero5430("fire-core", "21.0.0"));
        arrayList.add(FrostHunterCardViewHyperionAurora3829.FrostHunterCameraXTurboCelestialHero5430("device-name", FrostHunterAlphaAnimationNeoCosmos5761(Build.PRODUCT)));
        arrayList.add(FrostHunterCardViewHyperionAurora3829.FrostHunterCameraXTurboCelestialHero5430("device-model", FrostHunterAlphaAnimationNeoCosmos5761(Build.DEVICE)));
        arrayList.add(FrostHunterCardViewHyperionAurora3829.FrostHunterCameraXTurboCelestialHero5430("device-brand", FrostHunterAlphaAnimationNeoCosmos5761(Build.BRAND)));
        arrayList.add(FrostHunterCardViewHyperionAurora3829.FrostHunterLooperHyperionForce4133("android-target-sdk", new FrostHunterVibratorSpectraBetaNovaX4683(7)));
        arrayList.add(FrostHunterCardViewHyperionAurora3829.FrostHunterLooperHyperionForce4133("android-min-sdk", new FrostHunterVibratorSpectraBetaNovaX4683(8)));
        arrayList.add(FrostHunterCardViewHyperionAurora3829.FrostHunterLooperHyperionForce4133("android-platform", new FrostHunterVibratorSpectraBetaNovaX4683(9)));
        arrayList.add(FrostHunterCardViewHyperionAurora3829.FrostHunterLooperHyperionForce4133("android-installer", new FrostHunterVibratorSpectraBetaNovaX4683(10)));
        try {
            FrostHunterBottomSheetPhoenixSolarNovaX8145.FrostHunterFlowMaxDragonHero5809.getClass();
            str = "2.3.10";
        } catch (NoClassDefFoundError unused) {
        }
        if (str != null) {
            arrayList.add(FrostHunterCardViewHyperionAurora3829.FrostHunterCameraXTurboCelestialHero5430("kotlin", str));
        }
        return arrayList;
    }
}
