package ru.yandex.video.m3.telemetry.datasource.impl;

import android.util.Log;
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
import ru.yandex.video.m3.data.dto.JsonConverterImpl;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultErrorCategoryProvider;
import ru.yandex.video.m3.player.impl.tracking.data.ErrorCategoryProvider;
import ru.yandex.video.m3.player.impl.tracking.event.ErrorPlayerData;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.StateBasedEventData;
import ru.yandex.video.m3.player.tracking.LoadError;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.telemetry.datasource.impl.StandaloneTelemetryReporter$onLoadError$1", f = "StandaloneTelemetryReporter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class StandaloneTelemetryReporter$onLoadError$1 extends SuspendLambda implements wls {
    final /* synthetic */ LoadError $loadError;
    int label;
    final /* synthetic */ StandaloneTelemetryReporter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandaloneTelemetryReporter$onLoadError$1(LoadError loadError, StandaloneTelemetryReporter standaloneTelemetryReporter, Continuation<? super StandaloneTelemetryReporter$onLoadError$1> continuation) {
        super(2, continuation);
        this.$loadError = loadError;
        this.this$0 = standaloneTelemetryReporter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new StandaloneTelemetryReporter$onLoadError$1(this.$loadError, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((StandaloneTelemetryReporter$onLoadError$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r15 == null) goto L10;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        StateBasedEventData createUnknownDataForEvent;
        EventDefault createDefaultEvent;
        ErrorCategoryProvider errorCategoryProvider;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Throwable throwable = this.$loadError.getThrowable();
        if (throwable != null) {
            errorCategoryProvider = this.this$0.errorCategoryProvider;
            str = errorCategoryProvider.getCategory(throwable);
        }
        str = DefaultErrorCategoryProvider.NETWORK_MEDIA;
        String str2 = str;
        StandaloneTelemetryReporter standaloneTelemetryReporter = this.this$0;
        String str3 = this.$loadError.getUri().toString();
        Event event = Event.LOAD_ERROR;
        String eventName = event.getEventName();
        EventType eventType = EventType.ERROR;
        String exceptionMessage = this.$loadError.getExceptionMessage();
        if (exceptionMessage == null) {
            exceptionMessage = "";
        }
        String eventName2 = event.getEventName();
        Throwable throwable2 = this.$loadError.getThrowable();
        String stackTraceString = throwable2 != null ? Log.getStackTraceString(throwable2) : null;
        String str4 = stackTraceString == null ? "" : stackTraceString;
        createUnknownDataForEvent = this.this$0.createUnknownDataForEvent();
        createDefaultEvent = standaloneTelemetryReporter.createDefaultEvent(str3, eventName, eventType, new ErrorPlayerData(exceptionMessage, eventName2, false, str4, null, null, str2, createUnknownDataForEvent, JsonConverterImpl.INSTANCE.to(this.$loadError)));
        this.this$0.trackEvent(createDefaultEvent);
        return zy11.a;
    }
}
