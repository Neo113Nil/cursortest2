package com.squareup.cash.offers.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.offers.backend.api.OffersItemToken;
import com.squareup.cash.offers.backend.api.OffersTabRepository$SearchSource;
import com.squareup.cash.offers.backend.real.RealOffersTabRefresher;
import com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class OffersHomePresenter$models$7$4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ OffersHomeViewEvent $event;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $searchPlaceholder$delegate;
    public int label;
    public final /* synthetic */ OffersHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OffersHomePresenter$models$7$4(OffersHomeViewEvent offersHomeViewEvent, OffersHomePresenter offersHomePresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$event = offersHomeViewEvent;
        this.this$0 = offersHomePresenter;
        this.$searchPlaceholder$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new OffersHomePresenter$models$7$4(this.$event, this.this$0, this.$searchPlaceholder$delegate, continuation, 0);
            default:
                return new OffersHomePresenter$models$7$4(this.$event, this.this$0, this.$searchPlaceholder$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((OffersHomePresenter$models$7$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$searchPlaceholder$delegate;
        OffersHomeViewEvent offersHomeViewEvent = this.$event;
        OffersHomePresenter offersHomePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OffersItemToken offersItemToken = ((OffersHomeViewEvent.OffersHeroTileClicked) offersHomeViewEvent).itemToken;
                    if (offersItemToken != null) {
                        RealOffersTabRefresher realOffersTabRefresher = offersHomePresenter.offersTabRefresher;
                        this.label = 1;
                        if (realOffersTabRefresher.refreshSearchNullState(offersItemToken, OffersTabRepository$SearchSource.ALWAYS_REMOTE, this) == coroutineSingletons) {
                            break;
                        }
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                OffersHomePresenter.access$routeActionUrl(offersHomePresenter, ((OffersHomeViewEvent.OffersHeroTileClicked) offersHomeViewEvent).actionUrl, (String) mutableState.getValue());
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OffersItemToken offersItemToken2 = ((OffersHomeViewEvent.OffersClusterItemClicked) offersHomeViewEvent).itemToken;
                    if (offersItemToken2 != null) {
                        RealOffersTabRefresher realOffersTabRefresher2 = offersHomePresenter.offersTabRefresher;
                        this.label = 1;
                        if (realOffersTabRefresher2.refreshSearchNullState(offersItemToken2, OffersTabRepository$SearchSource.ALWAYS_REMOTE, this) == coroutineSingletons2) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                OffersHomePresenter.access$routeActionUrl(offersHomePresenter, ((OffersHomeViewEvent.OffersClusterItemClicked) offersHomeViewEvent).actionUrl, (String) mutableState.getValue());
                break;
        }
        return Unit.INSTANCE;
    }
}
