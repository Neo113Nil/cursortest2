package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import m.J0;
import m.N;
import m.Q;

/* renamed from: l.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0220d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3666b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0220d(int i, Object obj) {
        this.f3665a = i;
        this.f3666b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f3665a) {
            case 0:
                ViewOnKeyListenerC0223g viewOnKeyListenerC0223g = (ViewOnKeyListenerC0223g) this.f3666b;
                if (viewOnKeyListenerC0223g.a()) {
                    ArrayList arrayList = viewOnKeyListenerC0223g.f3679h;
                    if (arrayList.size() > 0 && !((C0222f) arrayList.get(0)).f3671a.f3827y) {
                        View view = viewOnKeyListenerC0223g.f3684o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0222f) it.next()).f3671a.c();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0223g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0215D viewOnKeyListenerC0215D = (ViewOnKeyListenerC0215D) this.f3666b;
                if (viewOnKeyListenerC0215D.a()) {
                    J0 j02 = viewOnKeyListenerC0215D.f3638h;
                    if (!j02.f3827y) {
                        View view2 = viewOnKeyListenerC0215D.f3641m;
                        if (view2 != null && view2.isShown()) {
                            j02.c();
                            break;
                        } else {
                            viewOnKeyListenerC0215D.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                Q q2 = (Q) this.f3666b;
                if (!q2.getInternalPopup().a()) {
                    q2.f3872f.h(q2.getTextDirection(), q2.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = q2.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                N n2 = (N) this.f3666b;
                Q q3 = n2.f3859G;
                n2.getClass();
                if (!q3.isAttachedToWindow() || !q3.getGlobalVisibleRect(n2.f3857E)) {
                    n2.dismiss();
                    break;
                } else {
                    n2.s();
                    n2.c();
                    break;
                }
                break;
        }
    }
}
