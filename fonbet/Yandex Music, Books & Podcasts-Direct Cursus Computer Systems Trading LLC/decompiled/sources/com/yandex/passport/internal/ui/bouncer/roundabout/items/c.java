package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.yandex.passport.R;
import defpackage.b6;
import defpackage.ezf;
import defpackage.hdu;
import defpackage.ldg;
import defpackage.qvc;
import defpackage.rof;

/* loaded from: classes4.dex */
public final class c extends b6 {
    public final TextView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Activity activity) {
        super(activity, 10);
        activity.getClass();
        View view = (View) b.a.invoke(ezf.a0(activity, 0), 0, 0);
        if (this instanceof rof) {
            ((rof) this).j(view);
        }
        TextView textView = (TextView) view;
        textView.setBackgroundResource(R.drawable.passport_roundabout_account);
        textView.setId(R.id.passport_roundabout_add_new_title);
        textView.setTextSize(16.0f);
        ldg.K(textView, R.color.passport_roundabout_text_primary);
        ldg.J(textView, ru.yandex.music.R.font.ys_text_medium);
        textView.setGravity(17);
        this.d = textView;
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        qvc qvcVar = new qvc(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(qvcVar);
        }
        qvcVar.b(this.d, new a(qvcVar, 0));
        return qvcVar;
    }
}
