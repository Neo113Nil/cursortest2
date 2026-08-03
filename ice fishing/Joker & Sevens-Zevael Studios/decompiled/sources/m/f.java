package m;

import android.content.Context;
import android.view.View;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends l.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4294l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f4295m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Context context, l.h hVar, View view) {
        super(context, hVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f4295m = iVar;
        this.f3743f = 8388613;
        f8.c cVar = iVar.B;
        this.f3745h = cVar;
        l.j jVar = this.f3746i;
        if (jVar != null) {
            jVar.e(cVar);
        }
    }

    @Override // l.l
    public final void c() {
        switch (this.f4294l) {
            case 0:
                i iVar = this.f4295m;
                iVar.f4330y = null;
                iVar.getClass();
                super.c();
                break;
            default:
                i iVar2 = this.f4295m;
                l.h hVar = iVar2.f4314i;
                if (hVar != null) {
                    hVar.c(true);
                }
                iVar2.f4329x = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Context context, l.r rVar, View view) {
        super(context, rVar, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f4295m = iVar;
        if ((rVar.f3769w.f3733x & 32) != 32) {
            View view2 = iVar.f4319n;
            this.f3742e = view2 == null ? iVar.f4318m : view2;
        }
        f8.c cVar = iVar.B;
        this.f3745h = cVar;
        l.j jVar = this.f3746i;
        if (jVar != null) {
            jVar.e(cVar);
        }
    }
}
