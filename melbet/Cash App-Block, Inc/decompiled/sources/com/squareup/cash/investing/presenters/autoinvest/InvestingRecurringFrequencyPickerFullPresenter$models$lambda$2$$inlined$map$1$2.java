package com.squareup.cash.investing.presenters.autoinvest;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.investing.db.Investing_settings;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingFrequencyOption;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringFrequencyPickerViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InvestingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ InvestingRecurringFrequencyPickerFullPresenter this$0;

    /* renamed from: com.squareup.cash.investing.presenters.autoinvest.InvestingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return InvestingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ InvestingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$1$2(FlowCollector flowCollector, InvestingRecurringFrequencyPickerFullPresenter investingRecurringFrequencyPickerFullPresenter, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.this$0 = investingRecurringFrequencyPickerFullPresenter;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0126  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        Money money;
        InvestingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$2$2$1 investingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$2$2$1;
        int i2;
        InvestingRecurringFrequencyPickerViewModel.Content.Option option;
        int i3 = this.$r8$classId;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        InvestingRecurringFrequencyPickerFullPresenter investingRecurringFrequencyPickerFullPresenter = this.this$0;
        InvestingRecurringFrequencyPickerViewModel.Content.Option option2 = null;
        switch (i3) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i4 = anonymousClass1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            Investing_settings investing_settings = (Investing_settings) obj;
                            InvestingScreens.OrderTypeSelectionScreen.Type type2 = investingRecurringFrequencyPickerFullPresenter.args.f1160type;
                            if (type2 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Bitcoin) {
                                money = investing_settings.min_scheduled_btc_buy_amt;
                                money.getClass();
                            } else {
                                if (!(type2 instanceof InvestingScreens.OrderTypeSelectionScreen.Type.Equity)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                money = investing_settings.min_scheduled_stock_buy_amt;
                                money.getClass();
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(money, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj22 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            default:
                InvestingScreens.RecurringFrequencyPickerFullScreen recurringFrequencyPickerFullScreen = investingRecurringFrequencyPickerFullPresenter.args;
                if (continuation instanceof InvestingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$2$2$1) {
                    investingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$2$2$1 = (InvestingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$2$2$1) continuation;
                    int i5 = investingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$2$2$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        investingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$2$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj3 = investingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = investingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$2$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            Money money2 = (Money) obj;
                            if (recurringFrequencyPickerFullScreen.showOneTimeOrder) {
                                option = new InvestingRecurringFrequencyPickerViewModel.Content.Option(InvestingFrequencyOption.OneTime.INSTANCE, recurringFrequencyPickerFullScreen.currentFrequency == null);
                            } else {
                                option = null;
                            }
                            RecurringSchedule.Frequency frequency = RecurringSchedule.Frequency.EVERY_DAY;
                            InvestingFrequencyOption.Recurring recurring = new InvestingFrequencyOption.Recurring(frequency);
                            RecurringSchedule.Frequency frequency2 = recurringFrequencyPickerFullScreen.currentFrequency;
                            InvestingRecurringFrequencyPickerViewModel.Content.Option option3 = new InvestingRecurringFrequencyPickerViewModel.Content.Option(recurring, frequency2 == frequency || (!recurringFrequencyPickerFullScreen.showOneTimeOrder && frequency2 == null));
                            RecurringSchedule.Frequency frequency3 = RecurringSchedule.Frequency.EVERY_WEEK;
                            InvestingRecurringFrequencyPickerViewModel.Content.Option option4 = new InvestingRecurringFrequencyPickerViewModel.Content.Option(new InvestingFrequencyOption.Recurring(frequency3), recurringFrequencyPickerFullScreen.currentFrequency == frequency3);
                            RecurringSchedule.Frequency frequency4 = RecurringSchedule.Frequency.EVERY_TWO_WEEKS;
                            InvestingRecurringFrequencyPickerViewModel.Content.Option option5 = new InvestingRecurringFrequencyPickerViewModel.Content.Option(new InvestingFrequencyOption.Recurring(frequency4), recurringFrequencyPickerFullScreen.currentFrequency == frequency4);
                            if (Intrinsics.areEqual(recurringFrequencyPickerFullScreen.f1160type, InvestingScreens.OrderTypeSelectionScreen.Type.Bitcoin.INSTANCE) && investingRecurringFrequencyPickerFullPresenter.bitcoinMonthlyEnabled) {
                                RecurringSchedule.Frequency frequency5 = RecurringSchedule.Frequency.EVERY_MONTH;
                                option2 = new InvestingRecurringFrequencyPickerViewModel.Content.Option(new InvestingFrequencyOption.Recurring(frequency5), recurringFrequencyPickerFullScreen.currentFrequency == frequency5);
                            }
                            List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new InvestingRecurringFrequencyPickerViewModel.Content.Option[]{option, option3, option4, option5, option2});
                            AndroidStringManager androidStringManager = investingRecurringFrequencyPickerFullPresenter.stringManager;
                            String format2 = investingRecurringFrequencyPickerFullPresenter.moneyFormatter.format(money2);
                            format2.getClass();
                            Resources resources = androidStringManager.resources;
                            resources.getClass();
                            String format3 = new MessageFormat(resources.getString(R.string.investing_recurringfrequencypicker_minimum_amount)).format(new Object[]{format2});
                            format3.getClass();
                            InvestingRecurringFrequencyPickerViewModel.Content content = new InvestingRecurringFrequencyPickerViewModel.Content(format3, filterNotNull, recurringFrequencyPickerFullScreen.useBackNavigationIcon ? InvestingRecurringFrequencyPickerViewModel.Content.NavigationIconType.BACK : InvestingRecurringFrequencyPickerViewModel.Content.NavigationIconType.CLOSE);
                            investingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(content, investingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$2$2$1) == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                        } else {
                            if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj3);
                        }
                        return Unit.INSTANCE;
                    }
                }
                investingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$2$2$1 = new InvestingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$2$2$1(this, continuation);
                Object obj32 = investingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = investingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$2$2$1.label;
                if (i2 != 0) {
                }
                return Unit.INSTANCE;
        }
    }
}
