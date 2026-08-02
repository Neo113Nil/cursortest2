package D1;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C2964aq;
import d0.C4451c;
import d0.C4455g;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import u1.InterfaceC5065d;

/* loaded from: classes.dex */
public final class t implements InterfaceC5065d {
    @Override // u1.InterfaceC5065d
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0018 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    @Override // u1.InterfaceC5065d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(InputStream inputStream, C2964aq c2964aq) {
        int e9;
        C4455g c4455g = new C4455g(inputStream);
        C4451c c9 = c4455g.c("Orientation");
        if (c9 != null) {
            try {
                e9 = c9.e(c4455g.f37169f);
            } catch (NumberFormatException unused) {
            }
            if (e9 != 0) {
                return -1;
            }
            return e9;
        }
        e9 = 1;
        if (e9 != 0) {
        }
    }

    @Override // u1.InterfaceC5065d
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // u1.InterfaceC5065d
    public final boolean d(InputStream inputStream, C2964aq c2964aq) {
        return false;
    }

    @Override // u1.InterfaceC5065d
    public final boolean e(ByteBuffer byteBuffer, C2964aq c2964aq) {
        return false;
    }

    @Override // u1.InterfaceC5065d
    public final int f(ByteBuffer byteBuffer, C2964aq c2964aq) {
        AtomicReference atomicReference = P1.b.f2352a;
        return b(new P1.a(byteBuffer), c2964aq);
    }
}
