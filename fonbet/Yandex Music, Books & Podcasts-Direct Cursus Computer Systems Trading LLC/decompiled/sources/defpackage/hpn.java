package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class hpn extends ron {
    public final /* synthetic */ RecyclerView a;

    public hpn(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.ron
    public final void a() {
        RecyclerView recyclerView = this.a;
        recyclerView.u(null);
        recyclerView.N0.f = true;
        recyclerView.p0(true);
        if (recyclerView.e.j()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.ron
    public final void b(int i, int i2, Object obj) {
        RecyclerView recyclerView = this.a;
        recyclerView.u(null);
        sj sjVar = recyclerView.e;
        ArrayList arrayList = (ArrayList) sjVar.c;
        if (i2 < 1) {
            return;
        }
        arrayList.add(sjVar.m(4, i, obj, i2));
        sjVar.a |= 4;
        if (arrayList.size() == 1) {
            f();
        }
    }

    @Override // defpackage.ron
    public final void c(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.u(null);
        sj sjVar = recyclerView.e;
        ArrayList arrayList = (ArrayList) sjVar.c;
        if (i2 < 1) {
            return;
        }
        arrayList.add(sjVar.m(1, i, null, i2));
        sjVar.a |= 1;
        if (arrayList.size() == 1) {
            f();
        }
    }

    @Override // defpackage.ron
    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.u(null);
        sj sjVar = recyclerView.e;
        ArrayList arrayList = (ArrayList) sjVar.c;
        if (i == i2) {
            return;
        }
        arrayList.add(sjVar.m(8, i, null, i2));
        sjVar.a |= 8;
        if (arrayList.size() == 1) {
            f();
        }
    }

    @Override // defpackage.ron
    public final void e(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.u(null);
        sj sjVar = recyclerView.e;
        ArrayList arrayList = (ArrayList) sjVar.c;
        if (i2 < 1) {
            return;
        }
        arrayList.add(sjVar.m(2, i, null, i2));
        sjVar.a |= 2;
        if (arrayList.size() == 1) {
            f();
        }
    }

    public final void f() {
        RecyclerView recyclerView = this.a;
        if (!recyclerView.t || !recyclerView.s) {
            recyclerView.A = true;
            recyclerView.requestLayout();
        } else {
            pon ponVar = recyclerView.i;
            WeakHashMap weakHashMap = wdu.a;
            recyclerView.postOnAnimation(ponVar);
        }
    }
}
