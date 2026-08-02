package t0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: t0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5024t extends C5022r {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f40823q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f40824r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5024t(int i, Context context, Object obj) {
        super(context);
        this.f40823q = i;
        this.f40824r = obj;
    }

    @Override // t0.C5022r
    public int b(View view, int i) {
        switch (this.f40823q) {
            case 1:
                ((CarouselLayoutManager) this.f40824r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // t0.C5022r
    public int c(View view, int i) {
        switch (this.f40823q) {
            case 1:
                ((CarouselLayoutManager) this.f40824r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // t0.C5022r
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f40823q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // t0.C5022r
    public int e(int i) {
        switch (this.f40823q) {
            case 0:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // t0.C5022r
    public PointF f(int i) {
        switch (this.f40823q) {
            case 1:
                ((CarouselLayoutManager) this.f40824r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // t0.C5022r
    public void h(View view, C4995K c4995k) {
        switch (this.f40823q) {
            case 0:
                C5025u c5025u = (C5025u) this.f40824r;
                int[] a9 = c5025u.a(c5025u.f40825a.getLayoutManager(), view);
                int i = a9[0];
                int i4 = a9[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i4))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f40815j;
                    c4995k.f40615a = i;
                    c4995k.f40616b = i4;
                    c4995k.f40617c = ceil;
                    c4995k.f40619e = decelerateInterpolator;
                    c4995k.f40620f = true;
                    break;
                }
                break;
            default:
                super.h(view, c4995k);
                break;
        }
    }
}
