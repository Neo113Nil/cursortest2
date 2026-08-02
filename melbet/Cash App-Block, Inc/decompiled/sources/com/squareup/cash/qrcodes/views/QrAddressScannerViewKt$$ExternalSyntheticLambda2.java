package com.squareup.cash.qrcodes.views;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.qrcodes.viewmodels.QrAddressScannerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class QrAddressScannerViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ QrAddressScannerViewModel f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ PaddingValues f$2;

    public /* synthetic */ QrAddressScannerViewKt$$ExternalSyntheticLambda2(QrAddressScannerViewModel qrAddressScannerViewModel, Function1 function1, PaddingValues paddingValues) {
        this.f$0 = qrAddressScannerViewModel;
        this.f$1 = function1;
        this.f$2 = paddingValues;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        PaddingValues paddingValues = this.f$2;
        Function1 function1 = this.f$1;
        QrAddressScannerViewModel qrAddressScannerViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    CameraXPreviewKt.BitcoinQrCodeScannerContent(qrAddressScannerViewModel, function1, paddingValues, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                CameraXPreviewKt.BitcoinQrCodeScannerContent(qrAddressScannerViewModel, function1, paddingValues, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ QrAddressScannerViewKt$$ExternalSyntheticLambda2(QrAddressScannerViewModel qrAddressScannerViewModel, Function1 function1, PaddingValues paddingValues, int i) {
        this.f$0 = qrAddressScannerViewModel;
        this.f$1 = function1;
        this.f$2 = paddingValues;
    }
}
