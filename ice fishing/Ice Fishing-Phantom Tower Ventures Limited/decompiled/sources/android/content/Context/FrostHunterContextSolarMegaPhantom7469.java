package android.content.Context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterContextSolarMegaPhantom7469 extends FrostHunterCanvasInfernoVortex4700 {
    public static Object[] FrostHunterAlphaAnimationNovaGamma6326(Object[] objArr, int i, int i2) {
        objArr.getClass();
        FrostHunterCanvasInfernoVortex4700.FrostHunterMediaPlayerCelestialBetaTitan3868(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static ArrayList FrostHunterAnnotationProcessorSolarSpeedNebula4443(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int FrostHunterBindingAdapterInfernoFusionForce2284(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void FrostHunterCamera2NeoMax8666(Object[] objArr, Comparator comparator, int i, int i2) {
        objArr.getClass();
        comparator.getClass();
        Arrays.sort(objArr, i, i2, comparator);
    }

    public static void FrostHunterColorStateListMegaBetaFusion7423(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static char FrostHunterCoordinatorLayoutGammaTurboSpark2420(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Array has more than one element.");
        return (char) 0;
    }

    public static void FrostHunterImageAnalysisGammaOlympian2400(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static /* synthetic */ void FrostHunterInAppPurchaseLegendEpicDragon4579(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        FrostHunterColorStateListMegaBetaFusion7423(i, 0, i2, iArr, iArr2);
    }

    public static List FrostHunterItemDecorationPhoenixAlphaVortex8006(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new FrostHunterServiceFusionAurora8336(objArr, false)) : FrostHunterCardViewHyperionAurora3829.FrostHunterR8MasterNebulaSpark7247(objArr[0]) : FrostHunterAssetManagerForceNebulaNebula4990.FrostHunterCameraXPixelTurboCosmos9814;
    }

    public static void FrostHunterNavigationViewMasterVortexBeta1295(Object[] objArr, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static void FrostHunterNestedScrollViewPixelPhantom8605(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void FrostHunterNestedScrollViewThunderNovaX6772(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static byte[] FrostHunterPlaceholderLegendForceNebula9869(byte[] bArr, int i, int i2) {
        bArr.getClass();
        FrostHunterCanvasInfernoVortex4700.FrostHunterMediaPlayerCelestialBetaTitan3868(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static void FrostHunterSharedElementPixelTitan2806(long[] jArr) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static boolean FrostHunterSoundPoolNovaTitanTitan5784(Object[] objArr, Object obj) {
        objArr.getClass();
        return FrostHunterBindingAdapterInfernoFusionForce2284(objArr, obj) >= 0;
    }

    public static int FrostHunterTransformNovaBetaNovaX5251(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Object FrostHunterViewModelScopeTitanRogue1970(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static /* synthetic */ void FrostHunterViewPager2StrikePulse8790(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        FrostHunterNestedScrollViewPixelPhantom8605(0, i, i2, objArr, objArr2);
    }
}
