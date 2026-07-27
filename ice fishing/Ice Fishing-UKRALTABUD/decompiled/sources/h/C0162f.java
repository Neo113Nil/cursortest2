package h;

import android.content.Context;
import android.view.View;
import com.icedrifter.arcticquest.R;

/* renamed from: h.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162f extends g.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2160l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0165i f2161m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0162f(C0165i c0165i, Context context, g.j jVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, jVar, true);
        this.f2161m = c0165i;
        this.f2017f = 8388613;
        A.j jVar2 = c0165i.f2187A;
        this.f2019h = jVar2;
        g.l lVar = this.f2020i;
        if (lVar != null) {
            lVar.g(jVar2);
        }
    }

    @Override // g.n
    public final void c() {
        switch (this.f2160l) {
            case 0:
                C0165i c0165i = this.f2161m;
                c0165i.f2205x = null;
                c0165i.getClass();
                super.c();
                break;
            default:
                C0165i c0165i2 = this.f2161m;
                g.j jVar = c0165i2.f2190h;
                if (jVar != null) {
                    jVar.c(true);
                }
                c0165i2.f2204w = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0162f(C0165i c0165i, Context context, g.t tVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, tVar, false);
        this.f2161m = c0165i;
        if (!tVar.f2042w.d()) {
            View view2 = c0165i.f2195m;
            this.f2016e = view2 == null ? c0165i.f2194l : view2;
        }
        A.j jVar = c0165i.f2187A;
        this.f2019h = jVar;
        g.l lVar = this.f2020i;
        if (lVar != null) {
            lVar.g(jVar);
        }
    }
}
