package E0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;
import k0.C0209x;
import k0.C0211z;
import k0.V;

/* loaded from: classes.dex */
public final class b extends C0209x {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f173q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f174r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Context context, int i) {
        super(context);
        this.f173q = i;
        this.f174r = obj;
    }

    @Override // k0.C0209x
    public int b(View view, int i) {
        switch (this.f173q) {
            case 0:
                ((CarouselLayoutManager) this.f174r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // k0.C0209x
    public int c(View view, int i) {
        switch (this.f173q) {
            case 0:
                ((CarouselLayoutManager) this.f174r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // k0.C0209x
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f173q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // k0.C0209x
    public int e(int i) {
        switch (this.f173q) {
            case 1:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // k0.C0209x
    public PointF f(int i) {
        switch (this.f173q) {
            case 0:
                ((CarouselLayoutManager) this.f174r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // k0.C0209x
    public void h(View view, V v2) {
        switch (this.f173q) {
            case 1:
                C0211z c0211z = (C0211z) this.f174r;
                int[] a2 = c0211z.a(c0211z.f3628a.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.j;
                    v2.f3416a = i;
                    v2.f3417b = i2;
                    v2.f3418c = ceil;
                    v2.e = decelerateInterpolator;
                    v2.f3420f = true;
                    break;
                }
                break;
            default:
                super.h(view, v2);
                break;
        }
    }
}
