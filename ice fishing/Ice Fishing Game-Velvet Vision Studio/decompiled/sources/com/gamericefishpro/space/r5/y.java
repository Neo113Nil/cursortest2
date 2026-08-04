package com.gamericefishpro.space.r5;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public u a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public final void a(m0 m0Var) {
        u uVar = this.a;
        if (uVar != null) {
            RecyclerView recyclerView = uVar.a;
            boolean z = true;
            m0Var.m(true);
            if ((m0Var.b & 16) != 0) {
                return;
            }
            com.gamericefishpro.space.bb.a aVar = recyclerView.d;
            recyclerView.F();
            b bVar = recyclerView.v;
            com.gamericefishpro.space.n9.r0 r0Var = (com.gamericefishpro.space.n9.r0) bVar.i;
            u uVar2 = (u) bVar.e;
            int iIndexOfChild = uVar2.a.indexOfChild(null);
            if (iIndexOfChild == -1) {
                bVar.p(null);
            } else if (r0Var.f(iIndexOfChild)) {
                r0Var.i(iIndexOfChild);
                bVar.p(null);
                uVar2.a(iIndexOfChild);
            } else {
                z = false;
            }
            if (z) {
                m0 m0VarS = RecyclerView.s(null);
                aVar.l(m0VarS);
                aVar.j(m0VarS);
            }
            recyclerView.G(!z);
            if (z || !m0Var.j()) {
                return;
            }
            recyclerView.removeDetachedView(null, false);
        }
    }

    public abstract void b(m0 m0Var);

    public abstract void c();

    public abstract boolean d();
}
