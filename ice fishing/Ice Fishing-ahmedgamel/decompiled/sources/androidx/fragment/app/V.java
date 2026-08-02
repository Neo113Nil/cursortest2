package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C0505x;
import androidx.lifecycle.EnumC0496n;
import androidx.lifecycle.EnumC0497o;
import androidx.lifecycle.InterfaceC0501t;
import androidx.lifecycle.InterfaceC0503v;
import com.google.android.gms.internal.ads.C2991bm;
import com.icefishingapp.icefishing.AbstractC4404f;
import com.icefishingapp.icefishing.C5275R;
import f0.C4495a;
import f0.C4497c;
import i0.C4577b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final C2991bm f4905a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.n f4906b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0475s f4907c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4908d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f4909e = -1;

    public V(C2991bm c2991bm, S0.n nVar, AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        this.f4905a = c2991bm;
        this.f4906b = nVar;
        this.f4907c = abstractComponentCallbacksC0475s;
    }

    public final void a() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4907c;
        if (E8) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0475s);
        }
        Bundle bundle = abstractComponentCallbacksC0475s.f5060u;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        abstractComponentCallbacksC0475s.f5039M.K();
        abstractComponentCallbacksC0475s.f5052n = 3;
        abstractComponentCallbacksC0475s.f5048V = false;
        abstractComponentCallbacksC0475s.l();
        if (!abstractComponentCallbacksC0475s.f5048V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0475s + " did not call through to super.onActivityCreated()");
        }
        if (N.E(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0475s);
        }
        if (abstractComponentCallbacksC0475s.f5050X != null) {
            Bundle bundle3 = abstractComponentCallbacksC0475s.f5060u;
            Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0475s.f5062v;
            if (sparseArray != null) {
                abstractComponentCallbacksC0475s.f5050X.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0475s.f5062v = null;
            }
            abstractComponentCallbacksC0475s.f5048V = false;
            abstractComponentCallbacksC0475s.w(bundle4);
            if (!abstractComponentCallbacksC0475s.f5048V) {
                throw new d0("Fragment " + abstractComponentCallbacksC0475s + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0475s.f5050X != null) {
                abstractComponentCallbacksC0475s.f5059t0.a(EnumC0496n.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0475s.f5060u = null;
        O o6 = abstractComponentCallbacksC0475s.f5039M;
        o6.f4842E = false;
        o6.f4843F = false;
        o6.f4848L.f4890f = false;
        o6.t(4);
        this.f4905a.B(abstractComponentCallbacksC0475s, bundle2, false);
    }

    public final void b() {
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s;
        View view;
        View view2;
        int i = -1;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = this.f4907c;
        View view3 = abstractComponentCallbacksC0475s2.f5049W;
        while (true) {
            abstractComponentCallbacksC0475s = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(C5275R.id.fragment_container_view_tag);
            AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s3 = tag instanceof AbstractComponentCallbacksC0475s ? (AbstractComponentCallbacksC0475s) tag : null;
            if (abstractComponentCallbacksC0475s3 != null) {
                abstractComponentCallbacksC0475s = abstractComponentCallbacksC0475s3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s4 = abstractComponentCallbacksC0475s2.f5040N;
        if (abstractComponentCallbacksC0475s != null && !abstractComponentCallbacksC0475s.equals(abstractComponentCallbacksC0475s4)) {
            int i6 = abstractComponentCallbacksC0475s2.f5042P;
            C4497c c4497c = f0.d.f37345a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(abstractComponentCallbacksC0475s2);
            sb.append(" within the view of parent fragment ");
            sb.append(abstractComponentCallbacksC0475s);
            sb.append(" via container with ID ");
            f0.d.b(new C4495a(abstractComponentCallbacksC0475s2, u1.h.e(i6, " without using parent's childFragmentManager", sb)));
            f0.d.a(abstractComponentCallbacksC0475s2).getClass();
        }
        S0.n nVar = this.f4906b;
        nVar.getClass();
        ViewGroup viewGroup = abstractComponentCallbacksC0475s2.f5049W;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) nVar.f2802u;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0475s2);
            int i9 = indexOf - 1;
            while (true) {
                if (i9 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s5 = (AbstractComponentCallbacksC0475s) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0475s5.f5049W == viewGroup && (view = abstractComponentCallbacksC0475s5.f5050X) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s6 = (AbstractComponentCallbacksC0475s) arrayList.get(i9);
                    if (abstractComponentCallbacksC0475s6.f5049W == viewGroup && (view2 = abstractComponentCallbacksC0475s6.f5050X) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i9--;
                }
            }
        }
        abstractComponentCallbacksC0475s2.f5049W.addView(abstractComponentCallbacksC0475s2.f5050X, i);
    }

    public final void c() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4907c;
        if (E8) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0475s);
        }
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = abstractComponentCallbacksC0475s.f5069z;
        V v9 = null;
        S0.n nVar = this.f4906b;
        if (abstractComponentCallbacksC0475s2 != null) {
            V v10 = (V) ((HashMap) nVar.f2803v).get(abstractComponentCallbacksC0475s2.f5066x);
            if (v10 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0475s + " declared target fragment " + abstractComponentCallbacksC0475s.f5069z + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0475s.f5028A = abstractComponentCallbacksC0475s.f5069z.f5066x;
            abstractComponentCallbacksC0475s.f5069z = null;
            v9 = v10;
        } else {
            String str = abstractComponentCallbacksC0475s.f5028A;
            if (str != null && (v9 = (V) ((HashMap) nVar.f2803v).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0475s);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(u1.h.g(sb, abstractComponentCallbacksC0475s.f5028A, " that does not belong to this FragmentManager!"));
            }
        }
        if (v9 != null) {
            v9.k();
        }
        N n9 = abstractComponentCallbacksC0475s.f5037K;
        abstractComponentCallbacksC0475s.f5038L = n9.f4868t;
        abstractComponentCallbacksC0475s.f5040N = n9.f4870v;
        C2991bm c2991bm = this.f4905a;
        c2991bm.H(abstractComponentCallbacksC0475s, false);
        ArrayList arrayList = abstractComponentCallbacksC0475s.f5065w0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0473p) it.next()).a();
        }
        arrayList.clear();
        abstractComponentCallbacksC0475s.f5039M.b(abstractComponentCallbacksC0475s.f5038L, abstractComponentCallbacksC0475s.a(), abstractComponentCallbacksC0475s);
        abstractComponentCallbacksC0475s.f5052n = 0;
        abstractComponentCallbacksC0475s.f5048V = false;
        abstractComponentCallbacksC0475s.n(abstractComponentCallbacksC0475s.f5038L.f5076u);
        if (!abstractComponentCallbacksC0475s.f5048V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0475s + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0475s.f5037K.f4861m.iterator();
        while (it2.hasNext()) {
            ((T) it2.next()).a(abstractComponentCallbacksC0475s);
        }
        O o6 = abstractComponentCallbacksC0475s.f5039M;
        o6.f4842E = false;
        o6.f4843F = false;
        o6.f4848L.f4890f = false;
        o6.t(0);
        c2991bm.C(abstractComponentCallbacksC0475s, false);
    }

    public final int d() {
        Object obj;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4907c;
        if (abstractComponentCallbacksC0475s.f5037K == null) {
            return abstractComponentCallbacksC0475s.f5052n;
        }
        int i = this.f4909e;
        int ordinal = abstractComponentCallbacksC0475s.f5057r0.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0475s.f5033F) {
            if (abstractComponentCallbacksC0475s.f5034G) {
                i = Math.max(this.f4909e, 2);
                View view = abstractComponentCallbacksC0475s.f5050X;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f4909e < 4 ? Math.min(i, abstractComponentCallbacksC0475s.f5052n) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0475s.f5031D) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0475s.f5049W;
        if (viewGroup != null) {
            C0467j f3 = C0467j.f(viewGroup, abstractComponentCallbacksC0475s.f());
            f3.getClass();
            a0 d2 = f3.d(abstractComponentCallbacksC0475s);
            int i6 = d2 != null ? d2.f4947b : 0;
            Iterator it = f3.f4993c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                a0 a0Var = (a0) obj;
                if (kotlin.jvm.internal.h.a(a0Var.f4948c, abstractComponentCallbacksC0475s) && !a0Var.f4951f) {
                    break;
                }
            }
            a0 a0Var2 = (a0) obj;
            r5 = a0Var2 != null ? a0Var2.f4947b : 0;
            int i9 = i6 == 0 ? -1 : c0.f4971a[AbstractC5049e.d(i6)];
            if (i9 != -1 && i9 != 1) {
                r5 = i6;
            }
        }
        if (r5 == 2) {
            i = Math.min(i, 6);
        } else if (r5 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0475s.f5032E) {
            i = abstractComponentCallbacksC0475s.k() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0475s.Y && abstractComponentCallbacksC0475s.f5052n < 5) {
            i = Math.min(i, 4);
        }
        if (N.E(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + abstractComponentCallbacksC0475s);
        }
        return i;
    }

    public final void e() {
        Bundle bundle;
        boolean E8 = N.E(3);
        final AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4907c;
        if (E8) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0475s);
        }
        Bundle bundle2 = abstractComponentCallbacksC0475s.f5060u;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC0475s.f5055p0) {
            abstractComponentCallbacksC0475s.f5052n = 1;
            Bundle bundle4 = abstractComponentCallbacksC0475s.f5060u;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            abstractComponentCallbacksC0475s.f5039M.Q(bundle);
            O o6 = abstractComponentCallbacksC0475s.f5039M;
            o6.f4842E = false;
            o6.f4843F = false;
            o6.f4848L.f4890f = false;
            o6.t(1);
            return;
        }
        C2991bm c2991bm = this.f4905a;
        c2991bm.I(abstractComponentCallbacksC0475s, bundle3, false);
        abstractComponentCallbacksC0475s.f5039M.K();
        abstractComponentCallbacksC0475s.f5052n = 1;
        abstractComponentCallbacksC0475s.f5048V = false;
        abstractComponentCallbacksC0475s.f5058s0.a(new InterfaceC0501t() { // from class: androidx.fragment.app.Fragment$6
            @Override // androidx.lifecycle.InterfaceC0501t
            public final void a(InterfaceC0503v interfaceC0503v, EnumC0496n enumC0496n) {
                View view;
                if (enumC0496n != EnumC0496n.ON_STOP || (view = AbstractComponentCallbacksC0475s.this.f5050X) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        abstractComponentCallbacksC0475s.o(bundle3);
        abstractComponentCallbacksC0475s.f5055p0 = true;
        if (abstractComponentCallbacksC0475s.f5048V) {
            abstractComponentCallbacksC0475s.f5058s0.e(EnumC0496n.ON_CREATE);
            c2991bm.D(abstractComponentCallbacksC0475s, bundle3, false);
        } else {
            throw new d0("Fragment " + abstractComponentCallbacksC0475s + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        int i = 1;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4907c;
        if (abstractComponentCallbacksC0475s.f5033F) {
            return;
        }
        if (N.E(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0475s);
        }
        Bundle bundle = abstractComponentCallbacksC0475s.f5060u;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater s9 = abstractComponentCallbacksC0475s.s(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC0475s.f5049W;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i6 = abstractComponentCallbacksC0475s.f5042P;
            if (i6 != 0) {
                if (i6 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0475s + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0475s.f5037K.f4869u.o(i6);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0475s.f5035H) {
                        try {
                            str = abstractComponentCallbacksC0475s.y().getResources().getResourceName(abstractComponentCallbacksC0475s.f5042P);
                        } catch (Resources.NotFoundException unused) {
                            str = com.anythink.core.common.v.m.f16809e;
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0475s.f5042P) + " (" + str + ") for fragment " + abstractComponentCallbacksC0475s);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C4497c c4497c = f0.d.f37345a;
                    f0.d.b(new f0.e(abstractComponentCallbacksC0475s, viewGroup, 1));
                    f0.d.a(abstractComponentCallbacksC0475s).getClass();
                }
            }
        }
        abstractComponentCallbacksC0475s.f5049W = viewGroup;
        abstractComponentCallbacksC0475s.x(s9, viewGroup, bundle2);
        if (abstractComponentCallbacksC0475s.f5050X != null) {
            if (N.E(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC0475s);
            }
            abstractComponentCallbacksC0475s.f5050X.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0475s.f5050X.setTag(C5275R.id.fragment_container_view_tag, abstractComponentCallbacksC0475s);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0475s.f5044R) {
                abstractComponentCallbacksC0475s.f5050X.setVisibility(8);
            }
            View view = abstractComponentCallbacksC0475s.f5050X;
            WeakHashMap weakHashMap = O.X.f2054a;
            if (view.isAttachedToWindow()) {
                O.J.c(abstractComponentCallbacksC0475s.f5050X);
            } else {
                View view2 = abstractComponentCallbacksC0475s.f5050X;
                view2.addOnAttachStateChangeListener(new H3.p(i, view2));
            }
            Bundle bundle3 = abstractComponentCallbacksC0475s.f5060u;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC0475s.f5039M.t(2);
            this.f4905a.N(abstractComponentCallbacksC0475s, abstractComponentCallbacksC0475s.f5050X, bundle2, false);
            int visibility = abstractComponentCallbacksC0475s.f5050X.getVisibility();
            abstractComponentCallbacksC0475s.b().f5025j = abstractComponentCallbacksC0475s.f5050X.getAlpha();
            if (abstractComponentCallbacksC0475s.f5049W != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0475s.f5050X.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0475s.b().f5026k = findFocus;
                    if (N.E(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0475s);
                    }
                }
                abstractComponentCallbacksC0475s.f5050X.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0475s.f5052n = 2;
    }

    public final void g() {
        AbstractComponentCallbacksC0475s h9;
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4907c;
        if (E8) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0475s);
        }
        boolean z3 = true;
        boolean z6 = abstractComponentCallbacksC0475s.f5032E && !abstractComponentCallbacksC0475s.k();
        S0.n nVar = this.f4906b;
        if (z6) {
            nVar.r(abstractComponentCallbacksC0475s.f5066x, null);
        }
        if (!z6) {
            S s9 = (S) nVar.f2805x;
            if (!((s9.f4885a.containsKey(abstractComponentCallbacksC0475s.f5066x) && s9.f4888d) ? s9.f4889e : true)) {
                String str = abstractComponentCallbacksC0475s.f5028A;
                if (str != null && (h9 = nVar.h(str)) != null && h9.f5046T) {
                    abstractComponentCallbacksC0475s.f5069z = h9;
                }
                abstractComponentCallbacksC0475s.f5052n = 0;
                return;
            }
        }
        C0479w c0479w = abstractComponentCallbacksC0475s.f5038L;
        if (c0479w != null) {
            z3 = ((S) nVar.f2805x).f4889e;
        } else {
            AbstractActivityC0480x abstractActivityC0480x = c0479w.f5076u;
            if (abstractActivityC0480x != null) {
                z3 = true ^ abstractActivityC0480x.isChangingConfigurations();
            }
        }
        if (z6 || z3) {
            ((S) nVar.f2805x).b(abstractComponentCallbacksC0475s);
        }
        abstractComponentCallbacksC0475s.f5039M.k();
        abstractComponentCallbacksC0475s.f5058s0.e(EnumC0496n.ON_DESTROY);
        abstractComponentCallbacksC0475s.f5052n = 0;
        abstractComponentCallbacksC0475s.f5048V = false;
        abstractComponentCallbacksC0475s.f5055p0 = false;
        abstractComponentCallbacksC0475s.f5048V = true;
        if (!abstractComponentCallbacksC0475s.f5048V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0475s + " did not call through to super.onDestroy()");
        }
        this.f4905a.E(abstractComponentCallbacksC0475s, false);
        Iterator it = nVar.j().iterator();
        while (it.hasNext()) {
            V v9 = (V) it.next();
            if (v9 != null) {
                String str2 = abstractComponentCallbacksC0475s.f5066x;
                AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = v9.f4907c;
                if (str2.equals(abstractComponentCallbacksC0475s2.f5028A)) {
                    abstractComponentCallbacksC0475s2.f5069z = abstractComponentCallbacksC0475s;
                    abstractComponentCallbacksC0475s2.f5028A = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0475s.f5028A;
        if (str3 != null) {
            abstractComponentCallbacksC0475s.f5069z = nVar.h(str3);
        }
        nVar.n(this);
    }

    public final void h() {
        View view;
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4907c;
        if (E8) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0475s);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0475s.f5049W;
        if (viewGroup != null && (view = abstractComponentCallbacksC0475s.f5050X) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0475s.f5039M.t(1);
        if (abstractComponentCallbacksC0475s.f5050X != null) {
            X x9 = abstractComponentCallbacksC0475s.f5059t0;
            x9.b();
            if (x9.f4921w.f5178d.compareTo(EnumC0497o.f5166v) >= 0) {
                abstractComponentCallbacksC0475s.f5059t0.a(EnumC0496n.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0475s.f5052n = 1;
        abstractComponentCallbacksC0475s.f5048V = false;
        abstractComponentCallbacksC0475s.q();
        if (!abstractComponentCallbacksC0475s.f5048V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0475s + " did not call through to super.onDestroyView()");
        }
        s.l lVar = ((C4577b) new Z2.e(abstractComponentCallbacksC0475s.getViewModelStore(), C4577b.f38026b).r(C4577b.class)).f38027a;
        if (lVar.f40444v > 0) {
            throw D.y.i(lVar.f40443u[0]);
        }
        abstractComponentCallbacksC0475s.f5036I = false;
        this.f4905a.O(abstractComponentCallbacksC0475s, false);
        abstractComponentCallbacksC0475s.f5049W = null;
        abstractComponentCallbacksC0475s.f5050X = null;
        abstractComponentCallbacksC0475s.f5059t0 = null;
        abstractComponentCallbacksC0475s.f5061u0.e(null);
        abstractComponentCallbacksC0475s.f5034G = false;
    }

    public final void i() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4907c;
        if (E8) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0475s);
        }
        abstractComponentCallbacksC0475s.f5052n = -1;
        abstractComponentCallbacksC0475s.f5048V = false;
        abstractComponentCallbacksC0475s.r();
        if (!abstractComponentCallbacksC0475s.f5048V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0475s + " did not call through to super.onDetach()");
        }
        O o6 = abstractComponentCallbacksC0475s.f5039M;
        if (!o6.f4844G) {
            o6.k();
            abstractComponentCallbacksC0475s.f5039M = new O();
        }
        this.f4905a.F(abstractComponentCallbacksC0475s, false);
        abstractComponentCallbacksC0475s.f5052n = -1;
        abstractComponentCallbacksC0475s.f5038L = null;
        abstractComponentCallbacksC0475s.f5040N = null;
        abstractComponentCallbacksC0475s.f5037K = null;
        if (!abstractComponentCallbacksC0475s.f5032E || abstractComponentCallbacksC0475s.k()) {
            S s9 = (S) this.f4906b.f2805x;
            if (!((s9.f4885a.containsKey(abstractComponentCallbacksC0475s.f5066x) && s9.f4888d) ? s9.f4889e : true)) {
                return;
            }
        }
        if (N.E(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0475s);
        }
        abstractComponentCallbacksC0475s.h();
    }

    public final void j() {
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4907c;
        if (abstractComponentCallbacksC0475s.f5033F && abstractComponentCallbacksC0475s.f5034G && !abstractComponentCallbacksC0475s.f5036I) {
            if (N.E(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0475s);
            }
            Bundle bundle = abstractComponentCallbacksC0475s.f5060u;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC0475s.x(abstractComponentCallbacksC0475s.s(bundle2), null, bundle2);
            View view = abstractComponentCallbacksC0475s.f5050X;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0475s.f5050X.setTag(C5275R.id.fragment_container_view_tag, abstractComponentCallbacksC0475s);
                if (abstractComponentCallbacksC0475s.f5044R) {
                    abstractComponentCallbacksC0475s.f5050X.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC0475s.f5060u;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC0475s.f5039M.t(2);
                this.f4905a.N(abstractComponentCallbacksC0475s, abstractComponentCallbacksC0475s.f5050X, bundle2, false);
                abstractComponentCallbacksC0475s.f5052n = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        S0.n nVar = this.f4906b;
        boolean z3 = this.f4908d;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4907c;
        if (z3) {
            if (N.E(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0475s);
                return;
            }
            return;
        }
        try {
            this.f4908d = true;
            boolean z6 = false;
            while (true) {
                int d2 = d();
                int i = abstractComponentCallbacksC0475s.f5052n;
                int i6 = 3;
                if (d2 == i) {
                    if (!z6 && i == -1 && abstractComponentCallbacksC0475s.f5032E && !abstractComponentCallbacksC0475s.k()) {
                        if (N.E(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0475s);
                        }
                        ((S) nVar.f2805x).b(abstractComponentCallbacksC0475s);
                        nVar.n(this);
                        if (N.E(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0475s);
                        }
                        abstractComponentCallbacksC0475s.h();
                    }
                    if (abstractComponentCallbacksC0475s.f5054o0) {
                        if (abstractComponentCallbacksC0475s.f5050X != null && (viewGroup = abstractComponentCallbacksC0475s.f5049W) != null) {
                            C0467j f3 = C0467j.f(viewGroup, abstractComponentCallbacksC0475s.f());
                            if (abstractComponentCallbacksC0475s.f5044R) {
                                f3.getClass();
                                if (N.E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0475s);
                                }
                                f3.a(3, 1, this);
                            } else {
                                f3.getClass();
                                if (N.E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0475s);
                                }
                                f3.a(2, 1, this);
                            }
                        }
                        N n9 = abstractComponentCallbacksC0475s.f5037K;
                        if (n9 != null && abstractComponentCallbacksC0475s.f5031D && N.F(abstractComponentCallbacksC0475s)) {
                            n9.f4841D = true;
                        }
                        abstractComponentCallbacksC0475s.f5054o0 = false;
                        abstractComponentCallbacksC0475s.f5039M.n();
                    }
                    this.f4908d = false;
                    return;
                }
                if (d2 <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            abstractComponentCallbacksC0475s.f5052n = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0475s.f5034G = false;
                            abstractComponentCallbacksC0475s.f5052n = 2;
                            break;
                        case 3:
                            if (N.E(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0475s);
                            }
                            if (abstractComponentCallbacksC0475s.f5050X != null && abstractComponentCallbacksC0475s.f5062v == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0475s.f5050X != null && (viewGroup2 = abstractComponentCallbacksC0475s.f5049W) != null) {
                                C0467j f9 = C0467j.f(viewGroup2, abstractComponentCallbacksC0475s.f());
                                f9.getClass();
                                if (N.E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0475s);
                                }
                                f9.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0475s.f5052n = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0475s.f5052n = 5;
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
                            if (abstractComponentCallbacksC0475s.f5050X != null && (viewGroup3 = abstractComponentCallbacksC0475s.f5049W) != null) {
                                C0467j f10 = C0467j.f(viewGroup3, abstractComponentCallbacksC0475s.f());
                                int visibility = abstractComponentCallbacksC0475s.f5050X.getVisibility();
                                if (visibility == 0) {
                                    i6 = 2;
                                } else if (visibility == 4) {
                                    i6 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                f10.getClass();
                                AbstractC4404f.l(i6, "finalState");
                                if (N.E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0475s);
                                }
                                f10.a(i6, 2, this);
                            }
                            abstractComponentCallbacksC0475s.f5052n = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0475s.f5052n = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z6 = true;
            }
        } catch (Throwable th) {
            this.f4908d = false;
            throw th;
        }
    }

    public final void l() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4907c;
        if (E8) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0475s);
        }
        abstractComponentCallbacksC0475s.f5039M.t(5);
        if (abstractComponentCallbacksC0475s.f5050X != null) {
            abstractComponentCallbacksC0475s.f5059t0.a(EnumC0496n.ON_PAUSE);
        }
        abstractComponentCallbacksC0475s.f5058s0.e(EnumC0496n.ON_PAUSE);
        abstractComponentCallbacksC0475s.f5052n = 6;
        abstractComponentCallbacksC0475s.f5048V = true;
        this.f4905a.G(abstractComponentCallbacksC0475s, false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4907c;
        Bundle bundle = abstractComponentCallbacksC0475s.f5060u;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC0475s.f5060u.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC0475s.f5060u.putBundle("savedInstanceState", new Bundle());
        }
        abstractComponentCallbacksC0475s.f5062v = abstractComponentCallbacksC0475s.f5060u.getSparseParcelableArray("viewState");
        abstractComponentCallbacksC0475s.f5064w = abstractComponentCallbacksC0475s.f5060u.getBundle("viewRegistryState");
        U u3 = (U) abstractComponentCallbacksC0475s.f5060u.getParcelable(com.anythink.core.express.b.a.f17526b);
        if (u3 != null) {
            abstractComponentCallbacksC0475s.f5028A = u3.f4895E;
            abstractComponentCallbacksC0475s.f5029B = u3.f4896F;
            abstractComponentCallbacksC0475s.f5051Z = u3.f4897G;
        }
        if (abstractComponentCallbacksC0475s.f5051Z) {
            return;
        }
        abstractComponentCallbacksC0475s.Y = true;
    }

    public final void n() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4907c;
        if (E8) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0475s);
        }
        r rVar = abstractComponentCallbacksC0475s.f5053n0;
        View view = rVar == null ? null : rVar.f5026k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0475s.f5050X) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0475s.f5050X) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (N.E(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(abstractComponentCallbacksC0475s);
                sb.append(" resulting in focused view ");
                sb.append(abstractComponentCallbacksC0475s.f5050X.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0475s.b().f5026k = null;
        abstractComponentCallbacksC0475s.f5039M.K();
        abstractComponentCallbacksC0475s.f5039M.x(true);
        abstractComponentCallbacksC0475s.f5052n = 7;
        abstractComponentCallbacksC0475s.f5048V = false;
        abstractComponentCallbacksC0475s.f5048V = true;
        if (!abstractComponentCallbacksC0475s.f5048V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0475s + " did not call through to super.onResume()");
        }
        C0505x c0505x = abstractComponentCallbacksC0475s.f5058s0;
        EnumC0496n enumC0496n = EnumC0496n.ON_RESUME;
        c0505x.e(enumC0496n);
        if (abstractComponentCallbacksC0475s.f5050X != null) {
            abstractComponentCallbacksC0475s.f5059t0.f4921w.e(enumC0496n);
        }
        O o6 = abstractComponentCallbacksC0475s.f5039M;
        o6.f4842E = false;
        o6.f4843F = false;
        o6.f4848L.f4890f = false;
        o6.t(7);
        this.f4905a.J(abstractComponentCallbacksC0475s, false);
        this.f4906b.r(abstractComponentCallbacksC0475s.f5066x, null);
        abstractComponentCallbacksC0475s.f5060u = null;
        abstractComponentCallbacksC0475s.f5062v = null;
        abstractComponentCallbacksC0475s.f5064w = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4907c;
        if (abstractComponentCallbacksC0475s.f5050X == null) {
            return;
        }
        if (N.E(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0475s + " with view " + abstractComponentCallbacksC0475s.f5050X);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0475s.f5050X.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0475s.f5062v = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0475s.f5059t0.f4922x.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0475s.f5064w = bundle;
    }

    public final void p() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4907c;
        if (E8) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0475s);
        }
        abstractComponentCallbacksC0475s.f5039M.K();
        abstractComponentCallbacksC0475s.f5039M.x(true);
        abstractComponentCallbacksC0475s.f5052n = 5;
        abstractComponentCallbacksC0475s.f5048V = false;
        abstractComponentCallbacksC0475s.u();
        if (!abstractComponentCallbacksC0475s.f5048V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0475s + " did not call through to super.onStart()");
        }
        C0505x c0505x = abstractComponentCallbacksC0475s.f5058s0;
        EnumC0496n enumC0496n = EnumC0496n.ON_START;
        c0505x.e(enumC0496n);
        if (abstractComponentCallbacksC0475s.f5050X != null) {
            abstractComponentCallbacksC0475s.f5059t0.f4921w.e(enumC0496n);
        }
        O o6 = abstractComponentCallbacksC0475s.f5039M;
        o6.f4842E = false;
        o6.f4843F = false;
        o6.f4848L.f4890f = false;
        o6.t(5);
        this.f4905a.L(abstractComponentCallbacksC0475s, false);
    }

    public final void q() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4907c;
        if (E8) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0475s);
        }
        O o6 = abstractComponentCallbacksC0475s.f5039M;
        o6.f4843F = true;
        o6.f4848L.f4890f = true;
        o6.t(4);
        if (abstractComponentCallbacksC0475s.f5050X != null) {
            abstractComponentCallbacksC0475s.f5059t0.a(EnumC0496n.ON_STOP);
        }
        abstractComponentCallbacksC0475s.f5058s0.e(EnumC0496n.ON_STOP);
        abstractComponentCallbacksC0475s.f5052n = 4;
        abstractComponentCallbacksC0475s.f5048V = false;
        abstractComponentCallbacksC0475s.v();
        if (abstractComponentCallbacksC0475s.f5048V) {
            this.f4905a.M(abstractComponentCallbacksC0475s, false);
            return;
        }
        throw new d0("Fragment " + abstractComponentCallbacksC0475s + " did not call through to super.onStop()");
    }

    public V(C2991bm c2991bm, S0.n nVar, ClassLoader classLoader, G g4, Bundle bundle) {
        this.f4905a = c2991bm;
        this.f4906b = nVar;
        U u3 = (U) bundle.getParcelable(com.anythink.core.express.b.a.f17526b);
        AbstractComponentCallbacksC0475s a9 = g4.a(u3.f4898n);
        a9.f5066x = u3.f4899u;
        a9.f5033F = u3.f4900v;
        a9.f5035H = true;
        a9.f5041O = u3.f4901w;
        a9.f5042P = u3.f4902x;
        a9.f5043Q = u3.f4903y;
        a9.f5046T = u3.f4904z;
        a9.f5032E = u3.f4891A;
        a9.f5045S = u3.f4892B;
        a9.f5044R = u3.f4893C;
        a9.f5057r0 = EnumC0497o.values()[u3.f4894D];
        a9.f5028A = u3.f4895E;
        a9.f5029B = u3.f4896F;
        a9.f5051Z = u3.f4897G;
        this.f4907c = a9;
        a9.f5060u = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a9.B(bundle2);
        if (N.E(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a9);
        }
    }

    public V(C2991bm c2991bm, S0.n nVar, AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, Bundle bundle) {
        this.f4905a = c2991bm;
        this.f4906b = nVar;
        this.f4907c = abstractComponentCallbacksC0475s;
        abstractComponentCallbacksC0475s.f5062v = null;
        abstractComponentCallbacksC0475s.f5064w = null;
        abstractComponentCallbacksC0475s.J = 0;
        abstractComponentCallbacksC0475s.f5034G = false;
        abstractComponentCallbacksC0475s.f5031D = false;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = abstractComponentCallbacksC0475s.f5069z;
        abstractComponentCallbacksC0475s.f5028A = abstractComponentCallbacksC0475s2 != null ? abstractComponentCallbacksC0475s2.f5066x : null;
        abstractComponentCallbacksC0475s.f5069z = null;
        abstractComponentCallbacksC0475s.f5060u = bundle;
        abstractComponentCallbacksC0475s.f5068y = bundle.getBundle("arguments");
    }
}
