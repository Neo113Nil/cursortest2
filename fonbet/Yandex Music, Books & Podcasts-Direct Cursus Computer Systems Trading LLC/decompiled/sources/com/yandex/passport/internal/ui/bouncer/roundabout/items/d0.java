package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.app.Activity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.passport.R;
import defpackage.b6;
import defpackage.c7g;
import defpackage.ezf;
import defpackage.g4i;
import defpackage.hdu;
import defpackage.ldg;
import defpackage.rof;

/* loaded from: classes4.dex */
public final class d0 extends b6 {
    public final ImageView d;
    public final TextView e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(Activity activity) {
        super(activity, 10);
        activity.getClass();
        View view = (View) b0.a.invoke(ezf.a0(activity, 0), 0, 0);
        boolean z = this instanceof rof;
        if (z) {
            ((rof) this).j(view);
        }
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.passport_icon_user_unknown);
        float f = 4;
        DisplayMetrics displayMetrics = g4i.a;
        imageView.setPaddingRelative(imageView.getPaddingStart(), imageView.getPaddingTop(), (int) (displayMetrics.density * f), imageView.getPaddingBottom());
        imageView.setPadding(imageView.getPaddingLeft(), imageView.getPaddingTop(), imageView.getPaddingRight(), (int) (f * displayMetrics.density));
        this.d = imageView;
        View view2 = (View) c0.a.invoke(ezf.a0(activity, 0), 0, 0);
        if (z) {
            ((rof) this).j(view2);
        }
        TextView textView = (TextView) view2;
        textView.setId(R.id.passport_roundabout_phonish_title);
        textView.setTextSize(16.0f);
        ldg.K(textView, R.color.passport_roundabout_text_primary);
        ldg.J(textView, ru.yandex.music.R.font.ys_text_medium);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        this.e = textView;
    }

    @Override // defpackage.b6
    public final void w(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.getClass();
        ldg.I(R.drawable.passport_roundabout_account, linearLayout);
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        c7g c7gVar = new c7g(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(c7gVar);
        }
        c7gVar.setOrientation(0);
        c7gVar.b(this.d, new com.yandex.passport.internal.ui.bouncer.error.l(c7gVar, 6));
        c7gVar.b(this.e, new com.yandex.passport.internal.ui.bouncer.error.l(c7gVar, 7));
        return c7gVar;
    }
}
