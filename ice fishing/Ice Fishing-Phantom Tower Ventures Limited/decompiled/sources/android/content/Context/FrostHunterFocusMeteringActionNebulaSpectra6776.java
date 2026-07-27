package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFocusMeteringActionNebulaSpectra6776 extends FrostHunterAnimationSetHyperionAurora2108 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814 = 0;
    public final Object FrostHunterFlowMaxDragonHero5809;

    public FrostHunterFocusMeteringActionNebulaSpectra6776(List list) {
        list.getClass();
        this.FrostHunterFlowMaxDragonHero5809 = list;
    }

    @Override // android.content.Context.FrostHunterHandlerThreadNovaXStorm1704
    public final int FrostHunterAlphaAnimationNeoCosmos5761() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((Matcher) ((FrostHunterTraceHyperionAuroraNebula9947) obj).FrostHunterFlowMaxDragonHero5809).groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // android.content.Context.FrostHunterHandlerThreadNovaXStorm1704, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String group = ((Matcher) ((FrostHunterTraceHyperionAuroraNebula9947) obj).FrostHunterFlowMaxDragonHero5809).group(i);
                return group == null ? "" : group;
            default:
                List list = (List) obj;
                if (i >= 0 && i <= FrostHunterCardViewHyperionAurora3829.FrostHunterDatabaseEliteShadowUltra2452(this)) {
                    return list.get(FrostHunterCardViewHyperionAurora3829.FrostHunterDatabaseEliteShadowUltra2452(this) - i);
                }
                StringBuilder FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterServiceConnectionTurboPhoenixOmega6719("Element index ", i, " must be in range [");
                FrostHunterServiceConnectionTurboPhoenixOmega6719.append(new FrostHunterFirebaseModelInterpreterOlympianStorm9227(0, FrostHunterCardViewHyperionAurora3829.FrostHunterDatabaseEliteShadowUltra2452(this), 1));
                FrostHunterServiceConnectionTurboPhoenixOmega6719.append("].");
                throw new IndexOutOfBoundsException(FrostHunterServiceConnectionTurboPhoenixOmega6719.toString());
        }
    }

    @Override // android.content.Context.FrostHunterAnimationSetHyperionAurora2108, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // android.content.Context.FrostHunterAnimationSetHyperionAurora2108, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 1:
                return new FrostHunterLiveDataScopeDeltaMasterUltra5032(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // android.content.Context.FrostHunterAnimationSetHyperionAurora2108, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // android.content.Context.FrostHunterAnimationSetHyperionAurora2108, java.util.List
    public ListIterator listIterator() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 1:
                return new FrostHunterLiveDataScopeDeltaMasterUltra5032(this, 0);
            default:
                return super.listIterator();
        }
    }

    public FrostHunterFocusMeteringActionNebulaSpectra6776(FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947) {
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterTraceHyperionAuroraNebula9947;
    }

    @Override // android.content.Context.FrostHunterAnimationSetHyperionAurora2108, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 1:
                return new FrostHunterLiveDataScopeDeltaMasterUltra5032(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
