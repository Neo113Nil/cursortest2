package A1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: e, reason: collision with root package name */
    public static final H f24e = new H(10);

    /* renamed from: f, reason: collision with root package name */
    public static final I f25f = new I(2);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f26a;

    /* renamed from: b, reason: collision with root package name */
    public final H f27b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f28c;

    /* renamed from: d, reason: collision with root package name */
    public final b3.e f29d;

    public E(b3.e eVar) {
        H h3 = f24e;
        this.f26a = new ArrayList();
        this.f28c = new HashSet();
        this.f29d = eVar;
        this.f27b = h3;
    }

    public final synchronized x a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f26a.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                D d9 = (D) it.next();
                if (this.f28c.contains(d9)) {
                    z6 = true;
                } else if (d9.f21a.isAssignableFrom(cls) && d9.f22b.isAssignableFrom(cls2)) {
                    this.f28c.add(d9);
                    arrayList.add(d9.f23c.j(this));
                    this.f28c.remove(d9);
                }
            }
            if (arrayList.size() > 1) {
                H h3 = this.f27b;
                b3.e eVar = this.f29d;
                h3.getClass();
                return new C0260b(2, arrayList, eVar);
            }
            if (arrayList.size() == 1) {
                return (x) arrayList.get(0);
            }
            if (z6) {
                return f25f;
            }
            throw new com.bumptech.glide.k("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f28c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f26a.iterator();
            while (it.hasNext()) {
                D d9 = (D) it.next();
                if (!this.f28c.contains(d9) && d9.f21a.isAssignableFrom(cls)) {
                    this.f28c.add(d9);
                    arrayList.add(d9.f23c.j(this));
                    this.f28c.remove(d9);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f26a.iterator();
        while (it.hasNext()) {
            D d9 = (D) it.next();
            if (!arrayList.contains(d9.f22b) && d9.f21a.isAssignableFrom(cls)) {
                arrayList.add(d9.f22b);
            }
        }
        return arrayList;
    }
}
