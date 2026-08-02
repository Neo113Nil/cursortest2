package ru.yandex.taxi.widget.recycler;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.aee0;
import defpackage.czo0;
import defpackage.ffx;
import defpackage.g92;
import defpackage.hbp0;
import defpackage.hst;
import defpackage.ih20;
import defpackage.jh20;
import defpackage.jst;
import defpackage.leq0;
import defpackage.meq0;
import defpackage.neq0;
import defpackage.oeq0;
import defpackage.pzt0;
import defpackage.sr80;
import defpackage.tje;
import defpackage.v1u0;
import defpackage.w511;
import defpackage.x69;
import defpackage.yzs0;
import defpackage.zde0;
import defpackage.zzs0;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/taxi/widget/recycler/PositionLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "aee0", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class PositionLayoutManager extends LinearLayoutManager {
    public final n0 b0;
    public final n0 c0;
    public aee0 d0;
    public jh20 e0;
    public final hbp0 f0;

    public PositionLayoutManager(Context context) {
        super(context, 0, false);
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.b0 = ffx.b(0, 1, bufferOverflow);
        this.c0 = ffx.b(0, 1, bufferOverflow);
        this.e0 = ih20.a;
        hbp0 hbp0Var = new hbp0(new czo0(14), "", null);
        hbp0Var.a();
        this.f0 = hbp0Var;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void V0(RecyclerView.k kVar) {
        super.V0(kVar);
        n0 n0Var = this.b0;
        if (((Number) n0Var.j().getValue()).intValue() != 0) {
            n0Var.g(kVar);
        }
    }

    public final zzs0 h2(oeq0 oeq0Var, int i, int i2) {
        if (oeq0Var instanceof leq0) {
            return new x69(this, i, i2);
        }
        if (oeq0Var instanceof neq0) {
            return new v1u0(this, i, i2, ((neq0) oeq0Var).a);
        }
        if (oeq0Var instanceof meq0) {
            return new sr80(this, i, ((meq0) oeq0Var).a, this.e0);
        }
        w511.b();
        return null;
    }

    public final pzt0 i2(Runnable runnable) {
        return tje.N(this.f0.c(), null, CoroutineStart.UNDISPATCHED, new PositionLayoutManager$onSmoothScrollStop$1(A0() ? e.T(this.c0, 1) : new g92(2, 1), runnable, null), 1);
    }

    public final void j2(RecyclerView recyclerView, int i, int i2) {
        oeq0 oeq0Var;
        if (i < 0 || i >= getItemCount()) {
            hst hstVar = jst.e;
            getItemCount();
            hstVar.getClass();
        } else {
            aee0 aee0Var = this.d0;
            if (aee0Var == null || (oeq0Var = aee0Var.c(i)) == null) {
                oeq0Var = leq0.a;
            }
            recyclerView.postOnAnimation(new zde0(this, new yzs0(recyclerView, h2(oeq0Var, i, i2), this.c0), 1));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void x1(RecyclerView recyclerView, RecyclerView.k kVar, int i) {
        oeq0 oeq0Var;
        if (i < 0 || i >= getItemCount()) {
            hst hstVar = jst.e;
            getItemCount();
            hstVar.getClass();
        } else {
            aee0 aee0Var = this.d0;
            if (aee0Var == null || (oeq0Var = aee0Var.c(i)) == null) {
                oeq0Var = leq0.a;
            }
            recyclerView.postOnAnimation(new zde0(this, new yzs0(recyclerView, h2(oeq0Var, i, -1), this.c0), 0));
        }
    }
}
