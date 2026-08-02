package androidx.camera.video;

import android.os.Build;
import androidx.biometric.BiometricPrompt;
import androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardImpl;
import androidx.camera.video.Recorder;
import androidx.camera.viewfinder.core.impl.CloseGuardApi30Impl;
import androidx.room.CoroutinesRoom;
import androidx.room.TransactorKt;
import java.util.concurrent.atomic.AtomicBoolean;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class Recording implements AutoCloseable {
    public final BiometricPrompt mCloseGuard;
    public final AtomicBoolean mIsClosed;
    public final FileOutputOptions mOutputOptions;
    public final Recorder mRecorder;
    public final long mRecordingId;

    public Recording(Recorder recorder, long j, FileOutputOptions fileOutputOptions, boolean z) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.mIsClosed = atomicBoolean;
        int i = 11;
        BiometricPrompt biometricPrompt = Build.VERSION.SDK_INT >= 30 ? new BiometricPrompt(new CloseGuardApi30Impl(1), i) : new BiometricPrompt(new CoroutinesRoom.Companion(6), i);
        this.mCloseGuard = biometricPrompt;
        this.mRecorder = recorder;
        this.mRecordingId = j;
        this.mOutputOptions = fileOutputOptions;
        if (z) {
            atomicBoolean.set(true);
        } else {
            ((CloseGuardHelper$CloseGuardImpl) biometricPrompt.mClientFragmentManager).open("stop");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        stopWithError(0, null);
    }

    public final void finalize() {
        try {
            ((CloseGuardHelper$CloseGuardImpl) this.mCloseGuard.mClientFragmentManager).warnIfOpen();
            stopWithError(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void stopWithError(int i, RuntimeException runtimeException) {
        final int i2;
        final RuntimeException runtimeException2;
        ((CloseGuardHelper$CloseGuardImpl) this.mCloseGuard.mClientFragmentManager).close();
        if (this.mIsClosed.getAndSet(true)) {
            return;
        }
        final Recorder recorder = this.mRecorder;
        synchronized (recorder.mLock) {
            try {
                if (!Recorder.isSameRecording(this, recorder.mPendingRecordingRecord) && !Recorder.isSameRecording(this, recorder.mActiveRecordingRecord)) {
                    StringUtilsKt.d("Recorder", "stop() called on a recording that is no longer active: " + this.mOutputOptions);
                    return;
                }
                AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord = null;
                switch (recorder.mState.ordinal()) {
                    case 0:
                    case 3:
                        throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                    case 1:
                    case 2:
                        i2 = i;
                        runtimeException2 = runtimeException;
                        TransactorKt.checkState(null, Recorder.isSameRecording(this, recorder.mPendingRecordingRecord));
                        AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord2 = recorder.mPendingRecordingRecord;
                        recorder.mPendingRecordingRecord = null;
                        recorder.restoreNonPendingState();
                        autoValue_Recorder_RecordingRecord = autoValue_Recorder_RecordingRecord2;
                        if (autoValue_Recorder_RecordingRecord != null) {
                            if (i2 == 10) {
                                StringUtilsKt.e("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                            }
                            recorder.finalizePendingRecording(autoValue_Recorder_RecordingRecord, 8, new RuntimeException("Recording was stopped before any data could be produced.", runtimeException2));
                            return;
                        }
                        return;
                    case 4:
                    case 5:
                        recorder.setState(Recorder.State.STOPPING);
                        final long nanoTime = System.nanoTime() / 1000;
                        final AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord3 = recorder.mActiveRecordingRecord;
                        i2 = i;
                        runtimeException2 = runtimeException;
                        recorder.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.Recorder$$ExternalSyntheticLambda9
                            @Override // java.lang.Runnable
                            public final void run() {
                                Recorder.this.stopInternal(autoValue_Recorder_RecordingRecord3, nanoTime, i2, runtimeException2);
                            }
                        });
                        if (autoValue_Recorder_RecordingRecord != null) {
                        }
                        break;
                    case 6:
                    case 7:
                        TransactorKt.checkState(null, Recorder.isSameRecording(this, recorder.mActiveRecordingRecord));
                    default:
                        i2 = i;
                        runtimeException2 = runtimeException;
                        if (autoValue_Recorder_RecordingRecord != null) {
                        }
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
