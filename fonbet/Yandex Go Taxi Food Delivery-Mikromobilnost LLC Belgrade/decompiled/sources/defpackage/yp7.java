package defpackage;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView;
import ru.yandex.taxi.preorder.summary.selector.ui.verticals.VerticalInternalTariffView;

/* loaded from: classes10.dex */
public final /* synthetic */ class yp7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;

    public /* synthetic */ yp7(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.w = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = false;
        int i2 = this.c;
        int i3 = this.b;
        Object obj = this.w;
        switch (i) {
            case 0:
                ((iq7) obj).b = i3;
                Integer.toBinaryString(i2);
                Integer.toBinaryString(i3);
                sgb1.g(5, "CameraController");
                break;
            case 1:
                x0 findViewHolderForAdapterPosition = ((RecyclerView) obj).findViewHolderForAdapterPosition(i3);
                KeyEvent.Callback callback = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.a : null;
                RecyclerView recyclerView = callback instanceof RecyclerView ? (RecyclerView) callback : null;
                if (recyclerView != null && recyclerView.getLayoutManager() != null && i2 >= 0) {
                    tkv0 tkv0Var = new tkv0(0, recyclerView.getContext());
                    tkv0Var.a = i2;
                    RecyclerView.e layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.v(tkv0Var);
                        break;
                    }
                }
                break;
            case 2:
                enw0 enw0Var = (enw0) obj;
                boolean z2 = true;
                if (enw0Var.i != i3) {
                    enw0Var.i = i3;
                    z = true;
                }
                if (enw0Var.h != i2) {
                    enw0Var.h = i2;
                } else {
                    z2 = z;
                }
                if (z2) {
                    enw0Var.f();
                    break;
                }
                break;
            case 3:
                ((SurfaceTextureHelper) obj).lambda$setTextureSize$2(i3, i2);
                break;
            case 4:
                ((SurfaceViewRenderer) obj).lambda$onFrameResolutionChanged$0(i3, i2);
                break;
            case 5:
                ((TariffsRibbonView) obj).scrollToItem(i3, i2);
                break;
            default:
                ((VerticalInternalTariffView) obj).scrollToItem(i3, i2);
                break;
        }
    }
}
