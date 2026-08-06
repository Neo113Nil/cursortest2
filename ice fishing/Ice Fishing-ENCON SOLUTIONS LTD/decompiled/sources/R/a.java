package R;

import A1.C0015p;
import R1.l;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.watchfacestudio.spraktum.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f1699d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1700e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f1703c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f1702b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1701a = new HashMap();

    public a(Context context) {
        this.f1703c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f1699d == null) {
            synchronized (f1700e) {
                try {
                    if (f1699d == null) {
                        f1699d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f1699d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f1703c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f1702b;
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
            } catch (ClassNotFoundException e2) {
                throw new C0015p(e2);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 29) {
            z2 = S.a.c();
        } else {
            try {
                if (l.f1763b == null) {
                    l.f1762a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    l.f1763b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                z2 = ((Boolean) l.f1763b.invoke(null, Long.valueOf(l.f1762a))).booleanValue();
            } catch (Exception e2) {
                l.r("isTagEnabled", e2);
                z2 = false;
            }
        }
        if (z2) {
            try {
                Trace.beginSection(l.G(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f1701a;
        if (hashMap.containsKey(cls)) {
            hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a2 = bVar.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                Object create = bVar.create(this.f1703c);
                hashSet.remove(cls);
                hashMap.put(cls, create);
            } catch (Throwable th2) {
                throw new C0015p(th2);
            }
        }
        Trace.endSection();
    }
}
