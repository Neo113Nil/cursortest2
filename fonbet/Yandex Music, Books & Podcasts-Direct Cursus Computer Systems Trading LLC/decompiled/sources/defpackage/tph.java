package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public final class tph extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;

    public tph(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.a = 2;
        this.d = swipeRefreshLayout;
        this.b = i;
        this.c = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        View view = this.d;
        switch (i) {
            case 0:
                aqh.m(i3 - ((int) ((i3 - i2) * f)), view);
                break;
            case 1:
                int i4 = i2 + ((int) ((i3 - i2) * f));
                int i5 = wqh.z0;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i4;
                view.setLayoutParams(layoutParams);
                break;
            default:
                ((SwipeRefreshLayout) view).z.setAlpha((int) (((i2 - i3) * f) + i3));
                break;
        }
    }

    public /* synthetic */ tph(int i, int i2, int i3, View view) {
        this.a = i3;
        this.b = i;
        this.c = i2;
        this.d = view;
    }
}
