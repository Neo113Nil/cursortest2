package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class xch extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ adh F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xch(adh adhVar, Context context, int i, int i2) {
        super(context, i, false);
        this.F = adhVar;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.yon
    public final void d1(RecyclerView recyclerView, int i) {
        d34 d34Var = new d34(recyclerView.getContext());
        d34Var.a = i;
        e1(d34Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void g1(kpn kpnVar, int[] iArr) {
        int i = this.E;
        adh adhVar = this.F;
        if (i == 0) {
            iArr[0] = adhVar.n.getWidth();
            iArr[1] = adhVar.n.getWidth();
        } else {
            iArr[0] = adhVar.n.getHeight();
            iArr[1] = adhVar.n.getHeight();
        }
    }
}
