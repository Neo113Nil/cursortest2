package L0;

import O.AbstractC0049z;
import O.K;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = K.f747a;
        AbstractC0049z.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
