package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.e;

/* loaded from: classes3.dex */
public final class sdm0 extends GridLayoutManager.b {
    public final /* synthetic */ e d;

    public sdm0(e eVar) {
        this.d = eVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.b
    public final int c(int i) {
        qa3 qa3Var = this.d.b;
        return ((qa3Var.b.f.get(i) instanceof fam0) || (qa3Var.b.f.get(i) instanceof scm0)) ? 1 : 2;
    }
}
