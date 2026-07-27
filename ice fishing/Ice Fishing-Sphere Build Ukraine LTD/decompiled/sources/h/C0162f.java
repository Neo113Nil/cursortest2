package h;

import android.content.Context;
import android.view.View;
import com.icecatchbiger.hookfrostmaster.R;

/* renamed from: h.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162f extends g.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2168l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0165i f2169m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0162f(C0165i c0165i, Context context, g.j jVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, jVar, true);
        this.f2169m = c0165i;
        this.f2025f = 8388613;
        A.j jVar2 = c0165i.f2215z;
        this.f2027h = jVar2;
        g.l lVar = this.f2028i;
        if (lVar != null) {
            lVar.g(jVar2);
        }
    }

    @Override // g.n
    public final void c() {
        switch (this.f2168l) {
            case 0:
                C0165i c0165i = this.f2169m;
                c0165i.f2212w = null;
                c0165i.getClass();
                super.c();
                break;
            default:
                C0165i c0165i2 = this.f2169m;
                g.j jVar = c0165i2.f2197g;
                if (jVar != null) {
                    jVar.c(true);
                }
                c0165i2.f2211v = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0162f(C0165i c0165i, Context context, g.t tVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, tVar, false);
        this.f2169m = c0165i;
        if (!tVar.f2050w.d()) {
            View view2 = c0165i.f2202l;
            this.f2024e = view2 == null ? c0165i.f2201k : view2;
        }
        A.j jVar = c0165i.f2215z;
        this.f2027h = jVar;
        g.l lVar = this.f2028i;
        if (lVar != null) {
            lVar.g(jVar);
        }
    }
}
