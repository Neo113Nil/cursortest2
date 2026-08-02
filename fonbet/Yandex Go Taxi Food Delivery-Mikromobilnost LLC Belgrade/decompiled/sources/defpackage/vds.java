package defpackage;

import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class vds {
    public sds a;
    public tds b;
    public uds c;
    public ViewPager2 d;
    public long e = -1;
    public final /* synthetic */ yds f;

    public vds(yds ydsVar) {
        this.f = ydsVar;
    }

    public static ViewPager2 a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        yci0.k(parent, "Expected ViewPager2 instance. Got: ");
        return null;
    }

    public final void b(boolean z) {
        int currentItem;
        Fragment fragment;
        yds ydsVar = this.f;
        rds rdsVar = ydsVar.z;
        rnz rnzVar = ydsVar.c;
        FragmentManager fragmentManager = ydsVar.b;
        if (fragmentManager.S() || this.d.getScrollState() != 0 || rnzVar.f() || ydsVar.getItemCount() == 0 || (currentItem = this.d.getCurrentItem()) >= ydsVar.getItemCount()) {
            return;
        }
        long j = currentItem;
        if ((j != this.e || z) && (fragment = (Fragment) rnzVar.c(j)) != null && fragment.isAdded()) {
            this.e = j;
            a h = g8e.h(fragmentManager, fragmentManager);
            ArrayList arrayList = new ArrayList();
            Fragment fragment2 = null;
            for (int i = 0; i < rnzVar.j(); i++) {
                long g = rnzVar.g(i);
                Fragment fragment3 = (Fragment) rnzVar.l(i);
                if (fragment3.isAdded()) {
                    if (g != this.e) {
                        h.q(fragment3, Lifecycle.State.STARTED);
                        arrayList.add(rdsVar.a());
                    } else {
                        fragment2 = fragment3;
                    }
                    fragment3.setMenuVisibility(g == this.e);
                }
            }
            if (fragment2 != null) {
                h.q(fragment2, Lifecycle.State.RESUMED);
                arrayList.add(rdsVar.a());
            }
            if (h.a.isEmpty()) {
                return;
            }
            h.m();
            Collections.reverse(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                rdsVar.getClass();
                rds.b(list);
            }
        }
    }
}
