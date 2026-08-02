package com.datadog.trace.core.propagation;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import com.datadog.trace.api.Config;
import com.datadog.trace.api.DD128bTraceId;
import com.datadog.trace.api.DD64bTraceId;
import com.datadog.trace.api.DDTraceId;
import com.datadog.trace.api.TracePropagationStyle;
import com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation$ContextVisitor;
import com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation$KeyClassifier;
import com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes;
import com.datadog.trace.bootstrap.instrumentation.api.TagContext;
import com.datadog.trace.core.DDSpanContext;
import com.datadog.trace.core.DDSpanLink;
import com.datadog.trace.core.propagation.B3HttpCodec;
import com.datadog.trace.core.propagation.ptags.PTagsFactory$PTags;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import okhttp3.Request;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class HttpCodec {
    public static final NoneCodec$1 INJECTOR = new NoneCodec$1();
    public static final NoneCodec$2 EXTRACTOR = new NoneCodec$2(0);

    public final class CompoundExtractor implements Extractor {
        public final boolean extractFirst;
        public final ArrayList extractors;

        public CompoundExtractor(ArrayList arrayList, boolean z) {
            this.extractors = arrayList;
            this.extractFirst = z;
        }

        @Override // com.datadog.trace.core.propagation.HttpCodec.Extractor
        public final TagContext extract(Object obj, AgentPropagation$ContextVisitor agentPropagation$ContextVisitor) {
            ExtractionCache extractionCache = new ExtractionCache(obj, agentPropagation$ContextVisitor);
            Iterator it = this.extractors.iterator();
            ExtractedContext extractedContext = null;
            TagContext tagContext = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TagContext extract = ((Extractor) it.next()).extract(extractionCache, extractionCache);
                if (extract instanceof ExtractedContext) {
                    ExtractedContext extractedContext2 = (ExtractedContext) extract;
                    if (extractedContext != null) {
                        DDTraceId dDTraceId = extractedContext.traceId;
                        DDTraceId dDTraceId2 = extractedContext2.traceId;
                        if (!((((dDTraceId instanceof DD128bTraceId) && (dDTraceId2 instanceof DD128bTraceId)) || ((dDTraceId instanceof DD64bTraceId) && (dDTraceId2 instanceof DD64bTraceId))) ? dDTraceId.equals(dDTraceId2) : dDTraceId.toLong() == dDTraceId2.toLong())) {
                            SpanLinkAttributes spanLinkAttributes = SpanLinkAttributes.EMPTY;
                            byte b = extractedContext2.samplingPriority <= 0 ? (byte) 0 : (byte) 1;
                            PTagsFactory$PTags pTagsFactory$PTags = extractedContext2.propagationTags;
                            DDSpanLink dDSpanLink = new DDSpanLink(extractedContext2.traceId, extractedContext2.spanId, b, pTagsFactory$PTags == null ? "" : pTagsFactory$PTags.headerValue(PropagationTags$HeaderType.W3C), spanLinkAttributes);
                            if (extractedContext.terminatedContextLinks == null) {
                                extractedContext.terminatedContextLinks = new ArrayList();
                            }
                            extractedContext.terminatedContextLinks.add(dDSpanLink);
                        } else if (extract.propagationStyle == TracePropagationStyle.TRACECONTEXT) {
                            extractedContext.propagationTags.tracestate = extractedContext2.propagationTags.tracestate;
                        }
                    } else {
                        if (this.extractFirst) {
                            extractedContext = extractedContext2;
                            break;
                        }
                        extractedContext = extractedContext2;
                    }
                } else if (extract != null && tagContext == null) {
                    tagContext = extract;
                }
            }
            if (extractedContext != null) {
                return extractedContext;
            }
            if (tagContext != null) {
                return tagContext;
            }
            return null;
        }
    }

    public final class ExtractionCache implements AgentPropagation$KeyClassifier, AgentPropagation$ContextVisitor {
        public final ArrayList keysAndValues = new ArrayList(32);

        public ExtractionCache(Object obj, AgentPropagation$ContextVisitor agentPropagation$ContextVisitor) {
            agentPropagation$ContextVisitor.forEachKey(obj, this);
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation$KeyClassifier
        public final boolean accept(String str, String str2) {
            ArrayList arrayList = this.keysAndValues;
            arrayList.add(str);
            arrayList.add(str2);
            return true;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation$ContextVisitor
        public final void forEachKey(Object obj, AgentPropagation$KeyClassifier agentPropagation$KeyClassifier) {
            ArrayList arrayList = ((ExtractionCache) obj).keysAndValues;
            for (int i = 0; i < arrayList.size(); i += 2) {
                agentPropagation$KeyClassifier.accept((String) arrayList.get(i), (String) arrayList.get(i + 1));
            }
        }
    }

    public interface Extractor {
        TagContext extract(Object obj, AgentPropagation$ContextVisitor agentPropagation$ContextVisitor);
    }

    public interface Injector {
        void inject(DDSpanContext dDSpanContext, Request.Builder builder, ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2);
    }

    /* renamed from: -$$Nest$smconvertLongToUUID, reason: not valid java name */
    public static String m1913$$Nest$smconvertLongToUUID(long j) {
        String format2 = String.format("%016x", Long.valueOf(j));
        return "44617461-646f-6721-" + format2.substring(0, 4) + "-" + format2.substring(4);
    }

    /* renamed from: -$$Nest$smconvertUUIDToHexString, reason: not valid java name */
    public static String m1914$$Nest$smconvertUUIDToHexString(String str) {
        try {
            if (!str.contains("-")) {
                return str.length() == 32 ? str.substring(16) : str;
            }
            String[] split = str.split("-");
            if (split.length != 5) {
                throw new NumberFormatException("Invalid UUID format: ".concat(str));
            }
            return split[3] + split[4];
        } catch (Exception e) {
            Handlers$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("Exception when converting UUID to BigInteger: ", str), e);
            return null;
        }
    }

    public static Baggage composeBaggage(DDSpanContext dDSpanContext) {
        Baggage baggage = new Baggage();
        String str = (String) dDSpanContext.getTags().get("session_id");
        HashMap hashMap = baggage.values;
        if (str != null) {
            hashMap.put("session.id", str);
        }
        String str2 = (String) dDSpanContext.getTags().get("user_id");
        if (str2 != null) {
            hashMap.put("user.id", str2);
        }
        String str3 = (String) dDSpanContext.getTags().get("account_id");
        if (str3 != null) {
            hashMap.put("account.id", str3);
        }
        return baggage;
    }

    public static EnumMap createInjectors(Config config, Set set, Map map) {
        EnumMap enumMap = new EnumMap(TracePropagationStyle.class);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            TracePropagationStyle tracePropagationStyle = (TracePropagationStyle) it.next();
            int i = 1;
            int i2 = 0;
            switch (tracePropagationStyle.ordinal()) {
                case 0:
                    enumMap.put((EnumMap) tracePropagationStyle, (TracePropagationStyle) new W3CHttpCodec$Injector(map, i));
                    break;
                case 1:
                    boolean z = config.tracePropagationStyleB3PaddingEnabled;
                    String str = B3HttpCodec.SAMPLING_PRIORITY_ACCEPT;
                    enumMap.put((EnumMap) tracePropagationStyle, (TracePropagationStyle) new B3HttpCodec.B3MultiInjector(z, 1));
                    break;
                case 2:
                    boolean z2 = config.tracePropagationStyleB3PaddingEnabled;
                    String str2 = B3HttpCodec.SAMPLING_PRIORITY_ACCEPT;
                    enumMap.put((EnumMap) tracePropagationStyle, (TracePropagationStyle) new B3HttpCodec.B3MultiInjector(z2, 0));
                    break;
                case 3:
                    enumMap.put((EnumMap) tracePropagationStyle, (TracePropagationStyle) new W3CHttpCodec$Injector(map, 2));
                    break;
                case 4:
                    enumMap.put((EnumMap) tracePropagationStyle, (TracePropagationStyle) new W3CHttpCodec$Injector(map, 3));
                    break;
                case 5:
                    enumMap.put((EnumMap) tracePropagationStyle, (TracePropagationStyle) new W3CHttpCodec$Injector(map, i2));
                    break;
                case 6:
                    enumMap.put((EnumMap) tracePropagationStyle, (TracePropagationStyle) INJECTOR);
                    break;
            }
        }
        return enumMap;
    }

    public static String decode(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            return str;
        }
    }

    public static String firstHeaderValue(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(44);
        return indexOf == -1 ? str : str.substring(0, indexOf).trim();
    }
}
