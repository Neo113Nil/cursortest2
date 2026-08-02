package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.app.Activity;
import android.content.Context;
import android.text.BidiFormatter;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.passport.R;
import defpackage.cs1;
import defpackage.fft;
import defpackage.g4i;
import defpackage.gq2;
import defpackage.ldg;
import defpackage.qb;
import defpackage.t13;
import defpackage.wdu;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class a0 extends t13 {
    public final com.yandex.passport.internal.ui.bouncer.s l;
    public final com.yandex.passport.internal.ui.bouncer.roundabout.c m;
    public final d0 n;

    public a0(Activity activity, com.yandex.passport.internal.ui.bouncer.s sVar, com.yandex.passport.internal.ui.bouncer.roundabout.c cVar) {
        activity.getClass();
        sVar.getClass();
        cVar.getClass();
        this.l = sVar;
        this.m = cVar;
        this.n = new d0(activity);
    }

    @Override // defpackage.orq
    public final ViewGroup.LayoutParams m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float f;
        float f2;
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.getClass();
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            float f3 = 24;
            DisplayMetrics displayMetrics = g4i.a;
            marginLayoutParams.setMarginStart((int) (displayMetrics.density * f3));
            marginLayoutParams.setMarginEnd((int) (f3 * displayMetrics.density));
            f = 6;
            f2 = displayMetrics.density;
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            float f4 = 24;
            DisplayMetrics displayMetrics2 = g4i.a;
            marginLayoutParams.setMarginStart((int) (displayMetrics2.density * f4));
            marginLayoutParams.setMarginEnd((int) (f4 * displayMetrics2.density));
            f = 6;
            f2 = displayMetrics2.density;
        }
        marginLayoutParams.topMargin = (int) (f * f2);
        return marginLayoutParams;
    }

    @Override // defpackage.wft
    public final fft o() {
        return this.n;
    }

    @Override // defpackage.t13
    public final Object p(Object obj, cs1 cs1Var) {
        j0 j0Var = (j0) obj;
        d0 d0Var = this.n;
        LinearLayout linearLayout = (LinearLayout) d0Var.e();
        ldg.B(linearLayout, new z(this, j0Var, null, 0));
        linearLayout.setOnLongClickListener(new gq2(linearLayout, new z(this, j0Var, null, 1)));
        View e = d0Var.e();
        qb qbVar = qb.f;
        Context context = (Context) d0Var.b;
        wdu.o(e, qbVar, context.getText(R.string.passport_recyclerview_item_description_long_press), null);
        String unicodeWrap = BidiFormatter.getInstance().unicodeWrap(j0Var.b);
        TextView textView = d0Var.e;
        textView.setText(unicodeWrap);
        ((LinearLayout) d0Var.e()).setContentDescription(context.getString(R.string.passport_recyclerview_item_description_account, textView.getText(), "", ""));
        return Unit.a;
    }
}
