package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w1a {
    public final gao a;
    public final m1a b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final rp7 d = new rp7(24);
    public final rp7 e = new rp7(24);
    public final tao f;
    public final WeakHashMap g;
    public final WeakHashMap h;
    public final WeakHashMap i;
    public final kyr j;
    public final WeakHashMap k;
    public boolean l;
    public final sr7 m;

    public w1a(gao gaoVar, m1a m1aVar) {
        this.a = gaoVar;
        this.b = m1aVar;
        s1a s1aVar = new s1a(this, 0);
        s1a s1aVar2 = new s1a(this, 1);
        tao taoVar = new tao();
        taoVar.a = s1aVar;
        taoVar.b = s1aVar2;
        taoVar.c = new WeakHashMap();
        taoVar.d = new HashMap();
        taoVar.e = new WeakHashMap();
        this.f = taoVar;
        this.g = new WeakHashMap();
        this.h = new WeakHashMap();
        this.i = new WeakHashMap();
        this.j = new kyr();
        this.k = new WeakHashMap();
        this.m = new sr7(8, this);
    }

    public static final void a(w1a w1aVar, gc8 gc8Var, xzb xzbVar, View view, ArrayList arrayList, long j, rp7 rp7Var) {
        HashMap hashMap = new HashMap(arrayList.size(), 1.0f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wj9 wj9Var = (wj9) it.next();
            br5 br5Var = new br5(gc8Var.getDataTag().a, gc8Var.getLogId(), (String) wj9Var.a().a(xzbVar));
            int i = i9f.a;
            hashMap.put(br5Var, wj9Var);
        }
        Map synchronizedMap = Collections.synchronizedMap(hashMap);
        ((ConcurrentLinkedQueue) rp7Var.a).add(synchronizedMap);
        String logId = gc8Var.getLogId();
        Handler handler = w1aVar.c;
        t1a t1aVar = new t1a(w1aVar, view, gc8Var, logId, xzbVar, synchronizedMap, arrayList);
        if (synchronizedMap == null) {
            handler.postDelayed(t1aVar, j);
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                jo0.F(handler, t1aVar, synchronizedMap, j);
                return;
            }
            Message obtain = Message.obtain(handler, t1aVar);
            obtain.obj = synchronizedMap;
            handler.sendMessageDelayed(obtain, j);
        }
    }

    public static ArrayList c(List list, xzb xzbVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) ((wj9) obj).isEnabled().a(xzbVar)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void f(e23 e23Var, View view, jc8 jc8Var, Function2 function2) {
        jc8 jc8Var2;
        if (!((Boolean) function2.invoke(view, jc8Var)).booleanValue() || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                rj7.m();
                return;
            }
            gc8 gc8Var = e23Var.a;
            synchronized (gc8Var.t) {
                jc8Var2 = (jc8) gc8Var.t.get(childAt);
            }
            f(e23Var, childAt, jc8Var2, function2);
            i = i2;
        }
    }

    public static void i(w1a w1aVar, gc8 gc8Var, xzb xzbVar, View view, jc8 jc8Var) {
        List P = vq1.P(jc8Var.d());
        List e = jc8Var.d().e();
        if (e == null) {
            e = c5b.a;
        }
        w1aVar.h(gc8Var, xzbVar, view, jc8Var, P, e);
    }

    public final void b(br5 br5Var, View view, wj9 wj9Var, rp7 rp7Var) {
        Object obj;
        int i = i9f.a;
        az6 az6Var = new az6(29, this);
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) rp7Var.a;
        Iterator it = concurrentLinkedQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Map) obj).remove(br5Var) != null) {
                    break;
                }
            }
        }
        Map map = (Map) obj;
        if (map != null && map.isEmpty()) {
            az6Var.invoke(map);
            concurrentLinkedQueue.remove(map);
        }
        WeakHashMap weakHashMap = this.k;
        Set set = (Set) weakHashMap.get(view);
        if (!(wj9Var instanceof tw8) || view == null || set == null) {
            return;
        }
        set.remove(wj9Var);
        if (set.isEmpty()) {
            weakHashMap.remove(view);
            this.j.remove(view);
        }
    }

    public final LinkedHashMap d() {
        LinkedHashMap linkedHashMap;
        kyr kyrVar = this.j;
        synchronized (kyrVar.a) {
            Set<Map.Entry> entrySet = kyrVar.entrySet();
            int a = tah.a(v75.o(entrySet, 10));
            if (a < 16) {
                a = 16;
            }
            linkedHashMap = new LinkedHashMap(a);
            for (Map.Entry entry : entrySet) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r12 >= ((java.lang.Number) ((defpackage.l1a) r11).k.a(r9)).longValue()) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0046, code lost:
    
        if (r12 <= ((java.lang.Number) ((defpackage.tw8) r11).k.a(r9)).longValue()) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r12 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(gc8 gc8Var, xzb xzbVar, View view, wj9 wj9Var, int i, rp7 rp7Var) {
        boolean z;
        Object obj;
        br5 br5Var;
        Set keySet;
        br5[] br5VarArr;
        if (!(wj9Var instanceof l1a)) {
            if (wj9Var instanceof tw8) {
                Set set = (Set) this.k.get(view);
                if (set != null ? set.contains(wj9Var) : false) {
                }
            }
            z = false;
        }
        br5 br5Var2 = new br5(gc8Var.getDataTag().a, gc8Var.getLogId(), (String) wj9Var.a().a(xzbVar));
        Iterator it = ((ConcurrentLinkedQueue) rp7Var.a).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Map) obj).containsKey(br5Var2)) {
                break;
            }
        }
        Map map = (Map) obj;
        if (map != null && (keySet = map.keySet()) != null && (br5VarArr = (br5[]) keySet.toArray(new br5[0])) != null) {
            int length = br5VarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                br5Var = br5VarArr[i2];
                if (Intrinsics.d(br5Var, br5Var2)) {
                    break;
                }
            }
        }
        br5Var = null;
        if (view != null && br5Var == null && z) {
            return true;
        }
        if ((view == null || br5Var != null || z) && (view == null || br5Var == null || !z)) {
            if (view != null && br5Var != null && !z) {
                b(br5Var, view, wj9Var, rp7Var);
                return false;
            }
            if (view == null && br5Var != null) {
                b(br5Var, null, wj9Var, rp7Var);
            }
        }
        return false;
    }

    public final void g(gc8 gc8Var, xzb xzbVar, View view, jc8 jc8Var, List list, List list2) {
        w1a w1aVar = this;
        xzb xzbVar2 = xzbVar;
        View view2 = view;
        d51 d51Var = d51.l;
        synchronized (d51Var) {
        }
        if (!qht.a.a()) {
            g23 d = gc8Var.getViewComponent$div_release().d();
            f23 a = d.a();
            try {
                d51Var.p(new u1a(d, a, view, list, list2, this, jc8Var, xzbVar, gc8Var));
                return;
            } catch (Throwable th) {
                g23.b(a);
                throw th;
            }
        }
        int d2 = w1aVar.a.d(view2);
        WeakHashMap weakHashMap = w1aVar.g;
        if (d2 > 0) {
            weakHashMap.put(view2, jc8Var);
        } else {
            weakHashMap.remove(view2);
        }
        if (!w1aVar.l) {
            w1aVar.l = true;
            w1aVar.c.post(w1aVar.m);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Long valueOf = Long.valueOf(((Number) y2x.x((l1a) obj).a(xzbVar2)).longValue());
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            List list3 = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(list3.size());
            for (Object obj3 : list3) {
                int i = d2;
                if (w1aVar.e(gc8Var, xzbVar2, view2, (l1a) obj3, d2, w1aVar.d)) {
                    arrayList.add(obj3);
                }
                xzbVar2 = xzbVar;
                view2 = view;
                d2 = i;
            }
            int i2 = d2;
            if (arrayList.isEmpty()) {
                xzbVar2 = xzbVar;
                view2 = view;
            } else {
                xzbVar2 = xzbVar;
                view2 = view;
                a(w1aVar, gc8Var, xzbVar2, view2, arrayList, longValue, w1aVar.d);
            }
            d2 = i2;
        }
        int i3 = d2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj4 : list2) {
            Long valueOf2 = Long.valueOf(((Number) y2x.x((tw8) obj4).a(xzbVar2)).longValue());
            Object obj5 = linkedHashMap2.get(valueOf2);
            if (obj5 == null) {
                obj5 = new ArrayList();
                linkedHashMap2.put(valueOf2, obj5);
            }
            ((List) obj5).add(obj4);
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            long longValue2 = ((Number) entry2.getKey()).longValue();
            List list4 = (List) entry2.getValue();
            List<tw8> list5 = list4;
            boolean z = false;
            for (tw8 tw8Var : list5) {
                boolean z2 = z;
                boolean z3 = ((long) i3) > ((Number) tw8Var.k.a(xzbVar2)).longValue();
                z = z2 || z3;
                if (z3) {
                    WeakHashMap weakHashMap2 = w1aVar.k;
                    Object obj6 = weakHashMap2.get(view2);
                    if (obj6 == null) {
                        obj6 = new LinkedHashSet();
                        weakHashMap2.put(view2, obj6);
                    }
                    ((Set) obj6).add(tw8Var);
                }
            }
            if (z) {
                w1aVar.j.put(view2, jc8Var);
            }
            ArrayList arrayList2 = new ArrayList(list4.size());
            for (Object obj7 : list5) {
                if (w1aVar.e(gc8Var, xzbVar2, view2, (tw8) obj7, i3, w1aVar.e)) {
                    arrayList2.add(obj7);
                }
                xzbVar2 = xzbVar;
                view2 = view;
            }
            if (!arrayList2.isEmpty()) {
                a(w1aVar, gc8Var, xzbVar, view, arrayList2, longValue2, w1aVar.e);
            }
            w1aVar = this;
            xzbVar2 = xzbVar;
            view2 = view;
        }
    }

    public final void h(gc8 gc8Var, xzb xzbVar, View view, jc8 jc8Var, List list, List list2) {
        List list3 = list2;
        ArrayList g0 = CollectionsKt.g0(list, list3);
        if (g0.isEmpty()) {
            return;
        }
        dw8 dataTag = gc8Var.getDataTag();
        if (view == null) {
            tao taoVar = this.f;
            taoVar.getClass();
            Iterator it = g0.iterator();
            while (it.hasNext()) {
                taoVar.b((wj9) it.next());
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                e(gc8Var, xzbVar, null, (l1a) it2.next(), 0, this.d);
            }
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                e(gc8Var, xzbVar, null, (tw8) it3.next(), 0, this.e);
            }
            return;
        }
        WeakHashMap weakHashMap = this.h;
        if (weakHashMap.containsKey(view)) {
            return;
        }
        if (wyf.K(view) || (wyf.D(view) == null && !view.isLayoutRequested())) {
            if (Intrinsics.d(gc8Var.getDataTag(), dataTag)) {
                this.f.j(view, gc8Var, xzbVar, jc8Var, g0);
                g(gc8Var, xzbVar, view, jc8Var, c(list, xzbVar), c(list2, xzbVar));
            }
            weakHashMap.remove(view);
            return;
        }
        View D = wyf.D(view);
        if (D != null) {
            D.addOnLayoutChangeListener(new v1a(gc8Var, dataTag, this, view, xzbVar, jc8Var, g0, list, list2));
        }
        weakHashMap.put(view, jc8Var);
    }
}
