package com.google.android.datatransport;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProviderUI implements WinterFlowMicroserviceBandwidth, WinterFlowDeserializationComponent {
    public static final WinterFlowProviderUI WinterFlowVariableVersionControl = new WinterFlowProviderUI();
    public static final WinterFlowProviderUI WinterFlowTransactionManagerStrategy = new WinterFlowProviderUI();

    @Override // com.google.android.datatransport.WinterFlowMicroserviceBandwidth
    public float WinterFlowResponseEngine(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationComponent
    public WinterFlowThreadPoolStructure WinterFlowVariableVersionControl(ContextWrapper contextWrapper, WinterFlowMicroserviceBandwidth winterFlowMicroserviceBandwidth) {
        WindowManager windowManager = contextWrapper.isUiContext() ? (WindowManager) contextWrapper.getSystemService(WindowManager.class) : (WindowManager) contextWrapper.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new WinterFlowThreadPoolStructure(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
