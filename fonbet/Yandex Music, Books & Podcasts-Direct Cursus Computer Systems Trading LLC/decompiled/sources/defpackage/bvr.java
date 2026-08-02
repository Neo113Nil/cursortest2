package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public final class bvr extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ bvr(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.a = i;
        this.b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        switch (this.a) {
            case 0:
                this.b.setAnimationProgress(f);
                break;
            case 1:
                this.b.setAnimationProgress(1.0f - f);
                break;
            case 2:
                SwipeRefreshLayout swipeRefreshLayout = this.b;
                int abs = swipeRefreshLayout.x - Math.abs(swipeRefreshLayout.w);
                swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.v + ((int) ((abs - r1) * f))) - swipeRefreshLayout.t.getTop());
                pl4 pl4Var = swipeRefreshLayout.z;
                float f2 = 1.0f - f;
                ol4 ol4Var = pl4Var.a;
                if (f2 != ol4Var.p) {
                    ol4Var.p = f2;
                }
                pl4Var.invalidateSelf();
                break;
            default:
                this.b.j(f);
                break;
        }
    }
}
