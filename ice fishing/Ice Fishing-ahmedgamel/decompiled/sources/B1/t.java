package B1;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C2941aq;
import d0.C4436c;
import d0.C4440g;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import s1.InterfaceC4969d;

/* loaded from: classes.dex */
public final class t implements InterfaceC4969d {
    @Override // s1.InterfaceC4969d
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0018 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    @Override // s1.InterfaceC4969d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(InputStream inputStream, C2941aq c2941aq) {
        int e9;
        C4440g c4440g = new C4440g(inputStream);
        C4436c c9 = c4440g.c("Orientation");
        if (c9 != null) {
            try {
                e9 = c9.e(c4440g.f37016f);
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

    @Override // s1.InterfaceC4969d
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // s1.InterfaceC4969d
    public final boolean d(InputStream inputStream, C2941aq c2941aq) {
        return false;
    }

    @Override // s1.InterfaceC4969d
    public final boolean e(ByteBuffer byteBuffer, C2941aq c2941aq) {
        return false;
    }

    @Override // s1.InterfaceC4969d
    public final int f(ByteBuffer byteBuffer, C2941aq c2941aq) {
        AtomicReference atomicReference = N1.b.f1908a;
        return b(new N1.a(byteBuffer), c2941aq);
    }
}
