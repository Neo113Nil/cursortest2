package ru.yandex.taxi.favorites.edit;

import android.content.Context;
import android.view.View;
import androidx.core.view.b;
import androidx.lifecycle.o;
import com.yandex.go.design.view.GoImageView;
import defpackage.bvf0;
import defpackage.ei;
import defpackage.i3y;
import defpackage.kfp;
import defpackage.kj00;
import defpackage.kyh0;
import defpackage.mgp;
import defpackage.tje;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringImageView;

/* loaded from: classes5.dex */
public final class a {
    public final View a;
    public final ShimmeringImageView b;
    public final View c;
    public final GoImageView d;
    public final View e;
    public final RobotoTextView f;
    public final View g;
    public final ButtonComponent h;
    public final kfp i;
    public final kfp j;
    public final kfp k;
    public final r0 l = bvf0.c(kj00.a);
    public final r0 m = bvf0.c(Boolean.FALSE);
    public final i3y n = kotlin.a.a(new mgp(this, 0));
    public final i3y o = kotlin.a.a(new mgp(this, 1));

    public a(o oVar, View view, ShimmeringImageView shimmeringImageView, View view2, GoImageView goImageView, View view3, RobotoTextView robotoTextView, View view4, ButtonComponent buttonComponent, kfp kfpVar, kfp kfpVar2, kfp kfpVar3) {
        this.a = view;
        this.b = shimmeringImageView;
        this.c = view2;
        this.d = goImageView;
        this.e = view3;
        this.f = robotoTextView;
        this.g = view4;
        this.h = buttonComponent;
        this.i = kfpVar;
        this.j = kfpVar2;
        this.k = kfpVar3;
        b.p(shimmeringImageView, new ei(7));
        b.p(view3, new ei(7));
        Context context = view3.getContext();
        view3.setContentDescription(context.getString(kyh0.favorite_edit_map_preview_error_title) + "\n" + context.getString(kyh0.favorite_edit_map_preview_error_subtitle));
        tje.N(oVar, null, null, new FavoriteMapHolder$1(this, null), 3);
    }
}
