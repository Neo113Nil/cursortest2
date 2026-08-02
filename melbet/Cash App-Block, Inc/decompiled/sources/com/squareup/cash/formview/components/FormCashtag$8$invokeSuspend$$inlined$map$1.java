package com.squareup.cash.formview.components;

import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.earnings.backend.real.RealEarningsChartRepository$header$$inlined$map$1$2;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$getActivationData$$inlined$filter$1;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$map$1;
import com.squareup.cash.graphics.swampgl.components.Camera$special$$inlined$map$1;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.history.navigation.PaymentActionHandler$transform$$inlined$filter$1;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics$createMetricsFlow$1;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2;
import com.squareup.cash.invitations.InviteContactsPresenter$filterContacts$$inlined$map$1;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.limits.presenters.LimitsPresenter$models$lambda$2$$inlined$map$1$2;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomersForIds$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;

/* loaded from: classes6.dex */
public final class FormCashtag$8$invokeSuspend$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;

    public /* synthetic */ FormCashtag$8$invokeSuspend$$inlined$map$1(Flow flow, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 6;
        int i3 = 10;
        int i4 = 16;
        int i5 = 0;
        int i6 = 8;
        int i7 = 29;
        int i8 = 9;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = ((CallbackFlowBuilder) flow).collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(flowCollector, i3), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = ((FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1) flow).collect(new RealEarningsChartRepository$header$$inlined$map$1$2(flowCollector, i2), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = ((RealCustomerStore$getCustomersForIds$$inlined$map$1) flow).collect(new RealEarningsChartRepository$header$$inlined$map$1$2(flowCollector, i6), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = ((RealGooglePayer$createWallet$$inlined$filter$1) flow).collect(new RealEarningsChartRepository$header$$inlined$map$1$2(flowCollector, 18), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = ((RealContactRepository$contacts$$inlined$map$1) flow).collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(flowCollector, 5), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = ((RealFidesmoClient$getActivationData$$inlined$filter$1) flow).collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(flowCollector, 7), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = ((Transform$special$$inlined$map$1) flow).collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(flowCollector, i6), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = ((RealFidesmoClient$getActivationData$$inlined$filter$1) flow).collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(flowCollector, i8), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect9 = ((PaymentActionHandler$transform$$inlined$filter$1) flow).collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(flowCollector, 21), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object collect10 = ((RealActivityInvitePresenter) flow).collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, i8), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect11 = ((PaymentActionHandler$transform$$inlined$filter$1) flow).collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 15), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object collect12 = ((SwipeableState$special$$inlined$filter$1) flow).collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 25), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object collect13 = ((RealGooglePayer$createWallet$$inlined$map$1) flow).collect(new RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621(flowCollector, i8), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object collect14 = ((RealGooglePayer$createWallet$$inlined$map$1) flow).collect(new RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621(flowCollector, 11), continuation);
                if (collect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object collect15 = ((RealGooglePayer$createWallet$$inlined$map$1) flow).collect(new RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621(flowCollector, 13), continuation);
                if (collect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object collect16 = ((Transform$special$$inlined$map$1) flow).collect(new RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621(flowCollector, i4), continuation);
                if (collect16 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object collect17 = ((InviteContactsPresenter$filterContacts$$inlined$map$1) flow).collect(new RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621(flowCollector, 23), continuation);
                if (collect17 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object collect18 = ((InviteContactsPresenter$filterContacts$$inlined$map$1) flow).collect(new RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621(flowCollector, i7), continuation);
                if (collect18 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object collect19 = ((InviteContactsPresenter$filterContacts$$inlined$map$1) flow).collect(new InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(flowCollector, i5), continuation);
                if (collect19 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object collect20 = ((ChannelFlowBuilder) flow).collect(new InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(flowCollector, i8), continuation);
                if (collect20 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object collect21 = ((RealContactRepository$contacts$$inlined$map$1) flow).collect(new InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(flowCollector, i7), continuation);
                if (collect21 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object collect22 = ((InviteContactsPresenter$filterContacts$$inlined$map$1) flow).collect(new LimitsPresenter$models$lambda$2$$inlined$map$1$2(flowCollector, i2), continuation);
                if (collect22 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object collect23 = ((InviteContactsPresenter$filterContacts$$inlined$map$1) flow).collect(new LimitsPresenter$models$lambda$2$$inlined$map$1$2(flowCollector, i6), continuation);
                if (collect23 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object collect24 = ((InviteContactsPresenter$filterContacts$$inlined$map$1) flow).collect(new LimitsPresenter$models$lambda$2$$inlined$map$1$2(flowCollector, i3), continuation);
                if (collect24 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object collect25 = ((InviteContactsPresenter$filterContacts$$inlined$map$1) flow).collect(new LimitsPresenter$models$lambda$2$$inlined$map$1$2(flowCollector, 12), continuation);
                if (collect25 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object collect26 = ((InviteContactsPresenter$filterContacts$$inlined$map$1) flow).collect(new LimitsPresenter$models$lambda$2$$inlined$map$1$2(flowCollector, 14), continuation);
                if (collect26 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object collect27 = ((InviteContactsPresenter$filterContacts$$inlined$map$1) flow).collect(new LimitsPresenter$models$lambda$2$$inlined$map$1$2(flowCollector, i4), continuation);
                if (collect27 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object collect28 = ((FinishSetupTileBadgeCounter) flow).collect(new LimitsPresenter$models$lambda$2$$inlined$map$1$2(flowCollector, i5), continuation);
                if (collect28 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object collect29 = ((InviteContactsPresenter$special$$inlined$map$1) flow).collect(new LimitsPresenter$models$lambda$2$$inlined$map$1$2(flowCollector, 26), continuation);
                if (collect29 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect30 = ((MoneyTabPresenter$models$lambda$31$$inlined$map$1) flow).collect(new LimitsPresenter$models$lambda$2$$inlined$map$1$2(flowCollector, i7), continuation);
                if (collect30 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
