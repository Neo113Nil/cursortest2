package ru.yandex.video.m3.player.impl.tracking;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.ab.config.AbConfig;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.player.impl.tracking.EventTrackerImpl;
import ru.yandex.video.m3.player.impl.tracking.data.ab.AbValidationEventNameMapper;
import ru.yandex.video.m3.player.impl.tracking.event.AbValidationData;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.LoggingStalledReason;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V", "ru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$submitEvent$1"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.impl.tracking.EventTrackerImpl$onCreatePlayerInternal$$inlined$submitEvent$2", f = "EventTrackerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EventTrackerImpl$onCreatePlayerInternal$$inlined$submitEvent$2 extends SuspendLambda implements wls {
    final /* synthetic */ AbConfig $abConfig$inlined;
    final /* synthetic */ AbValidationData $abValidationEventData$inlined;
    final /* synthetic */ EventTrackerImpl.EventContext $eventContext;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventTrackerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventTrackerImpl$onCreatePlayerInternal$$inlined$submitEvent$2(EventTrackerImpl.EventContext eventContext, Continuation continuation, EventTrackerImpl eventTrackerImpl, AbConfig abConfig, AbValidationData abValidationData) {
        super(2, continuation);
        this.$eventContext = eventContext;
        this.this$0 = eventTrackerImpl;
        this.$abConfig$inlined = abConfig;
        this.$abValidationEventData$inlined = abValidationData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        EventTrackerImpl$onCreatePlayerInternal$$inlined$submitEvent$2 eventTrackerImpl$onCreatePlayerInternal$$inlined$submitEvent$2 = new EventTrackerImpl$onCreatePlayerInternal$$inlined$submitEvent$2(this.$eventContext, continuation, this.this$0, this.$abConfig$inlined, this.$abValidationEventData$inlined);
        eventTrackerImpl$onCreatePlayerInternal$$inlined$submitEvent$2.L$0 = obj;
        return eventTrackerImpl$onCreatePlayerInternal$$inlined$submitEvent$2;
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((EventTrackerImpl$onCreatePlayerInternal$$inlined$submitEvent$2) create(tseVar, continuation)).invokeSuspend(zy11.a);
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
            if (eventTrackerImpl.loggingFilter.isAllowedToSendLog(null, EventType.EVENT)) {
                if (eventTrackerImpl.useNewAsyncLogic) {
                    eventTrackerImpl.strmTrackingApi.trackEventBlocking$video_player_internalRelease(EventTrackerImpl.createDefaultEvent$default(this.this$0, eventContext, AbValidationEventNameMapper.INSTANCE.getEventNameForValidationResult$video_player_internalRelease(this.$abConfig$inlined.getFeatureToggleValidationResult()), (LoggingStalledReason) null, (VideoType) null, (EventType) null, this.$abValidationEventData$inlined, this.this$0.createEventOrderAnalyticsHelper(), 10, (Object) null));
                } else {
                    eventTrackerImpl.strmTrackingApi.trackEvent(EventTrackerImpl.createDefaultEvent$default(this.this$0, eventContext, AbValidationEventNameMapper.INSTANCE.getEventNameForValidationResult$video_player_internalRelease(this.$abConfig$inlined.getFeatureToggleValidationResult()), (LoggingStalledReason) null, (VideoType) null, (EventType) null, this.$abValidationEventData$inlined, this.this$0.createEventOrderAnalyticsHelper(), 10, (Object) null));
                }
            }
        } catch (Throwable unused) {
        }
        return zy11.a;
    }
}
