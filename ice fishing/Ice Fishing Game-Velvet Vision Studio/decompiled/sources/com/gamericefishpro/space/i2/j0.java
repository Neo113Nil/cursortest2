package com.gamericefishpro.space.i2;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.t0.t2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    public static final com.gamericefishpro.space.t0.a0 a = new com.gamericefishpro.space.t0.a0(g0.e);
    public static final t2 b = new t2(g0.i);
    public static final com.gamericefishpro.space.t0.a0 c = new com.gamericefishpro.space.t0.a0(p.v);
    public static final t2 d = new t2(g0.v);
    public static final t2 e = new t2(g0.w);
    public static final t2 f = new t2(g0.y);

    public static final void a(t tVar, Function2 function2, com.gamericefishpro.space.t0.r rVar, int i) {
        LinkedHashMap linkedHashMap;
        boolean z;
        rVar.b0(-520299287);
        int i2 = (rVar.h(tVar) ? 4 : 2) | i | (rVar.h(function2) ? 32 : 16);
        if (rVar.S(i2 & 1, (i2 & 19) != 18)) {
            Context context = tVar.getContext();
            Object objP = rVar.P();
            Object obj = com.gamericefishpro.space.t0.n.a;
            if (objP == obj) {
                objP = new o0();
                rVar.k0(objP);
            }
            o0 o0Var = (o0) objP;
            l viewTreeOwners = tVar.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            com.gamericefishpro.space.z5.e eVar = viewTreeOwners.b;
            Object objP2 = rVar.P();
            if (objP2 == obj) {
                Object parent = tVar.getParent();
                Intrinsics.c(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = com.gamericefishpro.space.e1.f.class.getSimpleName() + ':' + strValueOf;
                com.gamericefishpro.space.u6.s sVarB = eVar.b();
                Bundle bundleF = sVarB.f(str);
                if (bundleF != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleF.keySet()) {
                        ArrayList parcelableArrayList = bundleF.getParcelableArrayList(str2);
                        Intrinsics.c(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                } else {
                    linkedHashMap = null;
                }
                p pVar = p.w;
                t2 t2Var = com.gamericefishpro.space.e1.h.a;
                com.gamericefishpro.space.e1.g gVar = new com.gamericefishpro.space.e1.g(linkedHashMap, pVar);
                try {
                    sVarB.l(str, new com.gamericefishpro.space.b5.a(2, gVar));
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                Object d1Var = new d1(gVar, new e1(z, sVarB, str));
                rVar.k0(d1Var);
                objP2 = d1Var;
            }
            Object obj2 = (d1) objP2;
            Unit unit = Unit.a;
            boolean zH = rVar.h(obj2);
            Object objP3 = rVar.P();
            if (zH || objP3 == obj) {
                objP3 = new com.gamericefishpro.space.b2.d0(9, obj2);
                rVar.k0(objP3);
            }
            com.gamericefishpro.space.t0.i.d(unit, (Function1) objP3, rVar);
            Object objP4 = rVar.P();
            if (objP4 == obj) {
                if (Build.VERSION.SDK_INT < 31 || !((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2)) {
                    objP4 = new c1();
                } else {
                    tVar.getView();
                    objP4 = new c1();
                }
                rVar.k0(objP4);
            }
            com.gamericefishpro.space.w1.a aVar = (com.gamericefishpro.space.w1.a) objP4;
            Configuration configuration = tVar.getConfiguration();
            Object objP5 = rVar.P();
            if (objP5 == obj) {
                objP5 = new com.gamericefishpro.space.m2.c();
                rVar.k0(objP5);
            }
            com.gamericefishpro.space.m2.c cVar = (com.gamericefishpro.space.m2.c) objP5;
            Object objP6 = rVar.P();
            Object obj3 = objP6;
            if (objP6 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                rVar.k0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object objP7 = rVar.P();
            if (objP7 == obj) {
                objP7 = new h0(configuration3, cVar);
                rVar.k0(objP7);
            }
            h0 h0Var = (h0) objP7;
            boolean zH2 = rVar.h(context);
            Object objP8 = rVar.P();
            if (zH2 || objP8 == obj) {
                objP8 = new com.gamericefishpro.space.b2.t(3, context, h0Var);
                rVar.k0(objP8);
            }
            com.gamericefishpro.space.t0.i.d(cVar, (Function1) objP8, rVar);
            Object objP9 = rVar.P();
            if (objP9 == obj) {
                objP9 = new com.gamericefishpro.space.m2.d();
                rVar.k0(objP9);
            }
            com.gamericefishpro.space.m2.d dVar = (com.gamericefishpro.space.m2.d) objP9;
            Object objP10 = rVar.P();
            if (objP10 == obj) {
                objP10 = new i0(dVar);
                rVar.k0(objP10);
            }
            i0 i0Var = (i0) objP10;
            boolean zH3 = rVar.h(context);
            Object objP11 = rVar.P();
            if (zH3 || objP11 == obj) {
                objP11 = new com.gamericefishpro.space.b2.t(4, context, i0Var);
                rVar.k0(objP11);
            }
            com.gamericefishpro.space.t0.i.d(dVar, (Function1) objP11, rVar);
            com.gamericefishpro.space.t0.o1 o1Var = b1.v;
            com.gamericefishpro.space.t0.i.b(new com.gamericefishpro.space.n.p[]{a.a(tVar.getConfiguration()), b.a(context), com.gamericefishpro.space.a5.i.a.a(viewTreeOwners.a), com.gamericefishpro.space.a6.a.a.a(eVar), com.gamericefishpro.space.e1.h.a.a(obj2), f.a(tVar.getView()), d.a(cVar), e.a(dVar), o1Var.a(Boolean.valueOf(((Boolean) rVar.j(o1Var)).booleanValue() | tVar.getScrollCaptureInProgress$ui())), b1.l.a(aVar)}, com.gamericefishpro.space.b1.n.c(1059770793, new com.gamericefishpro.space.f3.l(tVar, o0Var, function2), rVar), rVar, 56);
        } else {
            rVar.V();
        }
        com.gamericefishpro.space.t0.p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.f2.g0(tVar, function2, i);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
