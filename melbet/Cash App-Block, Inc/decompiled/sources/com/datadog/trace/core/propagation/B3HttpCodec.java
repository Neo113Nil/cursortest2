package com.datadog.trace.core.propagation;

import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import com.datadog.trace.api.DD128bTraceId;
import com.datadog.trace.api.DDTraceId;
import com.datadog.trace.api.TracePropagationStyle;
import com.datadog.trace.api.internal.util.LongStringUtils;
import com.datadog.trace.core.DDSpanContext;
import com.datadog.trace.core.propagation.HttpCodec;
import java.util.TreeMap;
import okhttp3.Request;

/* loaded from: classes4.dex */
public abstract class B3HttpCodec {
    public static final String SAMPLING_PRIORITY_ACCEPT = String.valueOf(1);
    public static final String SAMPLING_PRIORITY_DROP = String.valueOf(0);

    public abstract class B3BaseContextInterpreter extends ContextInterpreter {
        public final void setSpanId(String str) {
            this.spanId = LongStringUtils.parseUnsignedLongHex(str);
            if (this.tags.isEmpty()) {
                this.tags = new TreeMap();
            }
            this.tags.put("b3.spanid", str);
        }

        public final boolean setTraceId(String str) {
            if (str.length() > 32) {
                String str2 = B3HttpCodec.SAMPLING_PRIORITY_ACCEPT;
                this.traceId = DDTraceId.ZERO;
                return false;
            }
            int i = DD128bTraceId.$r8$clinit;
            DD128bTraceId fromHex = DD128bTraceId.fromHex(0, str.length(), str);
            DDTraceId b3TraceId = new B3TraceId(str, fromHex);
            if (fromHex.lowOrderBits == 0) {
                b3TraceId = DDTraceId.ZERO;
            }
            this.traceId = b3TraceId;
            if (this.tags.isEmpty()) {
                this.tags = new TreeMap();
            }
            this.tags.put("b3.traceid", str);
            return true;
        }
    }

    public final class B3MultiContextInterpreter extends B3BaseContextInterpreter {
        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation$KeyClassifier
        public final boolean accept(String str, String str2) {
            if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
                return true;
            }
            if (ContextInterpreter.LOG_EXTRACT_HEADER_NAMES) {
                String str3 = B3HttpCodec.SAMPLING_PRIORITY_ACCEPT;
            }
            try {
                char lowerCase = Character.toLowerCase(str.charAt(0));
                if (lowerCase != 'f') {
                    if (lowerCase != 'u') {
                        if (lowerCase == 'x') {
                            if ("X-B3-TraceId".equalsIgnoreCase(str)) {
                                setTraceId(HttpCodec.firstHeaderValue(str2));
                                return true;
                            }
                            if ("X-B3-SpanId".equalsIgnoreCase(str)) {
                                setSpanId(HttpCodec.firstHeaderValue(str2));
                                return true;
                            }
                            if ("X-B3-Sampled".equalsIgnoreCase(str)) {
                                this.samplingPriority = "1".equals(HttpCodec.firstHeaderValue(str2)) ? 1 : 0;
                                return true;
                            }
                            if (handledXForwarding(str, str2)) {
                                return true;
                            }
                        }
                    } else if (handledUserAgent(str, str2)) {
                        return true;
                    }
                } else if (handledForwarding(str, str2)) {
                    return true;
                }
                if (handledIpHeaders(str, str2)) {
                    return true;
                }
                handleTags(str, str2);
                return true;
            } catch (RuntimeException unused) {
                this.valid = false;
                String str4 = B3HttpCodec.SAMPLING_PRIORITY_ACCEPT;
                return false;
            }
        }

        @Override // com.datadog.trace.core.propagation.ContextInterpreter
        public final TracePropagationStyle style() {
            return TracePropagationStyle.B3MULTI;
        }
    }

    public final class B3MultiInjector implements HttpCodec.Injector {
        public final /* synthetic */ int $r8$classId;
        public final boolean paddingEnabled;

        public B3MultiInjector(boolean z, int i) {
            this.$r8$classId = i;
            this.paddingEnabled = z;
        }

        public final String getInjectedTraceId(DDSpanContext dDSpanContext) {
            DDTraceId dDTraceId = dDSpanContext.traceId;
            return (this.paddingEnabled || (dDTraceId instanceof DD128bTraceId)) ? dDTraceId.toHexString() : dDTraceId instanceof B3TraceId ? ((B3TraceId) dDTraceId).original : Long.toHexString(dDTraceId.toLong());
        }

        @Override // com.datadog.trace.core.propagation.HttpCodec.Injector
        public final void inject(DDSpanContext dDSpanContext, Request.Builder builder, ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2) {
            switch (this.$r8$classId) {
                case 0:
                    String injectedTraceId = getInjectedTraceId(dDSpanContext);
                    long j = dDSpanContext.spanId;
                    String hexStringPadded = this.paddingEnabled ? LongStringUtils.toHexStringPadded(16, j) : Long.toHexString(j);
                    exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "X-B3-TraceId", injectedTraceId);
                    exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "X-B3-SpanId", hexStringPadded);
                    if (dDSpanContext.lockSamplingPriority()) {
                        exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "X-B3-Sampled", dDSpanContext.getRootSpanContextOrThis().samplingPriority > 0 ? B3HttpCodec.SAMPLING_PRIORITY_ACCEPT : B3HttpCodec.SAMPLING_PRIORITY_DROP);
                    }
                    String str = B3HttpCodec.SAMPLING_PRIORITY_ACCEPT;
                    break;
                default:
                    String injectedTraceId2 = getInjectedTraceId(dDSpanContext);
                    long j2 = dDSpanContext.spanId;
                    String hexStringPadded2 = this.paddingEnabled ? LongStringUtils.toHexStringPadded(16, j2) : Long.toHexString(j2);
                    StringBuilder sb = new StringBuilder(100);
                    sb.append(injectedTraceId2);
                    sb.append('-');
                    sb.append(hexStringPadded2);
                    if (dDSpanContext.lockSamplingPriority()) {
                        String str2 = dDSpanContext.getRootSpanContextOrThis().samplingPriority > 0 ? B3HttpCodec.SAMPLING_PRIORITY_ACCEPT : B3HttpCodec.SAMPLING_PRIORITY_DROP;
                        sb.append('-');
                        sb.append(str2);
                    }
                    exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "b3", sb.toString());
                    String str3 = B3HttpCodec.SAMPLING_PRIORITY_ACCEPT;
                    break;
            }
        }
    }

    public final class B3SingleContextInterpreter extends B3BaseContextInterpreter {
        /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[Catch: RuntimeException -> 0x005f, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x005f, blocks: (B:5:0x0004, B:8:0x000c, B:11:0x0013, B:13:0x0017, B:14:0x0019, B:16:0x0021, B:19:0x002a, B:26:0x0054, B:29:0x005b, B:31:0x003f, B:34:0x0046, B:37:0x004d), top: B:4:0x0004 }] */
        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation$KeyClassifier
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean accept(String str, String str2) {
            if (str != null) {
                try {
                    if (!str.isEmpty() && str2 != null && !str2.isEmpty()) {
                        if (ContextInterpreter.LOG_EXTRACT_HEADER_NAMES) {
                            String str3 = B3HttpCodec.SAMPLING_PRIORITY_ACCEPT;
                        }
                        if ("b3".equals(str)) {
                            return extractB3(HttpCodec.firstHeaderValue(str2));
                        }
                        char lowerCase = Character.toLowerCase(str.charAt(0));
                        if (lowerCase == 'f') {
                            if (handledForwarding(str, str2)) {
                            }
                            if (!handledIpHeaders(str, str2)) {
                            }
                        } else if (lowerCase != 'u') {
                            if (lowerCase == 'x' && handledXForwarding(str, str2)) {
                            }
                            if (!handledIpHeaders(str, str2)) {
                                handleTags(str, str2);
                                return true;
                            }
                        } else {
                            if (handledUserAgent(str, str2)) {
                            }
                            if (!handledIpHeaders(str, str2)) {
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                    this.valid = false;
                    String str4 = B3HttpCodec.SAMPLING_PRIORITY_ACCEPT;
                    return false;
                }
            }
            return true;
        }

        public final boolean extractB3(String str) {
            if (str.length() == 1) {
                this.samplingPriority = "1".equals(str) ? 1 : 0;
            } else {
                int indexOf = str.indexOf("-");
                int i = indexOf + 1;
                int indexOf2 = str.indexOf("-", i);
                if (indexOf != -1 && !setTraceId(str.substring(0, indexOf))) {
                    return false;
                }
                if (indexOf2 == -1) {
                    setSpanId(str.substring(i));
                } else {
                    setSpanId(str.substring(i, indexOf2));
                    this.samplingPriority = "1".equals(str.substring(indexOf2 + 1)) ? 1 : 0;
                }
            }
            return true;
        }

        @Override // com.datadog.trace.core.propagation.ContextInterpreter
        public final TracePropagationStyle style() {
            return TracePropagationStyle.B3SINGLE;
        }
    }
}
