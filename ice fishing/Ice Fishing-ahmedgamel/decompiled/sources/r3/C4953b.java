package r3;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;
import t0.C4998M;
import t0.C5024s;
import t0.C5026u;

/* renamed from: r3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4953b extends C5024s {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f40377q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f40378r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4953b(int i, Context context, Object obj) {
        super(context);
        this.f40377q = i;
        this.f40378r = obj;
    }

    @Override // t0.C5024s
    public int b(View view, int i) {
        switch (this.f40377q) {
            case 0:
                ((CarouselLayoutManager) this.f40378r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // t0.C5024s
    public int c(View view, int i) {
        switch (this.f40377q) {
            case 0:
                ((CarouselLayoutManager) this.f40378r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // t0.C5024s
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f40377q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // t0.C5024s
    public int e(int i) {
        switch (this.f40377q) {
            case 1:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // t0.C5024s
    public PointF f(int i) {
        switch (this.f40377q) {
            case 0:
                ((CarouselLayoutManager) this.f40378r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // t0.C5024s
    public void h(View view, C4998M c4998m) {
        switch (this.f40377q) {
            case 1:
                C5026u c5026u = (C5026u) this.f40378r;
                int[] a9 = c5026u.a(c5026u.f40776a.getLayoutManager(), view);
                int i = a9[0];
                int i6 = a9[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i6))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f40768j;
                    c4998m.f40565a = i;
                    c4998m.f40566b = i6;
                    c4998m.f40567c = ceil;
                    c4998m.f40569e = decelerateInterpolator;
                    c4998m.f40570f = true;
                    break;
                }
                break;
            default:
                super.h(view, c4998m);
                break;
        }
    }
}
