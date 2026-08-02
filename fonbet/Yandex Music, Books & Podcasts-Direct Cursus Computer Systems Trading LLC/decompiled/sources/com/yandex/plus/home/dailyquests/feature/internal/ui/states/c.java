package com.yandex.plus.home.dailyquests.feature.internal.ui.states;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.home.r;
import defpackage.ern;
import defpackage.eup;
import defpackage.f1d;
import defpackage.h1b;
import defpackage.h5;
import defpackage.hr2;
import defpackage.s9f;
import defpackage.vgo;
import defpackage.yxm;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class c {
    public static final /* synthetic */ s9f[] g = {new yxm(c.class, "imagePlaceholderView", "getImagePlaceholderView()Landroid/view/View;", 0), f1d.c(ern.a, c.class, "titlePlaceholderView", "getTitlePlaceholderView()Landroid/view/View;", 0), new yxm(c.class, "subtitlePlaceholderView", "getSubtitlePlaceholderView()Landroid/view/View;", 0), new yxm(c.class, "descriptionPlaceholderView", "getDescriptionPlaceholderView()Landroid/view/View;", 0)};
    public final View a;
    public final f b;
    public final f c;
    public final f d;
    public final f e;
    public final ValueAnimator f;

    public c(LayoutInflater layoutInflater) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.plus_sdk_view_shimmer, (ViewGroup) null, false);
        inflate.getClass();
        this.a = inflate;
        f fVar = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(inflate, 20));
        this.b = fVar;
        f fVar2 = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(inflate, 21));
        this.c = fVar2;
        f fVar3 = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(inflate, 22));
        this.d = fVar3;
        f fVar4 = new f(new com.yandex.plus.core.debug.panel.internal.presentation.viewHolder.a(inflate, 23));
        this.e = fVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.05f, 0.1f, 0.05f);
        this.f = ofFloat;
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(1600L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new hr2(23, this));
        inflate.addOnAttachStateChangeListener(new r(2, this));
        int j = r1.j(R.attr.plus_sdk_daily_quests_shimmer_placeholder, inflate);
        s9f[] s9fVarArr = g;
        View view = (View) fVar.g(s9fVarArr[0]);
        inflate.getContext().getClass();
        view.setBackground(a(j, r2.getResources().getDimensionPixelSize(R.dimen.plus_sdk_daily_quests_image_placeholder_corner)));
        View view2 = (View) fVar2.g(s9fVarArr[1]);
        inflate.getContext().getClass();
        view2.setBackground(a(j, r1.getResources().getDimensionPixelSize(R.dimen.plus_sdk_daily_quests_text_placeholder_corner)));
        View view3 = (View) fVar3.g(s9fVarArr[2]);
        inflate.getContext().getClass();
        view3.setBackground(a(j, r1.getResources().getDimensionPixelSize(R.dimen.plus_sdk_daily_quests_text_placeholder_corner)));
        View view4 = (View) fVar4.g(s9fVarArr[3]);
        inflate.getContext().getClass();
        view4.setBackground(a(j, r11.getResources().getDimensionPixelSize(R.dimen.plus_sdk_daily_quests_text_placeholder_corner)));
    }

    public static com.google.android.material.shape.a a(int i, float f) {
        vgo vgoVar = new vgo();
        vgo vgoVar2 = new vgo();
        vgo vgoVar3 = new vgo();
        vgo vgoVar4 = new vgo();
        h1b h1bVar = new h1b();
        h1b h1bVar2 = new h1b();
        h1b h1bVar3 = new h1b();
        h1b h1bVar4 = new h1b();
        h5 h5Var = new h5(f);
        h5 h5Var2 = new h5(f);
        h5 h5Var3 = new h5(f);
        h5 h5Var4 = new h5(f);
        eup eupVar = new eup();
        eupVar.a = vgoVar;
        eupVar.b = vgoVar2;
        eupVar.c = vgoVar3;
        eupVar.d = vgoVar4;
        eupVar.e = h5Var;
        eupVar.f = h5Var2;
        eupVar.g = h5Var3;
        eupVar.h = h5Var4;
        eupVar.i = h1bVar;
        eupVar.j = h1bVar2;
        eupVar.k = h1bVar3;
        eupVar.l = h1bVar4;
        com.google.android.material.shape.a aVar = new com.google.android.material.shape.a(eupVar);
        aVar.r(ColorStateList.valueOf(i));
        return aVar;
    }
}
