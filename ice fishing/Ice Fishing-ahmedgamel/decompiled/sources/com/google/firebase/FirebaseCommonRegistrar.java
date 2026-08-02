package com.google.firebase;

import D0.n;
import S3.a;
import T3.j;
import T3.r;
import android.content.Context;
import android.os.Build;
import c4.C0551b;
import c4.C0553d;
import c4.e;
import c4.f;
import com.anythink.core.common.n.b.A;
import com.bumptech.glide.g;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import n4.C4773a;
import n4.b;
import u7.C5078d;

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
            g.g(cls, "Null interface");
            hashSet.add(r.a(cls));
        }
        j jVar = new j(2, 0, C4773a.class);
        if (hashSet.contains(jVar.f3192a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(jVar);
        arrayList.add(new T3.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new A(14), hashSet3));
        r rVar = new r(a.class, Executor.class);
        T3.a aVar = new T3.a(C0553d.class, new Class[]{f.class, c4.g.class});
        aVar.a(j.a(Context.class));
        aVar.a(j.a(Q3.g.class));
        aVar.a(new j(2, 0, e.class));
        aVar.a(new j(1, 1, b.class));
        aVar.a(new j(rVar, 1, 0));
        aVar.f3168z = new C0551b(rVar, 0);
        arrayList.add(aVar.b());
        arrayList.add(S0.f.i("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(S0.f.i("fire-core", "21.0.0"));
        arrayList.add(S0.f.i("device-name", a(Build.PRODUCT)));
        arrayList.add(S0.f.i("device-model", a(Build.DEVICE)));
        arrayList.add(S0.f.i("device-brand", a(Build.BRAND)));
        arrayList.add(S0.f.m("android-target-sdk", new n(9)));
        arrayList.add(S0.f.m("android-min-sdk", new n(10)));
        arrayList.add(S0.f.m("android-platform", new n(11)));
        arrayList.add(S0.f.m("android-installer", new n(12)));
        try {
            C5078d.f41047u.getClass();
            str = "2.2.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(S0.f.i("kotlin", str));
        }
        return arrayList;
    }
}
