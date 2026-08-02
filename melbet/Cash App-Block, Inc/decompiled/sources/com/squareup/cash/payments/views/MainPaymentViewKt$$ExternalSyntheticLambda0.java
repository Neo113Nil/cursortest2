package com.squareup.cash.payments.views;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import com.squareup.cash.paymentpad.views.MainPaymentPadViewKt;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowSheetKt;
import java.text.NumberFormat;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class MainPaymentViewKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MainPaymentViewKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = MainPaymentViewKt.LocalElementBoundsRegistry;
                return null;
            case 1:
                return NumberFormat.getPercentInstance();
            case 2:
                return Unit.INSTANCE;
            case 3:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 4:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = MainPaymentPadViewKt.LocalElementBoundsRegistry;
                return null;
            case 5:
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                return emptyMap;
            case 6:
                EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                emptyMap2.getClass();
                return emptyMap2;
            case 7:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 8:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 9:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 10:
                return Updater.mutableStateOf$default("");
            case 11:
                return Updater.mutableStateOf$default(null);
            case 12:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 13:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 14:
                return Updater.mutableStateOf$default(EmptyList.INSTANCE);
            case 15:
                return Updater.mutableStateOf$default(0);
            case 16:
                return Updater.mutableStateOf$default(null);
            case 17:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 18:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 19:
                return Updater.mutableStateOf$default(null);
            case 20:
                return Updater.mutableStateOf$default(null);
            case 21:
                return Unit.INSTANCE;
            case 22:
                return Unit.INSTANCE;
            case 23:
                return Unit.INSTANCE;
            case 24:
                return Unit.INSTANCE;
            case 25:
                return Unit.INSTANCE;
            case 26:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = CoreFlowSheetKt.LocalCoreFlowSheetInOverlayLayer;
                return Boolean.TRUE;
            case 27:
                return Unit.INSTANCE;
            case 28:
                return Updater.mutableStateOf$default(Boolean.TRUE);
            default:
                return Updater.mutableStateOf$default(Boolean.FALSE);
        }
    }
}
