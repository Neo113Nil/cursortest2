package f0;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f2894b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2895a = new LinkedHashMap();

    public final void a(N n2) {
        String E2 = R.j.E(n2.getClass());
        if (E2.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f2895a;
        N n3 = (N) linkedHashMap.get(E2);
        if (D1.i.a(n3, n2)) {
            return;
        }
        boolean z2 = false;
        if (n3 != null && n3.f2893b) {
            z2 = true;
        }
        if (z2) {
            throw new IllegalStateException(("Navigator " + n2 + " is replacing an already attached " + n3).toString());
        }
        if (!n2.f2893b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + n2 + " is already attached to another NavController").toString());
    }

    public final N b(String str) {
        D1.i.e(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        N n2 = (N) this.f2895a.get(str);
        if (n2 != null) {
            return n2;
        }
        throw new IllegalStateException(D1.h.g("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
