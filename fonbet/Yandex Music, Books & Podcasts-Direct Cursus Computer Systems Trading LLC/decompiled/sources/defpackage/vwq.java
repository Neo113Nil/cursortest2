package defpackage;

import android.view.View;
import android.widget.OverScroller;
import com.yandex.alicekit.core.slideup.SlidingBehavior;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class vwq implements Runnable {
    public final OverScroller a;
    public final View b;
    public final /* synthetic */ SlidingBehavior c;

    public vwq(SlidingBehavior slidingBehavior, OverScroller overScroller, View view) {
        this.c = slidingBehavior;
        this.a = overScroller;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller = this.a;
        boolean computeScrollOffset = overScroller.computeScrollOffset();
        SlidingBehavior slidingBehavior = this.c;
        if (!computeScrollOffset) {
            slidingBehavior.updateStateByCurrentPosition();
            return;
        }
        slidingBehavior.setPosition(overScroller.getCurrY());
        WeakHashMap weakHashMap = wdu.a;
        this.b.postOnAnimation(this);
    }
}
