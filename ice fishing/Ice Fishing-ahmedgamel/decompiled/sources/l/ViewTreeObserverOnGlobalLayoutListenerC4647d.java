package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import m.G0;
import m.L;
import m.O;

/* renamed from: l.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC4647d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38758n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f38759u;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC4647d(int i, Object obj) {
        this.f38758n = i;
        this.f38759u = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f38758n) {
            case 0:
                ViewOnKeyListenerC4650g viewOnKeyListenerC4650g = (ViewOnKeyListenerC4650g) this.f38759u;
                if (viewOnKeyListenerC4650g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC4650g.f38765A;
                    if (arrayList.size() > 0 && !((C4649f) arrayList.get(0)).f38762a.f38984R) {
                        View view = viewOnKeyListenerC4650g.f38772H;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C4649f) it.next()).f38762a.show();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC4650g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC4642D viewOnKeyListenerC4642D = (ViewOnKeyListenerC4642D) this.f38759u;
                if (viewOnKeyListenerC4642D.a()) {
                    G0 g02 = viewOnKeyListenerC4642D.f38720A;
                    if (!g02.f38984R) {
                        View view2 = viewOnKeyListenerC4642D.f38725F;
                        if (view2 != null && view2.isShown()) {
                            g02.show();
                            break;
                        } else {
                            viewOnKeyListenerC4642D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                O o6 = (O) this.f38759u;
                if (!o6.getInternalPopup().a()) {
                    o6.f39051y.j(o6.getTextDirection(), o6.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = o6.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                L l9 = (L) this.f38759u;
                O o9 = l9.f39035Z;
                l9.getClass();
                if (!o9.isAttachedToWindow() || !o9.getGlobalVisibleRect(l9.f39034X)) {
                    l9.dismiss();
                    break;
                } else {
                    l9.p();
                    l9.show();
                    break;
                }
                break;
        }
    }
}
