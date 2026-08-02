package defpackage;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class l2e implements ic, dvr, hyi {
    public final /* synthetic */ s2e a;

    public /* synthetic */ l2e(s2e s2eVar) {
        this.a = s2eVar;
    }

    @Override // defpackage.dvr
    public void a() {
        h4b h4bVar = this.a.x;
        if (h4bVar != null) {
            u1e u1eVar = (u1e) h4bVar.a;
            u1eVar.B.a().S();
            wst wstVar = (wst) u1eVar.m.getValue();
            xxq xxqVar = u1eVar.u;
            wstVar.getClass();
            xxqVar.getClass();
            ((x0q) wstVar.b(xxqVar).f.d).a(Unit.a);
            u1eVar.c(true);
            u1eVar.y.c.c = false;
        }
    }

    @Override // defpackage.hyi
    public void c(NestedScrollView nestedScrollView, int i) {
        this.a.o();
    }

    @Override // defpackage.ic
    public boolean r(View view) {
        view.getClass();
        this.a.l(4);
        return true;
    }
}
