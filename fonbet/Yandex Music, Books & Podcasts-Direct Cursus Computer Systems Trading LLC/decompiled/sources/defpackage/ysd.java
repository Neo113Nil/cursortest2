package defpackage;

import android.util.Log;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* loaded from: classes.dex */
public final class ysd implements InvocationHandler {
    public final /* synthetic */ int a;
    public final Object b;
    public final Serializable c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;

    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Serializable, java.lang.Object[]] */
    public ysd(vao vaoVar, Class cls) {
        this.a = 1;
        this.e = vaoVar;
        this.d = cls;
        this.b = ptk.b;
        this.c = new Object[0];
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        j7e j7eVar;
        switch (this.a) {
            case 0:
                ReentrantLock reentrantLock = (ReentrantLock) this.d;
                method.getClass();
                objArr.getClass();
                try {
                    if (Intrinsics.d(method.getName(), "onChecksumsReady") && objArr.length == 1) {
                        Object obj2 = objArr[0];
                        if (obj2 instanceof List) {
                            Iterator it = ((List) obj2).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (next != null) {
                                        Method method2 = next.getClass().getMethod("getSplitName", null);
                                        method2.getClass();
                                        Method method3 = next.getClass().getMethod("getType", null);
                                        method3.getClass();
                                        if (method2.invoke(next, null) == null && Intrinsics.d(method3.invoke(next, null), this.b)) {
                                            Method method4 = next.getClass().getMethod("getValue", null);
                                            method4.getClass();
                                            Object invoke = method4.invoke(next, null);
                                            if (invoke == null) {
                                                throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                                            }
                                            ((xqn) this.c).a = new BigInteger(1, (byte[]) invoke).toString(16);
                                            reentrantLock.lock();
                                            try {
                                                ((Condition) this.e).signalAll();
                                                reentrantLock.unlock();
                                            } catch (Throwable th) {
                                                reentrantLock.unlock();
                                                throw th;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    String[] strArr = zsd.a;
                    Log.d("zsd", "Can't fetch checksum.", th2);
                }
                return null;
            default:
                ptk ptkVar = (ptk) this.b;
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (objArr == null) {
                    objArr = (Object[]) this.c;
                }
                ptkVar.getClass();
                if (method.isDefault()) {
                    return ptkVar.b((Class) this.d, obj, method, objArr);
                }
                vao vaoVar = (vao) this.e;
                j7e j7eVar2 = (j7e) vaoVar.a.get(method);
                if (j7eVar2 == null) {
                    synchronized (vaoVar.a) {
                        try {
                            j7eVar = (j7e) vaoVar.a.get(method);
                            if (j7eVar == null) {
                                j7eVar = j7e.a(vaoVar, method);
                                vaoVar.a.put(method, j7eVar);
                            }
                        } finally {
                        }
                    }
                    j7eVar2 = j7eVar;
                }
                foj fojVar = new foj(j7eVar2.a, objArr, j7eVar2.b, j7eVar2.c);
                switch (j7eVar2.d) {
                    case 0:
                        return j7eVar2.e.z(fojVar);
                    case 1:
                        Call call = (Call) j7eVar2.e.z(fojVar);
                        Continuation continuation = (Continuation) objArr[objArr.length - 1];
                        try {
                            zt3 zt3Var = new zt3(1, qxe.b(continuation));
                            zt3Var.u(new dif(call, 0));
                            call.D(new awc(zt3Var));
                            Object q = zt3Var.q();
                            nm6 nm6Var = nm6.a;
                            return q;
                        } catch (Exception e) {
                            return x97.F(e, continuation);
                        }
                    default:
                        Call call2 = (Call) j7eVar2.e.z(fojVar);
                        Continuation continuation2 = (Continuation) objArr[objArr.length - 1];
                        try {
                            zt3 zt3Var2 = new zt3(1, qxe.b(continuation2));
                            zt3Var2.u(new dif(call2, 1));
                            call2.D(new n7b(zt3Var2));
                            Object q2 = zt3Var2.q();
                            nm6 nm6Var2 = nm6.a;
                            return q2;
                        } catch (Exception e2) {
                            return x97.F(e2, continuation2);
                        }
                }
        }
    }

    public ysd(Object obj, xqn xqnVar, ReentrantLock reentrantLock, Condition condition) {
        this.a = 0;
        this.b = obj;
        this.c = xqnVar;
        this.d = reentrantLock;
        this.e = condition;
    }
}
