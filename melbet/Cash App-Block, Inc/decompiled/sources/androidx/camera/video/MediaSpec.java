package androidx.camera.video;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes3.dex */
public final class MediaSpec {
    public final AudioSpec audioSpec;
    public final int outputFormat;
    public final VideoSpec videoSpec;

    public MediaSpec(VideoSpec videoSpec, AudioSpec audioSpec, int i) {
        videoSpec.getClass();
        audioSpec.getClass();
        this.videoSpec = videoSpec;
        this.audioSpec = audioSpec;
        this.outputFormat = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSpec)) {
            return false;
        }
        MediaSpec mediaSpec = (MediaSpec) obj;
        return Intrinsics.areEqual(this.videoSpec, mediaSpec.videoSpec) && Intrinsics.areEqual(this.audioSpec, mediaSpec.audioSpec) && this.outputFormat == mediaSpec.outputFormat;
    }

    public final int hashCode() {
        return Objects.hash(this.videoSpec, this.audioSpec, Integer.valueOf(this.outputFormat));
    }

    public final HuffmanTreeGroup toBuilder() {
        HuffmanTreeGroup huffmanTreeGroup = new HuffmanTreeGroup(1, false);
        huffmanTreeGroup.codes = AudioSpec.DEFAULT;
        huffmanTreeGroup.trees = VideoSpec.DEFAULT;
        huffmanTreeGroup.alphabetSize = -1;
        VideoSpec videoSpec = this.videoSpec;
        videoSpec.getClass();
        huffmanTreeGroup.trees = videoSpec;
        AudioSpec audioSpec = this.audioSpec;
        audioSpec.getClass();
        huffmanTreeGroup.codes = audioSpec;
        huffmanTreeGroup.alphabetSize = this.outputFormat;
        return huffmanTreeGroup;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSpec{videoSpec=");
        sb.append(this.videoSpec);
        sb.append(", audioSpec=");
        sb.append(this.audioSpec);
        sb.append(", outputFormat=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.outputFormat, '}');
    }
}
