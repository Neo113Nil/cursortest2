package ru.yandex.video.m3.player.impl.tracking;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.player.impl.tracking.EventTrackerImpl;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.LoggingStalledReason;
import ru.yandex.video.m3.player.impl.tracking.event.StartPlayerData;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V", "ru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$submitEvent$1"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.impl.tracking.EventTrackerImpl$onStart$$inlined$submitEvent$1", f = "EventTrackerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EventTrackerImpl$onStart$$inlined$submitEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ EventTrackerImpl.EventOrderAnalyticsHelper $analyticsHelper$inlined;
    final /* synthetic */ EventTrackerImpl.EventContext $eventContext;
    final /* synthetic */ Map $initializedDecoders$inlined;
    final /* synthetic */ PlayerState $playerState$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventTrackerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventTrackerImpl$onStart$$inlined$submitEvent$1(EventTrackerImpl.EventContext eventContext, Continuation continuation, EventTrackerImpl eventTrackerImpl, PlayerState playerState, Map map, EventTrackerImpl.EventOrderAnalyticsHelper eventOrderAnalyticsHelper) {
        super(2, continuation);
        this.$eventContext = eventContext;
        this.this$0 = eventTrackerImpl;
        this.$playerState$inlined = playerState;
        this.$initializedDecoders$inlined = map;
        this.$analyticsHelper$inlined = eventOrderAnalyticsHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        EventTrackerImpl$onStart$$inlined$submitEvent$1 eventTrackerImpl$onStart$$inlined$submitEvent$1 = new EventTrackerImpl$onStart$$inlined$submitEvent$1(this.$eventContext, continuation, this.this$0, this.$playerState$inlined, this.$initializedDecoders$inlined, this.$analyticsHelper$inlined);
        eventTrackerImpl$onStart$$inlined$submitEvent$1.L$0 = obj;
        return eventTrackerImpl$onStart$$inlined$submitEvent$1;
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((EventTrackerImpl$onStart$$inlined$submitEvent$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        EventTrackerImpl.EventContext eventContext = this.$eventContext;
        try {
            EventTrackerImpl eventTrackerImpl = this.this$0;
            Event event = Event.START;
            if (eventTrackerImpl.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
                if (eventTrackerImpl.useNewAsyncLogic) {
                    eventTrackerImpl.strmTrackingApi.trackEventBlocking$video_player_internalRelease(EventTrackerImpl.createDefaultEvent$default(this.this$0, eventContext, event, (LoggingStalledReason) null, this.$playerState$inlined.getVideoType(), (EventType) null, new StartPlayerData(this.$initializedDecoders$inlined, this.this$0.createDataDefaultEvent(this.$playerState$inlined), this.$playerState$inlined.getInitialBandwidthEstimates()), this.$analyticsHelper$inlined, 10, (Object) null));
                } else {
                    eventTrackerImpl.strmTrackingApi.trackEvent(EventTrackerImpl.createDefaultEvent$default(this.this$0, eventContext, event, (LoggingStalledReason) null, this.$playerState$inlined.getVideoType(), (EventType) null, new StartPlayerData(this.$initializedDecoders$inlined, this.this$0.createDataDefaultEvent(this.$playerState$inlined), this.$playerState$inlined.getInitialBandwidthEstimates()), this.$analyticsHelper$inlined, 10, (Object) null));
                }
            }
        } catch (Throwable unused) {
        }
        return zy11.a;
    }
}
