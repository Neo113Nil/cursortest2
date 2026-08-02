package io.appmetrica.analytics.impl;

import defpackage.v75;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class Ye {
    public static ArrayList a() {
        He he;
        List<String> a = R4.l().n.a();
        ArrayList arrayList = new ArrayList(v75.o(a, 10));
        for (String str : a) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleClientEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                he = new He(str, false);
            } else {
                R4.l().m().b.add((ModuleClientEntryPoint) loadAndInstantiateClassWithDefaultConstructor);
                he = new He(str, true);
            }
            arrayList.add(he);
        }
        return arrayList;
    }
}
