package com.yandex.passport.internal.ui.bouncer.error;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.internal.properties.v;
import defpackage.b6;
import defpackage.c7g;
import defpackage.ezf;
import defpackage.g4i;
import defpackage.hdu;
import defpackage.ldg;
import defpackage.rof;

/* loaded from: classes4.dex */
public final class p extends b6 {
    public final v d;
    public final ImageView e;
    public final TextView f;
    public final Button g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(Activity activity, v vVar) {
        super(activity, 10);
        activity.getClass();
        vVar.getClass();
        this.d = vVar;
        int i = R.id.passport_error_image;
        View view = (View) n.a.invoke(ezf.a0(activity, 0), 0, 0);
        if (i != -1) {
            view.setId(i);
        }
        boolean z = this instanceof rof;
        if (z) {
            ((rof) this).j(view);
        }
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.passport_domik_webam_unexpected_error);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.e = imageView;
        int i2 = R.id.text_error_message;
        View view2 = (View) o.a.invoke(ezf.a0(activity, 0), 0, 0);
        if (i2 != -1) {
            view2.setId(i2);
        }
        if (z) {
            ((rof) this).j(view2);
        }
        TextView textView = (TextView) view2;
        textView.setText(R.string.passport_webview_unexpected_error_text);
        textView.setTextSize(16.0f);
        ldg.K(textView, R.color.passport_error_slab_text_primary);
        ldg.J(textView, ru.yandex.music.R.font.ya_regular);
        textView.setSingleLine(false);
        textView.setGravity(17);
        this.f = textView;
        int i3 = R.id.button_back;
        View view3 = (View) m.a.invoke(ezf.a0(activity, 0), 0, 0);
        if (i3 != -1) {
            view3.setId(i3);
        }
        if (z) {
            ((rof) this).j(view3);
        }
        Button button = (Button) view3;
        button.setText(R.string.passport_webview_cancel_button_text);
        button.setTextSize(16.0f);
        ldg.K(button, R.color.passport_error_slab_text_secondary);
        ldg.J(button, ru.yandex.music.R.font.ya_regular);
        button.setSingleLine(true);
        button.setAllCaps(false);
        Context context = button.getContext();
        context.getClass();
        button.setBackgroundColor(com.yandex.plus.core.network.api.utils.a.t(context, android.R.attr.selectableItemBackground));
        float f = 14;
        DisplayMetrics displayMetrics = g4i.a;
        button.setPadding(button.getPaddingLeft(), (int) (displayMetrics.density * f), button.getPaddingRight(), button.getPaddingBottom());
        button.setPadding(button.getPaddingLeft(), button.getPaddingTop(), button.getPaddingRight(), (int) (f * displayMetrics.density));
        button.setGravity(17);
        this.g = button;
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        int i = R.id.passport_zero_page;
        c7g c7gVar = new c7g(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (i != -1) {
            c7gVar.setId(i);
        }
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(c7gVar);
        }
        c7gVar.setOrientation(1);
        c7gVar.setGravity(17);
        c7gVar.b(this.e, new l(c7gVar, 0));
        c7gVar.b(this.f, new l(c7gVar, 1));
        if (this.d.d) {
            c7gVar.b(this.g, new l(c7gVar, 2));
        }
        return c7gVar;
    }
}
