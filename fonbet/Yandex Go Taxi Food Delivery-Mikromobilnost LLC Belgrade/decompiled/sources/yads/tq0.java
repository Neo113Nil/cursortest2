package yads;

import android.view.View;
import defpackage.ny61;
import defpackage.yp81;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public final class tq0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ yp81 a;

    public tq0(yp81 yp81Var) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        for (Map.Entry entry : yp81.access$getBoundViewHolders$p(null).entrySet()) {
            if (entry.getKey() != null) {
                ny61.u();
                return;
            }
            yp81.access$bindHolder(null, null, ((Number) entry.getValue()).intValue());
        }
        yp81.access$registerTrackers(null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        yp81.access$unregisterTrackers(null);
        Iterator it = yp81.access$getBoundViewHolders$p(null).keySet().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                ny61.u();
                return;
            }
            yp81.access$unbindHolder(null, null);
        }
    }
}
