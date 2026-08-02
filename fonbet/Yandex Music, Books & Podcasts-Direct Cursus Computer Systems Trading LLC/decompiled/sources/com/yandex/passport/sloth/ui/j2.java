package com.yandex.passport.sloth.ui;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.passport.common.ui.view.LottieAnimationViewBuilder;
import defpackage.b6;
import defpackage.c7g;
import defpackage.ezf;
import defpackage.g4i;
import defpackage.hdu;
import defpackage.ldg;
import defpackage.rof;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class j2 extends b6 {
    public final com.yandex.passport.sloth.ui.dependencies.o d;
    public final View e;
    public final com.yandex.passport.sloth.ui.dependencies.k f;
    public final ImageView g;
    public final TextView h;
    public final Button i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j2(Activity activity, com.yandex.passport.sloth.ui.string.b bVar, com.yandex.passport.sloth.ui.dependencies.o oVar) {
        super(activity, 10);
        View g;
        activity.getClass();
        bVar.getClass();
        oVar.getClass();
        this.d = oVar;
        com.yandex.passport.sloth.ui.dependencies.g f = oVar.f();
        if (f instanceof com.yandex.passport.sloth.ui.dependencies.f) {
            View view = (View) h2.a.invoke(ezf.a0(activity, 0), 0, 0);
            if (this instanceof rof) {
                ((rof) this).j(view);
            }
            LottieAnimationViewBuilder lottieAnimationViewBuilder = (LottieAnimationViewBuilder) view;
            lottieAnimationViewBuilder.setVisibility(0);
            lottieAnimationViewBuilder.setRepeatCount(-1);
            lottieAnimationViewBuilder.setAnimation(((com.yandex.passport.sloth.ui.dependencies.f) f).a);
            g = (LottieAnimationView) view;
        } else {
            com.yandex.plus.core.network.api.utils.a e = oVar.e();
            e.getClass();
            boolean z = e instanceof com.yandex.passport.sloth.ui.dependencies.a;
            View view2 = (View) f2.a.invoke(ezf.a0(activity, 0), 0, 0);
            if (this instanceof rof) {
                ((rof) this).j(view2);
            }
            com.yandex.passport.common.ui.view.d dVar = (com.yandex.passport.common.ui.view.d) view2;
            dVar.setColorResource(oVar.b().a);
            g = com.yandex.plus.core.locale.b.g(this, activity, z, dVar, 1.0f, 0L);
        }
        this.e = g;
        this.f = oVar.a().v();
        View view3 = (View) g2.a.invoke(ezf.a0(activity, 0), 0, 0);
        boolean z2 = this instanceof rof;
        if (z2) {
            ((rof) this).j(view3);
        }
        ImageView imageView = (ImageView) view3;
        imageView.setVisibility(8);
        imageView.setImageResource(R.drawable.passport_sloth_unexpected_error);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.g = imageView;
        View view4 = (View) i2.a.invoke(ezf.a0(activity, 0), 0, 0);
        if (z2) {
            ((rof) this).j(view4);
        }
        TextView textView = (TextView) view4;
        textView.setVisibility(8);
        textView.setTextSize(16.0f);
        ldg.K(textView, oVar.b().a);
        textView.setSingleLine(false);
        textView.setGravity(17);
        DisplayMetrics displayMetrics = g4i.a;
        textView.setPadding(textView.getPaddingLeft(), (int) (12 * displayMetrics.density), textView.getPaddingRight(), textView.getPaddingBottom());
        this.h = textView;
        View view5 = (View) e2.a.invoke(ezf.a0(activity, 0), 0, 0);
        if (z2) {
            ((rof) this).j(view5);
        }
        Button button = (Button) view5;
        button.setText(((com.yandex.passport.internal.ui.sloth.g) bVar).a(com.yandex.passport.sloth.ui.string.a.d));
        button.setTextSize(16.0f);
        ldg.K(button, oVar.b().a);
        button.setSingleLine(true);
        button.setAllCaps(false);
        Context context = button.getContext();
        context.getClass();
        button.setBackgroundColor(com.yandex.plus.core.network.api.utils.a.t(context, android.R.attr.selectableItemBackground));
        float f2 = 14;
        button.setPadding(button.getPaddingLeft(), (int) (displayMetrics.density * f2), button.getPaddingRight(), button.getPaddingBottom());
        button.setPadding(button.getPaddingLeft(), button.getPaddingTop(), button.getPaddingRight(), (int) (f2 * displayMetrics.density));
        button.setVisibility(8);
        button.setGravity(17);
        this.i = button;
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        c7g c7gVar = new c7g(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(c7gVar);
        }
        c7gVar.setOrientation(1);
        c7gVar.setGravity(17);
        com.yandex.passport.sloth.ui.dependencies.o oVar = this.d;
        com.yandex.passport.sloth.ui.dependencies.i d = oVar.d();
        if (d instanceof com.yandex.passport.sloth.ui.dependencies.h) {
            c7gVar.setBackgroundResource(((com.yandex.passport.sloth.ui.dependencies.h) d).a);
        } else {
            ldg.H(oVar.b().b, c7gVar);
        }
        c7gVar.b(this.e, new com.yandex.passport.internal.ui.bouncer.o(17, c7gVar, this));
        c7gVar.b(this.g, new com.yandex.passport.internal.ui.bouncer.error.l(c7gVar, 12));
        c7gVar.b(this.h, new com.yandex.passport.internal.ui.bouncer.error.l(c7gVar, 13));
        if (oVar.c()) {
            c7gVar.b(this.i, new com.yandex.passport.internal.ui.bouncer.error.l(c7gVar, 14));
        }
        return c7gVar;
    }
}
