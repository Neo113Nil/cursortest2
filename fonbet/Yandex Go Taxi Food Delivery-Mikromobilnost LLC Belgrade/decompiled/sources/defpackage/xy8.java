package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes11.dex */
public final class xy8 extends zy8 {
    public final /* synthetic */ CarouselLayoutManager b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy8(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.b = carouselLayoutManager;
    }

    @Override // defpackage.zy8
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f = rectF2.top;
        float f2 = rectF3.top;
        if (f < f2 && rectF2.bottom > f2) {
            float f3 = f2 - f;
            rectF.top += f3;
            rectF3.top += f3;
        }
        float f4 = rectF2.bottom;
        float f5 = rectF3.bottom;
        if (f4 <= f5 || rectF2.top >= f5) {
            return;
        }
        float f6 = f4 - f5;
        rectF.bottom = Math.max(rectF.bottom - f6, rectF.top);
        rectF2.bottom = Math.max(rectF2.bottom - f6, rectF2.top);
    }

    @Override // defpackage.zy8
    public final RectF b(float f, float f2, float f3, float f4) {
        return new RectF(0.0f, f3, f2, f - f3);
    }

    @Override // defpackage.zy8
    public final int c() {
        return this.b.I;
    }

    @Override // defpackage.zy8
    public final int d() {
        return this.b.getPaddingLeft();
    }

    @Override // defpackage.zy8
    public final int e() {
        CarouselLayoutManager carouselLayoutManager = this.b;
        return carouselLayoutManager.H - carouselLayoutManager.getPaddingRight();
    }

    @Override // defpackage.zy8
    public final int f() {
        return 0;
    }

    @Override // defpackage.zy8
    public final int g() {
        return 0;
    }

    @Override // defpackage.zy8
    public final void h(int i, int i2, View view) {
        CarouselLayoutManager carouselLayoutManager = this.b;
        int paddingLeft = carouselLayoutManager.getPaddingLeft();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        carouselLayoutManager.C0(paddingLeft, i, carouselLayoutManager.l0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + paddingLeft, i2, view);
    }

    @Override // defpackage.zy8
    public final void i(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.bottom <= rectF3.top) {
            float floor = ((float) Math.floor(rectF.bottom)) - 1.0f;
            rectF.bottom = floor;
            rectF.top = Math.min(rectF.top, floor);
        }
        if (rectF2.top >= rectF3.bottom) {
            float ceil = ((float) Math.ceil(rectF.top)) + 1.0f;
            rectF.top = ceil;
            rectF.bottom = Math.max(ceil, rectF.bottom);
        }
    }

    @Override // defpackage.zy8
    public final void j(View view, Rect rect, float f, float f2) {
        view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
    }
}
