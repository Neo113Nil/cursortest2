package m;

import android.content.Context;
import android.view.View;
import com.IceFishing.LiveIceFishing.C5248R;
import l.SubMenuC4654E;

/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4700g extends l.w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f39215l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C4708k f39216m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4700g(C4708k c4708k, Context context, l.m mVar, View view) {
        super(C5248R.attr.actionOverflowMenuStyle, context, view, mVar, true);
        this.f39216m = c4708k;
        this.f38802f = 8388613;
        I0.j jVar = c4708k.f39240P;
        this.f38804h = jVar;
        l.u uVar = this.i;
        if (uVar != null) {
            uVar.g(jVar);
        }
    }

    @Override // l.w
    public final void c() {
        switch (this.f39215l) {
            case 0:
                C4708k c4708k = this.f39216m;
                c4708k.f39237M = null;
                c4708k.getClass();
                super.c();
                break;
            default:
                C4708k c4708k2 = this.f39216m;
                l.m mVar = c4708k2.f39243v;
                if (mVar != null) {
                    mVar.c(true);
                }
                c4708k2.f39236L = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4700g(C4708k c4708k, Context context, SubMenuC4654E subMenuC4654E, View view) {
        super(C5248R.attr.actionOverflowMenuStyle, context, view, subMenuC4654E, false);
        this.f39216m = c4708k;
        if ((subMenuC4654E.f38666T.f38772Q & 32) != 32) {
            View view2 = c4708k.f39227B;
            this.f38801e = view2 == null ? (View) c4708k.f39226A : view2;
        }
        I0.j jVar = c4708k.f39240P;
        this.f38804h = jVar;
        l.u uVar = this.i;
        if (uVar != null) {
            uVar.g(jVar);
        }
    }
}
