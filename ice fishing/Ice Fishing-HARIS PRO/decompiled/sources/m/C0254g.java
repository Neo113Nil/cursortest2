package m;

import android.content.Context;
import android.view.View;
import com.lumenpath.harispro.hrnavigator.R;
import l.MenuC0229m;
import l.SubMenuC0216E;

/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254g extends l.w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3936l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0264l f3937m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0254g(C0264l c0264l, Context context, MenuC0229m menuC0229m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0229m, true);
        this.f3937m = c0264l;
        this.f3775f = 8388613;
        B.b bVar = c0264l.f3979x;
        this.f3777h = bVar;
        l.u uVar = this.i;
        if (uVar != null) {
            uVar.h(bVar);
        }
    }

    @Override // l.w
    public final void c() {
        switch (this.f3936l) {
            case 0:
                C0264l c0264l = this.f3937m;
                c0264l.f3976u = null;
                c0264l.f3980y = 0;
                super.c();
                break;
            default:
                C0264l c0264l2 = this.f3937m;
                MenuC0229m menuC0229m = c0264l2.f3961c;
                if (menuC0229m != null) {
                    menuC0229m.c(true);
                }
                c0264l2.f3975t = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0254g(C0264l c0264l, Context context, SubMenuC0216E subMenuC0216E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0216E, false);
        this.f3937m = c0264l;
        if (!subMenuC0216E.f3649A.f()) {
            View view2 = c0264l.j;
            this.e = view2 == null ? (View) c0264l.f3965h : view2;
        }
        B.b bVar = c0264l.f3979x;
        this.f3777h = bVar;
        l.u uVar = this.i;
        if (uVar != null) {
            uVar.h(bVar);
        }
    }
}
