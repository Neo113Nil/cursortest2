package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.view.menu.d;

/* loaded from: classes10.dex */
public final class qw extends d {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ androidx.appcompat.widget.d n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(androidx.appcompat.widget.d dVar, Context context, SubMenuBuilder subMenuBuilder, View view) {
        super(context, subMenuBuilder, view, iog0.actionOverflowMenuStyle, 0, false);
        this.n = dVar;
        if (!((MenuItemImpl) subMenuBuilder.getItem()).isActionButton()) {
            View view2 = dVar.C;
            this.f = view2 == null ? (View) dVar.A : view2;
        }
        f(dVar.Q);
    }

    @Override // androidx.appcompat.view.menu.d
    public final void d() {
        int i = this.m;
        androidx.appcompat.widget.d dVar = this.n;
        switch (i) {
            case 0:
                dVar.N = null;
                dVar.R = 0;
                super.d();
                break;
            default:
                MenuBuilder menuBuilder = dVar.c;
                if (menuBuilder != null) {
                    menuBuilder.close();
                }
                dVar.M = null;
                super.d();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(androidx.appcompat.widget.d dVar, Context context, MenuBuilder menuBuilder, View view) {
        super(context, menuBuilder, view, iog0.actionOverflowMenuStyle, 0, true);
        this.n = dVar;
        this.g = 8388613;
        f(dVar.Q);
    }
}
