package androidx.versionedparcelable;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IRunActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class WhiteFieldJITPostfixLPbwduHfNfGvqaFX1k39831578020844 implements IRunActivityHandler {
    public final /* synthetic */ String ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final /* synthetic */ String AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final /* synthetic */ int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public /* synthetic */ WhiteFieldJITPostfixLPbwduHfNfGvqaFX1k39831578020844(String str, String str2, int i) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = str;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = str2;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        switch (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.addGlobalPartnerParameterI(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
                break;
            default:
                activityHandler.addGlobalCallbackParameterI(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
                break;
        }
    }
}
