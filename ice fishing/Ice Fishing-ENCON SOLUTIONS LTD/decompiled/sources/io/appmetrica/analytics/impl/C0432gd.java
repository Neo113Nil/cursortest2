package io.appmetrica.analytics.impl;

import h1.C0234d;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.gd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0432gd extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6076b;

    public C0432gd(X4 x4) {
        super(x4);
        String b2 = x4.b().b();
        b2 = b2 == null ? "empty" : b2;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{b2}, 1));
        LinkedHashMap a2 = C0610na.k().o().a(b2);
        ArrayList arrayList = new ArrayList(a2.size());
        for (Map.Entry entry : a2.entrySet()) {
            arrayList.add(new C0234d(entry.getValue(), new Tc(x4, (String) entry.getKey())));
        }
        this.f6076b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        if (!this.f4998a.t.c()) {
            return false;
        }
        ArrayList arrayList = this.f6076b;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0234d c0234d = (C0234d) it.next();
            ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) c0234d.f3386a;
            Tc tc = (Tc) c0234d.f3387b;
            if (moduleServiceEventHandler.handle(new Wc(tc.f5104b, tc.f5103a, new Vc(tc.f5106d, tc.f5105c, p5)), p5)) {
                return true;
            }
        }
        return false;
    }
}
