package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lightside.slab.SlotView;
import com.yandex.passport.R;
import defpackage.al6;
import defpackage.b6;
import defpackage.ezf;
import defpackage.hdu;
import defpackage.ldu;
import defpackage.ndu;
import defpackage.rof;
import defpackage.sof;
import defpackage.trq;
import defpackage.wdu;
import defpackage.xk6;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class o extends b6 {
    public final trq d;
    public final BottomSheetBehavior e;
    public final com.yandex.passport.common.ui.view.j f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(Activity activity) {
        super(activity, 10);
        activity.getClass();
        int i = 0;
        SlotView slotView = new SlotView(ezf.a0(activity, 0), null, 0, 0);
        boolean z = this instanceof rof;
        if (z) {
            ((rof) this).j(slotView);
        }
        trq trqVar = new trq(slotView);
        this.d = trqVar;
        BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior(activity, null);
        bottomSheetBehavior.setSkipCollapsed(false);
        bottomSheetBehavior.setPeekHeight(0);
        bottomSheetBehavior.setState(4);
        bottomSheetBehavior.setFitToContents(true);
        bottomSheetBehavior.setMaxWidth(a0.v);
        this.e = bottomSheetBehavior;
        com.yandex.passport.common.ui.view.j jVar = new com.yandex.passport.common.ui.view.j(ezf.a0(activity, 0), 0, 0);
        if (z) {
            ((rof) this).j(jVar);
        }
        jVar.setBackgroundResource(R.drawable.passport_roundabout_bottomsheet_background);
        View view = trqVar.a;
        ezf.a0(jVar.getCtx(), 0).getClass();
        jVar.j(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.setLayoutParams(layoutParams == null ? new ViewGroup.LayoutParams(-1, -2) : layoutParams);
        if (jVar.isAttachedToWindow()) {
            WeakHashMap weakHashMap = wdu.a;
            ldu.c(jVar);
        } else {
            jVar.addOnAttachStateChangeListener(new n(i, jVar, jVar));
        }
        this.f = jVar;
    }

    @Override // defpackage.b6
    public final void w(View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        coordinatorLayout.getClass();
        com.yandex.passport.internal.ui.l lVar = new com.yandex.passport.internal.ui.l(4, this, coordinatorLayout);
        WeakHashMap weakHashMap = wdu.a;
        ndu.n(coordinatorLayout, lVar);
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        al6 al6Var = new al6(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(al6Var);
        }
        com.yandex.passport.common.ui.view.j jVar = this.f;
        jVar.getClass();
        sof sofVar = al6Var.y;
        sofVar.getClass();
        sofVar.j(jVar);
        xk6 xk6Var = (xk6) al6Var.y.a(-2, -2);
        ((ViewGroup.MarginLayoutParams) xk6Var).width = -1;
        ((ViewGroup.MarginLayoutParams) xk6Var).height = -2;
        xk6Var.b(this.e);
        xk6Var.c = 1;
        int dimensionPixelOffset = jVar.getResources().getDimensionPixelOffset(R.dimen.passport_bottom_sheet_margin_horizontal);
        ((ViewGroup.MarginLayoutParams) xk6Var).leftMargin = dimensionPixelOffset;
        ((ViewGroup.MarginLayoutParams) xk6Var).rightMargin = dimensionPixelOffset;
        jVar.setLayoutParams(xk6Var);
        return al6Var;
    }
}
