package com.google.firebase;

import B1.w;
import M3.a;
import N3.j;
import N3.r;
import W3.d;
import W3.e;
import W3.f;
import W3.g;
import Z5.c;
import android.content.Context;
import android.os.Build;
import com.anythink.core.common.n.b.A;
import com.google.firebase.components.ComponentRegistrar;
import h4.C4568a;
import h4.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import q7.C4935d;

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
            c.b(cls, "Null interface");
            hashSet.add(r.a(cls));
        }
        j jVar = new j(2, 0, C4568a.class);
        if (hashSet.contains(jVar.f2177a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(jVar);
        arrayList.add(new N3.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new A(13), hashSet3));
        r rVar = new r(a.class, Executor.class);
        N3.a aVar = new N3.a(d.class, new Class[]{f.class, g.class});
        aVar.b(j.a(Context.class));
        aVar.b(j.a(K3.g.class));
        aVar.b(new j(2, 0, e.class));
        aVar.b(new j(1, 1, b.class));
        aVar.b(new j(rVar, 1, 0));
        aVar.f2153z = new W3.b(rVar, 0);
        arrayList.add(aVar.c());
        arrayList.add(com.bumptech.glide.d.g("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(com.bumptech.glide.d.g("fire-core", "21.0.0"));
        arrayList.add(com.bumptech.glide.d.g("device-name", a(Build.PRODUCT)));
        arrayList.add(com.bumptech.glide.d.g("device-model", a(Build.DEVICE)));
        arrayList.add(com.bumptech.glide.d.g("device-brand", a(Build.BRAND)));
        arrayList.add(com.bumptech.glide.d.m("android-target-sdk", new w(7)));
        arrayList.add(com.bumptech.glide.d.m("android-min-sdk", new w(8)));
        arrayList.add(com.bumptech.glide.d.m("android-platform", new w(9)));
        arrayList.add(com.bumptech.glide.d.m("android-installer", new w(10)));
        try {
            C4935d.f40157u.getClass();
            str = "2.2.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(com.bumptech.glide.d.g("kotlin", str));
        }
        return arrayList;
    }
}
