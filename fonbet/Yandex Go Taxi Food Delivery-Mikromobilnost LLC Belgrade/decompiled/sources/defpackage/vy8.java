package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes11.dex */
public final class vy8 extends w {
    public final /* synthetic */ CarouselLayoutManager p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy8(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.p = carouselLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final PointF a(int i) {
        return this.p.d(i);
    }

    @Override // androidx.recyclerview.widget.w
    public final int k(int i, View view) {
        CarouselLayoutManager carouselLayoutManager = this.p;
        if (carouselLayoutManager.O == null || !carouselLayoutManager.L1()) {
            return 0;
        }
        int r0 = RecyclerView.e.r0(view);
        return (int) (carouselLayoutManager.J - carouselLayoutManager.I1(r0, carouselLayoutManager.H1(r0)));
    }

    @Override // androidx.recyclerview.widget.w
    public final int l(int i, View view) {
        CarouselLayoutManager carouselLayoutManager = this.p;
        if (carouselLayoutManager.O == null || carouselLayoutManager.L1()) {
            return 0;
        }
        int r0 = RecyclerView.e.r0(view);
        return (int) (carouselLayoutManager.J - carouselLayoutManager.I1(r0, carouselLayoutManager.H1(r0)));
    }
}
