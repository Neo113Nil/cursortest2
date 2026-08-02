package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.status;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.passport.internal.ui.bouncer.roundabout.k;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.theme.c;
import defpackage.asq;
import defpackage.eb;
import defpackage.ern;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.wdu;
import defpackage.yxm;
import kotlin.Unit;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class b extends ConstraintLayout {
    public static final /* synthetic */ s9f[] w = {new yxm(b.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), f1d.c(ern.a, b.class, "subtitleTextView", "getSubtitleTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "actionTextView", "getActionTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "iconImageView", "getIconImageView()Landroid/widget/ImageView;", 0)};
    public final f q;
    public final f r;
    public final f s;
    public final f t;
    public final float u;
    public Context v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context) {
        super(context);
        context.getClass();
        this.q = new f(new a(this, 0));
        this.r = new f(new a(this, 1));
        this.s = new f(new a(this, 2));
        this.t = new f(new a(this, 3));
        this.u = getResources().getDimension(R.dimen.plus_sdk_panel_default_corner_radius);
        this.v = context;
        r1.p(this, R.layout.plus_sdk_panel_status_view, true);
        wdu.q(this, new eb(21));
    }

    private final TextView getActionTextView() {
        return (TextView) this.s.g(w[2]);
    }

    private final ImageView getIconImageView() {
        return (ImageView) this.t.g(w[3]);
    }

    private final TextView getSubtitleTextView() {
        return (TextView) this.r.g(w[1]);
    }

    private final TextView getTitleTextView() {
        return (TextView) this.q.g(w[0]);
    }

    public static Unit t(b bVar, int i) {
        asq.N(bVar.getActionTextView(), ColorStateList.valueOf(i));
        return Unit.a;
    }

    public final void setActionEnabled(boolean z) {
        u.C(getActionTextView(), z);
    }

    public final void setActionText(CharSequence charSequence) {
        getActionTextView().setText(charSequence);
    }

    public final void setActionTextDrawable(@NotNull c cVar) {
        cVar.getClass();
        com.yandex.plus.bdui.flex.ui.a.D(getActionTextView(), cVar, new k(25, this));
    }

    public final void setContentDescription(@NotNull String str) {
        str.getClass();
        setContentDescription((CharSequence) str);
    }

    public final void setSubtitle(@NotNull CharSequence charSequence) {
        charSequence.getClass();
        getSubtitleTextView().setVisibility(!StringsKt.U(charSequence) ? 0 : 8);
        getSubtitleTextView().setText(charSequence);
    }

    public final void setSubtitleTextDrawable(@NotNull c cVar) {
        cVar.getClass();
        com.yandex.plus.bdui.flex.ui.a.D(getSubtitleTextView(), cVar, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
    }

    public final void setTitle(@NotNull CharSequence charSequence) {
        charSequence.getClass();
        getTitleTextView().setText(charSequence);
    }

    public final void setTitleTextDrawable(@NotNull c cVar) {
        cVar.getClass();
        com.yandex.plus.bdui.flex.ui.a.D(getTitleTextView(), cVar, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
    }

    public final void u(String str, com.yandex.plus.core.imageloader.b bVar) {
        bVar.getClass();
        getIconImageView().setVisibility(str == null || StringsKt.U(str) ? 8 : 0);
        ((com.yandex.plus.coil.b) bVar).b(str).i(getIconImageView());
    }
}
