package com.squareup.cash.qrcodes.views;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import com.squareup.cash.qrcodes.viewmodels.CashQrScannerViewModel;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class CashQrCameraXScannerView$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CashQrScannerViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ CashQrCameraXScannerView$$ExternalSyntheticLambda2(CashQrScannerViewModel cashQrScannerViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = cashQrScannerViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    CameraXPreviewKt.CashQrCameraXScanner(this.f$0, this.f$1, null, false, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (!gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer2.skipToGroupEnd();
                } else if (this.f$0.showShareScanToggle) {
                    gapComposer2.startReplaceGroup(-760114453);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                    Function1 function1 = this.f$1;
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new InfoSectionKt$$ExternalSyntheticLambda1(12, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    CameraXPreviewKt.ShareScanToggle(390, gapComposer2, fillMaxWidth, (Function1) rememberedValue);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-759810343);
                    gapComposer2.end(false);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
