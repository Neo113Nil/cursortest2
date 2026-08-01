package f0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0103u;
import androidx.lifecycle.EnumC0097n;
import androidx.lifecycle.InterfaceC0092i;
import androidx.lifecycle.InterfaceC0101s;
import androidx.lifecycle.S;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import b.C0115k;
import c0.C0122c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import l0.C0233d;
import l0.InterfaceC0234e;

/* renamed from: f0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141f implements InterfaceC0101s, V, InterfaceC0092i, InterfaceC0234e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2919a;

    /* renamed from: b, reason: collision with root package name */
    public w f2920b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f2921c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC0097n f2922d;
    public final C0150o e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2923f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f2924g;

    /* renamed from: h, reason: collision with root package name */
    public final C0103u f2925h = new C0103u(this);
    public final C0115k i = new C0115k(this);
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public EnumC0097n f2926k;

    public C0141f(Context context, w wVar, Bundle bundle, EnumC0097n enumC0097n, C0150o c0150o, String str, Bundle bundle2) {
        this.f2919a = context;
        this.f2920b = wVar;
        this.f2921c = bundle;
        this.f2922d = enumC0097n;
        this.e = c0150o;
        this.f2923f = str;
        this.f2924g = bundle2;
        t1.h hVar = new t1.h(new J1.j(2, this));
        this.f2926k = EnumC0097n.f2039b;
    }

    @Override // androidx.lifecycle.InterfaceC0092i
    public final C0122c a() {
        C0122c c0122c = new C0122c(0);
        Context applicationContext = this.f2919a.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = c0122c.f2340a;
        if (application != null) {
            linkedHashMap.put(S.f2023f, application);
        }
        linkedHashMap.put(androidx.lifecycle.L.f2008a, this);
        linkedHashMap.put(androidx.lifecycle.L.f2009b, this);
        Bundle e = e();
        if (e != null) {
            linkedHashMap.put(androidx.lifecycle.L.f2010c, e);
        }
        return c0122c;
    }

    @Override // l0.InterfaceC0234e
    public final C0233d b() {
        return (C0233d) this.i.f2300c;
    }

    @Override // androidx.lifecycle.V
    public final U c() {
        if (!this.j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f2925h.f2048c == EnumC0097n.f2038a) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        C0150o c0150o = this.e;
        if (c0150o == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = this.f2923f;
        D1.i.e(str, "backStackEntryId");
        LinkedHashMap linkedHashMap = c0150o.f2957b;
        U u2 = (U) linkedHashMap.get(str);
        if (u2 != null) {
            return u2;
        }
        U u3 = new U();
        linkedHashMap.put(str, u3);
        return u3;
    }

    @Override // androidx.lifecycle.InterfaceC0101s
    public final C0103u d() {
        return this.f2925h;
    }

    public final Bundle e() {
        Bundle bundle = this.f2921c;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj == null || !(obj instanceof C0141f)) {
            return false;
        }
        C0141f c0141f = (C0141f) obj;
        if (!D1.i.a(this.f2923f, c0141f.f2923f) || !D1.i.a(this.f2920b, c0141f.f2920b) || !D1.i.a(this.f2925h, c0141f.f2925h) || !D1.i.a((C0233d) this.i.f2300c, (C0233d) c0141f.i.f2300c)) {
            return false;
        }
        Bundle bundle = this.f2921c;
        Bundle bundle2 = c0141f.f2921c;
        if (!D1.i.a(bundle, bundle2)) {
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            if (!keySet.isEmpty()) {
                for (String str : keySet) {
                    if (!D1.i.a(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final void f(EnumC0097n enumC0097n) {
        D1.i.e(enumC0097n, "maxState");
        this.f2926k = enumC0097n;
        g();
    }

    public final void g() {
        if (!this.j) {
            C0115k c0115k = this.i;
            c0115k.a();
            this.j = true;
            if (this.e != null) {
                androidx.lifecycle.L.d(this);
            }
            c0115k.b(this.f2924g);
        }
        int ordinal = this.f2922d.ordinal();
        int ordinal2 = this.f2926k.ordinal();
        C0103u c0103u = this.f2925h;
        if (ordinal < ordinal2) {
            c0103u.g(this.f2922d);
        } else {
            c0103u.g(this.f2926k);
        }
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f2920b.hashCode() + (this.f2923f.hashCode() * 31);
        Bundle bundle = this.f2921c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return ((C0233d) this.i.f2300c).hashCode() + ((this.f2925h.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0141f.class.getSimpleName());
        sb.append("(" + this.f2923f + ')');
        sb.append(" destination=");
        sb.append(this.f2920b);
        String sb2 = sb.toString();
        D1.i.d(sb2, "sb.toString()");
        return sb2;
    }
}
