package androidx.media3.exoplayer.audio;

import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda3;
import app.cash.zipline.CallResult;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final /* synthetic */ class AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CallResult f$0;

    public /* synthetic */ AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(CallResult callResult, int i, long j, long j2) {
        this.$r8$classId = 1;
        this.f$0 = callResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CallResult callResult = this.f$0;
        switch (i) {
            case 0:
                ExoPlayerImpl.ComponentListener componentListener = (ExoPlayerImpl.ComponentListener) callResult.serviceNames;
                String str = Util.DEVICE_DEBUG_INFO;
                DefaultAnalyticsCollector defaultAnalyticsCollector = ExoPlayerImpl.this.analyticsCollector;
                defaultAnalyticsCollector.sendEvent(defaultAnalyticsCollector.generateReadingMediaPeriodEventTime(), IptcConstants.IMAGE_RESOURCE_BLOCK_RAW_IMAGE_MODE, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(7));
                break;
            case 1:
                ExoPlayerImpl.ComponentListener componentListener2 = (ExoPlayerImpl.ComponentListener) callResult.serviceNames;
                String str2 = Util.DEVICE_DEBUG_INFO;
                DefaultAnalyticsCollector defaultAnalyticsCollector2 = ExoPlayerImpl.this.analyticsCollector;
                defaultAnalyticsCollector2.sendEvent(defaultAnalyticsCollector2.generateReadingMediaPeriodEventTime(), IptcConstants.IMAGE_RESOURCE_BLOCK_PRINT_FLAGS, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(20));
                break;
            case 2:
                ExoPlayerImpl.ComponentListener componentListener3 = (ExoPlayerImpl.ComponentListener) callResult.serviceNames;
                String str3 = Util.DEVICE_DEBUG_INFO;
                DefaultAnalyticsCollector defaultAnalyticsCollector3 = ExoPlayerImpl.this.analyticsCollector;
                defaultAnalyticsCollector3.sendEvent(defaultAnalyticsCollector3.generateReadingMediaPeriodEventTime(), IptcConstants.IMAGE_RESOURCE_BLOCK_BACKGROUND_COLOR, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(21));
                break;
            case 3:
                ExoPlayerImpl.ComponentListener componentListener4 = (ExoPlayerImpl.ComponentListener) callResult.serviceNames;
                String str4 = Util.DEVICE_DEBUG_INFO;
                DefaultAnalyticsCollector defaultAnalyticsCollector4 = ExoPlayerImpl.this.analyticsCollector;
                defaultAnalyticsCollector4.sendEvent(defaultAnalyticsCollector4.generateReadingMediaPeriodEventTime(), IptcConstants.IMAGE_RESOURCE_BLOCK_GRID_GUIDES_INFO, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(27));
                break;
            case 4:
                ExoPlayerImpl.ComponentListener componentListener5 = (ExoPlayerImpl.ComponentListener) callResult.serviceNames;
                String str5 = Util.DEVICE_DEBUG_INFO;
                DefaultAnalyticsCollector defaultAnalyticsCollector5 = ExoPlayerImpl.this.analyticsCollector;
                defaultAnalyticsCollector5.sendEvent(defaultAnalyticsCollector5.generateReadingMediaPeriodEventTime(), IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION, new DifferentialMotionFlingController$$ExternalSyntheticLambda0(29));
                break;
            case 5:
                ExoPlayerImpl.ComponentListener componentListener6 = (ExoPlayerImpl.ComponentListener) callResult.serviceNames;
                String str6 = Util.DEVICE_DEBUG_INFO;
                DefaultAnalyticsCollector defaultAnalyticsCollector6 = ExoPlayerImpl.this.analyticsCollector;
                defaultAnalyticsCollector6.sendEvent(defaultAnalyticsCollector6.generateReadingMediaPeriodEventTime(), IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO, new DifferentialMotionFlingController$$ExternalSyntheticLambda0(21));
                break;
            case 6:
                ExoPlayerImpl.ComponentListener componentListener7 = (ExoPlayerImpl.ComponentListener) callResult.serviceNames;
                String str7 = Util.DEVICE_DEBUG_INFO;
                DefaultAnalyticsCollector defaultAnalyticsCollector7 = ExoPlayerImpl.this.analyticsCollector;
                defaultAnalyticsCollector7.sendEvent(defaultAnalyticsCollector7.generateReadingMediaPeriodEventTime(), IptcConstants.IMAGE_RESOURCE_BLOCK_DISPLAY_INFO, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(10));
                break;
            case 7:
                ExoPlayerImpl.ComponentListener componentListener8 = (ExoPlayerImpl.ComponentListener) callResult.serviceNames;
                String str8 = Util.DEVICE_DEBUG_INFO;
                DefaultAnalyticsCollector defaultAnalyticsCollector8 = ExoPlayerImpl.this.analyticsCollector;
                defaultAnalyticsCollector8.sendEvent(defaultAnalyticsCollector8.generateReadingMediaPeriodEventTime(), 1031, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(15));
                break;
            default:
                ExoPlayerImpl.ComponentListener componentListener9 = (ExoPlayerImpl.ComponentListener) callResult.serviceNames;
                String str9 = Util.DEVICE_DEBUG_INFO;
                DefaultAnalyticsCollector defaultAnalyticsCollector9 = ExoPlayerImpl.this.analyticsCollector;
                defaultAnalyticsCollector9.sendEvent(defaultAnalyticsCollector9.generateReadingMediaPeriodEventTime(), IptcConstants.IMAGE_RESOURCE_BLOCK_DUOTONE_HALFTONING_INFO, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(18));
                break;
        }
    }

    public /* synthetic */ AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(int i, CallResult callResult, Object obj) {
        this.$r8$classId = i;
        this.f$0 = callResult;
    }

    public /* synthetic */ AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(CallResult callResult, long j) {
        this.$r8$classId = 2;
        this.f$0 = callResult;
    }

    public /* synthetic */ AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(CallResult callResult, String str, long j, long j2) {
        this.$r8$classId = 4;
        this.f$0 = callResult;
    }
}
