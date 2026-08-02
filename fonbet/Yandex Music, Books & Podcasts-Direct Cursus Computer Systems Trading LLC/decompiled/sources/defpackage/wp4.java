package defpackage;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.ClockHandView;

/* loaded from: classes3.dex */
public final class wp4 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ wp4(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ClockFaceView clockFaceView = (ClockFaceView) this.b;
                ClockHandView clockHandView = clockFaceView.t;
                if (clockFaceView.isShown()) {
                    clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
                    int height = ((clockFaceView.getHeight() / 2) - clockHandView.d) - clockFaceView.B;
                    if (height != clockFaceView.r) {
                        clockFaceView.r = height;
                        clockFaceView.u();
                        clockHandView.l = clockFaceView.r;
                        clockHandView.invalidate();
                        break;
                    }
                }
                break;
            default:
                ((CoordinatorLayout) this.b).A(0);
                break;
        }
        return true;
    }
}
