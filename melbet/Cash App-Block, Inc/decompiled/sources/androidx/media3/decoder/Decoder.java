package androidx.media3.decoder;

import androidx.media3.extractor.text.SubtitleInputBuffer;

/* loaded from: classes3.dex */
public interface Decoder {
    Object dequeueInputBuffer();

    Object dequeueOutputBuffer();

    void flush();

    void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer);

    void release();

    void setOutputStartTimeUs(long j);
}
