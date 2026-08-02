package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class s821 extends ViewPager2.a {
    public final String a;
    public final opl b;

    public s821(String str, opl oplVar) {
        this.a = str;
        this.b = oplVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        if (i != -1) {
            this.b.b.put(this.a, new y890(i));
        }
    }
}
