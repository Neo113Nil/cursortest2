package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import yads.ts;
import yads.zv1;

/* loaded from: classes7.dex */
public final class xj61 extends sj81 {
    public static final /* synthetic */ kgx[] y = {qha1.a(xj61.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;")};
    public final vt71 b;
    public final b571 c;
    public final r581 w;
    public zv1 x = zv1.b;

    public xj61(ViewPager2 viewPager2, vt71 vt71Var, b571 b571Var) {
        this.b = vt71Var;
        this.c = b571Var;
        this.w = new r581(viewPager2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zy11 zy11Var;
        ViewPager2 viewPager2;
        kgx kgxVar = y[0];
        ViewPager2 viewPager22 = (ViewPager2) this.w.a.get();
        if (viewPager22 != null) {
            if (sj71.a.a(viewPager22).a > 0) {
                RecyclerView.Adapter adapter = viewPager22.getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                if (itemCount != 0) {
                    int currentItem = viewPager22.getCurrentItem();
                    if (currentItem == 0) {
                        this.x = zv1.b;
                    } else if (currentItem == itemCount - 1) {
                        this.x = zv1.c;
                    }
                } else {
                    this.a = ts.c;
                }
                int ordinal = this.x.ordinal();
                vt71 vt71Var = this.b;
                if (ordinal == 0) {
                    ViewPager2 viewPager23 = (ViewPager2) vt71Var.a.get();
                    if (viewPager23 != null) {
                        viewPager23.setCurrentItem(viewPager23.getCurrentItem() + 1, true);
                    }
                } else if (ordinal == 1 && (viewPager2 = (ViewPager2) vt71Var.a.get()) != null) {
                    viewPager2.setCurrentItem(viewPager2.getCurrentItem() - 1, true);
                }
                b571 b571Var = this.c;
                if (b571Var.e) {
                    b571Var.a("first_auto_swipe");
                    b571Var.e = false;
                }
            }
            zy11Var = zy11.a;
        } else {
            zy11Var = null;
        }
        if (zy11Var == null) {
            this.a = ts.c;
        }
    }
}
