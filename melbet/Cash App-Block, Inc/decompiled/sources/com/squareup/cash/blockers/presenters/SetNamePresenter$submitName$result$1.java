package com.squareup.cash.blockers.presenters;

import androidx.compose.ui.node.PointerInputModifierNodeKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SetFullNameRequest;
import com.squareup.protos.franklin.common.RequestContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class SetNamePresenter$submitName$result$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ String $name;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CardLockPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SetNamePresenter$submitName$result$1(CardLockPresenter cardLockPresenter, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = cardLockPresenter;
        this.$name = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$name;
        CardLockPresenter cardLockPresenter = this.this$0;
        switch (i) {
            case 0:
                return new SetNamePresenter$submitName$result$1(cardLockPresenter, str, continuation, 0);
            default:
                return new SetNamePresenter$submitName$result$1(cardLockPresenter, str, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((SetNamePresenter$submitName$result$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardLockPresenter cardLockPresenter = this.this$0;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Analytics analytics = (Analytics) cardLockPresenter.analytics;
                BlockersData blockersData = ((BlockersScreens.SetNameScreen) cardLockPresenter.args).blockersData;
                AndroidStringManager androidStringManager = (AndroidStringManager) cardLockPresenter.stringManager;
                MoveBitcoinViewKt$$ExternalSyntheticLambda3 moveBitcoinViewKt$$ExternalSyntheticLambda3 = new MoveBitcoinViewKt$$ExternalSyntheticLambda3(26);
                SetNamePresenter$submitName$result$1 setNamePresenter$submitName$result$1 = new SetNamePresenter$submitName$result$1(cardLockPresenter, this.$name, continuation, i2);
                this.label = 1;
                Object trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(16, blockersData, analytics, androidStringManager, this, moveBitcoinViewKt$$ExternalSyntheticLambda3, setNamePresenter$submitName$result$1);
                return trackBlockerSubmissionAnalytics$default == coroutineSingletons ? coroutineSingletons : trackBlockerSubmissionAnalytics$default;
            default:
                BlockersScreens.SetNameScreen setNameScreen = (BlockersScreens.SetNameScreen) cardLockPresenter.args;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 != 0) {
                    if (i4 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppService appService = (AppService) cardLockPresenter.franklinAppService;
                ClientScenario clientScenario = setNameScreen.blockersData.clientScenario;
                clientScenario.getClass();
                BlockersData blockersData2 = setNameScreen.blockersData;
                String str = blockersData2.flowToken;
                RequestContext requestContext = blockersData2.requestContext;
                SetFullNameRequest setFullNameRequest = new SetFullNameRequest(requestContext, this.$name, requestContext.transfer_token, requestContext.payment_tokens, ByteString.EMPTY);
                this.label = 1;
                Object fullName = appService.setFullName(clientScenario, str, setFullNameRequest, this);
                return fullName == coroutineSingletons2 ? coroutineSingletons2 : fullName;
        }
    }
}
