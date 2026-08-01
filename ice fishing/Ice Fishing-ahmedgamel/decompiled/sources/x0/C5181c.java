package x0;

import android.os.Bundle;
import androidx.lifecycle.C0493k;
import h.C4549i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.h;
import o.C4774b;
import o.C4775c;
import o.C4778f;

/* renamed from: x0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5181c {

    /* renamed from: b, reason: collision with root package name */
    public boolean f41751b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f41752c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41753d;

    /* renamed from: e, reason: collision with root package name */
    public C4549i f41754e;

    /* renamed from: a, reason: collision with root package name */
    public final C4778f f41750a = new C4778f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f41755f = true;

    public final Bundle a(String str) {
        if (!this.f41753d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f41752c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f41752c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f41752c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f41752c = null;
        return bundle2;
    }

    public final InterfaceC5180b b() {
        String str;
        InterfaceC5180b interfaceC5180b;
        Iterator it = this.f41750a.iterator();
        do {
            C4774b c4774b = (C4774b) it;
            if (!c4774b.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) c4774b.next();
            h.d(components, "components");
            str = (String) components.getKey();
            interfaceC5180b = (InterfaceC5180b) components.getValue();
        } while (!h.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC5180b;
    }

    public final void c(String str, InterfaceC5180b provider) {
        Object obj;
        h.e(provider, "provider");
        C4778f c4778f = this.f41750a;
        C4775c a9 = c4778f.a(str);
        if (a9 != null) {
            obj = a9.f39533u;
        } else {
            C4775c c4775c = new C4775c(str, provider);
            c4778f.f39542w++;
            C4775c c4775c2 = c4778f.f39540u;
            if (c4775c2 == null) {
                c4778f.f39539n = c4775c;
                c4778f.f39540u = c4775c;
            } else {
                c4775c2.f39534v = c4775c;
                c4775c.f39535w = c4775c2;
                c4778f.f39540u = c4775c;
            }
            obj = null;
        }
        if (((InterfaceC5180b) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f41755f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C4549i c4549i = this.f41754e;
        if (c4549i == null) {
            c4549i = new C4549i(this);
        }
        this.f41754e = c4549i;
        try {
            C0493k.class.getDeclaredConstructor(new Class[0]);
            C4549i c4549i2 = this.f41754e;
            if (c4549i2 != null) {
                ((LinkedHashSet) c4549i2.f37899b).add(C0493k.class.getName());
            }
        } catch (NoSuchMethodException e9) {
            throw new IllegalArgumentException("Class " + C0493k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e9);
        }
    }
}
