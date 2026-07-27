package m0;

import L.Q;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class o implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final o f2782a;

    static {
        n nVar = n.f2779a;
        f2782a = new o();
    }

    @Override // m0.l
    public final ByteBuffer a(String str, String str2) {
        m mVar = new m();
        mVar.write(1);
        n nVar = n.f2779a;
        nVar.k(mVar, "error");
        nVar.k(mVar, str);
        mVar.write(0);
        nVar.k(mVar, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mVar.size());
        allocateDirect.put(mVar.a(), 0, mVar.size());
        return allocateDirect;
    }

    @Override // m0.l
    public final ByteBuffer b(Q q2) {
        m mVar = new m();
        n nVar = n.f2779a;
        nVar.k(mVar, (String) q2.f519f);
        nVar.k(mVar, q2.f520g);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mVar.size());
        allocateDirect.put(mVar.a(), 0, mVar.size());
        return allocateDirect;
    }

    @Override // m0.l
    public final ByteBuffer c(String str, String str2, Object obj) {
        m mVar = new m();
        mVar.write(1);
        n nVar = n.f2779a;
        nVar.k(mVar, str);
        nVar.k(mVar, str2);
        if (obj instanceof Throwable) {
            nVar.k(mVar, Log.getStackTraceString((Throwable) obj));
        } else {
            nVar.k(mVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mVar.size());
        allocateDirect.put(mVar.a(), 0, mVar.size());
        return allocateDirect;
    }

    @Override // m0.l
    public final ByteBuffer d(Object obj) {
        m mVar = new m();
        mVar.write(0);
        n.f2779a.k(mVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mVar.size());
        allocateDirect.put(mVar.a(), 0, mVar.size());
        return allocateDirect;
    }

    @Override // m0.l
    public final Q e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        n nVar = n.f2779a;
        Object e2 = nVar.e(byteBuffer);
        Object e3 = nVar.e(byteBuffer);
        if (!(e2 instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new Q(22, (String) e2, e3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // m0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b2 = byteBuffer.get();
        if (b2 == 0) {
            Object e2 = n.f2779a.e(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return e2;
            }
        }
        n nVar = n.f2779a;
        Object e3 = nVar.e(byteBuffer);
        Object e4 = nVar.e(byteBuffer);
        Object e5 = nVar.e(byteBuffer);
        if ((e3 instanceof String) && ((e4 == null || (e4 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new g((String) e3, (String) e4, e5);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }
}
