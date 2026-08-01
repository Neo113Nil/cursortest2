package E0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k0.H;

/* loaded from: classes.dex */
public final class c extends H {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f175a;

    /* renamed from: b, reason: collision with root package name */
    public final List f176b;

    public c() {
        Paint paint = new Paint();
        this.f175a = paint;
        this.f176b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // k0.H
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int E2;
        int F2;
        Paint paint = this.f175a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f176b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
            ThreadLocal threadLocal = G.a.f260a;
            float f2 = 1.0f - RecyclerView.f2111C0;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * RecyclerView.f2111C0) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * RecyclerView.f2111C0) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * RecyclerView.f2111C0) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * RecyclerView.f2111C0) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).E0()) {
                d dVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2446q;
                switch (dVar.f178b) {
                    case 0:
                        i = 0;
                        break;
                    default:
                        i = dVar.f179c.G();
                        break;
                }
                float f3 = i;
                d dVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2446q;
                switch (dVar2.f178b) {
                    case 0:
                        i2 = dVar2.f179c.f3395o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = dVar2.f179c;
                        i2 = carouselLayoutManager.f3395o - carouselLayoutManager.D();
                        break;
                }
                canvas.drawLine(RecyclerView.f2111C0, f3, RecyclerView.f2111C0, i2, paint);
            } else {
                d dVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2446q;
                switch (dVar3.f178b) {
                    case 0:
                        E2 = dVar3.f179c.E();
                        break;
                    default:
                        E2 = 0;
                        break;
                }
                float f4 = E2;
                d dVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2446q;
                switch (dVar4.f178b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = dVar4.f179c;
                        F2 = carouselLayoutManager2.f3394n - carouselLayoutManager2.F();
                        break;
                    default:
                        F2 = dVar4.f179c.f3394n;
                        break;
                }
                canvas.drawLine(f4, RecyclerView.f2111C0, F2, RecyclerView.f2111C0, paint);
            }
        }
    }
}
