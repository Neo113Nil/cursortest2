package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: b, reason: collision with root package name */
    public static final m6.i f732b = new m6.i(5);

    /* renamed from: a, reason: collision with root package name */
    public final Object f733a;

    public x0() {
        this.f733a = new LinkedHashMap();
    }

    public void a() {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f733a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((t0) it.next()).b();
        }
        linkedHashMap.clear();
    }

    public t0 b(pc.e eVar) {
        x4.i iVar = (x4.i) this.f733a;
        String b2 = eVar.b();
        if (b2 != null) {
            return iVar.e(eVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public x0(x0 x0Var, v0 v0Var, x3.b bVar) {
        pc.j.e(x0Var, "store");
        pc.j.e(bVar, "defaultCreationExtras");
        pc.j.e(x0Var, "store");
        pc.j.e(bVar, "defaultExtras");
        x4.i iVar = new x4.i();
        iVar.f8303a = x0Var;
        iVar.f8304b = v0Var;
        iVar.f8305c = bVar;
        iVar.f8306d = new z3.c();
        this.f733a = iVar;
    }

    public x0(f0 f0Var) {
        this.f733a = f0Var;
    }
}
