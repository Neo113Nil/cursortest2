package com.squareup.cash.history.views;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$2$1$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewEvent;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewModel;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.listing.ComposableSingletons$OffersSearchListingKt;
import com.squareup.cash.offers.views.listing.LazyScopeExtensionsKt$itemsWithImpressions$$inlined$items$1;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaymentPasscodeDialogViewKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Function1 f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;

    public /* synthetic */ PaymentPasscodeDialogViewKt$$ExternalSyntheticLambda2(LazyListState lazyListState, List list, Function0 function0, Function0 function02, Function1 function1, Function2 function2, boolean z) {
        this.f$1 = list;
        this.f$2 = lazyListState;
        this.f$4 = function1;
        this.f$0 = z;
        this.f$3 = function0;
        this.f$5 = function02;
        this.f$6 = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$6;
        Object obj3 = this.f$5;
        Object obj4 = this.f$3;
        boolean z = this.f$0;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        switch (i) {
            case 0:
                RealCashVibrator realCashVibrator = (RealCashVibrator) obj6;
                Shaker shaker = (Shaker) obj5;
                int i2 = ((PasscodeDialogViewModel) obj4).passcodeLength;
                MutableState mutableState = (MutableState) obj3;
                MutableState mutableState2 = (MutableState) obj2;
                KeypadViewModel.KeypadKey keypadKey = (KeypadViewModel.KeypadKey) obj;
                keypadKey.getClass();
                if (!z) {
                    if (keypadKey.isClear()) {
                        if (((Boolean) mutableState.getValue()).booleanValue()) {
                            mutableState.setValue(Boolean.FALSE);
                        } else if (((String) mutableState2.getValue()).length() == 0) {
                            if (realCashVibrator != null) {
                                realCashVibrator.error();
                            }
                            shaker.shake();
                        } else {
                            mutableState2.setValue(StringsKt___StringsKt.dropLast(1, (String) mutableState2.getValue()));
                        }
                    } else if (keypadKey.isDigit()) {
                        mutableState.setValue(Boolean.FALSE);
                        if (((String) mutableState2.getValue()).length() >= i2) {
                            if (realCashVibrator != null) {
                                realCashVibrator.error();
                            }
                            shaker.shake();
                        } else {
                            String str = ((String) mutableState2.getValue()) + keypadKey.value;
                            mutableState2.setValue(str);
                            if (str.length() == i2) {
                                this.f$4.invoke(new PasscodeDialogViewEvent.Submit(str));
                            }
                        }
                    } else {
                        mutableState.setValue(Boolean.FALSE);
                    }
                    break;
                } else {
                    break;
                }
            default:
                List list = (List) obj6;
                LazyListState lazyListState = (LazyListState) obj5;
                Function0 function0 = (Function0) obj4;
                Function0 function02 = (Function0) obj3;
                Function2 function2 = (Function2) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                OffersStyledTextKt$$ExternalSyntheticLambda0 offersStyledTextKt$$ExternalSyntheticLambda0 = new OffersStyledTextKt$$ExternalSyntheticLambda0(16);
                OffersStyledTextKt$$ExternalSyntheticLambda0 offersStyledTextKt$$ExternalSyntheticLambda02 = new OffersStyledTextKt$$ExternalSyntheticLambda0(17);
                int size = list.size();
                LazyScopeExtensionsKt$itemsWithImpressions$$inlined$items$1 lazyScopeExtensionsKt$itemsWithImpressions$$inlined$items$1 = new LazyScopeExtensionsKt$itemsWithImpressions$$inlined$items$1(0, offersStyledTextKt$$ExternalSyntheticLambda0, list);
                LazyScopeExtensionsKt$itemsWithImpressions$$inlined$items$1 lazyScopeExtensionsKt$itemsWithImpressions$$inlined$items$12 = new LazyScopeExtensionsKt$itemsWithImpressions$$inlined$items$1(1, offersStyledTextKt$$ExternalSyntheticLambda02, list);
                Function1 function1 = this.f$4;
                lazyListScope.items(size, lazyScopeExtensionsKt$itemsWithImpressions$$inlined$items$1, lazyScopeExtensionsKt$itemsWithImpressions$$inlined$items$12, new ComposableLambdaImpl(new DatePickerKt$HorizontalMonthsList$1$2$1$1(list, lazyListState, offersStyledTextKt$$ExternalSyntheticLambda0, function1, function1, function0, function02, function2), true, 802480018));
                if (z) {
                    LazyListScope.item$default(lazyListScope, null, null, ComposableSingletons$OffersSearchListingKt.lambda$246023902, 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PaymentPasscodeDialogViewKt$$ExternalSyntheticLambda2(boolean z, RealCashVibrator realCashVibrator, Shaker shaker, PasscodeDialogViewModel passcodeDialogViewModel, Function1 function1, MutableState mutableState, MutableState mutableState2) {
        this.f$0 = z;
        this.f$1 = realCashVibrator;
        this.f$2 = shaker;
        this.f$3 = passcodeDialogViewModel;
        this.f$4 = function1;
        this.f$5 = mutableState;
        this.f$6 = mutableState2;
    }
}
