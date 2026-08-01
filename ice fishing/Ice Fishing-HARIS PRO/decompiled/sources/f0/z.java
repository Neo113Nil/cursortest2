package f0;

import a.AbstractC0078a;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.EnumC0097n;
import androidx.lifecycle.InterfaceC0101s;
import androidx.lifecycle.U;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.NavGraphNavigator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import r.AbstractC0341i;
import r.C0343k;
import s.AbstractC0346a;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: A, reason: collision with root package name */
    public final ArrayList f3002A;

    /* renamed from: B, reason: collision with root package name */
    public final t1.h f3003B;

    /* renamed from: C, reason: collision with root package name */
    public final O1.l f3004C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3005a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f3006b;

    /* renamed from: c, reason: collision with root package name */
    public y f3007c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f3008d;
    public Parcelable[] e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3009f;

    /* renamed from: g, reason: collision with root package name */
    public final u1.e f3010g;

    /* renamed from: h, reason: collision with root package name */
    public final O1.q f3011h;
    public final O1.q i;
    public final LinkedHashMap j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f3012k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f3013l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f3014m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0101s f3015n;

    /* renamed from: o, reason: collision with root package name */
    public C0150o f3016o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f3017p;

    /* renamed from: q, reason: collision with root package name */
    public EnumC0097n f3018q;

    /* renamed from: r, reason: collision with root package name */
    public final C0143h f3019r;

    /* renamed from: s, reason: collision with root package name */
    public final Z.D f3020s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f3021t;

    /* renamed from: u, reason: collision with root package name */
    public final O f3022u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashMap f3023v;

    /* renamed from: w, reason: collision with root package name */
    public D1.j f3024w;

    /* renamed from: x, reason: collision with root package name */
    public C0145j f3025x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f3026y;

    /* renamed from: z, reason: collision with root package name */
    public int f3027z;

    public z(Context context) {
        Object obj;
        this.f3005a = context;
        Iterator it = J1.h.f0(context, C0137b.f2902d).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f3006b = (Activity) obj;
        this.f3010g = new u1.e();
        u1.o oVar = u1.o.f4473a;
        this.f3011h = new O1.q(oVar);
        this.i = new O1.q(oVar);
        this.j = new LinkedHashMap();
        this.f3012k = new LinkedHashMap();
        this.f3013l = new LinkedHashMap();
        this.f3014m = new LinkedHashMap();
        this.f3017p = new CopyOnWriteArrayList();
        this.f3018q = EnumC0097n.f2039b;
        this.f3019r = new C0143h(0, this);
        this.f3020s = new Z.D(1, this);
        this.f3021t = true;
        O o2 = new O();
        this.f3022u = o2;
        this.f3023v = new LinkedHashMap();
        this.f3026y = new LinkedHashMap();
        o2.a(new NavGraphNavigator(o2));
        o2.a(new ActivityNavigator(this.f3005a));
        this.f3002A = new ArrayList();
        this.f3003B = new t1.h(new J1.j(3, this));
        this.f3004C = new O1.l(1, 1, 2);
    }

    public static w d(int i, w wVar, w wVar2, boolean z2) {
        y yVar;
        if (wVar.f2994h == i && (wVar2 == null || (wVar.equals(wVar2) && D1.i.a(wVar.f2989b, wVar2.f2989b)))) {
            return wVar;
        }
        if (wVar instanceof y) {
            yVar = (y) wVar;
        } else {
            y yVar2 = wVar.f2989b;
            D1.i.b(yVar2);
            yVar = yVar2;
        }
        return yVar.g(i, yVar, wVar2, z2);
    }

    public static /* synthetic */ void r(z zVar, C0141f c0141f) {
        zVar.q(c0141f, false, new u1.e());
    }

    public final void a(w wVar, Bundle bundle, C0141f c0141f, List list) {
        Object obj;
        Object obj2;
        w wVar2 = c0141f.f2920b;
        boolean z2 = wVar2 instanceof InterfaceC0138c;
        u1.e eVar = this.f3010g;
        if (!z2) {
            while (!eVar.isEmpty() && (((C0141f) eVar.e()).f2920b instanceof InterfaceC0138c) && p(((C0141f) eVar.e()).f2920b.f2994h, true, false)) {
            }
        }
        u1.e eVar2 = new u1.e();
        boolean z3 = wVar instanceof y;
        Context context = this.f3005a;
        Object obj3 = null;
        if (z3) {
            w wVar3 = wVar2;
            do {
                D1.i.b(wVar3);
                wVar3 = wVar3.f2989b;
                if (wVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (D1.i.a(((C0141f) obj2).f2920b, wVar3)) {
                                break;
                            }
                        }
                    }
                    C0141f c0141f2 = (C0141f) obj2;
                    if (c0141f2 == null) {
                        c0141f2 = S0.e.e(context, wVar3, bundle, i(), this.f3016o);
                    }
                    eVar2.addFirst(c0141f2);
                    if (!eVar.isEmpty() && ((C0141f) eVar.e()).f2920b == wVar3) {
                        r(this, (C0141f) eVar.e());
                    }
                }
                if (wVar3 == null) {
                    break;
                }
            } while (wVar3 != wVar);
        }
        w wVar4 = eVar2.isEmpty() ? wVar2 : ((C0141f) eVar2.c()).f2920b;
        while (wVar4 != null && c(wVar4.f2994h, wVar4) != wVar4) {
            wVar4 = wVar4.f2989b;
            if (wVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (D1.i.a(((C0141f) obj).f2920b, wVar4)) {
                            break;
                        }
                    }
                }
                C0141f c0141f3 = (C0141f) obj;
                if (c0141f3 == null) {
                    c0141f3 = S0.e.e(context, wVar4, wVar4.a(bundle2), i(), this.f3016o);
                }
                eVar2.addFirst(c0141f3);
            }
        }
        if (!eVar2.isEmpty()) {
            wVar2 = ((C0141f) eVar2.c()).f2920b;
        }
        while (!eVar.isEmpty() && (((C0141f) eVar.e()).f2920b instanceof y)) {
            w wVar5 = ((C0141f) eVar.e()).f2920b;
            D1.i.c(wVar5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((y) wVar5).f2999k.b(wVar2.f2994h) != null) {
                break;
            } else {
                r(this, (C0141f) eVar.e());
            }
        }
        C0141f c0141f4 = (C0141f) (eVar.isEmpty() ? null : eVar.f4470b[eVar.f4469a]);
        if (c0141f4 == null) {
            c0141f4 = (C0141f) (eVar2.isEmpty() ? null : eVar2.f4470b[eVar2.f4469a]);
        }
        if (!D1.i.a(c0141f4 != null ? c0141f4.f2920b : null, this.f3007c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                w wVar6 = ((C0141f) previous).f2920b;
                y yVar = this.f3007c;
                D1.i.b(yVar);
                if (D1.i.a(wVar6, yVar)) {
                    obj3 = previous;
                    break;
                }
            }
            C0141f c0141f5 = (C0141f) obj3;
            if (c0141f5 == null) {
                y yVar2 = this.f3007c;
                D1.i.b(yVar2);
                y yVar3 = this.f3007c;
                D1.i.b(yVar3);
                c0141f5 = S0.e.e(context, yVar2, yVar3.a(bundle), i(), this.f3016o);
            }
            eVar2.addFirst(c0141f5);
        }
        Iterator it = eVar2.iterator();
        while (it.hasNext()) {
            C0141f c0141f6 = (C0141f) it.next();
            Object obj4 = this.f3023v.get(this.f3022u.b(c0141f6.f2920b.f2988a));
            if (obj4 == null) {
                throw new IllegalStateException(D1.h.h(new StringBuilder("NavigatorBackStack for "), wVar.f2988a, " should already be created").toString());
            }
            ((C0144i) obj4).a(c0141f6);
        }
        eVar.addAll(eVar2);
        eVar.addLast(c0141f);
        ArrayList arrayList = new ArrayList(eVar2.size() + 1);
        arrayList.addAll(eVar2);
        arrayList.add(c0141f);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0141f c0141f7 = (C0141f) it2.next();
            y yVar4 = c0141f7.f2920b.f2989b;
            if (yVar4 != null) {
                k(c0141f7, e(yVar4.f2994h));
            }
        }
    }

    public final boolean b() {
        u1.e eVar;
        while (true) {
            eVar = this.f3010g;
            if (eVar.isEmpty() || !(((C0141f) eVar.e()).f2920b instanceof y)) {
                break;
            }
            r(this, (C0141f) eVar.e());
        }
        C0141f c0141f = (C0141f) eVar.f();
        ArrayList arrayList = this.f3002A;
        if (c0141f != null) {
            arrayList.add(c0141f);
        }
        this.f3027z++;
        w();
        int i = this.f3027z - 1;
        this.f3027z = i;
        if (i == 0) {
            ArrayList Z2 = u1.g.Z(arrayList);
            arrayList.clear();
            Iterator it = Z2.iterator();
            while (it.hasNext()) {
                C0141f c0141f2 = (C0141f) it.next();
                Iterator it2 = this.f3017p.iterator();
                while (it2.hasNext()) {
                    Y0.b bVar = (Y0.b) it2.next();
                    w wVar = c0141f2.f2920b;
                    c0141f2.e();
                    bVar.a(this, wVar);
                }
                this.f3004C.n(c0141f2);
            }
            this.f3011h.g(u1.g.Z(eVar));
            this.i.g(s());
        }
        return c0141f != null;
    }

    public final w c(int i, w wVar) {
        w wVar2;
        y yVar = this.f3007c;
        if (yVar == null) {
            return null;
        }
        if (yVar.f2994h == i) {
            if (wVar == null) {
                return yVar;
            }
            if (D1.i.a(yVar, wVar) && wVar.f2989b == null) {
                return this.f3007c;
            }
        }
        C0141f c0141f = (C0141f) this.f3010g.f();
        if (c0141f == null || (wVar2 = c0141f.f2920b) == null) {
            wVar2 = this.f3007c;
            D1.i.b(wVar2);
        }
        return d(i, wVar2, wVar, false);
    }

    public final C0141f e(int i) {
        Object obj;
        u1.e eVar = this.f3010g;
        ListIterator<E> listIterator = eVar.listIterator(eVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((C0141f) obj).f2920b.f2994h == i) {
                break;
            }
        }
        C0141f c0141f = (C0141f) obj;
        if (c0141f != null) {
            return c0141f;
        }
        throw new IllegalArgumentException(("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + f()).toString());
    }

    public final w f() {
        C0141f c0141f = (C0141f) this.f3010g.f();
        if (c0141f != null) {
            return c0141f.f2920b;
        }
        return null;
    }

    public final int g() {
        int i = 0;
        u1.e eVar = this.f3010g;
        if (eVar == null || !eVar.isEmpty()) {
            Iterator<E> it = eVar.iterator();
            while (it.hasNext()) {
                if (!(((C0141f) it.next()).f2920b instanceof y) && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        return i;
    }

    public final y h() {
        y yVar = this.f3007c;
        if (yVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        D1.i.c(yVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return yVar;
    }

    public final EnumC0097n i() {
        return this.f3015n == null ? EnumC0097n.f2040c : this.f3018q;
    }

    public final y j(u1.e eVar) {
        w wVar;
        C0141f c0141f = (C0141f) eVar.f();
        if (c0141f == null || (wVar = c0141f.f2920b) == null) {
            wVar = this.f3007c;
            D1.i.b(wVar);
        }
        if (wVar instanceof y) {
            return (y) wVar;
        }
        y yVar = wVar.f2989b;
        D1.i.b(yVar);
        return yVar;
    }

    public final void k(C0141f c0141f, C0141f c0141f2) {
        this.j.put(c0141f, c0141f2);
        LinkedHashMap linkedHashMap = this.f3012k;
        if (linkedHashMap.get(c0141f2) == null) {
            linkedHashMap.put(c0141f2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c0141f2);
        D1.i.b(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    public final void l(int i, Bundle bundle) {
        int i2;
        C0134C c0134c;
        Bundle bundle2;
        int i3;
        u1.e eVar = this.f3010g;
        w wVar = eVar.isEmpty() ? this.f3007c : ((C0141f) eVar.e()).f2920b;
        if (wVar == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        C0139d c2 = wVar.c(i);
        if (c2 != null) {
            c0134c = c2.f2913b;
            Bundle bundle3 = c2.f2914c;
            i2 = c2.f2912a;
            if (bundle3 != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundle3);
            } else {
                bundle2 = null;
            }
        } else {
            i2 = i;
            c0134c = null;
            bundle2 = null;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (i2 == 0 && c0134c != null && (i3 = c0134c.f2862c) != -1) {
            if (i3 != -1) {
                o(i3, c0134c.f2863d);
                return;
            }
            return;
        }
        if (i2 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        w c3 = c(i2, null);
        if (c3 != null) {
            m(c3, bundle2, c0134c);
            return;
        }
        int i4 = w.j;
        Context context = this.f3005a;
        String w2 = R.j.w(context, i2);
        if (c2 == null) {
            throw new IllegalArgumentException("Navigation action/destination " + w2 + " cannot be found from the current destination " + wVar);
        }
        throw new IllegalArgumentException(("Navigation destination " + w2 + " referenced from action " + R.j.w(context, i) + " cannot be found from the current destination " + wVar).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e6, code lost:
    
        if (r14.equals(r6) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f6, code lost:
    
        r6 = new u1.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ff, code lost:
    
        if (u1.h.E(r11) < r13) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0101, code lost:
    
        r12 = (f0.C0141f) u1.m.K(r11);
        v(r12);
        r15 = new f0.C0141f(r12.f2919a, r12.f2920b, r12.f2920b.a(r27), r12.f2922d, r12.e, r12.f2923f, r12.f2924g);
        r15.f2922d = r12.f2922d;
        r15.f(r12.f2926k);
        r6.addFirst(r15);
        r13 = r13;
        r8 = r8;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014c, code lost:
    
        r24 = r4;
        r23 = r8;
        r2 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0158, code lost:
    
        if (r2.hasNext() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015a, code lost:
    
        r3 = (f0.C0141f) r2.next();
        r4 = r3.f2920b.f2989b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0164, code lost:
    
        if (r4 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0166, code lost:
    
        k(r3, e(r4.f2994h));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016f, code lost:
    
        r11.addLast(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0173, code lost:
    
        r2 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017b, code lost:
    
        if (r2.hasNext() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017d, code lost:
    
        r3 = (f0.C0141f) r2.next();
        r10.b(r3.f2920b.f2988a).f(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018f, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f4, code lost:
    
        if (r26.f2994h == r6.f2994h) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(w wVar, Bundle bundle, C0134C c0134c) {
        LinkedHashMap linkedHashMap;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        LinkedHashMap linkedHashMap2 = this.f3023v;
        Iterator it = linkedHashMap2.values().iterator();
        while (it.hasNext()) {
            ((C0144i) it.next()).f2936d = true;
        }
        D1.l lVar = new D1.l();
        boolean p2 = (c0134c == null || (i2 = c0134c.f2862c) == -1) ? false : p(i2, c0134c.f2863d, c0134c.e);
        Bundle a2 = wVar.a(bundle);
        if (c0134c != null && c0134c.f2861b && this.f3013l.containsKey(Integer.valueOf(wVar.f2994h))) {
            lVar.f167a = t(wVar.f2994h, a2, c0134c);
            linkedHashMap = linkedHashMap2;
            z2 = p2;
            z3 = false;
        } else {
            O o2 = this.f3022u;
            if (c0134c != null && c0134c.f2860a) {
                u1.e eVar = this.f3010g;
                C0141f c0141f = (C0141f) eVar.f();
                eVar.getClass();
                ListIterator listIterator = eVar.listIterator(eVar.f4471c);
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                        break;
                    } else if (((C0141f) listIterator.previous()).f2920b == wVar) {
                        i = listIterator.nextIndex();
                        break;
                    }
                }
                if (i != -1) {
                    if (wVar instanceof y) {
                        int i3 = y.f2998n;
                        List g02 = J1.h.g0(new J1.l(J1.h.f0((y) wVar, C0137b.f2907l), C0137b.f2905h, 1));
                        if (eVar.f4471c - i == g02.size()) {
                            List subList = eVar.subList(i, eVar.f4471c);
                            ArrayList arrayList = new ArrayList(u1.i.I(subList, 10));
                            Iterator it2 = subList.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Integer.valueOf(((C0141f) it2.next()).f2920b.f2994h));
                            }
                        }
                    } else if (c0141f != null) {
                        w wVar2 = c0141f.f2920b;
                        if (wVar2 != null) {
                        }
                    }
                    if (!z3) {
                        C0141f e = S0.e.e(this.f3005a, wVar, a2, i(), this.f3016o);
                        N b2 = o2.b(wVar.f2988a);
                        List s2 = h0.f.s(e);
                        this.f3024w = new C0149n(lVar, this, wVar, a2);
                        b2.d(s2, c0134c);
                        this.f3024w = null;
                    }
                }
            }
            linkedHashMap = linkedHashMap2;
            z2 = p2;
            z3 = false;
            if (!z3) {
            }
        }
        x();
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            ((C0144i) it3.next()).f2936d = false;
        }
        if (z2 || lVar.f167a || z3) {
            b();
        } else {
            w();
        }
    }

    public final void n() {
        Intent intent;
        int g2 = g();
        u1.e eVar = this.f3010g;
        if (g2 != 1) {
            if (eVar.isEmpty()) {
                return;
            }
            w f2 = f();
            D1.i.b(f2);
            o(f2.f2994h, true);
            return;
        }
        Activity activity = this.f3006b;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
            w f3 = f();
            D1.i.b(f3);
            int i = f3.f2994h;
            for (y yVar = f3.f2989b; yVar != null; yVar = yVar.f2989b) {
                if (yVar.f3000l != i) {
                    Bundle bundle = new Bundle();
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity.getIntent());
                        y j = j(eVar);
                        Intent intent2 = activity.getIntent();
                        D1.i.d(intent2, "activity!!.intent");
                        u h2 = j.h(new M0.h(intent2), true, j);
                        if ((h2 != null ? h2.f2982b : null) != null) {
                            bundle.putAll(h2.f2981a.a(h2.f2982b));
                        }
                    }
                    B.k kVar = new B.k(this);
                    int i2 = yVar.f2994h;
                    ArrayList arrayList = (ArrayList) kVar.f30c;
                    arrayList.clear();
                    arrayList.add(new t(i2, null));
                    if (((y) kVar.f31d) != null) {
                        kVar.p();
                    }
                    ((Intent) kVar.f29b).putExtra("android-support-nav:controller:deepLinkExtras", bundle);
                    kVar.b().b();
                    if (activity != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
                i = yVar.f2994h;
            }
            return;
        }
        if (this.f3009f) {
            D1.i.b(activity);
            Intent intent3 = activity.getIntent();
            Bundle extras2 = intent3.getExtras();
            D1.i.b(extras2);
            int[] intArray = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
            D1.i.b(intArray);
            ArrayList I2 = u1.f.I(intArray);
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            int intValue = ((Number) u1.m.K(I2)).intValue();
            if (parcelableArrayList != null) {
            }
            if (I2.isEmpty()) {
                return;
            }
            int i3 = 0;
            w d2 = d(intValue, h(), null, false);
            if (d2 instanceof y) {
                int i4 = y.f2998n;
                intValue = R.j.s((y) d2).f2994h;
            }
            w f4 = f();
            if (f4 == null || intValue != f4.f2994h) {
                return;
            }
            B.k kVar2 = new B.k(this);
            Bundle d3 = AbstractC0078a.d(new t1.d("android-support-nav:controller:deepLinkIntent", intent3));
            Bundle bundle2 = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
            if (bundle2 != null) {
                d3.putAll(bundle2);
            }
            ((Intent) kVar2.f29b).putExtra("android-support-nav:controller:deepLinkExtras", d3);
            Iterator it = I2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i3 + 1;
                if (i3 < 0) {
                    u1.h.H();
                    throw null;
                }
                ((ArrayList) kVar2.f30c).add(new t(((Number) next).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i3) : null));
                if (((y) kVar2.f31d) != null) {
                    kVar2.p();
                }
                i3 = i5;
            }
            kVar2.b().b();
            activity.finish();
        }
    }

    public final boolean o(int i, boolean z2) {
        return p(i, z2, false) && b();
    }

    public final boolean p(int i, boolean z2, boolean z3) {
        w wVar;
        String str;
        u1.e eVar = this.f3010g;
        if (eVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = u1.g.V(eVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                wVar = null;
                break;
            }
            w wVar2 = ((C0141f) it.next()).f2920b;
            N b2 = this.f3022u.b(wVar2.f2988a);
            if (z2 || wVar2.f2994h != i) {
                arrayList.add(b2);
            }
            if (wVar2.f2994h == i) {
                wVar = wVar2;
                break;
            }
        }
        if (wVar == null) {
            int i2 = w.j;
            Log.i("NavController", "Ignoring popBackStack to destination " + R.j.w(this.f3005a, i) + " as it was not found on the current back stack");
            return false;
        }
        D1.l lVar = new D1.l();
        u1.e eVar2 = new u1.e();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            N n2 = (N) it2.next();
            D1.l lVar2 = new D1.l();
            C0141f c0141f = (C0141f) eVar.e();
            u1.e eVar3 = eVar;
            this.f3025x = new C0145j(lVar2, lVar, this, z3, eVar2);
            n2.i(c0141f, z3);
            this.f3025x = null;
            if (!lVar2.f167a) {
                break;
            }
            eVar = eVar3;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = this.f3013l;
            if (!z2) {
                J1.c cVar = new J1.c(new J1.l(J1.h.f0(wVar, C0137b.f2903f), new C0146k(this, 0), 0));
                while (cVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((w) cVar.next()).f2994h);
                    C0142g c0142g = (C0142g) (eVar2.isEmpty() ? null : eVar2.f4470b[eVar2.f4469a]);
                    linkedHashMap.put(valueOf, c0142g != null ? c0142g.f2927a : null);
                }
            }
            if (!eVar2.isEmpty()) {
                C0142g c0142g2 = (C0142g) eVar2.c();
                J1.c cVar2 = new J1.c(new J1.l(J1.h.f0(c(c0142g2.f2928b, null), C0137b.f2904g), new C0146k(this, 1), 0));
                while (true) {
                    boolean hasNext = cVar2.hasNext();
                    str = c0142g2.f2927a;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((w) cVar2.next()).f2994h), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    this.f3014m.put(str, eVar2);
                }
            }
        }
        x();
        return lVar.f167a;
    }

    public final void q(C0141f c0141f, boolean z2, u1.e eVar) {
        C0150o c0150o;
        O1.i iVar;
        Set set;
        u1.e eVar2 = this.f3010g;
        C0141f c0141f2 = (C0141f) eVar2.e();
        if (!D1.i.a(c0141f2, c0141f)) {
            throw new IllegalStateException(("Attempted to pop " + c0141f.f2920b + ", which is not the top of the back stack (" + c0141f2.f2920b + ')').toString());
        }
        u1.m.K(eVar2);
        C0144i c0144i = (C0144i) this.f3023v.get(this.f3022u.b(c0141f2.f2920b.f2988a));
        boolean z3 = true;
        if ((c0144i == null || (iVar = c0144i.f2937f) == null || (set = (Set) ((O1.q) iVar.f852a).f()) == null || !set.contains(c0141f2)) && !this.f3012k.containsKey(c0141f2)) {
            z3 = false;
        }
        EnumC0097n enumC0097n = c0141f2.f2925h.f2048c;
        EnumC0097n enumC0097n2 = EnumC0097n.f2040c;
        if (enumC0097n.compareTo(enumC0097n2) >= 0) {
            if (z2) {
                c0141f2.f(enumC0097n2);
                eVar.addFirst(new C0142g(c0141f2));
            }
            if (z3) {
                c0141f2.f(enumC0097n2);
            } else {
                c0141f2.f(EnumC0097n.f2038a);
                v(c0141f2);
            }
        }
        if (z2 || z3 || (c0150o = this.f3016o) == null) {
            return;
        }
        String str = c0141f2.f2923f;
        D1.i.e(str, "backStackEntryId");
        U u2 = (U) c0150o.f2957b.remove(str);
        if (u2 != null) {
            u2.a();
        }
    }

    public final ArrayList s() {
        EnumC0097n enumC0097n;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f3023v.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC0097n = EnumC0097n.f2041d;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((O1.q) ((C0144i) it.next()).f2937f.f852a).f();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C0141f c0141f = (C0141f) obj;
                if (!arrayList.contains(c0141f) && c0141f.f2926k.compareTo(enumC0097n) < 0) {
                    arrayList2.add(obj);
                }
            }
            u1.m.J(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f3010g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C0141f c0141f2 = (C0141f) next;
            if (!arrayList.contains(c0141f2) && c0141f2.f2926k.compareTo(enumC0097n) >= 0) {
                arrayList3.add(next);
            }
        }
        u1.m.J(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((C0141f) next2).f2920b instanceof y)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final boolean t(int i, Bundle bundle, C0134C c0134c) {
        w h2;
        C0141f c0141f;
        w wVar;
        LinkedHashMap linkedHashMap = this.f3013l;
        if (!linkedHashMap.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection values = linkedHashMap.values();
        D1.i.e(values, "<this>");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (D1.i.a((String) it.next(), str)) {
                it.remove();
            }
        }
        LinkedHashMap linkedHashMap2 = this.f3014m;
        if (linkedHashMap2 instanceof E1.a) {
            D1.q.c(linkedHashMap2, "kotlin.collections.MutableMap");
            throw null;
        }
        u1.e eVar = (u1.e) linkedHashMap2.remove(str);
        ArrayList arrayList = new ArrayList();
        C0141f c0141f2 = (C0141f) this.f3010g.f();
        if (c0141f2 == null || (h2 = c0141f2.f2920b) == null) {
            h2 = h();
        }
        if (eVar != null) {
            Iterator it2 = eVar.iterator();
            while (it2.hasNext()) {
                C0142g c0142g = (C0142g) it2.next();
                w d2 = d(c0142g.f2928b, h2, null, true);
                Context context = this.f3005a;
                if (d2 == null) {
                    int i2 = w.j;
                    throw new IllegalStateException(("Restore State failed: destination " + R.j.w(context, c0142g.f2928b) + " cannot be found from the current destination " + h2).toString());
                }
                arrayList.add(c0142g.a(context, d2, i(), this.f3016o));
                h2 = d2;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!(((C0141f) next).f2920b instanceof y)) {
                arrayList3.add(next);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            C0141f c0141f3 = (C0141f) it4.next();
            List list = (List) u1.g.S(arrayList2);
            if (D1.i.a((list == null || (c0141f = (C0141f) u1.g.R(list)) == null || (wVar = c0141f.f2920b) == null) ? null : wVar.f2988a, c0141f3.f2920b.f2988a)) {
                list.add(c0141f3);
            } else {
                arrayList2.add(new ArrayList(new u1.d(new C0141f[]{c0141f3}, true)));
            }
        }
        D1.l lVar = new D1.l();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            List list2 = (List) it5.next();
            N b2 = this.f3022u.b(((C0141f) u1.g.M(list2)).f2920b.f2988a);
            this.f3024w = new C0147l(lVar, arrayList, new D1.m(), this, bundle);
            b2.d(list2, c0134c);
            this.f3024w = null;
        }
        return lVar.f167a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01db  */
    /* JADX WARN: Type inference failed for: r12v6, types: [f0.w, f0.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [f0.w, f0.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v0, types: [f0.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [f0.w, f0.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r4v7, types: [f0.w, f0.y] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v20, types: [f0.w, f0.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(y yVar, Bundle bundle) {
        Activity activity;
        Intent intent;
        int[] intArray;
        ArrayList parcelableArrayList;
        Bundle bundle2;
        y j;
        u h2;
        Bundle a2;
        int length;
        int i;
        ?? r7;
        String str;
        w g2;
        Context context;
        Bundle[] bundleArr;
        boolean z2;
        ?? r12;
        Bundle bundle3;
        w g3;
        ?? r14;
        ArrayList<String> stringArrayList;
        u1.e eVar = this.f3010g;
        if (!eVar.isEmpty() && i() == EnumC0097n.f2038a) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        }
        w wVar = null;
        if (D1.i.a(this.f3007c, yVar)) {
            C0343k c0343k = yVar.f2999k;
            int e = c0343k.e();
            for (int i2 = 0; i2 < e; i2++) {
                w wVar2 = (w) c0343k.f(i2);
                y yVar2 = this.f3007c;
                D1.i.b(yVar2);
                int c2 = yVar2.f2999k.c(i2);
                y yVar3 = this.f3007c;
                D1.i.b(yVar3);
                C0343k c0343k2 = yVar3.f2999k;
                if (c0343k2.f4323a) {
                    AbstractC0341i.a(c0343k2);
                }
                int a3 = AbstractC0346a.a(c0343k2.f4326d, c2, c0343k2.f4324b);
                if (a3 >= 0) {
                    Object[] objArr = c0343k2.f4325c;
                    Object obj = objArr[a3];
                    objArr[a3] = wVar2;
                }
            }
            Iterator it = eVar.iterator();
            while (it.hasNext()) {
                C0141f c0141f = (C0141f) it.next();
                int i3 = w.j;
                w wVar3 = c0141f.f2920b;
                D1.i.e(wVar3, "<this>");
                u1.u uVar = new u1.u(J1.h.g0(J1.h.f0(wVar3, C0137b.f2906k)));
                w wVar4 = this.f3007c;
                D1.i.b(wVar4);
                Iterator it2 = uVar.iterator();
                while (true) {
                    ListIterator listIterator = ((u1.t) it2).f4476a;
                    if (listIterator.hasPrevious()) {
                        w wVar5 = (w) listIterator.previous();
                        if ((!D1.i.a(wVar5, this.f3007c) || !D1.i.a(wVar4, yVar)) && (wVar4 instanceof y)) {
                            ?? r4 = (y) wVar4;
                            wVar4 = r4.g(wVar5.f2994h, r4, null, false);
                            D1.i.b(wVar4);
                        }
                    }
                }
                D1.i.e(wVar4, "<set-?>");
                c0141f.f2920b = wVar4;
            }
            return;
        }
        y yVar4 = this.f3007c;
        LinkedHashMap linkedHashMap = this.f3023v;
        if (yVar4 != null) {
            Iterator it3 = new ArrayList(this.f3013l.keySet()).iterator();
            while (it3.hasNext()) {
                Integer num = (Integer) it3.next();
                D1.i.d(num, "id");
                int intValue = num.intValue();
                Iterator it4 = linkedHashMap.values().iterator();
                while (it4.hasNext()) {
                    ((C0144i) it4.next()).f2936d = true;
                }
                boolean t2 = t(intValue, null, R.j.T(C0137b.e));
                Iterator it5 = linkedHashMap.values().iterator();
                while (it5.hasNext()) {
                    ((C0144i) it5.next()).f2936d = false;
                }
                if (t2) {
                    p(intValue, true, false);
                }
            }
            p(yVar4.f2994h, true, false);
        }
        this.f3007c = yVar;
        Bundle bundle4 = this.f3008d;
        O o2 = this.f3022u;
        if (bundle4 != null && (stringArrayList = bundle4.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it6 = stringArrayList.iterator();
            while (it6.hasNext()) {
                String next = it6.next();
                D1.i.d(next, "name");
                N b2 = o2.b(next);
                Bundle bundle5 = bundle4.getBundle(next);
                if (bundle5 != null) {
                    b2.g(bundle5);
                }
            }
        }
        Parcelable[] parcelableArr = this.e;
        Context context2 = this.f3005a;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                D1.i.c(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                C0142g c0142g = (C0142g) parcelable;
                int i4 = c0142g.f2928b;
                w c3 = c(i4, null);
                if (c3 == null) {
                    int i5 = w.j;
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + R.j.w(context2, i4) + " cannot be found from the current destination " + f());
                }
                C0141f a4 = c0142g.a(context2, c3, i(), this.f3016o);
                N b3 = o2.b(c3.f2988a);
                Object obj2 = linkedHashMap.get(b3);
                if (obj2 == null) {
                    obj2 = new C0144i(this, b3);
                    linkedHashMap.put(b3, obj2);
                }
                eVar.addLast(a4);
                ((C0144i) obj2).a(a4);
                y yVar5 = a4.f2920b.f2989b;
                if (yVar5 != null) {
                    k(a4, e(yVar5.f2994h));
                }
            }
            x();
            this.e = null;
        }
        Collection values = u1.s.G(o2.f2895a).values();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : values) {
            if (!((N) obj3).f2893b) {
                arrayList.add(obj3);
            }
        }
        Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            N n2 = (N) it7.next();
            Object obj4 = linkedHashMap.get(n2);
            if (obj4 == null) {
                obj4 = new C0144i(this, n2);
                linkedHashMap.put(n2, obj4);
            }
            n2.e((C0144i) obj4);
        }
        if (this.f3007c == null || !eVar.isEmpty()) {
            b();
            return;
        }
        if (!this.f3009f && (activity = this.f3006b) != null && (intent = activity.getIntent()) != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                } catch (Exception e2) {
                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e2);
                }
                parcelableArrayList = extras == null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                Bundle bundle6 = new Bundle();
                bundle2 = extras == null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                if (bundle2 != null) {
                    bundle6.putAll(bundle2);
                }
                if ((intArray != null || intArray.length == 0) && (h2 = (j = j(eVar)).h(new M0.h(intent), true, j)) != null) {
                    w wVar6 = h2.f2981a;
                    int[] b4 = wVar6.b(null);
                    a2 = wVar6.a(h2.f2982b);
                    if (a2 != null) {
                        bundle6.putAll(a2);
                    }
                    intArray = b4;
                    parcelableArrayList = null;
                }
                if (intArray != null && intArray.length != 0) {
                    y yVar6 = this.f3007c;
                    length = intArray.length;
                    i = 0;
                    r7 = yVar6;
                    while (true) {
                        if (i < length) {
                            str = null;
                            break;
                        }
                        int i6 = intArray[i];
                        if (i == 0) {
                            y yVar7 = this.f3007c;
                            D1.i.b(yVar7);
                            g3 = yVar7.f2994h == i6 ? this.f3007c : null;
                        } else {
                            D1.i.b(r7);
                            g3 = r7.g(i6, r7, null, false);
                        }
                        if (g3 == null) {
                            int i7 = w.j;
                            str = R.j.w(context2, i6);
                            break;
                        }
                        if (i != intArray.length - 1 && (g3 instanceof y)) {
                            while (true) {
                                r14 = (y) g3;
                                D1.i.b(r14);
                                if (!(r14.g(r14.f3000l, r14, null, false) instanceof y)) {
                                    break;
                                } else {
                                    g3 = r14.g(r14.f3000l, r14, null, false);
                                }
                            }
                            r7 = r14;
                        }
                        i++;
                        r7 = r7;
                    }
                    if (str != null) {
                        bundle6.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                        int length2 = intArray.length;
                        Bundle[] bundleArr2 = new Bundle[length2];
                        for (int i8 = 0; i8 < length2; i8++) {
                            Bundle bundle7 = new Bundle();
                            bundle7.putAll(bundle6);
                            if (parcelableArrayList != null && (bundle3 = (Bundle) parcelableArrayList.get(i8)) != null) {
                                bundle7.putAll(bundle3);
                            }
                            bundleArr2[i8] = bundle7;
                        }
                        int flags = intent.getFlags();
                        int i9 = 268435456 & flags;
                        if (i9 != 0 && (flags & 32768) == 0) {
                            intent.addFlags(32768);
                            D.i iVar = new D.i(context2);
                            ComponentName component = intent.getComponent();
                            if (component == null) {
                                component = intent.resolveActivity(iVar.f123b.getPackageManager());
                            }
                            if (component != null) {
                                iVar.a(component);
                            }
                            iVar.f122a.add(intent);
                            iVar.b();
                            activity.finish();
                            activity.overridePendingTransition(0, 0);
                            return;
                        }
                        if (i9 != 0) {
                            if (!eVar.isEmpty()) {
                                y yVar8 = this.f3007c;
                                D1.i.b(yVar8);
                                p(yVar8.f2994h, true, false);
                            }
                            int i10 = 0;
                            while (i10 < intArray.length) {
                                int i11 = intArray[i10];
                                int i12 = i10 + 1;
                                Bundle bundle8 = bundleArr2[i10];
                                w c4 = c(i11, null);
                                if (c4 == null) {
                                    int i13 = w.j;
                                    throw new IllegalStateException("Deep Linking failed: destination " + R.j.w(context2, i11) + " cannot be found from the current destination " + f());
                                }
                                m(c4, bundle8, R.j.T(new C0148m(c4, 0, this)));
                                i10 = i12;
                            }
                            this.f3009f = true;
                            return;
                        }
                        y yVar9 = this.f3007c;
                        int length3 = intArray.length;
                        int i14 = 0;
                        ?? r3 = yVar9;
                        while (i14 < length3) {
                            int i15 = intArray[i14];
                            Bundle bundle9 = bundleArr2[i14];
                            if (i14 == 0) {
                                g2 = this.f3007c;
                            } else {
                                D1.i.b(r3);
                                g2 = r3.g(i15, r3, wVar, false);
                            }
                            if (g2 == null) {
                                int i16 = w.j;
                                throw new IllegalStateException("Deep Linking failed: destination " + R.j.w(context2, i15) + " cannot be found in graph " + r3);
                            }
                            if (i14 != intArray.length - 1) {
                                ?? r32 = r3;
                                if (g2 instanceof y) {
                                    while (true) {
                                        r12 = (y) g2;
                                        D1.i.b(r12);
                                        if (!(r12.g(r12.f3000l, r12, wVar, false) instanceof y)) {
                                            break;
                                        } else {
                                            g2 = r12.g(r12.f3000l, r12, wVar, false);
                                        }
                                    }
                                    r32 = r12;
                                }
                                context = context2;
                                bundleArr = bundleArr2;
                                z2 = r32;
                            } else {
                                y yVar10 = this.f3007c;
                                D1.i.b(yVar10);
                                context = context2;
                                bundleArr = bundleArr2;
                                m(g2, bundle9, new C0134C(false, false, yVar10.f2994h, true, false, 0, 0, -1, -1));
                                z2 = r3;
                            }
                            i14++;
                            bundleArr2 = bundleArr;
                            context2 = context;
                            wVar = null;
                            r3 = z2;
                        }
                        this.f3009f = true;
                        return;
                    }
                    Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                }
            }
            intArray = null;
            if (extras == null) {
            }
            Bundle bundle62 = new Bundle();
            if (extras == null) {
            }
            if (bundle2 != null) {
            }
            if (intArray != null) {
            }
            w wVar62 = h2.f2981a;
            int[] b42 = wVar62.b(null);
            a2 = wVar62.a(h2.f2982b);
            if (a2 != null) {
            }
            intArray = b42;
            parcelableArrayList = null;
            if (intArray != null) {
                y yVar62 = this.f3007c;
                length = intArray.length;
                i = 0;
                r7 = yVar62;
                while (true) {
                    if (i < length) {
                    }
                    i++;
                    r7 = r7;
                }
                if (str != null) {
                }
            }
        }
        y yVar11 = this.f3007c;
        D1.i.b(yVar11);
        m(yVar11, bundle, null);
    }

    public final void v(C0141f c0141f) {
        D1.i.e(c0141f, "child");
        C0141f c0141f2 = (C0141f) this.j.remove(c0141f);
        if (c0141f2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f3012k;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c0141f2);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            C0144i c0144i = (C0144i) this.f3023v.get(this.f3022u.b(c0141f2.f2920b.f2988a));
            if (c0144i != null) {
                c0144i.b(c0141f2);
            }
            linkedHashMap.remove(c0141f2);
        }
    }

    public final void w() {
        AtomicInteger atomicInteger;
        O1.i iVar;
        Set set;
        ArrayList Z2 = u1.g.Z(this.f3010g);
        if (Z2.isEmpty()) {
            return;
        }
        w wVar = ((C0141f) u1.g.R(Z2)).f2920b;
        ArrayList arrayList = new ArrayList();
        if (wVar instanceof InterfaceC0138c) {
            Iterator it = u1.g.V(Z2).iterator();
            while (it.hasNext()) {
                w wVar2 = ((C0141f) it.next()).f2920b;
                arrayList.add(wVar2);
                if (!(wVar2 instanceof InterfaceC0138c) && !(wVar2 instanceof y)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (C0141f c0141f : u1.g.V(Z2)) {
            EnumC0097n enumC0097n = c0141f.f2926k;
            w wVar3 = c0141f.f2920b;
            EnumC0097n enumC0097n2 = EnumC0097n.e;
            EnumC0097n enumC0097n3 = EnumC0097n.f2041d;
            if (wVar != null && wVar3.f2994h == wVar.f2994h) {
                if (enumC0097n != enumC0097n2) {
                    C0144i c0144i = (C0144i) this.f3023v.get(this.f3022u.b(wVar3.f2988a));
                    if (D1.i.a((c0144i == null || (iVar = c0144i.f2937f) == null || (set = (Set) ((O1.q) iVar.f852a).f()) == null) ? null : Boolean.valueOf(set.contains(c0141f)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f3012k.get(c0141f)) != null && atomicInteger.get() == 0)) {
                        hashMap.put(c0141f, enumC0097n3);
                    } else {
                        hashMap.put(c0141f, enumC0097n2);
                    }
                }
                w wVar4 = (w) u1.g.N(arrayList);
                if (wVar4 != null && wVar4.f2994h == wVar3.f2994h) {
                    if (arrayList.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    arrayList.remove(0);
                }
                wVar = wVar.f2989b;
            } else if (arrayList.isEmpty() || wVar3.f2994h != ((w) u1.g.M(arrayList)).f2994h) {
                c0141f.f(EnumC0097n.f2040c);
            } else {
                if (arrayList.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                w wVar5 = (w) arrayList.remove(0);
                if (enumC0097n == enumC0097n2) {
                    c0141f.f(enumC0097n3);
                } else if (enumC0097n != enumC0097n3) {
                    hashMap.put(c0141f, enumC0097n3);
                }
                y yVar = wVar5.f2989b;
                if (yVar != null && !arrayList.contains(yVar)) {
                    arrayList.add(yVar);
                }
            }
        }
        Iterator it2 = Z2.iterator();
        while (it2.hasNext()) {
            C0141f c0141f2 = (C0141f) it2.next();
            EnumC0097n enumC0097n4 = (EnumC0097n) hashMap.get(c0141f2);
            if (enumC0097n4 != null) {
                c0141f2.f(enumC0097n4);
            } else {
                c0141f2.g();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (g() > 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x() {
        boolean z2 = this.f3021t;
        this.f3020s.b(z2);
    }
}
