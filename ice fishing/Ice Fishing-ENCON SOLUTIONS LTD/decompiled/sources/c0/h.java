package c0;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final i f2644a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f2645b;

    public h(i sidecarCompat, Activity activity) {
        kotlin.jvm.internal.i.e(sidecarCompat, "sidecarCompat");
        this.f2644a = sidecarCompat;
        this.f2645b = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        kotlin.jvm.internal.i.e(view, "view");
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.f2645b.get();
        IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (activity == null || iBinder == null) {
            return;
        }
        this.f2644a.g(iBinder, activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        kotlin.jvm.internal.i.e(view, "view");
    }
}
