package androidx.media3.container;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ReorderingBufferQueue$BuffersWithTimestamp implements Comparable {
    public long presentationTimeUs = -9223372036854775807L;
    public final ArrayList nalBuffers = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.presentationTimeUs, ((ReorderingBufferQueue$BuffersWithTimestamp) obj).presentationTimeUs);
    }
}
