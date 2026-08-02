package com.squareup.cash.blockers.views;

import androidx.compose.foundation.interaction.FocusInteraction$Focus;
import androidx.compose.foundation.interaction.FocusInteraction$Unfocus;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Updater;
import app.cash.local.viewmodels.wallet.BrandCollectionMapViewEvent;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.components.SearchBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewEvent;
import com.squareup.cash.blockers.scenarioplan.viewmodels.ScenarioPlanErrorViewEvent$Close;
import com.squareup.cash.blockers.viewmodels.SetPinViewEvent;
import com.squareup.cash.blockers.web.viewmodels.WebBlockerBridgeEvent;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerViewEvent;
import com.squareup.cash.blockers.web.views.WebViewBlockerView;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeExpiredEvent;
import com.squareup.cash.deposits.physical.viewmodels.onboarding.PaperMoneyDepositOnboardingEvent;
import com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewEvent;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.investing.viewmodels.teengraduation.StocksTransferEtaViewEvent$BackClicked;
import com.squareup.cash.money.viewmodels.MoneyTabEvent;
import com.squareup.cash.moneybot.viewmodels.feedback.MoneybotFeedbackViewEvent;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$1$1;
import com.squareup.cash.sheet.SheetPosition;
import com.squareup.cash.upsell.viewmodels.NullStateCarouselViewEvent;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewEvent;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class SetPinViewKt$SetPin$3$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldState $state;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SetPinViewKt$SetPin$3$1$1$1(TextFieldState textFieldState, Function1 function1, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$state = textFieldState;
        this.$onEvent = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Function1 function1 = this.$onEvent;
        TextFieldState textFieldState = this.$state;
        switch (i) {
            case 0:
                return new SetPinViewKt$SetPin$3$1$1$1(textFieldState, function1, continuation, 0);
            case 1:
                return new SetPinViewKt$SetPin$3$1$1$1(textFieldState, function1, continuation, 1);
            case 2:
                return new SetPinViewKt$SetPin$3$1$1$1(textFieldState, function1, continuation, 2);
            case 3:
                return new SetPinViewKt$SetPin$3$1$1$1(textFieldState, function1, continuation, 3);
            case 4:
                return new SetPinViewKt$SetPin$3$1$1$1(textFieldState, function1, continuation, 4);
            case 5:
                return new SetPinViewKt$SetPin$3$1$1$1(textFieldState, function1, continuation, 5);
            case 6:
                return new SetPinViewKt$SetPin$3$1$1$1(textFieldState, function1, continuation, 6);
            case 7:
                return new SetPinViewKt$SetPin$3$1$1$1(textFieldState, function1, continuation, 7);
            case 8:
                return new SetPinViewKt$SetPin$3$1$1$1(textFieldState, function1, continuation, 8);
            case 9:
                return new SetPinViewKt$SetPin$3$1$1$1(textFieldState, function1, continuation, 9);
            default:
                return new SetPinViewKt$SetPin$3$1$1$1(textFieldState, function1, continuation, 10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((SetPinViewKt$SetPin$3$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = 0;
        int i3 = 10;
        int i4 = 9;
        Function1 function1 = this.$onEvent;
        TextFieldState textFieldState = this.$state;
        int i5 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new SearchBarKt$$ExternalSyntheticLambda1(9, textFieldState));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(i2, function1);
                    this.label = 1;
                    if (snapshotFlow.collect(anonymousClass2, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow2 = Updater.snapshotFlow(new SearchBarKt$$ExternalSyntheticLambda1(3, textFieldState));
                    LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 localAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 = new LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2(function1, null, 2);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow2, localAddBrandsViewKt$LocalAddBrandsView$1$2$1$2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow3 = Updater.snapshotFlow(new SearchBarKt$$ExternalSyntheticLambda1(4, textFieldState));
                    LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 localAddBrandsViewKt$LocalAddBrandsView$1$2$1$22 = new LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2(function1, null, 0);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow3, localAddBrandsViewKt$LocalAddBrandsView$1$2$1$22, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow4 = Updater.snapshotFlow(new SearchBarKt$$ExternalSyntheticLambda1(5, textFieldState));
                    LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 localAddBrandsViewKt$LocalAddBrandsView$1$2$1$23 = new LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2(function1, null, 3);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow4, localAddBrandsViewKt$LocalAddBrandsView$1$2$1$23, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i9 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop = FlowKt.drop(Updater.snapshotFlow(new SearchBarKt$$ExternalSyntheticLambda1(6, textFieldState)), 1);
                    MusicViewKt$LoadedMusicContent$1$1 musicViewKt$LoadedMusicContent$1$1 = new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, i5);
                    this.label = 1;
                    if (FlowKt.collectLatest(drop, musicViewKt$LoadedMusicContent$1$1, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow5 = Updater.snapshotFlow(new SearchBarKt$$ExternalSyntheticLambda1(10, textFieldState));
                    MusicViewKt$LoadedMusicContent$1$1 musicViewKt$LoadedMusicContent$1$12 = new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, 7);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow5, musicViewKt$LoadedMusicContent$1$12, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow6 = Updater.snapshotFlow(new SearchBarKt$$ExternalSyntheticLambda1(11, textFieldState));
                    AnonymousClass2 anonymousClass22 = new AnonymousClass2(i4, function1);
                    this.label = 1;
                    if (snapshotFlow6.collect(anonymousClass22, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop2 = FlowKt.drop(Updater.snapshotFlow(new SearchBarKt$$ExternalSyntheticLambda1(13, textFieldState)), 1);
                    MusicViewKt$LoadedMusicContent$1$1 musicViewKt$LoadedMusicContent$1$13 = new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, i4);
                    this.label = 1;
                    if (FlowKt.collectLatest(drop2, musicViewKt$LoadedMusicContent$1$13, this) == coroutineSingletons8) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow7 = Updater.snapshotFlow(new SearchBarKt$$ExternalSyntheticLambda1(14, textFieldState));
                    MusicViewKt$LoadedMusicContent$1$1 musicViewKt$LoadedMusicContent$1$14 = new MusicViewKt$LoadedMusicContent$1$1(function1, textFieldState, continuation, i3);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow7, musicViewKt$LoadedMusicContent$1$14, this) == coroutineSingletons9) {
                        break;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow8 = Updater.snapshotFlow(new SearchBarKt$$ExternalSyntheticLambda1(15, textFieldState));
                    AnonymousClass2 anonymousClass23 = new AnonymousClass2(12, function1);
                    this.label = 1;
                    if (snapshotFlow8.collect(anonymousClass23, this) == coroutineSingletons10) {
                        break;
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow9 = Updater.snapshotFlow(new SearchBarKt$$ExternalSyntheticLambda1(19, textFieldState));
                    LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 localAddBrandsViewKt$LocalAddBrandsView$1$2$1$24 = new LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2(function1, null, 5);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow9, localAddBrandsViewKt$LocalAddBrandsView$1$2$1$24, this) == coroutineSingletons11) {
                        break;
                    }
                } else if (i16 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ Function1 $onEvent;
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass2(int i, Object obj, Function1 function1) {
            this.$r8$classId = i;
            this.$onEvent = function1;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Function1 function1 = this.$onEvent;
            switch (i) {
                case 0:
                    CharSequence charSequence = (CharSequence) obj;
                    if (charSequence.length() == 4) {
                        function1.invoke(new SetPinViewEvent.SubmitPin(charSequence.toString()));
                    }
                    break;
                case 1:
                    function1.invoke((String) obj);
                    break;
                case 2:
                    if (((SheetPosition) obj) == SheetPosition.Expanded) {
                        function1.invoke(BrandCollectionMapViewEvent.SheetToggled.INSTANCE);
                    }
                    break;
                case 3:
                    Interaction interaction = (Interaction) obj;
                    if (interaction instanceof FocusInteraction$Focus) {
                        function1.invoke(Boolean.TRUE);
                    } else if (interaction instanceof FocusInteraction$Unfocus) {
                        function1.invoke(Boolean.FALSE);
                    }
                    break;
                case 4:
                    function1.invoke(new BenefitsHubViewEvent.ScrolledThrough(((Number) obj).intValue()));
                    break;
                case 5:
                    FormViewEvent formViewEvent = (FormViewEvent) obj;
                    boolean z = formViewEvent instanceof FormViewEvent.PrimaryActionSelected;
                    ScenarioPlanErrorViewEvent$Close scenarioPlanErrorViewEvent$Close = ScenarioPlanErrorViewEvent$Close.INSTANCE;
                    if (z) {
                        function1.invoke(scenarioPlanErrorViewEvent$Close);
                    } else if (formViewEvent instanceof FormViewEvent.Close) {
                        function1.invoke(scenarioPlanErrorViewEvent$Close);
                    }
                    break;
                case 6:
                    WebBlockerBridgeEvent webBlockerBridgeEvent = (WebBlockerBridgeEvent) obj;
                    int i2 = WebViewBlockerView.$r8$clinit;
                    if (!(webBlockerBridgeEvent instanceof WebBlockerBridgeEvent.TitleUpdated)) {
                        if (!(webBlockerBridgeEvent instanceof WebBlockerBridgeEvent.UrlLoading)) {
                            if (!(webBlockerBridgeEvent instanceof WebBlockerBridgeEvent.ProgressUpdated)) {
                                if (!(webBlockerBridgeEvent instanceof WebBlockerBridgeEvent.NavigationStateUpdated)) {
                                    if (!(webBlockerBridgeEvent instanceof WebBlockerBridgeEvent.LaunchNewWindow)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    } else {
                                        function1.invoke(new WebViewBlockerViewEvent.LaunchNewWindow(((WebBlockerBridgeEvent.LaunchNewWindow) webBlockerBridgeEvent).url));
                                    }
                                } else {
                                    WebBlockerBridgeEvent.NavigationStateUpdated navigationStateUpdated = (WebBlockerBridgeEvent.NavigationStateUpdated) webBlockerBridgeEvent;
                                    function1.invoke(new WebViewBlockerViewEvent.NavigationStateUpdated(navigationStateUpdated.canGoBack, navigationStateUpdated.canGoForward));
                                }
                            } else {
                                function1.invoke(new WebViewBlockerViewEvent.ProgressUpdated(((WebBlockerBridgeEvent.ProgressUpdated) webBlockerBridgeEvent).progress));
                            }
                        } else {
                            function1.invoke(new WebViewBlockerViewEvent.UrlLoading(((WebBlockerBridgeEvent.UrlLoading) webBlockerBridgeEvent).url));
                        }
                    } else {
                        function1.invoke(new WebViewBlockerViewEvent.TitleUpdated(((WebBlockerBridgeEvent.TitleUpdated) webBlockerBridgeEvent).title));
                    }
                    break;
                case 7:
                    if (((FormViewEvent) obj) instanceof FormViewEvent.SecondaryActionSelected) {
                        function1.invoke(PaperMoneyDepositBarcodeExpiredEvent.ButtonClicked.INSTANCE);
                    }
                    break;
                case 8:
                    function1.invoke(new PaperMoneyDepositOnboardingEvent.PageSwipeEvent(((Number) obj).intValue()));
                    break;
                case 9:
                    function1.invoke(new AddPayerCustomersViewEvent.SearchTextChanged((String) obj));
                    break;
                case 10:
                    if (!(((FormViewEvent) obj) instanceof FormViewEvent.PrimaryActionSelected)) {
                        a$$ExternalSyntheticBUOutline0.m$1("shouldn't emit any events");
                        break;
                    } else {
                        function1.invoke(StocksTransferEtaViewEvent$BackClicked.INSTANCE);
                        break;
                    }
                case 11:
                    function1.invoke(new MoneyTabEvent.VisibleRangeChanged((IntRange) obj));
                    break;
                case 12:
                    function1.invoke(new MoneybotFeedbackViewEvent.CommentChanged((String) obj));
                    break;
                case 13:
                    function1.invoke(new NullStateCarouselViewEvent.PageSwipe(((Number) obj).intValue()));
                    break;
                case 14:
                    function1.invoke(new WalletHomeViewEvent.PageChanged(((Number) obj).intValue()));
                    break;
                default:
                    if (((Boolean) obj).booleanValue()) {
                        function1.invoke(WalletHomeViewEvent.VerticalScroll.INSTANCE);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }

        public /* synthetic */ AnonymousClass2(int i, Function1 function1) {
            this.$r8$classId = i;
            this.$onEvent = function1;
        }
    }
}
