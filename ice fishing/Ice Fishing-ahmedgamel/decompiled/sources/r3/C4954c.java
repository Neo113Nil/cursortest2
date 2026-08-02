package r3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.icefishingapp.icefishing.C5275R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import t0.AbstractC4987B;

/* renamed from: r3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4954c extends AbstractC4987B {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f40379a;

    /* renamed from: b, reason: collision with root package name */
    public final List f40380b;

    public C4954c() {
        Paint paint = new Paint();
        this.f40379a = paint;
        this.f40380b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // t0.AbstractC4987B
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        Paint paint = this.f40379a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(C5275R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f40380b.iterator();
        while (it.hasNext()) {
            ((AbstractC4956e) it.next()).getClass();
            ThreadLocal threadLocal = G.c.f1003a;
            float f3 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f3)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f3)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f3)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f3))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).A0()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f35910q.e(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f35910q.a(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f35910q.b(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f35910q.c(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
