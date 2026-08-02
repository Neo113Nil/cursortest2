package com.squareup.cash.initialscreenloader.presenters;

import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.initialscreenloader.backend.RealOpenTheAppUserJourney;
import com.squareup.cash.initialscreenloader.screens.InitiateSessionFailedScreen;
import com.squareup.cash.initialscreenloader.screens.ScenarioPlanErrorScreen;
import com.squareup.cash.invitations.InviteContactsPresenter$filterContacts$$inlined$map$1;
import com.squareup.cash.localization.RealRegionProvider$1$1$1;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.cash.userjourneys.tracker.UserJourney$Outcome;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class InitialScreenLoaderPresenter$models$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Flow $events;
    public final /* synthetic */ int $r8$classId = 0;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ InitialScreenLoaderPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialScreenLoaderPresenter$models$1$1$1(InitialScreenLoaderPresenter initialScreenLoaderPresenter, Flow flow, Continuation continuation) {
        super(2, continuation);
        this.this$0 = initialScreenLoaderPresenter;
        this.$events = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        InitialScreenLoaderPresenter initialScreenLoaderPresenter = this.this$0;
        Flow flow = this.$events;
        switch (i) {
            case 0:
                InitialScreenLoaderPresenter$models$1$1$1 initialScreenLoaderPresenter$models$1$1$1 = new InitialScreenLoaderPresenter$models$1$1$1(initialScreenLoaderPresenter, flow, continuation);
                initialScreenLoaderPresenter$models$1$1$1.L$0 = obj;
                return initialScreenLoaderPresenter$models$1$1$1;
            default:
                InitialScreenLoaderPresenter$models$1$1$1 initialScreenLoaderPresenter$models$1$1$12 = new InitialScreenLoaderPresenter$models$1$1$1(flow, continuation, initialScreenLoaderPresenter);
                initialScreenLoaderPresenter$models$1$1$12.L$0 = obj;
                return initialScreenLoaderPresenter$models$1$1$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((InitialScreenLoaderPresenter$models$1$1$1) create((Screen) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((InitialScreenLoaderPresenter$models$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i = this.$r8$classId;
        InitialScreenLoaderPresenter initialScreenLoaderPresenter = this.this$0;
        Flow flow = this.$events;
        int i2 = 1;
        switch (i) {
            case 0:
                Screen screen = (Screen) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    initialScreenLoaderPresenter.navigator.goTo(screen);
                    if (!screen.equals(ScenarioPlanErrorScreen.INSTANCE) && !screen.equals(InitiateSessionFailedScreen.INSTANCE)) {
                        ((RealUserJourneyTracker) ((UserJourneyTracker) ((RealOpenTheAppUserJourney) initialScreenLoaderPresenter.openTheAppUserJourney).userJourneyTrackerProvider.invoke())).endJourney(UserJourney$Name.OPEN_THE_APP, UserJourney$Outcome.Failed.INSTANCE);
                        z = false;
                        return Boolean.valueOf(z);
                    }
                    InviteContactsPresenter$filterContacts$$inlined$map$1 inviteContactsPresenter$filterContacts$$inlined$map$1 = new InviteContactsPresenter$filterContacts$$inlined$map$1(flow, i2);
                    this.L$0 = null;
                    this.label = 1;
                    obj = FlowKt.first(inviteContactsPresenter$filterContacts$$inlined$map$1, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                z = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z);
            default:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealRegionProvider$1$1$1 realRegionProvider$1$1$1 = new RealRegionProvider$1$1$1(coroutineScope, initialScreenLoaderPresenter, 20);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(realRegionProvider$1$1$1, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialScreenLoaderPresenter$models$1$1$1(Flow flow, Continuation continuation, InitialScreenLoaderPresenter initialScreenLoaderPresenter) {
        super(2, continuation);
        this.$events = flow;
        this.this$0 = initialScreenLoaderPresenter;
    }
}
