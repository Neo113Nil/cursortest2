package B;

import Z.AbstractComponentCallbacksC0070s;
import Z.P;
import Z.T;
import a.AbstractC0078a;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import f0.C0137b;
import f0.t;
import f0.w;
import f0.x;
import f0.y;
import f0.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k.AbstractC0177a;
import k.C0181e;
import l.MenuC0213B;
import l.MenuC0229m;
import r.C0338f;
import r.C0340h;
import r.C0342j;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f28a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f29b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30c;

    /* renamed from: d, reason: collision with root package name */
    public Object f31d;

    public k(z zVar) {
        Intent launchIntentForPackage;
        D1.i.e(zVar, "navController");
        Context context = zVar.f3005a;
        this.f28a = context;
        J1.c cVar = new J1.c(new J1.d(0, new J1.l(J1.h.f0(context, C0137b.i), C0137b.j, 1)));
        Activity activity = (Activity) (!cVar.hasNext() ? null : cVar.next());
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f29b = launchIntentForPackage;
        this.f30c = new ArrayList();
        this.f31d = zVar.h();
    }

    public void a(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        if (((ArrayList) this.f30c).contains(abstractComponentCallbacksC0070s)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0070s);
        }
        synchronized (((ArrayList) this.f30c)) {
            ((ArrayList) this.f30c).add(abstractComponentCallbacksC0070s);
        }
        abstractComponentCallbacksC0070s.f1606k = true;
    }

    public D.i b() {
        y yVar = (y) this.f31d;
        if (yVar == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        ArrayList arrayList = (ArrayList) this.f30c;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        w wVar = null;
        while (true) {
            boolean hasNext = it.hasNext();
            Context context = (Context) this.f28a;
            int i = 0;
            if (!hasNext) {
                int[] X2 = u1.g.X(arrayList2);
                Intent intent = (Intent) this.f29b;
                intent.putExtra("android-support-nav:controller:deepLinkIds", X2);
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                D.i iVar = new D.i(context);
                Intent intent2 = new Intent(intent);
                ComponentName component = intent2.getComponent();
                if (component == null) {
                    component = intent2.resolveActivity(iVar.f123b.getPackageManager());
                }
                if (component != null) {
                    iVar.a(component);
                }
                ArrayList arrayList4 = iVar.f122a;
                arrayList4.add(intent2);
                int size = arrayList4.size();
                while (i < size) {
                    Intent intent3 = (Intent) arrayList4.get(i);
                    if (intent3 != null) {
                        intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                    i++;
                }
                return iVar;
            }
            t tVar = (t) it.next();
            int i2 = tVar.f2979a;
            w e = e(i2);
            if (e == null) {
                int i3 = w.j;
                throw new IllegalArgumentException("Navigation destination " + R.j.w(context, i2) + " cannot be found in the navigation graph " + yVar);
            }
            int[] b2 = e.b(wVar);
            int length = b2.length;
            while (i < length) {
                arrayList2.add(Integer.valueOf(b2[i]));
                arrayList3.add(tVar.f2980b);
                i++;
            }
            wVar = e;
        }
    }

    public void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C0342j) this.f29b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                c(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC0070s d(String str) {
        T t2 = (T) ((HashMap) this.f28a).get(str);
        if (t2 != null) {
            return t2.f1485c;
        }
        return null;
    }

    public w e(int i) {
        u1.e eVar = new u1.e();
        y yVar = (y) this.f31d;
        D1.i.b(yVar);
        eVar.addLast(yVar);
        while (!eVar.isEmpty()) {
            w wVar = (w) eVar.removeFirst();
            if (wVar.f2994h == i) {
                return wVar;
            }
            if (wVar instanceof y) {
                x xVar = new x((y) wVar);
                while (xVar.hasNext()) {
                    eVar.addLast((w) xVar.next());
                }
            }
        }
        return null;
    }

    public AbstractComponentCallbacksC0070s f(String str) {
        for (T t2 : ((HashMap) this.f28a).values()) {
            if (t2 != null) {
                AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = t2.f1485c;
                if (!str.equals(abstractComponentCallbacksC0070s.e)) {
                    abstractComponentCallbacksC0070s = abstractComponentCallbacksC0070s.f1616u.f1437c.f(str);
                }
                if (abstractComponentCallbacksC0070s != null) {
                    return abstractComponentCallbacksC0070s;
                }
            }
        }
        return null;
    }

    public C0181e g(AbstractC0177a abstractC0177a) {
        ArrayList arrayList = (ArrayList) this.f30c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0181e c0181e = (C0181e) arrayList.get(i);
            if (c0181e != null && c0181e.f3322b == abstractC0177a) {
                return c0181e;
            }
        }
        C0181e c0181e2 = new C0181e((Context) this.f31d, abstractC0177a);
        arrayList.add(c0181e2);
        return c0181e2;
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (T t2 : ((HashMap) this.f28a).values()) {
            if (t2 != null) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (T t2 : ((HashMap) this.f28a).values()) {
            if (t2 != null) {
                arrayList.add(t2.f1485c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List j() {
        ArrayList arrayList;
        if (((ArrayList) this.f30c).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f30c)) {
            arrayList = new ArrayList((ArrayList) this.f30c);
        }
        return arrayList;
    }

    public void k(T t2) {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = t2.f1485c;
        String str = abstractComponentCallbacksC0070s.e;
        HashMap hashMap = (HashMap) this.f28a;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0070s.e, t2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0070s);
        }
    }

    public void l(T t2) {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = t2.f1485c;
        if (abstractComponentCallbacksC0070s.f1580B) {
            ((P) this.f31d).f(abstractComponentCallbacksC0070s);
        }
        HashMap hashMap = (HashMap) this.f28a;
        if (hashMap.get(abstractComponentCallbacksC0070s.e) == t2 && ((T) hashMap.put(abstractComponentCallbacksC0070s.e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0070s);
        }
    }

    public boolean m(AbstractC0177a abstractC0177a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f28a).onActionItemClicked(g(abstractC0177a), new l.t((Context) this.f31d, (I.a) menuItem));
    }

    public boolean n(AbstractC0177a abstractC0177a, MenuC0229m menuC0229m) {
        C0181e g2 = g(abstractC0177a);
        C0342j c0342j = (C0342j) this.f29b;
        Menu menu = (Menu) c0342j.get(menuC0229m);
        if (menu == null) {
            menu = new MenuC0213B((Context) this.f31d, menuC0229m);
            c0342j.put(menuC0229m, menu);
        }
        return ((ActionMode.Callback) this.f28a).onCreateActionMode(g2, menu);
    }

    public Bundle o(Bundle bundle, String str) {
        HashMap hashMap = (HashMap) this.f29b;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public void p() {
        Iterator it = ((ArrayList) this.f30c).iterator();
        while (it.hasNext()) {
            int i = ((t) it.next()).f2979a;
            if (e(i) == null) {
                int i2 = w.j;
                throw new IllegalArgumentException("Navigation destination " + R.j.w((Context) this.f28a, i) + " cannot be found in the navigation graph " + ((y) this.f31d));
            }
        }
    }

    public k(int i) {
        switch (i) {
            case 2:
                this.f30c = new ArrayList();
                this.f28a = new HashMap();
                this.f29b = new HashMap();
                break;
            case 5:
                this.f28a = new C0338f(0);
                this.f29b = new SparseArray();
                this.f30c = new C0340h();
                this.f31d = new C0338f(0);
                break;
            default:
                this.f28a = new N.b(10);
                this.f29b = new C0342j(0);
                this.f30c = new ArrayList();
                this.f31d = new HashSet();
                break;
        }
    }

    public k(Typeface typeface, W.b bVar) {
        int i;
        int i2;
        this.f31d = typeface;
        this.f28a = bVar;
        this.f30c = new V.t(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f836a;
            i = ((ByteBuffer) bVar.f839d).getInt(((ByteBuffer) bVar.f839d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f29b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i4 = a3 + bVar.f836a;
            i2 = ((ByteBuffer) bVar.f839d).getInt(((ByteBuffer) bVar.f839d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            V.w wVar = new V.w(this, i5);
            W.a c2 = wVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.f839d).getInt(a4 + c2.f836a) : 0, (char[]) this.f29b, i5 * 2);
            AbstractC0078a.e("invalid metadata codepoint length", wVar.b() > 0);
            ((V.t) this.f30c).a(wVar, 0, wVar.b() - 1);
        }
    }

    public k(Context context, ActionMode.Callback callback) {
        this.f31d = context;
        this.f28a = callback;
        this.f30c = new ArrayList();
        this.f29b = new C0342j(0);
    }
}
