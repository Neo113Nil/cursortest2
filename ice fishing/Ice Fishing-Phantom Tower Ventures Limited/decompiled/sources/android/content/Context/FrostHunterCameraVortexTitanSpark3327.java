package android.content.Context;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCameraVortexTitanSpark3327 extends FrostHunterOnPreDrawListenerDeltaEliteDragon5397 {
    public static final FrostHunterCameraVortexTitanSpark3327 FrostHunterFlowMaxDragonHero5809 = new FrostHunterCameraVortexTitanSpark3327(new Object[0]);
    public final Object[] FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterCameraVortexTitanSpark3327(Object[] objArr) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = objArr;
    }

    @Override // android.content.Context.FrostHunterHandlerThreadNovaXStorm1704
    public final int FrostHunterAlphaAnimationNeoCosmos5761() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.length;
    }

    @Override // android.content.Context.FrostHunterOnPreDrawListenerDeltaEliteDragon5397
    public final FrostHunterOnPreDrawListenerDeltaEliteDragon5397 FrostHunterBundlePulseFusionHero2475(int i, Object obj) {
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterPaintCyberPulse5979.FrostHunterFragmentBetaMegaVortex6025(i, objArr.length);
        if (i == objArr.length) {
            return FrostHunterServiceEliteCelestialThunder1757(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            FrostHunterContextSolarMegaPhantom7469.FrostHunterViewPager2StrikePulse8790(0, i, 6, objArr, objArr2);
            FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new FrostHunterCameraVortexTitanSpark3327(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i + 1, i, objArr.length - 1, objArr, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new FrostHunterTraceThunderDragonElite5055(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // android.content.Context.FrostHunterOnPreDrawListenerDeltaEliteDragon5397
    public final FrostHunterOnPreDrawListenerDeltaEliteDragon5397 FrostHunterCameraXPixelTurboCosmos9814(int i) {
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterPaintCyberPulse5979.FrostHunterAlertDialogAuroraDelta3200(i, objArr.length);
        if (objArr.length == 1) {
            return FrostHunterFlowMaxDragonHero5809;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i, i + 1, objArr.length, objArr, copyOf);
        return new FrostHunterCameraVortexTitanSpark3327(copyOf);
    }

    @Override // android.content.Context.FrostHunterOnPreDrawListenerDeltaEliteDragon5397
    public final FrostHunterOnPreDrawListenerDeltaEliteDragon5397 FrostHunterFlowMaxDragonHero5809(int i, Object obj) {
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterPaintCyberPulse5979.FrostHunterAlertDialogAuroraDelta3200(i, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new FrostHunterCameraVortexTitanSpark3327(copyOf);
    }

    @Override // android.content.Context.FrostHunterOnPreDrawListenerDeltaEliteDragon5397
    public final FrostHunterLiveDataShadowStrike4842 FrostHunterLevelListDrawableFusionDragonHero2232() {
        return new FrostHunterLiveDataShadowStrike4842(this, null, this.FrostHunterCameraXPixelTurboCosmos9814, 0);
    }

    @Override // android.content.Context.FrostHunterOnPreDrawListenerDeltaEliteDragon5397
    public final FrostHunterOnPreDrawListenerDeltaEliteDragon5397 FrostHunterLifecycleBlazeGammaElite2889(Collection collection) {
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (collection.size() + objArr.length > 32) {
            FrostHunterLiveDataShadowStrike4842 FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232();
            FrostHunterLevelListDrawableFusionDragonHero2232.addAll(collection);
            return FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterServiceEliteCelestialThunder1757();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new FrostHunterCameraVortexTitanSpark3327(copyOf);
    }

    @Override // android.content.Context.FrostHunterOnPreDrawListenerDeltaEliteDragon5397
    public final FrostHunterOnPreDrawListenerDeltaEliteDragon5397 FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterGraphVortexLegendNovaX9071 frostHunterGraphVortexLegendNovaX9071) {
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) frostHunterGraphVortexLegendNovaX9071.FrostHunterAlphaAnimationNeoCosmos5761(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? FrostHunterFlowMaxDragonHero5809 : new FrostHunterCameraVortexTitanSpark3327(FrostHunterContextSolarMegaPhantom7469.FrostHunterAlphaAnimationNovaGamma6326(objArr2, 0, length));
    }

    @Override // android.content.Context.FrostHunterOnPreDrawListenerDeltaEliteDragon5397
    public final FrostHunterOnPreDrawListenerDeltaEliteDragon5397 FrostHunterServiceEliteCelestialThunder1757(Object obj) {
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new FrostHunterCameraVortexTitanSpark3327(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new FrostHunterTraceThunderDragonElite5055(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterPaintCyberPulse5979.FrostHunterAlertDialogAuroraDelta3200(i, objArr.length);
        return objArr[i];
    }

    @Override // android.content.Context.FrostHunterAnimationSetHyperionAurora2108, java.util.List
    public final int indexOf(Object obj) {
        return FrostHunterContextSolarMegaPhantom7469.FrostHunterBindingAdapterInfernoFusionForce2284(this.FrostHunterCameraXPixelTurboCosmos9814, obj);
    }

    @Override // android.content.Context.FrostHunterAnimationSetHyperionAurora2108, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // android.content.Context.FrostHunterAnimationSetHyperionAurora2108, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterPaintCyberPulse5979.FrostHunterFragmentBetaMegaVortex6025(i, objArr.length);
        return new FrostHunterTextInputLayoutEclipseOmega4208(objArr, i, objArr.length);
    }
}
