package com.squareup.cash.formview.components.arcade;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.versioned.Versioned;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationPresenter;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda0;
import com.squareup.cash.work.data.real.RealPayDataLoader$fetchData$1;
import com.squareup.protos.cash.postcard.CardRenderingInfo;
import com.squareup.protos.franklin.cards.CardTheme;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ArcadeFormDateInputView$Content$7$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $focusManagerCompose;
    public final /* synthetic */ Object $keyboardControllerCompose;
    public final /* synthetic */ boolean $overlayActive;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeFormDateInputView$Content$7$1(AfterpayAppletHomeContentViewModel afterpayAppletHomeContentViewModel, CoroutineScope coroutineScope, LazyListState lazyListState, SpringSpec springSpec, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.L$0 = afterpayAppletHomeContentViewModel;
        this.$focusManagerCompose = coroutineScope;
        this.$keyboardControllerCompose = lazyListState;
        this.this$0 = springSpec;
        this.$overlayActive = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        Object obj3 = this.$keyboardControllerCompose;
        Object obj4 = this.$focusManagerCompose;
        switch (i) {
            case 0:
                ArcadeFormDateInputView$Content$7$1 arcadeFormDateInputView$Content$7$1 = new ArcadeFormDateInputView$Content$7$1(this.$overlayActive, (FocusOwnerImpl) obj4, (DelegatingSoftwareKeyboardController) obj3, (ArcadeFormDateInputView) obj2, continuation, 0);
                arcadeFormDateInputView$Content$7$1.L$0 = obj;
                return arcadeFormDateInputView$Content$7$1;
            case 1:
                return new ArcadeFormDateInputView$Content$7$1((AfterpayAppletHomeContentViewModel) this.L$0, (CoroutineScope) obj4, (LazyListState) obj3, (SpringSpec) obj2, this.$overlayActive, continuation);
            case 2:
                return new ArcadeFormDateInputView$Content$7$1(2, (PaymentDeviceCustomizationPresenter) this.L$0, (String) obj4, (String) obj3, (CardTheme) obj2, continuation, this.$overlayActive);
            case 3:
                ArcadeFormDateInputView$Content$7$1 arcadeFormDateInputView$Content$7$12 = new ArcadeFormDateInputView$Content$7$1(this.$overlayActive, (FocusOwnerImpl) obj4, (DelegatingSoftwareKeyboardController) obj3, (FocusRequester) obj2, continuation, 3);
                arcadeFormDateInputView$Content$7$12.L$0 = obj;
                return arcadeFormDateInputView$Content$7$12;
            case 4:
                return new ArcadeFormDateInputView$Content$7$1(4, (Versioned) this.L$0, (RealCashVibrator) obj4, (MutableState) obj3, (MutableState) obj2, continuation, this.$overlayActive);
            case 5:
                ArcadeFormDateInputView$Content$7$1 arcadeFormDateInputView$Content$7$13 = new ArcadeFormDateInputView$Content$7$1(this.$overlayActive, (LocalHomePresenter) obj4, (MutableState) obj3, (MutableState) obj2, continuation, 5);
                arcadeFormDateInputView$Content$7$13.L$0 = obj;
                return arcadeFormDateInputView$Content$7$13;
            default:
                return new ArcadeFormDateInputView$Content$7$1(6, (CardSchemePresenter) this.L$0, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, continuation, this.$overlayActive);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ArcadeFormDateInputView$Content$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean booleanValue;
        int i = this.$r8$classId;
        boolean z = this.$overlayActive;
        Object obj2 = this.this$0;
        Object obj3 = this.$keyboardControllerCompose;
        Object obj4 = this.$focusManagerCompose;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z) {
                    ArcadeFormDateInputView arcadeFormDateInputView = (ArcadeFormDateInputView) obj2;
                    try {
                        Result.Companion companion = Result.Companion;
                        arcadeFormDateInputView.focusRequester.freeFocus();
                    } catch (Throwable unused) {
                        Result.Companion companion2 = Result.Companion;
                    }
                    ((FocusOwnerImpl) obj4).clearFocus(true);
                    DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj3;
                    if (delegatingSoftwareKeyboardController != null) {
                        delegatingSoftwareKeyboardController.hide();
                    }
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AfterpayAppletHomeContentViewModel afterpayAppletHomeContentViewModel = (AfterpayAppletHomeContentViewModel) this.L$0;
                String str = afterpayAppletHomeContentViewModel.scrollToId;
                if (str != null) {
                    CoroutineScope coroutineScope = (CoroutineScope) obj4;
                    LazyListState lazyListState = (LazyListState) obj3;
                    AbstractPersistentList abstractPersistentList = afterpayAppletHomeContentViewModel.homeSections;
                    coroutineScope.getClass();
                    lazyListState.getClass();
                    abstractPersistentList.getClass();
                    JobKt.launch$default(coroutineScope, null, null, new RealPayDataLoader$fetchData$1(1, abstractPersistentList, lazyListState, (SpringSpec) obj2, str, null, this.$overlayActive), 3);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalTabContentQueries localTabContentQueries = ((PaymentDeviceCustomizationPresenter) this.L$0).cardStudioQueries;
                localTabContentQueries.insertInitialState(z);
                String str2 = (String) obj4;
                if (str2 != null && !str2.equals((String) obj3)) {
                    localTabContentQueries.updateCashtagState(z);
                }
                CardTheme cardTheme = (CardTheme) obj2;
                if (cardTheme != null) {
                    break;
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z) {
                    FocusRequester focusRequester = (FocusRequester) obj2;
                    try {
                        Result.Companion companion3 = Result.Companion;
                        focusRequester.freeFocus();
                    } catch (Throwable unused2) {
                        Result.Companion companion4 = Result.Companion;
                    }
                    ((FocusOwnerImpl) obj4).clearFocus(true);
                    DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) obj3;
                    if (delegatingSoftwareKeyboardController2 != null) {
                        delegatingSoftwareKeyboardController2.hide();
                    }
                }
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Versioned versioned = (Versioned) this.L$0;
                if (versioned != null && ((Boolean) versioned.value).booleanValue()) {
                    if (z) {
                        booleanValue = ((Boolean) ((MutableState) obj3).getValue()).booleanValue();
                        if (!booleanValue) {
                            ((MutableState) obj2).setValue(versioned);
                        }
                    }
                    RealCashVibrator realCashVibrator = (RealCashVibrator) obj4;
                    if (realCashVibrator != null) {
                        realCashVibrator.vibrate(100L);
                    }
                }
                break;
            case 5:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z) {
                    int i2 = 8;
                    JobKt.launch$default(coroutineScope2, null, null, new RealQrCodesPresenter$models$1$1(i2, (MutableState) obj3, (MutableState) obj2, (LocalHomePresenter) obj4, (Continuation) null), 3);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GpsConfigQueries gpsConfigQueries = ((CardSchemePresenter) this.L$0).heroCardStateQueries;
                String str3 = ((IssuedCardFactory.IssuedCard) ((MutableState) obj4).getValue()).token;
                CardRenderingInfo cardRenderingInfo = (CardRenderingInfo) ((MutableState) obj3).getValue();
                Boolean bool = (Boolean) ((MutableState) obj2).getValue();
                bool.booleanValue();
                gpsConfigQueries.driver.execute(-1877796574, "INSERT OR REPLACE INTO cardTabHeroState (_id, card_token, rendering_info, facing_forward, enabled) VALUES (1, ?, ?, ?, ?)", new OverlayKt$$ExternalSyntheticLambda3(str3, cardRenderingInfo, bool, Boolean.valueOf(z), gpsConfigQueries, 26));
                gpsConfigQueries.notifyQueries(-1877796574, new CardAppletTile$$ExternalSyntheticLambda0(10));
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArcadeFormDateInputView$Content$7$1(int i, Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, boolean z) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.$overlayActive = z;
        this.$focusManagerCompose = obj2;
        this.$keyboardControllerCompose = obj3;
        this.this$0 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArcadeFormDateInputView$Content$7$1(boolean z, Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$overlayActive = z;
        this.$focusManagerCompose = obj;
        this.$keyboardControllerCompose = obj2;
        this.this$0 = obj3;
    }
}
