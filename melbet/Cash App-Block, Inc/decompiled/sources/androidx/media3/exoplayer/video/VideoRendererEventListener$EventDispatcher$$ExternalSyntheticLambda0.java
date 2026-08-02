package androidx.media3.exoplayer.video;

import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import androidx.media3.common.Format;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda3;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import coil3.svg.internal.AndroidSvg;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final /* synthetic */ class VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AndroidSvg f$0;

    public /* synthetic */ VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(AndroidSvg androidSvg, int i, long j) {
        this.$r8$classId = 3;
        this.f$0 = androidSvg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        AndroidSvg androidSvg = this.f$0;
        switch (i) {
            case 0:
                ExoPlayerImpl.ComponentListener componentListener = (ExoPlayerImpl.ComponentListener) androidSvg.renderOptions;
                String str = Util.DEVICE_DEBUG_INFO;
                DefaultAnalyticsCollector defaultAnalyticsCollector = ExoPlayerImpl.this.analyticsCollector;
                defaultAnalyticsCollector.sendEvent(defaultAnalyticsCollector.generateReadingMediaPeriodEventTime(), IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(8));
                break;
            case 1:
                ExoPlayerImpl.ComponentListener componentListener2 = (ExoPlayerImpl.ComponentListener) androidSvg.renderOptions;
                String str2 = Util.DEVICE_DEBUG_INFO;
                DefaultAnalyticsCollector defaultAnalyticsCollector2 = ExoPlayerImpl.this.analyticsCollector;
                defaultAnalyticsCollector2.sendEvent(defaultAnalyticsCollector2.generateReadingMediaPeriodEventTime(), IptcConstants.IMAGE_RESOURCE_BLOCK_JPEG_QUALITY, new DifferentialMotionFlingController$$ExternalSyntheticLambda0(25));
                break;
            case 2:
                ExoPlayerImpl.ComponentListener componentListener3 = (ExoPlayerImpl.ComponentListener) androidSvg.renderOptions;
                String str3 = Util.DEVICE_DEBUG_INFO;
                DefaultAnalyticsCollector defaultAnalyticsCollector3 = ExoPlayerImpl.this.analyticsCollector;
                defaultAnalyticsCollector3.sendEvent(defaultAnalyticsCollector3.generateReadingMediaPeriodEventTime(), IptcConstants.IMAGE_RESOURCE_BLOCK_EFFECTIVE_BW, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(2));
                break;
            case 3:
                ExoPlayerImpl.ComponentListener componentListener4 = (ExoPlayerImpl.ComponentListener) androidSvg.renderOptions;
                String str4 = Util.DEVICE_DEBUG_INFO;
                DefaultAnalyticsCollector defaultAnalyticsCollector4 = ExoPlayerImpl.this.analyticsCollector;
                defaultAnalyticsCollector4.sendEvent(defaultAnalyticsCollector4.generateEventTime((MediaSource$MediaPeriodId) defaultAnalyticsCollector4.mediaPeriodQueueTracker.f), IptcConstants.IMAGE_RESOURCE_BLOCK_DUOTONE_IMAGE_INFO, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(11));
                break;
            case 4:
                ExoPlayerImpl.ComponentListener componentListener5 = (ExoPlayerImpl.ComponentListener) androidSvg.renderOptions;
                String str5 = Util.DEVICE_DEBUG_INFO;
                DefaultAnalyticsCollector defaultAnalyticsCollector5 = ExoPlayerImpl.this.analyticsCollector;
                defaultAnalyticsCollector5.sendEvent(defaultAnalyticsCollector5.generateEventTime((MediaSource$MediaPeriodId) defaultAnalyticsCollector5.mediaPeriodQueueTracker.f), IptcConstants.IMAGE_RESOURCE_BLOCK_EPS_OPTIONS, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(12));
                break;
            case 5:
                ExoPlayerImpl.ComponentListener componentListener6 = (ExoPlayerImpl.ComponentListener) androidSvg.renderOptions;
                String str6 = Util.DEVICE_DEBUG_INFO;
                DefaultAnalyticsCollector defaultAnalyticsCollector6 = ExoPlayerImpl.this.analyticsCollector;
                defaultAnalyticsCollector6.sendEvent(defaultAnalyticsCollector6.generateReadingMediaPeriodEventTime(), IptcConstants.IMAGE_RESOURCE_BLOCK_BW_TRANSFER_FUNC, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(17));
                break;
            default:
                ExoPlayerImpl.ComponentListener componentListener7 = (ExoPlayerImpl.ComponentListener) androidSvg.renderOptions;
                String str7 = Util.DEVICE_DEBUG_INFO;
                DefaultAnalyticsCollector defaultAnalyticsCollector7 = ExoPlayerImpl.this.analyticsCollector;
                defaultAnalyticsCollector7.sendEvent(defaultAnalyticsCollector7.generateReadingMediaPeriodEventTime(), IptcConstants.IMAGE_RESOURCE_BLOCK_DUOTONE_TRANSFER_FUNCS, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(14));
                break;
        }
    }

    public /* synthetic */ VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(AndroidSvg androidSvg, long j, int i) {
        this.$r8$classId = 4;
        this.f$0 = androidSvg;
    }

    public /* synthetic */ VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(AndroidSvg androidSvg, Format format2, DecoderReuseEvaluation decoderReuseEvaluation) {
        this.$r8$classId = 6;
        this.f$0 = androidSvg;
    }

    public /* synthetic */ VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(AndroidSvg androidSvg, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = androidSvg;
    }

    public /* synthetic */ VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(AndroidSvg androidSvg, String str, long j, long j2) {
        this.$r8$classId = 0;
        this.f$0 = androidSvg;
    }
}
