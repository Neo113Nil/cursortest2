package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* loaded from: classes.dex */
public final class yf extends tsc {
    public final /* synthetic */ int j = 0;
    public final /* synthetic */ View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.k = actionMenuItemView;
    }

    @Override // defpackage.tsc
    public final keq d() {
        ag agVar;
        switch (this.j) {
            case 0:
                zf zfVar = ((ActionMenuItemView) this.k).m;
                if (zfVar == null || (agVar = ((bg) zfVar).a.t) == null) {
                    return null;
                }
                return agVar.a();
            default:
                ag agVar2 = ((cg) this.k).a.s;
                if (agVar2 == null) {
                    return null;
                }
                return agVar2.a();
        }
    }

    @Override // defpackage.tsc
    public final boolean e() {
        keq d;
        switch (this.j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.k;
                gxh gxhVar = actionMenuItemView.k;
                return gxhVar != null && gxhVar.a(actionMenuItemView.h) && (d = d()) != null && d.a();
            default:
                ((cg) this.k).a.l();
                return true;
        }
    }

    @Override // defpackage.tsc
    public boolean f() {
        switch (this.j) {
            case 1:
                dg dgVar = ((cg) this.k).a;
                if (dgVar.u != null) {
                    return false;
                }
                dgVar.f();
                return true;
            default:
                return super.f();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf(cg cgVar, cg cgVar2) {
        super(cgVar2);
        this.k = cgVar;
    }
}
