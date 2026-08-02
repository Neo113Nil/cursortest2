package com.datadog.trace.core;

import androidx.media3.extractor.mkv.Sniffer;
import com.datadog.trace.api.DDTraceId;
import com.datadog.trace.api.Functions;
import com.datadog.trace.bootstrap.instrumentation.api.AgentSpan$Context;
import com.datadog.trace.bootstrap.instrumentation.api.AgentTrace;
import com.datadog.trace.bootstrap.instrumentation.api.TagContext;
import com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString;
import com.datadog.trace.core.CoreTracer;
import com.datadog.trace.core.propagation.PropagationTags$HeaderType;
import com.datadog.trace.core.propagation.ptags.PTagsFactory$PTags;
import com.datadog.trace.core.propagation.ptags.TagValue;
import com.datadog.trace.core.taginterceptor.TagInterceptor;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public final class DDSpanContext implements AgentSpan$Context, Closeable {
    public volatile Map baggageItems;
    public final Object ciVisibilityContextData;
    public final boolean disableSamplingMechanismValidation;
    public volatile boolean errorFlag;
    public volatile byte errorFlagPriority;
    public volatile short httpStatusCode;
    public volatile boolean measured;
    public volatile CharSequence operationName;
    public volatile CharSequence origin;
    public final long parentId;
    public final String parentServiceName;
    public volatile TagContext.HttpHeaders pathwayContext;
    public final TagContext.HttpHeaders profilingContextIntegration;
    public final PTagsFactory$PTags propagationTags;
    public final Object requestContextDataAppSec;
    public final Object requestContextDataIast;
    public volatile CharSequence resourceName;
    public volatile byte resourceNamePriority;
    public volatile int samplingPriority;
    public volatile String serviceName;
    public final long spanId;
    public final long threadId;
    public final UTF8BytesString threadName;
    public final PendingTrace trace;
    public final DDTraceId traceId;
    public final HashMap unsafeTags;
    public static final Sniffer THREAD_NAMES = new Sniffer(256, 11);
    public static final Map EMPTY_BAGGAGE = Collections.EMPTY_MAP;
    public static final AtomicIntegerFieldUpdater SAMPLING_PRIORITY_UPDATER = AtomicIntegerFieldUpdater.newUpdater(DDSpanContext.class, "samplingPriority");

    public DDSpanContext(DDTraceId dDTraceId, long j, long j2, String str, String str2, CharSequence charSequence, CharSequence charSequence2, int i, CharSequence charSequence3, Map map, int i2, PendingTrace pendingTrace, Object obj, Object obj2, Object obj3, boolean z, PTagsFactory$PTags pTagsFactory$PTags, TagContext.HttpHeaders httpHeaders) {
        TagContext.HttpHeaders httpHeaders2 = TagContext.HttpHeaders.INSTANCE$1;
        this.resourceNamePriority = (byte) 0;
        this.errorFlagPriority = Byte.MIN_VALUE;
        this.samplingPriority = -128;
        this.trace = pendingTrace;
        this.traceId = dDTraceId;
        this.spanId = j;
        this.parentId = j2;
        this.parentServiceName = String.valueOf(str);
        if (map == null || map.isEmpty()) {
            this.baggageItems = EMPTY_BAGGAGE;
        } else {
            this.baggageItems = new ConcurrentHashMap(map);
        }
        this.requestContextDataAppSec = obj;
        this.requestContextDataIast = obj2;
        this.ciVisibilityContextData = obj3;
        this.pathwayContext = httpHeaders2;
        this.unsafeTags = new HashMap(Math.max(((i2 <= 0 ? 3 : i2 + 1) * 4) / 3, 8));
        this.profilingContextIntegration = httpHeaders;
        httpHeaders.getClass();
        setServiceName(str2);
        this.operationName = charSequence;
        setResourceName(charSequence2, (byte) 0);
        this.errorFlag = false;
        Thread currentThread = Thread.currentThread();
        this.threadId = currentThread.getId();
        this.threadName = (UTF8BytesString) THREAD_NAMES.computeIfAbsent(currentThread.getName(), Functions.UTF8_ENCODE);
        this.disableSamplingMechanismValidation = z;
        PTagsFactory$PTags createValid = pTagsFactory$PTags != null ? pTagsFactory$PTags : pendingTrace.tracer.propagationTagsFactory.createValid(null, null, null);
        this.propagationTags = createValid;
        createValid.updateTraceIdHighOrderBits(dDTraceId.toHighOrderLong());
        if (charSequence3 != null) {
            setOrigin(charSequence3);
        }
        if (i != -128) {
            setSamplingPriority(i, -1);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object obj = this.requestContextDataAppSec;
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException | RuntimeException e) {
                e = e;
            }
        }
        e = null;
        Object obj2 = this.requestContextDataIast;
        if (obj2 instanceof Closeable) {
            try {
                ((Closeable) obj2).close();
            } catch (IOException | RuntimeException e2) {
                e = e2;
            }
        }
        if (e != null) {
            if (!(e instanceof RuntimeException)) {
                throw ((IOException) e);
            }
            throw ((RuntimeException) e);
        }
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan$Context
    public final TagContext.HttpHeaders getPathwayContext() {
        return this.pathwayContext;
    }

    public final CharSequence getResourceName() {
        return (this.resourceName == null || this.resourceName.length() == 0) ? this.operationName : this.resourceName;
    }

    public final DDSpanContext getRootSpanContextOrThis() {
        DDSpanContext dDSpanContext;
        DDSpan dDSpan;
        PendingTrace pendingTrace = this.trace;
        if (pendingTrace == null || (dDSpan = pendingTrace.rootSpan) == null || (dDSpanContext = dDSpan.context) == this) {
            dDSpanContext = null;
        }
        return dDSpanContext != null ? dDSpanContext : this;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan$Context
    public final long getSpanId() {
        return this.spanId;
    }

    public final Map getTags() {
        Map unmodifiableMap;
        synchronized (this.unsafeTags) {
            try {
                HashMap hashMap = new HashMap(this.unsafeTags);
                hashMap.put("thread.id", Long.valueOf(this.threadId));
                hashMap.put("thread.name", this.threadName.f977string);
                if (this.samplingPriority != -128) {
                    hashMap.put("_sample_rate", Integer.valueOf(this.samplingPriority));
                }
                if (this.httpStatusCode != 0) {
                    hashMap.put("http.status_code", Integer.valueOf(this.httpStatusCode));
                }
                Object obj = hashMap.get("http.url");
                if (obj != null) {
                    hashMap.put("http.url", obj.toString());
                }
                unmodifiableMap = Collections.unmodifiableMap(hashMap);
            } catch (Throwable th) {
                throw th;
            }
        }
        return unmodifiableMap;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan$Context
    public final AgentTrace getTrace() {
        return this.trace;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan$Context
    public final DDTraceId getTraceId() {
        return this.traceId;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan$Context
    public final int getTraceSamplingPriority() {
        return getRootSpanContextOrThis().samplingPriority;
    }

    public final boolean lockSamplingPriority() {
        DDSpanContext dDSpanContext;
        DDSpan dDSpan = this.trace.rootSpan;
        return (dDSpan == null || (dDSpanContext = dDSpan.context) == this) ? SAMPLING_PRIORITY_UPDATER.get(this) != -128 : dDSpanContext.lockSamplingPriority();
    }

    public final void setAllTags(Map map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        TagInterceptor tagInterceptor = this.trace.tracer.tagInterceptor;
        synchronized (this.unsafeTags) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    if (!tagInterceptor.interceptTag(this, (String) entry.getKey(), entry.getValue())) {
                        this.unsafeTags.put((String) entry.getKey(), entry.getValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setMetric(String str, Number number) {
        synchronized (this.unsafeTags) {
            this.unsafeTags.put(str.toString(), number);
        }
    }

    public final void setOrigin(CharSequence charSequence) {
        DDSpanContext rootSpanContextOrThis = getRootSpanContextOrThis();
        rootSpanContextOrThis.origin = charSequence;
        PTagsFactory$PTags pTagsFactory$PTags = rootSpanContextOrThis.propagationTags;
        if (Objects.equals(pTagsFactory$PTags.origin, charSequence)) {
            return;
        }
        pTagsFactory$PTags.clearCachedHeader(PropagationTags$HeaderType.W3C);
        pTagsFactory$PTags.origin = TagValue.from(charSequence);
    }

    public final void setResourceName(CharSequence charSequence, byte b) {
        if (charSequence != null && b >= this.resourceNamePriority) {
            this.resourceNamePriority = b;
            this.resourceName = charSequence;
            this.profilingContextIntegration.getClass();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        if (r5 != 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r5 != 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0020, code lost:
    
        if (r5 == 2) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean setSamplingPriority(int i, int i2) {
        DDSpanContext rootSpanContextOrThis = getRootSpanContextOrThis();
        if (i == -128) {
            return false;
        }
        if (i2 != -128) {
            if (i2 != 10) {
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                        if (i != 0) {
                        }
                        if (SAMPLING_PRIORITY_UPDATER.compareAndSet(rootSpanContextOrThis, -128, i)) {
                            return false;
                        }
                        rootSpanContextOrThis.propagationTags.updateTraceSamplingPriority(i, i2);
                        return true;
                    case 3:
                    case 4:
                    case 6:
                        if (i != -1) {
                        }
                        if (SAMPLING_PRIORITY_UPDATER.compareAndSet(rootSpanContextOrThis, -128, i)) {
                        }
                        break;
                    case 5:
                        break;
                    default:
                        if (SAMPLING_PRIORITY_UPDATER.compareAndSet(rootSpanContextOrThis, -128, i)) {
                        }
                        break;
                }
            }
        }
        if (!rootSpanContextOrThis.disableSamplingMechanismValidation) {
            return false;
        }
        if (SAMPLING_PRIORITY_UPDATER.compareAndSet(rootSpanContextOrThis, -128, i)) {
        }
    }

    public final void setServiceName(String str) {
        CoreTracer.ConfigSnapshot configSnapshot = this.trace.traceConfig;
        if (configSnapshot.serviceMapping.containsKey(str)) {
            str = (String) configSnapshot.serviceMapping.get(str);
        }
        this.serviceName = str;
        String str2 = this.parentServiceName;
        String str3 = this.serviceName;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        str2.equals(str3);
    }

    public final void setTag(Object obj, String str) {
        if (obj == null) {
            synchronized (this.unsafeTags) {
                this.unsafeTags.remove(str);
            }
        } else {
            if (this.trace.tracer.tagInterceptor.interceptTag(this, str, obj)) {
                return;
            }
            synchronized (this.unsafeTags) {
                this.unsafeTags.put(str, obj);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DDSpan [ t_id=");
        sb.append(this.traceId);
        sb.append(", s_id=");
        sb.append(this.spanId);
        sb.append(", p_id=");
        sb.append(this.parentId);
        sb.append(" ] trace=");
        sb.append(this.serviceName);
        sb.append("/");
        sb.append(this.operationName);
        sb.append("/");
        sb.append(getResourceName());
        if (this.errorFlag) {
            sb.append(" *errored*");
        }
        if (this.measured) {
            sb.append(" *measured*");
        }
        synchronized (this.unsafeTags) {
            sb.append(" tags=");
            sb.append(new TreeMap(getTags()));
        }
        return sb.toString();
    }
}
