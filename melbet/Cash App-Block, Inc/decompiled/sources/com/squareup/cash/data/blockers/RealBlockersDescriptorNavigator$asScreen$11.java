package com.squareup.cash.data.blockers;

import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.data.profile.JurisdictionConfigManager$JurisdictionConfig;
import com.squareup.cash.recurringpayments.screens.CreateOrEditRecurringPaymentScreen;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class RealBlockersDescriptorNavigator$asScreen$11 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Screen $current;
    public final /* synthetic */ BlockersData $data;
    public final /* synthetic */ RecurringPaymentBlocker $this_asScreen;
    public int label;
    public final /* synthetic */ RealBlockersDescriptorNavigator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBlockersDescriptorNavigator$asScreen$11(RealBlockersDescriptorNavigator realBlockersDescriptorNavigator, BlockersData blockersData, RecurringPaymentBlocker recurringPaymentBlocker, Screen screen, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realBlockersDescriptorNavigator;
        this.$data = blockersData;
        this.$this_asScreen = recurringPaymentBlocker;
        this.$current = screen;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealBlockersDescriptorNavigator$asScreen$11(this.this$0, this.$data, this.$this_asScreen, this.$current, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealBlockersDescriptorNavigator$asScreen$11) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object firstOrNull;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            ChannelFlowTransformLatest select = this.this$0.jurisdictionConfigManager.select();
            this.label = 1;
            firstOrNull = FlowKt.firstOrNull(select, this);
            if (firstOrNull == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            firstOrNull = obj;
        }
        JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig = (JurisdictionConfigManager$JurisdictionConfig) firstOrNull;
        CurrencyCode currencyCode = jurisdictionConfigManager$JurisdictionConfig != null ? jurisdictionConfigManager$JurisdictionConfig.defaultCurrency : null;
        RecurringPaymentBlocker recurringPaymentBlocker = this.$this_asScreen;
        RecurringPaymentBlocker.Text text = recurringPaymentBlocker.text;
        String str = text != null ? text.title : null;
        RecurringPaymentBlocker.Schedule schedule = recurringPaymentBlocker.selected_schedule;
        RecurringPaymentBlocker.CadenceMenu cadenceMenu = recurringPaymentBlocker.cadence_menu;
        cadenceMenu.getClass();
        List<RecurringPaymentBlocker.AmountOption> list = recurringPaymentBlocker.amount_options;
        RecurringPaymentBlocker.Button button = recurringPaymentBlocker.primary_button;
        RecurringPaymentBlocker.Button button2 = recurringPaymentBlocker.secondary_button;
        List<RecurringPaymentBlocker.EnumeratedCadence> list2 = recurringPaymentBlocker.enumerated_cadences;
        Long l = recurringPaymentBlocker.receive_minimum_per_payment;
        Long l2 = recurringPaymentBlocker.receive_limit_per_payment;
        if (currencyCode == null) {
            currencyCode = CurrencyCode.USD;
        }
        CurrencyCode currencyCode2 = currencyCode;
        Screen screen = this.$current;
        if (screen instanceof BlockersScreens.StartFlowEntryPoint) {
            screen = ((BlockersScreens.StartFlowEntryPoint) screen).getOnErrorExitScreen();
        }
        return new CreateOrEditRecurringPaymentScreen(this.$data, str, schedule, cadenceMenu, list, button, button2, list2, l, l2, currencyCode2, false, screen);
    }
}
