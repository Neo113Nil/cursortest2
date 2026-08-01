package com.google.android.datatransport;

import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUIEntity implements Executor {
    public final Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl = 1;

    public WinterFlowUIEntity() {
        WinterFlowWidgetInterface winterFlowWidgetInterface = new WinterFlowWidgetInterface(Looper.getMainLooper());
        Looper.getMainLooper();
        this.WinterFlowTransactionManagerStrategy = winterFlowWidgetInterface;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Executor) obj).execute(new WinterFlowDataSourceQuery(runnable, 0));
                break;
            default:
                ((WinterFlowWidgetInterface) obj).post(runnable);
                break;
        }
    }

    public WinterFlowUIEntity(ExecutorService executorService) {
        this.WinterFlowTransactionManagerStrategy = executorService;
    }
}
