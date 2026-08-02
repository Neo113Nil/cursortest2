package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.animation.core.c;
import androidx.compose.foundation.text.g;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat$Api21Impl;
import com.yandex.go.flex.common.facade.b;
import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteButtonType;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import ru.yandex.taxi.logistics.sdk.webview.impl.ui.a;

/* loaded from: classes10.dex */
public final class te4 implements i1k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ te4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.i1k
    public final void dispose() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                qe4 qe4Var = (qe4) obj2;
                sfd sfdVar = (sfd) obj;
                if (qe4Var.a == null) {
                    if (qe4Var.b == null) {
                        ny61.r("Unreachable");
                        break;
                    } else {
                        sfdVar.a.g();
                        break;
                    }
                } else {
                    sfdVar.b.f();
                    break;
                }
            case 1:
                ((vt8) obj2).b0();
                ((a) ((wm41) obj)).c();
                break;
            case 2:
                ((pey) obj2).getLifecycle().d((wj6) obj);
                break;
            case 3:
                ((View) obj2).getViewTreeObserver().removeOnGlobalLayoutListener((phd) obj);
                break;
            case 4:
                ((View) obj2).getViewTreeObserver().removeOnPreDrawListener((qhd) obj);
                break;
            case 5:
                a151 a151Var = (a151) ((tgg) obj2).a.get(((n351) obj).a);
                if (a151Var != null) {
                    a151Var.c();
                    break;
                }
                break;
            case 6:
                ((tls) obj2).invoke((o5n) obj);
                break;
            case 7:
                ((wg6) obj2).g((fer) obj);
                break;
            case 8:
                ((c) obj2).b.j((osv) obj);
                break;
            case 9:
                if (((Boolean) ((sls) obj2).invoke()).booleanValue()) {
                    ((sls) obj).invoke();
                    break;
                }
                break;
            case 10:
                ((e7y) obj2).c.k(obj);
                break;
            case 11:
                Window window = (Window) obj;
                float floatValue = ((tx40) obj2).getFloatValue();
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.screenBrightness = floatValue;
                window.setAttributes(attributes);
                break;
            case 12:
                ((wg6) obj2).g((mx40) obj);
                break;
            case 13:
                ((AccessibilityManager) obj2).removeTouchExplorationStateChangeListener((sje) obj);
                break;
            case 14:
                ((b) ((xhr) obj2)).c();
                pjr pjrVar = (pjr) obj;
                if (pjrVar != null) {
                    ((com.yandex.div.core.expression.variables.a) ((hzk) pjrVar).b).k("handleInsetsInFlex", "ignoreFitSystemWindows");
                    break;
                }
                break;
            case 15:
                ((ExecutorService) obj2).shutdown();
                i5f0 i5f0Var = i5f0.b;
                ((i5f0) v5a1.c((Context) obj).get()).g();
                break;
            case 16:
                ((pey) obj2).getLifecycle().d((wu5) obj);
                break;
            case 17:
                ((dhd) obj2).a(obj);
                break;
            case 18:
                oz40 oz40Var = (oz40) obj2;
                jxe0 jxe0Var = (jxe0) oz40Var.getValue();
                if (jxe0Var != null) {
                    ixe0 ixe0Var = new ixe0(jxe0Var);
                    zx40 zx40Var = (zx40) obj;
                    if (zx40Var != null) {
                        ((ay40) zx40Var).b(ixe0Var);
                    }
                    oz40Var.setValue(null);
                    break;
                }
                break;
            case 19:
                ((g) obj2).c.remove((tls) obj);
                break;
            case 20:
                puz0 puz0Var = ((quz0) obj2).f;
                if (puz0Var != null) {
                    ((tls) obj).invoke(puz0Var);
                    break;
                }
                break;
            case 21:
                ((zx01) obj2).i.remove((tx01) obj);
                break;
            case 22:
                f811 f811Var = (f811) obj2;
                f811Var.getClass();
                f811Var.b.c(((g811) obj).a, f811Var.c, MultimodalRouteAnalytics$MultimodalRouteButtonType.ModalClose);
                break;
            case 23:
                androidx.core.view.b.p((ViewGroup) obj2, (AccessibilityDelegateCompat) obj);
                break;
            default:
                androidx.compose.foundation.layout.a aVar = (androidx.compose.foundation.layout.a) obj2;
                View view = (View) obj;
                int i2 = aVar.u - 1;
                aVar.u = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = androidx.core.view.b.a;
                    ViewCompat$Api21Impl.o(view, null);
                    androidx.core.view.b.u(view, null);
                    view.removeOnAttachStateChangeListener(aVar.v);
                    break;
                }
                break;
        }
    }
}
