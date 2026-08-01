package Z;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* renamed from: Z.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0076y implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1636a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1637b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1638c;

    public ViewOnAttachStateChangeListenerC0076y(LayoutInflaterFactory2C0077z layoutInflaterFactory2C0077z, T t2) {
        this.f1638c = layoutInflaterFactory2C0077z;
        this.f1637b = t2;
    }

    private final void a(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.f1636a) {
            case 0:
                T t2 = (T) this.f1637b;
                t2.k();
                C0063k.g((ViewGroup) t2.f1485c.f1584F.getParent(), ((LayoutInflaterFactory2C0077z) this.f1638c).f1639a).f();
                break;
            default:
                D1.i.e(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.f1638c).get();
                IBinder iBinder = null;
                if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (activity != null && iBinder != null) {
                    ((androidx.window.layout.r) this.f1637b).g(iBinder, activity);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1636a) {
            case 0:
                break;
            default:
                D1.i.e(view, "view");
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC0076y(androidx.window.layout.r rVar, Activity activity) {
        D1.i.e(rVar, "sidecarCompat");
        this.f1637b = rVar;
        this.f1638c = new WeakReference(activity);
    }
}
