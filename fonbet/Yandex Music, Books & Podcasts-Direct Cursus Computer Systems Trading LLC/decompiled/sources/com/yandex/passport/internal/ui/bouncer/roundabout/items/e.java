package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.app.Activity;
import android.text.BidiFormatter;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.cs1;
import defpackage.fft;
import defpackage.g4i;
import defpackage.gq2;
import defpackage.ldg;
import defpackage.qb;
import defpackage.t13;
import defpackage.uf6;
import defpackage.wdu;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class e extends t13 {
    public final Activity l;
    public final com.yandex.passport.internal.ui.bouncer.s m;
    public final com.yandex.passport.internal.ui.bouncer.roundabout.c n;
    public final l o;

    public e(Activity activity, com.yandex.passport.internal.ui.bouncer.s sVar, com.yandex.passport.internal.ui.bouncer.roundabout.c cVar) {
        activity.getClass();
        sVar.getClass();
        cVar.getClass();
        this.l = activity;
        this.m = sVar;
        this.n = cVar;
        this.o = new l(new uf6(activity, R.style.ThemeOverlay_MaterialComponents_Light));
    }

    @Override // defpackage.orq
    public final ViewGroup.LayoutParams m(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        constraintLayout.getClass();
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : new ViewGroup.MarginLayoutParams(-1, -2);
        float f = 24;
        DisplayMetrics displayMetrics = g4i.a;
        marginLayoutParams.setMarginStart((int) (displayMetrics.density * f));
        marginLayoutParams.setMarginEnd((int) (f * displayMetrics.density));
        return marginLayoutParams;
    }

    @Override // defpackage.wft
    public final fft o() {
        return this.o;
    }

    @Override // defpackage.t13
    public final Object p(Object obj, cs1 cs1Var) {
        String str;
        h0 h0Var = (h0) obj;
        l lVar = this.o;
        ConstraintLayout e = lVar.e();
        ldg.B(e, new d(this, h0Var, null, 0));
        e.setOnLongClickListener(new gq2(e, new d(this, h0Var, null, 1)));
        ConstraintLayout e2 = lVar.e();
        qb qbVar = qb.f;
        int i = com.yandex.passport.R.string.passport_recyclerview_item_description_long_press;
        Activity activity = this.l;
        wdu.o(e2, qbVar, activity.getText(i), null);
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        TextView textView = lVar.f;
        textView.setText(bidiFormatter.unicodeWrap(h0Var.b));
        w.d(lVar, h0Var);
        w.c(lVar, h0Var);
        List list = h0Var.j;
        List list2 = list.isEmpty() ? null : list;
        if (list2 == null || (str = activity.getString(com.yandex.passport.R.string.passport_recyclerview_item_description_badges, CollectionsKt.X(list2, ", ", null, null, new com.yandex.passport.internal.storage.d(5), 30))) == null) {
            str = "";
        }
        lVar.e().setContentDescription(activity.getString(com.yandex.passport.R.string.passport_recyclerview_item_description_account, textView.getText(), lVar.g.getText(), str));
        w.b(lVar, h0Var);
        w.e(lVar, h0Var);
        w.a(lVar, h0Var);
        return Unit.a;
    }
}
