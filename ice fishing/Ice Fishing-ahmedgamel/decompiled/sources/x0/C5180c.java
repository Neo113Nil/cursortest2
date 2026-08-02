package x0;

import android.os.Bundle;
import androidx.lifecycle.C0497k;
import h.C4553i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.h;
import o.C4790b;
import o.C4791c;
import o.C4794f;

/* renamed from: x0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5180c {

    /* renamed from: b, reason: collision with root package name */
    public boolean f41806b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f41807c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41808d;

    /* renamed from: e, reason: collision with root package name */
    public C4553i f41809e;

    /* renamed from: a, reason: collision with root package name */
    public final C4794f f41805a = new C4794f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f41810f = true;

    public final Bundle a(String str) {
        if (!this.f41808d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f41807c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f41807c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f41807c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f41807c = null;
        return bundle2;
    }

    public final InterfaceC5179b b() {
        String str;
        InterfaceC5179b interfaceC5179b;
        Iterator it = this.f41805a.iterator();
        do {
            C4790b c4790b = (C4790b) it;
            if (!c4790b.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) c4790b.next();
            h.d(components, "components");
            str = (String) components.getKey();
            interfaceC5179b = (InterfaceC5179b) components.getValue();
        } while (!h.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC5179b;
    }

    public final void c(String str, InterfaceC5179b provider) {
        Object obj;
        h.e(provider, "provider");
        C4794f c4794f = this.f41805a;
        C4791c a9 = c4794f.a(str);
        if (a9 != null) {
            obj = a9.f39700u;
        } else {
            C4791c c4791c = new C4791c(str, provider);
            c4794f.f39709w++;
            C4791c c4791c2 = c4794f.f39707u;
            if (c4791c2 == null) {
                c4794f.f39706n = c4791c;
                c4794f.f39707u = c4791c;
            } else {
                c4791c2.f39701v = c4791c;
                c4791c.f39702w = c4791c2;
                c4794f.f39707u = c4791c;
            }
            obj = null;
        }
        if (((InterfaceC5179b) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f41810f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C4553i c4553i = this.f41809e;
        if (c4553i == null) {
            c4553i = new C4553i(this);
        }
        this.f41809e = c4553i;
        try {
            C0497k.class.getDeclaredConstructor(new Class[0]);
            C4553i c4553i2 = this.f41809e;
            if (c4553i2 != null) {
                ((LinkedHashSet) c4553i2.f37925b).add(C0497k.class.getName());
            }
        } catch (NoSuchMethodException e9) {
            throw new IllegalArgumentException("Class " + C0497k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e9);
        }
    }
}
