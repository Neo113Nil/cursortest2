package com.squareup.cash.blockers.presenters;

import androidx.compose.ui.node.PointerInputModifierNodeKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SetCashtagRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class CashtagPresenter$submitCashtag$result$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ String $cashtag;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CashtagPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashtagPresenter$submitCashtag$result$1(CashtagPresenter cashtagPresenter, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = cashtagPresenter;
        this.$cashtag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$cashtag;
        CashtagPresenter cashtagPresenter = this.this$0;
        switch (i) {
            case 0:
                return new CashtagPresenter$submitCashtag$result$1(cashtagPresenter, str, continuation, 0);
            case 1:
                return new CashtagPresenter$submitCashtag$result$1(cashtagPresenter, str, continuation, 1);
            case 2:
                return new CashtagPresenter$submitCashtag$result$1(cashtagPresenter, str, continuation, 2);
            default:
                return new CashtagPresenter$submitCashtag$result$1(cashtagPresenter, str, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((CashtagPresenter$submitCashtag$result$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$cashtag;
        CashtagPresenter cashtagPresenter = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Analytics analytics = cashtagPresenter.analytics;
                BlockersData blockersData = cashtagPresenter.args.blockersData;
                AndroidStringManager androidStringManager = cashtagPresenter.stringManager;
                MoveBitcoinViewKt$$ExternalSyntheticLambda3 moveBitcoinViewKt$$ExternalSyntheticLambda3 = new MoveBitcoinViewKt$$ExternalSyntheticLambda3(11);
                CashtagPresenter$submitCashtag$result$1 cashtagPresenter$submitCashtag$result$1 = new CashtagPresenter$submitCashtag$result$1(cashtagPresenter, str, continuation, 3);
                this.label = 1;
                Object trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(16, blockersData, analytics, androidStringManager, this, moveBitcoinViewKt$$ExternalSyntheticLambda3, cashtagPresenter$submitCashtag$result$1);
                return trackBlockerSubmissionAnalytics$default == coroutineSingletons ? coroutineSingletons : trackBlockerSubmissionAnalytics$default;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object access$getCashtagStatus = CashtagPresenter.access$getCashtagStatus(cashtagPresenter, str, this);
                    return access$getCashtagStatus == coroutineSingletons2 ? coroutineSingletons2 : access$getCashtagStatus;
                }
                if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object access$getCashtagStatus2 = CashtagPresenter.access$getCashtagStatus(cashtagPresenter, str, this);
                    return access$getCashtagStatus2 == coroutineSingletons3 ? coroutineSingletons3 : access$getCashtagStatus2;
                }
                if (i4 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                BlockersScreens.CashtagScreen cashtagScreen = cashtagPresenter.args;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppService appService = cashtagPresenter.appService;
                ClientScenario clientScenario = cashtagScreen.blockersData.clientScenario;
                clientScenario.getClass();
                BlockersData blockersData2 = cashtagScreen.blockersData;
                String str2 = blockersData2.flowToken;
                SetCashtagRequest setCashtagRequest = new SetCashtagRequest(blockersData2.requestContext, str, ByteString.EMPTY);
                this.label = 1;
                Object cashtag = appService.setCashtag(clientScenario, str2, setCashtagRequest, this);
                return cashtag == coroutineSingletons4 ? coroutineSingletons4 : cashtag;
        }
    }
}
