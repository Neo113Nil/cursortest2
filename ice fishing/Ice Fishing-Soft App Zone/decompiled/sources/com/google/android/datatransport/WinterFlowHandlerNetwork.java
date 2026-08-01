package com.google.android.datatransport;

import android.content.Context;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowHandlerNetwork implements WinterFlowSyntaxDebug {
    public final WinterFlowRendererNode WinterFlowRouterRouter;
    public boolean WinterFlowSyntax;
    public final String WinterFlowTransactionManagerStrategy;
    public final WinterFlowSyntax WinterFlowUnitTestResponse;
    public final Context WinterFlowVariableVersionControl;

    public WinterFlowHandlerNetwork(Context context, String str, WinterFlowSyntax winterFlowSyntax) {
        context.getClass();
        winterFlowSyntax.getClass();
        this.WinterFlowVariableVersionControl = context;
        this.WinterFlowTransactionManagerStrategy = str;
        this.WinterFlowUnitTestResponse = winterFlowSyntax;
        this.WinterFlowRouterRouter = new WinterFlowRendererNode(new WinterFlowAPISystem(3, this));
    }

    @Override // com.google.android.datatransport.WinterFlowSyntaxDebug
    public final WinterFlowSchedulerSyntax WinterFlowEventEmitterController() {
        return ((WinterFlowProvider) this.WinterFlowRouterRouter.getValue()).WinterFlowHookDataSource(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.WinterFlowRouterRouter.WinterFlowTransactionManagerStrategy != WinterFlowCacheUtility.WinterFlowCompilerHandler) {
            ((WinterFlowProvider) this.WinterFlowRouterRouter.getValue()).close();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowSyntaxDebug
    public final String getDatabaseName() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    @Override // com.google.android.datatransport.WinterFlowSyntaxDebug
    public final void setWriteAheadLoggingEnabled(boolean z) {
        if (this.WinterFlowRouterRouter.WinterFlowTransactionManagerStrategy != WinterFlowCacheUtility.WinterFlowCompilerHandler) {
            ((WinterFlowProvider) this.WinterFlowRouterRouter.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.WinterFlowSyntax = z;
    }
}
