package coil3.fetch;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import coil3.ExtrasKt;
import coil3.Image_androidKt;
import coil3.decode.ByteBufferMetadata;
import coil3.decode.DataSource;
import coil3.decode.ImageSourceKt;
import coil3.decode.SourceImageSource;
import coil3.intercept.EngineInterceptor$fetch$1;
import coil3.request.ImageRequestsKt;
import coil3.request.ImageRequests_androidKt;
import coil3.request.Options;
import coil3.size.Precision;
import coil3.size.Size;
import coil3.util.DrawableUtils;
import coil3.util.Utils_androidKt;
import java.nio.ByteBuffer;
import okio.Buffer;
import okio.RealBufferedSource;
import okio.Source;
import okio.Timeout;

/* loaded from: classes3.dex */
public final class DrawableFetcher implements Fetcher {
    public final /* synthetic */ int $r8$classId;
    public final Object data;
    public final Options options;

    public /* synthetic */ DrawableFetcher(Object obj, Options options, int i) {
        this.$r8$classId = i;
        this.data = obj;
        this.options = options;
    }

    @Override // coil3.fetch.Fetcher
    public final Object fetch(EngineInterceptor$fetch$1 engineInterceptor$fetch$1) {
        int i = this.$r8$classId;
        Options options = this.options;
        Object obj = this.data;
        switch (i) {
            case 0:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = Utils_androidKt.VALID_TRANSFORMATION_CONFIGS;
                boolean z = (drawable instanceof VectorDrawable) || (drawable instanceof VectorDrawableCompat);
                if (z) {
                    drawable = new BitmapDrawable(options.context.getResources(), DrawableUtils.convertToBitmap(drawable, ImageRequests_androidKt.getBitmapConfig(options), options.size, options.scale, (Size) ExtrasKt.getExtra(options, ImageRequestsKt.maxBitmapSizeKey), options.precision == Precision.INEXACT));
                }
                return new ImageFetchResult(Image_androidKt.asImage(drawable), z, DataSource.MEMORY);
            case 1:
                Buffer buffer = new Buffer();
                buffer.m4334write((byte[]) obj);
                return new SourceFetchResult(ImageSourceKt.ImageSource$default(buffer, options.fileSystem), null, DataSource.MEMORY);
            default:
                final ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new SourceFetchResult(new SourceImageSource(new RealBufferedSource(new Source(byteBuffer) { // from class: coil3.fetch.ByteBufferFetcherKt$asSource$1
                    public final ByteBuffer buffer;
                    public final int len;

                    {
                        ByteBuffer slice = byteBuffer.slice();
                        this.buffer = slice;
                        this.len = slice.capacity();
                    }

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                    }

                    @Override // okio.Source
                    public final long read(Buffer buffer2, long j) {
                        ByteBuffer byteBuffer2 = this.buffer;
                        int position = byteBuffer2.position();
                        int i2 = this.len;
                        if (position == i2) {
                            return -1L;
                        }
                        int position2 = (int) (byteBuffer2.position() + j);
                        if (position2 <= i2) {
                            i2 = position2;
                        }
                        byteBuffer2.limit(i2);
                        return buffer2.write(byteBuffer2);
                    }

                    @Override // okio.Source
                    public final Timeout timeout() {
                        return Timeout.NONE;
                    }
                }), options.fileSystem, new ByteBufferMetadata(byteBuffer)), null, DataSource.MEMORY);
        }
    }
}
