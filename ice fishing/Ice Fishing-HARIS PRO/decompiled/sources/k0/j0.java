package k0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m0.C0298f;
import q.C0331b;

/* loaded from: classes.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3518a;

    /* renamed from: b, reason: collision with root package name */
    public int f3519b;

    /* renamed from: c, reason: collision with root package name */
    public int f3520c;

    /* renamed from: d, reason: collision with root package name */
    public int f3521d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3522f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3523g;

    public j0(int i) {
        this.f3518a = 1;
        this.f3519b = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f3522f = new C0298f();
        this.f3523g = new C0331b();
    }

    public void a() {
        View view = (View) ((ArrayList) this.f3522f).get(r0.size() - 1);
        g0 g0Var = (g0) view.getLayoutParams();
        this.f3520c = ((StaggeredGridLayoutManager) this.f3523g).f2198r.b(view);
        g0Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f3522f).clear();
        this.f3519b = Integer.MIN_VALUE;
        this.f3520c = Integer.MIN_VALUE;
        this.f3521d = 0;
    }

    public int c() {
        return ((StaggeredGridLayoutManager) this.f3523g).f2203w ? e(r1.size() - 1, -1) : e(0, ((ArrayList) this.f3522f).size());
    }

    public int d() {
        return ((StaggeredGridLayoutManager) this.f3523g).f2203w ? e(0, ((ArrayList) this.f3522f).size()) : e(r1.size() - 1, -1);
    }

    public int e(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f3523g;
        int k2 = staggeredGridLayoutManager.f2198r.k();
        int g2 = staggeredGridLayoutManager.f2198r.g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.f3522f).get(i);
            int e = staggeredGridLayoutManager.f2198r.e(view);
            int b2 = staggeredGridLayoutManager.f2198r.b(view);
            boolean z2 = e <= g2;
            boolean z3 = b2 >= k2;
            if (z2 && z3 && (e < k2 || b2 > g2)) {
                return K.H(view);
            }
            i += i3;
        }
        return -1;
    }

    public Object f(Object obj) {
        D1.i.e(obj, "key");
        synchronized (((C0331b) this.f3523g)) {
            C0298f c0298f = (C0298f) this.f3522f;
            c0298f.getClass();
            Object obj2 = ((LinkedHashMap) c0298f.f4074a).get(obj);
            if (obj2 != null) {
                this.f3521d++;
                return obj2;
            }
            this.e++;
            return null;
        }
    }

    public int g(int i) {
        int i2 = this.f3520c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f3522f).size() == 0) {
            return i;
        }
        a();
        return this.f3520c;
    }

    public View h(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f3522f;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f3523g;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f2203w && K.H(view2) >= i) || ((!staggeredGridLayoutManager.f2203w && K.H(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.f2203w && K.H(view3) <= i) || ((!staggeredGridLayoutManager.f2203w && K.H(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    public int i(int i) {
        int i2 = this.f3519b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f3522f).size() == 0) {
            return i;
        }
        View view = (View) ((ArrayList) this.f3522f).get(0);
        g0 g0Var = (g0) view.getLayoutParams();
        this.f3519b = ((StaggeredGridLayoutManager) this.f3523g).f2198r.e(view);
        g0Var.getClass();
        return this.f3519b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(Object obj, Object obj2) {
        D1.i.e(obj, "key");
        synchronized (((C0331b) this.f3523g)) {
            this.f3520c++;
            C0298f c0298f = (C0298f) this.f3522f;
            c0298f.getClass();
            Object put = ((LinkedHashMap) c0298f.f4074a).put(obj, obj2);
            if (put != null) {
                this.f3520c--;
            }
        }
        int i = this.f3519b;
        while (true) {
            synchronized (((C0331b) this.f3523g)) {
                try {
                    if (this.f3520c < 0 || (((LinkedHashMap) ((C0298f) this.f3522f).f4074a).isEmpty() && this.f3520c != 0)) {
                        break;
                    }
                    if (this.f3520c <= i || ((LinkedHashMap) ((C0298f) this.f3522f).f4074a).isEmpty()) {
                        break;
                    }
                    Set entrySet = ((LinkedHashMap) ((C0298f) this.f3522f).f4074a).entrySet();
                    D1.i.d(entrySet, "map.entries");
                    Object obj3 = null;
                    if (entrySet instanceof List) {
                        List list = (List) entrySet;
                        if (!list.isEmpty()) {
                            obj3 = list.get(0);
                        }
                    } else {
                        Iterator it = entrySet.iterator();
                        if (it.hasNext()) {
                            obj3 = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj3;
                    if (entry != null) {
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        C0298f c0298f2 = (C0298f) this.f3522f;
                        c0298f2.getClass();
                        D1.i.e(key, "key");
                        ((LinkedHashMap) c0298f2.f4074a).remove(key);
                        int i2 = this.f3520c;
                        D1.i.e(value, "value");
                        this.f3520c = i2 - 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public String toString() {
        String str;
        switch (this.f3518a) {
            case 1:
                synchronized (((C0331b) this.f3523g)) {
                    try {
                        int i = this.f3521d;
                        int i2 = this.e + i;
                        str = "LruCache[maxSize=" + this.f3519b + ",hits=" + this.f3521d + ",misses=" + this.e + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public j0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f3518a = 0;
        this.f3523g = staggeredGridLayoutManager;
        this.f3522f = new ArrayList();
        this.f3519b = Integer.MIN_VALUE;
        this.f3520c = Integer.MIN_VALUE;
        this.f3521d = 0;
        this.e = i;
    }
}
