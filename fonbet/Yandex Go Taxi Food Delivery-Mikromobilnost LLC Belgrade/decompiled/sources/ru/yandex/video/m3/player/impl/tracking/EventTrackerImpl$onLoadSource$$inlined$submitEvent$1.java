package ru.yandex.video.m3.player.impl.tracking;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.dto.PlaybackOptions;
import ru.yandex.video.m3.player.impl.tracking.EventTrackerImpl;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefaultKt;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.LoadSourceData;
import ru.yandex.video.m3.player.impl.tracking.event.LoggingStalledReason;
import ru.yandex.video.m3.player.impl.tracking.event.VideoConfigData;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V", "ru/yandex/video/m3/player/impl/tracking/EventTrackerImpl$submitEvent$1"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.impl.tracking.EventTrackerImpl$onLoadSource$$inlined$submitEvent$1", f = "EventTrackerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EventTrackerImpl$onLoadSource$$inlined$submitEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ EventTrackerImpl.EventOrderAnalyticsHelper $analyticsHelper$inlined;
    final /* synthetic */ EventTrackerImpl.EventContext $eventContext;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventTrackerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventTrackerImpl$onLoadSource$$inlined$submitEvent$1(EventTrackerImpl.EventContext eventContext, Continuation continuation, EventTrackerImpl eventTrackerImpl, EventTrackerImpl.EventOrderAnalyticsHelper eventOrderAnalyticsHelper) {
        super(2, continuation);
        this.$eventContext = eventContext;
        this.this$0 = eventTrackerImpl;
        this.$analyticsHelper$inlined = eventOrderAnalyticsHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        EventTrackerImpl$onLoadSource$$inlined$submitEvent$1 eventTrackerImpl$onLoadSource$$inlined$submitEvent$1 = new EventTrackerImpl$onLoadSource$$inlined$submitEvent$1(this.$eventContext, continuation, this.this$0, this.$analyticsHelper$inlined);
        eventTrackerImpl$onLoadSource$$inlined$submitEvent$1.L$0 = obj;
        return eventTrackerImpl$onLoadSource$$inlined$submitEvent$1;
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((EventTrackerImpl$onLoadSource$$inlined$submitEvent$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
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
            Event event = Event.LOAD_SOURCE;
            if (eventTrackerImpl.loggingFilter.isAllowedToSendLog(event, EventType.EVENT)) {
                if (eventTrackerImpl.useNewAsyncLogic) {
                    StrmTrackingApi strmTrackingApi = eventTrackerImpl.strmTrackingApi;
                    EventTrackerImpl eventTrackerImpl2 = this.this$0;
                    PlaybackOptions playbackOptions = eventContext.getPlaybackOptions();
                    strmTrackingApi.trackEventBlocking$video_player_internalRelease(EventTrackerImpl.createDefaultEvent$default(eventTrackerImpl2, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, EventDefaultKt.orEmpty(playbackOptions != null ? new LoadSourceData(playbackOptions, new LinkedHashMap(this.this$0.videoDataSerializer.serialize(playbackOptions.getVideoData())), this.this$0.jsonConverter.to(new VideoConfigData(playbackOptions).getConfig())) : null), this.$analyticsHelper$inlined, 14, (Object) null));
                } else {
                    StrmTrackingApi strmTrackingApi2 = eventTrackerImpl.strmTrackingApi;
                    EventTrackerImpl eventTrackerImpl3 = this.this$0;
                    PlaybackOptions playbackOptions2 = eventContext.getPlaybackOptions();
                    strmTrackingApi2.trackEvent(EventTrackerImpl.createDefaultEvent$default(eventTrackerImpl3, eventContext, event, (LoggingStalledReason) null, (VideoType) null, (EventType) null, EventDefaultKt.orEmpty(playbackOptions2 != null ? new LoadSourceData(playbackOptions2, new LinkedHashMap(this.this$0.videoDataSerializer.serialize(playbackOptions2.getVideoData())), this.this$0.jsonConverter.to(new VideoConfigData(playbackOptions2).getConfig())) : null), this.$analyticsHelper$inlined, 14, (Object) null));
                }
            }
        } catch (Throwable unused) {
        }
        return zy11.a;
    }
}
