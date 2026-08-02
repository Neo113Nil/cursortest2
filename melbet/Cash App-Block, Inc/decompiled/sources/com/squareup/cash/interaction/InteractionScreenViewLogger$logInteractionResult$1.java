package com.squareup.cash.interaction;

import com.squareup.cash.cdf.performance.PerformanceMeasureInteractionLatency;
import com.squareup.cash.interaction.InteractionScreenViewLogger;
import com.squareup.cash.interaction.UserInteractionLatencyEvent;
import com.squareup.cash.observability.backend.api.ViewTracking;
import com.squareup.cash.userjourneys.tracker.ActiveUserJourney;
import com.squareup.cash.userjourneys.tracker.RealUserJourneySignalProcessor;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourneySignalProcessor;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import papa.InteractionResult;
import papa.InteractionTrigger;
import papa.SafeTrace;
import papa.SentEvent;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final class InteractionScreenViewLogger$logInteractionResult$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $description;
    public final /* synthetic */ long $jvmHeapBytes;
    public final /* synthetic */ long $nativeHeapBytes;
    public final /* synthetic */ InteractionResult $result;
    public final /* synthetic */ InteractionScreenViewLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractionScreenViewLogger$logInteractionResult$1(InteractionResult interactionResult, InteractionScreenViewLogger interactionScreenViewLogger, String str, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.$result = interactionResult;
        this.this$0 = interactionScreenViewLogger;
        this.$description = str;
        this.$jvmHeapBytes = j;
        this.$nativeHeapBytes = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InteractionScreenViewLogger$logInteractionResult$1(this.$result, this.this$0, this.$description, this.$jvmHeapBytes, this.$nativeHeapBytes, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InteractionScreenViewLogger$logInteractionResult$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5 A[LOOP:3: B:31:0x00bf->B:33:0x00c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0162 A[LOOP:4: B:47:0x015c->B:49:0x0162, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        Long l;
        Iterator it;
        InteractionScreenViewLogger.LastScreenView lastScreenView;
        String prettyName;
        ViewTracking viewTracking;
        Object obj4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        InteractionResult.Finished finished = (InteractionResult.Finished) this.$result;
        OkHttpCall.AnonymousClass1 anonymousClass1 = (OkHttpCall.AnonymousClass1) finished.$$delegate_0;
        SentEvent sentEvent = (SentEvent) CollectionsKt.first((List) anonymousClass1.this$0);
        Iterator it2 = ((List) anonymousClass1.this$0).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((SentEvent) obj2).event instanceof ScreenPresentationStart) {
                break;
            }
        }
        SentEvent sentEvent2 = (SentEvent) obj2;
        InteractionEvent interactionEvent = sentEvent2 != null ? sentEvent2.event : null;
        ScreenPresentationStart screenPresentationStart = interactionEvent instanceof ScreenPresentationStart ? (ScreenPresentationStart) interactionEvent : null;
        List list = (List) anonymousClass1.this$0;
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (((SentEvent) obj3).event instanceof ScreenNavigationStart) {
                break;
            }
        }
        SentEvent sentEvent3 = (SentEvent) obj3;
        if (sentEvent3 != null) {
            long j = sentEvent3.uptime;
            Iterator it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it4.next();
                if (((SentEvent) obj4).event instanceof ScreenNavigationEnd) {
                    break;
                }
            }
            SentEvent sentEvent4 = (SentEvent) obj4;
            if (sentEvent4 != null) {
                l = Long.valueOf(Duration.m4167getInWholeMillisecondsimpl(Duration.m4172minusLRDsOJo(sentEvent4.uptime, j)));
                InteractionScreenViewLogger interactionScreenViewLogger = this.this$0;
                List activeUserJourneys = ((RealUserJourneySignalProcessor) ((UserJourneySignalProcessor) ((RealUserJourneyTracker) interactionScreenViewLogger.userJourneyTracker).signalProcessorProvider.getValue())).getActiveUserJourneys();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(activeUserJourneys, 10));
                it = activeUserJourneys.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ActiveUserJourney) it.next()).name.getLabel());
                }
                String joinToString$default = CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62);
                InteractionTrigger interactionTrigger = (InteractionTrigger) anonymousClass1.val$callback;
                Duration duration = interactionTrigger == null ? new Duration(interactionTrigger.mo4371getTriggerUptimeUwyO8pc()) : null;
                Duration duration2 = duration == null ? new Duration(Duration.m4172minusLRDsOJo(sentEvent.uptime, duration.rawValue)) : null;
                long m4172minusLRDsOJo = Duration.m4172minusLRDsOJo(finished.endFrameRenderedUptime, ((SentEvent) CollectionsKt.first((List) anonymousClass1.this$0)).uptime);
                long m4167getInWholeMillisecondsimpl = Duration.m4167getInWholeMillisecondsimpl(duration2 == null ? Duration.m4173plusLRDsOJo(duration2.rawValue, m4172minusLRDsOJo) : m4172minusLRDsOJo);
                long m4167getInWholeMillisecondsimpl2 = Duration.m4167getInWholeMillisecondsimpl(m4172minusLRDsOJo);
                long m4167getInWholeMillisecondsimpl3 = duration2 == null ? Duration.m4167getInWholeMillisecondsimpl(duration2.rawValue) : -1L;
                long m4167getInWholeMillisecondsimpl4 = Duration.m4167getInWholeMillisecondsimpl(sentEvent.uptime);
                List list2 = (List) anonymousClass1.this$0;
                Moshi moshi = interactionScreenViewLogger.moshi;
                list2.getClass();
                long j2 = ((SentEvent) CollectionsKt.first(list2)).uptime;
                List<SentEvent> list3 = list2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (SentEvent sentEvent5 : list3) {
                    InteractionEvent interactionEvent2 = sentEvent5.event;
                    long j3 = sentEvent5.uptime;
                    String obj5 = interactionEvent2.toString();
                    obj5.getClass();
                    arrayList2.add(new UserInteractionLatencyEvent.JsonSentEvent(obj5, Duration.m4167getInWholeMillisecondsimpl(Duration.m4172minusLRDsOJo(j3, j2))));
                    j2 = j3;
                    interactionScreenViewLogger = interactionScreenViewLogger;
                }
                InteractionScreenViewLogger interactionScreenViewLogger2 = interactionScreenViewLogger;
                String json = moshi.adapter(List.class, Util.NO_ANNOTATIONS, null).toJson(arrayList2);
                json.getClass();
                long m4167getInWholeMillisecondsimpl5 = screenPresentationStart == null ? Duration.m4167getInWholeMillisecondsimpl(screenPresentationStart.initDuration) : -1L;
                long m4167getInWholeMillisecondsimpl6 = screenPresentationStart == null ? Duration.m4167getInWholeMillisecondsimpl(screenPresentationStart.startDuration) : -1L;
                long j4 = this.$jvmHeapBytes;
                long j5 = this.$nativeHeapBytes;
                String str = this.$description;
                InteractionInfo interactionInfo = new InteractionInfo(str, new UserInteractionLatencyEvent(str, m4167getInWholeMillisecondsimpl, m4167getInWholeMillisecondsimpl2, m4167getInWholeMillisecondsimpl3, m4167getInWholeMillisecondsimpl4, json, m4167getInWholeMillisecondsimpl5, m4167getInWholeMillisecondsimpl6, j4, j5), arrayList, l);
                lastScreenView = interactionScreenViewLogger2.lastScreenInteraction;
                if (lastScreenView != null && (viewTracking = lastScreenView.lastScreenInteraction) != null) {
                    ViewTracking.viewEnded$default(viewTracking);
                }
                interactionScreenViewLogger2.lastScreenInteraction = null;
                InteractionEvent interactionEvent3 = sentEvent.event;
                prettyName = interactionEvent3.getScreen().prettyName();
                if (prettyName == null) {
                    prettyName = Reflection.factory.getOrCreateKotlinClass(interactionEvent3.getScreen().getClass()).getSimpleName();
                    if (prettyName == null) {
                        prettyName = "";
                    }
                }
                interactionScreenViewLogger2.startTracking(prettyName, prettyName, interactionInfo);
                interactionScreenViewLogger2.analytics.track(new PerformanceMeasureInteractionLatency(new Long(m4167getInWholeMillisecondsimpl), prettyName, joinToString$default), null);
                return Unit.INSTANCE;
            }
        }
        l = null;
        InteractionScreenViewLogger interactionScreenViewLogger3 = this.this$0;
        List activeUserJourneys2 = ((RealUserJourneySignalProcessor) ((UserJourneySignalProcessor) ((RealUserJourneyTracker) interactionScreenViewLogger3.userJourneyTracker).signalProcessorProvider.getValue())).getActiveUserJourneys();
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(activeUserJourneys2, 10));
        it = activeUserJourneys2.iterator();
        while (it.hasNext()) {
        }
        String joinToString$default2 = CollectionsKt.joinToString$default(arrayList3, ",", null, null, 0, null, null, 62);
        InteractionTrigger interactionTrigger2 = (InteractionTrigger) anonymousClass1.val$callback;
        if (interactionTrigger2 == null) {
        }
        if (duration == null) {
        }
        long m4172minusLRDsOJo2 = Duration.m4172minusLRDsOJo(finished.endFrameRenderedUptime, ((SentEvent) CollectionsKt.first((List) anonymousClass1.this$0)).uptime);
        long m4167getInWholeMillisecondsimpl7 = Duration.m4167getInWholeMillisecondsimpl(duration2 == null ? Duration.m4173plusLRDsOJo(duration2.rawValue, m4172minusLRDsOJo2) : m4172minusLRDsOJo2);
        long m4167getInWholeMillisecondsimpl22 = Duration.m4167getInWholeMillisecondsimpl(m4172minusLRDsOJo2);
        if (duration2 == null) {
        }
        long m4167getInWholeMillisecondsimpl42 = Duration.m4167getInWholeMillisecondsimpl(sentEvent.uptime);
        List list22 = (List) anonymousClass1.this$0;
        Moshi moshi2 = interactionScreenViewLogger3.moshi;
        list22.getClass();
        long j22 = ((SentEvent) CollectionsKt.first(list22)).uptime;
        List<SentEvent> list32 = list22;
        ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list32, 10));
        while (r1.hasNext()) {
        }
        InteractionScreenViewLogger interactionScreenViewLogger22 = interactionScreenViewLogger3;
        String json2 = moshi2.adapter(List.class, Util.NO_ANNOTATIONS, null).toJson(arrayList22);
        json2.getClass();
        if (screenPresentationStart == null) {
        }
        if (screenPresentationStart == null) {
        }
        long j42 = this.$jvmHeapBytes;
        long j52 = this.$nativeHeapBytes;
        String str2 = this.$description;
        InteractionInfo interactionInfo2 = new InteractionInfo(str2, new UserInteractionLatencyEvent(str2, m4167getInWholeMillisecondsimpl7, m4167getInWholeMillisecondsimpl22, m4167getInWholeMillisecondsimpl3, m4167getInWholeMillisecondsimpl42, json2, m4167getInWholeMillisecondsimpl5, m4167getInWholeMillisecondsimpl6, j42, j52), arrayList3, l);
        lastScreenView = interactionScreenViewLogger22.lastScreenInteraction;
        if (lastScreenView != null) {
            ViewTracking.viewEnded$default(viewTracking);
        }
        interactionScreenViewLogger22.lastScreenInteraction = null;
        InteractionEvent interactionEvent32 = sentEvent.event;
        prettyName = interactionEvent32.getScreen().prettyName();
        if (prettyName == null) {
        }
        interactionScreenViewLogger22.startTracking(prettyName, prettyName, interactionInfo2);
        interactionScreenViewLogger22.analytics.track(new PerformanceMeasureInteractionLatency(new Long(m4167getInWholeMillisecondsimpl7), prettyName, joinToString$default2), null);
        return Unit.INSTANCE;
    }
}
