package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes11.dex */
public final class yy8 extends zy8 {
    public final /* synthetic */ CarouselLayoutManager b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy8(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.b = carouselLayoutManager;
    }

    @Override // defpackage.zy8
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f = rectF2.left;
        float f2 = rectF3.left;
        if (f < f2 && rectF2.right > f2) {
            float f3 = f2 - f;
            rectF.left += f3;
            rectF2.left += f3;
        }
        float f4 = rectF2.right;
        float f5 = rectF3.right;
        if (f4 <= f5 || rectF2.left >= f5) {
            return;
        }
        float f6 = f4 - f5;
        rectF.right = Math.max(rectF.right - f6, rectF.left);
        rectF2.right = Math.max(rectF2.right - f6, rectF2.left);
    }

    @Override // defpackage.zy8
    public final RectF b(float f, float f2, float f3, float f4) {
        return new RectF(f4, 0.0f, f2 - f4, f);
    }

    @Override // defpackage.zy8
    public final int c() {
        CarouselLayoutManager carouselLayoutManager = this.b;
        return carouselLayoutManager.I - carouselLayoutManager.getPaddingBottom();
    }

    @Override // defpackage.zy8
    public final int d() {
        return 0;
    }

    @Override // defpackage.zy8
    public final int e() {
        return this.b.H;
    }

    @Override // defpackage.zy8
    public final int f() {
        CarouselLayoutManager carouselLayoutManager = this.b;
        if (carouselLayoutManager.M1()) {
            return carouselLayoutManager.H;
        }
        return 0;
    }

    @Override // defpackage.zy8
    public final int g() {
        return this.b.getPaddingTop();
    }

    @Override // defpackage.zy8
    public final void h(int i, int i2, View view) {
        CarouselLayoutManager carouselLayoutManager = this.b;
        int paddingTop = carouselLayoutManager.getPaddingTop();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        carouselLayoutManager.C0(i, paddingTop, i2, carouselLayoutManager.k0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + paddingTop, view);
    }

    @Override // defpackage.zy8
    public final void i(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.right <= rectF3.left) {
            float floor = ((float) Math.floor(rectF.right)) - 1.0f;
            rectF.right = floor;
            rectF.left = Math.min(rectF.left, floor);
        }
        if (rectF2.left >= rectF3.right) {
            float ceil = ((float) Math.ceil(rectF.left)) + 1.0f;
            rectF.left = ceil;
            rectF.right = Math.max(ceil, rectF.right);
        }
    }

    @Override // defpackage.zy8
    public final void j(View view, Rect rect, float f, float f2) {
        view.offsetLeftAndRight((int) (f2 - (rect.left + f)));
    }
}
