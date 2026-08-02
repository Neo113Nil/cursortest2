package androidx.media3.exoplayer.mediacodec;

import android.os.HandlerThread;
import com.google.common.base.Supplier;

/* loaded from: classes3.dex */
public final /* synthetic */ class AsynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;

    public /* synthetic */ AsynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda0(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        int i = this.$r8$classId;
        int i2 = this.f$0;
        switch (i) {
            case 0:
                return new HandlerThread(AsynchronousMediaCodecAdapter.createThreadLabel(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(AsynchronousMediaCodecAdapter.createThreadLabel(i2, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
