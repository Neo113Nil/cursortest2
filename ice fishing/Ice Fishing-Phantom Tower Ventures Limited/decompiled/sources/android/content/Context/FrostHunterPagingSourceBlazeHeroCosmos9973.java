package android.content.Context;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterPagingSourceBlazeHeroCosmos9973 implements FrostHunterApplicationInfoHeroForceSpark2431, FrostHunterLayoutInflaterNebulaVision6522 {
    public final /* synthetic */ Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ long FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ int FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterPagingSourceBlazeHeroCosmos9973(FrostHunterWorkManagerQuantumForceCosmos2019 frostHunterWorkManagerQuantumForceCosmos2019, int i, long j, long j2) {
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterWorkManagerQuantumForceCosmos2019;
        this.FrostHunterFlowMaxDragonHero5809 = i;
        this.FrostHunterCameraXPixelTurboCosmos9814 = j;
    }

    @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
    public void FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        FrostHunterWorkManagerQuantumForceCosmos2019 frostHunterWorkManagerQuantumForceCosmos2019 = (FrostHunterWorkManagerQuantumForceCosmos2019) this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterTextRecognitionMaxHeroHyper6407 frostHunterTextRecognitionMaxHeroHyper6407 = (FrostHunterTextRecognitionMaxHeroHyper6407) obj;
        HashMap hashMap = frostHunterTextRecognitionMaxHeroHyper6407.FrostHunterCameraXPixelTurboCosmos9814;
        HashMap hashMap2 = frostHunterTextRecognitionMaxHeroHyper6407.FrostHunterFlowMaxDragonHero5809;
        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = frostHunterWorkManagerQuantumForceCosmos2019.FrostHunterServiceEliteCelestialThunder1757;
        if (frostHunterAnimatedVectorDrawableMasterHeroHyper6960 != null) {
            String FrostHunterBundlePulseFusionHero2475 = frostHunterTextRecognitionMaxHeroHyper6407.FrostHunterBundlePulseFusionHero2475.FrostHunterBundlePulseFusionHero2475(frostHunterWorkManagerQuantumForceCosmos2019.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterAnimatedVectorDrawableMasterHeroHyper6960);
            Long l = (Long) hashMap2.get(FrostHunterBundlePulseFusionHero2475);
            Long l2 = (Long) hashMap.get(FrostHunterBundlePulseFusionHero2475);
            hashMap2.put(FrostHunterBundlePulseFusionHero2475, Long.valueOf((l == null ? 0L : l.longValue()) + this.FrostHunterCameraXPixelTurboCosmos9814));
            hashMap.put(FrostHunterBundlePulseFusionHero2475, Long.valueOf((l2 != null ? l2.longValue() : 0L) + this.FrostHunterFlowMaxDragonHero5809));
        }
    }

    @Override // android.content.Context.FrostHunterLayoutInflaterNebulaVision6522
    public void accept(Object obj) {
        FrostHunterNestedScrollViewInfernoMegaTitanium3874 frostHunterNestedScrollViewInfernoMegaTitanium3874 = (FrostHunterNestedScrollViewInfernoMegaTitanium3874) this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterWindowManagerInfernoOlympianVortex6395 frostHunterWindowManagerInfernoOlympianVortex6395 = (FrostHunterWindowManagerInfernoOlympianVortex6395) obj;
        frostHunterNestedScrollViewInfernoMegaTitanium3874.FrostHunterCameraXPixelTurboCosmos9814.getClass();
        FrostHunterAlarmManagerHeroTitaniumFusion5758 frostHunterAlarmManagerHeroTitaniumFusion5758 = frostHunterWindowManagerInfernoOlympianVortex6395.FrostHunterAlphaAnimationNeoCosmos5761;
        long j = frostHunterWindowManagerInfernoOlympianVortex6395.FrostHunterBundlePulseFusionHero2475;
        FrostHunterInterstitialAdTitanEclipse6200 frostHunterInterstitialAdTitanEclipse6200 = new FrostHunterInterstitialAdTitanEclipse6200();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(frostHunterAlarmManagerHeroTitaniumFusion5758.size());
        int size = frostHunterAlarmManagerHeroTitaniumFusion5758.size();
        int i = 0;
        while (i < size) {
            Object obj2 = frostHunterAlarmManagerHeroTitaniumFusion5758.get(i);
            i++;
            arrayList.add((Bundle) frostHunterInterstitialAdTitanEclipse6200.apply(obj2));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868 = frostHunterNestedScrollViewInfernoMegaTitanium3874.FrostHunterBundlePulseFusionHero2475;
        frostHunterLicensingSpectraPulse8868.getClass();
        frostHunterLicensingSpectraPulse8868.FrostHunterMagnetometerFusionTitanium8202(marshall, marshall.length);
        frostHunterNestedScrollViewInfernoMegaTitanium3874.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633(marshall.length, frostHunterLicensingSpectraPulse8868);
        long j2 = frostHunterWindowManagerInfernoOlympianVortex6395.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = frostHunterNestedScrollViewInfernoMegaTitanium3874.FrostHunterCameraXPixelTurboCosmos9814;
        long j3 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (j2 == -9223372036854775807L) {
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(frostHunterFirebaseOlympianMax4818.FrostHunterTextViewDragonStormMega4297 == Long.MAX_VALUE);
        } else {
            long j4 = frostHunterFirebaseOlympianMax4818.FrostHunterTextViewDragonStormMega4297;
            j3 = j4 == Long.MAX_VALUE ? j3 + j2 : j2 + j4;
        }
        frostHunterNestedScrollViewInfernoMegaTitanium3874.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761(j3, this.FrostHunterFlowMaxDragonHero5809 | 1, marshall.length, 0, null);
    }

    public /* synthetic */ FrostHunterPagingSourceBlazeHeroCosmos9973(FrostHunterNestedScrollViewInfernoMegaTitanium3874 frostHunterNestedScrollViewInfernoMegaTitanium3874, long j, int i) {
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterNestedScrollViewInfernoMegaTitanium3874;
        this.FrostHunterCameraXPixelTurboCosmos9814 = j;
        this.FrostHunterFlowMaxDragonHero5809 = i;
    }
}
