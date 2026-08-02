package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.yandex.go.image_viewer.ScalingContentViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.design.ScalableImageView;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes12.dex */
public final class yrs extends e890 {
    public final ScalingContentViewPager c;
    public final pav d;
    public final i3y e = a.b(LazyThreadSafetyMode.NONE, new dnr(14, this));
    public final ArrayList f = new ArrayList();

    public yrs(ScalingContentViewPager scalingContentViewPager, pav pavVar) {
        this.c = scalingContentViewPager;
        this.d = pavVar;
    }

    public static void l(boolean z, dna dnaVar) {
        ((CircularProgressIndicator) dnaVar.c).setVisibility(!z ? 0 : 8);
        ((ImageView) dnaVar.f).setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = (FrameLayout) dnaVar.e;
        frameLayout.setClickable(z);
        frameLayout.setVisibility(0);
    }

    @Override // defpackage.e890
    public final void a(ViewPager viewPager, int i, Object obj) {
        viewPager.removeView((View) obj);
    }

    @Override // defpackage.e890
    public final int b() {
        return this.f.size();
    }

    @Override // defpackage.e890
    public final int c(Object obj) {
        View view = obj instanceof View ? (View) obj : null;
        if (view == null) {
            return -1;
        }
        Iterator it = this.f.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (jl40.l(((kps0) it.next()).b, view.getTag())) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return -2;
        }
        return i;
    }

    @Override // defpackage.e890
    public final Object d(ViewPager viewPager, int i) {
        View inflate = LayoutInflater.from(this.c.getContext()).inflate(nth0.gallery_slider_item, (ViewGroup) null, false);
        int i2 = qih0.image;
        ScalableImageView scalableImageView = (ScalableImageView) cma1.O(i2, inflate);
        if (scalableImageView != null) {
            i2 = qih0.loading_bar;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) cma1.O(i2, inflate);
            if (circularProgressIndicator != null) {
                i2 = qih0.loading_container;
                FrameLayout frameLayout = (FrameLayout) cma1.O(i2, inflate);
                if (frameLayout != null) {
                    i2 = qih0.retry_icon;
                    ImageView imageView = (ImageView) cma1.O(i2, inflate);
                    if (imageView != null) {
                        FrameLayout frameLayout2 = (FrameLayout) inflate;
                        dna dnaVar = new dna(frameLayout2, scalableImageView, circularProgressIndicator, frameLayout, imageView, 3);
                        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                        if (layoutParams == null) {
                            ny61.t("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            return null;
                        }
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                        layoutParams2.height = ((Number) this.e.getValue()).intValue();
                        frameLayout.setLayoutParams(layoutParams2);
                        kps0 kps0Var = (kps0) this.f.get(i);
                        frameLayout2.setTag(kps0Var.b);
                        scalableImageView.setZoomEnabled(true);
                        c.z(new t7j(15, this, dnaVar, kps0Var), frameLayout);
                        l(false, dnaVar);
                        m(kps0Var, dnaVar);
                        viewPager.addView(frameLayout2);
                        return frameLayout2;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.e890
    public final boolean e(View view, Object obj) {
        return view == obj;
    }

    public final void m(kps0 kps0Var, dna dnaVar) {
        nac nacVar = (nac) this.d.a((ScalableImageView) dnaVar.b);
        nacVar.i = new dnr(this, dnaVar);
        nacVar.h = new s1r(23, dnaVar);
        nacVar.c(kps0Var.a);
    }
}
