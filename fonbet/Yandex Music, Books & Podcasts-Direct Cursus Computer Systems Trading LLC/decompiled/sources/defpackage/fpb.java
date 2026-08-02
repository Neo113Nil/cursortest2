package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class fpb implements rbe {
    @Override // defpackage.rbe
    public final int a(InputStream inputStream, z98 z98Var) {
        int c = new epb(inputStream).c();
        if (c == 0) {
            return -1;
        }
        return c;
    }

    @Override // defpackage.rbe
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.rbe
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.rbe
    public final int d(ByteBuffer byteBuffer, z98 z98Var) {
        AtomicReference atomicReference = tm3.a;
        return a(new sm3(byteBuffer), z98Var);
    }
}
