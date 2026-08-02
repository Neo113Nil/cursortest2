package com.datadog.trace.core.propagation;

import com.datadog.trace.api.DD64bTraceId;
import com.datadog.trace.api.TracePropagationStyle;
import com.datadog.trace.api.internal.util.LongStringUtils;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class HaystackHttpCodec$HaystackContextInterpreter extends ContextInterpreter {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (handledUserAgent(r9, r10) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x004d, code lost:
    
        if (handledXForwarding(r9, r10) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0060, code lost:
    
        if (handledForwarding(r9, r10) != false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation$KeyClassifier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean accept(String str, String str2) {
        String lowerCase;
        char c;
        if (str != null && !str.isEmpty()) {
            char lowerCase2 = Character.toLowerCase(str.charAt(0));
            if (lowerCase2 != 'b') {
                if (lowerCase2 != 'f') {
                    if (lowerCase2 == 'p') {
                        if ("Parent-ID".equalsIgnoreCase(str)) {
                            lowerCase = null;
                            c = 2;
                        }
                        lowerCase = null;
                    } else if (lowerCase2 != 'x') {
                        switch (lowerCase2) {
                            case 's':
                                if ("Span-ID".equalsIgnoreCase(str)) {
                                    c = 1;
                                    lowerCase = null;
                                    break;
                                }
                                lowerCase = null;
                                break;
                            case 't':
                                if ("Trace-ID".equalsIgnoreCase(str)) {
                                    c = 0;
                                    lowerCase = null;
                                    break;
                                }
                                lowerCase = null;
                                break;
                            case 'u':
                                break;
                            default:
                                lowerCase = null;
                                break;
                        }
                        return true;
                    }
                    if (65535 == c) {
                        try {
                            if (HttpCodec.firstHeaderValue(str2) != null) {
                                if (c == 0) {
                                    String m1914$$Nest$smconvertUUIDToHexString = HttpCodec.m1914$$Nest$smconvertUUIDToHexString(str2);
                                    DD64bTraceId dD64bTraceId = DD64bTraceId.MAX;
                                    this.traceId = DD64bTraceId.create(LongStringUtils.parseUnsignedLongHex(m1914$$Nest$smconvertUUIDToHexString), null);
                                    addBaggageItem("Haystack-Trace-ID", str2);
                                    return true;
                                }
                                if (c == 1) {
                                    this.spanId = LongStringUtils.parseUnsignedLongHex(HttpCodec.m1914$$Nest$smconvertUUIDToHexString(str2));
                                    addBaggageItem("Haystack-Span-ID", str2);
                                    return true;
                                }
                                if (c == 2) {
                                    addBaggageItem("Haystack-Parent-ID", str2);
                                    return true;
                                }
                                if (c == 3) {
                                    addBaggageItem(lowerCase.substring(8), str2);
                                    return true;
                                }
                            }
                        } catch (RuntimeException unused) {
                            this.valid = false;
                            return false;
                        }
                    } else if (!handledIpHeaders(str, str2) && !handleTags(str, str2)) {
                        handleMappedBaggage(str, str2);
                    }
                }
                c = 65535;
                if (65535 == c) {
                }
            } else {
                lowerCase = ContextInterpreter.toLowerCase(str);
                if (lowerCase.startsWith("baggage-")) {
                    c = 3;
                    if (65535 == c) {
                    }
                }
                c = 65535;
                if (65535 == c) {
                }
            }
        }
        return true;
    }

    public final void addBaggageItem(String str, String str2) {
        if (this.baggage.isEmpty()) {
            this.baggage = new TreeMap();
        }
        this.baggage.put(str, HttpCodec.decode(str2));
    }

    @Override // com.datadog.trace.core.propagation.ContextInterpreter
    public final int defaultSamplingPriority() {
        return 1;
    }

    @Override // com.datadog.trace.core.propagation.ContextInterpreter
    public final TracePropagationStyle style() {
        return TracePropagationStyle.HAYSTACK;
    }
}
