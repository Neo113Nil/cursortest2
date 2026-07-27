package M;

import K0.C0040p;
import a.AbstractC0069a;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.icedrifter.arcticquest.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f691d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f692e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f695c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f694b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f693a = new HashMap();

    public a(Context context) {
        this.f695c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f691d == null) {
            synchronized (f692e) {
                try {
                    if (f691d == null) {
                        f691d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f691d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f695c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f694b;
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
                throw new C0040p(e2);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 29) {
            z2 = N.a.c();
        } else {
            try {
                if (AbstractC0069a.f1074g == null) {
                    AbstractC0069a.f1073f = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    AbstractC0069a.f1074g = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                z2 = ((Boolean) AbstractC0069a.f1074g.invoke(null, Long.valueOf(AbstractC0069a.f1073f))).booleanValue();
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
        HashMap hashMap = this.f693a;
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
                Object b2 = bVar.b(this.f695c);
                hashSet.remove(cls);
                hashMap.put(cls, b2);
            } catch (Throwable th2) {
                throw new C0040p(th2);
            }
        }
        Trace.endSection();
    }
}
