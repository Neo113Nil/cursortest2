package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;

/* loaded from: classes3.dex */
public final /* synthetic */ class SynchronousMediaCodecAdapter$$ExternalSyntheticLambda0 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaCodecVideoRenderer.OnFrameRenderedListener f$1;

    public /* synthetic */ SynchronousMediaCodecAdapter$$ExternalSyntheticLambda0(MediaCodecAdapter mediaCodecAdapter, MediaCodecVideoRenderer.OnFrameRenderedListener onFrameRenderedListener, int i) {
        this.$r8$classId = i;
        this.f$1 = onFrameRenderedListener;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        int i = this.$r8$classId;
        MediaCodecVideoRenderer.OnFrameRenderedListener onFrameRenderedListener = this.f$1;
        switch (i) {
            case 0:
                Handler handler = onFrameRenderedListener.handler;
                if (Build.VERSION.SDK_INT >= 30) {
                    onFrameRenderedListener.handleFrameRendered(j);
                    break;
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    break;
                }
            default:
                Handler handler2 = onFrameRenderedListener.handler;
                if (Build.VERSION.SDK_INT >= 30) {
                    onFrameRenderedListener.handleFrameRendered(j);
                    break;
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    break;
                }
        }
    }
}
