package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import com.yandex.bubbles.BubblePopupWindow;
import com.yandex.div.core.view2.debugview.a;
import com.yandex.div.core.view2.debugview.b;
import com.ybsdk.widgets.tooltip.util.TooltipPopupWindow;

/* loaded from: classes11.dex */
public final /* synthetic */ class xwg implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xwg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver;
        View contentView;
        View rootView;
        ViewTreeObserver viewTreeObserver2;
        ViewTreeObserver viewTreeObserver3;
        View contentView2;
        View rootView2;
        ViewTreeObserver viewTreeObserver4;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b bVar = ((a) obj).c;
                bVar.d(h3u0.a(bVar.n, false, false, null, null, null, 30));
                break;
            case 1:
                com.yandex.bubbles.b bVar2 = (com.yandex.bubbles.b) obj;
                BubblePopupWindow bubblePopupWindow = bVar2.e;
                if (bubblePopupWindow != null && (contentView = bubblePopupWindow.getContentView()) != null && (rootView = contentView.getRootView()) != null && (viewTreeObserver2 = rootView.getViewTreeObserver()) != null) {
                    viewTreeObserver2.removeOnPreDrawListener(bVar2.f);
                }
                View view = bVar2.g;
                if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                    viewTreeObserver.removeOnPreDrawListener(bVar2.f);
                }
                bVar2.f = null;
                BubblePopupWindow bubblePopupWindow2 = bVar2.e;
                if (bubblePopupWindow2 != null) {
                    bubblePopupWindow2.setContentView(null);
                }
                bVar2.e = null;
                bVar2.g = null;
                bVar2.c.invoke();
                break;
            default:
                com.ybsdk.widgets.tooltip.a aVar = (com.ybsdk.widgets.tooltip.a) obj;
                TooltipPopupWindow tooltipPopupWindow = aVar.u;
                if (tooltipPopupWindow != null && (contentView2 = tooltipPopupWindow.getContentView()) != null && (rootView2 = contentView2.getRootView()) != null && (viewTreeObserver4 = rootView2.getViewTreeObserver()) != null) {
                    viewTreeObserver4.removeOnPreDrawListener(aVar.v);
                }
                View view2 = aVar.x;
                if (view2 != null && (viewTreeObserver3 = view2.getViewTreeObserver()) != null) {
                    viewTreeObserver3.removeOnPreDrawListener(aVar.v);
                }
                View view3 = aVar.x;
                if (view3 != null) {
                    view3.removeOnAttachStateChangeListener(aVar.w);
                }
                aVar.v = null;
                TooltipPopupWindow tooltipPopupWindow2 = aVar.u;
                if (tooltipPopupWindow2 != null) {
                    tooltipPopupWindow2.setContentView(null);
                }
                aVar.u = null;
                aVar.x = null;
                aVar.i.invoke(aVar.B);
                break;
        }
    }
}
