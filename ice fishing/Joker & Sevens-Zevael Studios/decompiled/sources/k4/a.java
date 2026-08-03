package k4;

import ac.d;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.fortheloss.st.R;
import x4.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f3627d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f3628e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f3631c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f3630b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3629a = new HashMap();

    public a(Context context) {
        this.f3631c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f3627d == null) {
            synchronized (f3628e) {
                try {
                    if (f3627d == null) {
                        f3627d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f3627d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f3631c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f3630b;
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
            } catch (ClassNotFoundException e10) {
                throw new d(e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.f3629a;
        if (f.N()) {
            try {
                f.y(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a6 = bVar.a();
                if (!a6.isEmpty()) {
                    for (Class cls2 : a6) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f3631c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new d(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
