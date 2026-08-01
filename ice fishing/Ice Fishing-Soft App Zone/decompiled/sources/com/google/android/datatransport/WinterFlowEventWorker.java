package com.google.android.datatransport;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowEventWorker implements WinterFlowObjectServiceProvider {
    public final Context WinterFlowRouterStructure;

    public WinterFlowEventWorker(Context context, int i) {
        switch (i) {
            case 1:
                this.WinterFlowRouterStructure = context.getApplicationContext();
                break;
            case 2:
                this.WinterFlowRouterStructure = context;
                break;
            default:
                this.WinterFlowRouterStructure = context.getApplicationContext();
                break;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowObjectServiceProvider
    public void WinterFlowRouterStructure(WinterFlowQuerySyntax winterFlowQuerySyntax) {
        WinterFlowDecoratorProcess winterFlowDecoratorProcess = new WinterFlowDecoratorProcess("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), winterFlowDecoratorProcess);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new WinterFlowVariableVersionControl(this, winterFlowQuerySyntax, threadPoolExecutor, 1));
    }
}
