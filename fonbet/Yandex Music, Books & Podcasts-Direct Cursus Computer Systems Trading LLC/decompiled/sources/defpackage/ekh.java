package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;

/* loaded from: classes.dex */
public final class ekh extends MediaCodec.Callback {
    public final MediaCodec.Callback a;
    public final /* synthetic */ fkh b;

    public ekh(fkh fkhVar, MediaCodec.Callback callback) {
        callback.getClass();
        this.b = fkhVar;
        this.a = callback;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        mediaCodec.getClass();
        codecException.getClass();
        this.a.onError(mediaCodec, codecException);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        mediaCodec.getClass();
        fkh fkhVar = this.b;
        if (fkhVar.f.compareAndSet(false, true)) {
            fkhVar.c.C(new vih(fkhVar.e, fjh.a));
        }
        this.a.onInputBufferAvailable(mediaCodec, i);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        bufferInfo.getClass();
        this.a.onOutputBufferAvailable(mediaCodec, i, bufferInfo);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        mediaCodec.getClass();
        mediaFormat.getClass();
        this.a.onOutputFormatChanged(mediaCodec, mediaFormat);
    }
}
