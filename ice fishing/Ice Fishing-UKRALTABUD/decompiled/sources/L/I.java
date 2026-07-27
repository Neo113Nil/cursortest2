package L;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class I implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public int f561f;

    /* renamed from: g, reason: collision with root package name */
    public int f562g;

    /* renamed from: h, reason: collision with root package name */
    public OverScroller f563h;

    /* renamed from: i, reason: collision with root package name */
    public Interpolator f564i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f565j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f566k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f567l;

    public I(RecyclerView recyclerView) {
        this.f567l = recyclerView;
        r rVar = RecyclerView.f1557p0;
        this.f564i = rVar;
        this.f565j = false;
        this.f566k = false;
        this.f563h = new OverScroller(recyclerView.getContext(), rVar);
    }

    public final void a() {
        if (this.f565j) {
            this.f566k = true;
            return;
        }
        RecyclerView recyclerView = this.f567l;
        recyclerView.removeCallbacks(this);
        Field field = w.x.f3069a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f567l;
        if (recyclerView.f1598n == null) {
            recyclerView.removeCallbacks(this);
            this.f563h.abortAnimation();
            return;
        }
        this.f566k = false;
        this.f565j = true;
        recyclerView.d();
        OverScroller overScroller = this.f563h;
        recyclerView.f1598n.getClass();
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i2 = currX - this.f561f;
            int i3 = currY - this.f562g;
            this.f561f = currX;
            this.f562g = currY;
            RecyclerView recyclerView2 = this.f567l;
            int[] iArr = recyclerView.i0;
            if (recyclerView2.f(i2, i3, iArr, null, 1)) {
                i2 -= iArr[0];
                i3 -= iArr[1];
            }
            if (!recyclerView.f1599o.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(i2, i3);
            }
            recyclerView.g(null, 1);
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z2 = (i2 == 0 && i3 == 0) || (i2 != 0 && recyclerView.f1598n.b() && i2 == 0) || (i3 != 0 && recyclerView.f1598n.c() && i3 == 0);
            if (overScroller.isFinished() || !(z2 || recyclerView.k())) {
                recyclerView.setScrollState(0);
                C0059j c0059j = recyclerView.f1581b0;
                c0059j.getClass();
                c0059j.f647c = 0;
                recyclerView.s(1);
            } else {
                a();
                RunnableC0061l runnableC0061l = recyclerView.f1580a0;
                if (runnableC0061l != null) {
                    runnableC0061l.a(recyclerView, i2, i3);
                }
            }
        }
        this.f565j = false;
        if (this.f566k) {
            a();
        }
    }
}
