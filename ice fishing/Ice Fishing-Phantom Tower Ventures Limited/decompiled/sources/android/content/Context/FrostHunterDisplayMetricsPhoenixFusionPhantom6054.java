package android.content.Context;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterDisplayMetricsPhoenixFusionPhantom6054 implements Iterable {
    public FrostHunterViewModelScopeMasterAlphaNovaX8234 FrostHunterCameraXPixelTurboCosmos9814;
    public FrostHunterViewModelScopeMasterAlphaNovaX8234 FrostHunterFlowMaxDragonHero5809;
    public final WeakHashMap FrostHunterAlertDialogAuroraDelta3200 = new WeakHashMap();
    public int FrostHunterKeyframeGammaGamma1197 = 0;

    public FrostHunterViewModelScopeMasterAlphaNovaX8234 FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX8234 = this.FrostHunterCameraXPixelTurboCosmos9814;
        while (frostHunterViewModelScopeMasterAlphaNovaX8234 != null && !frostHunterViewModelScopeMasterAlphaNovaX8234.FrostHunterCameraXPixelTurboCosmos9814.equals(obj)) {
            frostHunterViewModelScopeMasterAlphaNovaX8234 = frostHunterViewModelScopeMasterAlphaNovaX8234.FrostHunterAlertDialogAuroraDelta3200;
        }
        return frostHunterViewModelScopeMasterAlphaNovaX8234;
    }

    public Object FrostHunterBundlePulseFusionHero2475(Object obj) {
        FrostHunterViewModelScopeMasterAlphaNovaX8234 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761(obj);
        if (FrostHunterAlphaAnimationNeoCosmos5761 == null) {
            return null;
        }
        this.FrostHunterKeyframeGammaGamma1197--;
        WeakHashMap weakHashMap = this.FrostHunterAlertDialogAuroraDelta3200;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((FrostHunterLocationListenerEpicShadowOlympian6477) it.next()).FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterAlphaAnimationNeoCosmos5761);
            }
        }
        FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX8234 = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterKeyframeGammaGamma1197;
        FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX82342 = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlertDialogAuroraDelta3200;
        if (frostHunterViewModelScopeMasterAlphaNovaX8234 != null) {
            frostHunterViewModelScopeMasterAlphaNovaX8234.FrostHunterAlertDialogAuroraDelta3200 = frostHunterViewModelScopeMasterAlphaNovaX82342;
        } else {
            this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterViewModelScopeMasterAlphaNovaX82342;
        }
        FrostHunterViewModelScopeMasterAlphaNovaX8234 frostHunterViewModelScopeMasterAlphaNovaX82343 = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlertDialogAuroraDelta3200;
        if (frostHunterViewModelScopeMasterAlphaNovaX82343 != null) {
            frostHunterViewModelScopeMasterAlphaNovaX82343.FrostHunterKeyframeGammaGamma1197 = frostHunterViewModelScopeMasterAlphaNovaX8234;
        } else {
            this.FrostHunterFlowMaxDragonHero5809 = frostHunterViewModelScopeMasterAlphaNovaX8234;
        }
        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlertDialogAuroraDelta3200 = null;
        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterKeyframeGammaGamma1197 = null;
        return FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((android.content.Context.FrostHunterLooperFusionNeo5221) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FrostHunterDisplayMetricsPhoenixFusionPhantom6054)) {
            return false;
        }
        FrostHunterDisplayMetricsPhoenixFusionPhantom6054 frostHunterDisplayMetricsPhoenixFusionPhantom6054 = (FrostHunterDisplayMetricsPhoenixFusionPhantom6054) obj;
        if (this.FrostHunterKeyframeGammaGamma1197 != frostHunterDisplayMetricsPhoenixFusionPhantom6054.FrostHunterKeyframeGammaGamma1197) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = frostHunterDisplayMetricsPhoenixFusionPhantom6054.iterator();
        while (true) {
            FrostHunterLooperFusionNeo5221 frostHunterLooperFusionNeo5221 = (FrostHunterLooperFusionNeo5221) it;
            if (!frostHunterLooperFusionNeo5221.hasNext()) {
                break;
            }
            FrostHunterLooperFusionNeo5221 frostHunterLooperFusionNeo52212 = (FrostHunterLooperFusionNeo5221) it2;
            if (!frostHunterLooperFusionNeo52212.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) frostHunterLooperFusionNeo5221.next();
            Object next = frostHunterLooperFusionNeo52212.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            FrostHunterLooperFusionNeo5221 frostHunterLooperFusionNeo5221 = (FrostHunterLooperFusionNeo5221) it;
            if (!frostHunterLooperFusionNeo5221.hasNext()) {
                return i;
            }
            i += ((Map.Entry) frostHunterLooperFusionNeo5221.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        FrostHunterLooperFusionNeo5221 frostHunterLooperFusionNeo5221 = new FrostHunterLooperFusionNeo5221(this.FrostHunterCameraXPixelTurboCosmos9814, this.FrostHunterFlowMaxDragonHero5809, 0);
        this.FrostHunterAlertDialogAuroraDelta3200.put(frostHunterLooperFusionNeo5221, Boolean.FALSE);
        return frostHunterLooperFusionNeo5221;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            FrostHunterLooperFusionNeo5221 frostHunterLooperFusionNeo5221 = (FrostHunterLooperFusionNeo5221) it;
            if (!frostHunterLooperFusionNeo5221.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) frostHunterLooperFusionNeo5221.next()).toString());
            if (frostHunterLooperFusionNeo5221.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
