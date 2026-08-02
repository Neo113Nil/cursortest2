package ru.yandex.video.m3.player.impl.tracking;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.ab.config.AbConfig;
import ru.yandex.video.m3.playback.features.VideoCodecInfo;
import ru.yandex.video.m3.player.impl.tracking.EventTrackerImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.impl.tracking.EventTrackerImpl$onCreatePlayer$2", f = "EventTrackerImpl.kt", l = {122}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EventTrackerImpl$onCreatePlayer$2 extends SuspendLambda implements wls {
    final /* synthetic */ AbConfig $abConfig;
    final /* synthetic */ EventTrackerImpl.EventOrderAnalyticsHelper $analyticsHelper;
    final /* synthetic */ Ref$ObjectRef<Map<String, List<VideoCodecInfo>>> $codecInfo;
    final /* synthetic */ EventTrackerImpl.EventContext $eventContext;
    Object L$0;
    int label;
    final /* synthetic */ EventTrackerImpl this$0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltse;", "", "", "", "Lru/yandex/video/m3/playback/features/VideoCodecInfo;", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "ru.yandex.video.m3.player.impl.tracking.EventTrackerImpl$onCreatePlayer$2$1", f = "EventTrackerImpl.kt", l = {HProv.PP_DELETE_KEYSET}, m = "invokeSuspend")
    /* renamed from: ru.yandex.video.m3.player.impl.tracking.EventTrackerImpl$onCreatePlayer$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ EventTrackerImpl this$0;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltse;", "", "", "", "Lru/yandex/video/m3/playback/features/VideoCodecInfo;", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {1, 8, 0})
        @mvg(c = "ru.yandex.video.m3.player.impl.tracking.EventTrackerImpl$onCreatePlayer$2$1$1", f = "EventTrackerImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ru.yandex.video.m3.player.impl.tracking.EventTrackerImpl$onCreatePlayer$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01261 extends SuspendLambda implements wls {
            int label;
            final /* synthetic */ EventTrackerImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01261(EventTrackerImpl eventTrackerImpl, Continuation<? super C01261> continuation) {
                super(2, continuation);
                this.this$0 = eventTrackerImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
                return new C01261(this.this$0, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(tse tseVar, Continuation<? super Map<String, ? extends List<VideoCodecInfo>>> continuation) {
                return ((C01261) create(tseVar, continuation)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Map videoCodecsForLog;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                videoCodecsForLog = this.this$0.getVideoCodecsForLog();
                return videoCodecsForLog;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EventTrackerImpl eventTrackerImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = eventTrackerImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(tse tseVar, Continuation<? super Map<String, ? extends List<VideoCodecInfo>>> continuation) {
            return ((AnonymousClass1) create(tseVar, continuation)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            tse tseVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            tseVar = this.this$0.coroutineScope;
            qoh h = tje.h(tseVar, null, null, new C01261(this.this$0, null), 3);
            this.label = 1;
            Object s = h.s(this);
            return s == coroutineSingletons ? coroutineSingletons : s;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventTrackerImpl$onCreatePlayer$2(Ref$ObjectRef<Map<String, List<VideoCodecInfo>>> ref$ObjectRef, EventTrackerImpl eventTrackerImpl, EventTrackerImpl.EventContext eventContext, EventTrackerImpl.EventOrderAnalyticsHelper eventOrderAnalyticsHelper, AbConfig abConfig, Continuation<? super EventTrackerImpl$onCreatePlayer$2> continuation) {
        super(2, continuation);
        this.$codecInfo = ref$ObjectRef;
        this.this$0 = eventTrackerImpl;
        this.$eventContext = eventContext;
        this.$analyticsHelper = eventOrderAnalyticsHelper;
        this.$abConfig = abConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new EventTrackerImpl$onCreatePlayer$2(this.$codecInfo, this.this$0, this.$eventContext, this.$analyticsHelper, this.$abConfig, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((EventTrackerImpl$onCreatePlayer$2) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef<Map<String, List<VideoCodecInfo>>> ref$ObjectRef;
        T t;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Ref$ObjectRef<Map<String, List<VideoCodecInfo>>> ref$ObjectRef2 = this.$codecInfo;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.L$0 = ref$ObjectRef2;
            this.label = 1;
            Object w = a.w(1000L, anonymousClass1, this);
            if (w == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$ObjectRef = ref$ObjectRef2;
            t = w;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$0;
            b.b(obj);
            t = obj;
        }
        ref$ObjectRef.element = t;
        this.this$0.onCreatePlayerInternal(this.$eventContext, this.$codecInfo.element, this.$analyticsHelper, this.$abConfig);
        return zy11.a;
    }
}
