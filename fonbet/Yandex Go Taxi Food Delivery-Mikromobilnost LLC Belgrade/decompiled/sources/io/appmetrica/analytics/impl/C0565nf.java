package io.appmetrica.analytics.impl;

import defpackage.tcc;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.nf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0565nf {
    public static ArrayList a() {
        We we;
        List<String> a = V4.l().n.a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        for (String str : a) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleClientEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                we = new We(str, false);
            } else {
                V4.l().m().b.add((ModuleClientEntryPoint) loadAndInstantiateClassWithDefaultConstructor);
                we = new We(str, true);
            }
            arrayList.add(we);
        }
        return arrayList;
    }
}
