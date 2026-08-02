package androidx.camera.video;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class AudioSpec {
    public static final AudioSpec DEFAULT = new AudioSpec();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof AudioSpec);
    }

    public final int hashCode() {
        return Objects.hash(0, -1, -1, 0, -1);
    }

    public final String toString() {
        return "AudioSpec{bitrate=0, sourceFormat=-1, source=-1, sampleRate=0, channelCount=-1, mimeType=audio/*}";
    }
}
