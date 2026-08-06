package P;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class H implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f1265a;

    /* renamed from: b, reason: collision with root package name */
    public int f1266b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f1267c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f1268d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1269e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1271g;

    public H(RecyclerView recyclerView) {
        this.f1271g = recyclerView;
        q qVar = RecyclerView.f2531p0;
        this.f1268d = qVar;
        this.f1269e = false;
        this.f1270f = false;
        this.f1267c = new OverScroller(recyclerView.getContext(), qVar);
    }

    public final void a() {
        if (this.f1269e) {
            this.f1270f = true;
            return;
        }
        RecyclerView recyclerView = this.f1271g;
        recyclerView.removeCallbacks(this);
        Field field = y.x.f8596a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f1271g;
        if (recyclerView.f2563i == null) {
            recyclerView.removeCallbacks(this);
            this.f1267c.abortAnimation();
            return;
        }
        this.f1270f = false;
        this.f1269e = true;
        recyclerView.d();
        OverScroller overScroller = this.f1267c;
        recyclerView.f2563i.getClass();
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i2 = currX - this.f1265a;
            int i3 = currY - this.f1266b;
            this.f1265a = currX;
            this.f1266b = currY;
            RecyclerView recyclerView2 = this.f1271g;
            int[] iArr = recyclerView.f2564i0;
            if (recyclerView2.f(i2, i3, iArr, null, 1)) {
                i2 -= iArr[0];
                i3 -= iArr[1];
            }
            if (!recyclerView.f2565j.isEmpty()) {
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
            boolean z2 = (i2 == 0 && i3 == 0) || (i2 != 0 && recyclerView.f2563i.b() && i2 == 0) || (i3 != 0 && recyclerView.f2563i.c() && i3 == 0);
            if (overScroller.isFinished() || !(z2 || recyclerView.k())) {
                recyclerView.setScrollState(0);
                C0060i c0060i = recyclerView.f2552b0;
                c0060i.getClass();
                c0060i.f1342c = 0;
                recyclerView.s(1);
            } else {
                a();
                RunnableC0062k runnableC0062k = recyclerView.f2550a0;
                if (runnableC0062k != null) {
                    runnableC0062k.a(recyclerView, i2, i3);
                }
            }
        }
        this.f1269e = false;
        if (this.f1270f) {
            a();
        }
    }
}
