package androidx.versionedparcelable;

import android.content.Context;
import com.adjust.sdk.Reflection;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class KryptonFlowTokenDecoderXsLmem3HYKQnNDFtwH36900681462117 implements Callable {
    public final /* synthetic */ Object ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final /* synthetic */ Context AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final /* synthetic */ int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public /* synthetic */ KryptonFlowTokenDecoderXsLmem3HYKQnNDFtwH36900681462117(Context context, Object obj, int i) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = context;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Reflection.getPlayAdId(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
            default:
                return Reflection.isPlayTrackingEnabled(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
        }
    }
}
