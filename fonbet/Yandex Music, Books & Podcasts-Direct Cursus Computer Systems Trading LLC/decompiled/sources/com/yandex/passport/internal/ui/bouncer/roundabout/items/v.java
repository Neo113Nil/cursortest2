package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.yandex.passport.R;
import defpackage.cs1;
import defpackage.fft;
import defpackage.g4i;
import defpackage.jj4;
import defpackage.ldg;
import defpackage.qs;
import defpackage.t13;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class v extends t13 {
    public final com.yandex.passport.internal.ui.bouncer.s l;
    public final c m;

    public v(Activity activity, com.yandex.passport.internal.ui.bouncer.s sVar) {
        activity.getClass();
        sVar.getClass();
        this.l = sVar;
        this.m = new c(activity);
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
            marginLayoutParams.setMarginStart((int) (displayMetrics.density * f));
            marginLayoutParams.setMarginEnd((int) (displayMetrics.density * f));
            f2 = displayMetrics.density;
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            f = 24;
            DisplayMetrics displayMetrics2 = g4i.a;
            marginLayoutParams.setMarginStart((int) (displayMetrics2.density * f));
            marginLayoutParams.setMarginEnd((int) (displayMetrics2.density * f));
            f2 = displayMetrics2.density;
        }
        marginLayoutParams.topMargin = (int) (f * f2);
        return marginLayoutParams;
    }

    @Override // defpackage.wft
    public final fft o() {
        return this.m;
    }

    @Override // defpackage.t13
    public final Object p(Object obj, cs1 cs1Var) {
        e0 e0Var = (e0) obj;
        c cVar = this.m;
        TextView textView = cVar.d;
        Context context = (Context) cVar.b;
        textView.setText(context.getResources().getString(e0Var.a ? R.string.passport_acc_list_add_new_account_another : R.string.passport_acc_list_add_new_account));
        ldg.B(textView, new qs(this, null, 19));
        String string = context.getResources().getString(R.string.passport_recyclerview_item_description);
        string.getClass();
        textView.setContentDescription(((Object) textView.getText()) + ". " + string + '.');
        View e = cVar.e();
        ViewGroup.LayoutParams layoutParams = e.getLayoutParams();
        if (layoutParams == null) {
            jj4.j("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = (int) ((e0Var.a ? 8 : 24) * g4i.a.density);
        e.setLayoutParams(marginLayoutParams);
        return Unit.a;
    }
}
