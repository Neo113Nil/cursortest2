package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.places.impl.ui.organizations.v2.f;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class vn80 extends RecyclerView.g {
    public final /* synthetic */ f a;

    public vn80(f fVar) {
        this.a = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        boolean z = (linearLayoutManager != null ? linearLayoutManager.K1() : -1) > 1;
        r0 r0Var = this.a.h0;
        Object obj = z ? sec0.a : tec0.a;
        r0Var.getClass();
        r0Var.m(null, obj);
    }
}
