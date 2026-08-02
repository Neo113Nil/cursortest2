package defpackage;

import android.util.ArrayMap;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class r38 {
    public final HashSet a;
    public yy40 b;
    public int c;
    public boolean d;
    public final ArrayList e;
    public boolean f;
    public final rz40 g;
    public ap7 h;

    public r38(s38 s38Var) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = yy40.b();
        this.c = -1;
        this.d = false;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f = false;
        this.g = new rz40(new ArrayMap());
        hashSet.addAll(s38Var.a);
        this.b = yy40.p(s38Var.b);
        this.c = s38Var.c;
        arrayList.addAll(s38Var.e);
        this.f = s38Var.f;
        q6x0 q6x0Var = s38Var.g;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : q6x0Var.a.keySet()) {
            arrayMap.put(str, q6x0Var.a.get(str));
        }
        this.g = new rz40(arrayMap);
        this.d = s38Var.d;
    }

    public final void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b((uo7) it.next());
        }
    }

    public final void b(uo7 uo7Var) {
        ArrayList arrayList = this.e;
        if (arrayList.contains(uo7Var)) {
            return;
        }
        arrayList.add(uo7Var);
    }

    public final void c(szd szdVar) {
        for (x34 x34Var : szdVar.h()) {
            Object g = this.b.g(x34Var, null);
            Object f = szdVar.f(x34Var);
            if (g instanceof eo40) {
                eo40 eo40Var = (eo40) f;
                eo40Var.getClass();
                ((eo40) g).a.addAll(Collections.unmodifiableList(new ArrayList(eo40Var.a)));
            } else {
                if (f instanceof eo40) {
                    f = ((eo40) f).clone();
                }
                this.b.t(x34Var, szdVar.e(x34Var), f);
            }
        }
    }

    public final void d(DeferrableSurface deferrableSurface) {
        this.a.add(deferrableSurface);
    }

    public final s38 e() {
        ArrayList arrayList = new ArrayList(this.a);
        ug70 a = ug70.a(this.b);
        int i = this.c;
        boolean z = this.d;
        ArrayList arrayList2 = new ArrayList(this.e);
        boolean z2 = this.f;
        q6x0 q6x0Var = q6x0.b;
        ArrayMap arrayMap = new ArrayMap();
        rz40 rz40Var = this.g;
        for (String str : rz40Var.a.keySet()) {
            arrayMap.put(str, rz40Var.a.get(str));
        }
        return new s38(arrayList, a, i, z, arrayList2, z2, new q6x0(arrayMap), this.h);
    }

    public r38() {
        this.a = new HashSet();
        this.b = yy40.b();
        this.c = -1;
        this.d = false;
        this.e = new ArrayList();
        this.f = false;
        this.g = new rz40(new ArrayMap());
    }
}
