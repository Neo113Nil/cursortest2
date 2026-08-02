package com.squareup.cash.profile.presenters.notifications;

import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.profile.presenters.notifications.ProfileNotificationsPresenter;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ProfileNotificationsPresenter$loadAccountSelectorAccounts$2 extends SuspendLambda implements Function2 {
    public int label;
    public final /* synthetic */ ProfileNotificationsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileNotificationsPresenter$loadAccountSelectorAccounts$2(ProfileNotificationsPresenter profileNotificationsPresenter, Continuation continuation) {
        super(2, continuation);
        this.this$0 = profileNotificationsPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProfileNotificationsPresenter$loadAccountSelectorAccounts$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileNotificationsPresenter$loadAccountSelectorAccounts$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        ProfileNotificationsPresenter profileNotificationsPresenter = this.this$0;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            RealDrawerOpener$getDrawerScreen$$inlined$map$1 realDrawerOpener$getDrawerScreen$$inlined$map$1 = new RealDrawerOpener$getDrawerScreen$$inlined$map$1(profileNotificationsPresenter.repository.getNotificationSettings(), 19);
            this.label = 1;
            obj = FlowKt.firstOrNull(realDrawerOpener$getDrawerScreen$$inlined$map$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        List list = (List) obj;
        String joinToString$default = list != null ? CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62) : null;
        profileNotificationsPresenter.errorReporter.report(new ProfileNotificationsPresenter.AccountSelectorLoadError(MapsKt__MapsKt.mapOf(new Pair("current_account_token", PlatformKt.activeAccountToken(profileNotificationsPresenter.sessionManager)), new Pair("account_tokens_returned", joinToString$default), new Pair("expected_account_tokens", joinToString$default))), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
        return Unit.INSTANCE;
    }
}
