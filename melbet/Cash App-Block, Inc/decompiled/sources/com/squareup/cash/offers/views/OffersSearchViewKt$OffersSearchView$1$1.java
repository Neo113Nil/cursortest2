package com.squareup.cash.offers.views;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.MutableState;
import com.squareup.cash.offers.viewmodels.viewevents.OffersSearchViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.SearchViewAction;
import com.squareup.cash.support.viewmodels.ContactSupportEmailInputViewEvent;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class OffersSearchViewKt$OffersSearchView$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $action$delegate;
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldState $searchText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSearchViewKt$OffersSearchView$1$1(TextFieldState textFieldState, Function1 function1, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.$searchText = textFieldState;
        this.$onEvent = function1;
        this.$action$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new OffersSearchViewKt$OffersSearchView$1$1(this.$onEvent, this.$searchText, this.$action$delegate, continuation, 0);
            case 1:
                return new OffersSearchViewKt$OffersSearchView$1$1(this.$onEvent, this.$searchText, this.$action$delegate, continuation, 1);
            default:
                return new OffersSearchViewKt$OffersSearchView$1$1(this.$searchText, this.$onEvent, this.$action$delegate, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((OffersSearchViewKt$OffersSearchView$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.$onEvent;
        TextFieldState textFieldState = this.$searchText;
        MutableState mutableState = this.$action$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SearchViewAction searchViewAction = (SearchViewAction) mutableState.getValue();
                boolean areEqual = Intrinsics.areEqual(searchViewAction, SearchViewAction.Reset.INSTANCE);
                SearchViewAction.SearchTextChange searchTextChange = SearchViewAction.SearchTextChange.INSTANCE;
                if (!areEqual) {
                    if (!(searchViewAction instanceof SearchViewAction.FilterRowClick)) {
                        if (!Intrinsics.areEqual(searchViewAction, searchTextChange)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            function1.invoke(new OffersSearchViewEvent.SearchTextChanged(textFieldState.getValue$foundation().text.toString()));
                        }
                    } else {
                        SearchViewAction.FilterRowClick filterRowClick = (SearchViewAction.FilterRowClick) searchViewAction;
                        function1.invoke(new OffersSearchViewEvent.FilterRowClicked(filterRowClick.filterToken, filterRowClick.onTapAnalyticsEventSpecs));
                    }
                } else {
                    function1.invoke(OffersSearchViewEvent.ResetSearch.INSTANCE);
                }
                mutableState.setValue(searchTextChange);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(((Boolean) mutableState.getValue()).booleanValue() ? textFieldState.getValue$foundation().text.toString() : null);
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(textFieldState.getValue$foundation().text.toString());
                function1.invoke(new ContactSupportEmailInputViewEvent.UpdateEmailText((String) mutableState.getValue()));
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OffersSearchViewKt$OffersSearchView$1$1(Function1 function1, TextFieldState textFieldState, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$onEvent = function1;
        this.$searchText = textFieldState;
        this.$action$delegate = mutableState;
    }
}
