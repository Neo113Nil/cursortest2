package defpackage;

import android.content.Context;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class see {
    public static see t;
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final Context b;
    public final Object c;
    public final Class d;
    public final Class e;
    public final Class f;
    public final Class g;
    public final Class h;
    public final Class i;
    public final Class j;
    public final Method k;
    public final Method l;
    public final Method m;
    public final Method n;
    public final Method o;
    public final Method p;
    public final Method q;
    public final wee r;
    public static final imp x = new imp();
    public static final AtomicBoolean s = new AtomicBoolean(false);
    public static final AtomicBoolean u = new AtomicBoolean(false);
    public static final ConcurrentHashMap v = new ConcurrentHashMap();
    public static final ConcurrentHashMap w = new ConcurrentHashMap();

    public see(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, wee weeVar) {
        this.b = context;
        this.c = obj;
        this.d = cls;
        this.e = cls2;
        this.f = cls3;
        this.g = cls4;
        this.h = cls5;
        this.i = cls6;
        this.j = cls7;
        this.k = method;
        this.l = method2;
        this.m = method3;
        this.n = method4;
        this.o = method5;
        this.p = method6;
        this.q = method7;
        this.r = weeVar;
    }

    public static final see a() {
        if (bp6.a.contains(see.class)) {
            return null;
        }
        try {
            return t;
        } catch (Throwable th) {
            bp6.a(see.class, th);
            return null;
        }
    }

    public final void b() {
        q qVar = q.k;
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            Object G = xee.G(this.e, xee.G(this.d, this.c, this.k, "inapp"), this.l, new Object[0]);
            if (!(G instanceof List)) {
                G = null;
            }
            List list = (List) G;
            if (list != null) {
                try {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Object G2 = xee.G(this.f, it.next(), this.m, new Object[0]);
                        if (!(G2 instanceof String)) {
                            G2 = null;
                        }
                        String str = (String) G2;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("productId")) {
                                String string = jSONObject.getString("productId");
                                arrayList.add(string);
                                ConcurrentHashMap concurrentHashMap = v;
                                string.getClass();
                                concurrentHashMap.put(string, jSONObject);
                            }
                        }
                    }
                    d(arrayList, qVar);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    public final void c(dsd dsdVar) {
        Class cls = this.j;
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new ya6(this, dsdVar, 1));
            newProxyInstance.getClass();
            xee.G(this.d, this.c, this.q, "inapp", newProxyInstance);
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    public final void d(ArrayList arrayList, Runnable runnable) {
        Class cls = this.i;
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new ya6(this, runnable, 2));
            newProxyInstance.getClass();
            Object a = this.r.a(arrayList);
            xee.G(this.d, this.c, this.p, a, newProxyInstance);
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    public final void e() {
        Method E;
        Class cls = this.d;
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            Class C = xee.C("com.android.billingclient.api.BillingClientStateListener");
            if (C == null || (E = xee.E(cls, "startConnection", C)) == null) {
                return;
            }
            Object newProxyInstance = Proxy.newProxyInstance(C.getClassLoader(), new Class[]{C}, new ree(0));
            newProxyInstance.getClass();
            xee.G(cls, this.c, E, newProxyInstance);
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }
}
