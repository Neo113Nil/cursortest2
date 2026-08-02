package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class e34 extends won {
    public final Paint a;
    public final List b;

    public e34() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.won
    public final void h(Canvas canvas, RecyclerView recyclerView, kpn kpnVar) {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((hcf) it.next()).getClass();
            paint.setColor(aa5.d(-65281, 0.0f, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).h1()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.m(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.h(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).q.i(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.k(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
