package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.util.Range;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class EncoderImpl$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EncoderImpl f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ EncoderImpl$$ExternalSyntheticLambda1(EncoderImpl encoderImpl, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = encoderImpl;
        this.f$1 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                EncoderImpl encoderImpl = this.f$0;
                long j = this.f$1;
                switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(encoderImpl.mState)) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        break;
                    case 1:
                        StringUtilsKt.d(encoderImpl.mTag, "Pause on ".concat(DebugUtils.readableUs(j)));
                        encoderImpl.mActivePauseResumeTimeRanges.addLast(Range.create(Long.valueOf(j), Long.MAX_VALUE));
                        encoderImpl.setState(3);
                        break;
                    case 4:
                        encoderImpl.setState(6);
                        break;
                    case 6:
                    case 8:
                        a$$ExternalSyntheticBUOutline0.m$1("Encoder is released");
                        break;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("Unknown state: ".concat(Recorder$$ExternalSyntheticOutline1.stringValueOf$6(encoderImpl.mState)));
                        break;
                }
            default:
                EncoderImpl encoderImpl2 = this.f$0;
                long j2 = this.f$1;
                switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(encoderImpl2.mState)) {
                    case 0:
                        encoderImpl2.mLastDataStopTimestamp = null;
                        StringUtilsKt.d(encoderImpl2.mTag, "Start on ".concat(DebugUtils.readableUs(j2)));
                        try {
                            if (encoderImpl2.mIsFlushedAfterEndOfStream) {
                                encoderImpl2.reset();
                            }
                            encoderImpl2.mStartStopTimeRangeUs = Range.create(Long.valueOf(j2), Long.MAX_VALUE);
                            StringUtilsKt.d(encoderImpl2.mTag, "mMediaCodec.start()");
                            encoderImpl2.mMediaCodec.start();
                            Encoder$EncoderInput encoder$EncoderInput = encoderImpl2.mEncoderInput;
                            if (encoder$EncoderInput instanceof EncoderImpl.ByteBufferInput) {
                                ((EncoderImpl.ByteBufferInput) encoder$EncoderInput).setActive(true);
                            }
                            encoderImpl2.setState(2);
                            break;
                        } catch (MediaCodec.CodecException e) {
                            encoderImpl2.handleEncodeError(1, e.getMessage(), e);
                        }
                    case 1:
                    case 4:
                    case 7:
                        break;
                    case 2:
                        encoderImpl2.mLastDataStopTimestamp = null;
                        Range range = (Range) encoderImpl2.mActivePauseResumeTimeRanges.removeLast();
                        TransactorKt.checkState("There should be a \"pause\" before \"resume\"", range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE);
                        Long l = (Long) range.getLower();
                        long longValue = l.longValue();
                        encoderImpl2.mActivePauseResumeTimeRanges.addLast(Range.create(l, Long.valueOf(j2)));
                        StringUtilsKt.d(encoderImpl2.mTag, "Resume on " + DebugUtils.readableUs(j2) + "\nPaused duration = " + DebugUtils.readableUs(j2 - longValue));
                        if ((encoderImpl2.mIsVideoEncoder || DeviceQuirks.sQuirks.get(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!encoderImpl2.mIsVideoEncoder || DeviceQuirks.sQuirks.get(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                            encoderImpl2.setMediaCodecPaused(false);
                            Encoder$EncoderInput encoder$EncoderInput2 = encoderImpl2.mEncoderInput;
                            if (encoder$EncoderInput2 instanceof EncoderImpl.ByteBufferInput) {
                                ((EncoderImpl.ByteBufferInput) encoder$EncoderInput2).setActive(true);
                            }
                        }
                        if (encoderImpl2.mIsVideoEncoder) {
                            encoderImpl2.requestKeyFrameToMediaCodec();
                        }
                        encoderImpl2.setState(2);
                        break;
                    case 3:
                    case 5:
                        encoderImpl2.setState(5);
                        break;
                    case 6:
                    case 8:
                        a$$ExternalSyntheticBUOutline0.m$1("Encoder is released");
                        break;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("Unknown state: ".concat(Recorder$$ExternalSyntheticOutline1.stringValueOf$6(encoderImpl2.mState)));
                        break;
                }
        }
    }
}
