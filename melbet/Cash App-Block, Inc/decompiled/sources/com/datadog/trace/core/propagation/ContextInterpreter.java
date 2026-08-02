package com.datadog.trace.core.propagation;

import androidx.media3.extractor.mkv.Sniffer;
import com.datadog.trace.api.Config;
import com.datadog.trace.api.DD64bTraceId;
import com.datadog.trace.api.DDTraceId;
import com.datadog.trace.api.Functions;
import com.datadog.trace.api.TracePropagationStyle;
import com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation$KeyClassifier;
import com.datadog.trace.bootstrap.instrumentation.api.TagContext;
import com.datadog.trace.core.CoreTracer;
import com.datadog.trace.core.propagation.ptags.PTagsFactory$PTags;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public abstract class ContextInterpreter implements AgentPropagation$KeyClassifier {
    public Map baggage;
    public Map baggageMapping;
    public final boolean clientIpWithoutAppSec;
    public boolean collectIpHeaders;
    public final String customIpHeaderName;
    public long endToEndStartTime;
    public boolean fullContext;
    public Map headerTags;
    public TagContext.HttpHeaders httpHeaders;
    public CharSequence origin;
    public PTagsFactory$PTags propagationTags;
    public final Sniffer propagationTagsFactory;
    public final boolean requestHeaderTagsCommaAllowed;
    public int samplingPriority;
    public long spanId;
    public Map tags;
    public CoreTracer.ConfigSnapshot traceConfig;
    public DDTraceId traceId;
    public boolean valid;
    public static final boolean LOG_EXTRACT_HEADER_NAMES = Config.INSTANCE.logExtractHeaderNames;
    public static final Sniffer CACHE = new Sniffer(64, 11);

    public ContextInterpreter(Config config) {
        this.customIpHeaderName = config.traceClientIpHeader;
        this.clientIpWithoutAppSec = config.clientIpEnabled;
        this.propagationTagsFactory = new Sniffer(config.xDatadogTagsMaxLength, 15);
        this.requestHeaderTagsCommaAllowed = config.requestHeaderTagsCommaAllowed;
    }

    public static String toLowerCase(String str) {
        return (String) CACHE.computeIfAbsent(str, Functions.LowerCase.INSTANCE);
    }

    public TagContext build() {
        if (this.valid) {
            if (this.fullContext) {
                DD64bTraceId dD64bTraceId = DDTraceId.ZERO;
                if (!dD64bTraceId.equals(this.traceId)) {
                    if (this.propagationTags == null) {
                        this.propagationTags = this.propagationTagsFactory.createValid(null, null, null);
                    }
                    DDTraceId dDTraceId = this.traceId;
                    long j = this.spanId;
                    int i = this.samplingPriority;
                    if (i == -128 || dD64bTraceId.equals(dDTraceId)) {
                        i = defaultSamplingPriority();
                    }
                    return new ExtractedContext(dDTraceId, j, i, this.origin, this.endToEndStartTime, this.baggage, this.tags, this.propagationTags, this.traceConfig, style());
                }
            }
            if (this.origin != null || !this.tags.isEmpty() || this.httpHeaders != null || !this.baggage.isEmpty() || this.samplingPriority != -128) {
                CharSequence charSequence = this.origin;
                Map map = this.tags;
                Map map2 = this.baggage;
                DDTraceId dDTraceId2 = this.traceId;
                int i2 = this.samplingPriority;
                if (i2 == -128 || DDTraceId.ZERO.equals(dDTraceId2)) {
                    i2 = defaultSamplingPriority();
                }
                return new TagContext(charSequence, map, map2, i2, this.traceConfig, style());
            }
        }
        return null;
    }

    public int defaultSamplingPriority() {
        return -128;
    }

    public final TagContext.HttpHeaders getHeaders() {
        if (this.httpHeaders == null) {
            this.httpHeaders = new TagContext.HttpHeaders();
        }
        return this.httpHeaders;
    }

    public final void handleMappedBaggage(String str, String str2) {
        if (this.baggageMapping.isEmpty() || str2 == null) {
            return;
        }
        String str3 = (String) this.baggageMapping.get(toLowerCase(str));
        if (str3 != null) {
            if (this.baggage.isEmpty()) {
                this.baggage = new TreeMap();
            }
            this.baggage.put(str3, HttpCodec.decode(str2));
        }
    }

    public final boolean handleTags(String str, String str2) {
        if (!this.headerTags.isEmpty() && str2 != null) {
            String str3 = (String) this.headerTags.get(toLowerCase(str));
            if (str3 != null) {
                if (this.tags.isEmpty()) {
                    this.tags = new TreeMap();
                }
                Map map = this.tags;
                if (!this.requestHeaderTagsCommaAllowed) {
                    str2 = HttpCodec.firstHeaderValue(str2);
                }
                map.put(str3, HttpCodec.decode(str2));
                return true;
            }
        }
        return false;
    }

    public final boolean handledForwarding(String str, String str2) {
        if (str2 == null || !this.collectIpHeaders) {
            return false;
        }
        if ("forwarded".equalsIgnoreCase(str)) {
            getHeaders().getClass();
            return true;
        }
        if (!"forwarded-for".equalsIgnoreCase(str)) {
            return false;
        }
        getHeaders().getClass();
        return true;
    }

    public final boolean handledIpHeaders(String str, String str2) {
        String str3;
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str2 != null && (str3 = this.customIpHeaderName) != null && str3.equalsIgnoreCase(str)) {
            getHeaders().getClass();
            return true;
        }
        if (str2 == null || !this.collectIpHeaders) {
            return false;
        }
        if (Character.toLowerCase(str.charAt(str.length() - 1)) != 'p') {
            if (!"cf-connecting-ipv6".equalsIgnoreCase(str)) {
                return false;
            }
            getHeaders().getClass();
            return true;
        }
        if ("x-cluster-client-ip".equalsIgnoreCase(str)) {
            getHeaders().getClass();
            return true;
        }
        if ("x-real-ip".equalsIgnoreCase(str)) {
            getHeaders().getClass();
            return true;
        }
        if ("x-client-ip".equalsIgnoreCase(str)) {
            getHeaders().getClass();
            return true;
        }
        if ("true-client-ip".equalsIgnoreCase(str)) {
            getHeaders().getClass();
            return true;
        }
        if ("fastly-client-ip".equalsIgnoreCase(str)) {
            getHeaders().getClass();
            return true;
        }
        if (!"cf-connecting-ip".equalsIgnoreCase(str)) {
            return false;
        }
        getHeaders().getClass();
        return true;
    }

    public final boolean handledUserAgent(String str, String str2) {
        if (str2 == null || !"user-agent".equalsIgnoreCase(str)) {
            return false;
        }
        getHeaders().getClass();
        return true;
    }

    public final boolean handledXForwarding(String str, String str2) {
        if (str2 == null || !this.collectIpHeaders) {
            return false;
        }
        if ("x-forwarded-proto".equalsIgnoreCase(str)) {
            getHeaders().getClass();
            return true;
        }
        if ("x-forwarded-host".equalsIgnoreCase(str)) {
            getHeaders().getClass();
            return true;
        }
        if ("x-forwarded-for".equalsIgnoreCase(str)) {
            getHeaders().getClass();
            return true;
        }
        if ("x-forwarded-port".equalsIgnoreCase(str)) {
            getHeaders().getClass();
            return true;
        }
        if (!"x-forwarded".equalsIgnoreCase(str)) {
            return false;
        }
        getHeaders().getClass();
        return true;
    }

    public ContextInterpreter reset(CoreTracer.ConfigSnapshot configSnapshot) {
        this.traceConfig = configSnapshot;
        this.traceId = DDTraceId.ZERO;
        this.spanId = 0L;
        this.samplingPriority = -128;
        this.origin = null;
        this.endToEndStartTime = 0L;
        Map map = Collections.EMPTY_MAP;
        this.tags = map;
        this.baggage = map;
        this.valid = true;
        this.fullContext = true;
        this.httpHeaders = null;
        this.collectIpHeaders = this.clientIpWithoutAppSec;
        this.headerTags = configSnapshot.requestHeaderTags;
        this.baggageMapping = configSnapshot.baggageMapping;
        return this;
    }

    public abstract TracePropagationStyle style();
}
