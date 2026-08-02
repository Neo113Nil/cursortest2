package androidx.media3.exoplayer.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.BitmapUtil;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.DecoderOutputBuffer;
import androidx.media3.decoder.SimpleDecoder;
import androidx.tracing.Trace;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class BitmapFactoryImageDecoder extends SimpleDecoder {
    public final Context context;
    public final int maxOutputSize;

    /* renamed from: androidx.media3.exoplayer.image.BitmapFactoryImageDecoder$1, reason: invalid class name */
    public final class AnonymousClass1 extends DecoderOutputBuffer {
        public Bitmap bitmap;
        public final /* synthetic */ BitmapFactoryImageDecoder this$0;

        public AnonymousClass1(BitmapFactoryImageDecoder bitmapFactoryImageDecoder) {
            super((byte) 0, 0);
            this.this$0 = bitmapFactoryImageDecoder;
        }

        @Override // androidx.media3.decoder.DecoderOutputBuffer
        public final void clear() {
            this.bitmap = null;
            this.flags = 0;
            this.timeUs = 0L;
            this.shouldBeSkipped = false;
        }

        @Override // androidx.media3.decoder.DecoderOutputBuffer
        public final void release() {
            this.this$0.releaseOutputBuffer(this);
        }
    }

    public BitmapFactoryImageDecoder(Context context) {
        super(new DecoderInputBuffer[1], new AnonymousClass1[1]);
        this.context = context;
        this.maxOutputSize = -1;
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public final DecoderInputBuffer createInputBuffer() {
        return new DecoderInputBuffer(1);
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public final DecoderOutputBuffer createOutputBuffer() {
        return new AnonymousClass1(this);
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public final DecoderException createUnexpectedDecodeException(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public final DecoderException decode(DecoderInputBuffer decoderInputBuffer, DecoderOutputBuffer decoderOutputBuffer, boolean z) {
        AnonymousClass1 anonymousClass1 = (AnonymousClass1) decoderOutputBuffer;
        ByteBuffer byteBuffer = decoderInputBuffer.data;
        byteBuffer.getClass();
        Trace.checkState(byteBuffer.hasArray());
        Trace.checkArgument(byteBuffer.arrayOffset() == 0);
        try {
            int i = this.maxOutputSize;
            if (i == -1) {
                Context context = this.context;
                if (context != null) {
                    Point currentDisplayModeSize = Util.getCurrentDisplayModeSize(context);
                    int i2 = currentDisplayModeSize.x;
                    int i3 = currentDisplayModeSize.y;
                    Format format2 = decoderInputBuffer.f875format;
                    if (format2 != null) {
                        int i4 = format2.tileCountHorizontal;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                        int i5 = format2.tileCountVertical;
                        if (i5 != -1) {
                            i3 *= i5;
                        }
                    }
                    i = (Math.max(i2, i3) * 2) - 1;
                } else {
                    i = 4096;
                }
            }
            anonymousClass1.bitmap = BitmapUtil.decode(byteBuffer.remaining(), i, byteBuffer.array());
            anonymousClass1.timeUs = decoderInputBuffer.timeUs;
            return null;
        } catch (ParserException e) {
            return new ImageDecoderException("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new ImageDecoderException(e2);
        }
    }
}
