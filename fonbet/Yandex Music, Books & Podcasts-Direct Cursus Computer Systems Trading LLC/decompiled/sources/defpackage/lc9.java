package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lc9 extends qpn {
    public final /* synthetic */ RecyclerView f;
    public final /* synthetic */ oc9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc9(RecyclerView recyclerView, oc9 oc9Var) {
        super(recyclerView);
        this.f = recyclerView;
        this.g = oc9Var;
    }

    @Override // androidx.core.view.a
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        oc9 oc9Var;
        int Y;
        if (accessibilityEvent.getEventType() == 32768) {
            int i = oc9.n;
            View view2 = view;
            do {
                oc9Var = this.g;
                if (Intrinsics.d(view2, oc9Var.getRecyclerView())) {
                    break;
                }
                if (view2 instanceof j1a) {
                    break;
                }
                Object parent = view2.getParent();
                view2 = parent instanceof View ? (View) parent : null;
            } while (view2 != null);
            view2 = null;
            if (view2 != null && oc9Var.getCurrentItem$div_release() != (Y = RecyclerView.Y(view2)) && Y != -1) {
                this.f.performAccessibilityAction(Y > oc9Var.getCurrentItem$div_release() ? 4096 : RemoteCameraConfig.Notification.ID, null);
            }
        }
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
