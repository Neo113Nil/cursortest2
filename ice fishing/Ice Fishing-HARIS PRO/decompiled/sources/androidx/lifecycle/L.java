package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import c0.AbstractC0121b;
import c0.C0120a;
import c0.C0122c;
import com.lumenpath.harispro.hrnavigator.R;
import d0.C0126a;
import d0.C0127b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import l0.C0230a;
import l0.C0233d;
import l0.InterfaceC0232c;
import l0.InterfaceC0234e;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.e f2008a = new S0.e(18);

    /* renamed from: b, reason: collision with root package name */
    public static final S0.e f2009b = new S0.e(19);

    /* renamed from: c, reason: collision with root package name */
    public static final S0.e f2010c = new S0.e(17);

    public static final void a(Q q2, C0233d c0233d, C0103u c0103u) {
        AutoCloseable autoCloseable;
        D1.i.e(c0233d, "registry");
        D1.i.e(c0103u, "lifecycle");
        C0126a c0126a = q2.f2022a;
        if (c0126a != null) {
            synchronized (c0126a.f2831a) {
                autoCloseable = (AutoCloseable) c0126a.f2832b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        J j = (J) autoCloseable;
        if (j == null || j.f2007c) {
            return;
        }
        j.b(c0103u, c0233d);
        g(c0103u, c0233d);
    }

    public static I b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new I();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                D1.i.d(str, "key");
                hashMap.put(str, bundle2.get(str));
            }
            return new I(hashMap);
        }
        ClassLoader classLoader = I.class.getClassLoader();
        D1.i.b(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = parcelableArrayList.get(i);
            D1.i.c(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
        }
        return new I(linkedHashMap);
    }

    public static final I c(C0122c c0122c) {
        S0.e eVar = f2008a;
        LinkedHashMap linkedHashMap = c0122c.f2340a;
        InterfaceC0234e interfaceC0234e = (InterfaceC0234e) linkedHashMap.get(eVar);
        if (interfaceC0234e == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        V v2 = (V) linkedHashMap.get(f2009b);
        if (v2 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f2010c);
        String str = (String) linkedHashMap.get(C0127b.f2835a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC0232c d2 = interfaceC0234e.b().d();
        M m2 = d2 instanceof M ? (M) d2 : null;
        if (m2 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = e(v2).f2015b;
        I i = (I) linkedHashMap2.get(str);
        if (i != null) {
            return i;
        }
        Class[] clsArr = I.f2000f;
        m2.c();
        Bundle bundle2 = m2.f2013c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = m2.f2013c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = m2.f2013c;
        if (bundle5 != null && bundle5.isEmpty()) {
            m2.f2013c = null;
        }
        I b2 = b(bundle3, bundle);
        linkedHashMap2.put(str, b2);
        return b2;
    }

    public static final void d(InterfaceC0234e interfaceC0234e) {
        D1.i.e(interfaceC0234e, "<this>");
        EnumC0097n enumC0097n = interfaceC0234e.d().f2048c;
        if (enumC0097n != EnumC0097n.f2039b && enumC0097n != EnumC0097n.f2040c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC0234e.b().d() == null) {
            M m2 = new M(interfaceC0234e.b(), (V) interfaceC0234e);
            interfaceC0234e.b().f("androidx.lifecycle.internal.SavedStateHandlesProvider", m2);
            interfaceC0234e.d().a(new C0230a(3, m2));
        }
    }

    public static final N e(V v2) {
        D1.i.e(v2, "<this>");
        K k2 = new K();
        U c2 = v2.c();
        AbstractC0121b a2 = v2 instanceof InterfaceC0092i ? ((InterfaceC0092i) v2).a() : C0120a.f2339b;
        D1.i.e(c2, "store");
        D1.i.e(a2, "defaultCreationExtras");
        return (N) new M0.h(c2, k2, a2).f(D1.o.a(N.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void f(View view, InterfaceC0101s interfaceC0101s) {
        D1.i.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0101s);
    }

    public static void g(C0103u c0103u, C0233d c0233d) {
        EnumC0097n enumC0097n = c0103u.f2048c;
        if (enumC0097n == EnumC0097n.f2039b || enumC0097n.compareTo(EnumC0097n.f2041d) >= 0) {
            c0233d.g();
        } else {
            c0103u.a(new C0089f(c0103u, c0233d));
        }
    }
}
