package g;

import android.view.View;
import android.view.ViewTreeObserver;
import h.M;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: g.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0143c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f1931f;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0143c(l lVar, int i2) {
        this.f1930e = i2;
        this.f1931f = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f1930e) {
            case 0:
                ViewOnKeyListenerC0147g viewOnKeyListenerC0147g = (ViewOnKeyListenerC0147g) this.f1931f;
                if (viewOnKeyListenerC0147g.c()) {
                    ArrayList arrayList = viewOnKeyListenerC0147g.f1951l;
                    if (arrayList.size() > 0 && !((C0146f) arrayList.get(0)).f1938a.f2119y) {
                        View view = viewOnKeyListenerC0147g.f1957s;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0146f) it.next()).f1938a.f();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC0147g.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                s sVar = (s) this.f1931f;
                if (sVar.c()) {
                    M m2 = sVar.f2037l;
                    if (!m2.f2119y) {
                        View view2 = sVar.f2042q;
                        if (view2 != null && view2.isShown()) {
                            m2.f();
                            break;
                        } else {
                            sVar.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
