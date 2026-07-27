package n4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.icefishing.icefishinglive2.C5275R;
import com.icefishing.icefishinglive2.IntroActivity;

/* loaded from: classes2.dex */
public final class e extends G0.a {

    /* renamed from: a, reason: collision with root package name */
    public IntroActivity f39488a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f39489b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f39490c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f39491d;

    @Override // G0.a
    public final void a(ViewPager viewPager, Object obj) {
        viewPager.removeView((View) obj);
    }

    @Override // G0.a
    public final int b() {
        return this.f39489b.length;
    }

    @Override // G0.a
    public final View c(ViewPager viewPager, int i) {
        View inflate = ((LayoutInflater) this.f39488a.getSystemService("layout_inflater")).inflate(C5275R.layout.item_slide_layout, (ViewGroup) viewPager, false);
        ((ImageView) inflate.findViewById(C5275R.id.im_LogoSlide)).setImageResource(this.f39489b[i]);
        ((TextView) inflate.findViewById(C5275R.id.textTitle)).setText(this.f39490c[i]);
        ((TextView) inflate.findViewById(C5275R.id.textDes)).setText(this.f39491d[i]);
        viewPager.addView(inflate);
        return inflate;
    }

    @Override // G0.a
    public final boolean d(View view, Object obj) {
        return view == obj;
    }
}
