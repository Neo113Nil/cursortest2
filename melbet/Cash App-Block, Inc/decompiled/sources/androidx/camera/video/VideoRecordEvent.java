package androidx.camera.video;

/* loaded from: classes3.dex */
public abstract class VideoRecordEvent {
    public final FileOutputOptions mOutputOptions;

    public final class Finalize extends VideoRecordEvent {
        public final Throwable mCause;
        public final int mError;

        public Finalize(FileOutputOptions fileOutputOptions, AutoValue_RecordingStats autoValue_RecordingStats, int i, Throwable th) {
            super(fileOutputOptions, autoValue_RecordingStats);
            this.mError = i;
            this.mCause = th;
        }
    }

    public final class Pause extends VideoRecordEvent {
    }

    public abstract class Resume extends VideoRecordEvent {
    }

    public final class Start extends VideoRecordEvent {
    }

    public final class Status extends VideoRecordEvent {
    }

    public VideoRecordEvent(FileOutputOptions fileOutputOptions, AutoValue_RecordingStats autoValue_RecordingStats) {
        fileOutputOptions.getClass();
        this.mOutputOptions = fileOutputOptions;
    }
}
