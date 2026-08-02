package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.redalert;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.data.common.k;
import com.yandex.plus.core.theme.c;
import defpackage.eb;
import defpackage.ern;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.wdu;
import defpackage.yxm;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class b extends ConstraintLayout {
    public static final /* synthetic */ s9f[] y = {new yxm(b.class, "warningImageView", "getWarningImageView()Landroid/widget/ImageView;", 0), f1d.c(ern.a, b.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "subtitleTextView", "getSubtitleTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "mainActionTextView", "getMainActionTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "additionalActionTextView", "getAdditionalActionTextView()Landroid/widget/TextView;", 0)};
    public final f q;
    public final f r;
    public final f s;
    public final f t;
    public final f u;
    public final float v;
    public final float w;
    public Context x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context) {
        super(context);
        context.getClass();
        this.q = new f(new a(this, 0));
        this.r = new f(new a(this, 1));
        this.s = new f(new a(this, 2));
        this.t = new f(new a(this, 3));
        this.u = new f(new a(this, 4));
        this.v = getResources().getDimension(R.dimen.plus_sdk_panel_default_corner_radius);
        this.w = getResources().getDimension(R.dimen.plus_sdk_red_alert_view_action_corner_radius);
        this.x = context;
        int dimension = (int) getResources().getDimension(R.dimen.plus_sdk_panel_red_alert_container_inner_margin);
        r1.p(this, R.layout.plus_sdk_panel_red_alert_view, true);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), dimension);
        wdu.q(this, new eb(18));
        wdu.q(getMainActionTextView(), new eb(19));
        wdu.q(getAdditionalActionTextView(), new eb(20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getAdditionalActionTextView() {
        return (TextView) this.u.g(y[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getMainActionTextView() {
        return (TextView) this.t.g(y[3]);
    }

    private final TextView getSubtitleTextView() {
        return (TextView) this.s.g(y[2]);
    }

    private final TextView getTitleTextView() {
        return (TextView) this.r.g(y[1]);
    }

    private final ImageView getWarningImageView() {
        return (ImageView) this.q.g(y[0]);
    }

    public final void A(boolean z) {
        getMainActionTextView().setVisibility(z ? 0 : 8);
    }

    public final void setAdditionalActionContentDescription(String str) {
        getAdditionalActionTextView().setContentDescription(str);
    }

    public final void setAdditionalActionOnClickListener(View.OnClickListener onClickListener) {
        r1.E(getAdditionalActionTextView(), onClickListener);
    }

    public final void setAdditionalActionText(CharSequence charSequence) {
        getAdditionalActionTextView().setText(charSequence);
        v();
    }

    public final void setAdditionalActionTextDrawable(@NotNull c cVar) {
        cVar.getClass();
        com.yandex.plus.bdui.flex.ui.a.D(getAdditionalActionTextView(), cVar, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
    }

    public final void setContentDescription(@NotNull String str) {
        str.getClass();
        setContentDescription((CharSequence) str);
    }

    public final void setMainActionContentDescription(String str) {
        getMainActionTextView().setContentDescription(str);
    }

    public final void setMainActionOnClickListener(View.OnClickListener onClickListener) {
        r1.E(getMainActionTextView(), onClickListener);
    }

    public final void setMainActionText(CharSequence charSequence) {
        getMainActionTextView().setText(charSequence);
        v();
    }

    public final void setMainActionTextDrawable(@NotNull c cVar) {
        cVar.getClass();
        com.yandex.plus.bdui.flex.ui.a.D(getMainActionTextView(), cVar, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
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

    public final void v() {
        int max;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo.a(1, this));
        } else if (getMainActionTextView().getVisibility() == 0 && getAdditionalActionTextView().getVisibility() == 0 && (max = Math.max(getMainActionTextView().getMeasuredHeight(), getAdditionalActionTextView().getMeasuredHeight())) > 0) {
            getMainActionTextView().setHeight(max);
            getAdditionalActionTextView().setHeight(max);
        }
    }

    public final void w(k kVar, int i) {
        float f = this.w;
        Drawable C = com.yandex.plus.bdui.plus.analytics.b.C(kVar, i, f, f, f, f);
        int b = com.yandex.plus.home.common.utils.a.b(this.x, R.attr.plus_sdk_panelDefaultRippleColor);
        TextView additionalActionTextView = getAdditionalActionTextView();
        float f2 = this.w;
        additionalActionTextView.setBackground(u.I(C, b, f2, f2, f2, f2));
    }

    public final void x(String str, com.yandex.plus.core.imageloader.b bVar) {
        bVar.getClass();
        ((com.yandex.plus.coil.b) bVar).b(str).i(getWarningImageView());
    }

    public final void y(k kVar, int i) {
        float f = this.w;
        Drawable C = com.yandex.plus.bdui.plus.analytics.b.C(kVar, i, f, f, f, f);
        int b = com.yandex.plus.home.common.utils.a.b(this.x, R.attr.plus_sdk_panelDefaultRippleColor);
        TextView mainActionTextView = getMainActionTextView();
        float f2 = this.w;
        mainActionTextView.setBackground(u.I(C, b, f2, f2, f2, f2));
    }

    public final void z(boolean z) {
        getAdditionalActionTextView().setVisibility(z ? 0 : 8);
    }
}
