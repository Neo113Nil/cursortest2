package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.b;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.g;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.ChipsComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public final class yqb extends AccessibilityDelegateCompat {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public yqb(SlidingPaneLayout slidingPaneLayout) {
        this.a = 5;
        this.b = slidingPaneLayout;
        this.c = new Rect();
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.a) {
            case 5:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
                break;
            default:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        zqb zqbVar;
        g gVar;
        g gVar2;
        CharSequence a;
        String obj;
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                zqbVar = ((ChipsComponent) obj2).currentState;
                CharSequence charSequence = zqbVar.b;
                whVar.t(((Object) charSequence) + Extension.FIX_SPACE + ((String) this.b));
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                whVar.b(new ph(16, ((u1c) obj2).c.b));
                whVar.t((String) this.b);
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                LoadableInput loadableInput = (LoadableInput) obj2;
                gVar = loadableInput.state;
                if (gVar.h) {
                    gVar2 = loadableInput.state;
                    Text text = gVar2.i;
                    if (text != null && (a = d.a((Context) this.b, text)) != null && (obj = a.toString()) != null) {
                        whVar.a.setError(obj);
                        break;
                    }
                }
                break;
            case 3:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                String str = (String) this.b;
                if (str != null && str.length() != 0) {
                    whVar.b(new ph(16, str));
                }
                CharSequence charSequence2 = (CharSequence) obj2;
                if (charSequence2 != null) {
                    whVar.p(charSequence2);
                    break;
                }
                break;
            case 4:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.t((String) this.b);
                whVar.a.setTraversalBefore((View) obj2);
                whVar.q(false);
                whVar.i(ph.g);
                break;
            case 5:
                SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) this.b;
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(whVar.a);
                wh whVar2 = new wh(obtain);
                super.onInitializeAccessibilityNodeInfo(view, whVar2);
                Rect rect = (Rect) obj2;
                whVar2.f(rect);
                whVar.l(rect);
                whVar.G(obtain.isVisibleToUser());
                whVar.z(obtain.getPackageName());
                whVar.p(obtain.getClassName());
                whVar.t(obtain.getContentDescription());
                whVar.v(obtain.isEnabled());
                whVar.q(obtain.isClickable());
                whVar.w(obtain.isFocusable());
                boolean isFocused = obtain.isFocused();
                AccessibilityNodeInfo accessibilityNodeInfo = whVar.a;
                accessibilityNodeInfo.setFocused(isFocused);
                whVar.j(obtain.isAccessibilityFocused());
                whVar.C(obtain.isSelected());
                whVar.y(obtain.isLongClickable());
                whVar.a(obtain.getActions());
                accessibilityNodeInfo.setMovementGranularities(obtain.getMovementGranularities());
                whVar.p("androidx.slidingpanelayout.widget.SlidingPaneLayout");
                whVar.c = -1;
                accessibilityNodeInfo.setSource(view);
                WeakHashMap weakHashMap = b.a;
                Object parentForAccessibility = view.getParentForAccessibility();
                if (parentForAccessibility instanceof View) {
                    whVar.A((View) parentForAccessibility);
                }
                int childCount = slidingPaneLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = slidingPaneLayout.getChildAt(i2);
                    if (!slidingPaneLayout.isDimmed(childAt) && childAt.getVisibility() == 0) {
                        childAt.setImportantForAccessibility(1);
                        accessibilityNodeInfo.addChild(childAt);
                    }
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                CharSequence text2 = ((ListItemComponent) obj2).title().getText();
                whVar.t(((Object) text2) + Extension.FIX_SPACE + ((com.yandex.go.taxi.order.superapp.orders.ui.b) this.b).B0.getCurrentContentDescription());
                break;
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.a) {
            case 5:
                if (!((SlidingPaneLayout) this.b).isDimmed(view)) {
                    break;
                }
                break;
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public /* synthetic */ yqb(String str, int i, Object obj) {
        this.a = i;
        this.b = str;
        this.c = obj;
    }

    public yqb(u1c u1cVar) {
        this.a = 1;
        this.c = u1cVar;
    }

    public /* synthetic */ yqb(ViewGroup viewGroup, Object obj, int i) {
        this.a = i;
        this.c = viewGroup;
        this.b = obj;
    }
}
