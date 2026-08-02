package com.squareup.cash.blockers.views;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.text.input.TextFieldValue;
import app.cash.local.viewmodels.LocalCheckoutPaymentTimingViewModel;
import app.cash.local.viewmodels.OrderBuilderEvent;
import com.squareup.cash.blockers.viewmodels.CashtagViewEvent;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewEvent;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.cash.moneybot.widgets.ComposerKt;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewEvent;
import com.squareup.cash.paymentpad.views.MainPaymentPadViewKt;
import com.squareup.cash.paymentpad.views.MainPaymentPadViewState;
import com.squareup.cash.shopping.viewmodels.BrandsSearchViewEvent;
import com.squareup.cash.shopping.viewmodels.ProductSearchViewEvent;
import com.squareup.cash.shopping.views.ProductSearchView;
import com.squareup.cash.shopping.views.ProductSearchViewState;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class CashtagViewKt$Cashtag$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $input$delegate;
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashtagViewKt$Cashtag$1$1(MutableState mutableState, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.$input$delegate = mutableState;
        this.$onEvent = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$input$delegate;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                return new CashtagViewKt$Cashtag$1$1(function1, mutableState, continuation, 0);
            case 1:
                return new CashtagViewKt$Cashtag$1$1(function1, mutableState, continuation, 1);
            case 2:
                return new CashtagViewKt$Cashtag$1$1(mutableState, function1, continuation);
            case 3:
                return new CashtagViewKt$Cashtag$1$1(function1, mutableState, continuation, 3);
            case 4:
                return new CashtagViewKt$Cashtag$1$1(function1, mutableState, continuation, 4);
            case 5:
                return new CashtagViewKt$Cashtag$1$1(function1, mutableState, continuation, 5);
            case 6:
                return new CashtagViewKt$Cashtag$1$1(function1, mutableState, continuation, 6);
            case 7:
                return new CashtagViewKt$Cashtag$1$1(function1, mutableState, continuation, 7);
            case 8:
                return new CashtagViewKt$Cashtag$1$1(function1, mutableState, continuation, 8);
            case 9:
                return new CashtagViewKt$Cashtag$1$1(function1, mutableState, continuation, 9);
            default:
                return new CashtagViewKt$Cashtag$1$1(function1, mutableState, continuation, 10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CashtagViewKt$Cashtag$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$input$delegate;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new CashtagViewEvent.InputChange(((TextFieldValue) mutableState.getValue()).annotatedString.text));
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((LocalCheckoutPaymentTimingViewModel.Option) mutableState.getValue()) == LocalCheckoutPaymentTimingViewModel.Option.PAY_AT_END) {
                    function1.invoke(OrderBuilderEvent.PrepareForPayAtEnd.INSTANCE);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str = (String) ((Pair) mutableState.getValue()).second;
                if (str != null) {
                    function1.invoke(new CashMapViewEvent.MarkerClicked(str));
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                int i2 = P2PListView.$r8$clinit;
                function1.invoke(new InvestingSearchViewEvent.SearchTextChanged((String) mutableState.getValue()));
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (function1 != null) {
                    RoundedCornerShape roundedCornerShape = ComposerKt.ComposerShape;
                    function1.invoke((TextFieldValue) mutableState.getValue());
                }
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (function1 != null) {
                    function1.invoke((TextFieldValue) mutableState.getValue());
                }
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = MainPaymentPadViewKt.LocalElementBoundsRegistry;
                if (((MainPaymentPadViewState) mutableState.getValue()).updated) {
                    function1.invoke(new MainPaymentPadViewEvent.RestoreState(((MainPaymentPadViewState) mutableState.getValue()).rawAmount, ((MainPaymentPadViewState) mutableState.getValue()).transferRawAmount, ((MainPaymentPadViewState) mutableState.getValue()).currencyCode, ((MainPaymentPadViewState) mutableState.getValue()).bitcoinDisplayUnits));
                }
                break;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new BrandsSearchViewEvent.SearchTextChange((String) mutableState.getValue()));
                break;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                int i3 = ProductSearchView.$r8$clinit;
                if (!((ProductSearchViewState) mutableState.getValue()).isInitialState) {
                    function1.invoke(new ProductSearchViewEvent.RestoreState(((ProductSearchViewState) mutableState.getValue()).hasSearchResults, ((ProductSearchViewState) mutableState.getValue()).hasAppliedFilters, ((ProductSearchViewState) mutableState.getValue()).showFilters));
                }
                mutableState.setValue(ProductSearchViewState.copy$default((ProductSearchViewState) mutableState.getValue(), null, false, false, false, 29));
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                int i4 = ProductSearchView.$r8$clinit;
                function1.invoke(new ProductSearchViewEvent.SearchTextChange(((ProductSearchViewState) mutableState.getValue()).searchText));
                break;
            default:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(mutableState.getValue());
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashtagViewKt$Cashtag$1$1(Function1 function1, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$onEvent = function1;
        this.$input$delegate = mutableState;
    }
}
