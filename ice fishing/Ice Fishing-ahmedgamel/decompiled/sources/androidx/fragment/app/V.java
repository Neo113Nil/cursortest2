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
import androidx.lifecycle.C0509x;
import androidx.lifecycle.EnumC0500n;
import androidx.lifecycle.EnumC0501o;
import androidx.lifecycle.InterfaceC0505t;
import androidx.lifecycle.InterfaceC0507v;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.internal.ads.Wv;
import f0.C4512a;
import f0.C4514c;
import i0.C4582b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import u.AbstractC5050e;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final S0.e f4873a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.q f4874b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0479s f4875c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4876d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f4877e = -1;

    public V(S0.e eVar, l4.q qVar, AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        this.f4873a = eVar;
        this.f4874b = qVar;
        this.f4875c = abstractComponentCallbacksC0479s;
    }

    public final void a() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4875c;
        if (E8) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0479s);
        }
        Bundle bundle = abstractComponentCallbacksC0479s.f5031u;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        abstractComponentCallbacksC0479s.f5007M.K();
        abstractComponentCallbacksC0479s.f5024n = 3;
        abstractComponentCallbacksC0479s.f5016V = false;
        abstractComponentCallbacksC0479s.l();
        if (!abstractComponentCallbacksC0479s.f5016V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0479s + " did not call through to super.onActivityCreated()");
        }
        if (N.E(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0479s);
        }
        if (abstractComponentCallbacksC0479s.f5018X != null) {
            Bundle bundle3 = abstractComponentCallbacksC0479s.f5031u;
            Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0479s.f5032v;
            if (sparseArray != null) {
                abstractComponentCallbacksC0479s.f5018X.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0479s.f5032v = null;
            }
            abstractComponentCallbacksC0479s.f5016V = false;
            abstractComponentCallbacksC0479s.w(bundle4);
            if (!abstractComponentCallbacksC0479s.f5016V) {
                throw new d0("Fragment " + abstractComponentCallbacksC0479s + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0479s.f5018X != null) {
                abstractComponentCallbacksC0479s.f5026o0.a(EnumC0500n.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0479s.f5031u = null;
        O o4 = abstractComponentCallbacksC0479s.f5007M;
        o4.f4810E = false;
        o4.f4811F = false;
        o4.f4816L.f4858f = false;
        o4.t(4);
        this.f4873a.g(abstractComponentCallbacksC0479s, bundle2, false);
    }

    public final void b() {
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s;
        View view;
        View view2;
        int i = -1;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = this.f4875c;
        View view3 = abstractComponentCallbacksC0479s2.f5017W;
        while (true) {
            abstractComponentCallbacksC0479s = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(C5248R.id.fragment_container_view_tag);
            AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s3 = tag instanceof AbstractComponentCallbacksC0479s ? (AbstractComponentCallbacksC0479s) tag : null;
            if (abstractComponentCallbacksC0479s3 != null) {
                abstractComponentCallbacksC0479s = abstractComponentCallbacksC0479s3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s4 = abstractComponentCallbacksC0479s2.f5008N;
        if (abstractComponentCallbacksC0479s != null && !abstractComponentCallbacksC0479s.equals(abstractComponentCallbacksC0479s4)) {
            int i4 = abstractComponentCallbacksC0479s2.f5010P;
            C4514c c4514c = f0.d.f37421a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(abstractComponentCallbacksC0479s2);
            sb.append(" within the view of parent fragment ");
            sb.append(abstractComponentCallbacksC0479s);
            sb.append(" via container with ID ");
            f0.d.b(new C4512a(abstractComponentCallbacksC0479s2, AbstractC5128c.e(i4, " without using parent's childFragmentManager", sb)));
            f0.d.a(abstractComponentCallbacksC0479s2).getClass();
        }
        l4.q qVar = this.f4874b;
        qVar.getClass();
        ViewGroup viewGroup = abstractComponentCallbacksC0479s2.f5017W;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) qVar.f38945n;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0479s2);
            int i6 = indexOf - 1;
            while (true) {
                if (i6 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s5 = (AbstractComponentCallbacksC0479s) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0479s5.f5017W == viewGroup && (view = abstractComponentCallbacksC0479s5.f5018X) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s6 = (AbstractComponentCallbacksC0479s) arrayList.get(i6);
                    if (abstractComponentCallbacksC0479s6.f5017W == viewGroup && (view2 = abstractComponentCallbacksC0479s6.f5018X) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i6--;
                }
            }
        }
        abstractComponentCallbacksC0479s2.f5017W.addView(abstractComponentCallbacksC0479s2.f5018X, i);
    }

    public final void c() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4875c;
        if (E8) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0479s);
        }
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = abstractComponentCallbacksC0479s.f5036z;
        V v9 = null;
        l4.q qVar = this.f4874b;
        if (abstractComponentCallbacksC0479s2 != null) {
            V v10 = (V) ((HashMap) qVar.f38946u).get(abstractComponentCallbacksC0479s2.f5034x);
            if (v10 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0479s + " declared target fragment " + abstractComponentCallbacksC0479s.f5036z + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0479s.f4996A = abstractComponentCallbacksC0479s.f5036z.f5034x;
            abstractComponentCallbacksC0479s.f5036z = null;
            v9 = v10;
        } else {
            String str = abstractComponentCallbacksC0479s.f4996A;
            if (str != null && (v9 = (V) ((HashMap) qVar.f38946u).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0479s);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(Wv.i(sb, abstractComponentCallbacksC0479s.f4996A, " that does not belong to this FragmentManager!"));
            }
        }
        if (v9 != null) {
            v9.k();
        }
        N n9 = abstractComponentCallbacksC0479s.f5005K;
        abstractComponentCallbacksC0479s.f5006L = n9.f4836t;
        abstractComponentCallbacksC0479s.f5008N = n9.f4838v;
        S0.e eVar = this.f4873a;
        eVar.o(abstractComponentCallbacksC0479s, false);
        ArrayList arrayList = abstractComponentCallbacksC0479s.f5029r0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0477p) it.next()).a();
        }
        arrayList.clear();
        abstractComponentCallbacksC0479s.f5007M.b(abstractComponentCallbacksC0479s.f5006L, abstractComponentCallbacksC0479s.a(), abstractComponentCallbacksC0479s);
        abstractComponentCallbacksC0479s.f5024n = 0;
        abstractComponentCallbacksC0479s.f5016V = false;
        abstractComponentCallbacksC0479s.n(abstractComponentCallbacksC0479s.f5006L.f5042A);
        if (!abstractComponentCallbacksC0479s.f5016V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0479s + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0479s.f5005K.f4829m.iterator();
        while (it2.hasNext()) {
            ((T) it2.next()).a(abstractComponentCallbacksC0479s);
        }
        O o4 = abstractComponentCallbacksC0479s.f5007M;
        o4.f4810E = false;
        o4.f4811F = false;
        o4.f4816L.f4858f = false;
        o4.t(0);
        eVar.i(abstractComponentCallbacksC0479s, false);
    }

    public final int d() {
        Object obj;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4875c;
        if (abstractComponentCallbacksC0479s.f5005K == null) {
            return abstractComponentCallbacksC0479s.f5024n;
        }
        int i = this.f4877e;
        int ordinal = abstractComponentCallbacksC0479s.m0.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0479s.f5001F) {
            if (abstractComponentCallbacksC0479s.f5002G) {
                i = Math.max(this.f4877e, 2);
                View view = abstractComponentCallbacksC0479s.f5018X;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f4877e < 4 ? Math.min(i, abstractComponentCallbacksC0479s.f5024n) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0479s.f4999D) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0479s.f5017W;
        if (viewGroup != null) {
            C0471j f2 = C0471j.f(viewGroup, abstractComponentCallbacksC0479s.f());
            f2.getClass();
            a0 d9 = f2.d(abstractComponentCallbacksC0479s);
            int i4 = d9 != null ? d9.f4915b : 0;
            Iterator it = f2.f4961c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                a0 a0Var = (a0) obj;
                if (kotlin.jvm.internal.h.a(a0Var.f4916c, abstractComponentCallbacksC0479s) && !a0Var.f4919f) {
                    break;
                }
            }
            a0 a0Var2 = (a0) obj;
            r5 = a0Var2 != null ? a0Var2.f4915b : 0;
            int i6 = i4 == 0 ? -1 : c0.f4939a[AbstractC5050e.d(i4)];
            if (i6 != -1 && i6 != 1) {
                r5 = i4;
            }
        }
        if (r5 == 2) {
            i = Math.min(i, 6);
        } else if (r5 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0479s.f5000E) {
            i = abstractComponentCallbacksC0479s.k() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0479s.Y && abstractComponentCallbacksC0479s.f5024n < 5) {
            i = Math.min(i, 4);
        }
        if (N.E(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + abstractComponentCallbacksC0479s);
        }
        return i;
    }

    public final void e() {
        Bundle bundle;
        boolean E8 = N.E(3);
        final AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4875c;
        if (E8) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0479s);
        }
        Bundle bundle2 = abstractComponentCallbacksC0479s.f5031u;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC0479s.f5022k0) {
            abstractComponentCallbacksC0479s.f5024n = 1;
            Bundle bundle4 = abstractComponentCallbacksC0479s.f5031u;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            abstractComponentCallbacksC0479s.f5007M.Q(bundle);
            O o4 = abstractComponentCallbacksC0479s.f5007M;
            o4.f4810E = false;
            o4.f4811F = false;
            o4.f4816L.f4858f = false;
            o4.t(1);
            return;
        }
        S0.e eVar = this.f4873a;
        eVar.p(abstractComponentCallbacksC0479s, bundle3, false);
        abstractComponentCallbacksC0479s.f5007M.K();
        abstractComponentCallbacksC0479s.f5024n = 1;
        abstractComponentCallbacksC0479s.f5016V = false;
        abstractComponentCallbacksC0479s.f5025n0.a(new InterfaceC0505t() { // from class: androidx.fragment.app.Fragment$6
            @Override // androidx.lifecycle.InterfaceC0505t
            public final void a(InterfaceC0507v interfaceC0507v, EnumC0500n enumC0500n) {
                View view;
                if (enumC0500n != EnumC0500n.ON_STOP || (view = AbstractComponentCallbacksC0479s.this.f5018X) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        abstractComponentCallbacksC0479s.o(bundle3);
        abstractComponentCallbacksC0479s.f5022k0 = true;
        if (abstractComponentCallbacksC0479s.f5016V) {
            abstractComponentCallbacksC0479s.f5025n0.e(EnumC0500n.ON_CREATE);
            eVar.j(abstractComponentCallbacksC0479s, bundle3, false);
        } else {
            throw new d0("Fragment " + abstractComponentCallbacksC0479s + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        int i = 1;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4875c;
        if (abstractComponentCallbacksC0479s.f5001F) {
            return;
        }
        if (N.E(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0479s);
        }
        Bundle bundle = abstractComponentCallbacksC0479s.f5031u;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater s9 = abstractComponentCallbacksC0479s.s(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC0479s.f5017W;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i4 = abstractComponentCallbacksC0479s.f5010P;
            if (i4 != 0) {
                if (i4 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0479s + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0479s.f5005K.f4837u.n(i4);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0479s.f5003H) {
                        try {
                            str = abstractComponentCallbacksC0479s.y().getResources().getResourceName(abstractComponentCallbacksC0479s.f5010P);
                        } catch (Resources.NotFoundException unused) {
                            str = com.anythink.core.common.v.m.f17596e;
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0479s.f5010P) + " (" + str + ") for fragment " + abstractComponentCallbacksC0479s);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C4514c c4514c = f0.d.f37421a;
                    f0.d.b(new f0.e(abstractComponentCallbacksC0479s, viewGroup, 1));
                    f0.d.a(abstractComponentCallbacksC0479s).getClass();
                }
            }
        }
        abstractComponentCallbacksC0479s.f5017W = viewGroup;
        abstractComponentCallbacksC0479s.x(s9, viewGroup, bundle2);
        if (abstractComponentCallbacksC0479s.f5018X != null) {
            if (N.E(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC0479s);
            }
            abstractComponentCallbacksC0479s.f5018X.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0479s.f5018X.setTag(C5248R.id.fragment_container_view_tag, abstractComponentCallbacksC0479s);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0479s.f5012R) {
                abstractComponentCallbacksC0479s.f5018X.setVisibility(8);
            }
            View view = abstractComponentCallbacksC0479s.f5018X;
            WeakHashMap weakHashMap = O.X.f2142a;
            if (view.isAttachedToWindow()) {
                O.J.c(abstractComponentCallbacksC0479s.f5018X);
            } else {
                View view2 = abstractComponentCallbacksC0479s.f5018X;
                view2.addOnAttachStateChangeListener(new J3.p(i, view2));
            }
            Bundle bundle3 = abstractComponentCallbacksC0479s.f5031u;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC0479s.f5007M.t(2);
            this.f4873a.u(abstractComponentCallbacksC0479s, abstractComponentCallbacksC0479s.f5018X, bundle2, false);
            int visibility = abstractComponentCallbacksC0479s.f5018X.getVisibility();
            abstractComponentCallbacksC0479s.b().f4993j = abstractComponentCallbacksC0479s.f5018X.getAlpha();
            if (abstractComponentCallbacksC0479s.f5017W != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0479s.f5018X.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0479s.b().f4994k = findFocus;
                    if (N.E(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0479s);
                    }
                }
                abstractComponentCallbacksC0479s.f5018X.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0479s.f5024n = 2;
    }

    public final void g() {
        AbstractComponentCallbacksC0479s b9;
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4875c;
        if (E8) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0479s);
        }
        boolean z6 = true;
        boolean z9 = abstractComponentCallbacksC0479s.f5000E && !abstractComponentCallbacksC0479s.k();
        l4.q qVar = this.f4874b;
        if (z9) {
            qVar.n(abstractComponentCallbacksC0479s.f5034x, null);
        }
        if (!z9) {
            S s9 = (S) qVar.f38948w;
            if (!((s9.f4853a.containsKey(abstractComponentCallbacksC0479s.f5034x) && s9.f4856d) ? s9.f4857e : true)) {
                String str = abstractComponentCallbacksC0479s.f4996A;
                if (str != null && (b9 = qVar.b(str)) != null && b9.f5014T) {
                    abstractComponentCallbacksC0479s.f5036z = b9;
                }
                abstractComponentCallbacksC0479s.f5024n = 0;
                return;
            }
        }
        C0483w c0483w = abstractComponentCallbacksC0479s.f5006L;
        if (c0483w != null) {
            z6 = ((S) qVar.f38948w).f4857e;
        } else {
            AbstractActivityC0484x abstractActivityC0484x = c0483w.f5042A;
            if (abstractActivityC0484x != null) {
                z6 = true ^ abstractActivityC0484x.isChangingConfigurations();
            }
        }
        if (z9 || z6) {
            ((S) qVar.f38948w).b(abstractComponentCallbacksC0479s);
        }
        abstractComponentCallbacksC0479s.f5007M.k();
        abstractComponentCallbacksC0479s.f5025n0.e(EnumC0500n.ON_DESTROY);
        abstractComponentCallbacksC0479s.f5024n = 0;
        abstractComponentCallbacksC0479s.f5016V = false;
        abstractComponentCallbacksC0479s.f5022k0 = false;
        abstractComponentCallbacksC0479s.f5016V = true;
        if (!abstractComponentCallbacksC0479s.f5016V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0479s + " did not call through to super.onDestroy()");
        }
        this.f4873a.k(abstractComponentCallbacksC0479s, false);
        Iterator it = qVar.d().iterator();
        while (it.hasNext()) {
            V v9 = (V) it.next();
            if (v9 != null) {
                String str2 = abstractComponentCallbacksC0479s.f5034x;
                AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = v9.f4875c;
                if (str2.equals(abstractComponentCallbacksC0479s2.f4996A)) {
                    abstractComponentCallbacksC0479s2.f5036z = abstractComponentCallbacksC0479s;
                    abstractComponentCallbacksC0479s2.f4996A = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0479s.f4996A;
        if (str3 != null) {
            abstractComponentCallbacksC0479s.f5036z = qVar.b(str3);
        }
        qVar.k(this);
    }

    public final void h() {
        View view;
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4875c;
        if (E8) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0479s);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0479s.f5017W;
        if (viewGroup != null && (view = abstractComponentCallbacksC0479s.f5018X) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0479s.f5007M.t(1);
        if (abstractComponentCallbacksC0479s.f5018X != null) {
            X x9 = abstractComponentCallbacksC0479s.f5026o0;
            x9.b();
            if (x9.f4889w.f5145d.compareTo(EnumC0501o.f5133v) >= 0) {
                abstractComponentCallbacksC0479s.f5026o0.a(EnumC0500n.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0479s.f5024n = 1;
        abstractComponentCallbacksC0479s.f5016V = false;
        abstractComponentCallbacksC0479s.q();
        if (!abstractComponentCallbacksC0479s.f5016V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0479s + " did not call through to super.onDestroyView()");
        }
        s.l lVar = ((C4582b) new b3.e(abstractComponentCallbacksC0479s.getViewModelStore(), C4582b.f38143b).u(C4582b.class)).f38144a;
        if (lVar.f40280v > 0) {
            throw D.x.h(lVar.f40279u[0]);
        }
        abstractComponentCallbacksC0479s.f5004I = false;
        this.f4873a.v(abstractComponentCallbacksC0479s, false);
        abstractComponentCallbacksC0479s.f5017W = null;
        abstractComponentCallbacksC0479s.f5018X = null;
        abstractComponentCallbacksC0479s.f5026o0 = null;
        abstractComponentCallbacksC0479s.f5027p0.e(null);
        abstractComponentCallbacksC0479s.f5002G = false;
    }

    public final void i() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4875c;
        if (E8) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0479s);
        }
        abstractComponentCallbacksC0479s.f5024n = -1;
        abstractComponentCallbacksC0479s.f5016V = false;
        abstractComponentCallbacksC0479s.r();
        if (!abstractComponentCallbacksC0479s.f5016V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0479s + " did not call through to super.onDetach()");
        }
        O o4 = abstractComponentCallbacksC0479s.f5007M;
        if (!o4.f4812G) {
            o4.k();
            abstractComponentCallbacksC0479s.f5007M = new O();
        }
        this.f4873a.l(abstractComponentCallbacksC0479s, false);
        abstractComponentCallbacksC0479s.f5024n = -1;
        abstractComponentCallbacksC0479s.f5006L = null;
        abstractComponentCallbacksC0479s.f5008N = null;
        abstractComponentCallbacksC0479s.f5005K = null;
        if (!abstractComponentCallbacksC0479s.f5000E || abstractComponentCallbacksC0479s.k()) {
            S s9 = (S) this.f4874b.f38948w;
            if (!((s9.f4853a.containsKey(abstractComponentCallbacksC0479s.f5034x) && s9.f4856d) ? s9.f4857e : true)) {
                return;
            }
        }
        if (N.E(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0479s);
        }
        abstractComponentCallbacksC0479s.h();
    }

    public final void j() {
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4875c;
        if (abstractComponentCallbacksC0479s.f5001F && abstractComponentCallbacksC0479s.f5002G && !abstractComponentCallbacksC0479s.f5004I) {
            if (N.E(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0479s);
            }
            Bundle bundle = abstractComponentCallbacksC0479s.f5031u;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC0479s.x(abstractComponentCallbacksC0479s.s(bundle2), null, bundle2);
            View view = abstractComponentCallbacksC0479s.f5018X;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0479s.f5018X.setTag(C5248R.id.fragment_container_view_tag, abstractComponentCallbacksC0479s);
                if (abstractComponentCallbacksC0479s.f5012R) {
                    abstractComponentCallbacksC0479s.f5018X.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC0479s.f5031u;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC0479s.f5007M.t(2);
                this.f4873a.u(abstractComponentCallbacksC0479s, abstractComponentCallbacksC0479s.f5018X, bundle2, false);
                abstractComponentCallbacksC0479s.f5024n = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        l4.q qVar = this.f4874b;
        boolean z6 = this.f4876d;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4875c;
        if (z6) {
            if (N.E(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0479s);
                return;
            }
            return;
        }
        try {
            this.f4876d = true;
            boolean z9 = false;
            while (true) {
                int d9 = d();
                int i = abstractComponentCallbacksC0479s.f5024n;
                int i4 = 3;
                if (d9 == i) {
                    if (!z9 && i == -1 && abstractComponentCallbacksC0479s.f5000E && !abstractComponentCallbacksC0479s.k()) {
                        if (N.E(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0479s);
                        }
                        ((S) qVar.f38948w).b(abstractComponentCallbacksC0479s);
                        qVar.k(this);
                        if (N.E(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0479s);
                        }
                        abstractComponentCallbacksC0479s.h();
                    }
                    if (abstractComponentCallbacksC0479s.f5021j0) {
                        if (abstractComponentCallbacksC0479s.f5018X != null && (viewGroup = abstractComponentCallbacksC0479s.f5017W) != null) {
                            C0471j f2 = C0471j.f(viewGroup, abstractComponentCallbacksC0479s.f());
                            if (abstractComponentCallbacksC0479s.f5012R) {
                                f2.getClass();
                                if (N.E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0479s);
                                }
                                f2.a(3, 1, this);
                            } else {
                                f2.getClass();
                                if (N.E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0479s);
                                }
                                f2.a(2, 1, this);
                            }
                        }
                        N n9 = abstractComponentCallbacksC0479s.f5005K;
                        if (n9 != null && abstractComponentCallbacksC0479s.f4999D && N.F(abstractComponentCallbacksC0479s)) {
                            n9.f4809D = true;
                        }
                        abstractComponentCallbacksC0479s.f5021j0 = false;
                        abstractComponentCallbacksC0479s.f5007M.n();
                    }
                    this.f4876d = false;
                    return;
                }
                if (d9 <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            abstractComponentCallbacksC0479s.f5024n = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0479s.f5002G = false;
                            abstractComponentCallbacksC0479s.f5024n = 2;
                            break;
                        case 3:
                            if (N.E(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0479s);
                            }
                            if (abstractComponentCallbacksC0479s.f5018X != null && abstractComponentCallbacksC0479s.f5032v == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0479s.f5018X != null && (viewGroup2 = abstractComponentCallbacksC0479s.f5017W) != null) {
                                C0471j f9 = C0471j.f(viewGroup2, abstractComponentCallbacksC0479s.f());
                                f9.getClass();
                                if (N.E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0479s);
                                }
                                f9.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0479s.f5024n = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0479s.f5024n = 5;
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
                            if (abstractComponentCallbacksC0479s.f5018X != null && (viewGroup3 = abstractComponentCallbacksC0479s.f5017W) != null) {
                                C0471j f10 = C0471j.f(viewGroup3, abstractComponentCallbacksC0479s.f());
                                int visibility = abstractComponentCallbacksC0479s.f5018X.getVisibility();
                                if (visibility == 0) {
                                    i4 = 2;
                                } else if (visibility == 4) {
                                    i4 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                f10.getClass();
                                Wv.n(i4, "finalState");
                                if (N.E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0479s);
                                }
                                f10.a(i4, 2, this);
                            }
                            abstractComponentCallbacksC0479s.f5024n = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0479s.f5024n = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z9 = true;
            }
        } catch (Throwable th) {
            this.f4876d = false;
            throw th;
        }
    }

    public final void l() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4875c;
        if (E8) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0479s);
        }
        abstractComponentCallbacksC0479s.f5007M.t(5);
        if (abstractComponentCallbacksC0479s.f5018X != null) {
            abstractComponentCallbacksC0479s.f5026o0.a(EnumC0500n.ON_PAUSE);
        }
        abstractComponentCallbacksC0479s.f5025n0.e(EnumC0500n.ON_PAUSE);
        abstractComponentCallbacksC0479s.f5024n = 6;
        abstractComponentCallbacksC0479s.f5016V = true;
        this.f4873a.m(abstractComponentCallbacksC0479s, false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4875c;
        Bundle bundle = abstractComponentCallbacksC0479s.f5031u;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC0479s.f5031u.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC0479s.f5031u.putBundle("savedInstanceState", new Bundle());
        }
        abstractComponentCallbacksC0479s.f5032v = abstractComponentCallbacksC0479s.f5031u.getSparseParcelableArray("viewState");
        abstractComponentCallbacksC0479s.f5033w = abstractComponentCallbacksC0479s.f5031u.getBundle("viewRegistryState");
        U u6 = (U) abstractComponentCallbacksC0479s.f5031u.getParcelable(com.anythink.core.express.b.a.f18313b);
        if (u6 != null) {
            abstractComponentCallbacksC0479s.f4996A = u6.f4863E;
            abstractComponentCallbacksC0479s.f4997B = u6.f4864F;
            abstractComponentCallbacksC0479s.f5019Z = u6.f4865G;
        }
        if (abstractComponentCallbacksC0479s.f5019Z) {
            return;
        }
        abstractComponentCallbacksC0479s.Y = true;
    }

    public final void n() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4875c;
        if (E8) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0479s);
        }
        r rVar = abstractComponentCallbacksC0479s.f5020i0;
        View view = rVar == null ? null : rVar.f4994k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0479s.f5018X) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0479s.f5018X) {
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
                sb.append(abstractComponentCallbacksC0479s);
                sb.append(" resulting in focused view ");
                sb.append(abstractComponentCallbacksC0479s.f5018X.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0479s.b().f4994k = null;
        abstractComponentCallbacksC0479s.f5007M.K();
        abstractComponentCallbacksC0479s.f5007M.x(true);
        abstractComponentCallbacksC0479s.f5024n = 7;
        abstractComponentCallbacksC0479s.f5016V = false;
        abstractComponentCallbacksC0479s.f5016V = true;
        if (!abstractComponentCallbacksC0479s.f5016V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0479s + " did not call through to super.onResume()");
        }
        C0509x c0509x = abstractComponentCallbacksC0479s.f5025n0;
        EnumC0500n enumC0500n = EnumC0500n.ON_RESUME;
        c0509x.e(enumC0500n);
        if (abstractComponentCallbacksC0479s.f5018X != null) {
            abstractComponentCallbacksC0479s.f5026o0.f4889w.e(enumC0500n);
        }
        O o4 = abstractComponentCallbacksC0479s.f5007M;
        o4.f4810E = false;
        o4.f4811F = false;
        o4.f4816L.f4858f = false;
        o4.t(7);
        this.f4873a.q(abstractComponentCallbacksC0479s, false);
        this.f4874b.n(abstractComponentCallbacksC0479s.f5034x, null);
        abstractComponentCallbacksC0479s.f5031u = null;
        abstractComponentCallbacksC0479s.f5032v = null;
        abstractComponentCallbacksC0479s.f5033w = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4875c;
        if (abstractComponentCallbacksC0479s.f5018X == null) {
            return;
        }
        if (N.E(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0479s + " with view " + abstractComponentCallbacksC0479s.f5018X);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0479s.f5018X.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0479s.f5032v = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0479s.f5026o0.f4890x.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0479s.f5033w = bundle;
    }

    public final void p() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4875c;
        if (E8) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0479s);
        }
        abstractComponentCallbacksC0479s.f5007M.K();
        abstractComponentCallbacksC0479s.f5007M.x(true);
        abstractComponentCallbacksC0479s.f5024n = 5;
        abstractComponentCallbacksC0479s.f5016V = false;
        abstractComponentCallbacksC0479s.u();
        if (!abstractComponentCallbacksC0479s.f5016V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0479s + " did not call through to super.onStart()");
        }
        C0509x c0509x = abstractComponentCallbacksC0479s.f5025n0;
        EnumC0500n enumC0500n = EnumC0500n.ON_START;
        c0509x.e(enumC0500n);
        if (abstractComponentCallbacksC0479s.f5018X != null) {
            abstractComponentCallbacksC0479s.f5026o0.f4889w.e(enumC0500n);
        }
        O o4 = abstractComponentCallbacksC0479s.f5007M;
        o4.f4810E = false;
        o4.f4811F = false;
        o4.f4816L.f4858f = false;
        o4.t(5);
        this.f4873a.s(abstractComponentCallbacksC0479s, false);
    }

    public final void q() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4875c;
        if (E8) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0479s);
        }
        O o4 = abstractComponentCallbacksC0479s.f5007M;
        o4.f4811F = true;
        o4.f4816L.f4858f = true;
        o4.t(4);
        if (abstractComponentCallbacksC0479s.f5018X != null) {
            abstractComponentCallbacksC0479s.f5026o0.a(EnumC0500n.ON_STOP);
        }
        abstractComponentCallbacksC0479s.f5025n0.e(EnumC0500n.ON_STOP);
        abstractComponentCallbacksC0479s.f5024n = 4;
        abstractComponentCallbacksC0479s.f5016V = false;
        abstractComponentCallbacksC0479s.v();
        if (abstractComponentCallbacksC0479s.f5016V) {
            this.f4873a.t(abstractComponentCallbacksC0479s, false);
            return;
        }
        throw new d0("Fragment " + abstractComponentCallbacksC0479s + " did not call through to super.onStop()");
    }

    public V(S0.e eVar, l4.q qVar, ClassLoader classLoader, G g9, Bundle bundle) {
        this.f4873a = eVar;
        this.f4874b = qVar;
        U u6 = (U) bundle.getParcelable(com.anythink.core.express.b.a.f18313b);
        AbstractComponentCallbacksC0479s a9 = g9.a(u6.f4866n);
        a9.f5034x = u6.f4867u;
        a9.f5001F = u6.f4868v;
        a9.f5003H = true;
        a9.f5009O = u6.f4869w;
        a9.f5010P = u6.f4870x;
        a9.f5011Q = u6.f4871y;
        a9.f5014T = u6.f4872z;
        a9.f5000E = u6.f4859A;
        a9.f5013S = u6.f4860B;
        a9.f5012R = u6.f4861C;
        a9.m0 = EnumC0501o.values()[u6.f4862D];
        a9.f4996A = u6.f4863E;
        a9.f4997B = u6.f4864F;
        a9.f5019Z = u6.f4865G;
        this.f4875c = a9;
        a9.f5031u = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a9.B(bundle2);
        if (N.E(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a9);
        }
    }

    public V(S0.e eVar, l4.q qVar, AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, Bundle bundle) {
        this.f4873a = eVar;
        this.f4874b = qVar;
        this.f4875c = abstractComponentCallbacksC0479s;
        abstractComponentCallbacksC0479s.f5032v = null;
        abstractComponentCallbacksC0479s.f5033w = null;
        abstractComponentCallbacksC0479s.J = 0;
        abstractComponentCallbacksC0479s.f5002G = false;
        abstractComponentCallbacksC0479s.f4999D = false;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = abstractComponentCallbacksC0479s.f5036z;
        abstractComponentCallbacksC0479s.f4996A = abstractComponentCallbacksC0479s2 != null ? abstractComponentCallbacksC0479s2.f5034x : null;
        abstractComponentCallbacksC0479s.f5036z = null;
        abstractComponentCallbacksC0479s.f5031u = bundle;
        abstractComponentCallbacksC0479s.f5035y = bundle.getBundle("arguments");
    }
}
