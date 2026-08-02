package androidx.camera.video.internal.workaround;

import android.os.Build;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.Recorder;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.encoder.TimeProvider;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class VideoTimebaseConverter {
    public final CameraUseInconsistentTimebaseQuirk mCameraUseInconsistentTimebaseQuirk;
    public final Timebase mInputTimebase;
    public Timebase mResolvedInputTimebase;
    public final TimeProvider mTimeProvider;
    public long mUptimeToRealtimeOffsetUs = -1;

    public VideoTimebaseConverter(Recorder.AnonymousClass4 anonymousClass4, Timebase timebase, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.mTimeProvider = anonymousClass4;
        this.mInputTimebase = timebase;
        this.mCameraUseInconsistentTimebaseQuirk = cameraUseInconsistentTimebaseQuirk;
    }

    public final long convertToUptimeUs(long j) {
        boolean z;
        String str;
        String str2;
        Timebase timebase = this.mResolvedInputTimebase;
        TimeProvider timeProvider = this.mTimeProvider;
        if (timebase == null) {
            CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk = this.mCameraUseInconsistentTimebaseQuirk;
            Timebase timebase2 = this.mInputTimebase;
            if (cameraUseInconsistentTimebaseQuirk != null) {
                StringUtilsKt.w("VideoTimebaseConverter", "CameraUseInconsistentTimebaseQuirk is enabled");
            } else {
                z = timeProvider.realtimeUs() - timeProvider.uptimeUs() > 3000000;
                this.mResolvedInputTimebase = timebase2;
            }
            Timebase timebase3 = Math.abs(j - timeProvider.realtimeUs()) < Math.abs(j - timeProvider.uptimeUs()) ? Timebase.REALTIME : Timebase.UPTIME;
            if (!z || timebase3 == timebase2) {
                StringUtilsKt.d("VideoTimebaseConverter", "Detect input timebase = " + timebase3);
            } else {
                int i = Build.VERSION.SDK_INT;
                if (i >= 31) {
                    StringBuilder sb = new StringBuilder(", SOC: ");
                    str2 = Build.SOC_MODEL;
                    sb.append(str2);
                    str = sb.toString();
                } else {
                    str = "";
                }
                StringUtilsKt.e("VideoTimebaseConverter", String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i), str, this.mInputTimebase, timebase3));
            }
            timebase2 = timebase3;
            this.mResolvedInputTimebase = timebase2;
        }
        int ordinal = this.mResolvedInputTimebase.ordinal();
        if (ordinal == 0) {
            return j;
        }
        if (ordinal != 1) {
            OptionalProvider$$ExternalSyntheticLambda0.m$2(this.mResolvedInputTimebase, "Unknown timebase: ");
            return 0L;
        }
        if (this.mUptimeToRealtimeOffsetUs == -1) {
            long j2 = Long.MAX_VALUE;
            long j3 = 0;
            for (int i2 = 0; i2 < 3; i2++) {
                long uptimeUs = timeProvider.uptimeUs();
                long realtimeUs = timeProvider.realtimeUs();
                long uptimeUs2 = timeProvider.uptimeUs();
                long j4 = uptimeUs2 - uptimeUs;
                if (i2 == 0 || j4 < j2) {
                    j3 = realtimeUs - ((uptimeUs + uptimeUs2) >> 1);
                    j2 = j4;
                }
            }
            this.mUptimeToRealtimeOffsetUs = Math.max(0L, j3);
            StringUtilsKt.d("VideoTimebaseConverter", "mUptimeToRealtimeOffsetUs = " + this.mUptimeToRealtimeOffsetUs);
        }
        return j - this.mUptimeToRealtimeOffsetUs;
    }
}
