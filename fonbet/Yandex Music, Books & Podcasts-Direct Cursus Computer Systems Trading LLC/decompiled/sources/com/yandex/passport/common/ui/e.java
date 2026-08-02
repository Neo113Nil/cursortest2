package com.yandex.passport.common.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.passport.R;
import com.yandex.passport.api.j2;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.l2;
import com.yandex.passport.common.ui.view.LottieAnimationViewBuilder;
import com.yandex.passport.internal.properties.v;
import defpackage.b6e;
import defpackage.ezf;
import defpackage.hdu;
import defpackage.rof;

/* loaded from: classes4.dex */
public abstract class e {
    public static final View a(hdu hduVar, Context context, v vVar, boolean z, float f, boolean z2) {
        context.getClass();
        vVar.getClass();
        l2 l2Var = vVar.a;
        if (l2Var instanceof k2) {
            View view = (View) d.a.invoke(ezf.a0(hduVar.getCtx(), 0), 0, 0);
            if (hduVar instanceof rof) {
                ((rof) hduVar).j(view);
            }
            LottieAnimationViewBuilder lottieAnimationViewBuilder = (LottieAnimationViewBuilder) view;
            lottieAnimationViewBuilder.setVisibility(0);
            lottieAnimationViewBuilder.setRepeatCount(-1);
            lottieAnimationViewBuilder.setAlpha(f);
            lottieAnimationViewBuilder.setAnimation(((k2) l2Var).a);
            return (LottieAnimationView) view;
        }
        if (!(l2Var instanceof j2)) {
            b6e.s();
            return null;
        }
        View view2 = (View) c.a.invoke(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(view2);
        }
        com.yandex.passport.common.ui.view.d dVar = (com.yandex.passport.common.ui.view.d) view2;
        dVar.setColorResource(z2 ? R.color.passport_white : R.color.passport_roundabout_text_primary);
        return com.yandex.plus.core.locale.b.g(hduVar, context, z, dVar, f, ((j2) l2Var).a);
    }

    public static /* synthetic */ View b(hdu hduVar, Activity activity, v vVar, boolean z, float f, int i) {
        if ((i & 2) != 0) {
            vVar = new v();
        }
        return a(hduVar, activity, vVar, z, f, false);
    }
}
