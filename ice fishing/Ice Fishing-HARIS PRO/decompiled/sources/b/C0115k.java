package b;

import android.os.Bundle;
import androidx.lifecycle.C0103u;
import androidx.lifecycle.EnumC0097n;
import f0.C0143h;
import java.util.ArrayList;
import java.util.Map;
import l0.C0230a;
import l0.C0233d;
import l0.InterfaceC0232c;
import l0.InterfaceC0234e;
import o.C0313d;
import o.C0315f;

/* renamed from: b.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2298a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2299b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2300c;

    public C0115k(InterfaceC0234e interfaceC0234e) {
        this.f2299b = interfaceC0234e;
        this.f2300c = new C0233d();
    }

    public void a() {
        InterfaceC0234e interfaceC0234e = (InterfaceC0234e) this.f2299b;
        C0103u d2 = interfaceC0234e.d();
        if (d2.f2048c != EnumC0097n.f2039b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        d2.a(new C0230a(0, interfaceC0234e));
        C0233d c0233d = (C0233d) this.f2300c;
        if (c0233d.f3781a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        d2.a(new C0143h(2, c0233d));
        c0233d.f3781a = true;
        this.f2298a = true;
    }

    public void b(Bundle bundle) {
        if (!this.f2298a) {
            a();
        }
        C0103u d2 = ((InterfaceC0234e) this.f2299b).d();
        if (d2.f2048c.compareTo(EnumC0097n.f2041d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + d2.f2048c).toString());
        }
        C0233d c0233d = (C0233d) this.f2300c;
        if (!c0233d.f3781a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0233d.f3782b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0233d.e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0233d.f3782b = true;
    }

    public void c(Bundle bundle) {
        D1.i.e(bundle, "outBundle");
        C0233d c0233d = (C0233d) this.f2300c;
        c0233d.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) c0233d.e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0315f c0315f = (C0315f) c0233d.f3784d;
        c0315f.getClass();
        C0313d c0313d = new C0313d(c0315f);
        c0315f.f4126c.put(c0313d, Boolean.FALSE);
        while (c0313d.hasNext()) {
            Map.Entry entry = (Map.Entry) c0313d.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0232c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public C0115k(ExecutorC0112h executorC0112h, b1.b bVar) {
        this.f2299b = new Object();
        this.f2300c = new ArrayList();
    }
}
