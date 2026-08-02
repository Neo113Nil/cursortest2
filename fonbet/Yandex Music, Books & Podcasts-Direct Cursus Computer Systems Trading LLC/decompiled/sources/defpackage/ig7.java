package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class ig7 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        int i12 = dvt.a;
        Locale locale = Locale.US;
        StringBuilder l = dfi.l("DecoderCounters {\n decoderInits=", i, i2, ",\n decoderReleases=", "\n queuedInputBuffers=");
        hrg.w(i3, i4, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", l);
        hrg.w(i5, i6, "\n skippedOutputBuffers=", "\n droppedBuffers=", l);
        hrg.w(i7, i8, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", l);
        hrg.w(i9, i10, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", l);
        l.append(j);
        l.append("\n videoFrameProcessingOffsetCount=");
        l.append(i11);
        l.append("\n}");
        return l.toString();
    }
}
