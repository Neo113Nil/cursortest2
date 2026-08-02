package androidx.media3.exoplayer.audio;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.audio.AudioOutputProvider;

/* loaded from: classes3.dex */
public final class AudioSink$InitializationException extends Exception {
    public final boolean isRecoverable;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AudioSink$InitializationException(int i, int i2, int i3, int i4, Format format2, boolean z, AudioOutputProvider.InitializationException initializationException) {
        super(r3.toString(), initializationException);
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "AudioTrack init failed 0 Config(", ", ", ", ");
        Recorder$$ExternalSyntheticOutline1.m105m(i3, i4, ", ", ") ", m107m);
        m107m.append(format2);
        m107m.append(z ? " (recoverable)" : "");
        this.isRecoverable = z;
    }
}
