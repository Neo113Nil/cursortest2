package com.google.android.datatransport;

import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJavaProcessor implements WinterFlowCacheManagerFunction, WinterFlowDeserializationComponent {
    public static final WinterFlowJavaProcessor WinterFlowVariableVersionControl = new WinterFlowJavaProcessor();
    public static final WinterFlowJavaProcessor WinterFlowTransactionManagerStrategy = new WinterFlowJavaProcessor();

    @Override // com.google.android.datatransport.WinterFlowCacheManagerFunction
    public Rect WinterFlowSyntax(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationComponent
    public WinterFlowThreadPoolStructure WinterFlowVariableVersionControl(ContextWrapper contextWrapper, WinterFlowMicroserviceBandwidth winterFlowMicroserviceBandwidth) {
        WindowManager windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        float f = contextWrapper.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new WinterFlowThreadPoolStructure(bounds, f);
    }
}
