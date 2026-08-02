package defpackage;

import android.view.View;
import androidx.fragment.app.t;

/* loaded from: classes6.dex */
public final class cag {
    public final qdc a;
    public final aag b;
    public boolean c;
    public bag d;

    public cag(qdc qdcVar, t tVar, b1o b1oVar, pv9 pv9Var) {
        tVar.getClass();
        b1oVar.getClass();
        this.a = qdcVar;
        pef pefVar = new pef(0, this, cag.class, "onSizeIsReady", "onSizeIsReady()V", 0, 22);
        View decorView = tVar.getWindow().getDecorView();
        ni niVar = new ni();
        new z0o(decorView, 1).a(niVar);
        niVar.b = pefVar;
        this.b = new aag(b1oVar, pv9Var, niVar);
    }

    public final void a(int i, int i2, int i3) {
        StringBuilder l = dfi.l("preload with stats: firstVisible=", i, i2, " visibleCount=", " totalCount=");
        l.append(i3);
        this.a.H("GlideBitmapDownloader", "onScrollImpl", l.toString(), new Object[0]);
        this.b.onScroll(null, i, i2, i3);
    }
}
