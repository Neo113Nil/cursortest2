package com.gamericefishpro.space.r5;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class s0 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    public s0(int i) {
        this.a = 1;
        this.b = i;
        if (i <= 0) {
            com.gamericefishpro.space.u.a.c("maxSize <= 0");
            throw null;
        }
        this.f = new com.gamericefishpro.space.c5.e(2);
        this.g = new com.gamericefishpro.space.n9.a0(27);
    }

    public static void i(Object key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public void a() {
        ArrayList arrayList = (ArrayList) this.f;
        View view = (View) arrayList.get(arrayList.size() - 1);
        p0 p0Var = (p0) view.getLayoutParams();
        this.c = ((StaggeredGridLayoutManager) this.g).m.c(view);
        p0Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f).clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public Object c(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    public Object d(Object key) {
        Object value;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (((com.gamericefishpro.space.n9.a0) this.g)) {
            com.gamericefishpro.space.c5.e eVar = (com.gamericefishpro.space.c5.e) this.f;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = eVar.a.get(key);
            if (obj != null) {
                this.d++;
                return obj;
            }
            this.e++;
            Object oldValue = c(key);
            if (oldValue == null) {
                return null;
            }
            synchronized (((com.gamericefishpro.space.n9.a0) this.g)) {
                com.gamericefishpro.space.c5.e eVar2 = (com.gamericefishpro.space.c5.e) this.f;
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(oldValue, "value");
                value = eVar2.a.put(key, oldValue);
                if (value != null) {
                    com.gamericefishpro.space.c5.e eVar3 = (com.gamericefishpro.space.c5.e) this.f;
                    eVar3.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    eVar3.a.put(key, value);
                } else {
                    int i = this.c;
                    i(key, oldValue);
                    this.c = i + 1;
                    Unit unit = Unit.a;
                }
            }
            if (value == null) {
                j(this.b);
                return oldValue;
            }
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
            return value;
        }
    }

    public int e(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f).size() == 0) {
            return i;
        }
        a();
        return this.c;
    }

    public int f(int i) {
        ArrayList arrayList = (ArrayList) this.f;
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        p0 p0Var = (p0) view.getLayoutParams();
        this.b = ((StaggeredGridLayoutManager) this.g).m.f(view);
        p0Var.getClass();
        return this.b;
    }

    public Object g(Object key, Object value) {
        Object oldValue;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (((com.gamericefishpro.space.n9.a0) this.g)) {
            try {
                int i = this.c;
                i(key, value);
                this.c = i + 1;
                com.gamericefishpro.space.c5.e eVar = (com.gamericefishpro.space.c5.e) this.f;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                oldValue = eVar.a.put(key, value);
                if (oldValue != null) {
                    int i2 = this.c;
                    i(key, oldValue);
                    this.c = i2 - 1;
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (oldValue != null) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        }
        j(this.b);
        return oldValue;
    }

    public Object h(Object key) {
        Object oldValue;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (((com.gamericefishpro.space.n9.a0) this.g)) {
            try {
                com.gamericefishpro.space.c5.e eVar = (com.gamericefishpro.space.c5.e) this.f;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                oldValue = eVar.a.remove(key);
                if (oldValue != null) {
                    int i = this.c;
                    i(key, oldValue);
                    this.c = i - 1;
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (oldValue != null) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        }
        return oldValue;
    }

    public void j(int i) {
        Object next;
        Object key;
        Object oldValue;
        while (true) {
            synchronized (((com.gamericefishpro.space.n9.a0) this.g)) {
                try {
                    if (this.c < 0 || (((com.gamericefishpro.space.c5.e) this.f).a.isEmpty() && this.c != 0)) {
                        break;
                    }
                    if (this.c > i && !((com.gamericefishpro.space.c5.e) this.f).a.isEmpty()) {
                        Set setEntrySet = ((com.gamericefishpro.space.c5.e) this.f).a.entrySet();
                        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
                        Set set = setEntrySet;
                        Intrinsics.checkNotNullParameter(set, "<this>");
                        if (set instanceof List) {
                            List list = (List) set;
                            next = list.isEmpty() ? null : list.get(0);
                        } else {
                            Iterator it = set.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        oldValue = entry.getValue();
                        com.gamericefishpro.space.c5.e eVar = (com.gamericefishpro.space.c5.e) this.f;
                        eVar.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        eVar.a.remove(key);
                        int i2 = this.c;
                        i(key, oldValue);
                        this.c = i2 - 1;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        }
        Intrinsics.checkNotNullParameter("LruCache.sizeOf() is reporting inconsistent results!", "message");
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                synchronized (((com.gamericefishpro.space.n9.a0) this.g)) {
                    try {
                        int i = this.d;
                        int i2 = this.e + i;
                        str = "LruCache[maxSize=" + this.b + ",hits=" + this.d + ",misses=" + this.e + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public s0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.a = 0;
        this.g = staggeredGridLayoutManager;
        this.f = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = i;
    }
}
