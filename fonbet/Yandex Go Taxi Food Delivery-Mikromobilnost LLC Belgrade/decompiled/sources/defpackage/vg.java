package defpackage;

import android.view.View;
import android.webkit.WebView;
import com.yandex.plus.home.feature.webviews.internal.accessibility.AccessibilityFocusController$registerView$lambda$1$$inlined$doOnDetach$1;
import defpackage.vg;
import java.util.ArrayList;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class vg {
    public final ArrayList a = new ArrayList();

    public static void a(View view) {
        if (view != null) {
            view.performAccessibilityAction(64, null);
            view.sendAccessibilityEvent(8);
        }
    }

    public final void b(final WebView webView) {
        webView.setFocusable(true);
        webView.setFocusableInTouchMode(true);
        if (!webView.isAttachedToWindow()) {
            webView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.plus.home.feature.webviews.internal.accessibility.AccessibilityFocusController$registerView$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    webView.removeOnAttachStateChangeListener(this);
                    this.a.add(webView);
                    View view2 = webView;
                    boolean isAttachedToWindow = view2.isAttachedToWindow();
                    vg vgVar = this;
                    if (isAttachedToWindow) {
                        view2.addOnAttachStateChangeListener(new AccessibilityFocusController$registerView$lambda$1$$inlined$doOnDetach$1(view2, vgVar, webView));
                    } else {
                        vgVar.a.remove(webView);
                        vg.a((View) a.b0(this.a));
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            });
            return;
        }
        ArrayList arrayList = this.a;
        arrayList.add(webView);
        if (webView.isAttachedToWindow()) {
            webView.addOnAttachStateChangeListener(new AccessibilityFocusController$registerView$lambda$1$$inlined$doOnDetach$1(webView, this, webView));
        } else {
            arrayList.remove(webView);
            a((View) a.b0(arrayList));
        }
    }
}
