package m0;

import L.Q;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: m0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217o implements InterfaceC0214l {

    /* renamed from: a, reason: collision with root package name */
    public static final C0217o f2774a;

    static {
        C0216n c0216n = C0216n.f2771a;
        f2774a = new C0217o();
    }

    @Override // m0.InterfaceC0214l
    public final ByteBuffer a(String str, String str2) {
        C0215m c0215m = new C0215m();
        c0215m.write(1);
        C0216n c0216n = C0216n.f2771a;
        c0216n.k(c0215m, "error");
        c0216n.k(c0215m, str);
        c0215m.write(0);
        c0216n.k(c0215m, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c0215m.size());
        allocateDirect.put(c0215m.a(), 0, c0215m.size());
        return allocateDirect;
    }

    @Override // m0.InterfaceC0214l
    public final ByteBuffer b(Q q2) {
        C0215m c0215m = new C0215m();
        C0216n c0216n = C0216n.f2771a;
        c0216n.k(c0215m, (String) q2.f597g);
        c0216n.k(c0215m, q2.f598h);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c0215m.size());
        allocateDirect.put(c0215m.a(), 0, c0215m.size());
        return allocateDirect;
    }

    @Override // m0.InterfaceC0214l
    public final ByteBuffer c(String str, String str2, Object obj) {
        C0215m c0215m = new C0215m();
        c0215m.write(1);
        C0216n c0216n = C0216n.f2771a;
        c0216n.k(c0215m, str);
        c0216n.k(c0215m, str2);
        if (obj instanceof Throwable) {
            c0216n.k(c0215m, Log.getStackTraceString((Throwable) obj));
        } else {
            c0216n.k(c0215m, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c0215m.size());
        allocateDirect.put(c0215m.a(), 0, c0215m.size());
        return allocateDirect;
    }

    @Override // m0.InterfaceC0214l
    public final ByteBuffer d(Object obj) {
        C0215m c0215m = new C0215m();
        c0215m.write(0);
        C0216n.f2771a.k(c0215m, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c0215m.size());
        allocateDirect.put(c0215m.a(), 0, c0215m.size());
        return allocateDirect;
    }

    @Override // m0.InterfaceC0214l
    public final Q e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        C0216n c0216n = C0216n.f2771a;
        Object e2 = c0216n.e(byteBuffer);
        Object e3 = c0216n.e(byteBuffer);
        if (!(e2 instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new Q(22, (String) e2, e3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // m0.InterfaceC0214l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b2 = byteBuffer.get();
        if (b2 == 0) {
            Object e2 = C0216n.f2771a.e(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return e2;
            }
        }
        C0216n c0216n = C0216n.f2771a;
        Object e3 = c0216n.e(byteBuffer);
        Object e4 = c0216n.e(byteBuffer);
        Object e5 = c0216n.e(byteBuffer);
        if ((e3 instanceof String) && ((e4 == null || (e4 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new C0209g((String) e3, (String) e4, e5);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }
}
