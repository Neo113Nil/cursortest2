package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperActivity;
import defpackage.b6;
import defpackage.c7g;
import defpackage.ezf;
import defpackage.hdu;
import defpackage.qvc;
import defpackage.rof;
import defpackage.wft;

/* loaded from: classes4.dex */
public final class z extends b6 {
    public final /* synthetic */ int d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ManagingPlusDevicesHelperActivity managingPlusDevicesHelperActivity) {
        super(managingPlusDevicesHelperActivity, 10);
        this.d = 2;
        this.e = com.yandex.passport.common.ui.e.b(this, managingPlusDevicesHelperActivity, null, true, 1.0f, 18);
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        switch (this.d) {
            case 0:
                qvc qvcVar = new qvc(ezf.a0(hduVar.getCtx(), 0), 0, 0);
                if (hduVar instanceof rof) {
                    ((rof) hduVar).j(qvcVar);
                }
                View view = ((a0) this.e).t.a;
                ezf.a0(qvcVar.getCtx(), 0).getClass();
                qvcVar.j(view);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-1, -1);
                }
                view.setLayoutParams(layoutParams);
                return qvcVar;
            case 1:
                View view2 = (View) e0.a.invoke(ezf.a0(hduVar.getCtx(), 0), 0, 0);
                if (hduVar instanceof rof) {
                    ((rof) hduVar).j(view2);
                }
                ImageView imageView = (ImageView) view2;
                imageView.setImageResource(((f0) this.e).p());
                return imageView;
            default:
                c7g c7gVar = new c7g(ezf.a0(hduVar.getCtx(), 0), 0, 0);
                if (hduVar instanceof rof) {
                    ((rof) hduVar).j(c7gVar);
                }
                c7gVar.b((View) this.e, new com.yandex.passport.internal.ui.bouncer.error.l(c7gVar, 11));
                ViewGroup.LayoutParams a = c7gVar.a(-2, -2);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) a;
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                c7gVar.setLayoutParams(a);
                return c7gVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Activity activity, wft wftVar, int i) {
        super(activity, 10);
        this.d = i;
        this.e = wftVar;
    }
}
