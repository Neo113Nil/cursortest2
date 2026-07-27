package android.content.Context;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterVectorDrawablePulseMaxStorm8774 {
    public static final FrostHunterTextInputLayoutPhantomPhantom6564 FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterTextInputLayoutPhantomPhantom6564(16);
    public static final FrostHunterTextInputLayoutPhantomPhantom6564 FrostHunterFlowMaxDragonHero5809 = new FrostHunterTextInputLayoutPhantomPhantom6564(17);
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;
    public int FrostHunterBundlePulseFusionHero2475;
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final Object FrostHunterLevelListDrawableFusionDragonHero2232;
    public int FrostHunterLifecycleBlazeGammaElite2889;
    public final Object FrostHunterRemoteConfigSpeedSpeed8566;
    public int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterVectorDrawablePulseMaxStorm8774(int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = 1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
        if (i <= 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("maxSize <= 0");
            throw null;
        }
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = new FrostHunterAdapterTitaniumFusion5994(1);
        this.FrostHunterRemoteConfigSpeedSpeed8566 = new FrostHunterServiceInfoEclipseAurora7011(12);
    }

    public void FrostHunterAlphaAnimationNeoCosmos5761(float f, int i) {
        FrostHunterTransitionListenerFusionAurora9438 frostHunterTransitionListenerFusionAurora9438;
        FrostHunterTransitionListenerFusionAurora9438[] frostHunterTransitionListenerFusionAurora9438Arr = (FrostHunterTransitionListenerFusionAurora9438[]) this.FrostHunterRemoteConfigSpeedSpeed8566;
        ArrayList arrayList = (ArrayList) this.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 != 1) {
            Collections.sort(arrayList, FrostHunterCameraXPixelTurboCosmos9814);
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 1;
        }
        int i2 = this.FrostHunterLifecycleBlazeGammaElite2889;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.FrostHunterLifecycleBlazeGammaElite2889 = i3;
            frostHunterTransitionListenerFusionAurora9438 = frostHunterTransitionListenerFusionAurora9438Arr[i3];
        } else {
            frostHunterTransitionListenerFusionAurora9438 = new FrostHunterTransitionListenerFusionAurora9438();
        }
        int i4 = this.FrostHunterBundlePulseFusionHero2475;
        this.FrostHunterBundlePulseFusionHero2475 = i4 + 1;
        frostHunterTransitionListenerFusionAurora9438.FrostHunterAlphaAnimationNeoCosmos5761 = i4;
        frostHunterTransitionListenerFusionAurora9438.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
        frostHunterTransitionListenerFusionAurora9438.FrostHunterBundlePulseFusionHero2475 = f;
        arrayList.add(frostHunterTransitionListenerFusionAurora9438);
        this.FrostHunterServiceEliteCelestialThunder1757 += i;
        while (true) {
            int i5 = this.FrostHunterServiceEliteCelestialThunder1757;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            FrostHunterTransitionListenerFusionAurora9438 frostHunterTransitionListenerFusionAurora94382 = (FrostHunterTransitionListenerFusionAurora9438) arrayList.get(0);
            int i7 = frostHunterTransitionListenerFusionAurora94382.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (i7 <= i6) {
                this.FrostHunterServiceEliteCelestialThunder1757 -= i7;
                arrayList.remove(0);
                int i8 = this.FrostHunterLifecycleBlazeGammaElite2889;
                if (i8 < 5) {
                    this.FrostHunterLifecycleBlazeGammaElite2889 = i8 + 1;
                    frostHunterTransitionListenerFusionAurora9438Arr[i8] = frostHunterTransitionListenerFusionAurora94382;
                }
            } else {
                frostHunterTransitionListenerFusionAurora94382.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i7 - i6;
                this.FrostHunterServiceEliteCelestialThunder1757 -= i6;
            }
        }
    }

    public float FrostHunterBundlePulseFusionHero2475() {
        ArrayList arrayList = (ArrayList) this.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 != 0) {
            Collections.sort(arrayList, FrostHunterFlowMaxDragonHero5809);
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 0;
        }
        float f = 0.5f * this.FrostHunterServiceEliteCelestialThunder1757;
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            FrostHunterTransitionListenerFusionAurora9438 frostHunterTransitionListenerFusionAurora9438 = (FrostHunterTransitionListenerFusionAurora9438) arrayList.get(i2);
            i += frostHunterTransitionListenerFusionAurora9438.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (i >= f) {
                return frostHunterTransitionListenerFusionAurora9438.FrostHunterBundlePulseFusionHero2475;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((FrostHunterTransitionListenerFusionAurora9438) arrayList.get(arrayList.size() - 1)).FrostHunterBundlePulseFusionHero2475;
    }

    public Object FrostHunterConstraintSetCloneMasterUltraRogue2633(Object obj) {
        synchronized (((FrostHunterServiceInfoEclipseAurora7011) this.FrostHunterRemoteConfigSpeedSpeed8566)) {
            FrostHunterAdapterTitaniumFusion5994 frostHunterAdapterTitaniumFusion5994 = (FrostHunterAdapterTitaniumFusion5994) this.FrostHunterLevelListDrawableFusionDragonHero2232;
            frostHunterAdapterTitaniumFusion5994.getClass();
            Object obj2 = frostHunterAdapterTitaniumFusion5994.FrostHunterAlphaAnimationNeoCosmos5761.get(obj);
            if (obj2 != null) {
                this.FrostHunterServiceEliteCelestialThunder1757++;
                return obj2;
            }
            this.FrostHunterLifecycleBlazeGammaElite2889++;
            return null;
        }
    }

    public Object FrostHunterLifecycleBlazeGammaElite2889(Object obj) {
        Object remove;
        synchronized (((FrostHunterServiceInfoEclipseAurora7011) this.FrostHunterRemoteConfigSpeedSpeed8566)) {
            FrostHunterAdapterTitaniumFusion5994 frostHunterAdapterTitaniumFusion5994 = (FrostHunterAdapterTitaniumFusion5994) this.FrostHunterLevelListDrawableFusionDragonHero2232;
            frostHunterAdapterTitaniumFusion5994.getClass();
            remove = frostHunterAdapterTitaniumFusion5994.FrostHunterAlphaAnimationNeoCosmos5761.remove(obj);
            if (remove != null) {
                this.FrostHunterBundlePulseFusionHero2475--;
            }
        }
        return remove;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b4, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FrostHunterServiceEliteCelestialThunder1757(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        synchronized (((FrostHunterServiceInfoEclipseAurora7011) this.FrostHunterRemoteConfigSpeedSpeed8566)) {
            this.FrostHunterBundlePulseFusionHero2475++;
            FrostHunterAdapterTitaniumFusion5994 frostHunterAdapterTitaniumFusion5994 = (FrostHunterAdapterTitaniumFusion5994) this.FrostHunterLevelListDrawableFusionDragonHero2232;
            frostHunterAdapterTitaniumFusion5994.getClass();
            put = frostHunterAdapterTitaniumFusion5994.FrostHunterAlphaAnimationNeoCosmos5761.put(obj, obj2);
            if (put != null) {
                this.FrostHunterBundlePulseFusionHero2475--;
            }
        }
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        while (true) {
            synchronized (((FrostHunterServiceInfoEclipseAurora7011) this.FrostHunterRemoteConfigSpeedSpeed8566)) {
                try {
                    if (this.FrostHunterBundlePulseFusionHero2475 < 0 || (((FrostHunterAdapterTitaniumFusion5994) this.FrostHunterLevelListDrawableFusionDragonHero2232).FrostHunterAlphaAnimationNeoCosmos5761.isEmpty() && this.FrostHunterBundlePulseFusionHero2475 != 0)) {
                        break;
                    }
                    if (this.FrostHunterBundlePulseFusionHero2475 <= i || ((FrostHunterAdapterTitaniumFusion5994) this.FrostHunterLevelListDrawableFusionDragonHero2232).FrostHunterAlphaAnimationNeoCosmos5761.isEmpty()) {
                        break;
                    }
                    Set entrySet = ((FrostHunterAdapterTitaniumFusion5994) this.FrostHunterLevelListDrawableFusionDragonHero2232).FrostHunterAlphaAnimationNeoCosmos5761.entrySet();
                    entrySet.getClass();
                    Set set = entrySet;
                    Object obj3 = null;
                    if (set instanceof List) {
                        List list = (List) set;
                        if (!list.isEmpty()) {
                            obj3 = list.get(0);
                        }
                    } else {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            obj3 = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj3;
                    if (entry == null) {
                        return put;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    FrostHunterAdapterTitaniumFusion5994 frostHunterAdapterTitaniumFusion59942 = (FrostHunterAdapterTitaniumFusion5994) this.FrostHunterLevelListDrawableFusionDragonHero2232;
                    frostHunterAdapterTitaniumFusion59942.getClass();
                    key.getClass();
                    frostHunterAdapterTitaniumFusion59942.FrostHunterAlphaAnimationNeoCosmos5761.remove(key);
                    int i2 = this.FrostHunterBundlePulseFusionHero2475;
                    value.getClass();
                    this.FrostHunterBundlePulseFusionHero2475 = i2 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public String toString() {
        String str;
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case 1:
                synchronized (((FrostHunterServiceInfoEclipseAurora7011) this.FrostHunterRemoteConfigSpeedSpeed8566)) {
                    try {
                        int i = this.FrostHunterServiceEliteCelestialThunder1757;
                        int i2 = this.FrostHunterLifecycleBlazeGammaElite2889 + i;
                        str = "LruCache[maxSize=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ",hits=" + this.FrostHunterServiceEliteCelestialThunder1757 + ",misses=" + this.FrostHunterLifecycleBlazeGammaElite2889 + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public FrostHunterVectorDrawablePulseMaxStorm8774() {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = 0;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = new FrostHunterTransitionListenerFusionAurora9438[5];
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = new ArrayList();
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = -1;
    }
}
