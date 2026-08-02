package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class cgu extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgu(ViewPager2 viewPager2, Context context) {
        super(context);
        this.E = viewPager2;
    }

    @Override // defpackage.yon
    public final boolean L0(amh amhVar, kpn kpnVar, int i, Bundle bundle) {
        this.E.t.getClass();
        return super.L0(amhVar, kpnVar, i, bundle);
    }

    @Override // defpackage.yon
    public final boolean Q0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void g1(kpn kpnVar, int[] iArr) {
        ViewPager2 viewPager2 = this.E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.g1(kpnVar, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.yon
    public final void w0(amh amhVar, kpn kpnVar, vb vbVar) {
        super.w0(amhVar, kpnVar, vbVar);
        this.E.t.getClass();
    }

    @Override // defpackage.yon
    public final void x0(amh amhVar, kpn kpnVar, View view, vb vbVar) {
        int i;
        int i2;
        ViewPager2 viewPager2 = (ViewPager2) this.E.t.d;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.g.getClass();
            i = yon.f0(view);
        } else {
            i = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.g.getClass();
            i2 = yon.f0(view);
        } else {
            i2 = 0;
        }
        vbVar.q(ub.d(false, i, 1, i2, 1));
    }
}
