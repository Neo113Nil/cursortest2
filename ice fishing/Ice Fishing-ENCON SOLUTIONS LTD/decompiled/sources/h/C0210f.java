package h;

import android.content.Context;
import android.view.View;
import com.watchfacestudio.spraktum.R;

/* renamed from: h.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210f extends g.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3240l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0213i f3241m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0210f(C0213i c0213i, Context context, g.j jVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, jVar, true);
        this.f3241m = c0213i;
        this.f3104f = 8388613;
        Z0.i iVar = c0213i.f3272v;
        this.f3106h = iVar;
        g.l lVar = this.f3107i;
        if (lVar != null) {
            lVar.d(iVar);
        }
    }

    @Override // g.n
    public final void c() {
        switch (this.f3240l) {
            case 0:
                C0213i c0213i = this.f3241m;
                c0213i.f3270s = null;
                c0213i.getClass();
                super.c();
                break;
            default:
                C0213i c0213i2 = this.f3241m;
                g.j jVar = c0213i2.f3254c;
                if (jVar != null) {
                    jVar.c(true);
                }
                c0213i2.f3269r = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0210f(C0213i c0213i, Context context, g.t tVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, tVar, false);
        this.f3241m = c0213i;
        if (!tVar.f3129w.d()) {
            View view2 = c0213i.f3259h;
            this.f3103e = view2 == null ? c0213i.f3258g : view2;
        }
        Z0.i iVar = c0213i.f3272v;
        this.f3106h = iVar;
        g.l lVar = this.f3107i;
        if (lVar != null) {
            lVar.d(iVar);
        }
    }
}
