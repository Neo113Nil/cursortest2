package com.google.android.datatransport;

import android.content.Context;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowNodeMiddleware extends WinterFlowLoaderFramework {
    public boolean WinterFlowBandwidthObject;
    public final WinterFlowResolverSubsystem WinterFlowServiceUtility;

    public WinterFlowNodeMiddleware(Context context) {
        super(context);
        this.WinterFlowServiceUtility = WinterFlowDecoratorUI.WinterFlowSerializerStructure(null);
    }

    @Override // com.google.android.datatransport.WinterFlowLoaderFramework
    public final void WinterFlowHookDataSource(WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(420213850);
        int i2 = (winterFlowResolverLibrary.WinterFlowUnitTestResponse(this) ? 4 : 2) | i;
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i2 & 1, (i2 & 3) != 2)) {
            WinterFlowEventEvent winterFlowEventEvent = (WinterFlowEventEvent) this.WinterFlowServiceUtility.getValue();
            if (winterFlowEventEvent == null) {
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(-1238823553);
            } else {
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(98585282);
                winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowResolverLibrary, 0);
            }
            winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowRendererQuery(this, i, 3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return WinterFlowNodeMiddleware.class.getName();
    }

    @Override // com.google.android.datatransport.WinterFlowLoaderFramework
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.WinterFlowBandwidthObject;
    }

    public final void setContent(WinterFlowEventEvent winterFlowEventEvent) {
        this.WinterFlowBandwidthObject = true;
        this.WinterFlowServiceUtility.setValue(winterFlowEventEvent);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            WinterFlowVariableVersionControl();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
