package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.sd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0742sd {
    public static ArrayList a() {
        C0303bd c0303bd;
        List<String> a2 = C0294b4.l().f5594m.a();
        ArrayList arrayList = new ArrayList(i1.k.E(a2));
        for (String str : a2) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleClientEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                c0303bd = new C0303bd(str, false);
            } else {
                C0294b4.l().m().f5412b.add((ModuleClientEntryPoint) loadAndInstantiateClassWithDefaultConstructor);
                c0303bd = new C0303bd(str, true);
            }
            arrayList.add(c0303bd);
        }
        return arrayList;
    }
}
