package M0;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b0.C0117a;
import com.lumenpath.harispro.hrnavigator.R;
import v0.AbstractC0360a;

/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: g, reason: collision with root package name */
    public final float f619g;

    /* renamed from: h, reason: collision with root package name */
    public final float f620h;

    public i(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f619g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f620h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f606b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new C0117a(1));
        return animatorSet;
    }

    public final void b(float f2) {
        float interpolation = this.f605a.getInterpolation(f2);
        View view = this.f606b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= RecyclerView.f2111C0 || height <= RecyclerView.f2111C0) {
            return;
        }
        float f3 = this.f619g / width;
        float f4 = this.f620h / height;
        float a2 = 1.0f - AbstractC0360a.a(RecyclerView.f2111C0, f3, interpolation);
        float a3 = 1.0f - AbstractC0360a.a(RecyclerView.f2111C0, f4, interpolation);
        view.setScaleX(a2);
        view.setPivotY(height);
        view.setScaleY(a3);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(a3 != RecyclerView.f2111C0 ? a2 / a3 : 1.0f);
            }
        }
    }
}
