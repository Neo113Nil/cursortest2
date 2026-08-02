package defpackage;

import androidx.exifinterface.media.a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class rlo implements aav {
    @Override // defpackage.aav
    public final int a(InputStream inputStream, g63 g63Var) {
        int d = new a(inputStream).d(1, "Orientation");
        if (d == 0) {
            return -1;
        }
        return d;
    }

    @Override // defpackage.aav
    public final ImageHeaderParser$ImageType b(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.aav
    public final ImageHeaderParser$ImageType c(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.aav
    public final int d(ByteBuffer byteBuffer, g63 g63Var) {
        AtomicReference atomicReference = g77.a;
        return a(new f77(byteBuffer), g63Var);
    }
}
