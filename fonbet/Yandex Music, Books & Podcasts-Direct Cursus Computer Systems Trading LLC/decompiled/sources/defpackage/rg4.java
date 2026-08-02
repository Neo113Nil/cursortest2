package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager12Fixed;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ru.yandex.music.R;
import ru.yandex.music.ui.view.YaRotatingProgress;

/* loaded from: classes5.dex */
public final class rg4 {
    public static final /* synthetic */ s9f[] h = {new yxm(rg4.class, "swipeRefreshLayout", "getSwipeRefreshLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", 0), f1d.c(ern.a, rg4.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new yxm(rg4.class, "progress", "getProgress()Lru/yandex/music/ui/view/YaRotatingProgress;", 0), new yxm(rg4.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0), new opi(rg4.class, "paddingJob", "getPaddingJob()Lkotlinx/coroutines/Job;", 0)};
    public sld a;
    public final q13 b;
    public final q13 c;
    public final q13 d;
    public final q13 e;
    public final rcm f;
    public final z6n g;

    public rg4(Context context, qyf qyfVar, View view, v5 v5Var) {
        context.getClass();
        view.getClass();
        this.b = new q13(new ql(view, 11));
        this.c = new q13(new ql(view, 12));
        this.d = new q13(new ql(view, 13));
        this.e = new q13(new ql(view, 14));
        rcm rcmVar = new rcm(context);
        this.f = rcmVar;
        z6n z6nVar = new z6n(7);
        this.g = z6nVar;
        b().setColorSchemeColors(weo.M(context, R.attr.iconPrimary));
        b().setProgressBackgroundColorSchemeColor(weo.M(context, R.attr.bgSecondary));
        b().setOnRefreshListener(new n(10, this));
        int complexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(weo.M(context, R.attr.actionBarSize), context.getResources().getDisplayMetrics());
        c().setTitle("");
        RecyclerView a = a();
        jyr jyrVar = sht.a;
        a.getClass();
        a.setClipToPadding(false);
        a.setPadding(a.getPaddingLeft(), a.getPaddingTop() + complexToDimensionPixelSize, a.getPaddingRight(), a.getPaddingBottom());
        c().setVisibility(0);
        v5Var.invoke(c());
        qdq.d(c(), false, (r3 & 2) == 0, false, (r3 & 8) == 0);
        RecyclerView a2 = a();
        aqd aqdVar = new aqd(0);
        GridLayoutManager12Fixed gridLayoutManager12Fixed = new GridLayoutManager12Fixed(context);
        if (gridLayoutManager12Fixed.i) {
            gridLayoutManager12Fixed.i = false;
            gridLayoutManager12Fixed.j = 0;
            RecyclerView recyclerView = gridLayoutManager12Fixed.b;
            if (recyclerView != null) {
                recyclerView.c.n();
            }
        }
        gridLayoutManager12Fixed.K = aqdVar;
        a2.setLayoutManager(gridLayoutManager12Fixed);
        a().setHasFixedSize(true);
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.unit_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.edge_margin);
        a().s(new tpd(dimensionPixelSize2, dimensionPixelSize2, resources.getDimensionPixelSize(R.dimen.grid_inner_vertical_margin), dimensionPixelSize));
        a().setAdapter(rcmVar);
        zs4.a(a());
        qdq.d(a(), false, (r3 & 2) == 0, false, (r3 & 8) == 0);
        z6nVar.setValue(this, h[4], rvf.z(a(), qyfVar));
        rcmVar.e = new n(11, new q2(28, this));
    }

    public final RecyclerView a() {
        return (RecyclerView) this.c.a(h[1]);
    }

    public final SwipeRefreshLayout b() {
        return (SwipeRefreshLayout) this.b.a(h[0]);
    }

    public final Toolbar c() {
        return (Toolbar) this.e.a(h[3]);
    }

    public final void d() {
        b().setRefreshing(false);
        YaRotatingProgress yaRotatingProgress = (YaRotatingProgress) this.d.a(h[2]);
        yaRotatingProgress.c = false;
        v7w v7wVar = yaRotatingProgress.f;
        v7w v7wVar2 = yaRotatingProgress.e;
        yaRotatingProgress.removeCallbacks(v7wVar2);
        long currentTimeMillis = System.currentTimeMillis();
        long j = yaRotatingProgress.b;
        long j2 = currentTimeMillis - j;
        if (j2 <= 500 && j != -1) {
            if (yaRotatingProgress.d) {
                return;
            }
            yaRotatingProgress.d = true;
            yaRotatingProgress.postDelayed(v7wVar, 300 - j2);
            return;
        }
        yaRotatingProgress.c = false;
        yaRotatingProgress.removeCallbacks(v7wVar2);
        yaRotatingProgress.d = false;
        yaRotatingProgress.removeCallbacks(v7wVar);
        jyr jyrVar = sht.a;
        yaRotatingProgress.setVisibility(8);
    }
}
