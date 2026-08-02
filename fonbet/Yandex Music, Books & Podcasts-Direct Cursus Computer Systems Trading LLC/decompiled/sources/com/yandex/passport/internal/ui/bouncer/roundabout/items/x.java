package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.internal.report.o5;
import defpackage.ck0;
import defpackage.cs1;
import defpackage.fft;
import defpackage.g4i;
import defpackage.ldg;
import defpackage.t13;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class x extends t13 {
    public final com.yandex.passport.internal.ui.bouncer.s l;
    public final com.yandex.passport.internal.report.reporters.q m;
    public final c n;

    public x(Activity activity, com.yandex.passport.internal.ui.bouncer.s sVar, com.yandex.passport.internal.report.reporters.q qVar) {
        activity.getClass();
        sVar.getClass();
        qVar.getClass();
        this.l = sVar;
        this.m = qVar;
        this.n = new c(activity);
    }

    @Override // defpackage.orq
    public final void i(Bundle bundle) {
        if (bundle == null) {
            com.yandex.passport.internal.report.reporters.q qVar = this.m;
            qVar.getClass();
            qVar.p(o5.d);
        }
    }

    @Override // defpackage.orq
    public final ViewGroup.LayoutParams m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float f;
        float f2;
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.getClass();
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            f = 24;
            DisplayMetrics displayMetrics = g4i.a;
            int i = (int) (displayMetrics.density * f);
            marginLayoutParams.bottomMargin = i;
            marginLayoutParams.setMarginStart(i);
            f2 = displayMetrics.density;
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            f = 24;
            DisplayMetrics displayMetrics2 = g4i.a;
            int i2 = (int) (displayMetrics2.density * f);
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.setMarginStart(i2);
            f2 = displayMetrics2.density;
        }
        marginLayoutParams.setMarginEnd((int) (f * f2));
        return marginLayoutParams;
    }

    @Override // defpackage.wft
    public final fft o() {
        return this.n;
    }

    @Override // defpackage.t13
    public final Object p(Object obj, cs1 cs1Var) {
        c cVar = this.n;
        TextView textView = cVar.d;
        Context context = (Context) cVar.b;
        textView.setText(context.getResources().getString(R.string.passport_acc_list_create_new_profile));
        TextView textView2 = cVar.d;
        ldg.B(textView2, new ck0(this, (g0) obj, null, 5));
        String string = context.getResources().getString(R.string.passport_recyclerview_item_description);
        string.getClass();
        textView2.setContentDescription(((Object) textView2.getText()) + ". " + string + '.');
        return Unit.a;
    }
}
