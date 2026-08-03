package f1;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import b0.p0;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Iterator;
import org.fortheloss.st.R;
import y1.a2;
import yc.r1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements View.OnAttachStateChangeListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2223g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2224h;

    public /* synthetic */ e(int i10, Object obj) {
        this.f2223g = i10;
        this.f2224h = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f2223g) {
            case 0:
                f fVar = (f) this.f2224h;
                Context context = view.getContext();
                if (!fVar.f2246d) {
                    context.getApplicationContext().registerComponentCallbacks(fVar.f2247e);
                    fVar.f2246d = true;
                    break;
                }
                break;
            case 3:
                y1.y yVar = (y1.y) this.f2224h;
                AccessibilityManager accessibilityManager = yVar.f8682g;
                yVar.f8686k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                accessibilityManager.addAccessibilityStateChangeListener(yVar.f8684i);
                accessibilityManager.addTouchExplorationStateChangeListener(yVar.f8685j);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z10;
        switch (this.f2223g) {
            case 0:
                f fVar = (f) this.f2224h;
                Context context = view.getContext();
                if (fVar.f2246d) {
                    context.getApplicationContext().unregisterComponentCallbacks(fVar.f2247e);
                    fVar.f2246d = false;
                    break;
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                l.e eVar = (l.e) this.f2224h;
                ViewTreeObserver viewTreeObserver = eVar.D;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        eVar.D = view.getViewTreeObserver();
                    }
                    eVar.D.removeGlobalOnLayoutListener(eVar.f3671o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                l.q qVar = (l.q) this.f2224h;
                ViewTreeObserver viewTreeObserver2 = qVar.f3762u;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        qVar.f3762u = view.getViewTreeObserver();
                    }
                    qVar.f3762u.removeGlobalOnLayoutListener(qVar.f3756o);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                y1.y yVar = (y1.y) this.f2224h;
                yVar.f8687l.removeCallbacks(yVar.N);
                AccessibilityManager accessibilityManager = yVar.f8682g;
                accessibilityManager.removeAccessibilityStateChangeListener(yVar.f8684i);
                accessibilityManager.removeTouchExplorationStateChangeListener(yVar.f8685j);
                break;
            case 4:
                y1.a aVar = (y1.a) this.f2224h;
                ViewParent parent = aVar.getParent();
                Iterator it = (parent == null ? wc.b.f7711a : new wc.d(1, new p0(20, parent), h3.y.f2835o)).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            pc.j.e(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z10 = true;
                            }
                        }
                    }
                }
                if (!z10) {
                    a2 a2Var = aVar.f8459i;
                    if (a2Var != null) {
                        a2Var.c();
                    }
                    aVar.f8459i = null;
                    aVar.requestLayout();
                    break;
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((r1) this.f2224h).a(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }
}
