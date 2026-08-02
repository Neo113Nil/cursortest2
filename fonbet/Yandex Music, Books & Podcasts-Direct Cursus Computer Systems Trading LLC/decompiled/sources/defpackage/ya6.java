package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ya6 implements InvocationHandler {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public ya6(lm4 lm4Var, i1c i1cVar) {
        this.a = 0;
        this.b = lm4Var;
        this.c = i1cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0016 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0016 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(List list) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Class cls;
        Method method;
        Object G;
        String str;
        Context context;
        see seeVar = (see) this.c;
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            for (Object obj : list) {
                try {
                    copyOnWriteArraySet = null;
                } catch (Exception unused) {
                }
                if (!bp6.a.contains(see.class)) {
                    try {
                        cls = seeVar.h;
                    } catch (Throwable th) {
                        bp6.a(see.class, th);
                    }
                    if (!bp6.a.contains(see.class)) {
                        try {
                            method = seeVar.o;
                        } catch (Throwable th2) {
                            bp6.a(see.class, th2);
                        }
                        G = xee.G(cls, obj, method, new Object[0]);
                        if (!(G instanceof String)) {
                            G = null;
                        }
                        str = (String) G;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (!bp6.a.contains(see.class)) {
                                try {
                                    context = seeVar.b;
                                } catch (Throwable th3) {
                                    bp6.a(see.class, th3);
                                }
                                jSONObject.put("packageName", context.getPackageName());
                                if (!jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    if (!bp6.a.contains(see.class)) {
                                        try {
                                            copyOnWriteArraySet = seeVar.a;
                                        } catch (Throwable th4) {
                                            bp6.a(see.class, th4);
                                        }
                                    }
                                    copyOnWriteArraySet.add(string);
                                    AtomicBoolean atomicBoolean = see.s;
                                    ConcurrentHashMap C = imp.C();
                                    string.getClass();
                                    C.put(string, jSONObject);
                                }
                            }
                            context = null;
                            jSONObject.put("packageName", context.getPackageName());
                            if (!jSONObject.has("productId")) {
                            }
                        }
                    }
                    method = null;
                    G = xee.G(cls, obj, method, new Object[0]);
                    if (!(G instanceof String)) {
                    }
                    str = (String) G;
                    if (str != null) {
                    }
                }
                cls = null;
                if (!bp6.a.contains(see.class)) {
                }
                method = null;
                G = xee.G(cls, obj, method, new Object[0]);
                if (!(G instanceof String)) {
                }
                str = (String) G;
                if (str != null) {
                }
            }
            ((dsd) this.b).run();
        } catch (Throwable th5) {
            bp6.a(this, th5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0016 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(List list) {
        ConcurrentHashMap concurrentHashMap;
        Class cls;
        Method method;
        Object G;
        String str;
        see seeVar = (see) this.c;
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            for (Object obj : list) {
                try {
                    concurrentHashMap = null;
                } catch (Exception unused) {
                }
                if (!bp6.a.contains(see.class)) {
                    try {
                        cls = seeVar.g;
                    } catch (Throwable th) {
                        bp6.a(see.class, th);
                    }
                    if (!bp6.a.contains(see.class)) {
                        try {
                            method = seeVar.n;
                        } catch (Throwable th2) {
                            bp6.a(see.class, th2);
                        }
                        G = xee.G(cls, obj, method, new Object[0]);
                        if (!(G instanceof String)) {
                            G = null;
                        }
                        str = (String) G;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("productId")) {
                                String string = jSONObject.getString("productId");
                                AtomicBoolean atomicBoolean = see.s;
                                if (!bp6.a.contains(see.class)) {
                                    try {
                                        concurrentHashMap = see.w;
                                    } catch (Throwable th3) {
                                        bp6.a(see.class, th3);
                                    }
                                }
                                string.getClass();
                                concurrentHashMap.put(string, jSONObject);
                            }
                        }
                    }
                    method = null;
                    G = xee.G(cls, obj, method, new Object[0]);
                    if (!(G instanceof String)) {
                    }
                    str = (String) G;
                    if (str != null) {
                    }
                }
                cls = null;
                if (!bp6.a.contains(see.class)) {
                }
                method = null;
                G = xee.G(cls, obj, method, new Object[0]);
                if (!(G instanceof String)) {
                }
                str = (String) G;
                if (str != null) {
                }
            }
            ((Runnable) this.b).run();
        } catch (Throwable th4) {
            bp6.a(this, th4);
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        switch (this.a) {
            case 0:
                i1c i1cVar = (i1c) this.c;
                obj.getClass();
                method.getClass();
                if (Intrinsics.d(method.getName(), "accept") && objArr != null && objArr.length == 1) {
                    lm4 lm4Var = (lm4) this.b;
                    Object obj2 = objArr[0];
                    bow.m(lm4Var, obj2);
                    i1cVar.invoke(obj2);
                    return Unit.a;
                }
                if (Intrinsics.d(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                    return Boolean.valueOf(obj == objArr[0]);
                }
                if (Intrinsics.d(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
                    return Integer.valueOf(i1cVar.hashCode());
                }
                if (Intrinsics.d(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                    return i1cVar.toString();
                }
                throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
            case 1:
                if (!bp6.a.contains(this)) {
                    try {
                        obj.getClass();
                        method.getClass();
                        if (Intrinsics.d(method.getName(), "onPurchaseHistoryResponse")) {
                            Object obj3 = objArr != null ? objArr[1] : null;
                            if (obj3 != null && (obj3 instanceof List)) {
                                a((List) obj3);
                            }
                        }
                    } catch (Throwable th) {
                        bp6.a(this, th);
                    }
                }
                return null;
            default:
                if (!bp6.a.contains(this)) {
                    try {
                        obj.getClass();
                        method.getClass();
                        if (Intrinsics.d(method.getName(), "onSkuDetailsResponse")) {
                            Object obj4 = objArr != null ? objArr[1] : null;
                            if (obj4 != null && (obj4 instanceof List)) {
                                b((List) obj4);
                            }
                        }
                    } catch (Throwable th2) {
                        bp6.a(this, th2);
                    }
                }
                return null;
        }
    }

    public /* synthetic */ ya6(see seeVar, Runnable runnable, int i) {
        this.a = i;
        this.c = seeVar;
        this.b = runnable;
    }
}
