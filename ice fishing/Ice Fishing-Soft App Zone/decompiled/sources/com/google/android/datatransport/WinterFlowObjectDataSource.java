package com.google.android.datatransport;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowObjectDataSource extends WinterFlowDebugFramework implements WinterFlowObjectUI {
    public final /* synthetic */ int WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowDatabaseSchemaLayer WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowEncryptionComponent WinterFlowSyntax;
    public final /* synthetic */ View WinterFlowTransactionAgent;
    public final /* synthetic */ Context WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowObjectSession WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowObjectDataSource(Context context, WinterFlowObjectSession winterFlowObjectSession, WinterFlowDatabaseSchemaLayer winterFlowDatabaseSchemaLayer, WinterFlowEncryptionComponent winterFlowEncryptionComponent, int i, View view) {
        super(0);
        this.WinterFlowTransactionManagerStrategy = context;
        this.WinterFlowUnitTestResponse = winterFlowObjectSession;
        this.WinterFlowRouterRouter = winterFlowDatabaseSchemaLayer;
        this.WinterFlowSyntax = winterFlowEncryptionComponent;
        this.WinterFlowResponseEngine = i;
        this.WinterFlowTransactionAgent = view;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        KeyEvent.Callback callback = this.WinterFlowTransactionAgent;
        callback.getClass();
        return new WinterFlowServiceProviderController(this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, this.WinterFlowRouterRouter, this.WinterFlowSyntax, this.WinterFlowResponseEngine, (WinterFlowListenerService) callback).getLayoutNode();
    }
}
