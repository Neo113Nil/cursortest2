package com.gamericefishpro.space.k5;

import android.view.View;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.a5.h;
import com.gamericefishpro.space.i2.j0;
import com.gamericefishpro.space.j5.c;
import com.gamericefishpro.space.t0.a0;
import com.gamericefishpro.space.t0.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final a0 a = new a0(new h(23));

    public static c a(r rVar) {
        c cVar;
        c cVar2 = (c) rVar.j(a);
        if (cVar2 != null) {
            rVar.a0(950834231);
            rVar.p(false);
            return cVar2;
        }
        rVar.a0(950836184);
        View view = (View) rVar.j(j0.f);
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (true) {
            cVar = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
            c cVar3 = tag instanceof c ? (c) tag : null;
            if (cVar3 != null) {
                cVar = cVar3;
                break;
            }
            Object objB = com.gamericefishpro.space.hj.c.B(view);
            view = objB instanceof View ? (View) objB : null;
        }
        rVar.p(false);
        return cVar;
    }
}
