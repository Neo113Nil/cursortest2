package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterGraphVortexLegendNovaX9071 implements FrostHunterCombineLegendMegaPrime5473 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Collection FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterGraphVortexLegendNovaX9071(int i, Collection collection) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = collection;
    }

    @Override // android.content.Context.FrostHunterCombineLegendMegaPrime5473
    public final Object FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        boolean contains;
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Collection<?> collection = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                contains = collection.contains(obj);
                break;
            case 1:
                contains = collection.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
