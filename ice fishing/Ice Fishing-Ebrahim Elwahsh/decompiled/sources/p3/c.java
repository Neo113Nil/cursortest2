package p3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import t0.AbstractC5017A;

/* loaded from: classes2.dex */
public final class c extends AbstractC5017A {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f39829a;

    /* renamed from: b, reason: collision with root package name */
    public final List f39830b;

    public c() {
        Paint paint = new Paint();
        this.f39829a = paint;
        this.f39830b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // t0.AbstractC5017A
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        Paint paint = this.f39829a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(C5284R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f39830b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
            ThreadLocal threadLocal = G.c.f1149a;
            float f6 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f6)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f6)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f6)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f6))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).A0()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f36073q.e(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f36073q.a(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f36073q.b(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f36073q.c(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
