package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public final class r0k0 implements InvocationHandler {
    public final Object[] a = new Object[0];
    public final /* synthetic */ Class b;
    public final /* synthetic */ t0k0 c;

    public r0k0(t0k0 t0k0Var, Class cls) {
        this.c = t0k0Var;
        this.b = cls;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        r10 = defpackage.fwu.b(r7, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r7.a.put(r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006a, code lost:
    
        r7 = (defpackage.fwu) r1;
     */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        fwu fwuVar;
        fwu fwuVar2;
        Class cls = this.b;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.a;
        }
        Object[] objArr2 = objArr;
        ums umsVar = cvc0.b;
        if (umsVar.i(method)) {
            return umsVar.h(method, cls, obj, objArr2);
        }
        t0k0 t0k0Var = this.c;
        while (true) {
            Object obj2 = t0k0Var.a.get(method);
            if (!(obj2 instanceof fwu)) {
                if (obj2 == null) {
                    Object obj3 = new Object();
                    synchronized (obj3) {
                        try {
                            obj2 = t0k0Var.a.putIfAbsent(method, obj3);
                            if (obj2 == null) {
                                try {
                                    break;
                                } catch (Throwable th) {
                                    t0k0Var.a.remove(method);
                                    throw th;
                                }
                            }
                        } finally {
                        }
                    }
                }
                synchronized (obj2) {
                    try {
                        Object obj4 = t0k0Var.a.get(method);
                        if (obj4 != null) {
                            break;
                        }
                    } finally {
                    }
                }
                fwuVar = fwuVar2;
                break;
            }
            fwuVar = (fwu) obj2;
            break;
        }
        return fwuVar.a(new yv60(fwuVar.a, obj, objArr2, fwuVar.b, fwuVar.c), objArr2);
    }
}
