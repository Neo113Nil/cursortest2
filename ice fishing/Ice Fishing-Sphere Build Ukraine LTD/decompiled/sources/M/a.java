package M;

import L0.C0058p;
import a.AbstractC0069a;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.icecatchbiger.hookfrostmaster.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f695d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f696e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f699c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f698b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f697a = new HashMap();

    public a(Context context) {
        this.f699c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f695d == null) {
            synchronized (f696e) {
                try {
                    if (f695d == null) {
                        f695d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f695d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f699c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f698b;
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
                throw new C0058p(e2);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 29) {
            z2 = N.a.c();
        } else {
            try {
                if (AbstractC0069a.f1082f == null) {
                    AbstractC0069a.f1081e = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    AbstractC0069a.f1082f = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                z2 = ((Boolean) AbstractC0069a.f1082f.invoke(null, Long.valueOf(AbstractC0069a.f1081e))).booleanValue();
            } catch (Exception e2) {
                AbstractC0069a.r("isTagEnabled", e2);
                z2 = false;
            }
        }
        if (z2) {
            try {
                Trace.beginSection(AbstractC0069a.K(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f697a;
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
                Object b2 = bVar.b(this.f699c);
                hashSet.remove(cls);
                hashMap.put(cls, b2);
            } catch (Throwable th2) {
                throw new C0058p(th2);
            }
        }
        Trace.endSection();
    }
}
