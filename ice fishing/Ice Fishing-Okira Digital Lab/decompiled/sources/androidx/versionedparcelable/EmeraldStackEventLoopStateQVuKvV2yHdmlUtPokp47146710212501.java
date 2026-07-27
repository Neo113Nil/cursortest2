package androidx.versionedparcelable;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class EmeraldStackEventLoopStateQVuKvV2yHdmlUtPokp47146710212501 extends CancellationException {
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EmeraldStackEventLoopStateQVuKvV2yHdmlUtPokp47146710212501(String str, int i) {
        super(str);
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                setStackTrace(new StackTraceElement[0]);
                break;
            default:
                setStackTrace(QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
                break;
        }
        return this;
    }
}
