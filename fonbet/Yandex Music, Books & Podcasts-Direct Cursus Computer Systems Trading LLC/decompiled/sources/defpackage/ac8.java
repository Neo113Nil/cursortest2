package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

/* loaded from: classes3.dex */
public final class ac8 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public ac8(ListYandexPlayerView listYandexPlayerView, oag oagVar) {
        this.a = 1;
        this.b = listYandexPlayerView;
        this.c = oagVar;
        listYandexPlayerView.addOnAttachStateChangeListener(this);
        if (listYandexPlayerView.isAttachedToWindow()) {
            onViewAttachedToWindow(listYandexPlayerView);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.a) {
            case 0:
                ((gc8) this.b).removeOnAttachStateChangeListener(this);
                gc8 gc8Var = (gc8) this.c;
                gc8Var.getDiv2Component$div_release().v().a(gc8Var);
                break;
            case 1:
                view.getClass();
                ((ListYandexPlayerView) this.b).getViewTreeObserver().addOnDrawListener((oag) this.c);
                break;
            case 2:
                view.getClass();
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.c).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity != null && iBinder != null) {
                    ((nfq) this.b).c(iBinder, activity);
                    break;
                }
                break;
            case 3:
                z5 z5Var = (z5) this.b;
                dzf E = swf.E(z5Var);
                if (E == null) {
                    sme.c("View tree for " + z5Var + " has no ViewTreeLifecycleOwner");
                    rj7.f();
                    break;
                } else {
                    ((xqn) this.c).a = ocg.n(z5Var, E.getLifecycle());
                    z5Var.removeOnAttachStateChangeListener(this);
                    break;
                }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                view.getClass();
                ((ListYandexPlayerView) this.b).getViewTreeObserver().removeOnDrawListener((oag) this.c);
                break;
            case 2:
                view.getClass();
                break;
            case 3:
                break;
            case 4:
                ((ImageView) this.b).removeOnAttachStateChangeListener(this);
                pcg.K((View) this.c, null);
                break;
            default:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                ((cnn) this.c).w();
                break;
        }
    }

    public /* synthetic */ ac8(View view, Object obj, int i) {
        this.a = i;
        this.b = view;
        this.c = obj;
    }

    public ac8(nfq nfqVar, Activity activity) {
        this.a = 2;
        nfqVar.getClass();
        this.b = nfqVar;
        this.c = new WeakReference(activity);
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }
}
