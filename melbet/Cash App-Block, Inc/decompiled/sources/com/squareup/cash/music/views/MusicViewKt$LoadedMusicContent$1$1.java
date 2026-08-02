package com.squareup.cash.music.views;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import app.cash.inputfieldtext.composeui.TextFieldStateInputFieldText;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsh;
import com.squareup.cash.activity.viewmodels.UpdateSearchQuery;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.billssubscriptions.viewmodels.BillsSubscriptionsMerchantListViewEvent;
import com.squareup.cash.bugreporting.viewmodels.BugReportingViewEvent;
import com.squareup.cash.deposits.physical.viewmodels.address.PhysicalDepositAddressEntryEvent;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSingleInputViewEvent;
import com.squareup.cash.favorites.viewmodels.AddFavoritesViewEvent;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewEvent;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewEvent;
import com.squareup.cash.music.viewmodels.MusicViewEvent;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewEvent;
import com.squareup.cash.p2pblocking.viewmodels.SelectCustomerViewEvent;
import com.squareup.cash.support.viewmodels.ContactSupportEmailMessageViewEvent;
import com.squareup.cash.support.viewmodels.SupportSearchViewEvent;
import com.squareup.cash.taptopay.viewmodels.TapToPayInitiatorNotesViewEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MusicViewKt$LoadedMusicContent$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldState $textFieldState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicViewKt$LoadedMusicContent$1$1(TextFieldState textFieldState, Function1 function1, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$textFieldState = textFieldState;
        this.$onEvent = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        TextFieldState textFieldState = this.$textFieldState;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                return new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, 0);
            case 1:
                return new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, 1);
            case 2:
                return new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, 2);
            case 3:
                return new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, 3);
            case 4:
                return new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, 4);
            case 5:
                return new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, 5);
            case 6:
                return new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, 6);
            case 7:
                return new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, 7);
            case 8:
                return new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, 8);
            case 9:
                return new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, 9);
            case 10:
                return new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, 10);
            case 11:
                return new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, 11);
            case 12:
                return new MusicViewKt$LoadedMusicContent$1$1(textFieldState, function1, continuation, 12);
            case 13:
                return new MusicViewKt$LoadedMusicContent$1$1(textFieldState, function1, continuation, 13);
            case 14:
                return new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, 14);
            case 15:
                return new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, 15);
            case 16:
                return new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, 16);
            case 17:
                return new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, 17);
            default:
                return new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, 18);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((MusicViewKt$LoadedMusicContent$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        TextFieldState textFieldState = this.$textFieldState;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new MusicViewEvent.SearchTextChanged(textFieldState.getValue$foundation().text.toString()));
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new UpdateSearchQuery(zzsh.asInputFieldText(textFieldState)));
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new AfterpaySearchViewEvent.QueryUpdated(new TextFieldStateInputFieldText(textFieldState)));
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new BillsSubscriptionsMerchantListViewEvent.SearchChanged(textFieldState.getValue$foundation().text.toString()));
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new BugReportingViewEvent.TitleChanged(textFieldState.getValue$foundation().text.toString()));
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new BugReportingViewEvent.DescriptionChanged(textFieldState.getValue$foundation().text.toString()));
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new PhysicalDepositAddressEntryEvent.SearchTextChange(textFieldState.getValue$foundation().text.toString()));
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new DirectDepositSingleInputViewEvent.InputChanged(new TextFieldStateInputFieldText(textFieldState)));
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new AddFavoritesViewEvent.SearchQueryChanged(new TextFieldStateInputFieldText(textFieldState)));
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new GlobalSearchViewEvent.QueryUpdateEvent(zzsh.asInputFieldText(textFieldState)));
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new InvestingStockSelectionViewEvent.SearchTextChanged(new TextFieldStateInputFieldText(textFieldState)));
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(textFieldState.getValue$foundation().text.toString());
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (textFieldState.getValue$foundation().text.length() > 50) {
                    TextFieldBuffer startEdit = textFieldState.startEdit();
                    try {
                        startEdit.replace(0, startEdit.buffer.length(), StringsKt___StringsKt.take(50, textFieldState.getValue$foundation().text));
                        textFieldState.commitEdit(startEdit);
                    } finally {
                    }
                }
                function1.invoke(new AllowlistSelectionViewEvent.ChangeSearchText(new TextFieldStateInputFieldText(textFieldState)));
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (textFieldState.getValue$foundation().text.length() > 50) {
                    TextFieldBuffer startEdit2 = textFieldState.startEdit();
                    try {
                        startEdit2.replace(0, startEdit2.buffer.length(), StringsKt___StringsKt.take(50, textFieldState.getValue$foundation().text));
                        textFieldState.commitEdit(startEdit2);
                    } finally {
                    }
                }
                function1.invoke(new SelectCustomerViewEvent.ChangeSearchText(new TextFieldStateInputFieldText(textFieldState)));
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(textFieldState.getValue$foundation().text.toString());
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(textFieldState.getValue$foundation().text.toString());
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new ContactSupportEmailMessageViewEvent.UpdateMessage(textFieldState.getValue$foundation().text.toString()));
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new SupportSearchViewEvent.SearchTextChanged(textFieldState.getValue$foundation().text.toString()));
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new TapToPayInitiatorNotesViewEvent.TextInput(textFieldState.getValue$foundation().text.toString()));
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicViewKt$LoadedMusicContent$1$1(Function1 function1, TextFieldState textFieldState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$onEvent = function1;
        this.$textFieldState = textFieldState;
    }
}
