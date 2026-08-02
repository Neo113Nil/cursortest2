package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import androidx.viewpager2.NestedScrollableHost;
import ru.yandex.taxi.perf.screen.c;
import ru.yandex.taxi.preorder.summary.selector.model.vertical.a;
import ru.yandex.taxi.preorder.summary.selector.ui.verticals.VerticalInternalTariffView;

/* loaded from: classes6.dex */
public final class qf31 extends x0 {
    public final VerticalInternalTariffView N;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qf31(Context context, pav pavVar, h3y h3yVar, RecyclerView.h hVar, a aVar, nex0 nex0Var, fva0 fva0Var, k051 k051Var, unx0 unx0Var, bbx0 bbx0Var, bmq0 bmq0Var, f1f0 f1f0Var, hbp0 hbp0Var, c cVar, com.yandex.go.taxi.summary.shared.lifecycle.a aVar2) {
        super(r1);
        NestedScrollableHost nestedScrollableHost = new NestedScrollableHost(context, null, 0, 6, null);
        VerticalInternalTariffView verticalInternalTariffView = new VerticalInternalTariffView(context, pavVar, h3yVar, hVar, aVar, nex0Var, fva0Var, k051Var, unx0Var, bbx0Var, bmq0Var, f1f0Var, hbp0Var, cVar, aVar2);
        this.N = verticalInternalTariffView;
        nestedScrollableHost.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        nestedScrollableHost.addView(verticalInternalTariffView);
    }
}
