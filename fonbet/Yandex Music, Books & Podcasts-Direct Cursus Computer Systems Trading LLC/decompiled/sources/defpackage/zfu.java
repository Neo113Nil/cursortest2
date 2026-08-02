package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class zfu extends ron {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zfu(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ron
    public final void a() {
        switch (this.a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.b;
                viewPager2.e = true;
                viewPager2.l.l = true;
                break;
            default:
                ((bjt) this.b).r();
                break;
        }
    }

    @Override // defpackage.ron
    public final void b(int i, int i2, Object obj) {
        a();
    }

    @Override // defpackage.ron
    public final void c(int i, int i2) {
        a();
    }

    @Override // defpackage.ron
    public final void d(int i, int i2) {
        a();
    }

    @Override // defpackage.ron
    public final void e(int i, int i2) {
        a();
    }
}
