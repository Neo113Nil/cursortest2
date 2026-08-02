package ru.yandex.taxi.widget.recycler;

import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.f2t0;
import defpackage.g2t0;
import defpackage.hst;
import defpackage.jst;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/taxi/widget/recycler/SnappyLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lg2t0;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class SnappyLinearLayoutManager extends LinearLayoutManager implements g2t0 {
    public static final float b0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    public final int h2(int i, int i2, int i3, int i4) {
        double log = Math.log((Math.abs(i) * 0.3499999940395355d) / (ViewConfiguration.getScrollFriction() * 0.0d));
        double d = b0;
        double exp = Math.exp((d / (d - 1.0d)) * log) * ViewConfiguration.getScrollFriction() * 0.0d;
        double d2 = i2;
        if (i > 0) {
            exp = -exp;
        }
        double d3 = d2 + exp;
        return i <= 0 ? Math.max(i4 - ((int) (d3 / i3)), 0) : Math.min(i4 - ((int) (d3 / i3)), getItemCount() - 1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void x1(RecyclerView recyclerView, RecyclerView.k kVar, int i) {
        if (i < 0 || i >= getItemCount()) {
            hst hstVar = jst.e;
            getItemCount();
            hstVar.getClass();
        } else {
            f2t0 f2t0Var = new f2t0(this, recyclerView.getContext());
            f2t0Var.a = i;
            v(f2t0Var);
        }
    }
}
