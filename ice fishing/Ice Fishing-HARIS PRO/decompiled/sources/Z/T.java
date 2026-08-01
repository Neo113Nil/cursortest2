package Z;

import O.AbstractC0049z;
import a0.AbstractC0082d;
import a0.C0079a;
import a0.C0081c;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.C0103u;
import androidx.lifecycle.EnumC0096m;
import androidx.lifecycle.EnumC0097n;
import androidx.recyclerview.widget.RecyclerView;
import c0.C0120a;
import com.lumenpath.harispro.hrnavigator.R;
import e0.C0128a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import l0.C0230a;
import r.C0343k;
import u.AbstractC0357e;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final F.i f1483a;

    /* renamed from: b, reason: collision with root package name */
    public final B.k f1484b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0070s f1485c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1486d = false;
    public int e = -1;

    public T(F.i iVar, B.k kVar, AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        this.f1483a = iVar;
        this.f1484b = kVar;
        this.f1485c = abstractComponentCallbacksC0070s;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1485c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0070s);
        }
        Bundle bundle = abstractComponentCallbacksC0070s.f1600b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC0070s.f1616u.M();
        abstractComponentCallbacksC0070s.f1599a = 3;
        abstractComponentCallbacksC0070s.f1582D = false;
        abstractComponentCallbacksC0070s.q();
        if (!abstractComponentCallbacksC0070s.f1582D) {
            throw new a0("Fragment " + abstractComponentCallbacksC0070s + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0070s);
        }
        if (abstractComponentCallbacksC0070s.f1584F != null) {
            Bundle bundle2 = abstractComponentCallbacksC0070s.f1600b;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0070s.f1601c;
            if (sparseArray != null) {
                abstractComponentCallbacksC0070s.f1584F.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0070s.f1601c = null;
            }
            abstractComponentCallbacksC0070s.f1582D = false;
            abstractComponentCallbacksC0070s.D(bundle3);
            if (!abstractComponentCallbacksC0070s.f1582D) {
                throw new a0("Fragment " + abstractComponentCallbacksC0070s + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0070s.f1584F != null) {
                abstractComponentCallbacksC0070s.f1593P.e(EnumC0096m.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0070s.f1600b = null;
        M m2 = abstractComponentCallbacksC0070s.f1616u;
        m2.f1427F = false;
        m2.f1428G = false;
        m2.f1433M.f1471g = false;
        m2.t(4);
        this.f1483a.e(false);
    }

    public final void b() {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s;
        View view;
        View view2;
        int i = -1;
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s2 = this.f1485c;
        View view3 = abstractComponentCallbacksC0070s2.f1583E;
        while (true) {
            abstractComponentCallbacksC0070s = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s3 = tag instanceof AbstractComponentCallbacksC0070s ? (AbstractComponentCallbacksC0070s) tag : null;
            if (abstractComponentCallbacksC0070s3 != null) {
                abstractComponentCallbacksC0070s = abstractComponentCallbacksC0070s3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s4 = abstractComponentCallbacksC0070s2.f1617v;
        if (abstractComponentCallbacksC0070s != null && !abstractComponentCallbacksC0070s.equals(abstractComponentCallbacksC0070s4)) {
            int i2 = abstractComponentCallbacksC0070s2.f1619x;
            C0081c c0081c = AbstractC0082d.f1667a;
            AbstractC0082d.b(new C0079a(abstractComponentCallbacksC0070s2, "Attempting to nest fragment " + abstractComponentCallbacksC0070s2 + " within the view of parent fragment " + abstractComponentCallbacksC0070s + " via container with ID " + i2 + " without using parent's childFragmentManager"));
            AbstractC0082d.a(abstractComponentCallbacksC0070s2).getClass();
        }
        B.k kVar = this.f1484b;
        kVar.getClass();
        ViewGroup viewGroup = abstractComponentCallbacksC0070s2.f1583E;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) kVar.f30c;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0070s2);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s5 = (AbstractComponentCallbacksC0070s) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0070s5.f1583E == viewGroup && (view = abstractComponentCallbacksC0070s5.f1584F) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s6 = (AbstractComponentCallbacksC0070s) arrayList.get(i3);
                    if (abstractComponentCallbacksC0070s6.f1583E == viewGroup && (view2 = abstractComponentCallbacksC0070s6.f1584F) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        abstractComponentCallbacksC0070s2.f1583E.addView(abstractComponentCallbacksC0070s2.f1584F, i);
    }

    public final void c() {
        T t2;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1485c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0070s);
        }
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s2 = abstractComponentCallbacksC0070s.f1604g;
        B.k kVar = this.f1484b;
        if (abstractComponentCallbacksC0070s2 != null) {
            t2 = (T) ((HashMap) kVar.f28a).get(abstractComponentCallbacksC0070s2.e);
            if (t2 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0070s + " declared target fragment " + abstractComponentCallbacksC0070s.f1604g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0070s.f1605h = abstractComponentCallbacksC0070s.f1604g.e;
            abstractComponentCallbacksC0070s.f1604g = null;
        } else {
            String str = abstractComponentCallbacksC0070s.f1605h;
            if (str != null) {
                t2 = (T) ((HashMap) kVar.f28a).get(str);
                if (t2 == null) {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(abstractComponentCallbacksC0070s);
                    sb.append(" declared target fragment ");
                    throw new IllegalStateException(D1.h.h(sb, abstractComponentCallbacksC0070s.f1605h, " that does not belong to this FragmentManager!"));
                }
            } else {
                t2 = null;
            }
        }
        if (t2 != null) {
            t2.k();
        }
        M m2 = abstractComponentCallbacksC0070s.f1614s;
        abstractComponentCallbacksC0070s.f1615t = m2.f1452u;
        abstractComponentCallbacksC0070s.f1617v = m2.f1454w;
        F.i iVar = this.f1483a;
        iVar.k(false);
        ArrayList arrayList = abstractComponentCallbacksC0070s.f1597T;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s3 = ((C0068p) it.next()).f1568a;
            abstractComponentCallbacksC0070s3.f1595R.a();
            androidx.lifecycle.L.d(abstractComponentCallbacksC0070s3);
            Bundle bundle = abstractComponentCallbacksC0070s3.f1600b;
            abstractComponentCallbacksC0070s3.f1595R.b(bundle != null ? bundle.getBundle("registryState") : null);
        }
        arrayList.clear();
        abstractComponentCallbacksC0070s.f1616u.b(abstractComponentCallbacksC0070s.f1615t, abstractComponentCallbacksC0070s.e(), abstractComponentCallbacksC0070s);
        abstractComponentCallbacksC0070s.f1599a = 0;
        abstractComponentCallbacksC0070s.f1582D = false;
        abstractComponentCallbacksC0070s.s(abstractComponentCallbacksC0070s.f1615t.f1629b);
        if (!abstractComponentCallbacksC0070s.f1582D) {
            throw new a0("Fragment " + abstractComponentCallbacksC0070s + " did not call through to super.onAttach()");
        }
        M m3 = abstractComponentCallbacksC0070s.f1614s;
        Iterator it2 = m3.f1445n.iterator();
        while (it2.hasNext()) {
            ((Q) it2.next()).a(m3, abstractComponentCallbacksC0070s);
        }
        M m4 = abstractComponentCallbacksC0070s.f1616u;
        m4.f1427F = false;
        m4.f1428G = false;
        m4.f1433M.f1471g = false;
        m4.t(0);
        iVar.f(false);
    }

    public final int d() {
        Object obj;
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1485c;
        if (abstractComponentCallbacksC0070s.f1614s == null) {
            return abstractComponentCallbacksC0070s.f1599a;
        }
        int i = this.e;
        int ordinal = abstractComponentCallbacksC0070s.f1591N.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0070s.f1609n) {
            if (abstractComponentCallbacksC0070s.f1610o) {
                i = Math.max(this.e, 2);
                View view = abstractComponentCallbacksC0070s.f1584F;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.e < 4 ? Math.min(i, abstractComponentCallbacksC0070s.f1599a) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0070s.f1606k) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0070s.f1583E;
        if (viewGroup != null) {
            C0063k g2 = C0063k.g(viewGroup, abstractComponentCallbacksC0070s.j());
            g2.getClass();
            Y e = g2.e(abstractComponentCallbacksC0070s);
            int i2 = e != null ? e.f1504b : 0;
            Iterator it = g2.f1561c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Y y2 = (Y) obj;
                if (D1.i.a(y2.f1505c, abstractComponentCallbacksC0070s) && !y2.f1507f) {
                    break;
                }
            }
            Y y3 = (Y) obj;
            r5 = y3 != null ? y3.f1504b : 0;
            int i3 = i2 == 0 ? -1 : Z.f1510a[AbstractC0357e.a(i2)];
            if (i3 != -1 && i3 != 1) {
                r5 = i2;
            }
        }
        if (r5 == 2) {
            i = Math.min(i, 6);
        } else if (r5 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0070s.f1607l) {
            i = abstractComponentCallbacksC0070s.p() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0070s.f1585G && abstractComponentCallbacksC0070s.f1599a < 5) {
            i = Math.min(i, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + abstractComponentCallbacksC0070s);
        }
        return i;
    }

    public final void e() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1485c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0070s);
        }
        Bundle bundle = abstractComponentCallbacksC0070s.f1600b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC0070s.f1589L) {
            abstractComponentCallbacksC0070s.f1599a = 1;
            abstractComponentCallbacksC0070s.J();
            return;
        }
        F.i iVar = this.f1483a;
        iVar.l(false);
        abstractComponentCallbacksC0070s.f1616u.M();
        abstractComponentCallbacksC0070s.f1599a = 1;
        abstractComponentCallbacksC0070s.f1582D = false;
        abstractComponentCallbacksC0070s.f1592O.a(new C0230a(1, abstractComponentCallbacksC0070s));
        abstractComponentCallbacksC0070s.t(bundle2);
        abstractComponentCallbacksC0070s.f1589L = true;
        if (abstractComponentCallbacksC0070s.f1582D) {
            abstractComponentCallbacksC0070s.f1592O.d(EnumC0096m.ON_CREATE);
            iVar.g(false);
        } else {
            throw new a0("Fragment " + abstractComponentCallbacksC0070s + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1485c;
        if (abstractComponentCallbacksC0070s.f1609n) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0070s);
        }
        Bundle bundle = abstractComponentCallbacksC0070s.f1600b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater x2 = abstractComponentCallbacksC0070s.x(bundle2);
        abstractComponentCallbacksC0070s.f1588K = x2;
        ViewGroup viewGroup2 = abstractComponentCallbacksC0070s.f1583E;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = abstractComponentCallbacksC0070s.f1619x;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0070s + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0070s.f1614s.f1453v.X(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0070s.f1611p) {
                        try {
                            str = abstractComponentCallbacksC0070s.H().getResources().getResourceName(abstractComponentCallbacksC0070s.f1619x);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0070s.f1619x) + " (" + str + ") for fragment " + abstractComponentCallbacksC0070s);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C0081c c0081c = AbstractC0082d.f1667a;
                    AbstractC0082d.b(new C0079a(abstractComponentCallbacksC0070s, "Attempting to add fragment " + abstractComponentCallbacksC0070s + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    AbstractC0082d.a(abstractComponentCallbacksC0070s).getClass();
                }
            }
        }
        abstractComponentCallbacksC0070s.f1583E = viewGroup;
        abstractComponentCallbacksC0070s.E(x2, viewGroup, bundle2);
        if (abstractComponentCallbacksC0070s.f1584F != null) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC0070s);
            }
            abstractComponentCallbacksC0070s.f1584F.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0070s.f1584F.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0070s);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0070s.f1621z) {
                abstractComponentCallbacksC0070s.f1584F.setVisibility(8);
            }
            View view = abstractComponentCallbacksC0070s.f1584F;
            WeakHashMap weakHashMap = O.K.f747a;
            if (view.isAttachedToWindow()) {
                AbstractC0049z.c(abstractComponentCallbacksC0070s.f1584F);
            } else {
                View view2 = abstractComponentCallbacksC0070s.f1584F;
                view2.addOnAttachStateChangeListener(new V0.n(1, view2));
            }
            Bundle bundle3 = abstractComponentCallbacksC0070s.f1600b;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC0070s.C(abstractComponentCallbacksC0070s.f1584F);
            abstractComponentCallbacksC0070s.f1616u.t(2);
            this.f1483a.q(false);
            int visibility = abstractComponentCallbacksC0070s.f1584F.getVisibility();
            abstractComponentCallbacksC0070s.f().j = abstractComponentCallbacksC0070s.f1584F.getAlpha();
            if (abstractComponentCallbacksC0070s.f1583E != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0070s.f1584F.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0070s.f().f1577k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0070s);
                    }
                }
                abstractComponentCallbacksC0070s.f1584F.setAlpha(RecyclerView.f2111C0);
            }
        }
        abstractComponentCallbacksC0070s.f1599a = 2;
    }

    public final void g() {
        boolean z2;
        AbstractComponentCallbacksC0070s d2;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1485c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0070s);
        }
        boolean z3 = abstractComponentCallbacksC0070s.f1607l && !abstractComponentCallbacksC0070s.p();
        B.k kVar = this.f1484b;
        if (z3 && !abstractComponentCallbacksC0070s.f1608m) {
            kVar.o(null, abstractComponentCallbacksC0070s.e);
        }
        if (!z3) {
            P p2 = (P) kVar.f31d;
            if (!((p2.f1467b.containsKey(abstractComponentCallbacksC0070s.e) && p2.e) ? p2.f1470f : true)) {
                String str = abstractComponentCallbacksC0070s.f1605h;
                if (str != null && (d2 = kVar.d(str)) != null && d2.f1580B) {
                    abstractComponentCallbacksC0070s.f1604g = d2;
                }
                abstractComponentCallbacksC0070s.f1599a = 0;
                return;
            }
        }
        C0074w c0074w = abstractComponentCallbacksC0070s.f1615t;
        if (c0074w != null) {
            z2 = ((P) kVar.f31d).f1470f;
        } else {
            z2 = c0074w.f1629b != null ? !r6.isChangingConfigurations() : true;
        }
        if ((z3 && !abstractComponentCallbacksC0070s.f1608m) || z2) {
            ((P) kVar.f31d).c(abstractComponentCallbacksC0070s, false);
        }
        abstractComponentCallbacksC0070s.f1616u.k();
        abstractComponentCallbacksC0070s.f1592O.d(EnumC0096m.ON_DESTROY);
        abstractComponentCallbacksC0070s.f1599a = 0;
        abstractComponentCallbacksC0070s.f1589L = false;
        abstractComponentCallbacksC0070s.f1582D = true;
        this.f1483a.h(false);
        Iterator it = kVar.h().iterator();
        while (it.hasNext()) {
            T t2 = (T) it.next();
            if (t2 != null) {
                String str2 = abstractComponentCallbacksC0070s.e;
                AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s2 = t2.f1485c;
                if (str2.equals(abstractComponentCallbacksC0070s2.f1605h)) {
                    abstractComponentCallbacksC0070s2.f1604g = abstractComponentCallbacksC0070s;
                    abstractComponentCallbacksC0070s2.f1605h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0070s.f1605h;
        if (str3 != null) {
            abstractComponentCallbacksC0070s.f1604g = kVar.d(str3);
        }
        kVar.l(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1485c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0070s);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0070s.f1583E;
        if (viewGroup != null && (view = abstractComponentCallbacksC0070s.f1584F) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0070s.f1616u.t(1);
        if (abstractComponentCallbacksC0070s.f1584F != null) {
            V v2 = abstractComponentCallbacksC0070s.f1593P;
            v2.f();
            if (v2.f1497d.f2048c.compareTo(EnumC0097n.f2040c) >= 0) {
                abstractComponentCallbacksC0070s.f1593P.e(EnumC0096m.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0070s.f1599a = 1;
        abstractComponentCallbacksC0070s.f1582D = false;
        abstractComponentCallbacksC0070s.v();
        if (!abstractComponentCallbacksC0070s.f1582D) {
            throw new a0("Fragment " + abstractComponentCallbacksC0070s + " did not call through to super.onDestroyView()");
        }
        androidx.lifecycle.U c2 = abstractComponentCallbacksC0070s.c();
        O o2 = C0128a.f2836c;
        D1.i.e(c2, "store");
        C0120a c0120a = C0120a.f2339b;
        D1.i.e(c0120a, "defaultCreationExtras");
        M0.h hVar = new M0.h(c2, o2, c0120a);
        D1.e a2 = D1.o.a(C0128a.class);
        String t2 = R.j.t(a2);
        if (t2 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        C0343k c0343k = ((C0128a) hVar.f(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(t2))).f2837b;
        if (c0343k.e() > 0) {
            c0343k.f(0).getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0070s.f1612q = false;
        this.f1483a.r(false);
        abstractComponentCallbacksC0070s.f1583E = null;
        abstractComponentCallbacksC0070s.f1584F = null;
        abstractComponentCallbacksC0070s.f1593P = null;
        abstractComponentCallbacksC0070s.f1594Q.d(null);
        abstractComponentCallbacksC0070s.f1610o = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1485c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0070s);
        }
        abstractComponentCallbacksC0070s.f1599a = -1;
        abstractComponentCallbacksC0070s.f1582D = false;
        abstractComponentCallbacksC0070s.w();
        abstractComponentCallbacksC0070s.f1588K = null;
        if (!abstractComponentCallbacksC0070s.f1582D) {
            throw new a0("Fragment " + abstractComponentCallbacksC0070s + " did not call through to super.onDetach()");
        }
        M m2 = abstractComponentCallbacksC0070s.f1616u;
        if (!m2.f1429H) {
            m2.k();
            abstractComponentCallbacksC0070s.f1616u = new M();
        }
        this.f1483a.i(false);
        abstractComponentCallbacksC0070s.f1599a = -1;
        abstractComponentCallbacksC0070s.f1615t = null;
        abstractComponentCallbacksC0070s.f1617v = null;
        abstractComponentCallbacksC0070s.f1614s = null;
        if (!abstractComponentCallbacksC0070s.f1607l || abstractComponentCallbacksC0070s.p()) {
            P p2 = (P) this.f1484b.f31d;
            boolean z2 = true;
            if (p2.f1467b.containsKey(abstractComponentCallbacksC0070s.e) && p2.e) {
                z2 = p2.f1470f;
            }
            if (!z2) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0070s);
        }
        abstractComponentCallbacksC0070s.m();
    }

    public final void j() {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1485c;
        if (abstractComponentCallbacksC0070s.f1609n && abstractComponentCallbacksC0070s.f1610o && !abstractComponentCallbacksC0070s.f1612q) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0070s);
            }
            Bundle bundle = abstractComponentCallbacksC0070s.f1600b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater x2 = abstractComponentCallbacksC0070s.x(bundle2);
            abstractComponentCallbacksC0070s.f1588K = x2;
            abstractComponentCallbacksC0070s.E(x2, null, bundle2);
            View view = abstractComponentCallbacksC0070s.f1584F;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0070s.f1584F.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0070s);
                if (abstractComponentCallbacksC0070s.f1621z) {
                    abstractComponentCallbacksC0070s.f1584F.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC0070s.f1600b;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC0070s.C(abstractComponentCallbacksC0070s.f1584F);
                abstractComponentCallbacksC0070s.f1616u.t(2);
                this.f1483a.q(false);
                abstractComponentCallbacksC0070s.f1599a = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0147, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z2 = this.f1486d;
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1485c;
        if (z2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0070s);
                return;
            }
            return;
        }
        try {
            this.f1486d = true;
            boolean z3 = false;
            while (true) {
                int d2 = d();
                int i = abstractComponentCallbacksC0070s.f1599a;
                int i2 = 3;
                B.k kVar = this.f1484b;
                if (d2 == i) {
                    if (!z3 && i == -1 && abstractComponentCallbacksC0070s.f1607l && !abstractComponentCallbacksC0070s.p() && !abstractComponentCallbacksC0070s.f1608m) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0070s);
                        }
                        ((P) kVar.f31d).c(abstractComponentCallbacksC0070s, true);
                        kVar.l(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0070s);
                        }
                        abstractComponentCallbacksC0070s.m();
                    }
                    if (abstractComponentCallbacksC0070s.J) {
                        if (abstractComponentCallbacksC0070s.f1584F != null && (viewGroup = abstractComponentCallbacksC0070s.f1583E) != null) {
                            C0063k g2 = C0063k.g(viewGroup, abstractComponentCallbacksC0070s.j());
                            if (abstractComponentCallbacksC0070s.f1621z) {
                                g2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0070s);
                                }
                                g2.a(3, 1, this);
                            } else {
                                g2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0070s);
                                }
                                g2.a(2, 1, this);
                            }
                        }
                        M m2 = abstractComponentCallbacksC0070s.f1614s;
                        if (m2 != null && abstractComponentCallbacksC0070s.f1606k && M.G(abstractComponentCallbacksC0070s)) {
                            m2.f1426E = true;
                        }
                        abstractComponentCallbacksC0070s.J = false;
                        abstractComponentCallbacksC0070s.f1616u.n();
                    }
                    this.f1486d = false;
                    return;
                }
                if (d2 <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (abstractComponentCallbacksC0070s.f1608m) {
                                if (((Bundle) ((HashMap) kVar.f29b).get(abstractComponentCallbacksC0070s.e)) == null) {
                                    kVar.o(o(), abstractComponentCallbacksC0070s.e);
                                }
                            }
                            g();
                            break;
                        case 1:
                            h();
                            abstractComponentCallbacksC0070s.f1599a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0070s.f1610o = false;
                            abstractComponentCallbacksC0070s.f1599a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0070s);
                            }
                            if (abstractComponentCallbacksC0070s.f1608m) {
                                kVar.o(o(), abstractComponentCallbacksC0070s.e);
                            } else if (abstractComponentCallbacksC0070s.f1584F != null && abstractComponentCallbacksC0070s.f1601c == null) {
                                p();
                            }
                            if (abstractComponentCallbacksC0070s.f1584F != null && (viewGroup2 = abstractComponentCallbacksC0070s.f1583E) != null) {
                                C0063k g3 = C0063k.g(viewGroup2, abstractComponentCallbacksC0070s.j());
                                g3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0070s);
                                }
                                g3.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0070s.f1599a = 3;
                            break;
                        case 4:
                            r();
                            break;
                        case 5:
                            abstractComponentCallbacksC0070s.f1599a = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0070s.f1584F != null && (viewGroup3 = abstractComponentCallbacksC0070s.f1583E) != null) {
                                C0063k g4 = C0063k.g(viewGroup3, abstractComponentCallbacksC0070s.j());
                                int visibility = abstractComponentCallbacksC0070s.f1584F.getVisibility();
                                if (visibility == 0) {
                                    i2 = 2;
                                } else if (visibility == 4) {
                                    i2 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                g4.b(i2, this);
                            }
                            abstractComponentCallbacksC0070s.f1599a = 4;
                            break;
                        case 5:
                            q();
                            break;
                        case 6:
                            abstractComponentCallbacksC0070s.f1599a = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z3 = true;
            }
        } catch (Throwable th) {
            this.f1486d = false;
            throw th;
        }
    }

    public final void l() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1485c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0070s);
        }
        abstractComponentCallbacksC0070s.f1616u.t(5);
        if (abstractComponentCallbacksC0070s.f1584F != null) {
            abstractComponentCallbacksC0070s.f1593P.e(EnumC0096m.ON_PAUSE);
        }
        abstractComponentCallbacksC0070s.f1592O.d(EnumC0096m.ON_PAUSE);
        abstractComponentCallbacksC0070s.f1599a = 6;
        abstractComponentCallbacksC0070s.f1582D = true;
        this.f1483a.j(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1485c;
        Bundle bundle = abstractComponentCallbacksC0070s.f1600b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC0070s.f1600b.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC0070s.f1600b.putBundle("savedInstanceState", new Bundle());
        }
        abstractComponentCallbacksC0070s.f1601c = abstractComponentCallbacksC0070s.f1600b.getSparseParcelableArray("viewState");
        abstractComponentCallbacksC0070s.f1602d = abstractComponentCallbacksC0070s.f1600b.getBundle("viewRegistryState");
        S s2 = (S) abstractComponentCallbacksC0070s.f1600b.getParcelable("state");
        if (s2 != null) {
            abstractComponentCallbacksC0070s.f1605h = s2.f1480l;
            abstractComponentCallbacksC0070s.i = s2.f1481m;
            abstractComponentCallbacksC0070s.f1586H = s2.f1482n;
        }
        if (abstractComponentCallbacksC0070s.f1586H) {
            return;
        }
        abstractComponentCallbacksC0070s.f1585G = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1485c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0070s);
        }
        r rVar = abstractComponentCallbacksC0070s.f1587I;
        View view = rVar == null ? null : rVar.f1577k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0070s.f1584F) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0070s.f1584F) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(abstractComponentCallbacksC0070s);
                sb.append(" resulting in focused view ");
                sb.append(abstractComponentCallbacksC0070s.f1584F.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0070s.f().f1577k = null;
        abstractComponentCallbacksC0070s.f1616u.M();
        abstractComponentCallbacksC0070s.f1616u.x(true);
        abstractComponentCallbacksC0070s.f1599a = 7;
        abstractComponentCallbacksC0070s.f1582D = true;
        C0103u c0103u = abstractComponentCallbacksC0070s.f1592O;
        EnumC0096m enumC0096m = EnumC0096m.ON_RESUME;
        c0103u.d(enumC0096m);
        if (abstractComponentCallbacksC0070s.f1584F != null) {
            abstractComponentCallbacksC0070s.f1593P.f1497d.d(enumC0096m);
        }
        M m2 = abstractComponentCallbacksC0070s.f1616u;
        m2.f1427F = false;
        m2.f1428G = false;
        m2.f1433M.f1471g = false;
        m2.t(7);
        this.f1483a.m(false);
        this.f1484b.o(null, abstractComponentCallbacksC0070s.e);
        abstractComponentCallbacksC0070s.f1600b = null;
        abstractComponentCallbacksC0070s.f1601c = null;
        abstractComponentCallbacksC0070s.f1602d = null;
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1485c;
        if (abstractComponentCallbacksC0070s.f1599a == -1 && (bundle = abstractComponentCallbacksC0070s.f1600b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new S(abstractComponentCallbacksC0070s));
        if (abstractComponentCallbacksC0070s.f1599a > -1) {
            Bundle bundle3 = new Bundle();
            abstractComponentCallbacksC0070s.z(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f1483a.n(false);
            Bundle bundle4 = new Bundle();
            abstractComponentCallbacksC0070s.f1595R.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle T2 = abstractComponentCallbacksC0070s.f1616u.T();
            if (!T2.isEmpty()) {
                bundle2.putBundle("childFragmentManager", T2);
            }
            if (abstractComponentCallbacksC0070s.f1584F != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC0070s.f1601c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = abstractComponentCallbacksC0070s.f1602d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = abstractComponentCallbacksC0070s.f1603f;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1485c;
        if (abstractComponentCallbacksC0070s.f1584F == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0070s + " with view " + abstractComponentCallbacksC0070s.f1584F);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0070s.f1584F.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0070s.f1601c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0070s.f1593P.e.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0070s.f1602d = bundle;
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1485c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0070s);
        }
        abstractComponentCallbacksC0070s.f1616u.M();
        abstractComponentCallbacksC0070s.f1616u.x(true);
        abstractComponentCallbacksC0070s.f1599a = 5;
        abstractComponentCallbacksC0070s.f1582D = false;
        abstractComponentCallbacksC0070s.A();
        if (!abstractComponentCallbacksC0070s.f1582D) {
            throw new a0("Fragment " + abstractComponentCallbacksC0070s + " did not call through to super.onStart()");
        }
        C0103u c0103u = abstractComponentCallbacksC0070s.f1592O;
        EnumC0096m enumC0096m = EnumC0096m.ON_START;
        c0103u.d(enumC0096m);
        if (abstractComponentCallbacksC0070s.f1584F != null) {
            abstractComponentCallbacksC0070s.f1593P.f1497d.d(enumC0096m);
        }
        M m2 = abstractComponentCallbacksC0070s.f1616u;
        m2.f1427F = false;
        m2.f1428G = false;
        m2.f1433M.f1471g = false;
        m2.t(5);
        this.f1483a.o(false);
    }

    public final void r() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1485c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0070s);
        }
        M m2 = abstractComponentCallbacksC0070s.f1616u;
        m2.f1428G = true;
        m2.f1433M.f1471g = true;
        m2.t(4);
        if (abstractComponentCallbacksC0070s.f1584F != null) {
            abstractComponentCallbacksC0070s.f1593P.e(EnumC0096m.ON_STOP);
        }
        abstractComponentCallbacksC0070s.f1592O.d(EnumC0096m.ON_STOP);
        abstractComponentCallbacksC0070s.f1599a = 4;
        abstractComponentCallbacksC0070s.f1582D = false;
        abstractComponentCallbacksC0070s.B();
        if (abstractComponentCallbacksC0070s.f1582D) {
            this.f1483a.p(false);
            return;
        }
        throw new a0("Fragment " + abstractComponentCallbacksC0070s + " did not call through to super.onStop()");
    }

    public T(F.i iVar, B.k kVar, ClassLoader classLoader, F f2, Bundle bundle) {
        this.f1483a = iVar;
        this.f1484b = kVar;
        AbstractComponentCallbacksC0070s a2 = ((S) bundle.getParcelable("state")).a(f2);
        this.f1485c = a2;
        a2.f1600b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a2.L(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public T(F.i iVar, B.k kVar, AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s, Bundle bundle) {
        this.f1483a = iVar;
        this.f1484b = kVar;
        this.f1485c = abstractComponentCallbacksC0070s;
        abstractComponentCallbacksC0070s.f1601c = null;
        abstractComponentCallbacksC0070s.f1602d = null;
        abstractComponentCallbacksC0070s.f1613r = 0;
        abstractComponentCallbacksC0070s.f1610o = false;
        abstractComponentCallbacksC0070s.f1606k = false;
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s2 = abstractComponentCallbacksC0070s.f1604g;
        abstractComponentCallbacksC0070s.f1605h = abstractComponentCallbacksC0070s2 != null ? abstractComponentCallbacksC0070s2.e : null;
        abstractComponentCallbacksC0070s.f1604g = null;
        abstractComponentCallbacksC0070s.f1600b = bundle;
        abstractComponentCallbacksC0070s.f1603f = bundle.getBundle("arguments");
    }
}
