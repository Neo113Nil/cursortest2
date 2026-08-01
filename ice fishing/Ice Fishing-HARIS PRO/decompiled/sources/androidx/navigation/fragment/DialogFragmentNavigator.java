package androidx.navigation.fragment;

import D1.h;
import D1.i;
import O1.q;
import Z.AbstractComponentCallbacksC0070s;
import Z.C0053a;
import Z.F;
import Z.Q;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.C0103u;
import androidx.navigation.fragment.DialogFragmentNavigator;
import f0.C0134C;
import f0.C0141f;
import f0.C0144i;
import f0.M;
import f0.N;
import f0.w;
import h0.d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import l0.C0230a;
import u1.g;
import u1.v;

@M("dialog")
/* loaded from: classes.dex */
public final class DialogFragmentNavigator extends N {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2072c;

    /* renamed from: d, reason: collision with root package name */
    public final Z.M f2073d;
    public final LinkedHashSet e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final C0230a f2074f = new C0230a(5, this);

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f2075g = new LinkedHashMap();

    public DialogFragmentNavigator(Context context, Z.M m2) {
        this.f2072c = context;
        this.f2073d = m2;
    }

    @Override // f0.N
    public final w a() {
        return new d(this);
    }

    @Override // f0.N
    public final void d(List list, C0134C c0134c) {
        Z.M m2 = this.f2073d;
        if (m2.K()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0141f c0141f = (C0141f) it.next();
            DialogFragment k2 = k(c0141f);
            k2.f1976j0 = false;
            k2.f1977k0 = true;
            C0053a c0053a = new C0053a(m2);
            c0053a.f1523p = true;
            c0053a.e(0, k2, c0141f.f2923f, 1);
            c0053a.d(false);
            C0141f c0141f2 = (C0141f) g.S((List) ((q) b().e.f852a).f());
            boolean L2 = g.L((Iterable) ((q) b().f2937f.f852a).f(), c0141f2);
            b().h(c0141f);
            if (c0141f2 != null && !L2) {
                b().b(c0141f2);
            }
        }
    }

    @Override // f0.N
    public final void e(C0144i c0144i) {
        C0103u c0103u;
        this.f2892a = c0144i;
        this.f2893b = true;
        Iterator it = ((List) ((q) c0144i.e.f852a).f()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            Z.M m2 = this.f2073d;
            if (!hasNext) {
                m2.f1445n.add(new Q() { // from class: h0.c
                    @Override // Z.Q
                    public final void a(Z.M m3, AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
                        DialogFragmentNavigator dialogFragmentNavigator = DialogFragmentNavigator.this;
                        D1.i.e(dialogFragmentNavigator, "this$0");
                        D1.i.e(m3, "<anonymous parameter 0>");
                        D1.i.e(abstractComponentCallbacksC0070s, "childFragment");
                        LinkedHashSet linkedHashSet = dialogFragmentNavigator.e;
                        String str = abstractComponentCallbacksC0070s.f1620y;
                        if ((linkedHashSet instanceof E1.a) && !(linkedHashSet instanceof E1.b)) {
                            D1.q.c(linkedHashSet, "kotlin.collections.MutableCollection");
                            throw null;
                        }
                        if (linkedHashSet.remove(str)) {
                            abstractComponentCallbacksC0070s.f1592O.a(dialogFragmentNavigator.f2074f);
                        }
                        LinkedHashMap linkedHashMap = dialogFragmentNavigator.f2075g;
                        String str2 = abstractComponentCallbacksC0070s.f1620y;
                        if (linkedHashMap instanceof E1.a) {
                            D1.q.c(linkedHashMap, "kotlin.collections.MutableMap");
                            throw null;
                        }
                        linkedHashMap.remove(str2);
                    }
                });
                return;
            }
            C0141f c0141f = (C0141f) it.next();
            DialogFragment dialogFragment = (DialogFragment) m2.B(c0141f.f2923f);
            if (dialogFragment == null || (c0103u = dialogFragment.f1592O) == null) {
                this.e.add(c0141f.f2923f);
            } else {
                c0103u.a(this.f2074f);
            }
        }
    }

    @Override // f0.N
    public final void f(C0141f c0141f) {
        Z.M m2 = this.f2073d;
        if (m2.K()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        LinkedHashMap linkedHashMap = this.f2075g;
        String str = c0141f.f2923f;
        DialogFragment dialogFragment = (DialogFragment) linkedHashMap.get(str);
        if (dialogFragment == null) {
            AbstractComponentCallbacksC0070s B2 = m2.B(str);
            dialogFragment = B2 instanceof DialogFragment ? (DialogFragment) B2 : null;
        }
        if (dialogFragment != null) {
            dialogFragment.f1592O.f(this.f2074f);
            dialogFragment.M();
        }
        DialogFragment k2 = k(c0141f);
        k2.f1976j0 = false;
        k2.f1977k0 = true;
        C0053a c0053a = new C0053a(m2);
        c0053a.f1523p = true;
        c0053a.e(0, k2, str, 1);
        c0053a.d(false);
        C0144i b2 = b();
        List list = (List) ((q) b2.e.f852a).f();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            C0141f c0141f2 = (C0141f) listIterator.previous();
            if (i.a(c0141f2.f2923f, str)) {
                q qVar = b2.f2935c;
                qVar.g(v.E(v.E((Set) qVar.f(), c0141f2), c0141f));
                b2.c(c0141f);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // f0.N
    public final void i(C0141f c0141f, boolean z2) {
        i.e(c0141f, "popUpTo");
        Z.M m2 = this.f2073d;
        if (m2.K()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) ((q) b().e.f852a).f();
        int indexOf = list.indexOf(c0141f);
        Iterator it = g.V(list.subList(indexOf, list.size())).iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0070s B2 = m2.B(((C0141f) it.next()).f2923f);
            if (B2 != null) {
                ((DialogFragment) B2).M();
            }
        }
        l(indexOf, c0141f, z2);
    }

    public final DialogFragment k(C0141f c0141f) {
        w wVar = c0141f.f2920b;
        i.c(wVar, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        d dVar = (d) wVar;
        String str = dVar.f3246k;
        if (str == null) {
            throw new IllegalStateException("DialogFragment class was not set");
        }
        char charAt = str.charAt(0);
        Context context = this.f2072c;
        if (charAt == '.') {
            str = context.getPackageName() + str;
        }
        F D2 = this.f2073d.D();
        context.getClassLoader();
        AbstractComponentCallbacksC0070s a2 = D2.a(str);
        i.d(a2, "fragmentManager.fragment…t.classLoader, className)");
        if (DialogFragment.class.isAssignableFrom(a2.getClass())) {
            DialogFragment dialogFragment = (DialogFragment) a2;
            dialogFragment.L(c0141f.e());
            dialogFragment.f1592O.a(this.f2074f);
            this.f2075g.put(c0141f.f2923f, dialogFragment);
            return dialogFragment;
        }
        StringBuilder sb = new StringBuilder("Dialog destination ");
        String str2 = dVar.f3246k;
        if (str2 != null) {
            throw new IllegalArgumentException(h.h(sb, str2, " is not an instance of DialogFragment").toString());
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    public final void l(int i, C0141f c0141f, boolean z2) {
        C0141f c0141f2 = (C0141f) g.O((List) ((q) b().e.f852a).f(), i - 1);
        boolean L2 = g.L((Iterable) ((q) b().f2937f.f852a).f(), c0141f2);
        b().f(c0141f, z2);
        if (c0141f2 == null || L2) {
            return;
        }
        b().b(c0141f2);
    }
}
