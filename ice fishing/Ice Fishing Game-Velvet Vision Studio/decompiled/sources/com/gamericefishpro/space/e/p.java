package com.gamericefishpro.space.e;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d.t;
import com.gamericefishpro.space.i2.j0;
import com.gamericefishpro.space.t0.a0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static final a0 a = new a0(new com.gamericefishpro.space.a5.h(11));

    public static t a(com.gamericefishpro.space.t0.r rVar) {
        t tVar = (t) rVar.j(a);
        Object obj = null;
        if (tVar == null) {
            rVar.a0(1208426157);
            View view = (View) rVar.j(j0.f);
            Intrinsics.checkNotNullParameter(view, "<this>");
            while (true) {
                if (view == null) {
                    tVar = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                t tVar2 = tag instanceof t ? (t) tag : null;
                if (tVar2 != null) {
                    tVar = tVar2;
                    break;
                }
                Object objB = com.gamericefishpro.space.hj.c.B(view);
                view = objB instanceof View ? (View) objB : null;
            }
            rVar.p(false);
        } else {
            rVar.a0(1208423708);
            rVar.p(false);
        }
        if (tVar != null) {
            rVar.a0(1208423789);
            rVar.p(false);
            return tVar;
        }
        rVar.a0(1208428160);
        for (Context baseContext = (Context) rVar.j(j0.b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof t) {
                obj = baseContext;
                break;
            }
        }
        t tVar3 = (t) obj;
        rVar.p(false);
        return tVar3;
    }
}
