package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.app.Activity;
import android.text.BidiFormatter;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.ck0;
import defpackage.cs1;
import defpackage.fft;
import defpackage.g4i;
import defpackage.ldg;
import defpackage.t13;
import defpackage.uf6;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class y extends t13 {
    public final Activity l;
    public final com.yandex.passport.internal.ui.bouncer.s m;
    public final l n;

    public y(Activity activity, com.yandex.passport.internal.ui.bouncer.s sVar) {
        activity.getClass();
        sVar.getClass();
        this.l = activity;
        this.m = sVar;
        this.n = new l(new uf6(activity, R.style.ThemeOverlay_MaterialComponents_Light));
    }

    @Override // defpackage.orq
    public final ViewGroup.LayoutParams m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float f;
        float f2;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        constraintLayout.getClass();
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
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
        String str;
        i0 i0Var = (i0) obj;
        l lVar = this.n;
        ldg.B(lVar.e(), new ck0(this, i0Var, null, 6));
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        TextView textView = lVar.f;
        textView.setText(bidiFormatter.unicodeWrap(i0Var.d));
        w.d(lVar, i0Var);
        w.c(lVar, i0Var);
        List list = i0Var.g;
        List list2 = list.isEmpty() ? null : list;
        Activity activity = this.l;
        if (list2 == null || (str = activity.getString(com.yandex.passport.R.string.passport_recyclerview_item_description_badges, CollectionsKt.X(list2, ", ", null, null, new com.yandex.passport.internal.storage.d(7), 30))) == null) {
            str = "";
        }
        lVar.e().setContentDescription(activity.getString(com.yandex.passport.R.string.passport_recyclerview_item_description_account, textView.getText(), lVar.g.getText(), str));
        w.b(lVar, i0Var);
        w.e(lVar, i0Var);
        w.a(lVar, i0Var);
        return Unit.a;
    }
}
