package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.b;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class k1s implements xfu {
    public final WeakReference a;
    public int b;
    public int c;

    public k1s(TabLayout tabLayout) {
        this.a = new WeakReference(tabLayout);
    }

    @Override // defpackage.xfu
    public final void a(int i, float f, int i2) {
        boolean z;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i3 = this.c;
            boolean z2 = true;
            if (i3 != 2 || this.b == 1) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            if (i3 == 2 && this.b == 0) {
                z = false;
            }
            tabLayout.k(i, f, z2, z, false);
        }
    }

    @Override // defpackage.xfu
    public final void b(int i) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        int i2 = this.c;
        tabLayout.i((i < 0 || i >= tabLayout.getTabCount()) ? null : (b) tabLayout.b.get(i), i2 == 0 || (i2 == 2 && this.b == 0));
    }

    @Override // defpackage.xfu
    public final void c(int i) {
        this.b = this.c;
        this.c = i;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            tabLayout.E0 = this.c;
        }
    }
}
