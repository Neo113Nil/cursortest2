package com.squareup.cash.blockers.presenters;

import androidx.compose.ui.node.PointerInputModifierNodeKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.PasscodeViewEvent;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.VerifyPasscodeRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class PasscodeVerifyTypeTransformer$transform$1$2$result$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ PasscodeViewEvent.VerifyPasscode $event;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ PasscodeVerifyTypeTransformer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PasscodeVerifyTypeTransformer$transform$1$2$result$1(PasscodeVerifyTypeTransformer passcodeVerifyTypeTransformer, PasscodeViewEvent.VerifyPasscode verifyPasscode, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = passcodeVerifyTypeTransformer;
        this.$event = verifyPasscode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        PasscodeViewEvent.VerifyPasscode verifyPasscode = this.$event;
        PasscodeVerifyTypeTransformer passcodeVerifyTypeTransformer = this.this$0;
        switch (i) {
            case 0:
                return new PasscodeVerifyTypeTransformer$transform$1$2$result$1(passcodeVerifyTypeTransformer, verifyPasscode, continuation, 0);
            default:
                return new PasscodeVerifyTypeTransformer$transform$1$2$result$1(passcodeVerifyTypeTransformer, verifyPasscode, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((PasscodeVerifyTypeTransformer$transform$1$2$result$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PasscodeViewEvent.VerifyPasscode verifyPasscode = this.$event;
        PasscodeVerifyTypeTransformer passcodeVerifyTypeTransformer = this.this$0;
        int i2 = 1;
        Object[] objArr = 0;
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
                Analytics analytics = passcodeVerifyTypeTransformer.analytics;
                BlockersData blockersData = passcodeVerifyTypeTransformer.args.blockersData;
                AndroidStringManager androidStringManager = passcodeVerifyTypeTransformer.stringManager;
                MoveBitcoinViewKt$$ExternalSyntheticLambda3 moveBitcoinViewKt$$ExternalSyntheticLambda3 = new MoveBitcoinViewKt$$ExternalSyntheticLambda3(17);
                PasscodeVerifyTypeTransformer$transform$1$2$result$1 passcodeVerifyTypeTransformer$transform$1$2$result$1 = new PasscodeVerifyTypeTransformer$transform$1$2$result$1(passcodeVerifyTypeTransformer, verifyPasscode, objArr == true ? 1 : 0, i2);
                this.label = 1;
                Object trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(16, blockersData, analytics, androidStringManager, this, moveBitcoinViewKt$$ExternalSyntheticLambda3, passcodeVerifyTypeTransformer$transform$1$2$result$1);
                return trackBlockerSubmissionAnalytics$default == coroutineSingletons ? coroutineSingletons : trackBlockerSubmissionAnalytics$default;
            default:
                BlockersScreens.PasscodeScreen passcodeScreen = passcodeVerifyTypeTransformer.args;
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
                AppService appService = passcodeVerifyTypeTransformer.appService;
                ClientScenario clientScenario = passcodeScreen.blockersData.clientScenario;
                clientScenario.getClass();
                BlockersData blockersData2 = passcodeScreen.blockersData;
                String str = blockersData2.flowToken;
                PasscodeViewEvent.VerifyPasscode.WithoutFingerprint withoutFingerprint = verifyPasscode instanceof PasscodeViewEvent.VerifyPasscode.WithoutFingerprint ? (PasscodeViewEvent.VerifyPasscode.WithoutFingerprint) verifyPasscode : null;
                String str2 = withoutFingerprint != null ? withoutFingerprint.passcode : null;
                PasscodeViewEvent.VerifyPasscode.WithFingerprint withFingerprint = verifyPasscode instanceof PasscodeViewEvent.VerifyPasscode.WithFingerprint ? (PasscodeViewEvent.VerifyPasscode.WithFingerprint) verifyPasscode : null;
                VerifyPasscodeRequest verifyPasscodeRequest = new VerifyPasscodeRequest(blockersData2.requestContext, str2, withFingerprint != null ? withFingerprint.passcodeToken : null, 8);
                this.label = 1;
                Object verifyPasscode2 = appService.verifyPasscode(clientScenario, str, verifyPasscodeRequest, this);
                return verifyPasscode2 == coroutineSingletons2 ? coroutineSingletons2 : verifyPasscode2;
        }
    }
}
