package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowBatchEntity extends CancellationException {
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowBatchEntity(String str, int i) {
        super(str);
        this.WinterFlowVariableVersionControl = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                setStackTrace(WinterFlowManagerRequest.WinterFlowCacheManagerAgent);
                break;
            case 1:
                setStackTrace(WinterFlowUnitTestLibrary.WinterFlowRouterRouter);
                break;
            default:
                setStackTrace(WinterFlowCloudStack.WinterFlowCacheManagerAgent);
                break;
        }
        return this;
    }
}
