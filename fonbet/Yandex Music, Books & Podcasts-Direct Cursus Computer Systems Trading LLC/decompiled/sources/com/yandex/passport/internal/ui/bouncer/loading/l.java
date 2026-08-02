package com.yandex.passport.internal.ui.bouncer.loading;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.api.m2;
import com.yandex.passport.api.o2;
import com.yandex.passport.api.s2;
import com.yandex.passport.internal.properties.v;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.ui.bouncer.o;
import defpackage.b6;
import defpackage.c7g;
import defpackage.ezf;
import defpackage.g4i;
import defpackage.hdu;
import defpackage.ldg;
import defpackage.rof;

/* loaded from: classes4.dex */
public final class l extends b6 {
    public final v d;
    public final View e;
    public final s2 f;
    public final TextView g;
    public final Button h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(Activity activity, v vVar, x xVar) {
        super(activity, 10);
        activity.getClass();
        vVar.getClass();
        xVar.getClass();
        this.d = vVar;
        this.e = com.yandex.passport.common.ui.e.b(this, activity, vVar, xVar.x, 0.0f, 16);
        this.f = vVar.b.v();
        View view = (View) k.a.invoke(ezf.a0(activity, 0), 0, 0);
        boolean z = this instanceof rof;
        if (z) {
            ((rof) this).j(view);
        }
        TextView textView = (TextView) view;
        textView.setText(R.string.passport_webview_coonection_lost_error_text);
        textView.setTextSize(16.0f);
        ldg.K(textView, R.color.passport_roundabout_text_primary);
        textView.setSingleLine(false);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        this.g = textView;
        View view2 = (View) j.a.invoke(ezf.a0(activity, 0), 0, 0);
        if (z) {
            ((rof) this).j(view2);
        }
        Button button = (Button) view2;
        button.setText(R.string.passport_webview_back_button_text);
        button.setTextSize(16.0f);
        ldg.K(button, R.color.passport_roundabout_text_primary);
        button.setBackgroundColor(0);
        button.setSingleLine(true);
        button.setAllCaps(false);
        float f = 14;
        DisplayMetrics displayMetrics = g4i.a;
        button.setPadding(button.getPaddingLeft(), (int) (displayMetrics.density * f), button.getPaddingRight(), button.getPaddingBottom());
        button.setPadding(button.getPaddingLeft(), button.getPaddingTop(), button.getPaddingRight(), (int) (f * displayMetrics.density));
        button.setGravity(17);
        button.setAlpha(0.0f);
        this.h = button;
    }

    @Override // defpackage.b6
    public final void w(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.getClass();
        o2 o2Var = this.d.c;
        if (o2Var instanceof m2) {
            ldg.I(((m2) o2Var).a, linearLayout);
        } else {
            ldg.H(R.color.passport_roundabout_background, linearLayout);
        }
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        c7g c7gVar = new c7g(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(c7gVar);
        }
        c7gVar.setOrientation(1);
        c7gVar.setGravity(17);
        c7gVar.b(this.e, new o(3, c7gVar, this));
        c7gVar.b(this.g, new com.yandex.passport.internal.ui.bouncer.error.l(c7gVar, 4));
        if (this.d.d) {
            c7gVar.b(this.h, new com.yandex.passport.internal.ui.bouncer.error.l(c7gVar, 5));
        }
        return c7gVar;
    }
}
