package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;

/* loaded from: classes9.dex */
public final class zlt0 extends GridLayoutManager.b {
    public final cfx d;

    public zlt0(efx efxVar) {
        this.d = efxVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.b
    public final int c(int i) {
        u0x u0xVar = (u0x) this.d.f().get(i);
        if (u0xVar instanceof aul) {
            return ((aul) u0xVar).h().a;
        }
        return 60;
    }
}
