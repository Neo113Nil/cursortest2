package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import m.r0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3659g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f3660h;

    public /* synthetic */ c(j jVar, int i10) {
        this.f3659g = i10;
        this.f3660h = jVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f3659g) {
            case 0:
                e eVar = (e) this.f3660h;
                ArrayList arrayList = eVar.f3670n;
                if (eVar.j() && arrayList.size() > 0) {
                    int i10 = 0;
                    if (!((d) arrayList.get(0)).f3661a.A) {
                        View view = eVar.f3677u;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                ((d) obj).f3661a.b();
                            }
                            break;
                        } else {
                            eVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                q qVar = (q) this.f3660h;
                r0 r0Var = qVar.f3755n;
                if (qVar.j() && !r0Var.A) {
                    View view2 = qVar.f3760s;
                    if (view2 != null && view2.isShown()) {
                        r0Var.b();
                        break;
                    } else {
                        qVar.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
