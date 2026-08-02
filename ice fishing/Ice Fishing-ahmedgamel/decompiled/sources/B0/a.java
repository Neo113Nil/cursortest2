package B0;

import a.AbstractC0422a;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.icefishingapp.icefishing.C5275R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f92d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f93e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f96c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f95b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f94a = new HashMap();

    public a(Context context) {
        this.f96c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f92d == null) {
            synchronized (f93e) {
                try {
                    if (f92d == null) {
                        f92d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f92d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f96c.getString(C5275R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f95b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e9) {
                throw new c(e9);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (AbstractC0422a.o()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f94a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> dependencies = bVar.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class cls2 : dependencies) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.create(this.f96c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
