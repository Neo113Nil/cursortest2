package y;

import android.view.View;
import com.watchfacestudio.spraktum.R;
import java.util.Objects;

/* renamed from: y.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1086t {
    public static void a(View view, w wVar) {
        l.k kVar = (l.k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (kVar == null) {
            kVar = new l.k();
            view.setTag(R.id.tag_unhandled_key_listeners, kVar);
        }
        Objects.requireNonNull(wVar);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC1085s = new ViewOnUnhandledKeyEventListenerC1085s();
        kVar.put(wVar, viewOnUnhandledKeyEventListenerC1085s);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC1085s);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, w wVar) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        l.k kVar = (l.k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (kVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) kVar.getOrDefault(wVar, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i2) {
        return (T) view.requireViewById(i2);
    }

    public static void g(View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, A.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }
}
