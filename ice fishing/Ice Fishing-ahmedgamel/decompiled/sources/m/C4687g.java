package m;

import android.content.Context;
import android.view.View;
import com.icefishingapp.icefishing.C5275R;
import l.C4648e;
import l.SubMenuC4643E;

/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4687g extends l.w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f39149l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C4695k f39150m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4687g(C4695k c4695k, Context context, l.m mVar, View view) {
        super(C5275R.attr.actionOverflowMenuStyle, context, view, mVar, true);
        this.f39150m = c4695k;
        this.f38875f = 8388613;
        C4648e c4648e = c4695k.f39171P;
        this.f38877h = c4648e;
        l.u uVar = this.i;
        if (uVar != null) {
            uVar.g(c4648e);
        }
    }

    @Override // l.w
    public final void c() {
        switch (this.f39149l) {
            case 0:
                C4695k c4695k = this.f39150m;
                c4695k.f39168M = null;
                c4695k.getClass();
                super.c();
                break;
            default:
                C4695k c4695k2 = this.f39150m;
                l.m mVar = c4695k2.f39174v;
                if (mVar != null) {
                    mVar.c(true);
                }
                c4695k2.f39167L = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4687g(C4695k c4695k, Context context, SubMenuC4643E subMenuC4643E, View view) {
        super(C5275R.attr.actionOverflowMenuStyle, context, view, subMenuC4643E, false);
        this.f39150m = c4695k;
        if ((subMenuC4643E.f38739T.f38845Q & 32) != 32) {
            View view2 = c4695k.f39158B;
            this.f38874e = view2 == null ? (View) c4695k.f39157A : view2;
        }
        C4648e c4648e = c4695k.f39171P;
        this.f38877h = c4648e;
        l.u uVar = this.i;
        if (uVar != null) {
            uVar.g(c4648e);
        }
    }
}
