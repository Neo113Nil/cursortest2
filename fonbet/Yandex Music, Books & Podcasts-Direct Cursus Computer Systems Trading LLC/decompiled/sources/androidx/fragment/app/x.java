package androidx.fragment.app;

import android.util.Log;
import defpackage.tuc;
import defpackage.vz1;
import defpackage.ytc;
import defpackage.ztc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class x implements ztc {
    public final /* synthetic */ y a;

    public x(y yVar) {
        this.a = yVar;
    }

    @Override // defpackage.ztc
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean X;
        y yVar = this.a;
        ArrayList arrayList5 = yVar.o;
        if (y.M(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + yVar.a);
        }
        if (yVar.d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            X = false;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        } else {
            a aVar = (a) vz1.m(yVar.d, 1);
            yVar.h = aVar;
            Iterator it = aVar.c.iterator();
            while (it.hasNext()) {
                o oVar = ((tuc) it.next()).b;
                if (oVar != null) {
                    oVar.mTransitioning = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            X = yVar.X(arrayList3, arrayList4, null, -1, 0);
        }
        if (!arrayList5.isEmpty() && arrayList3.size() > 0) {
            boolean booleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(y.F((a) it2.next()));
            }
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                ytc ytcVar = (ytc) it3.next();
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    ytcVar.onBackStackChangeStarted((o) it4.next(), booleanValue);
                }
            }
        }
        return X;
    }
}
