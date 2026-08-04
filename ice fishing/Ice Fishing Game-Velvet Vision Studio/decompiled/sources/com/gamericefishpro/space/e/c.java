package com.gamericefishpro.space.e;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h0.h0;
import com.gamericefishpro.space.h0.m0;
import com.gamericefishpro.space.h0.x;
import com.gamericefishpro.space.h0.z0;
import com.gamericefishpro.space.i2.d1;
import com.gamericefishpro.space.i2.p2;
import com.gamericefishpro.space.t0.f0;
import com.gamericefishpro.space.w.l1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.gamericefishpro.space.t0.f0
    public final void a() {
        Object parcelable;
        Integer num;
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.h.d dVar = ((a) this.b).a;
                if (dVar == null) {
                    throw new IllegalStateException("Launcher has not been initialized");
                }
                com.gamericefishpro.space.d.j jVar = dVar.g;
                String key = dVar.h;
                Bundle bundle = jVar.g;
                LinkedHashMap linkedHashMap = jVar.f;
                Intrinsics.checkNotNullParameter(key, "key");
                if (!jVar.d.contains(key) && (num = (Integer) jVar.b.remove(key)) != null) {
                    jVar.a.remove(num);
                }
                jVar.e.remove(key);
                if (linkedHashMap.containsKey(key)) {
                    StringBuilder sbL = com.gamericefishpro.space.m5.a.l("Dropping pending result for request ", key, ": ");
                    sbL.append(linkedHashMap.get(key));
                    Log.w("ActivityResultRegistry", sbL.toString());
                    linkedHashMap.remove(key);
                }
                if (bundle.containsKey(key)) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        parcelable = com.gamericefishpro.space.e4.e.a(key, bundle);
                    } else {
                        parcelable = bundle.getParcelable(key);
                        if (!com.gamericefishpro.space.h.b.class.isInstance(parcelable)) {
                            parcelable = null;
                        }
                    }
                    Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((com.gamericefishpro.space.h.b) parcelable));
                    bundle.remove(key);
                }
                if (jVar.c.get(key) != null) {
                    throw new ClassCastException();
                }
                return;
            case 1:
                com.gamericefishpro.space.g3.q qVar = (com.gamericefishpro.space.g3.q) this.b;
                qVar.dismiss();
                com.gamericefishpro.space.g3.n nVar = qVar.A;
                p2 p2Var = nVar.i;
                if (p2Var != null) {
                    p2Var.a();
                }
                nVar.i = null;
                nVar.requestLayout();
                return;
            case 2:
                ((x) this.b).d = null;
                return;
            case 3:
                m0 m0Var = (m0) this.b;
                z0 z0Var = m0Var.c;
                if (z0Var != null) {
                    z0Var.a = false;
                }
                m0Var.c = null;
                return;
            case 4:
                ((h0) this.b).f = true;
                return;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                ((d1) this.b).e.invoke();
                return;
            default:
                l1 l1Var = (l1) this.b;
                l1Var.i();
                l1Var.a.q();
                return;
        }
    }
}
