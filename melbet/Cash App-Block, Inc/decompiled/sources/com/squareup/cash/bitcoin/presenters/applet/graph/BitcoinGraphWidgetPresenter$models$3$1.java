package com.squareup.cash.bitcoin.presenters.applet.graph;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.cdf.crypto.CryptoInteractGraphScrub;
import com.squareup.cash.cdf.crypto.CryptoInteractSelectDateRange;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphViewEvent;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.stripe.hcaptcha.HCaptcha;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class BitcoinGraphWidgetPresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $selectedRange$delegate;
    public final /* synthetic */ HCaptcha this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BitcoinGraphWidgetPresenter$models$3$1(HCaptcha hCaptcha, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = hCaptcha;
        this.$selectedRange$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$selectedRange$delegate;
        HCaptcha hCaptcha = this.this$0;
        switch (i) {
            case 0:
                return new BitcoinGraphWidgetPresenter$models$3$1(hCaptcha, mutableState, continuation, 0);
            default:
                return new BitcoinGraphWidgetPresenter$models$3$1(hCaptcha, mutableState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BitcoinGraphWidgetPresenter$models$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CryptoInteractSelectDateRange.DateRange dateRange;
        int i = this.$r8$classId;
        MutableState mutableState = this.$selectedRange$delegate;
        HCaptcha hCaptcha = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Analytics analytics = (Analytics) hCaptcha.internalConfig;
                int ordinal = ((HistoricalRange) mutableState.getValue()).ordinal();
                if (ordinal == 0) {
                    dateRange = CryptoInteractSelectDateRange.DateRange.DAY;
                } else if (ordinal == 1) {
                    dateRange = CryptoInteractSelectDateRange.DateRange.WEEK;
                } else if (ordinal == 2) {
                    dateRange = CryptoInteractSelectDateRange.DateRange.MONTH;
                } else if (ordinal == 3) {
                    dateRange = CryptoInteractSelectDateRange.DateRange.YEAR;
                } else if (ordinal != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    dateRange = CryptoInteractSelectDateRange.DateRange.ALL;
                }
                analytics.track(new CryptoInteractSelectDateRange(dateRange), null);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InvestingGraphViewEvent.ScrubPoint scrubPoint = (InvestingGraphViewEvent.ScrubPoint) mutableState.getValue();
                if (scrubPoint != null && scrubPoint.point == null) {
                    ((Analytics) hCaptcha.internalConfig).track(new CryptoInteractGraphScrub(), null);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
