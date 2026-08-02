package androidx.media3.muxer;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class Track {

    /* renamed from: format, reason: collision with root package name */
    public final Format f900format;
    public boolean hadKeyframe;
    public byte[] parsedCsd;
    public final boolean sampleCopyEnabled;
    public final ArrayList writtenSamples = new ArrayList();
    public final ArrayList writtenChunkOffsets = new ArrayList();
    public final ArrayList writtenChunkSampleCounts = new ArrayList();
    public final ArrayDeque pendingSamplesBufferInfo = new ArrayDeque();
    public final ArrayDeque pendingSamplesByteBuffer = new ArrayDeque();
    public long endOfStreamTimestampUs = -9223372036854775807L;

    public Track(int i, Format format2, boolean z) {
        this.f900format = format2;
        this.sampleCopyEnabled = z;
    }

    public final int videoUnitTimebase() {
        Format format2 = this.f900format;
        if (MimeTypes.isAudio(format2.sampleMimeType)) {
            return format2.sampleRate;
        }
        return 90000;
    }
}
