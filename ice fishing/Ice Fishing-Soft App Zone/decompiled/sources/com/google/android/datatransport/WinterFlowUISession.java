package com.google.android.datatransport;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUISession extends CharacterStyle implements UpdateAppearance {
    public final WinterFlowInvokerComponent WinterFlowVariableVersionControl;

    public WinterFlowUISession(WinterFlowInvokerComponent winterFlowInvokerComponent) {
        this.WinterFlowVariableVersionControl = winterFlowInvokerComponent;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            WinterFlowNodeMicroservice winterFlowNodeMicroservice = WinterFlowNodeMicroservice.WinterFlowResolverController;
            WinterFlowInvokerComponent winterFlowInvokerComponent = this.WinterFlowVariableVersionControl;
            if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowInvokerComponent, winterFlowNodeMicroservice)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(winterFlowInvokerComponent instanceof WinterFlowQueryManager)) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            WinterFlowQueryManager winterFlowQueryManager = (WinterFlowQueryManager) winterFlowInvokerComponent;
            textPaint.setStrokeWidth(winterFlowQueryManager.WinterFlowResolverController);
            textPaint.setStrokeMiter(winterFlowQueryManager.WinterFlowConsumerUserManager);
            int i = winterFlowQueryManager.WinterFlowEventEmitterController;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = winterFlowQueryManager.WinterFlowBackendCacheManager;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
