package defpackage;

import com.yandex.music.shared.modernfit.MethodHandler;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final class cj2 implements InvocationHandler {
    public final Object a;
    public final xdh b;
    public final w4i c;
    public final List d;
    public final String e;
    public final ReentrantLock f;
    public final HashSet g;
    public final HashMap h;

    public cj2(Class cls, Object obj, xdh xdhVar, w4i w4iVar, List list) {
        this.a = obj;
        this.b = xdhVar;
        this.c = w4iVar;
        this.d = list;
        hch hchVar = (hch) cls.getAnnotation(hch.class);
        this.e = hchVar != null ? hchVar.key() : null;
        this.f = new ReentrantLock();
        this.g = new HashSet();
        this.h = new HashMap();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        MethodHandler methodHandler;
        obj.getClass();
        method.getClass();
        if (Intrinsics.d(method.getDeclaringClass(), Object.class)) {
            return method.invoke(this, objArr);
        }
        HashSet hashSet = this.g;
        HashMap hashMap = this.h;
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            MethodHandler methodHandler2 = (MethodHandler) hashMap.get(method);
            if (methodHandler2 == null) {
                methodHandler = new MethodHandler(this.a, method, this.b, this.e, this.c, this.d);
                String str = methodHandler.g;
                if (str != null) {
                    if (hashSet.contains(str)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    hashSet.add(str);
                }
                hashMap.put(method, methodHandler);
            } else {
                methodHandler = methodHandler2;
            }
            reentrantLock.unlock();
            Method method2 = methodHandler.b;
            Class<?>[] parameterTypes = method2.getParameterTypes();
            parameterTypes.getClass();
            Class<?> cls = parameterTypes.length == 0 ? null : parameterTypes[parameterTypes.length - 1];
            if (!(cls != null ? Continuation.class.isAssignableFrom(cls) : false)) {
                if (objArr == null) {
                    objArr = new Object[0];
                }
                Object[] objArr2 = objArr;
                return x97.D(g.a, new rfg(methodHandler, methodHandler.f.a(objArr2), method2.getGenericReturnType(), objArr2, null, 11));
            }
            objArr.getClass();
            Method method3 = methodHandler.e;
            method3.getClass();
            IntRange intRange = new IntRange(0, objArr.length - 2, 1);
            return y7g.p(methodHandler, method3, intRange.isEmpty() ? uz0.k(0, 0, objArr) : uz0.k(0, intRange.b + 1, objArr), xz0.K(objArr));
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
