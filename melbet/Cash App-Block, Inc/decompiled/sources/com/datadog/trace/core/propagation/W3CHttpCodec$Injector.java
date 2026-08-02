package com.datadog.trace.core.propagation;

import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.datadog.trace.api.DD128bTraceId;
import com.datadog.trace.api.DD64bTraceId;
import com.datadog.trace.api.DDTraceId;
import com.datadog.trace.api.internal.util.LongStringUtils;
import com.datadog.trace.api.time.SystemTimeSource;
import com.datadog.trace.core.DDSpanContext;
import com.datadog.trace.core.propagation.HttpCodec;
import com.datadog.trace.core.propagation.ptags.PTagsFactory$PTags;
import com.datadog.trace.core.propagation.ptags.TagValue;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import okhttp3.Request;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public final class W3CHttpCodec$Injector implements HttpCodec.Injector {
    public final /* synthetic */ int $r8$classId;
    public final Object invertedBaggageMapping;

    public /* synthetic */ W3CHttpCodec$Injector(Object obj, int i) {
        this.$r8$classId = i;
        this.invertedBaggageMapping = obj;
    }

    public static void additionalPart(int i, String str, String str2, StringBuilder sb) {
        if (Boxes$$ExternalSyntheticOutline1.m(str.length() + sb.length(), 2, str2) <= i) {
            sb.append(';');
            sb.append(str);
            sb.append('=');
            sb.append(str2);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:126|127|(3:128|129|(2:131|(2:133|134)(1:176))(2:177|178))|(4:136|(1:138)(1:174)|139|(13:141|142|143|144|145|146|147|148|149|150|151|(8:154|(1:156)(1:164)|157|158|159|161|162|152)|165))|175|142|143|144|145|146|147|148|149|150|151|(1:152)|165) */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0212 A[Catch: NumberFormatException -> 0x0252, TryCatch #1 {NumberFormatException -> 0x0252, blocks: (B:127:0x0157, B:128:0x0161, B:131:0x016a, B:134:0x017c, B:136:0x0186, B:138:0x0192, B:139:0x01a4, B:142:0x01b7, B:144:0x01c7, B:145:0x01cb, B:147:0x01e1, B:148:0x01e5, B:150:0x01fb, B:151:0x01ff, B:152:0x020c, B:154:0x0212, B:157:0x0240, B:159:0x0246, B:162:0x024a, B:164:0x0229, B:174:0x019c, B:175:0x01ad), top: B:126:0x0157 }] */
    @Override // com.datadog.trace.core.propagation.HttpCodec.Injector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inject(DDSpanContext dDSpanContext, Request.Builder builder, ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2) {
        String str;
        long currentTimeMillis;
        switch (this.$r8$classId) {
            case 0:
                StringBuilder sb = new StringBuilder(55);
                sb.append("00-");
                sb.append(dDSpanContext.traceId.toHexString());
                sb.append("-");
                sb.append(LongStringUtils.toHexStringPadded(16, dDSpanContext.spanId));
                sb.append(dDSpanContext.getRootSpanContextOrThis().samplingPriority > 0 ? "-01" : "-00");
                exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "traceparent", sb.toString());
                String headerValue = dDSpanContext.getRootSpanContextOrThis().propagationTags.headerValue(PropagationTags$HeaderType.W3C);
                if (headerValue != null && !headerValue.isEmpty()) {
                    exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "tracestate", headerValue);
                }
                long j = dDSpanContext.trace.endToEndStartTime;
                if (j > 0) {
                    exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "ot-baggage-t0", Long.toString(j / 1000000));
                }
                for (Map.Entry entry : dDSpanContext.baggageItems.entrySet()) {
                    String str2 = (String) ((Map) this.invertedBaggageMapping).get(entry.getKey());
                    if (str2 == null) {
                        str2 = "ot-baggage-" + ((String) entry.getKey());
                    }
                    String str3 = (String) entry.getValue();
                    try {
                        str3 = URLEncoder.encode(str3, "UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                    }
                    exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, str2, str3.replace(Marker.ANY_NON_NULL_MARKER, "%20"));
                }
                Baggage composeBaggage = HttpCodec.composeBaggage(dDSpanContext);
                if (!composeBaggage.values.isEmpty()) {
                    exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "baggage", composeBaggage.toString());
                    break;
                }
                break;
            case 1:
                exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "x-datadog-trace-id", dDSpanContext.traceId.toString());
                exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "x-datadog-parent-id", Long.toUnsignedString(dDSpanContext.spanId));
                if (dDSpanContext.lockSamplingPriority()) {
                    exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "x-datadog-sampling-priority", String.valueOf(dDSpanContext.getRootSpanContextOrThis().samplingPriority));
                }
                CharSequence charSequence = dDSpanContext.getRootSpanContextOrThis().origin;
                if (charSequence != null) {
                    exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "x-datadog-origin", charSequence.toString());
                }
                long j2 = dDSpanContext.trace.endToEndStartTime;
                if (j2 > 0) {
                    exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "ot-baggage-t0", Long.toString(j2 / 1000000));
                }
                for (Map.Entry entry2 : dDSpanContext.baggageItems.entrySet()) {
                    String str4 = (String) ((Map) this.invertedBaggageMapping).get(entry2.getKey());
                    if (str4 == null) {
                        str4 = "ot-baggage-" + ((String) entry2.getKey());
                    }
                    String str5 = (String) entry2.getValue();
                    try {
                        str5 = URLEncoder.encode(str5, "UTF-8");
                    } catch (UnsupportedEncodingException unused2) {
                    }
                    exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, str4, str5.replace(Marker.ANY_NON_NULL_MARKER, "%20"));
                }
                String headerValue2 = dDSpanContext.getRootSpanContextOrThis().propagationTags.headerValue(PropagationTags$HeaderType.DATADOG);
                if (headerValue2 != null) {
                    exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "x-datadog-tags", headerValue2);
                }
                Baggage composeBaggage2 = HttpCodec.composeBaggage(dDSpanContext);
                if (!composeBaggage2.values.isEmpty()) {
                    exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "baggage", composeBaggage2.toString());
                    break;
                }
                break;
            case 2:
                try {
                    Iterator it = dDSpanContext.baggageItems.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry entry3 = (Map.Entry) it.next();
                            if ("Haystack-Trace-ID".equalsIgnoreCase((String) entry3.getKey())) {
                                str = (String) entry3.getValue();
                            }
                        } else {
                            str = null;
                        }
                    }
                    if (str != null) {
                        String m1914$$Nest$smconvertUUIDToHexString = HttpCodec.m1914$$Nest$smconvertUUIDToHexString(str);
                        DD64bTraceId dD64bTraceId = DDTraceId.ZERO;
                        if ((m1914$$Nest$smconvertUUIDToHexString.length() > 16 ? DD128bTraceId.fromHex(0, m1914$$Nest$smconvertUUIDToHexString.length(), m1914$$Nest$smconvertUUIDToHexString) : DD64bTraceId.create(LongStringUtils.parseUnsignedLongHex(m1914$$Nest$smconvertUUIDToHexString), null)).equals(dDSpanContext.traceId)) {
                            exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "Trace-ID", str);
                            dDSpanContext.setTag(str, "Haystack-Trace-ID");
                            String dDTraceId = dDSpanContext.traceId.toString();
                            dDTraceId = URLEncoder.encode(dDTraceId, "UTF-8");
                            exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "Baggage-Datadog-Trace-Id", dDTraceId);
                            exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "Span-ID", HttpCodec.m1913$$Nest$smconvertLongToUUID(dDSpanContext.spanId));
                            String unsignedString = Long.toUnsignedString(dDSpanContext.spanId);
                            unsignedString = URLEncoder.encode(unsignedString, "UTF-8");
                            exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "Baggage-Datadog-Span-Id", unsignedString);
                            exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "Parent-ID", HttpCodec.m1913$$Nest$smconvertLongToUUID(dDSpanContext.parentId));
                            String unsignedString2 = Long.toUnsignedString(dDSpanContext.parentId);
                            unsignedString2 = URLEncoder.encode(unsignedString2, "UTF-8");
                            exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "Baggage-Datadog-Parent-Id", unsignedString2);
                            for (Map.Entry entry4 : dDSpanContext.baggageItems.entrySet()) {
                                String str6 = (String) ((Map) this.invertedBaggageMapping).get(entry4.getKey());
                                if (str6 == null) {
                                    str6 = "Baggage-" + ((String) entry4.getKey());
                                }
                                String str7 = (String) entry4.getValue();
                                try {
                                    str7 = URLEncoder.encode(str7, "UTF-8");
                                } catch (UnsupportedEncodingException unused3) {
                                }
                                exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, str6, str7.replace(Marker.ANY_NON_NULL_MARKER, "%20"));
                            }
                            break;
                        }
                    }
                    str = HttpCodec.m1913$$Nest$smconvertLongToUUID(dDSpanContext.traceId.toLong());
                    exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "Trace-ID", str);
                    dDSpanContext.setTag(str, "Haystack-Trace-ID");
                    String dDTraceId2 = dDSpanContext.traceId.toString();
                    dDTraceId2 = URLEncoder.encode(dDTraceId2, "UTF-8");
                    exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "Baggage-Datadog-Trace-Id", dDTraceId2);
                    exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "Span-ID", HttpCodec.m1913$$Nest$smconvertLongToUUID(dDSpanContext.spanId));
                    String unsignedString3 = Long.toUnsignedString(dDSpanContext.spanId);
                    unsignedString3 = URLEncoder.encode(unsignedString3, "UTF-8");
                    exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "Baggage-Datadog-Span-Id", unsignedString3);
                    exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "Parent-ID", HttpCodec.m1913$$Nest$smconvertLongToUUID(dDSpanContext.parentId));
                    String unsignedString22 = Long.toUnsignedString(dDSpanContext.parentId);
                    unsignedString22 = URLEncoder.encode(unsignedString22, "UTF-8");
                    exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "Baggage-Datadog-Parent-Id", unsignedString22);
                    while (r4.hasNext()) {
                    }
                } catch (NumberFormatException unused4) {
                    DDTraceId dDTraceId3 = dDSpanContext.traceId;
                    return;
                }
            case 3:
                long j3 = dDSpanContext.trace.endToEndStartTime;
                StringBuilder m = Boxes$$ExternalSyntheticOutline1.m("Root=1-");
                if (j3 > 0) {
                    currentTimeMillis = j3 / 1000000000;
                } else {
                    SystemTimeSource systemTimeSource = dDSpanContext.trace.timeSource;
                    currentTimeMillis = System.currentTimeMillis() / 1000;
                }
                m.append(String.format("%08x", Long.valueOf(currentTimeMillis)));
                m.append("-00000000");
                m.append(dDSpanContext.traceId.toHexStringPadded());
                m.append(";Parent=");
                m.append(LongStringUtils.toHexStringPadded(16, dDSpanContext.spanId));
                if (dDSpanContext.lockSamplingPriority()) {
                    m.append(";Sampled=");
                    m.append(dDSpanContext.getRootSpanContextOrThis().samplingPriority > 0 ? '1' : '0');
                }
                int length = m.length() + 256;
                CharSequence charSequence2 = dDSpanContext.getRootSpanContextOrThis().origin;
                if (charSequence2 != null) {
                    additionalPart(length, "_dd.origin", charSequence2.toString(), m);
                }
                if (j3 > 0) {
                    additionalPart(length, "t0", Long.toString(j3 / 1000000), m);
                }
                for (Map.Entry entry5 : dDSpanContext.baggageItems.entrySet()) {
                    String str8 = (String) ((Map) this.invertedBaggageMapping).get(entry5.getKey());
                    if (str8 == null) {
                        str8 = (String) entry5.getKey();
                    }
                    if (!"Root".equals(str8) && !"Parent".equals(str8) && !"Sampled".equals(str8) && !"Self".equals(str8)) {
                        String str9 = (String) entry5.getValue();
                        try {
                            str9 = URLEncoder.encode(str9, "UTF-8");
                        } catch (UnsupportedEncodingException unused5) {
                        }
                        additionalPart(length, str8, str9, m);
                    }
                }
                exoPlayerImplInternal$$ExternalSyntheticLambda2.set(builder, "X-Amzn-Trace-Id", m.toString());
                break;
            default:
                String str10 = (String) dDSpanContext.getTags().get("session_id");
                if (str10 != null) {
                    PTagsFactory$PTags pTagsFactory$PTags = dDSpanContext.getRootSpanContextOrThis().propagationTags;
                    if (!Objects.equals(pTagsFactory$PTags.rumSessionId, str10)) {
                        pTagsFactory$PTags.rumSessionId = str10;
                        TagValue.from(pTagsFactory$PTags.rumSessionId);
                        pTagsFactory$PTags.clearCachedHeader(PropagationTags$HeaderType.DATADOG);
                        pTagsFactory$PTags.clearCachedHeader(PropagationTags$HeaderType.W3C);
                    }
                }
                Iterator it2 = ((ArrayList) this.invertedBaggageMapping).iterator();
                while (it2.hasNext()) {
                    ((HttpCodec.Injector) it2.next()).inject(dDSpanContext, builder, exoPlayerImplInternal$$ExternalSyntheticLambda2);
                }
                break;
        }
    }
}
