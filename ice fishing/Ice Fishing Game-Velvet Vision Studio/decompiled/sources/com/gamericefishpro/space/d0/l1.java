package com.gamericefishpro.space.d0;

import android.content.Context;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.t0.s2;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements com.gamericefishpro.space.t0.f0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.gamericefishpro.space.t0.f0
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                m1 m1Var = (m1) obj2;
                View view = (View) obj;
                int i2 = m1Var.t - 1;
                m1Var.t = i2;
                if (i2 == 0) {
                    Field field = com.gamericefishpro.space.d4.l0.a;
                    com.gamericefishpro.space.d4.d0.i(view, null);
                    com.gamericefishpro.space.d4.l0.n(view, null);
                    view.removeOnAttachStateChangeListener(m1Var.u);
                }
                break;
            case 1:
                ((com.gamericefishpro.space.f.c) obj2).b((com.gamericefishpro.space.e.j) obj);
                break;
            case 2:
                ((com.gamericefishpro.space.f.c) obj2).b((com.gamericefishpro.space.e.m) obj);
                break;
            case 3:
                ((com.gamericefishpro.space.f5.k) obj2).A.j.f((com.gamericefishpro.space.g5.l) obj);
                break;
            case 4:
                Iterator it = ((List) ((s2) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((com.gamericefishpro.space.g5.i) obj).b().c((com.gamericefishpro.space.f5.k) it.next());
                }
                break;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                ((com.gamericefishpro.space.h0.v0) obj2).i.k(obj);
                break;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((com.gamericefishpro.space.i2.h0) obj);
                break;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((com.gamericefishpro.space.i2.i0) obj);
                break;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                ((com.gamericefishpro.space.z4.u) obj2).g().f((com.gamericefishpro.space.d.d) obj);
                break;
            case 9:
                ((com.gamericefishpro.space.w.b0) obj2).a.k((com.gamericefishpro.space.w.z) obj);
                break;
            case 10:
                ((com.gamericefishpro.space.w.l1) obj2).j.remove((com.gamericefishpro.space.w.l1) obj);
                break;
            default:
                com.gamericefishpro.space.w.l1 l1Var = (com.gamericefishpro.space.w.l1) obj2;
                l1Var.getClass();
                com.gamericefishpro.space.w.e1 e1Var = (com.gamericefishpro.space.w.e1) ((com.gamericefishpro.space.w.f1) obj).b.getValue();
                if (e1Var != null) {
                    l1Var.i.remove(e1Var.d);
                }
                break;
        }
    }
}
