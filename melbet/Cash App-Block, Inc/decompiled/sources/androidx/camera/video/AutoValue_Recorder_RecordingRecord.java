package androidx.camera.video;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.SessionConfig$$ExternalSyntheticLambda0;
import androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardImpl;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.viewfinder.core.impl.CloseGuardApi30Impl;
import androidx.core.util.Consumer;
import androidx.room.CoroutinesRoom;
import com.google.mlkit.vision.face.internal.zzm;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.brotli.dec.HuffmanTreeGroup;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class AutoValue_Recorder_RecordingRecord implements AutoCloseable {
    public final Executor getCallbackExecutor;
    public final Consumer getEventListener;
    public final FileOutputOptions getOutputOptions;
    public final long getRecordingId;
    public final boolean hasAudioEnabled;
    public final AtomicReference mAudioSourceSupplier;
    public final BiometricPrompt mCloseGuard;
    public final AtomicBoolean mInitialized;
    public final AtomicBoolean mMuted;
    public final AtomicReference mMuxerSupplier;
    public final AtomicReference mRecordingFinalizer;
    public final zzm mRecordingState;

    public AutoValue_Recorder_RecordingRecord(FileOutputOptions fileOutputOptions, Executor executor, Consumer consumer, boolean z, long j) {
        int i = 11;
        this.mCloseGuard = Build.VERSION.SDK_INT >= 30 ? new BiometricPrompt(new CloseGuardApi30Impl(1), i) : new BiometricPrompt(new CoroutinesRoom.Companion(6), i);
        this.mInitialized = new AtomicBoolean(false);
        this.mMuxerSupplier = new AtomicReference(null);
        this.mAudioSourceSupplier = new AtomicReference(null);
        this.mRecordingFinalizer = new AtomicReference(new SessionConfig$$ExternalSyntheticLambda0(3));
        this.mMuted = new AtomicBoolean(false);
        this.mRecordingState = new zzm(Boolean.FALSE);
        this.getOutputOptions = fileOutputOptions;
        this.getCallbackExecutor = executor;
        this.getEventListener = consumer;
        this.hasAudioEnabled = z;
        this.getRecordingId = j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        finalizeRecording(Uri.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_Recorder_RecordingRecord)) {
            return false;
        }
        AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord = (AutoValue_Recorder_RecordingRecord) obj;
        if (!this.getOutputOptions.equals(autoValue_Recorder_RecordingRecord.getOutputOptions)) {
            return false;
        }
        Executor executor = autoValue_Recorder_RecordingRecord.getCallbackExecutor;
        Executor executor2 = this.getCallbackExecutor;
        if (executor2 == null) {
            if (executor != null) {
                return false;
            }
        } else if (!executor2.equals(executor)) {
            return false;
        }
        Consumer consumer = autoValue_Recorder_RecordingRecord.getEventListener;
        Consumer consumer2 = this.getEventListener;
        if (consumer2 == null) {
            if (consumer != null) {
                return false;
            }
        } else if (!consumer2.equals(consumer)) {
            return false;
        }
        return this.hasAudioEnabled == autoValue_Recorder_RecordingRecord.hasAudioEnabled && this.getRecordingId == autoValue_Recorder_RecordingRecord.getRecordingId;
    }

    public final void finalize() {
        try {
            ((CloseGuardHelper$CloseGuardImpl) this.mCloseGuard.mClientFragmentManager).warnIfOpen();
            Consumer consumer = (Consumer) this.mRecordingFinalizer.getAndSet(null);
            if (consumer != null) {
                finalizeRecordingInternal(consumer, Uri.EMPTY);
            }
        } finally {
            super.finalize();
        }
    }

    public final void finalizeRecording(Uri uri) {
        if (this.mInitialized.get()) {
            finalizeRecordingInternal((Consumer) this.mRecordingFinalizer.getAndSet(null), uri);
        }
    }

    public final void finalizeRecordingInternal(Consumer consumer, Uri uri) {
        if (consumer != null) {
            ((CloseGuardHelper$CloseGuardImpl) this.mCloseGuard.mClientFragmentManager).close();
            consumer.accept(uri);
        } else {
            throw new AssertionError("Recording " + this + " has already been finalized");
        }
    }

    public final int hashCode() {
        int hashCode = (this.getOutputOptions.mFileOutputOptionsInternal.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.getCallbackExecutor;
        int hashCode2 = (hashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        Consumer consumer = this.getEventListener;
        int hashCode3 = (((((hashCode2 ^ (consumer != null ? consumer.hashCode() : 0)) * 1000003) ^ (this.hasAudioEnabled ? 1231 : 1237)) * 1000003) ^ 1237) * 1000003;
        long j = this.getRecordingId;
        return ((int) ((j >>> 32) ^ j)) ^ hashCode3;
    }

    public final void initializeRecording(Context context, ZslControlImpl$$ExternalSyntheticLambda1 zslControlImpl$$ExternalSyntheticLambda1) {
        if (this.mInitialized.getAndSet(true)) {
            throw new AssertionError("Recording " + this + " has already been initialized");
        }
        ((CloseGuardHelper$CloseGuardImpl) this.mCloseGuard.mClientFragmentManager).open("finalizeRecording");
        this.mMuxerSupplier.set(new Recorder$RecordingRecord$$ExternalSyntheticLambda2(this, zslControlImpl$$ExternalSyntheticLambda1, this.getOutputOptions));
        if (this.hasAudioEnabled) {
            if (Build.VERSION.SDK_INT < 31) {
                context = null;
            }
            this.mAudioSourceSupplier.set(new Recorder$RecordingRecord$1(context));
        }
    }

    public final HuffmanTreeGroup performOneTimeMuxerCreation(int i, Recorder$$ExternalSyntheticLambda17 recorder$$ExternalSyntheticLambda17) {
        if (!this.mInitialized.get()) {
            throw new AssertionError("Recording " + this + " has not been initialized");
        }
        Recorder$RecordingRecord$$ExternalSyntheticLambda2 recorder$RecordingRecord$$ExternalSyntheticLambda2 = (Recorder$RecordingRecord$$ExternalSyntheticLambda2) this.mMuxerSupplier.getAndSet(null);
        if (recorder$RecordingRecord$$ExternalSyntheticLambda2 == null) {
            ZslControlImpl$$ExternalSyntheticLambda1.m(this, "One-time muxer creation has already occurred for recording ");
            return null;
        }
        try {
            return recorder$RecordingRecord$$ExternalSyntheticLambda2.get(i, recorder$$ExternalSyntheticLambda17);
        } catch (RuntimeException e) {
            throw new IOException("Failed to create Muxer by " + e, e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordingRecord{getOutputOptions=");
        sb.append(this.getOutputOptions);
        sb.append(", getCallbackExecutor=");
        sb.append(this.getCallbackExecutor);
        sb.append(", getEventListener=");
        sb.append(this.getEventListener);
        sb.append(", hasAudioEnabled=");
        sb.append(this.hasAudioEnabled);
        sb.append(", isPersistent=false, getRecordingId=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.getRecordingId, "}", sb);
    }

    public final void updateVideoRecordEvent(VideoRecordEvent videoRecordEvent, boolean z) {
        int i;
        String str;
        FileOutputOptions fileOutputOptions = videoRecordEvent.mOutputOptions;
        FileOutputOptions fileOutputOptions2 = this.getOutputOptions;
        if (!Objects.equals(fileOutputOptions, fileOutputOptions2)) {
            f$$ExternalSyntheticLambda0.m(fileOutputOptions, ", Expected: ", fileOutputOptions2, "]", "Attempted to update event listener with event from incorrect recording [Recording: ");
            return;
        }
        if (z) {
            String concat = "Sending VideoRecordEvent ".concat(videoRecordEvent.getClass().getSimpleName());
            if ((videoRecordEvent instanceof VideoRecordEvent.Finalize) && (i = ((VideoRecordEvent.Finalize) videoRecordEvent).mError) != 0) {
                switch (i) {
                    case 0:
                        str = "ERROR_NONE";
                        break;
                    case 1:
                        str = "ERROR_UNKNOWN";
                        break;
                    case 2:
                        str = "ERROR_FILE_SIZE_LIMIT_REACHED";
                        break;
                    case 3:
                        str = "ERROR_INSUFFICIENT_STORAGE";
                        break;
                    case 4:
                        str = "ERROR_SOURCE_INACTIVE";
                        break;
                    case 5:
                        str = "ERROR_INVALID_OUTPUT_OPTIONS";
                        break;
                    case 6:
                        str = "ERROR_ENCODING_FAILED";
                        break;
                    case 7:
                        str = "ERROR_RECORDER_ERROR";
                        break;
                    case 8:
                        str = "ERROR_NO_VALID_DATA";
                        break;
                    case 9:
                        str = "ERROR_DURATION_LIMIT_REACHED";
                        break;
                    case 10:
                        str = "ERROR_RECORDING_GARBAGE_COLLECTED";
                        break;
                    default:
                        str = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unknown(", ")");
                        break;
                }
                concat = concat.concat(" [error: " + str + "]");
            }
            StringUtilsKt.d("Recorder", concat);
        }
        boolean z2 = videoRecordEvent instanceof VideoRecordEvent.Start;
        zzm zzmVar = this.mRecordingState;
        if (z2 || (videoRecordEvent instanceof VideoRecordEvent.Resume)) {
            zzmVar.updateStateInternal(Boolean.TRUE);
        } else if ((videoRecordEvent instanceof VideoRecordEvent.Pause) || (videoRecordEvent instanceof VideoRecordEvent.Finalize)) {
            zzmVar.updateStateInternal(Boolean.FALSE);
        }
        Executor executor = this.getCallbackExecutor;
        if (executor == null || this.getEventListener == null) {
            return;
        }
        try {
            executor.execute(new Recorder$$ExternalSyntheticLambda15(7, this, videoRecordEvent));
        } catch (RejectedExecutionException e) {
            StringUtilsKt.e("Recorder", "The callback executor is invalid.", e);
        }
    }
}
