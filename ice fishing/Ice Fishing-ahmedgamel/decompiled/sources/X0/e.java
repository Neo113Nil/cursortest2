package X0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.IceFishing.LiveIceFishing.C5248R;
import com.IceFishing.LiveIceFishing.IntroActivity;

/* loaded from: classes.dex */
public final class e extends G0.a {

    /* renamed from: a, reason: collision with root package name */
    public IntroActivity f3750a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3751b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f3752c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f3753d;

    @Override // G0.a
    public final void a(ViewPager viewPager, Object obj) {
        viewPager.removeView((View) obj);
    }

    @Override // G0.a
    public final int b() {
        return this.f3751b.length;
    }

    @Override // G0.a
    public final View c(ViewPager viewPager, int i) {
        View inflate = ((LayoutInflater) this.f3750a.getSystemService("layout_inflater")).inflate(C5248R.layout.item_slide_layout, (ViewGroup) viewPager, false);
        ((ImageView) inflate.findViewById(C5248R.id.im_LogoSlide)).setImageResource(this.f3751b[i]);
        ((TextView) inflate.findViewById(C5248R.id.textTitle)).setText(this.f3752c[i]);
        ((TextView) inflate.findViewById(C5248R.id.textDes)).setText(this.f3753d[i]);
        viewPager.addView(inflate);
        return inflate;
    }

    @Override // G0.a
    public final boolean d(View view, Object obj) {
        return view == obj;
    }
}
