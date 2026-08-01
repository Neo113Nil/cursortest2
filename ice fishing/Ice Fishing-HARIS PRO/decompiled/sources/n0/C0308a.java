package n0;

import L1.C0011l;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0308a f4110d;
    public static final Object e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f4113c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f4112b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4111a = new HashMap();

    public C0308a(Context context) {
        this.f4113c = context.getApplicationContext();
    }

    public static C0308a c(Context context) {
        if (f4110d == null) {
            synchronized (e) {
                try {
                    if (f4110d == null) {
                        f4110d = new C0308a(context);
                    }
                } finally {
                }
            }
        }
        return f4110d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f4113c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f4112b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0309b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new C0011l(e2);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (f.q()) {
            try {
                f.b(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f4111a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0309b interfaceC0309b = (InterfaceC0309b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a2 = interfaceC0309b.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC0309b.b(this.f4113c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new C0011l(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
