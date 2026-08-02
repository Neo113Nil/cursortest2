package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class bgu implements apn {
    @Override // defpackage.apn
    public final void b(View view) {
        zon zonVar = (zon) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) zonVar).width == -1 && ((ViewGroup.MarginLayoutParams) zonVar).height == -1) {
            return;
        }
        xq0.q("Pages must fill the whole ViewPager2 (use match_parent)");
    }

    @Override // defpackage.apn
    public final void a(View view) {
    }
}
