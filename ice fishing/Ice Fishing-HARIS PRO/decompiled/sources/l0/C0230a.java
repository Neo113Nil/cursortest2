package l0;

import D1.h;
import D1.i;
import O1.q;
import Z.AbstractComponentCallbacksC0070s;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.EnumC0096m;
import androidx.lifecycle.InterfaceC0091h;
import androidx.lifecycle.InterfaceC0100q;
import androidx.lifecycle.InterfaceC0101s;
import androidx.lifecycle.L;
import androidx.lifecycle.M;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.navigation.fragment.DialogFragmentNavigator;
import b.AbstractActivityC0113i;
import b.AbstractC0110f;
import b.u;
import f0.C0141f;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import u1.g;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230a implements InterfaceC0100q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3779a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3780b;

    public /* synthetic */ C0230a(int i, Object obj) {
        this.f3779a = i;
        this.f3780b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0100q
    public final void a(InterfaceC0101s interfaceC0101s, EnumC0096m enumC0096m) {
        View view;
        int i;
        switch (this.f3779a) {
            case 0:
                if (enumC0096m != EnumC0096m.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0101s.d().f(this);
                InterfaceC0234e interfaceC0234e = (InterfaceC0234e) this.f3780b;
                Bundle c2 = interfaceC0234e.b().c("androidx.savedstate.Restarter");
                if (c2 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = c2.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, C0230a.class.getClassLoader()).asSubclass(InterfaceC0231b.class);
                        i.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                i.d(newInstance, "{\n                constr…wInstance()\n            }");
                                if (!(interfaceC0234e instanceof V)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                U c3 = ((V) interfaceC0234e).c();
                                C0233d b2 = interfaceC0234e.b();
                                c3.getClass();
                                LinkedHashMap linkedHashMap = c3.f2025a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    i.e(str2, "key");
                                    Q q2 = (Q) linkedHashMap.get(str2);
                                    i.b(q2);
                                    L.a(q2, b2, interfaceC0234e.d());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    b2.g();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException("Failed to instantiate " + str, e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(h.g("Class ", str, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                if (enumC0096m != EnumC0096m.ON_STOP || (view = ((AbstractComponentCallbacksC0070s) this.f3780b).f1584F) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 2:
                new HashMap();
                InterfaceC0091h[] interfaceC0091hArr = (InterfaceC0091h[]) this.f3780b;
                if (interfaceC0091hArr.length > 0) {
                    InterfaceC0091h interfaceC0091h = interfaceC0091hArr[0];
                    throw null;
                }
                if (interfaceC0091hArr.length <= 0) {
                    return;
                }
                InterfaceC0091h interfaceC0091h2 = interfaceC0091hArr[0];
                throw null;
            case 3:
                if (enumC0096m != EnumC0096m.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0096m).toString());
                }
                interfaceC0101s.d().f(this);
                ((M) this.f3780b).c();
                return;
            case 4:
                if (enumC0096m != EnumC0096m.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                    return;
                }
                u uVar = ((AbstractActivityC0113i) this.f3780b).f2286g;
                OnBackInvokedDispatcher a2 = AbstractC0110f.a((AbstractActivityC0113i) interfaceC0101s);
                uVar.getClass();
                i.e(a2, "invoker");
                uVar.e = a2;
                uVar.c(uVar.f2325g);
                return;
            default:
                int i2 = h0.e.f3247a[enumC0096m.ordinal()];
                DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) this.f3780b;
                if (i2 == 1) {
                    DialogFragment dialogFragment = (DialogFragment) interfaceC0101s;
                    Iterable iterable = (Iterable) ((q) dialogFragmentNavigator.b().e.f852a).f();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            if (i.a(((C0141f) it2.next()).f2923f, dialogFragment.f1620y)) {
                                return;
                            }
                        }
                    }
                    dialogFragment.M();
                    return;
                }
                Object obj = null;
                if (i2 == 2) {
                    DialogFragment dialogFragment2 = (DialogFragment) interfaceC0101s;
                    for (Object obj2 : (Iterable) ((q) dialogFragmentNavigator.b().f2937f.f852a).f()) {
                        if (i.a(((C0141f) obj2).f2923f, dialogFragment2.f1620y)) {
                            obj = obj2;
                        }
                    }
                    C0141f c0141f = (C0141f) obj;
                    if (c0141f != null) {
                        dialogFragmentNavigator.b().b(c0141f);
                        return;
                    }
                    return;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        return;
                    }
                    DialogFragment dialogFragment3 = (DialogFragment) interfaceC0101s;
                    for (Object obj3 : (Iterable) ((q) dialogFragmentNavigator.b().f2937f.f852a).f()) {
                        if (i.a(((C0141f) obj3).f2923f, dialogFragment3.f1620y)) {
                            obj = obj3;
                        }
                    }
                    C0141f c0141f2 = (C0141f) obj;
                    if (c0141f2 != null) {
                        dialogFragmentNavigator.b().b(c0141f2);
                    }
                    dialogFragment3.f1592O.f(this);
                    return;
                }
                DialogFragment dialogFragment4 = (DialogFragment) interfaceC0101s;
                if (dialogFragment4.P().isShowing()) {
                    return;
                }
                List list = (List) ((q) dialogFragmentNavigator.b().e.f852a).f();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                    } else if (i.a(((C0141f) listIterator.previous()).f2923f, dialogFragment4.f1620y)) {
                        i = listIterator.nextIndex();
                    }
                }
                C0141f c0141f3 = (C0141f) g.O(list, i);
                if (!i.a(g.S(list), c0141f3)) {
                    Log.i("DialogFragmentNavigator", "Dialog " + dialogFragment4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                if (c0141f3 != null) {
                    dialogFragmentNavigator.l(i, c0141f3, false);
                    return;
                }
                return;
        }
    }
}
