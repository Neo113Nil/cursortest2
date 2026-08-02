package androidx.media3.decoder;

/* loaded from: classes3.dex */
public abstract class DecoderOutputBuffer extends Buffer {
    public boolean shouldBeSkipped;
    public long timeUs;

    public abstract void clear();

    public abstract void release();
}
