package android.content.Context;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAdapterTitaniumFusion5994 {
    public final LinkedHashMap FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterAdapterTitaniumFusion5994(FrostHunterOnDeviceTranslatorUltraQuantum2312 frostHunterOnDeviceTranslatorUltraQuantum2312) {
        Map map = frostHunterOnDeviceTranslatorUltraQuantum2312.FrostHunterAlphaAnimationNeoCosmos5761;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterCoordinatorLayoutDragonHyperionSolar9277((Collection) entry.getValue()));
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761 = linkedHashMap;
    }

    public void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterActivityNebulaQuantum2077 frostHunterActivityNebulaQuantum2077) {
        long[] jArr = frostHunterActivityNebulaQuantum2077.FrostHunterLifecycleBlazeGammaElite2889;
        if (jArr.length > 0) {
            Long valueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.FrostHunterAlphaAnimationNeoCosmos5761;
            if (linkedHashMap.containsKey(valueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(frostHunterActivityNebulaQuantum2077.FrostHunterLifecycleBlazeGammaElite2889[0]), frostHunterActivityNebulaQuantum2077);
        }
    }

    public void FrostHunterBundlePulseFusionHero2475(String str) {
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.FrostHunterAlphaAnimationNeoCosmos5761.put(lowerCase, FrostHunterCardViewHyperionAurora3829.FrostHunterPagingSourceEclipseDelta8255(str));
    }

    public FrostHunterActivityNebulaQuantum2077 FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (FrostHunterActivityNebulaQuantum2077 frostHunterActivityNebulaQuantum2077 : this.FrostHunterAlphaAnimationNeoCosmos5761.values()) {
            arrayList.add(frostHunterActivityNebulaQuantum2077.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            arrayList2.add(frostHunterActivityNebulaQuantum2077.FrostHunterBundlePulseFusionHero2475);
            arrayList3.add(frostHunterActivityNebulaQuantum2077.FrostHunterServiceEliteCelestialThunder1757);
            arrayList4.add(frostHunterActivityNebulaQuantum2077.FrostHunterLifecycleBlazeGammaElite2889);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j = 0;
        for (int[] iArr2 : iArr) {
            j += iArr2.length;
        }
        int i = (int) j;
        FrostHunterCanvasInfernoVortex4700.FrostHunterLooperThreadBetaHyperionMax1000(j == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j);
        int[] iArr3 = new int[i];
        int i2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i2, iArr4.length);
            i2 += iArr4.length;
        }
        return new FrostHunterActivityNebulaQuantum2077(iArr3, FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterServiceConnectionTurboPhoenixOmega6719((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterServiceConnectionTurboPhoenixOmega6719((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterServiceConnectionTurboPhoenixOmega6719((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public FrostHunterAdapterTitaniumFusion5994(int i) {
        switch (i) {
            case 1:
                this.FrostHunterAlphaAnimationNeoCosmos5761 = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.FrostHunterAlphaAnimationNeoCosmos5761 = new LinkedHashMap();
                break;
        }
    }
}
