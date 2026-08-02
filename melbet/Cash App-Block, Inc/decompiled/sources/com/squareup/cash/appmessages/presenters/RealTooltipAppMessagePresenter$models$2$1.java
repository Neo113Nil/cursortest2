package com.squareup.cash.appmessages.presenters;

import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.TooltipAppMessageViewEvent;
import com.squareup.cash.cdf.AppMessageFormat;
import com.squareup.cash.cdf.appmessage.AppMessageInteractClick;
import com.squareup.cash.integration.analytics.Analytics;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealTooltipAppMessagePresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ TooltipAppMessageViewEvent $event;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealTooltipAppMessagePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealTooltipAppMessagePresenter$models$2$1(RealTooltipAppMessagePresenter realTooltipAppMessagePresenter, TooltipAppMessageViewEvent tooltipAppMessageViewEvent, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realTooltipAppMessagePresenter;
        this.$event = tooltipAppMessageViewEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        TooltipAppMessageViewEvent tooltipAppMessageViewEvent = this.$event;
        RealTooltipAppMessagePresenter realTooltipAppMessagePresenter = this.this$0;
        switch (i) {
            case 0:
                return new RealTooltipAppMessagePresenter$models$2$1(realTooltipAppMessagePresenter, tooltipAppMessageViewEvent, continuation, 0);
            case 1:
                return new RealTooltipAppMessagePresenter$models$2$1(realTooltipAppMessagePresenter, tooltipAppMessageViewEvent, continuation, 1);
            default:
                return new RealTooltipAppMessagePresenter$models$2$1(realTooltipAppMessagePresenter, tooltipAppMessageViewEvent, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealTooltipAppMessagePresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        TooltipAppMessageViewEvent tooltipAppMessageViewEvent = this.$event;
        RealTooltipAppMessagePresenter realTooltipAppMessagePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TooltipAppMessageViewEvent.TargetClicked targetClicked = (TooltipAppMessageViewEvent.TargetClicked) tooltipAppMessageViewEvent;
                realTooltipAppMessagePresenter.tooltipMessageQueries.delete(targetClicked.actionTaken.messageToken);
                Analytics analytics = realTooltipAppMessagePresenter.analytics;
                AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken = targetClicked.actionTaken;
                String str = appMessageActionTaken.messageToken;
                String str2 = appMessageActionTaken.url;
                analytics.track(new AppMessageInteractClick(new Long(realTooltipAppMessagePresenter.clock.millis()), null, AppMessageFormat.TOOLTIP, str, str2, 6), null);
                if (!targetClicked.isLocalTooltip) {
                    realTooltipAppMessagePresenter.actionPerformer.perform(targetClicked.actionTaken);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TooltipAppMessageViewEvent.TooltipClicked tooltipClicked = (TooltipAppMessageViewEvent.TooltipClicked) tooltipAppMessageViewEvent;
                realTooltipAppMessagePresenter.tooltipMessageQueries.delete(tooltipClicked.actionTaken.messageToken);
                Analytics analytics2 = realTooltipAppMessagePresenter.analytics;
                AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken2 = tooltipClicked.actionTaken;
                String str3 = appMessageActionTaken2.messageToken;
                String str4 = appMessageActionTaken2.url;
                analytics2.track(new AppMessageInteractClick(new Long(realTooltipAppMessagePresenter.clock.millis()), null, AppMessageFormat.TOOLTIP, str3, str4, 6), null);
                if (!tooltipClicked.isLocalTooltip) {
                    realTooltipAppMessagePresenter.actionPerformer.perform(tooltipClicked.actionTaken);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TooltipAppMessageViewEvent.TooltipDismissed tooltipDismissed = (TooltipAppMessageViewEvent.TooltipDismissed) tooltipAppMessageViewEvent;
                realTooltipAppMessagePresenter.tooltipMessageQueries.delete(tooltipDismissed.actionTaken.messageToken);
                Analytics analytics3 = realTooltipAppMessagePresenter.analytics;
                AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken3 = tooltipDismissed.actionTaken;
                String str5 = appMessageActionTaken3.messageToken;
                String str6 = appMessageActionTaken3.url;
                analytics3.track(new AppMessageInteractClick(new Long(realTooltipAppMessagePresenter.clock.millis()), null, AppMessageFormat.TOOLTIP, str5, str6, 6), null);
                if (!tooltipDismissed.isLocalTooltip) {
                    realTooltipAppMessagePresenter.actionPerformer.perform(tooltipDismissed.actionTaken);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
