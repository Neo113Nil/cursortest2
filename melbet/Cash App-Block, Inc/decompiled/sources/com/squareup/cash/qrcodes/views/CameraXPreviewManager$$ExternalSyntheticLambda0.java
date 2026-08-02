package com.squareup.cash.qrcodes.views;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.ui.util.RealCashVibrator;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class CameraXPreviewManager$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CameraXPreviewState f$0;
    public final /* synthetic */ CameraXPreviewManager f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ CameraXPreviewManager$$ExternalSyntheticLambda0(CameraXPreviewState cameraXPreviewState, CameraXPreviewManager cameraXPreviewManager, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraXPreviewState;
        this.f$1 = cameraXPreviewManager;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        CameraXPreviewManager cameraXPreviewManager = this.f$1;
        CameraXPreviewState cameraXPreviewState = this.f$0;
        switch (i) {
            case 0:
                ((DisposableEffectScope) obj).getClass();
                if (((Boolean) cameraXPreviewState.processImages$delegate.getValue()).booleanValue()) {
                    cameraXPreviewManager.imageAnalysis.setAnalyzer(Executors.newSingleThreadExecutor(), new EglCore(new CameraXPreviewManager$$ExternalSyntheticLambda0(cameraXPreviewState, cameraXPreviewManager, function1, 1)));
                }
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1(cameraXPreviewManager, 29);
            default:
                String str = (String) obj;
                str.getClass();
                cameraXPreviewState.processImages$delegate.setValue(Boolean.FALSE);
                cameraXPreviewManager.imageAnalysis.clearAnalyzer();
                RealCashVibrator realCashVibrator = cameraXPreviewManager.vibrator;
                if (realCashVibrator != null) {
                    realCashVibrator.vibrate(100L);
                }
                function1.invoke(str);
                return Unit.INSTANCE;
        }
    }
}
