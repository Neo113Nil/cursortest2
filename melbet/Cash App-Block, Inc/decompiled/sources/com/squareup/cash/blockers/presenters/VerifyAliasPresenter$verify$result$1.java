package com.squareup.cash.blockers.presenters;

import androidx.compose.ui.node.PointerInputModifierNodeKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.blockers.analytics.BlockerSubmissionAnalyticsKt$$ExternalSyntheticLambda8;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.onboarding.util.AliasVerifier$Args;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class VerifyAliasPresenter$verify$result$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AliasVerifier$Args $verifyArgs;
    public int label;
    public final /* synthetic */ VerifyAliasPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerifyAliasPresenter$verify$result$1(VerifyAliasPresenter verifyAliasPresenter, AliasVerifier$Args aliasVerifier$Args, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = verifyAliasPresenter;
        this.$verifyArgs = aliasVerifier$Args;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        AliasVerifier$Args aliasVerifier$Args = this.$verifyArgs;
        VerifyAliasPresenter verifyAliasPresenter = this.this$0;
        switch (i) {
            case 0:
                return new VerifyAliasPresenter$verify$result$1(verifyAliasPresenter, aliasVerifier$Args, continuation, 0);
            default:
                return new VerifyAliasPresenter$verify$result$1(verifyAliasPresenter, aliasVerifier$Args, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((VerifyAliasPresenter$verify$result$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        AliasVerifier$Args aliasVerifier$Args = this.$verifyArgs;
        VerifyAliasPresenter verifyAliasPresenter = this.this$0;
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
                Analytics analytics = verifyAliasPresenter.analytics;
                BlockersData blockersData = verifyAliasPresenter.args.blockersData;
                AndroidStringManager androidStringManager = verifyAliasPresenter.stringManager;
                VerifyAliasPresenter$verify$result$1 verifyAliasPresenter$verify$result$1 = new VerifyAliasPresenter$verify$result$1(verifyAliasPresenter, aliasVerifier$Args, continuation, i2);
                this.label = 1;
                Object trackBlockerSubmissionAnalyticsInternal2 = PointerInputModifierNodeKt.trackBlockerSubmissionAnalyticsInternal2(analytics, androidStringManager, blockersData, R.string.blockers_retrofit_error_message, new BlockerSubmissionAnalyticsKt$$ExternalSyntheticLambda8(androidStringManager, 0), new Scene.AnonymousClass1(verifyAliasPresenter$verify$result$1, continuation, 11), this);
                return trackBlockerSubmissionAnalyticsInternal2 == coroutineSingletons ? coroutineSingletons : trackBlockerSubmissionAnalyticsInternal2;
            default:
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
                ToolbarTuckTargets toolbarTuckTargets = verifyAliasPresenter.aliasVerifier;
                this.label = 1;
                Object verify = toolbarTuckTargets.verify(aliasVerifier$Args, this);
                return verify == coroutineSingletons2 ? coroutineSingletons2 : verify;
        }
    }
}
