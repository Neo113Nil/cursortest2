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
public final class ViewTreeObserverOnGlobalLayoutListenerC4658d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38685n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f38686u;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC4658d(int i, Object obj) {
        this.f38685n = i;
        this.f38686u = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f38685n) {
            case 0:
                ViewOnKeyListenerC4661g viewOnKeyListenerC4661g = (ViewOnKeyListenerC4661g) this.f38686u;
                if (viewOnKeyListenerC4661g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC4661g.f38692A;
                    if (arrayList.size() > 0 && !((C4660f) arrayList.get(0)).f38689a.f39052R) {
                        View view = viewOnKeyListenerC4661g.f38699H;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C4660f) it.next()).f38689a.show();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC4661g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC4653D viewOnKeyListenerC4653D = (ViewOnKeyListenerC4653D) this.f38686u;
                if (viewOnKeyListenerC4653D.a()) {
                    G0 g02 = viewOnKeyListenerC4653D.f38647A;
                    if (!g02.f39052R) {
                        View view2 = viewOnKeyListenerC4653D.f38652F;
                        if (view2 != null && view2.isShown()) {
                            g02.show();
                            break;
                        } else {
                            viewOnKeyListenerC4653D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                O o4 = (O) this.f38686u;
                if (!o4.getInternalPopup().a()) {
                    o4.f39119y.j(o4.getTextDirection(), o4.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = o4.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                L l9 = (L) this.f38686u;
                O o6 = l9.f39103Z;
                l9.getClass();
                if (!o6.isAttachedToWindow() || !o6.getGlobalVisibleRect(l9.f39102X)) {
                    l9.dismiss();
                    break;
                } else {
                    l9.o();
                    l9.show();
                    break;
                }
                break;
        }
    }
}
