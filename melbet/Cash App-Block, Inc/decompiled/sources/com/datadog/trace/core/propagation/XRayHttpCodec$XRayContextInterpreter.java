package com.datadog.trace.core.propagation;

import com.datadog.trace.api.DD64bTraceId;
import com.datadog.trace.api.DDTraceId;
import com.datadog.trace.api.TracePropagationStyle;
import com.datadog.trace.api.internal.util.LongStringUtils;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class XRayHttpCodec$XRayContextInterpreter extends ContextInterpreter {
    public static void handleXRayTraceHeader(ContextInterpreter contextInterpreter, String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf("Root=1-")) < 0 || !str.regionMatches(indexOf + 15, "-00000000", 0, 9)) {
            return;
        }
        int length = str.length();
        int i = 0;
        while (i < length) {
            int indexOf2 = str.indexOf(59, i);
            if (indexOf2 < 0) {
                indexOf2 = length;
            }
            String trim = str.substring(i, indexOf2).trim();
            if (trim.startsWith("Root=1-")) {
                DDTraceId dDTraceId = contextInterpreter.traceId;
                if (dDTraceId == null || dDTraceId == DDTraceId.ZERO) {
                    String substring = trim.substring(24);
                    DD64bTraceId dD64bTraceId = DD64bTraceId.MAX;
                    contextInterpreter.traceId = DD64bTraceId.create(LongStringUtils.parseUnsignedLongHex(substring), null);
                }
            } else {
                long j = 0;
                if (trim.startsWith("Parent=")) {
                    if (contextInterpreter.spanId == 0) {
                        contextInterpreter.spanId = LongStringUtils.parseUnsignedLongHex(trim.substring(7));
                    }
                } else if (trim.startsWith("Sampled=")) {
                    if (contextInterpreter.samplingPriority == -128) {
                        contextInterpreter.samplingPriority = '1' == trim.charAt(8) ? 1 : 0;
                    }
                } else if (!trim.startsWith("Self=")) {
                    if (trim.startsWith("_dd.origin=")) {
                        contextInterpreter.origin = trim.substring(11);
                    } else if (trim.startsWith("t0=")) {
                        try {
                            j = TimeUnit.MILLISECONDS.toNanos(Long.parseLong(trim.substring(3)));
                        } catch (RuntimeException unused) {
                        }
                        contextInterpreter.endToEndStartTime = j;
                    } else {
                        int indexOf3 = trim.indexOf(61);
                        if (indexOf3 > 0) {
                            String substring2 = trim.substring(0, indexOf3);
                            String substring3 = trim.substring(indexOf3 + 1);
                            if (contextInterpreter.baggage.isEmpty()) {
                                contextInterpreter.baggage = new TreeMap();
                            }
                            contextInterpreter.baggage.put(substring2, HttpCodec.decode(substring3));
                        }
                    }
                }
            }
            i = indexOf2 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[Catch: RuntimeException -> 0x007f, TryCatch #0 {RuntimeException -> 0x007f, blocks: (B:7:0x000c, B:14:0x0042, B:17:0x0049, B:19:0x0054, B:21:0x0062, B:23:0x006e, B:24:0x0075, B:27:0x0021, B:29:0x0029, B:31:0x002d, B:34:0x0034, B:37:0x003b), top: B:6:0x000c }] */
    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation$KeyClassifier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean accept(String str, String str2) {
        String str3;
        if (str != null && !str.isEmpty()) {
            try {
                char lowerCase = Character.toLowerCase(str.charAt(0));
                if (lowerCase == 'f') {
                    if (handledForwarding(str, str2)) {
                    }
                    if (!handledIpHeaders(str, str2)) {
                    }
                } else if (lowerCase != 'u') {
                    if (lowerCase == 'x') {
                        if ("X-Amzn-Trace-Id".equalsIgnoreCase(str)) {
                            handleXRayTraceHeader(this, str2);
                            return true;
                        }
                        if (handledXForwarding(str, str2)) {
                        }
                    }
                    if (!handledIpHeaders(str, str2)) {
                        handleTags(str, str2);
                        if (!this.baggageMapping.isEmpty() && (str3 = (String) this.baggageMapping.get(ContextInterpreter.toLowerCase(str))) != null) {
                            String decode = HttpCodec.decode(str2);
                            if (this.baggage.isEmpty()) {
                                this.baggage = new TreeMap();
                            }
                            this.baggage.put(str3, HttpCodec.decode(decode));
                            return true;
                        }
                    }
                } else {
                    if (handledUserAgent(str, str2)) {
                    }
                    if (!handledIpHeaders(str, str2)) {
                    }
                }
            } catch (RuntimeException unused) {
                this.valid = false;
                return false;
            }
        }
        return true;
    }

    @Override // com.datadog.trace.core.propagation.ContextInterpreter
    public final TracePropagationStyle style() {
        return TracePropagationStyle.XRAY;
    }
}
