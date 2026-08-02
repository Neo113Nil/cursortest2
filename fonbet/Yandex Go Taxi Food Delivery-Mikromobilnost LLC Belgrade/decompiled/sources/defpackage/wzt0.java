package defpackage;

import android.util.Log;
import io.flutter.plugin.common.FlutterException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public final class wzt0 implements fa20 {
    public static final wzt0 b = new wzt0(vzt0.a);
    public final vzt0 a;

    public wzt0(vzt0 vzt0Var) {
        this.a = vzt0Var;
    }

    @Override // defpackage.fa20
    public final x920 a(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        vzt0 vzt0Var = this.a;
        Object e = vzt0Var.e(byteBuffer);
        Object e2 = vzt0Var.e(byteBuffer);
        if ((e instanceof String) && !byteBuffer.hasRemaining()) {
            return new x920((String) e, e2);
        }
        ny61.g("Method call corrupted");
        return null;
    }

    @Override // defpackage.fa20
    public final ByteBuffer c(String str, String str2) {
        ckn cknVar = new ckn(2);
        cknVar.write(1);
        vzt0 vzt0Var = this.a;
        vzt0Var.k(cknVar, "error");
        vzt0Var.k(cknVar, str);
        vzt0Var.k(cknVar, null);
        vzt0Var.k(cknVar, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(cknVar.size());
        allocateDirect.put(cknVar.a(), 0, cknVar.size());
        return allocateDirect;
    }

    @Override // defpackage.fa20
    public final ByteBuffer d(String str, String str2, Object obj) {
        ckn cknVar = new ckn(2);
        cknVar.write(1);
        vzt0 vzt0Var = this.a;
        vzt0Var.k(cknVar, str);
        vzt0Var.k(cknVar, str2);
        if (obj instanceof Throwable) {
            vzt0Var.k(cknVar, Log.getStackTraceString((Throwable) obj));
        } else {
            vzt0Var.k(cknVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(cknVar.size());
        allocateDirect.put(cknVar.a(), 0, cknVar.size());
        return allocateDirect;
    }

    @Override // defpackage.fa20
    public final ByteBuffer e(Object obj) {
        ckn cknVar = new ckn(2);
        cknVar.write(0);
        this.a.k(cknVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(cknVar.size());
        allocateDirect.put(cknVar.a(), 0, cknVar.size());
        return allocateDirect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // defpackage.fa20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b2 = byteBuffer.get();
        vzt0 vzt0Var = this.a;
        if (b2 == 0) {
            Object e = vzt0Var.e(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return e;
            }
        }
        Object e2 = vzt0Var.e(byteBuffer);
        Object e3 = vzt0Var.e(byteBuffer);
        Object e4 = vzt0Var.e(byteBuffer);
        if ((e2 instanceof String) && ((e3 == null || (e3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new FlutterException((String) e2, (String) e3, e4);
        }
        ny61.g("Envelope corrupted");
        return null;
    }

    @Override // defpackage.fa20
    public final ByteBuffer h(x920 x920Var) {
        ckn cknVar = new ckn(2);
        String str = x920Var.a;
        vzt0 vzt0Var = this.a;
        vzt0Var.k(cknVar, str);
        vzt0Var.k(cknVar, x920Var.b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(cknVar.size());
        allocateDirect.put(cknVar.a(), 0, cknVar.size());
        return allocateDirect;
    }
}
