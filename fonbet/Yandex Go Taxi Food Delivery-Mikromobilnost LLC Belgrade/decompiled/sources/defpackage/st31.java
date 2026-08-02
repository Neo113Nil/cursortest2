package defpackage;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class st31 extends e890 {
    public final ArrayList c;

    public st31(ArrayList arrayList) {
        this.c = arrayList;
    }

    @Override // defpackage.e890
    public final void a(ViewPager viewPager, int i, Object obj) {
        viewPager.removeView((View) this.c.get(i));
    }

    @Override // defpackage.e890
    public final int b() {
        return this.c.size();
    }

    @Override // defpackage.e890
    public final Object d(ViewPager viewPager, int i) {
        View view = (View) this.c.get(i);
        viewPager.addView(view);
        return view;
    }

    @Override // defpackage.e890
    public final boolean e(View view, Object obj) {
        return view == obj;
    }
}
