package com.anythink.core.c.a;

import android.text.TextUtils;
import com.anythink.core.d.f;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    f f12813a;

    /* renamed from: b, reason: collision with root package name */
    List<a> f12814b;

    /* renamed from: c, reason: collision with root package name */
    Map<Integer, List<a>> f12815c = new ConcurrentHashMap(3);

    public final void a(int i, List<a> list) {
        if (i == -1) {
            this.f12814b = list;
        } else {
            this.f12815c.put(Integer.valueOf(i), list);
        }
    }

    public final boolean b(f fVar) {
        f fVar2 = this.f12813a;
        return fVar2 != null && fVar2.b() == fVar.b() && this.f12813a.a() == fVar.a() && this.f12813a.c() == fVar.c() && this.f12813a.d() == fVar.d();
    }

    public final void c(int i) {
        List<a> a9 = a(i);
        if (this.f12813a == null || a9 == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - ((this.f12813a.b() * 86400) * 1000);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        Iterator<a> it = a9.iterator();
        while (it.hasNext()) {
            if (it.next().g() < timeInMillis) {
                it.remove();
            }
        }
    }

    public final List<a> a(int i) {
        if (i == -1) {
            return this.f12814b;
        }
        return this.f12815c.get(Integer.valueOf(i));
    }

    public final void a(f fVar) {
        this.f12813a = fVar;
    }

    private f a() {
        return this.f12813a;
    }

    public final d b(int i) {
        List<a> list;
        if (i == -1) {
            list = this.f12814b;
        } else {
            list = this.f12815c.get(Integer.valueOf(i));
        }
        if (list == null || list.size() < this.f12813a.d()) {
            return null;
        }
        double d9 = 0.0d;
        String str = "";
        for (a aVar : list) {
            double f2 = aVar.f();
            if (f2 > d9) {
                str = aVar.d();
                d9 = f2;
            }
        }
        return new d(d9, str);
    }

    public final void a(a aVar) {
        if (this.f12813a == null) {
            return;
        }
        List<a> list = this.f12814b;
        if (list != null) {
            a(list, aVar);
        }
        List<a> list2 = this.f12815c.get(Integer.valueOf(aVar.a()));
        if (list2 != null) {
            a(list2, aVar);
        }
    }

    private void a(List<a> list, a aVar) {
        Iterator<a> it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (TextUtils.equals(it.next().b(), aVar.b())) {
                    list.set(i, aVar);
                    break;
                }
                i++;
            } else {
                list.add(0, aVar);
                break;
            }
        }
        while (list.size() > this.f12813a.c()) {
            list.remove(list.size() - 1);
        }
    }
}
