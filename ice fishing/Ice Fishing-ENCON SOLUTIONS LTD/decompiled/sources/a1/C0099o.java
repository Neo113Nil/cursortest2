package a1;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: a1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099o implements InterfaceC0096l {

    /* renamed from: b, reason: collision with root package name */
    public static final C0099o f2035b = new C0099o(C0098n.INSTANCE);

    /* renamed from: a, reason: collision with root package name */
    public final C0098n f2036a;

    public C0099o(C0098n c0098n) {
        this.f2036a = c0098n;
    }

    @Override // a1.InterfaceC0096l
    public final ByteBuffer a(Object obj) {
        C0097m c0097m = new C0097m();
        c0097m.write(0);
        this.f2036a.writeValue(c0097m, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c0097m.size());
        allocateDirect.put(c0097m.a(), 0, c0097m.size());
        return allocateDirect;
    }

    @Override // a1.InterfaceC0096l
    public final x0.e b(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        C0098n c0098n = this.f2036a;
        Object readValue = c0098n.readValue(byteBuffer);
        Object readValue2 = c0098n.readValue(byteBuffer);
        if (!(readValue instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new x0.e(19, (String) readValue, readValue2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // a1.InterfaceC0096l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b2 = byteBuffer.get();
        C0098n c0098n = this.f2036a;
        if (b2 == 0) {
            Object readValue = c0098n.readValue(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return readValue;
            }
        }
        Object readValue2 = c0098n.readValue(byteBuffer);
        Object readValue3 = c0098n.readValue(byteBuffer);
        Object readValue4 = c0098n.readValue(byteBuffer);
        if ((readValue2 instanceof String) && ((readValue3 == null || (readValue3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new C0091g((String) readValue2, (String) readValue3, readValue4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    @Override // a1.InterfaceC0096l
    public final ByteBuffer d(String str, String str2) {
        C0097m c0097m = new C0097m();
        c0097m.write(1);
        C0098n c0098n = this.f2036a;
        c0098n.writeValue(c0097m, "error");
        c0098n.writeValue(c0097m, str);
        c0098n.writeValue(c0097m, null);
        c0098n.writeValue(c0097m, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c0097m.size());
        allocateDirect.put(c0097m.a(), 0, c0097m.size());
        return allocateDirect;
    }

    @Override // a1.InterfaceC0096l
    public final ByteBuffer e(x0.e eVar) {
        C0097m c0097m = new C0097m();
        C0098n c0098n = this.f2036a;
        c0098n.writeValue(c0097m, (String) eVar.f8530b);
        c0098n.writeValue(c0097m, eVar.f8531c);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c0097m.size());
        allocateDirect.put(c0097m.a(), 0, c0097m.size());
        return allocateDirect;
    }

    @Override // a1.InterfaceC0096l
    public final ByteBuffer f(String str, String str2, Object obj) {
        C0097m c0097m = new C0097m();
        c0097m.write(1);
        C0098n c0098n = this.f2036a;
        c0098n.writeValue(c0097m, str);
        c0098n.writeValue(c0097m, str2);
        if (obj instanceof Throwable) {
            c0098n.writeValue(c0097m, Log.getStackTraceString((Throwable) obj));
        } else {
            c0098n.writeValue(c0097m, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c0097m.size());
        allocateDirect.put(c0097m.a(), 0, c0097m.size());
        return allocateDirect;
    }
}
