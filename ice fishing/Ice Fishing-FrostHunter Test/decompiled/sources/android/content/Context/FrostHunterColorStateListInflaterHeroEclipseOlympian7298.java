package android.content.Context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterColorStateListInflaterHeroEclipseOlympian7298 implements Iterable, FrostHunterContextBlazePrimeMax4967 {
    public static final FrostHunterColorStateListInflaterHeroEclipseOlympian7298 FrostHunterFlowMaxDragonHero5809 = new FrostHunterColorStateListInflaterHeroEclipseOlympian7298(new String[0]);
    public final String[] FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterColorStateListInflaterHeroEclipseOlympian7298(String[] strArr) {
        strArr.getClass();
        this.FrostHunterCameraXPixelTurboCosmos9814 = strArr;
    }

    public final String FrostHunterAlphaAnimationNeoCosmos5761(String str) {
        String[] strArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        strArr.getClass();
        int length = strArr.length - 2;
        int FrostHunterCameraXTurboCelestialHero5430 = FrostHunterVectorDrawableForceMax1351.FrostHunterCameraXTurboCelestialHero5430(length, 0, -2);
        if (FrostHunterCameraXTurboCelestialHero5430 > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == FrostHunterCameraXTurboCelestialHero5430) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String FrostHunterBundlePulseFusionHero2475(int i) {
        String str = (String) FrostHunterContextSolarMegaPhantom7469.FrostHunterViewModelScopeTitanRogue1970(i * 2, this.FrostHunterCameraXPixelTurboCosmos9814);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public final String FrostHunterLifecycleBlazeGammaElite2889(int i) {
        String str = (String) FrostHunterContextSolarMegaPhantom7469.FrostHunterViewModelScopeTitanRogue1970((i * 2) + 1, this.FrostHunterCameraXPixelTurboCosmos9814);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public final FrostHunterServiceInfoSpectraMegaThunder7104 FrostHunterServiceEliteCelestialThunder1757() {
        FrostHunterServiceInfoSpectraMegaThunder7104 frostHunterServiceInfoSpectraMegaThunder7104 = new FrostHunterServiceInfoSpectraMegaThunder7104(0);
        ArrayList arrayList = frostHunterServiceInfoSpectraMegaThunder7104.FrostHunterAlphaAnimationNeoCosmos5761;
        arrayList.getClass();
        String[] strArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList.addAll(asList);
        return frostHunterServiceInfoSpectraMegaThunder7104;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FrostHunterColorStateListInflaterHeroEclipseOlympian7298) {
            return Arrays.equals(this.FrostHunterCameraXPixelTurboCosmos9814, ((FrostHunterColorStateListInflaterHeroEclipseOlympian7298) obj).FrostHunterCameraXPixelTurboCosmos9814);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.FrostHunterCameraXPixelTurboCosmos9814);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        FrostHunterLaunchHeroForce4010[] frostHunterLaunchHeroForce4010Arr = new FrostHunterLaunchHeroForce4010[size];
        for (int i = 0; i < size; i++) {
            frostHunterLaunchHeroForce4010Arr[i] = new FrostHunterLaunchHeroForce4010(FrostHunterBundlePulseFusionHero2475(i), FrostHunterLifecycleBlazeGammaElite2889(i));
        }
        return new FrostHunterRoomDaoHyperFusionCelestial1775(frostHunterLaunchHeroForce4010Arr);
    }

    public final int size() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475(i);
            String FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterLifecycleBlazeGammaElite2889(i);
            sb.append(FrostHunterBundlePulseFusionHero2475);
            sb.append(": ");
            if (FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterAlertDialogAuroraDelta3200(FrostHunterBundlePulseFusionHero2475)) {
                FrostHunterLifecycleBlazeGammaElite2889 = "██";
            }
            sb.append(FrostHunterLifecycleBlazeGammaElite2889);
            sb.append("\n");
        }
        return sb.toString();
    }
}
