package com.squareup.cash.afterpayapplet.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletMerchantSheetViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AfterpayAppletMerchantSheetView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AfterpayAppletUpsellSheetView f$0;
    public final /* synthetic */ AfterpayAppletMerchantSheetViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ AfterpayAppletMerchantSheetView$$ExternalSyntheticLambda0(AfterpayAppletUpsellSheetView afterpayAppletUpsellSheetView, AfterpayAppletMerchantSheetViewModel afterpayAppletMerchantSheetViewModel, Function1 function1) {
        this.$r8$classId = 1;
        this.f$0 = afterpayAppletUpsellSheetView;
        this.f$1 = afterpayAppletMerchantSheetViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        AfterpayAppletMerchantSheetViewModel afterpayAppletMerchantSheetViewModel = this.f$1;
        AfterpayAppletUpsellSheetView afterpayAppletUpsellSheetView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                afterpayAppletUpsellSheetView.Content(afterpayAppletMerchantSheetViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(afterpayAppletUpsellSheetView.imageLoader), Expect_jvmKt.rememberComposableLambda(-1988425186, new AfterpayAppletMerchantSheetView$$ExternalSyntheticLambda4(afterpayAppletMerchantSheetViewModel, function1), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                afterpayAppletUpsellSheetView.Content(afterpayAppletMerchantSheetViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AfterpayAppletMerchantSheetView$$ExternalSyntheticLambda0(AfterpayAppletUpsellSheetView afterpayAppletUpsellSheetView, AfterpayAppletMerchantSheetViewModel afterpayAppletMerchantSheetViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = afterpayAppletUpsellSheetView;
        this.f$1 = afterpayAppletMerchantSheetViewModel;
        this.f$2 = function1;
    }
}
