package androidx.media3.exoplayer.audio;

import android.animation.ValueAnimator;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import androidx.dynamicanimation.animation.AnimationHandler$DurationScaleChangeListener33$$ExternalSyntheticLambda0;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.extractor.mp4.BoxParser;
import com.squareup.cash.NavigationModule$Companion;

/* loaded from: classes3.dex */
public final class DefaultAudioOffloadSupportProvider implements DefaultAudioSink.AudioOffloadSupportProvider {
    public Object context;
    public Object isOffloadVariableRateSupported;

    public DefaultAudioOffloadSupportProvider(Context context) {
        this.context = context == null ? null : context.getApplicationContext();
    }

    public AudioOffloadSupport getAudioOffloadSupport(AudioAttributes audioAttributes, Format format2) {
        boolean booleanValue;
        int i;
        format2.getClass();
        audioAttributes.getClass();
        int i2 = format2.sampleRate;
        if (i2 == -1) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        Context context = (Context) this.context;
        Boolean bool = (Boolean) this.isOffloadVariableRateSupported;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = NavigationModule$Companion.getAudioManager(context).getParameters("offloadVariableRateSupported");
                this.isOffloadVariableRateSupported = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.isOffloadVariableRateSupported = Boolean.FALSE;
            }
            booleanValue = ((Boolean) this.isOffloadVariableRateSupported).booleanValue();
        }
        String str = format2.sampleMimeType;
        str.getClass();
        int encoding2 = MimeTypes.getEncoding(str, format2.codecs);
        if (encoding2 == 0 || (i = Build.VERSION.SDK_INT) < Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(encoding2)) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(format2.channelCount);
        if (audioTrackChannelConfig == 0) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i2).setChannelMask(audioTrackChannelConfig).setEncoding(encoding2).build();
            if (i >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, audioAttributes.getPlatformAudioAttributes());
                if ((directPlaybackSupport & 1) == 0) {
                    return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
                }
                r3 = (directPlaybackSupport & 3) == 3;
                BoxParser.StriData striData = new BoxParser.StriData();
                striData.hasLeftEyeView = true;
                striData.hasRightEyeView = r3;
                striData.eyeViewsReversed = booleanValue;
                return striData.build();
            }
            if (i < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(build, audioAttributes.getPlatformAudioAttributes())) {
                    return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
                }
                BoxParser.StriData striData2 = new BoxParser.StriData();
                striData2.hasLeftEyeView = true;
                striData2.eyeViewsReversed = booleanValue;
                return striData2.build();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, audioAttributes.getPlatformAudioAttributes());
            if (playbackOffloadSupport == 0) {
                return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            }
            BoxParser.StriData striData3 = new BoxParser.StriData();
            if (i > 32 && playbackOffloadSupport == 2) {
                r3 = true;
            }
            striData3.hasLeftEyeView = true;
            striData3.hasRightEyeView = r3;
            striData3.eyeViewsReversed = booleanValue;
            return striData3.build();
        } catch (IllegalArgumentException unused) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
    }

    public boolean unregister() {
        boolean unregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener((AnimationHandler$DurationScaleChangeListener33$$ExternalSyntheticLambda0) this.context);
        this.context = null;
        return unregisterDurationScaleChangeListener;
    }
}
