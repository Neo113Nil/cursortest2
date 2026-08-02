package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.core.app.NotificationManagerCompat;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Player;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.tracing.Trace;
import com.android.volley.toolbox.HurlStack;
import com.google.common.base.Ascii;

/* loaded from: classes3.dex */
public interface ExoPlayer extends Player {

    public final class Builder {
        public static final int DEFAULT_STUCK_PLAYING_DETECTION_TIMEOUT_MS;
        public static final boolean experimentalEnableStuckPlayingDetection;
        public final AudioAttributes audioAttributes;
        public final boolean avoidLoadingWhileEnded;
        public final ExoPlayer$Builder$$ExternalSyntheticLambda0 bandwidthMeterSupplier;
        public boolean buildCalled;
        public final SystemClock clock;
        public final Context context;
        public final long detachSurfaceTimeoutMs;
        public final DefaultLivePlaybackSpeedControl livePlaybackSpeedControl;
        public final Looper looper;
        public final long maxSeekToPreviousPositionMs;
        public final ExoPlayer$Builder$$ExternalSyntheticLambda0 mediaSourceFactorySupplier;
        public final String playerName;
        public final int priority;
        public final long releaseTimeoutMs;
        public final ExoPlayer$Builder$$ExternalSyntheticLambda0 renderersFactorySupplier;
        public final ScrubbingModeParameters scrubbingModeParameters;
        public final long seekBackIncrementMs;
        public final long seekForwardIncrementMs;
        public final SeekParameters seekParameters;
        public final int stuckBufferingDetectionTimeoutMs;
        public final int stuckPlayingDetectionTimeoutMs;
        public final int stuckPlayingNotEndingTimeoutMs;
        public final int stuckSuppressedDetectionTimeoutMs;
        public final ExoPlayer$Builder$$ExternalSyntheticLambda0 trackSelectorSupplier;
        public final boolean useLazyPreparation;
        public final boolean usePlatformDiagnostics;
        public final int videoScalingMode;

        static {
            String str = Util.DEVICE_DEBUG_INFO;
            String lowerCase = Ascii.toLowerCase(Build.DEVICE);
            DEFAULT_STUCK_PLAYING_DETECTION_TIMEOUT_MS = (lowerCase.contains("emulator") || lowerCase.contains("emu64a") || lowerCase.contains("emu64x") || lowerCase.contains("generic")) ? 30000 : 10000;
            experimentalEnableStuckPlayingDetection = true;
        }

        public Builder(Context context) {
            ExoPlayer$Builder$$ExternalSyntheticLambda0 exoPlayer$Builder$$ExternalSyntheticLambda0 = new ExoPlayer$Builder$$ExternalSyntheticLambda0(context, 0);
            ExoPlayer$Builder$$ExternalSyntheticLambda0 exoPlayer$Builder$$ExternalSyntheticLambda02 = new ExoPlayer$Builder$$ExternalSyntheticLambda0(context, 2);
            ExoPlayer$Builder$$ExternalSyntheticLambda0 exoPlayer$Builder$$ExternalSyntheticLambda03 = new ExoPlayer$Builder$$ExternalSyntheticLambda0(context, 3);
            ExoPlayer$Builder$$ExternalSyntheticLambda0 exoPlayer$Builder$$ExternalSyntheticLambda04 = new ExoPlayer$Builder$$ExternalSyntheticLambda0(context, 4);
            context.getClass();
            this.context = context;
            this.renderersFactorySupplier = exoPlayer$Builder$$ExternalSyntheticLambda0;
            this.mediaSourceFactorySupplier = exoPlayer$Builder$$ExternalSyntheticLambda02;
            this.trackSelectorSupplier = exoPlayer$Builder$$ExternalSyntheticLambda03;
            this.bandwidthMeterSupplier = exoPlayer$Builder$$ExternalSyntheticLambda04;
            String str = Util.DEVICE_DEBUG_INFO;
            Looper myLooper = Looper.myLooper();
            this.looper = myLooper == null ? Looper.getMainLooper() : myLooper;
            this.audioAttributes = AudioAttributes.DEFAULT;
            this.videoScalingMode = 1;
            this.useLazyPreparation = true;
            this.seekParameters = SeekParameters.DEFAULT;
            this.seekBackIncrementMs = 5000L;
            this.seekForwardIncrementMs = 15000L;
            this.maxSeekToPreviousPositionMs = 3000L;
            this.scrubbingModeParameters = ScrubbingModeParameters.DEFAULT;
            this.livePlaybackSpeedControl = new DefaultLivePlaybackSpeedControl(Util.msToUs(20L), Util.msToUs(500L));
            this.clock = SystemClock.DEFAULT;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = 2000L;
            this.stuckBufferingDetectionTimeoutMs = 600000;
            boolean z = experimentalEnableStuckPlayingDetection;
            this.stuckPlayingDetectionTimeoutMs = z ? DEFAULT_STUCK_PLAYING_DETECTION_TIMEOUT_MS : Integer.MAX_VALUE;
            this.stuckPlayingNotEndingTimeoutMs = z ? 60000 : Integer.MAX_VALUE;
            this.stuckSuppressedDetectionTimeoutMs = 600000;
            this.usePlatformDiagnostics = true;
            this.playerName = "";
            this.priority = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            new HurlStack();
            this.avoidLoadingWhileEnded = true;
        }

        public final ExoPlayerImpl build() {
            Trace.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new ExoPlayerImpl(this);
        }
    }

    public final class PreloadConfiguration {
        public static final PreloadConfiguration DEFAULT = new PreloadConfiguration();
    }

    boolean isScrubbingModeEnabled();

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z);
}
