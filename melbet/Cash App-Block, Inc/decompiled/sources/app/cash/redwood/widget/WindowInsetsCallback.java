package app.cash.redwood.widget;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import bo.app.xg$$ExternalSyntheticLambda9;
import com.google.android.gms.internal.measurement.zzabh;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class WindowInsetsCallback extends zzabh implements OnApplyWindowInsetsListener, View.OnAttachStateChangeListener {
    public final xg$$ExternalSyntheticLambda9 listener;

    public WindowInsetsCallback(xg$$ExternalSyntheticLambda9 xg__externalsyntheticlambda9) {
        super(0);
        this.listener = xg__externalsyntheticlambda9;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        view.getClass();
        this.listener.invoke(windowInsetsCompat);
        WindowInsetsCompat windowInsetsCompat2 = WindowInsetsCompat.CONSUMED;
        windowInsetsCompat2.getClass();
        return windowInsetsCompat2;
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List list) {
        windowInsetsCompat.getClass();
        list.getClass();
        this.listener.invoke(windowInsetsCompat);
        WindowInsetsCompat windowInsetsCompat2 = WindowInsetsCompat.CONSUMED;
        windowInsetsCompat2.getClass();
        return windowInsetsCompat2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        view.requestApplyInsets();
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        this.listener.invoke(ViewCompat.Api23Impl.getRootWindowInsets(view));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}
