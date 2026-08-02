package com.datadog.trace.core.propagation.ptags;

import androidx.media3.extractor.mkv.Sniffer;
import com.datadog.trace.api.internal.util.LongStringUtils;
import com.datadog.trace.core.propagation.PropagationTags$HeaderType;
import com.datadog.trace.core.propagation.ptags.TagElement;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class PTagsFactory$PTags {
    public final boolean canChangeDecisionMaker;
    public volatile TagValue decisionMakerTagValue;
    public final Sniffer factory;
    public volatile CharSequence origin;
    public volatile String rumSessionId;
    public volatile int samplingPriority;
    public final List tagPairs;
    public volatile long traceIdHighOrderBits;
    public volatile TagValue traceIdHighOrderBitsHexTagValue;
    public volatile String tracestate;
    public volatile int xDatadogTagsSize = -1;
    public volatile String[] headerCache = null;

    public PTagsFactory$PTags(Sniffer sniffer, List list, TagValue tagValue, TagValue tagValue2, int i, CharSequence charSequence) {
        this.factory = sniffer;
        this.tagPairs = list;
        this.canChangeDecisionMaker = tagValue == null;
        this.decisionMakerTagValue = tagValue;
        this.samplingPriority = i;
        this.origin = charSequence;
        if (tagValue2 != null) {
            CharSequence forType = tagValue2.forType(TagElement.Encoding.DATADOG);
            this.traceIdHighOrderBits = LongStringUtils.parseUnsignedLongHex(forType, 0, forType.length(), true);
        }
        this.traceIdHighOrderBitsHexTagValue = tagValue2;
    }

    public final void clearCachedHeader(PropagationTags$HeaderType propagationTags$HeaderType) {
        if (propagationTags$HeaderType == PropagationTags$HeaderType.DATADOG) {
            this.xDatadogTagsSize = -1;
        }
        String[] strArr = this.headerCache;
        if (strArr == null) {
            return;
        }
        strArr[propagationTags$HeaderType.ordinal()] = null;
    }

    public final int getXDatadogTagsSize() {
        int i = this.xDatadogTagsSize;
        if (i != -1) {
            return i;
        }
        List<CharSequence> list = this.tagPairs;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        TagKey tagKey = PTagsCodec.DECISION_MAKER_TAG;
        TagElement.Encoding encoding2 = TagElement.Encoding.DATADOG;
        int i2 = 0;
        boolean z = true;
        for (CharSequence charSequence : list) {
            if (z) {
                i2 += 6;
            }
            z = !z;
            i2 = charSequence.length() + i2 + 1;
        }
        int calcXDatadogTagsSize = PTagsCodec.calcXDatadogTagsSize(PTagsCodec.calcXDatadogTagsSize(i2 != 0 ? i2 - 1 : 0, PTagsCodec.DECISION_MAKER_TAG, this.decisionMakerTagValue), PTagsCodec.TRACE_ID_TAG, this.traceIdHighOrderBitsHexTagValue);
        this.xDatadogTagsSize = calcXDatadogTagsSize;
        return calcXDatadogTagsSize;
    }

    public final String headerValue(PropagationTags$HeaderType propagationTags$HeaderType) {
        String[] strArr = this.headerCache;
        String str = strArr == null ? null : strArr[propagationTags$HeaderType.ordinal()];
        if (str == null) {
            PTagsCodec pTagsCodec = (PTagsCodec) ((EnumMap) this.factory.scratch).get(propagationTags$HeaderType);
            TagKey tagKey = PTagsCodec.DECISION_MAKER_TAG;
            int estimateHeaderSize = pTagsCodec.estimateHeaderSize(this);
            if (estimateHeaderSize == 0) {
                str = "";
            } else {
                StringBuilder sb = new StringBuilder(estimateHeaderSize);
                int appendPrefix = pTagsCodec.appendPrefix(sb, this);
                if (this.factory.peekLength > 0) {
                    if (this.decisionMakerTagValue != null) {
                        appendPrefix = pTagsCodec.appendTag(sb, PTagsCodec.DECISION_MAKER_TAG, this.decisionMakerTagValue, appendPrefix);
                    }
                    if (this.traceIdHighOrderBitsHexTagValue != null) {
                        appendPrefix = pTagsCodec.appendTag(sb, PTagsCodec.TRACE_ID_TAG, this.traceIdHighOrderBitsHexTagValue, appendPrefix);
                    }
                    List list = this.tagPairs;
                    if (list == null) {
                        list = Collections.EMPTY_LIST;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext() && !pTagsCodec.isTooLarge(appendPrefix)) {
                        appendPrefix = pTagsCodec.appendTag(sb, (TagElement) it.next(), (TagElement) it.next(), appendPrefix);
                    }
                }
                int appendSuffix = pTagsCodec.appendSuffix(sb, this, appendPrefix);
                str = (pTagsCodec.isTooLarge(appendSuffix) || pTagsCodec.isEmpty(appendSuffix, sb)) ? null : sb.toString();
            }
            String[] strArr2 = this.headerCache;
            if (str != null) {
                if (strArr2 == null) {
                    strArr2 = new String[PropagationTags$HeaderType.numValues];
                    this.headerCache = strArr2;
                }
                strArr2[propagationTags$HeaderType.ordinal()] = str;
            } else {
                if (strArr2 == null) {
                    strArr2 = new String[PropagationTags$HeaderType.numValues];
                    this.headerCache = strArr2;
                }
                strArr2[propagationTags$HeaderType.ordinal()] = "";
            }
        }
        if (str == "") {
            return null;
        }
        return str;
    }

    public void updateTraceIdHighOrderBits(long j) {
        if (this.traceIdHighOrderBits != j) {
            this.traceIdHighOrderBits = j;
            this.traceIdHighOrderBitsHexTagValue = j == 0 ? null : TagValue.from(LongStringUtils.toHexStringPadded(16, j));
            clearCachedHeader(PropagationTags$HeaderType.DATADOG);
        }
    }

    public final void updateTraceSamplingPriority(int i, int i2) {
        if ((i == -128 || !this.canChangeDecisionMaker) && i2 != -128) {
            return;
        }
        if (this.samplingPriority != i) {
            clearCachedHeader(PropagationTags$HeaderType.W3C);
        }
        this.samplingPriority = i;
        if (i <= 0) {
            if (this.decisionMakerTagValue != null) {
                clearCachedHeader(PropagationTags$HeaderType.DATADOG);
                clearCachedHeader(PropagationTags$HeaderType.W3C);
            }
            this.decisionMakerTagValue = null;
            return;
        }
        if (i2 == -128) {
            i2 = 0;
        }
        if (i2 >= 0) {
            TagValue from = TagValue.from("-" + i2);
            if (!from.equals(this.decisionMakerTagValue)) {
                clearCachedHeader(PropagationTags$HeaderType.DATADOG);
                clearCachedHeader(PropagationTags$HeaderType.W3C);
            }
            this.decisionMakerTagValue = from;
        }
    }
}
