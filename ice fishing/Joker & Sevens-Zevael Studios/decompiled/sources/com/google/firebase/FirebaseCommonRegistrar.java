package com.google.firebase;

import android.content.Context;
import android.os.Build;
import bc.a0;
import com.google.firebase.components.ComponentRegistrar;
import d6.f;
import f8.a;
import f8.b;
import i7.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import l7.j;
import l7.r;
import u7.c;
import u7.d;
import u7.e;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(b.class));
        for (Class cls : new Class[0]) {
            i7.b.p(cls, "Null interface");
            hashSet.add(r.a(cls));
        }
        j jVar = new j(2, 0, a.class);
        if (hashSet.contains(jVar.f4236a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(jVar);
        arrayList.add(new l7.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new f(7), hashSet3));
        r rVar = new r(k7.a.class, Executor.class);
        l7.a aVar = new l7.a(c.class, new Class[]{e.class, u7.f.class});
        aVar.a(j.a(Context.class));
        aVar.a(j.a(g.class));
        aVar.a(new j(2, 0, d.class));
        aVar.a(new j(1, 1, b.class));
        aVar.a(new j(rVar, 1, 0));
        aVar.f4212g = new c6.f(12, rVar);
        arrayList.add(aVar.c());
        arrayList.add(a0.g("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(a0.g("fire-core", "20.4.2"));
        arrayList.add(a0.g("device-name", a(Build.PRODUCT)));
        arrayList.add(a0.g("device-model", a(Build.DEVICE)));
        arrayList.add(a0.g("device-brand", a(Build.BRAND)));
        arrayList.add(a0.m("android-target-sdk", new f(17)));
        arrayList.add(a0.m("android-min-sdk", new f(18)));
        arrayList.add(a0.m("android-platform", new f(19)));
        arrayList.add(a0.m("android-installer", new f(20)));
        try {
            ac.e.f267h.getClass();
            str = "2.0.21";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(a0.g("kotlin", str));
        }
        return arrayList;
    }
}
