package com.google.firebase;

import B1.x;
import Q3.a;
import R3.j;
import R3.r;
import X2.e;
import a4.C0434b;
import a4.C0436d;
import a4.g;
import android.content.Context;
import android.os.Build;
import com.bumptech.glide.h;
import com.google.firebase.components.ComponentRegistrar;
import d4.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import l4.C4664a;
import l4.b;
import u7.C5086d;

/* loaded from: classes2.dex */
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
            e.z(cls, "Null interface");
            hashSet.add(r.a(cls));
        }
        j jVar = new j(2, 0, C4664a.class);
        if (hashSet.contains(jVar.f2737a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(jVar);
        arrayList.add(new R3.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new f(13), hashSet3));
        r rVar = new r(a.class, Executor.class);
        R3.a aVar = new R3.a(C0436d.class, new Class[]{a4.f.class, g.class});
        aVar.a(j.a(Context.class));
        aVar.a(j.a(O3.g.class));
        aVar.a(new j(2, 0, a4.e.class));
        aVar.a(new j(1, 1, b.class));
        aVar.a(new j(rVar, 1, 0));
        aVar.f2713z = new C0434b(rVar, 0);
        arrayList.add(aVar.b());
        arrayList.add(h.e("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(h.e("fire-core", "21.0.0"));
        arrayList.add(h.e("device-name", a(Build.PRODUCT)));
        arrayList.add(h.e("device-model", a(Build.DEVICE)));
        arrayList.add(h.e("device-brand", a(Build.BRAND)));
        arrayList.add(h.f("android-target-sdk", new x(9)));
        arrayList.add(h.f("android-min-sdk", new x(10)));
        arrayList.add(h.f("android-platform", new x(11)));
        arrayList.add(h.f("android-installer", new x(12)));
        try {
            C5086d.f41327u.getClass();
            str = "2.2.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(h.e("kotlin", str));
        }
        return arrayList;
    }
}
