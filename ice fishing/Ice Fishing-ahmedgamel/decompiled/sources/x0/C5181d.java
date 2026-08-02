package x0;

import android.os.Bundle;
import androidx.activity.C0457e;
import androidx.lifecycle.AbstractC0502p;
import androidx.lifecycle.C0509x;
import androidx.lifecycle.EnumC0501o;
import androidx.savedstate.Recreator;
import java.util.Map;
import o.C4792d;
import o.C4794f;

/* renamed from: x0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5181d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5182e f41811a;

    /* renamed from: b, reason: collision with root package name */
    public final C5180c f41812b = new C5180c();

    /* renamed from: c, reason: collision with root package name */
    public boolean f41813c;

    public C5181d(InterfaceC5182e interfaceC5182e) {
        this.f41811a = interfaceC5182e;
    }

    public final void a() {
        InterfaceC5182e interfaceC5182e = this.f41811a;
        AbstractC0502p lifecycle = interfaceC5182e.getLifecycle();
        if (((C0509x) lifecycle).f5145d != EnumC0501o.f5132u) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new Recreator(interfaceC5182e));
        C5180c c5180c = this.f41812b;
        c5180c.getClass();
        if (c5180c.f41806b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new C0457e(2, c5180c));
        c5180c.f41806b = true;
        this.f41813c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f41813c) {
            a();
        }
        C0509x c0509x = (C0509x) this.f41811a.getLifecycle();
        if (c0509x.f5145d.compareTo(EnumC0501o.f5134w) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0509x.f5145d).toString());
        }
        C5180c c5180c = this.f41812b;
        if (!c5180c.f41806b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c5180c.f41808d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c5180c.f41807c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c5180c.f41808d = true;
    }

    public final void c(Bundle bundle) {
        C5180c c5180c = this.f41812b;
        c5180c.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c5180c.f41807c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C4794f c4794f = c5180c.f41805a;
        c4794f.getClass();
        C4792d c4792d = new C4792d(c4794f);
        c4794f.f39708v.put(c4792d, Boolean.FALSE);
        while (c4792d.hasNext()) {
            Map.Entry entry = (Map.Entry) c4792d.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC5179b) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
