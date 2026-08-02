package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import coil3.svg.internal.AndroidSvg;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class CameraMotionRenderer extends BaseRenderer {
    public final DecoderInputBuffer buffer;
    public long lastTimestampUs;
    public CameraMotionListener listener;
    public final ParsableByteArray scratch;

    public CameraMotionRenderer() {
        super(6);
        this.buffer = new DecoderInputBuffer(1);
        this.scratch = new ParsableByteArray();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public final void handleMessage(int i, Object obj) {
        if (i == 8) {
            this.listener = (CameraMotionListener) obj;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onDisabled() {
        CameraMotionListener cameraMotionListener = this.listener;
        if (cameraMotionListener != null) {
            cameraMotionListener.onCameraMotionReset();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void onPositionReset(long j, boolean z, boolean z2) {
        this.lastTimestampUs = Long.MIN_VALUE;
        CameraMotionListener cameraMotionListener = this.listener;
        if (cameraMotionListener != null) {
            cameraMotionListener.onCameraMotionReset();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void render(long j, long j2) {
        float[] fArr;
        while (!hasReadStreamToEnd() && this.lastTimestampUs < 100000 + j) {
            DecoderInputBuffer decoderInputBuffer = this.buffer;
            decoderInputBuffer.clear();
            AndroidSvg androidSvg = this.formatHolder;
            androidSvg.clear();
            if (readSource(androidSvg, decoderInputBuffer, 0) != -4 || decoderInputBuffer.getFlag(4)) {
                return;
            }
            long j3 = decoderInputBuffer.timeUs;
            this.lastTimestampUs = j3;
            boolean z = j3 < this.lastResetPositionUs;
            if (this.listener != null && !z) {
                decoderInputBuffer.flip();
                ByteBuffer byteBuffer = decoderInputBuffer.data;
                String str = Util.DEVICE_DEBUG_INFO;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array2 = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    ParsableByteArray parsableByteArray = this.scratch;
                    parsableByteArray.reset(limit, array2);
                    parsableByteArray.setPosition(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(parsableByteArray.readLittleEndianInt());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.listener.onCameraMotion(this.lastTimestampUs - this.streamOffsetUs, fArr);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final int supportsFormat(Format format2) {
        return "application/x-camera-motion".equals(format2.sampleMimeType) ? BaseRenderer.create(4, 0, 0, 0) : BaseRenderer.create(0, 0, 0, 0);
    }
}
