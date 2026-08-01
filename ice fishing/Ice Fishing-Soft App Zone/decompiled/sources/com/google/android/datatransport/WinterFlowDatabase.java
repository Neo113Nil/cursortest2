package com.google.android.datatransport;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowDatabase extends WinterFlowClassStack {
    public WinterFlowDatabase(WinterFlowWebsocketInterface winterFlowWebsocketInterface, WindowInsets windowInsets) {
        super(winterFlowWebsocketInterface, windowInsets);
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public WinterFlowSoftwareComponent WinterFlowRouterRouter() {
        DisplayCutout displayCutout;
        displayCutout = this.WinterFlowCacheManagerAgent.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new WinterFlowSoftwareComponent(displayCutout);
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public WinterFlowWebsocketInterface WinterFlowRouterStructure() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.WinterFlowCacheManagerAgent.consumeDisplayCutout();
        return WinterFlowWebsocketInterface.WinterFlowCacheManagerAgent(consumeDisplayCutout, null);
    }

    @Override // com.google.android.datatransport.WinterFlowInheritanceBatch, com.google.android.datatransport.WinterFlowWidgetEntity
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowDatabase)) {
            return false;
        }
        WinterFlowDatabase winterFlowDatabase = (WinterFlowDatabase) obj;
        return Objects.equals(this.WinterFlowCacheManagerAgent, winterFlowDatabase.WinterFlowCacheManagerAgent) && Objects.equals(this.WinterFlowUnitTestResponse, winterFlowDatabase.WinterFlowUnitTestResponse) && WinterFlowInheritanceBatch.WinterFlowCompilerHandler(this.WinterFlowRouterRouter, winterFlowDatabase.WinterFlowRouterRouter);
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public int hashCode() {
        return this.WinterFlowCacheManagerAgent.hashCode();
    }

    public WinterFlowDatabase(WinterFlowWebsocketInterface winterFlowWebsocketInterface, WinterFlowDatabase winterFlowDatabase) {
        super(winterFlowWebsocketInterface, winterFlowDatabase);
    }
}
