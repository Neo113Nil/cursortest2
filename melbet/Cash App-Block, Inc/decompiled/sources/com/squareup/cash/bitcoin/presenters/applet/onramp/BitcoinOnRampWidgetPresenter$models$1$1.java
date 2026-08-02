package com.squareup.cash.bitcoin.presenters.applet.onramp;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.screens.BitcoinAutoWithdrawUpsellScreen;
import com.squareup.cash.bitcoin.screens.BitcoinMapScreen;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BitcoinOnRampWidgetPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ BetterNavigator.ScreenNavigator $navigator;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealBugReportSenderFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BitcoinOnRampWidgetPresenter$models$1$1(RealBugReportSenderFactory realBugReportSenderFactory, BetterNavigator.ScreenNavigator screenNavigator, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realBugReportSenderFactory;
        this.$navigator = screenNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        BetterNavigator.ScreenNavigator screenNavigator = this.$navigator;
        RealBugReportSenderFactory realBugReportSenderFactory = this.this$0;
        switch (i) {
            case 0:
                return new BitcoinOnRampWidgetPresenter$models$1$1(realBugReportSenderFactory, screenNavigator, continuation, 0);
            default:
                return new BitcoinOnRampWidgetPresenter$models$1$1(realBugReportSenderFactory, screenNavigator, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BitcoinOnRampWidgetPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        BetterNavigator.ScreenNavigator screenNavigator = this.$navigator;
        RealBugReportSenderFactory realBugReportSenderFactory = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object showBitcoinMap = ((RealBitcoinInboundNavigator$Factory$Impl) realBugReportSenderFactory.featureEligibilityDumper).create(screenNavigator).showBitcoinMap(BitcoinMapScreen.Source.BITCOIN_APPLET_ITEM, this);
                    if (showBitcoinMap != coroutineSingletons) {
                        showBitcoinMap = Unit.INSTANCE;
                    }
                    if (showBitcoinMap == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SyncValueReader syncValueReader = (SyncValueReader) realBugReportSenderFactory.scope;
                    this.label = 1;
                    if (syncValueReader.awaitReady(this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                if (((StateFlow) realBugReportSenderFactory.bugsnagClient).getValue() == null) {
                    screenNavigator.goTo(BitcoinAutoWithdrawUpsellScreen.INSTANCE);
                } else {
                    screenNavigator.goTo(new GrowToolsManagerScreen.ManageBitcoinAutoWithdrawScreen(GrowToolsManagerScreen.Origin.BITCOIN));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
