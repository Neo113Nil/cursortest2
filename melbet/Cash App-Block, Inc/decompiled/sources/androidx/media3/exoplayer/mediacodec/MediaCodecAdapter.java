package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import com.fillr.e0;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public interface MediaCodecAdapter {

    public interface Factory {
        MediaCodecAdapter createAdapter(e0 e0Var);
    }

    int dequeueInputBufferIndex();

    int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo);

    void detachOutputSurface();

    void flush();

    ByteBuffer getInputBuffer(int i);

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    void queueInputBuffer(int i, int i2, int i3, long j);

    void queueSecureInputBuffer(int i, CryptoInfo cryptoInfo, long j, int i2);

    default boolean registerOnBufferAvailableListener(PreviewView.AnonymousClass1 anonymousClass1) {
        return false;
    }

    void release();

    void releaseOutputBuffer(int i);

    void releaseOutputBuffer(int i, long j);

    void setOnFrameRenderedListener(MediaCodecVideoRenderer.OnFrameRenderedListener onFrameRenderedListener, Handler handler);

    void setOutputSurface(Surface surface);

    void setParameters(Bundle bundle);

    void setVideoScalingMode(int i);

    void subscribeToVendorParameters(ArrayList arrayList);

    void unsubscribeFromVendorParameters(ArrayList arrayList);

    default void useInputBuffer(DispatchQueue$$ExternalSyntheticLambda0 dispatchQueue$$ExternalSyntheticLambda0) {
        dispatchQueue$$ExternalSyntheticLambda0.run();
    }
}
