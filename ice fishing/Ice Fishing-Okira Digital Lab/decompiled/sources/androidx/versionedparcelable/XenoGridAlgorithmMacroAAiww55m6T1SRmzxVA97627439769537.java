package androidx.versionedparcelable;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IRunActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class XenoGridAlgorithmMacroAAiww55m6T1SRmzxVA97627439769537 implements IRunActivityHandler {
    public final /* synthetic */ String AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final /* synthetic */ int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public /* synthetic */ XenoGridAlgorithmMacroAAiww55m6T1SRmzxVA97627439769537(String str, int i) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = str;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        int i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        String str = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                activityHandler.removeGlobalCallbackParameterI(str);
                break;
            default:
                activityHandler.removeGlobalPartnerParameterI(str);
                break;
        }
    }
}
