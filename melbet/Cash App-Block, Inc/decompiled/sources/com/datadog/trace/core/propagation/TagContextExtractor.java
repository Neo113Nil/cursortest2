package com.datadog.trace.core.propagation;

import androidx.media3.extractor.mkv.Sniffer;
import com.datadog.trace.api.Config;
import com.datadog.trace.api.DD128bTraceId;
import com.datadog.trace.api.DD64bTraceId;
import com.datadog.trace.api.DDTraceId;
import com.datadog.trace.api.TracePropagationStyle;
import com.datadog.trace.api.internal.util.LongStringUtils;
import com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation$ContextVisitor;
import com.datadog.trace.bootstrap.instrumentation.api.TagContext;
import com.datadog.trace.core.CoreTracer$$ExternalSyntheticLambda1;
import com.datadog.trace.core.propagation.B3HttpCodec;
import com.datadog.trace.core.propagation.HttpCodec;
import com.datadog.trace.core.propagation.ptags.PTagsCodec;
import com.datadog.trace.core.propagation.ptags.PTagsFactory$PTags;
import java.util.EnumMap;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class TagContextExtractor implements HttpCodec.Extractor {
    public final ThreadLocal ctxInterpreter = new ThreadLocal();
    public final B3HttpCodec$$ExternalSyntheticLambda0 factory;
    public final CoreTracer$$ExternalSyntheticLambda1 traceConfigSupplier;

    public TagContextExtractor(CoreTracer$$ExternalSyntheticLambda1 coreTracer$$ExternalSyntheticLambda1, B3HttpCodec$$ExternalSyntheticLambda0 b3HttpCodec$$ExternalSyntheticLambda0) {
        this.factory = b3HttpCodec$$ExternalSyntheticLambda0;
        this.traceConfigSupplier = coreTracer$$ExternalSyntheticLambda1;
    }

    @Override // com.datadog.trace.core.propagation.HttpCodec.Extractor
    public final TagContext extract(Object obj, AgentPropagation$ContextVisitor agentPropagation$ContextVisitor) {
        ContextInterpreter contextInterpreter;
        ThreadLocal threadLocal = this.ctxInterpreter;
        ContextInterpreter contextInterpreter2 = (ContextInterpreter) threadLocal.get();
        if (contextInterpreter2 == null) {
            B3HttpCodec$$ExternalSyntheticLambda0 b3HttpCodec$$ExternalSyntheticLambda0 = this.factory;
            int i = b3HttpCodec$$ExternalSyntheticLambda0.$r8$classId;
            final Config config = b3HttpCodec$$ExternalSyntheticLambda0.f$0;
            switch (i) {
                case 0:
                    contextInterpreter = new B3HttpCodec.B3SingleContextInterpreter(config);
                    break;
                case 1:
                    contextInterpreter = new B3HttpCodec.B3MultiContextInterpreter(config);
                    break;
                case 2:
                    contextInterpreter = new ContextInterpreter(config) { // from class: com.datadog.trace.core.propagation.DatadogHttpCodec$DatadogContextInterpreter
                        public final boolean isAwsPropagationEnabled;

                        {
                            super(config);
                            this.isAwsPropagationEnabled = config.awsPropagationEnabled;
                        }

                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        /* JADX WARN: Code restructure failed: missing block: B:65:0x007c, code lost:
                        
                            if (handledUserAgent(r7, r8) != false) goto L81;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:73:0x009e, code lost:
                        
                            if (handledForwarding(r7, r8) != false) goto L81;
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
                                            c = 5;
                                        } else {
                                            if (str3.startsWith("ot-baggage-")) {
                                                c = 4;
                                            }
                                            c = 65535;
                                        }
                                    } else if (lowerCase != 'u') {
                                        if (lowerCase == 'x') {
                                            if ("x-datadog-trace-id".equalsIgnoreCase(str)) {
                                                c = 0;
                                            } else if ("x-datadog-parent-id".equalsIgnoreCase(str)) {
                                                c = 1;
                                            } else if ("x-datadog-sampling-priority".equalsIgnoreCase(str)) {
                                                c = 3;
                                            } else if ("x-datadog-origin".equalsIgnoreCase(str)) {
                                                c = 2;
                                            } else {
                                                if (this.isAwsPropagationEnabled && "X-Amzn-Trace-Id".equalsIgnoreCase(str)) {
                                                    XRayHttpCodec$XRayContextInterpreter.handleXRayTraceHeader(this, str2);
                                                    return true;
                                                }
                                                if (!handledXForwarding(str, str2)) {
                                                    if ("x-datadog-tags".equalsIgnoreCase(str)) {
                                                        c = 6;
                                                    }
                                                }
                                            }
                                        }
                                        c = 65535;
                                    }
                                }
                                if (c != 65535) {
                                    if (str2 != null) {
                                        try {
                                            switch (c) {
                                                case 0:
                                                    String firstHeaderValue = HttpCodec.firstHeaderValue(str2);
                                                    DD64bTraceId dD64bTraceId = DDTraceId.ZERO;
                                                    this.traceId = DD64bTraceId.create(LongStringUtils.parseUnsignedLong(firstHeaderValue), firstHeaderValue);
                                                    break;
                                                case 1:
                                                    this.spanId = LongStringUtils.parseUnsignedLong(HttpCodec.firstHeaderValue(str2));
                                                    break;
                                                case 2:
                                                    this.origin = HttpCodec.firstHeaderValue(str2);
                                                    break;
                                                case 3:
                                                    this.samplingPriority = Integer.parseInt(HttpCodec.firstHeaderValue(str2));
                                                    break;
                                                case 4:
                                                    if (this.baggage.isEmpty()) {
                                                        this.baggage = new TreeMap();
                                                    }
                                                    this.baggage.put(str3.substring(11), HttpCodec.decode(str2));
                                                    break;
                                                case 5:
                                                    try {
                                                        j = TimeUnit.MILLISECONDS.toNanos(Long.parseLong(HttpCodec.firstHeaderValue(str2)));
                                                    } catch (RuntimeException unused) {
                                                        j = 0;
                                                    }
                                                    this.endToEndStartTime = j;
                                                    break;
                                                case 6:
                                                    Sniffer sniffer = this.propagationTagsFactory;
                                                    this.propagationTags = ((PTagsCodec) ((EnumMap) sniffer.scratch).get(PropagationTags$HeaderType.DATADOG)).fromHeaderValue(sniffer, str2);
                                                    break;
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
                            PTagsFactory$PTags pTagsFactory$PTags;
                            if (this.traceId != DDTraceId.ZERO && (pTagsFactory$PTags = this.propagationTags) != null) {
                                long j = pTagsFactory$PTags.traceIdHighOrderBits;
                                if (j != 0) {
                                    this.traceId = new DD128bTraceId(j, this.traceId.toLong(), null);
                                }
                            }
                            return super.build();
                        }

                        @Override // com.datadog.trace.core.propagation.ContextInterpreter
                        public final TracePropagationStyle style() {
                            return TracePropagationStyle.DATADOG;
                        }
                    };
                    break;
                case 3:
                    contextInterpreter = new HaystackHttpCodec$HaystackContextInterpreter(config);
                    break;
                case 4:
                    W3CHttpCodec$W3CContextInterpreter w3CHttpCodec$W3CContextInterpreter = new W3CHttpCodec$W3CContextInterpreter(config);
                    w3CHttpCodec$W3CContextInterpreter.tracestateHeader = null;
                    w3CHttpCodec$W3CContextInterpreter.traceparentHeader = null;
                    contextInterpreter = w3CHttpCodec$W3CContextInterpreter;
                    break;
                default:
                    contextInterpreter = new XRayHttpCodec$XRayContextInterpreter(config);
                    break;
            }
            contextInterpreter2 = contextInterpreter;
            threadLocal.set(contextInterpreter2);
        }
        ContextInterpreter reset = contextInterpreter2.reset(this.traceConfigSupplier.f$0.dynamicConfig.currentSnapshot);
        agentPropagation$ContextVisitor.forEachKey(obj, reset);
        return reset.build();
    }
}
