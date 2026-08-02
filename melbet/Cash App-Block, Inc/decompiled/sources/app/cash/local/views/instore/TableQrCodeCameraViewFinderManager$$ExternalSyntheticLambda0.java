package app.cash.local.views.instore;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.ui.util.RealCashVibrator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class TableQrCodeCameraViewFinderManager$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TableQrCodeCameraViewFinderState f$0;
    public final /* synthetic */ TableQrCodeCameraViewFinderManager f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ TableQrCodeCameraViewFinderManager$$ExternalSyntheticLambda0(TableQrCodeCameraViewFinderState tableQrCodeCameraViewFinderState, TableQrCodeCameraViewFinderManager tableQrCodeCameraViewFinderManager, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = tableQrCodeCameraViewFinderState;
        this.f$1 = tableQrCodeCameraViewFinderManager;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        TableQrCodeCameraViewFinderManager tableQrCodeCameraViewFinderManager = this.f$1;
        TableQrCodeCameraViewFinderState tableQrCodeCameraViewFinderState = this.f$0;
        switch (i) {
            case 0:
                ((DisposableEffectScope) obj).getClass();
                if (((Boolean) tableQrCodeCameraViewFinderState.processImages$delegate.getValue()).booleanValue()) {
                    tableQrCodeCameraViewFinderManager.imageAnalysis.setAnalyzer(tableQrCodeCameraViewFinderManager.analyzerExecutor, new EglCore(new TableQrCodeCameraViewFinderManager$$ExternalSyntheticLambda0(tableQrCodeCameraViewFinderState, tableQrCodeCameraViewFinderManager, function1, 1)));
                }
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1(tableQrCodeCameraViewFinderManager, 12);
            default:
                String str = (String) obj;
                str.getClass();
                tableQrCodeCameraViewFinderState.processImages$delegate.setValue(Boolean.FALSE);
                tableQrCodeCameraViewFinderManager.imageAnalysis.clearAnalyzer();
                RealCashVibrator realCashVibrator = tableQrCodeCameraViewFinderManager.vibrator;
                if (realCashVibrator != null) {
                    realCashVibrator.vibrate(100L);
                }
                function1.invoke(str);
                return Unit.INSTANCE;
        }
    }
}
