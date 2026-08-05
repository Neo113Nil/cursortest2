package defpackage;

import android.widget.AbsListView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class vp implements AbsListView.OnScrollListener {
    public final /* synthetic */ xp qoPGr6Ce;

    public vp(xp xpVar) {
        this.qoPGr6Ce = xpVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        xp xpVar = this.qoPGr6Ce;
        tp tpVar = xpVar.KlHjfFWx;
        E3Msy4Bi e3Msy4Bi = xpVar.lwWCatUu;
        if (i != 1 || e3Msy4Bi.getInputMethodMode() == 2 || e3Msy4Bi.getContentView() == null) {
            return;
        }
        xpVar.FySoLYna.removeCallbacks(tpVar);
        tpVar.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
