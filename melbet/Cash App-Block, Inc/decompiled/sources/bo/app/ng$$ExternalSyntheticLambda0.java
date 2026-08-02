package bo.app;

import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.PriorityTask;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.upstream.SlidingPercentile;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import androidx.media3.extractor.text.webvtt.WebvttCueInfo;
import androidx.media3.extractor.text.webvtt.WebvttCueParser;
import androidx.media3.muxer.Track;
import androidx.media3.ui.SpannedToHtmlConverter;
import com.braze.models.cards.Card;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import com.fillr.browsersdk.model.FillrWidget;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcParser;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcRecord;

/* loaded from: classes3.dex */
public final /* synthetic */ class ng$$ExternalSyntheticLambda0 implements Comparator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ng$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int defaultCardHandling$lambda$0;
        FillrWidget.WidgetType widgetType;
        FillrWidget.WidgetType widgetType2;
        int lambda$writeIPTCBlock$0;
        int lambda$static$0;
        switch (this.$r8$classId) {
            case 0:
                return ng.a((y9) obj, (y9) obj2);
            case 1:
                return ((AutoValue_Config_Option) obj).id.compareTo(((AutoValue_Config_Option) obj2).id);
            case 2:
                return Intrinsics.compare(((PriorityTask) obj2).priority, ((PriorityTask) obj).priority);
            case 3:
                return Intrinsics.compare(((LazyLayoutMeasuredItem) obj).getIndex(), ((LazyLayoutMeasuredItem) obj2).getIndex());
            case 4:
                return Integer.parseInt(((String) obj).split(":")[0]) - Integer.parseInt(((String) obj2).split(":")[0]);
            case 5:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 6:
                return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
            case 7:
                return ((Format) obj2).bitrate - ((Format) obj).bitrate;
            case 8:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 9:
                return Integer.compare(((DefaultTrackSelector.ImageTrackInfo) ((List) obj).get(0)).pixelCount, ((DefaultTrackSelector.ImageTrackInfo) ((List) obj2).get(0)).pixelCount);
            case 10:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i2 = 13;
                int i3 = 14;
                return ComparisonChain.AnonymousClass1.classify(DefaultTrackSelector.VideoTrackInfo.$r8$lambda$mN6XX8i7M4d49ufL_31PyFTAA68((DefaultTrackSelector.VideoTrackInfo) Collections.max(list, new ng$$ExternalSyntheticLambda0(i2)), (DefaultTrackSelector.VideoTrackInfo) Collections.max(list2, new ng$$ExternalSyntheticLambda0(i2)))).compare(list.size(), list2.size()).compare((DefaultTrackSelector.VideoTrackInfo) Collections.max(list, new ng$$ExternalSyntheticLambda0(i3)), (DefaultTrackSelector.VideoTrackInfo) Collections.max(list2, new ng$$ExternalSyntheticLambda0(i3)), new ng$$ExternalSyntheticLambda0(i3)).result();
            case 11:
                return ((DefaultTrackSelector.AudioTrackInfo) Collections.max((List) obj)).compareTo((DefaultTrackSelector.AudioTrackInfo) Collections.max((List) obj2));
            case 12:
                return ((DefaultTrackSelector.TextTrackInfo) ((List) obj).get(0)).compareTo((DefaultTrackSelector.TextTrackInfo) ((List) obj2).get(0));
            case 13:
                return DefaultTrackSelector.VideoTrackInfo.$r8$lambda$mN6XX8i7M4d49ufL_31PyFTAA68((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
            case 14:
                DefaultTrackSelector.VideoTrackInfo videoTrackInfo = (DefaultTrackSelector.VideoTrackInfo) obj;
                DefaultTrackSelector.VideoTrackInfo videoTrackInfo2 = (DefaultTrackSelector.VideoTrackInfo) obj2;
                boolean z = videoTrackInfo.isWithinMaxConstraints;
                int i4 = videoTrackInfo.bitrate;
                Ordering reverse = (z && videoTrackInfo.isWithinRendererCapabilities) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse();
                videoTrackInfo.parameters.getClass();
                ComparisonChain compare = ComparisonChain.ACTIVE.compareFalseFirst(videoTrackInfo.isHdr, videoTrackInfo2.isHdr).compare(Integer.valueOf(videoTrackInfo.pixelCount), Integer.valueOf(videoTrackInfo2.pixelCount), reverse);
                if (videoTrackInfo.usesPrimaryOrFallbackDecoder && videoTrackInfo.usesHardwareAcceleration) {
                    compare = compare.compare(videoTrackInfo.codecPreferenceScore, videoTrackInfo2.codecPreferenceScore);
                }
                return compare.compareFalseFirst(videoTrackInfo.usesPrimaryDecoder, videoTrackInfo2.usesPrimaryDecoder).compare(Integer.valueOf(i4), Integer.valueOf(videoTrackInfo2.bitrate), reverse).result();
            case 15:
                return ((SlidingPercentile.Sample) obj).index - ((SlidingPercentile.Sample) obj2).index;
            case 16:
                return Float.compare(((SlidingPercentile.Sample) obj).value, ((SlidingPercentile.Sample) obj2).value);
            case 17:
                return Integer.compare(((Cea708Decoder.Cea708CueInfo) obj2).priority, ((Cea708Decoder.Cea708CueInfo) obj).priority);
            case 18:
                return Integer.compare(((WebvttCueParser.Element) obj).startTag.position, ((WebvttCueParser.Element) obj2).startTag.position);
            case 19:
                return Long.compare(((WebvttCueInfo) obj).startTimeUs, ((WebvttCueInfo) obj2).startTimeUs);
            case 20:
                ((Track) obj).getClass();
                ((Track) obj2).getClass();
                return Integer.compare(1, 1);
            case 21:
                SpannedToHtmlConverter.SpanInfo spanInfo = (SpannedToHtmlConverter.SpanInfo) obj;
                SpannedToHtmlConverter.SpanInfo spanInfo2 = (SpannedToHtmlConverter.SpanInfo) obj2;
                int compare2 = Integer.compare(spanInfo2.end, spanInfo.end);
                if (compare2 != 0) {
                    return compare2;
                }
                int compareTo = spanInfo.openingTag.compareTo(spanInfo2.openingTag);
                return compareTo != 0 ? compareTo : spanInfo.closingTag.compareTo(spanInfo2.closingTag);
            case 22:
                SpannedToHtmlConverter.SpanInfo spanInfo3 = (SpannedToHtmlConverter.SpanInfo) obj;
                SpannedToHtmlConverter.SpanInfo spanInfo4 = (SpannedToHtmlConverter.SpanInfo) obj2;
                int compare3 = Integer.compare(spanInfo4.start, spanInfo3.start);
                if (compare3 != 0) {
                    return compare3;
                }
                int compareTo2 = spanInfo4.openingTag.compareTo(spanInfo3.openingTag);
                return compareTo2 != 0 ? compareTo2 : spanInfo4.closingTag.compareTo(spanInfo3.closingTag);
            case 23:
                defaultCardHandling$lambda$0 = BrazeContentCardUtils.defaultCardHandling$lambda$0((Card) obj, (Card) obj2);
                return defaultCardHandling$lambda$0;
            case 24:
                FillrWidget.WidgetType widgetType3 = (FillrWidget.WidgetType) obj;
                FillrWidget.WidgetType widgetType4 = (FillrWidget.WidgetType) obj2;
                FillrWidget.WidgetType widgetType5 = FillrWidget.WidgetType.MOBILE;
                if (widgetType3 == widgetType5 || widgetType3 == (widgetType = FillrWidget.WidgetType.LEGACY_MOBILE)) {
                    return -1;
                }
                if (widgetType4 == widgetType5 || widgetType4 == widgetType || widgetType3 == (widgetType2 = FillrWidget.WidgetType.PAGE_CLASSIFIER)) {
                    return 1;
                }
                return widgetType4 == widgetType2 ? -1 : 0;
            case 25:
                return Integer.parseInt((String) obj) - Integer.parseInt((String) obj2);
            case 26:
                return String.valueOf(obj).compareTo(String.valueOf(obj2));
            case 27:
                lambda$writeIPTCBlock$0 = IptcParser.lambda$writeIPTCBlock$0((IptcRecord) obj, (IptcRecord) obj2);
                return lambda$writeIPTCBlock$0;
            default:
                lambda$static$0 = IptcRecord.lambda$static$0((IptcRecord) obj, (IptcRecord) obj2);
                return lambda$static$0;
        }
    }
}
