package g;

import android.view.View;
import android.view.ViewTreeObserver;
import h.M;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: g.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0143c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1922f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f1923g;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0143c(l lVar, int i2) {
        this.f1922f = i2;
        this.f1923g = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f1922f) {
            case 0:
                ViewOnKeyListenerC0147g viewOnKeyListenerC0147g = (ViewOnKeyListenerC0147g) this.f1923g;
                if (viewOnKeyListenerC0147g.c()) {
                    ArrayList arrayList = viewOnKeyListenerC0147g.f1944m;
                    if (arrayList.size() > 0 && !((C0146f) arrayList.get(0)).f1930a.f2111z) {
                        View view = viewOnKeyListenerC0147g.f1950t;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0146f) it.next()).f1930a.f();
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
                s sVar = (s) this.f1923g;
                if (sVar.c()) {
                    M m2 = sVar.f2029m;
                    if (!m2.f2111z) {
                        View view2 = sVar.r;
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
