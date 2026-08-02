package androidx.fragment.app;

import android.util.Log;
import defpackage.j5r;
import defpackage.kpj;
import defpackage.ri2;
import defpackage.sr7;
import defpackage.tuc;
import defpackage.ytc;
import defpackage.z75;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class w extends kpj {
    public final /* synthetic */ y b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar) {
        super(false);
        this.b = yVar;
    }

    @Override // defpackage.kpj
    public final void handleOnBackCancelled() {
        boolean M = y.M(3);
        y yVar = this.b;
        if (M) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + yVar);
        }
        if (y.M(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + yVar.h);
        }
        a aVar = yVar.h;
        if (aVar != null) {
            aVar.u = false;
            aVar.i();
            a aVar2 = yVar.h;
            sr7 sr7Var = new sr7(17, yVar);
            if (aVar2.s == null) {
                aVar2.s = new ArrayList();
            }
            aVar2.s.add(sr7Var);
            yVar.h.j();
            yVar.i = true;
            yVar.z(true);
            yVar.E();
            yVar.i = false;
            yVar.h = null;
        }
    }

    @Override // defpackage.kpj
    public final void handleOnBackPressed() {
        boolean M = y.M(3);
        y yVar = this.b;
        if (M) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + yVar);
        }
        w wVar = yVar.j;
        ArrayList arrayList = yVar.o;
        yVar.i = true;
        yVar.z(true);
        yVar.i = false;
        if (yVar.h == null) {
            if (wVar.isEnabled()) {
                if (y.M(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                yVar.V();
                return;
            } else {
                if (y.M(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                yVar.g.d();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(y.F(yVar.h));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ytc ytcVar = (ytc) it.next();
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    ytcVar.onBackStackChangeCommitted((o) it2.next(), true);
                }
            }
        }
        Iterator it3 = yVar.h.c.iterator();
        while (it3.hasNext()) {
            o oVar = ((tuc) it3.next()).b;
            if (oVar != null) {
                oVar.mTransitioning = false;
            }
        }
        Iterator it4 = yVar.f(new ArrayList(Collections.singletonList(yVar.h)), 0, 1).iterator();
        while (it4.hasNext()) {
            h hVar = (h) it4.next();
            ArrayList arrayList2 = hVar.c;
            if (y.M(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            hVar.m(arrayList2);
            hVar.c(arrayList2);
        }
        Iterator it5 = yVar.h.c.iterator();
        while (it5.hasNext()) {
            o oVar2 = ((tuc) it5.next()).b;
            if (oVar2 != null && oVar2.mContainer == null) {
                yVar.g(oVar2).k();
            }
        }
        yVar.h = null;
        yVar.l0();
        if (y.M(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + wVar.isEnabled() + " for  FragmentManager " + yVar);
        }
    }

    @Override // defpackage.kpj
    public final void handleOnBackProgressed(ri2 ri2Var) {
        boolean M = y.M(2);
        y yVar = this.b;
        if (M) {
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + yVar);
        }
        if (yVar.h != null) {
            Iterator it = yVar.f(new ArrayList(Collections.singletonList(yVar.h)), 0, 1).iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                hVar.getClass();
                ri2Var.getClass();
                if (y.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + ri2Var.c);
                }
                ArrayList arrayList = hVar.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    z75.t(arrayList2, ((f0) it2.next()).k);
                }
                List w0 = CollectionsKt.w0(CollectionsKt.A0(arrayList2));
                int size = w0.size();
                for (int i = 0; i < size; i++) {
                    ((j5r) w0.get(i)).d(ri2Var, hVar.a);
                }
            }
            Iterator it3 = yVar.o.iterator();
            while (it3.hasNext()) {
                ((ytc) it3.next()).onBackStackChangeProgressed(ri2Var);
            }
        }
    }

    @Override // defpackage.kpj
    public final void handleOnBackStarted(ri2 ri2Var) {
        boolean M = y.M(3);
        y yVar = this.b;
        if (M) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + yVar);
        }
        yVar.w();
        yVar.x(new x(yVar), false);
    }
}
