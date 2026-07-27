package L;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class I implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public int f483e;

    /* renamed from: f, reason: collision with root package name */
    public int f484f;

    /* renamed from: g, reason: collision with root package name */
    public OverScroller f485g;

    /* renamed from: h, reason: collision with root package name */
    public Interpolator f486h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f487i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f488j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f489k;

    public I(RecyclerView recyclerView) {
        this.f489k = recyclerView;
        r rVar = RecyclerView.o0;
        this.f486h = rVar;
        this.f487i = false;
        this.f488j = false;
        this.f485g = new OverScroller(recyclerView.getContext(), rVar);
    }

    public final void a() {
        if (this.f487i) {
            this.f488j = true;
            return;
        }
        RecyclerView recyclerView = this.f489k;
        recyclerView.removeCallbacks(this);
        Field field = w.x.f3074a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f489k;
        if (recyclerView.f1605m == null) {
            recyclerView.removeCallbacks(this);
            this.f485g.abortAnimation();
            return;
        }
        this.f488j = false;
        this.f487i = true;
        recyclerView.d();
        OverScroller overScroller = this.f485g;
        recyclerView.f1605m.getClass();
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i2 = currX - this.f483e;
            int i3 = currY - this.f484f;
            this.f483e = currX;
            this.f484f = currY;
            RecyclerView recyclerView2 = this.f489k;
            int[] iArr = recyclerView.f1599h0;
            if (recyclerView2.f(i2, i3, iArr, null, 1)) {
                i2 -= iArr[0];
                i3 -= iArr[1];
            }
            if (!recyclerView.f1606n.isEmpty()) {
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
            boolean z2 = (i2 == 0 && i3 == 0) || (i2 != 0 && recyclerView.f1605m.b() && i2 == 0) || (i3 != 0 && recyclerView.f1605m.c() && i3 == 0);
            if (overScroller.isFinished() || !(z2 || recyclerView.k())) {
                recyclerView.setScrollState(0);
                C0034j c0034j = recyclerView.f1588a0;
                c0034j.getClass();
                c0034j.f569c = 0;
                recyclerView.s(1);
            } else {
                a();
                RunnableC0036l runnableC0036l = recyclerView.f1587W;
                if (runnableC0036l != null) {
                    runnableC0036l.a(recyclerView, i2, i3);
                }
            }
        }
        this.f487i = false;
        if (this.f488j) {
            a();
        }
    }
}
