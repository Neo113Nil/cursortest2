package com.squareup.cash.money.presenters;

import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.PdpNotifiedPreference;
import com.squareup.cash.cdf.minthype.MintHypeOptOutComplete;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.screens.Back;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.preferences.KeyValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class HypeWelcomePresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $notifyDeviceId;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ LocalHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HypeWelcomePresenter$models$1$1(LocalHomePresenter localHomePresenter, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = localHomePresenter;
        this.$notifyDeviceId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$notifyDeviceId;
        LocalHomePresenter localHomePresenter = this.this$0;
        switch (i) {
            case 0:
                return new HypeWelcomePresenter$models$1$1(localHomePresenter, str, continuation, 0);
            default:
                return new HypeWelcomePresenter$models$1$1(localHomePresenter, str, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((HypeWelcomePresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$notifyDeviceId;
        LocalHomePresenter localHomePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((Analytics) localHomePresenter.clearMarketingBadgesIfNeeded).track(new MintHypeOptOutComplete(str, PlatformKt.activeAccountTokenOrNull((SessionManager) localHomePresenter.localHomeGeoPresenterFactory)), null);
                    HypeDismissedPreference hypeDismissedPreference = (HypeDismissedPreference) localHomePresenter.syncer;
                    this.label = 1;
                    Object obj2 = ((KeyValue) hypeDismissedPreference.keyValueFactory.invoke(str)).set(Boolean.TRUE, this);
                    if (obj2 != coroutineSingletons) {
                        obj2 = Unit.INSTANCE;
                    }
                    if (obj2 == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                ((BetterNavigator.ScreenNavigator) localHomePresenter.navigator).goTo(Back.INSTANCE);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PdpNotifiedPreference pdpNotifiedPreference = (PdpNotifiedPreference) localHomePresenter.store;
                    this.label = 1;
                    Object obj3 = ((KeyValue) pdpNotifiedPreference.keyValueFactory.invoke(str)).set(Boolean.TRUE, this);
                    if (obj3 != coroutineSingletons2) {
                        obj3 = Unit.INSTANCE;
                    }
                    if (obj3 == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
