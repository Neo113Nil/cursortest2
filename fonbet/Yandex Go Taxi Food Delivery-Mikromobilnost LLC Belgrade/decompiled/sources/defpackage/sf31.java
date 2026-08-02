package defpackage;

import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.go.taxi.summary.shared.lifecycle.a;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.perf.screen.c;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes6.dex */
public final class sf31 extends RecyclerView.Adapter {
    public final bmq0 A;
    public final f1f0 B;
    public final c C;
    public final a D;
    public final pav E;
    public final RecyclerView.h F = new RecyclerView.h();
    public List G = EmptyList.a;
    public PriceUpdate$PriceLoadingState H = PriceUpdate$PriceLoadingState.LOADED;
    public rf31 I = rf31.z4;
    public OneShotPreDrawListener J;
    public boolean K;
    public final hbp0 L;
    public final h3y a;
    public final ru.yandex.taxi.preorder.summary.selector.model.vertical.a b;
    public final nex0 c;
    public final fva0 w;
    public final k051 x;
    public final unx0 y;
    public final bbx0 z;

    /* JADX WARN: Multi-variable type inference failed */
    public sf31(h3y h3yVar, ru.yandex.taxi.preorder.summary.selector.model.vertical.a aVar, nex0 nex0Var, fva0 fva0Var, k051 k051Var, unx0 unx0Var, bbx0 bbx0Var, bmq0 bmq0Var, f1f0 f1f0Var, tt2 tt2Var, c cVar, a aVar2, pav pavVar) {
        this.a = h3yVar;
        this.b = aVar;
        this.c = nex0Var;
        this.w = fva0Var;
        this.x = k051Var;
        this.y = unx0Var;
        this.z = bbx0Var;
        this.A = bmq0Var;
        this.B = f1f0Var;
        this.C = cVar;
        this.D = aVar2;
        this.E = pavVar;
        this.L = new hbp0(new ja5(tt2Var, 2), null, 0 == true ? 1 : 0, 6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.G.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ((qf31) x0Var).N.updateVerticalItems(((elx0) this.G.get(i)).e, this.H);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        boolean z = this.K;
        fva0 fva0Var = this.w;
        if (!z) {
            fva0Var.e("DoubleTariffRibbonView.ViewHolder", PerformanceAnalytics$Type.Inflate, SystemClock.elapsedRealtime());
        }
        qf31 qf31Var = new qf31(viewGroup.getContext(), this.E, this.a, this.F, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.L, this.C, this.D);
        if (!this.K) {
            this.K = true;
            this.J = fva0.c(fva0Var, qf31Var.a, "DoubleTariffRibbonView.ViewHolder", PerformanceAnalytics$Type.Inflate, 8);
        }
        qf31Var.N.setInternalTariffViewListener(new a201(21, this, qf31Var));
        return qf31Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        super.onViewRecycled((qf31) x0Var);
        OneShotPreDrawListener oneShotPreDrawListener = this.J;
        if (oneShotPreDrawListener != null) {
            oneShotPreDrawListener.removeListener();
        }
    }
}
