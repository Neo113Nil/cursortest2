package g;

import android.view.View;
import android.view.ViewTreeObserver;
import h.L;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f3010b;

    public /* synthetic */ c(l lVar, int i2) {
        this.f3009a = i2;
        this.f3010b = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f3009a) {
            case 0:
                g gVar = (g) this.f3010b;
                if (gVar.i()) {
                    ArrayList arrayList = gVar.f3026h;
                    if (arrayList.size() > 0 && !((f) arrayList.get(0)).f3017a.f3177u) {
                        View view = gVar.f3033o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((f) it.next()).f3017a.c();
                            }
                            break;
                        } else {
                            gVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                s sVar = (s) this.f3010b;
                if (sVar.i()) {
                    L l2 = sVar.f3116h;
                    if (!l2.f3177u) {
                        View view2 = sVar.f3121m;
                        if (view2 != null && view2.isShown()) {
                            l2.c();
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
