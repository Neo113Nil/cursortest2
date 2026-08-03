package d;

import android.view.View;
import android.view.Window;
import com.onesignal.inAppMessages.internal.display.impl.a;
import org.fortheloss.st.MainActivity;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements androidx.lifecycle.s {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1493h;

    public /* synthetic */ h(int i10, Object obj) {
        this.f1492g = i10;
        this.f1493h = obj;
    }

    @Override // androidx.lifecycle.s
    public final void b(androidx.lifecycle.u uVar, androidx.lifecycle.o oVar) {
        Window window;
        View peekDecorView;
        switch (this.f1492g) {
            case 0:
                MainActivity mainActivity = (MainActivity) this.f1493h;
                if (oVar == androidx.lifecycle.o.ON_STOP && (window = mainActivity.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                MainActivity mainActivity2 = (MainActivity) this.f1493h;
                if (oVar == androidx.lifecycle.o.ON_DESTROY) {
                    mainActivity2.f1511h.f2171b = null;
                    if (!mainActivity2.isChangingConfigurations()) {
                        mainActivity2.g().a();
                    }
                    m mVar = mainActivity2.f1515l;
                    MainActivity mainActivity3 = mVar.f1501j;
                    mainActivity3.getWindow().getDecorView().removeCallbacks(mVar);
                    mainActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(mVar);
                    break;
                }
                break;
            default:
                g4.a aVar = (g4.a) this.f1493h;
                if (oVar != androidx.lifecycle.o.ON_START) {
                    if (oVar == androidx.lifecycle.o.ON_STOP) {
                        aVar.f2514h = false;
                        break;
                    }
                } else {
                    aVar.f2514h = true;
                    break;
                }
                break;
        }
    }
}
