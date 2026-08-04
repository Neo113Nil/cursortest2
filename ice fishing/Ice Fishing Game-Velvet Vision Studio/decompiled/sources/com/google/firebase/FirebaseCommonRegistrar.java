package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.gamericefishpro.space.bb.a;
import com.gamericefishpro.space.bb.b;
import com.gamericefishpro.space.bb.l;
import com.gamericefishpro.space.bb.v;
import com.gamericefishpro.space.lb.d;
import com.gamericefishpro.space.lb.e;
import com.gamericefishpro.space.lb.f;
import com.gamericefishpro.space.lb.g;
import com.gamericefishpro.space.tb.j;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        a aVarB = b.b(com.gamericefishpro.space.vb.b.class);
        aVarB.a(new l(2, 0, com.gamericefishpro.space.vb.a.class));
        aVarB.g = new j(4);
        arrayList.add(aVarB.c());
        v vVar = new v(com.gamericefishpro.space.ab.a.class, Executor.class);
        a aVar = new a(d.class, new Class[]{f.class, g.class});
        aVar.a(l.a(Context.class));
        aVar.a(l.a(com.gamericefishpro.space.wa.g.class));
        aVar.a(new l(2, 0, e.class));
        aVar.a(new l(1, 1, com.gamericefishpro.space.vb.b.class));
        aVar.a(new l(vVar, 1, 0));
        aVar.g = new com.gamericefishpro.space.lb.b(vVar, 0);
        arrayList.add(aVar.c());
        arrayList.add(com.gamericefishpro.space.wa.b.p("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(com.gamericefishpro.space.wa.b.p("fire-core", "22.0.1"));
        arrayList.add(com.gamericefishpro.space.wa.b.p("device-name", a(Build.PRODUCT)));
        arrayList.add(com.gamericefishpro.space.wa.b.p("device-model", a(Build.DEVICE)));
        arrayList.add(com.gamericefishpro.space.wa.b.p("device-brand", a(Build.BRAND)));
        arrayList.add(com.gamericefishpro.space.wa.b.u("android-target-sdk", new j(6)));
        arrayList.add(com.gamericefishpro.space.wa.b.u("android-min-sdk", new j(7)));
        arrayList.add(com.gamericefishpro.space.wa.b.u("android-platform", new j(8)));
        arrayList.add(com.gamericefishpro.space.wa.b.u("android-installer", new j(9)));
        try {
            com.gamericefishpro.space.oh.g.i.getClass();
            str = "2.1.21";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(com.gamericefishpro.space.wa.b.p("kotlin", str));
        }
        return arrayList;
    }
}
