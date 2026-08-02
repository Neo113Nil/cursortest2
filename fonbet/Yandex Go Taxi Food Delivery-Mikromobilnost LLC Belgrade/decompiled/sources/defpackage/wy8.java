package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class wy8 extends RecyclerView.d {
    public final Paint a;
    public List b;

    public wy8() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(org0.m3_carousel_debug_keyline_width);
        Paint paint = this.a;
        paint.setStrokeWidth(dimension);
        for (alx alxVar : this.b) {
            paint.setColor(lhc.b(alxVar.c, -65281, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).L1()) {
                canvas2 = canvas;
                canvas2.drawLine(alxVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).S.g(), alxVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).S.c(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).S.d(), alxVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).S.e(), alxVar.b, paint);
            }
            canvas = canvas2;
        }
    }
}
