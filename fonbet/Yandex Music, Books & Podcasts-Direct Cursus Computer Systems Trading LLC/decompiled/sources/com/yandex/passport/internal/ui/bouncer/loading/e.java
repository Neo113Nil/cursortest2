package com.yandex.passport.internal.ui.bouncer.loading;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
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
public class e extends b6 implements a {
    public final v d;
    public final View e;
    public final s2 f;
    public final Button g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Activity activity, v vVar, x xVar) {
        super(activity, 10);
        activity.getClass();
        vVar.getClass();
        xVar.getClass();
        this.d = vVar;
        this.e = com.yandex.passport.common.ui.e.b(this, activity, vVar, xVar.x, 0.0f, 16);
        this.f = vVar.b.v();
        int i = R.id.button_back;
        View view = (View) d.a.invoke(ezf.a0(activity, 0), 0, 0);
        if (i != -1) {
            view.setId(i);
        }
        if (this instanceof rof) {
            ((rof) this).j(view);
        }
        Button button = (Button) view;
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
        this.g = button;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.loading.a
    public View getProgress() {
        return this.e;
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        c7g c7gVar = new c7g(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(c7gVar);
        }
        c7gVar.setOrientation(1);
        c7gVar.setVisibility(8);
        androidx.core.app.a aVar = new androidx.core.app.a(7, c7gVar);
        c7gVar.postDelayed(aVar, 1000L);
        if (c7gVar.isAttachedToWindow()) {
            c7gVar.addOnAttachStateChangeListener(new com.yandex.passport.common.ui.view.b(c7gVar, c7gVar, aVar, 1));
        } else {
            c7gVar.removeCallbacks(aVar);
        }
        c7gVar.setGravity(17);
        v vVar = this.d;
        o2 o2Var = vVar.c;
        if (o2Var instanceof m2) {
            c7gVar.setBackgroundResource(((m2) o2Var).a);
        } else {
            ldg.H(R.color.passport_roundabout_background, c7gVar);
        }
        c7gVar.b(getProgress(), new o(2, c7gVar, this));
        if (vVar.d) {
            c7gVar.b(this.g, new com.yandex.passport.internal.ui.bouncer.error.l(c7gVar, 3));
        }
        return c7gVar;
    }
}
