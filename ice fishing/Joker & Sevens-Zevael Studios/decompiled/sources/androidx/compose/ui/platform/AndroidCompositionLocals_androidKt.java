package androidx.compose.ui.platform;

import ac.o;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import c2.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import m0.d1;
import m0.e0;
import m0.l;
import m0.u1;
import m0.v1;
import m0.x1;
import m0.x2;
import m0.z;
import n1.a;
import oc.c;
import oc.e;
import org.fortheloss.st.R;
import pc.j;
import v0.f;
import v0.g;
import wc.i;
import y1.a1;
import y1.b1;
import y1.f0;
import y1.g0;
import y1.h0;
import y1.l0;
import y1.m;
import y1.n;
import y1.r;
import y1.y0;
import y1.z0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f602a = new e0(f0.f8508h);

    /* renamed from: b, reason: collision with root package name */
    public static final x2 f603b = new x2(f0.f8509i);

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f604c = new e0(n.f8588k);

    /* renamed from: d, reason: collision with root package name */
    public static final x2 f605d = new x2(f0.f8510j);

    /* renamed from: e, reason: collision with root package name */
    public static final x2 f606e = new x2(f0.f8511k);

    /* renamed from: f, reason: collision with root package name */
    public static final x2 f607f = new x2(f0.f8512l);

    public static final void a(r rVar, e eVar, m0.r rVar2, int i10) {
        d1 d1Var;
        boolean areAllPrimitivesSupported;
        LinkedHashMap linkedHashMap;
        boolean z10;
        rVar2.Z(-520299287);
        int i11 = (rVar2.h(rVar) ? 4 : 2) | i10 | (rVar2.h(eVar) ? 32 : 16);
        if (rVar2.P(i11 & 1, (i11 & 19) != 18)) {
            Context context = rVar.getContext();
            Object M = rVar2.M();
            Object obj = l.f4646a;
            if (M == obj) {
                M = z.s(new Configuration(context.getResources().getConfiguration()));
                rVar2.i0(M);
            }
            d1 d1Var2 = (d1) M;
            Object M2 = rVar2.M();
            if (M2 == obj) {
                M2 = new i(8, d1Var2);
                rVar2.i0(M2);
            }
            rVar.setConfigurationChangeObserver((c) M2);
            Object M3 = rVar2.M();
            if (M3 == obj) {
                M3 = new l0();
                rVar2.i0(M3);
            }
            l0 l0Var = (l0) M3;
            m viewTreeOwners = rVar.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            e4.e eVar2 = viewTreeOwners.f8583b;
            Object M4 = rVar2.M();
            if (M4 == obj) {
                Object parent = rVar.getParent();
                j.c(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = v0.e.class.getSimpleName() + ':' + str;
                x4.l b2 = eVar2.b();
                Bundle b10 = b2.b(str2);
                if (b10 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : b10.keySet()) {
                        ArrayList parcelableArrayList = b10.getParcelableArrayList(str3);
                        j.c(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                        linkedHashMap.put(str3, parcelableArrayList);
                        d1Var2 = d1Var2;
                    }
                } else {
                    linkedHashMap = null;
                }
                d1Var = d1Var2;
                n nVar = n.f8589l;
                x2 x2Var = g.f7043a;
                f fVar = new f(linkedHashMap, nVar);
                try {
                    b2.k(str2, new d.i(2, fVar));
                    z10 = true;
                } catch (IllegalArgumentException unused) {
                    z10 = false;
                }
                Object a1Var = new a1(fVar, new b1(z10, b2, str2));
                rVar2.i0(a1Var);
                M4 = a1Var;
            } else {
                d1Var = d1Var2;
            }
            Object obj2 = (a1) M4;
            boolean h10 = rVar2.h(obj2);
            Object M5 = rVar2.M();
            if (h10 || M5 == obj) {
                M5 = new i(9, obj2);
                rVar2.i0(M5);
            }
            z.d(o.f277a, (c) M5, rVar2);
            Object M6 = rVar2.M();
            if (M6 == obj) {
                if (Build.VERSION.SDK_INT >= 31) {
                    areAllPrimitivesSupported = ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
                    if (areAllPrimitivesSupported) {
                        rVar.getView();
                        M6 = new z0();
                        rVar2.i0(M6);
                    }
                }
                M6 = new z0();
                rVar2.i0(M6);
            }
            a aVar = (a) M6;
            Configuration configuration = (Configuration) d1Var.getValue();
            Object M7 = rVar2.M();
            if (M7 == obj) {
                M7 = new c2.c();
                rVar2.i0(M7);
            }
            c2.c cVar = (c2.c) M7;
            Object M8 = rVar2.M();
            Object obj3 = M8;
            if (M8 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                rVar2.i0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object M9 = rVar2.M();
            if (M9 == obj) {
                M9 = new g0(configuration3, cVar);
                rVar2.i0(M9);
            }
            g0 g0Var = (g0) M9;
            boolean h11 = rVar2.h(context);
            Object M10 = rVar2.M();
            if (h11 || M10 == obj) {
                M10 = new b0.l0(20, context, g0Var);
                rVar2.i0(M10);
            }
            z.d(cVar, (c) M10, rVar2);
            Object M11 = rVar2.M();
            if (M11 == obj) {
                M11 = new d();
                rVar2.i0(M11);
            }
            d dVar = (d) M11;
            Object M12 = rVar2.M();
            if (M12 == obj) {
                M12 = new h0(dVar);
                rVar2.i0(M12);
            }
            h0 h0Var = (h0) M12;
            boolean h12 = rVar2.h(context);
            Object M13 = rVar2.M();
            if (h12 || M13 == obj) {
                M13 = new b0.l0(21, context, h0Var);
                rVar2.i0(M13);
            }
            z.d(dVar, (c) M13, rVar2);
            u1 u1Var = y0.f8723v;
            z.b(new v1[]{f602a.a((Configuration) d1Var.getValue()), f603b.a(context), v3.a.f7208a.a(viewTreeOwners.f8582a), f4.a.f2312a.a(eVar2), g.f7043a.a(obj2), f607f.a(rVar.getView()), f605d.a(cVar), f606e.a(dVar), u1Var.a(Boolean.valueOf(((Boolean) rVar2.j(u1Var)).booleanValue() | rVar.getScrollCaptureInProgress$ui_release())), y0.f8713l.a(aVar)}, u0.e.e(1059770793, new j5.e(rVar, l0Var, eVar, 5), rVar2), rVar2, 56);
        } else {
            rVar2.S();
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new a1.f(rVar, eVar, i10, 12);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final u1 getLocalLifecycleOwner() {
        return v3.a.f7208a;
    }

    public static final u1 getLocalSavedStateRegistryOwner() {
        return f4.a.f2312a;
    }
}
