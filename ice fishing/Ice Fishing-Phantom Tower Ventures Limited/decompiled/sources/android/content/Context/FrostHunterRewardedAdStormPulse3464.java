package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRewardedAdStormPulse3464 extends FrostHunterGradlePluginFusionPrimePulse3477 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterPagingSourceOlympianPhantom9099 FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterRewardedAdStormPulse3464(int i, FrostHunterPagingSourceOlympianPhantom9099 frostHunterPagingSourceOlympianPhantom9099) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterPagingSourceOlympianPhantom9099;
    }

    @Override // android.content.Context.FrostHunterGradlePluginFusionPrimePulse3477
    public final int FrostHunterAlphaAnimationNeoCosmos5761() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
        }
        return this.FrostHunterFlowMaxDragonHero5809.FrostHunterFragmentBetaMegaVortex6025;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.FrostHunterFlowMaxDragonHero5809.clear();
                break;
            default:
                this.FrostHunterFlowMaxDragonHero5809.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                FrostHunterPagingSourceOlympianPhantom9099 frostHunterPagingSourceOlympianPhantom9099 = this.FrostHunterFlowMaxDragonHero5809;
                Object obj2 = frostHunterPagingSourceOlympianPhantom9099.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && frostHunterPagingSourceOlympianPhantom9099.containsKey(entry.getKey());
            default:
                return this.FrostHunterFlowMaxDragonHero5809.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new FrostHunterDrawableDeltaVision2984(this.FrostHunterFlowMaxDragonHero5809);
            default:
                FrostHunterTextRecognitionUltraSpectra7563[] frostHunterTextRecognitionUltraSpectra7563Arr = new FrostHunterTextRecognitionUltraSpectra7563[8];
                for (int i = 0; i < 8; i++) {
                    frostHunterTextRecognitionUltraSpectra7563Arr[i] = new FrostHunterPlaceholderCosmosRogueShadow5345(1);
                }
                return new FrostHunterMLKitNebulaTurboSolar3980(this.FrostHunterFlowMaxDragonHero5809, frostHunterTextRecognitionUltraSpectra7563Arr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.FrostHunterFlowMaxDragonHero5809.remove(entry.getKey(), entry.getValue());
            default:
                FrostHunterPagingSourceOlympianPhantom9099 frostHunterPagingSourceOlympianPhantom9099 = this.FrostHunterFlowMaxDragonHero5809;
                if (!frostHunterPagingSourceOlympianPhantom9099.containsKey(obj)) {
                    return false;
                }
                frostHunterPagingSourceOlympianPhantom9099.remove(obj);
                return true;
        }
    }
}
