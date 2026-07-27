package B1;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C3112dq;
import d0.C4448c;
import d0.C4452g;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import s1.InterfaceC4991d;

/* loaded from: classes.dex */
public final class s implements InterfaceC4991d {
    @Override // s1.InterfaceC4991d
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // s1.InterfaceC4991d
    public final boolean b(InputStream inputStream, C3112dq c3112dq) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0018 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    @Override // s1.InterfaceC4991d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(InputStream inputStream, C3112dq c3112dq) {
        int e6;
        C4452g c4452g = new C4452g(inputStream);
        C4448c c4 = c4452g.c("Orientation");
        if (c4 != null) {
            try {
                e6 = c4.e(c4452g.f37179f);
            } catch (NumberFormatException unused) {
            }
            if (e6 != 0) {
                return -1;
            }
            return e6;
        }
        e6 = 1;
        if (e6 != 0) {
        }
    }

    @Override // s1.InterfaceC4991d
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // s1.InterfaceC4991d
    public final boolean e(ByteBuffer byteBuffer, C3112dq c3112dq) {
        return false;
    }

    @Override // s1.InterfaceC4991d
    public final int f(ByteBuffer byteBuffer, C3112dq c3112dq) {
        AtomicReference atomicReference = N1.b.f1952a;
        return c(new N1.a(byteBuffer), c3112dq);
    }
}
