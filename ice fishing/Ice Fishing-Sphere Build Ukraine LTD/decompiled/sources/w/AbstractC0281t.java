package w;

import android.view.View;
import com.icecatchbiger.hookfrostmaster.R;
import java.util.Objects;
import y.AbstractC0296a;

/* renamed from: w.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0281t {
    public static void a(View view, InterfaceC0284w interfaceC0284w) {
        k.i iVar = (k.i) view.getTag(R.id.tag_unhandled_key_listeners);
        if (iVar == null) {
            iVar = new k.i();
            view.setTag(R.id.tag_unhandled_key_listeners, iVar);
        }
        Objects.requireNonNull(interfaceC0284w);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0280s = new ViewOnUnhandledKeyEventListenerC0280s();
        iVar.put(interfaceC0284w, viewOnUnhandledKeyEventListenerC0280s);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0280s);
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

    public static void e(View view, InterfaceC0284w interfaceC0284w) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        k.i iVar = (k.i) view.getTag(R.id.tag_unhandled_key_listeners);
        if (iVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) iVar.getOrDefault(interfaceC0284w, null)) == null) {
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

    public static void i(View view, AbstractC0296a abstractC0296a) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }
}
