package p3;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;
import t0.C5027K;
import t0.C5056s;
import t0.C5058u;

/* renamed from: p3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4859b extends C5056s {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f39827q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f39828r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4859b(int i, Context context, Object obj) {
        super(context);
        this.f39827q = i;
        this.f39828r = obj;
    }

    @Override // t0.C5056s
    public int b(View view, int i) {
        switch (this.f39827q) {
            case 0:
                ((CarouselLayoutManager) this.f39828r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // t0.C5056s
    public int c(View view, int i) {
        switch (this.f39827q) {
            case 0:
                ((CarouselLayoutManager) this.f39828r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // t0.C5056s
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f39827q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // t0.C5056s
    public int e(int i) {
        switch (this.f39827q) {
            case 1:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // t0.C5056s
    public PointF f(int i) {
        switch (this.f39827q) {
            case 0:
                ((CarouselLayoutManager) this.f39828r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // t0.C5056s
    public void h(View view, C5027K c5027k) {
        switch (this.f39827q) {
            case 1:
                C5058u c5058u = (C5058u) this.f39828r;
                int[] a9 = c5058u.a(c5058u.f40795a.getLayoutManager(), view);
                int i = a9[0];
                int i4 = a9[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i4))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f40787j;
                    c5027k.f40587a = i;
                    c5027k.f40588b = i4;
                    c5027k.f40589c = ceil;
                    c5027k.f40591e = decelerateInterpolator;
                    c5027k.f40592f = true;
                    break;
                }
                break;
            default:
                super.h(view, c5027k);
                break;
        }
    }
}
