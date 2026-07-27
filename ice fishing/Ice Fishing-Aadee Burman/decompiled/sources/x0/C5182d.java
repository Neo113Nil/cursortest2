package x0;

import android.os.Bundle;
import androidx.activity.C0453e;
import androidx.lifecycle.AbstractC0498p;
import androidx.lifecycle.C0505x;
import androidx.lifecycle.EnumC0497o;
import androidx.savedstate.Recreator;
import java.util.Map;
import o.C4776d;
import o.C4778f;

/* renamed from: x0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5182d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5183e f41753a;

    /* renamed from: b, reason: collision with root package name */
    public final C5181c f41754b = new C5181c();

    /* renamed from: c, reason: collision with root package name */
    public boolean f41755c;

    public C5182d(InterfaceC5183e interfaceC5183e) {
        this.f41753a = interfaceC5183e;
    }

    public final void a() {
        InterfaceC5183e interfaceC5183e = this.f41753a;
        AbstractC0498p lifecycle = interfaceC5183e.getLifecycle();
        if (((C0505x) lifecycle).f5178d != EnumC0497o.f5165u) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new Recreator(interfaceC5183e));
        C5181c c5181c = this.f41754b;
        c5181c.getClass();
        if (c5181c.f41748b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new C0453e(2, c5181c));
        c5181c.f41748b = true;
        this.f41755c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f41755c) {
            a();
        }
        C0505x c0505x = (C0505x) this.f41753a.getLifecycle();
        if (c0505x.f5178d.compareTo(EnumC0497o.f5167w) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0505x.f5178d).toString());
        }
        C5181c c5181c = this.f41754b;
        if (!c5181c.f41748b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c5181c.f41750d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c5181c.f41749c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c5181c.f41750d = true;
    }

    public final void c(Bundle bundle) {
        C5181c c5181c = this.f41754b;
        c5181c.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c5181c.f41749c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C4778f c4778f = c5181c.f41747a;
        c4778f.getClass();
        C4776d c4776d = new C4776d(c4778f);
        c4778f.f39541v.put(c4776d, Boolean.FALSE);
        while (c4776d.hasNext()) {
            Map.Entry entry = (Map.Entry) c4776d.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC5180b) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
