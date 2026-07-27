package androidx.versionedparcelable;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.adjust.sdk.IRunActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class MysticCacheGenericImmutableYeRZOTV1yPaygkTVUi42943008790338 implements IRunActivityHandler {
    public final /* synthetic */ AdjustThirdPartySharing AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final /* synthetic */ int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public /* synthetic */ MysticCacheGenericImmutableYeRZOTV1yPaygkTVUi42943008790338(AdjustThirdPartySharing adjustThirdPartySharing, int i) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = adjustThirdPartySharing;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        int i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        AdjustThirdPartySharing adjustThirdPartySharing = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.tryTrackThirdPartySharingI(adjustThirdPartySharing);
                break;
            default:
                activityHandler.tryTrackThirdPartySharingI(adjustThirdPartySharing);
                break;
        }
    }
}
