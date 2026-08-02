package androidx.camera.video.internal.encoder;

import androidx.biometric.BiometricPrompt;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class EncoderImpl$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EncoderImpl f$0;

    public /* synthetic */ EncoderImpl$$ExternalSyntheticLambda2(EncoderImpl encoderImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = encoderImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        EncoderImpl encoderImpl = this.f$0;
        switch (i) {
            case 0:
                switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(encoderImpl.mState)) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        encoderImpl.releaseInternal();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        encoderImpl.setState(7);
                        break;
                    case 6:
                    case 8:
                        break;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("Unknown state: ".concat(Recorder$$ExternalSyntheticOutline1.stringValueOf$6(encoderImpl.mState)));
                        break;
                }
            case 1:
                StringUtilsKt.d(encoderImpl.mTag, "signalEndOfInputStream");
                Futures.addCallback(encoderImpl.acquireInputBuffer(), new BiometricPrompt(encoderImpl, 15), encoderImpl.mEncoderExecutor);
                break;
            case 2:
                encoderImpl.mEncoderExecutor.execute(new EncoderImpl$$ExternalSyntheticLambda2(encoderImpl, 3));
                break;
            case 3:
                if (encoderImpl.mPendingCodecStop) {
                    StringUtilsKt.w(encoderImpl.mTag, "The data didn't reach the expected timestamp before timeout, stop the codec.");
                    encoderImpl.mLastDataStopTimestamp = null;
                    encoderImpl.signalCodecStop();
                    encoderImpl.mPendingCodecStop = false;
                    break;
                }
                break;
            case 4:
                int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(encoderImpl.mState);
                if (ordinal == 1) {
                    encoderImpl.requestKeyFrameToMediaCodec();
                    break;
                } else if (ordinal == 6 || ordinal == 8) {
                    a$$ExternalSyntheticBUOutline0.m$1("Encoder is released");
                    break;
                }
                break;
            default:
                encoderImpl.mSourceStoppedSignalled = true;
                if (encoderImpl.mIsFlushedAfterEndOfStream) {
                    if (!encoderImpl.mCodecStopAsFlushWorkaroundEnabled) {
                        StringUtilsKt.d(encoderImpl.mTag, "mMediaCodec.stop()");
                        encoderImpl.mMediaCodec.stop();
                    }
                    encoderImpl.reset();
                    break;
                }
                break;
        }
    }
}
