package t3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import t0.AbstractC4985A;

/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5037b extends AbstractC4985A {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f40881a;

    /* renamed from: b, reason: collision with root package name */
    public final List f40882b;

    public C5037b() {
        Paint paint = new Paint();
        this.f40881a = paint;
        this.f40882b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // t0.AbstractC4985A
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        Paint paint = this.f40881a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(C5248R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f40882b.iterator();
        while (it.hasNext()) {
            ((AbstractC5039d) it.next()).getClass();
            ThreadLocal threadLocal = G.c.f1029a;
            float f2 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).A0()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f36678q.e(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f36678q.a(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f36678q.b(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f36678q.c(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
