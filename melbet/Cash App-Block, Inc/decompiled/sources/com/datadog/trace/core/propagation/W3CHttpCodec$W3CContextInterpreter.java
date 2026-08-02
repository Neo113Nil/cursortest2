package com.datadog.trace.core.propagation;

import androidx.media3.extractor.mkv.Sniffer;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.api.DD128bTraceId;
import com.datadog.trace.api.TracePropagationStyle;
import com.datadog.trace.api.internal.util.LongStringUtils;
import com.datadog.trace.bootstrap.instrumentation.api.TagContext;
import com.datadog.trace.core.CoreTracer;
import com.datadog.trace.core.propagation.ptags.PTagsCodec;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.EnumMap;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class W3CHttpCodec$W3CContextInterpreter extends ContextInterpreter {
    public String traceparentHeader;
    public String tracestateHeader;

    public static String trim(String str) {
        char charAt;
        if (str == null) {
            return "";
        }
        int length = str.length() - 1;
        if (length != 0) {
            int i = 0;
            while (i <= length && ((charAt = str.charAt(i)) == '\t' || charAt == ' ')) {
                i++;
            }
            int i2 = length;
            while (i2 > i) {
                char charAt2 = str.charAt(i2);
                if (charAt2 != '\t' && charAt2 != ' ') {
                    break;
                }
                i2--;
            }
            if (i != 0 || i2 != length) {
                return str.substring(i, i2 + 1);
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (handledUserAgent(r9, r10) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x004f, code lost:
    
        if (handledXForwarding(r9, r10) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0071, code lost:
    
        if (handledForwarding(r9, r10) != false) goto L79;
     */
    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation$KeyClassifier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean accept(String str, String str2) {
        char c;
        long j;
        if (str != null && !str.isEmpty()) {
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String str3 = null;
            if (lowerCase != 'f') {
                if (lowerCase == 'o') {
                    str3 = ContextInterpreter.toLowerCase(str);
                    if ("ot-baggage-t0".equals(str3)) {
                        c = 3;
                    } else {
                        if (str3.startsWith("ot-baggage-")) {
                            c = 2;
                        }
                        c = 65535;
                    }
                } else if (lowerCase != 'x') {
                    if (lowerCase != 't') {
                        if (lowerCase == 'u') {
                        }
                    } else if ("traceparent".equalsIgnoreCase(str)) {
                        c = 0;
                    } else if ("tracestate".equalsIgnoreCase(str)) {
                        c = 1;
                    }
                    c = 65535;
                }
            }
            if (c != 65535) {
                if (str2 != null) {
                    try {
                        if (c == 0) {
                            String trim = trim(str2);
                            if (this.traceparentHeader != null) {
                                this.fullContext = false;
                                return true;
                            }
                            this.traceparentHeader = trim;
                            return true;
                        }
                        if (c == 1) {
                            String trim2 = trim(str2);
                            if (!trim2.isEmpty()) {
                                if (this.tracestateHeader != null) {
                                    trim2 = this.tracestateHeader + "," + trim2;
                                }
                                this.tracestateHeader = trim2;
                                return true;
                            }
                        } else if (c == 2) {
                            if (this.baggage.isEmpty()) {
                                this.baggage = new TreeMap();
                            }
                            this.baggage.put(str3.substring(11), HttpCodec.decode(str2));
                        } else if (c == 3) {
                            try {
                                j = TimeUnit.MILLISECONDS.toNanos(Long.parseLong(HttpCodec.firstHeaderValue(str2)));
                            } catch (RuntimeException unused) {
                                j = 0;
                            }
                            this.endToEndStartTime = j;
                        }
                    } catch (RuntimeException unused2) {
                        this.valid = false;
                        return false;
                    }
                }
            } else if (!handledIpHeaders(str, str2) && !handleTags(str, str2)) {
                handleMappedBaggage(str, str2);
            }
        }
        return true;
    }

    @Override // com.datadog.trace.core.propagation.ContextInterpreter
    public final TagContext build() {
        String str = this.traceparentHeader;
        if (str == null && this.tracestateHeader == null) {
            this.fullContext = false;
        }
        if (this.valid && this.fullContext) {
            if (str == null) {
                try {
                    if (this.tracestateHeader != null) {
                        throw new IllegalStateException("Found no traceparent header but tracestate header '" + this.tracestateHeader + "'");
                    }
                } catch (RuntimeException unused) {
                    this.fullContext = false;
                }
            }
            parseTraceParentHeader(str);
            parseTraceStateHeader(this.tracestateHeader);
        }
        return super.build();
    }

    public final void parseTraceParentHeader(String str) {
        int length = str == null ? 0 : str.length();
        if (length < 55) {
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("The length of traceparent '", str, "' is too short"));
            return;
        }
        long parseUnsignedLongHex = LongStringUtils.parseUnsignedLongHex(str, 0, 2, true);
        if (parseUnsignedLongHex == 255) {
            a$$ExternalSyntheticBUOutline0.m$1("Illegal version number ".concat(str.substring(0, 2)));
            return;
        }
        if (parseUnsignedLongHex == 0 && length > 55) {
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("The length of traceparent '", str, "' is too long"));
            return;
        }
        DD128bTraceId fromHex = DD128bTraceId.fromHex(3, 32, str);
        if (fromHex.lowOrderBits == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Illegal all zero 64 bit trace id ".concat(str.substring(3, 35)));
            return;
        }
        this.traceId = fromHex;
        long parseUnsignedLongHex2 = LongStringUtils.parseUnsignedLongHex(str, 36, 16, true);
        this.spanId = parseUnsignedLongHex2;
        if (parseUnsignedLongHex2 == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Illegal all zero span id ".concat(str.substring(36, 52)));
            return;
        }
        if (parseUnsignedLongHex != 0 && length > 55 && str.charAt(55) != '-') {
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Illegal character after flags in '", str, "'"));
        } else if ((LongStringUtils.parseUnsignedLongHex(str, 53, 2, true) & 1) != 0) {
            this.samplingPriority = 1;
        } else {
            this.samplingPriority = 0;
        }
    }

    public final void parseTraceStateHeader(String str) {
        if (str == null || str.isEmpty()) {
            this.propagationTags = this.propagationTagsFactory.createValid(null, null, null);
        } else {
            Sniffer sniffer = this.propagationTagsFactory;
            this.propagationTags = ((PTagsCodec) ((EnumMap) sniffer.scratch).get(PropagationTags$HeaderType.W3C)).fromHeaderValue(sniffer, str);
        }
        int i = this.propagationTags.samplingPriority;
        int i2 = this.samplingPriority;
        if ((i2 != 0 || i <= 0) && ((i2 != 1 || i > 0) && i != -128)) {
            this.samplingPriority = i;
        } else {
            this.propagationTags.updateTraceSamplingPriority(i2, -128);
        }
        this.origin = this.propagationTags.origin;
        this.propagationTags.updateTraceIdHighOrderBits(this.traceId.toHighOrderLong());
    }

    @Override // com.datadog.trace.core.propagation.ContextInterpreter
    public final ContextInterpreter reset(CoreTracer.ConfigSnapshot configSnapshot) {
        this.tracestateHeader = null;
        this.traceparentHeader = null;
        super.reset(configSnapshot);
        return this;
    }

    @Override // com.datadog.trace.core.propagation.ContextInterpreter
    public final TracePropagationStyle style() {
        return TracePropagationStyle.TRACECONTEXT;
    }
}
