package com.squareup.cash.observability.backend.real;

import androidx.compose.ui.draw.AlphaKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.Datadog;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumMonitor;
import com.squareup.cash.featureflags.FeatureFlagInterceptor;
import com.squareup.cash.observability.backend.api.Action;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.api.ViewTracking;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.franklin.common.FeatureFlagSource;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import io.opentelemetry.api.trace.Tracer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.channels.BufferedChannel;
import papa.PapaEvent;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealObservabilityManager implements FeatureFlagInterceptor {
    public final AndroidClock clock;
    public final RealDatadogClient datadogClient;
    public final CoroutineContext ioContext;
    public final BufferedChannel preInitializationQueue = PapaEvent.Channel$default(-2, null, null, 6);
    public final AtomicBoolean appFullyDisplayedReported = new AtomicBoolean(false);

    /* loaded from: classes6.dex */
    public final class ActionItem implements EnqueuedItem {
        public final Action action;

        public ActionItem(Action action) {
            action.getClass();
            this.action = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionItem) && Intrinsics.areEqual(this.action, ((ActionItem) obj).action);
        }

        public final Action getAction() {
            return this.action;
        }

        public final int hashCode() {
            return this.action.hashCode();
        }

        public final String toString() {
            return "ActionItem(action=" + this.action + ")";
        }
    }

    public final class AppFullyDisplayed implements EnqueuedItem {
        public static final AppFullyDisplayed INSTANCE = new AppFullyDisplayed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AppFullyDisplayed);
        }

        public final int hashCode() {
            return 1637770187;
        }

        public final String toString() {
            return "AppFullyDisplayed";
        }
    }

    public interface EnqueuedItem {
    }

    /* loaded from: classes4.dex */
    public final class ErrorItem implements EnqueuedItem {
        public final Map attributes;
        public final String message;
        public final Throwable throwable;

        public ErrorItem(String str, Throwable th, Map map) {
            str.getClass();
            map.getClass();
            this.message = str;
            this.throwable = th;
            this.attributes = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorItem)) {
                return false;
            }
            ErrorItem errorItem = (ErrorItem) obj;
            return Intrinsics.areEqual(this.message, errorItem.message) && Intrinsics.areEqual(this.throwable, errorItem.throwable) && Intrinsics.areEqual(this.attributes, errorItem.attributes);
        }

        public final Map getAttributes() {
            return this.attributes;
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            Throwable th = this.throwable;
            return this.attributes.hashCode() + ((hashCode + (th == null ? 0 : th.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ErrorItem(message=");
            sb.append(this.message);
            sb.append(", throwable=");
            sb.append(this.throwable);
            sb.append(", attributes=");
            return re$$ExternalSyntheticOutline0.m(")", sb, this.attributes);
        }
    }

    /* loaded from: classes4.dex */
    public final class EventItem implements EnqueuedItem {
        public final Map attributes;
        public final String eventName;

        public EventItem(String str, Map map) {
            str.getClass();
            map.getClass();
            this.eventName = str;
            this.attributes = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EventItem)) {
                return false;
            }
            EventItem eventItem = (EventItem) obj;
            return Intrinsics.areEqual(this.eventName, eventItem.eventName) && Intrinsics.areEqual(this.attributes, eventItem.attributes);
        }

        public final Map getAttributes() {
            return this.attributes;
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final int hashCode() {
            return this.attributes.hashCode() + (this.eventName.hashCode() * 31);
        }

        public final String toString() {
            return "EventItem(eventName=" + this.eventName + ", attributes=" + this.attributes + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class SpanEnded implements EnqueuedItem {
        public final long microTime;
        public final Map spanAttributes;
        public final SpanStarted spanStarted;

        public SpanEnded(RealObservabilityManager realObservabilityManager, SpanStarted spanStarted, Long l, Map map) {
            long max;
            map.getClass();
            this.spanStarted = spanStarted;
            this.spanAttributes = map;
            if (l != null) {
                max = l.longValue();
            } else {
                max = spanStarted.microTime + (Math.max(0L, realObservabilityManager.clock.m3790nanoTimeeFsXEgE() - spanStarted.nanoTicks) / 1000);
            }
            this.microTime = max;
        }

        public final long getMicroTime() {
            return this.microTime;
        }

        public final Map getSpanAttributes() {
            return this.spanAttributes;
        }

        public final SpanStarted getSpanStarted() {
            return this.spanStarted;
        }
    }

    public RealObservabilityManager(RealDatadogClient realDatadogClient, CoroutineContext coroutineContext, AndroidClock androidClock) {
        this.datadogClient = realDatadogClient;
        this.ioContext = coroutineContext;
        this.clock = androidClock;
    }

    public static SpanTracking startTrackingRootSpan$default(RealObservabilityManager realObservabilityManager, String str, Map map, int i) {
        if ((i & 4) != 0) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
        map.getClass();
        SpanStarted spanStarted = new SpanStarted(realObservabilityManager, str, map);
        realObservabilityManager.processOrEnqueue(spanStarted);
        return spanStarted;
    }

    public static SpanTracking startTrackingSpan$default(RealObservabilityManager realObservabilityManager, String str, String str2, Map map, Long l, int i) {
        if ((i & 4) != 0) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
        Map map2 = map;
        if ((i & 8) != 0) {
            l = null;
        }
        realObservabilityManager.getClass();
        str2.getClass();
        map2.getClass();
        return CardProduct.Companion.startTrackingSpan$real$default((Tracer) realObservabilityManager.datadogClient.tracer.invoke(), str2, str, null, map2, l, 64);
    }

    public static ViewTracking startTrackingView$default(RealObservabilityManager realObservabilityManager, String str) {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return realObservabilityManager.startTrackingView(str, null, emptyMap);
    }

    public final void addAction(Action action) {
        action.getClass();
        if (Datadog.isInitialized()) {
            ((RumMonitor) this.datadogClient.rumMonitor.invoke()).addAction(AlphaKt.toDatadogType(action.getType()), action.getName(), action.getAttributes());
            return;
        }
        Timber.Forest forest = Timber.Forest;
        forest.tag("DATADOG");
        forest.w("Datadog client not yet initialized when adding action, enqueuing: " + action, new Object[0]);
        this.preInitializationQueue.mo1159trySendJP2dKIU(new ActionItem(action));
    }

    public final void addCustomAttributeToRumMonitoring(List list) {
        list.getClass();
        this.datadogClient.addCustomAttributeToRumMonitoring(list);
    }

    public final void addTiming(String str) {
        if (Datadog.isInitialized()) {
            ((RumMonitor) this.datadogClient.rumMonitor.invoke()).addTiming(str);
        }
    }

    public final void addViewAttributes(Map map) {
        map.getClass();
        if (Datadog.isInitialized()) {
            ((RumMonitor) this.datadogClient.rumMonitor.invoke()).addViewAttributes(map);
        }
    }

    @Override // com.squareup.cash.featureflags.FeatureFlagInterceptor
    public final void intercept(String str, String str2, boolean z, boolean z2, FeatureFlagSource featureFlagSource) {
        str2.getClass();
        ((RumMonitor) this.datadogClient.rumMonitor.invoke()).addFeatureFlagEvaluation(str, str2);
    }

    public final void logEvent(String str, Map map) {
        str.getClass();
        map.getClass();
        if (Datadog.isInitialized()) {
            ((RumMonitor) this.datadogClient.rumMonitor.invoke()).addAction(RumActionType.CUSTOM, str, map);
            return;
        }
        Timber.Forest forest = Timber.Forest;
        forest.tag("DATADOG");
        forest.w("Datadog client not yet initialized when adding event, enqueuing: ".concat(str), new Object[0]);
        this.preInitializationQueue.mo1159trySendJP2dKIU(new EventItem(str, map));
    }

    public final void process(EnqueuedItem enqueuedItem) {
        if (enqueuedItem instanceof ErrorItem) {
            ErrorItem errorItem = (ErrorItem) enqueuedItem;
            reportError(errorItem.getMessage(), errorItem.getThrowable(), errorItem.getAttributes());
            return;
        }
        if (enqueuedItem instanceof EventItem) {
            EventItem eventItem = (EventItem) enqueuedItem;
            logEvent(eventItem.getEventName(), eventItem.getAttributes());
            return;
        }
        if (enqueuedItem instanceof ActionItem) {
            addAction(((ActionItem) enqueuedItem).getAction());
            return;
        }
        SpanTracking spanTracking = null;
        if (enqueuedItem instanceof SpanStarted) {
            SpanStarted spanStarted = (SpanStarted) enqueuedItem;
            if (spanStarted.getParent() != null) {
                SpanTracking spanTracking2 = spanStarted.getParent().getSpanTracking();
                if (spanTracking2 != null) {
                    spanTracking = spanTracking2.childSpanStarted(spanStarted.getSpanId(), spanStarted.getOperationName(), spanStarted.getAttributes(), Long.valueOf(spanStarted.getMicroTime()));
                }
            } else {
                String spanId = spanStarted.getSpanId();
                String operationName = spanStarted.getOperationName();
                Map attributes = spanStarted.getAttributes();
                Long valueOf = Long.valueOf(spanStarted.getMicroTime());
                operationName.getClass();
                attributes.getClass();
                spanTracking = CardProduct.Companion.startTrackingSpan$real$default((Tracer) this.datadogClient.tracer.invoke(), operationName, spanId, null, attributes, valueOf, 8);
            }
            spanStarted.setSpanTracking(spanTracking);
            return;
        }
        if (enqueuedItem instanceof SpanEnded) {
            SpanEnded spanEnded = (SpanEnded) enqueuedItem;
            SpanTracking spanTracking3 = spanEnded.getSpanStarted().getSpanTracking();
            if (spanTracking3 != null) {
                spanTracking3.spanEnded(Long.valueOf(spanEnded.getMicroTime()), spanEnded.getSpanAttributes());
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(enqueuedItem, AppFullyDisplayed.INSTANCE)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        } else if (this.appFullyDisplayedReported.compareAndSet(false, true)) {
            LinkedHashMap linkedHashMap = GlobalRumMonitor.registeredMonitors;
            GlobalRumMonitor.get(Datadog.getInstance(null)).reportAppFullyDisplayed();
        }
    }

    public final void processOrEnqueue(EnqueuedItem enqueuedItem) {
        if (Datadog.isInitialized()) {
            process(enqueuedItem);
        } else {
            this.preInitializationQueue.mo1159trySendJP2dKIU(enqueuedItem);
        }
    }

    public final void reportError(String str, Throwable th, Map map) {
        str.getClass();
        map.getClass();
        if (Datadog.isInitialized()) {
            if (Datadog.isInitialized()) {
                ((RumMonitor) this.datadogClient.rumMonitor.invoke()).addError(str, 4, th, map);
            }
        } else {
            Timber.Forest forest = Timber.Forest;
            forest.tag("DATADOG");
            forest.w("Datadog client not yet initialized when reporting error, enqueuing: ".concat(str), new Object[0]);
            this.preInitializationQueue.mo1159trySendJP2dKIU(new ErrorItem(str, th, map));
        }
    }

    public final void startResource(String str, String str2, Map map) {
        str.getClass();
        map.getClass();
        ((RumMonitor) this.datadogClient.rumMonitor.invoke()).startResource(str, str2, map);
    }

    public final ViewTracking startTrackingView(String str, String str2, Map map) {
        map.getClass();
        if (!Datadog.isInitialized()) {
            return null;
        }
        Provider provider = this.datadogClient.rumMonitor;
        RumMonitor rumMonitor = (RumMonitor) provider.invoke();
        if (str2 == null) {
            str2 = str;
        }
        rumMonitor.startView(str2, str, map);
        return new RealDatadogViewTracking(str, (RumMonitor) provider.invoke());
    }

    public final void stopMonitoring() {
        if (Datadog.isInitialized()) {
            String name = Datadog.getInstance(null).getName();
            WorkLauncherImpl workLauncherImpl = Datadog.registry;
            synchronized (workLauncherImpl) {
                if (name == null) {
                    name = "_dd.sdk_core.default";
                }
                try {
                    InternalSdkCore internalSdkCore = (InternalSdkCore) ((LinkedHashMap) workLauncherImpl.workTaskExecutor).remove(name);
                    DatadogCore datadogCore = internalSdkCore instanceof DatadogCore ? (DatadogCore) internalSdkCore : null;
                    if (datadogCore != null) {
                        datadogCore.stop$dd_sdk_android_core_release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Timber.Forest forest = Timber.Forest;
            forest.tag("DATADOG");
            forest.i("Datadog stopped: " + Datadog.isInitialized(), new Object[0]);
        }
    }

    public final void stopResource(Integer num, String str) {
        str.getClass();
        RumMonitor rumMonitor = (RumMonitor) this.datadogClient.rumMonitor.invoke();
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        rumMonitor.stopResource(str, num, emptyMap);
    }

    /* loaded from: classes6.dex */
    public final class SpanStarted implements EnqueuedItem, SpanTracking {
        public final Map attributes;
        public final long microTime;
        public final long nanoTicks;
        public final String operationName;
        public final SpanStarted parent;
        public final String spanId;
        public SpanTracking spanTracking;
        public final /* synthetic */ RealObservabilityManager this$0;

        public SpanStarted(RealObservabilityManager realObservabilityManager, SpanStarted spanStarted, String str, String str2, Map map, Long l) {
            long m4176toLongimpl;
            str2.getClass();
            map.getClass();
            this.this$0 = realObservabilityManager;
            this.parent = spanStarted;
            this.operationName = str2;
            this.attributes = map;
            this.spanId = str == null ? Boxes$$ExternalSyntheticOutline1.m() : str;
            long m3790nanoTimeeFsXEgE = realObservabilityManager.clock.m3790nanoTimeeFsXEgE();
            this.nanoTicks = m3790nanoTimeeFsXEgE;
            if (l != null) {
                m4176toLongimpl = l.longValue();
            } else {
                Long valueOf = spanStarted != null ? Long.valueOf((Math.max(0L, m3790nanoTimeeFsXEgE - spanStarted.nanoTicks) / 1000) + spanStarted.microTime) : null;
                if (valueOf != null) {
                    m4176toLongimpl = valueOf.longValue();
                } else {
                    Duration.Companion companion = Duration.Companion;
                    m4176toLongimpl = Duration.m4176toLongimpl(DurationKt.toDuration(realObservabilityManager.clock.millis(), DurationUnit.MILLISECONDS), DurationUnit.MICROSECONDS);
                }
            }
            this.microTime = m4176toLongimpl;
        }

        @Override // com.squareup.cash.observability.backend.api.SpanTracking
        public final SpanTracking childSpanStarted(String str, String str2, Map map, Long l) {
            str2.getClass();
            map.getClass();
            SpanStarted spanStarted = new SpanStarted(this.this$0, this, str, str2, map, l);
            this.this$0.processOrEnqueue(spanStarted);
            return spanStarted;
        }

        public final Map getAttributes() {
            return this.attributes;
        }

        public final long getMicroTime() {
            return this.microTime;
        }

        public final String getOperationName() {
            return this.operationName;
        }

        public final SpanStarted getParent() {
            return this.parent;
        }

        public final String getSpanId() {
            return this.spanId;
        }

        public final SpanTracking getSpanTracking() {
            return this.spanTracking;
        }

        public final void setSpanTracking(SpanTracking spanTracking) {
            this.spanTracking = spanTracking;
        }

        @Override // com.squareup.cash.observability.backend.api.SpanTracking
        public final void spanEnded(Long l, Map map) {
            map.getClass();
            RealObservabilityManager realObservabilityManager = this.this$0;
            realObservabilityManager.processOrEnqueue(new SpanEnded(realObservabilityManager, this, l, map));
        }

        public /* synthetic */ SpanStarted(RealObservabilityManager realObservabilityManager, String str, Map map) {
            this(realObservabilityManager, null, null, str, map, null);
        }
    }
}
