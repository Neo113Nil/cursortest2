package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import l0.C0233d;
import l0.InterfaceC0232c;

/* loaded from: classes.dex */
public final class M implements InterfaceC0232c {

    /* renamed from: a, reason: collision with root package name */
    public final C0233d f2011a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2012b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f2013c;

    /* renamed from: d, reason: collision with root package name */
    public final t1.h f2014d;

    public M(C0233d c0233d, V v2) {
        D1.i.e(c0233d, "savedStateRegistry");
        D1.i.e(v2, "viewModelStoreOwner");
        this.f2011a = c0233d;
        this.f2014d = new t1.h(new J1.j(1, v2));
    }

    @Override // l0.InterfaceC0232c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2013c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : b().f2015b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a2 = ((I) entry.getValue()).e.a();
            if (!D1.i.a(a2, Bundle.EMPTY)) {
                bundle.putBundle(str, a2);
            }
        }
        this.f2012b = false;
        return bundle;
    }

    public final N b() {
        return (N) this.f2014d.getValue();
    }

    public final void c() {
        if (this.f2012b) {
            return;
        }
        Bundle c2 = this.f2011a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2013c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (c2 != null) {
            bundle.putAll(c2);
        }
        this.f2013c = bundle;
        this.f2012b = true;
        b();
    }
}
