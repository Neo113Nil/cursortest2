package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.buyplus;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.theme.c;
import defpackage.eb;
import defpackage.ern;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.wdu;
import defpackage.yxm;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class b extends LinearLayout {
    public static final /* synthetic */ s9f[] h = {new yxm(b.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), f1d.c(ern.a, b.class, "subtitleTextView", "getSubtitleTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "actionButton", "getActionButton()Landroid/widget/TextView;", 0)};
    public final com.yandex.plus.core.strings.a a;
    public final f b;
    public final f c;
    public final f d;
    public final float e;
    public final float f;
    public Context g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, @NotNull com.yandex.plus.core.strings.a aVar) {
        super(context);
        context.getClass();
        aVar.getClass();
        this.a = aVar;
        this.b = new f(new a(this, 0));
        this.c = new f(new a(this, 1));
        this.d = new f(new a(this, 2));
        this.e = getResources().getDimension(R.dimen.plus_sdk_panel_default_corner_radius);
        this.f = getResources().getDimension(R.dimen.plus_sdk_panel_buy_button_corner_radius);
        this.g = context;
        setOrientation(1);
        r1.p(this, R.layout.plus_sdk_panel_buy_view, true);
        wdu.q(this, new eb(13));
        wdu.q(getActionButton(), new eb(14));
    }

    private final TextView getActionButton() {
        return (TextView) this.d.g(h[2]);
    }

    private final TextView getSubtitleTextView() {
        return (TextView) this.c.g(h[1]);
    }

    private final TextView getTitleTextView() {
        return (TextView) this.b.g(h[0]);
    }

    public final void a(Context context) {
        context.getClass();
        this.g = context;
        Drawable y = com.yandex.plus.bdui.plus.analytics.b.y(r1.D(this.a), this.f);
        int b = com.yandex.plus.home.common.utils.a.b(this.g, R.attr.plus_sdk_panelDefaultRippleColor);
        TextView actionButton = getActionButton();
        float f = this.f;
        actionButton.setBackground(u.I(y, b, f, f, f, f));
    }

    public final void setActionButtonClickListener(View.OnClickListener onClickListener) {
        r1.E(getActionButton(), onClickListener);
    }

    public final void setActionButtonContentDescription(String str) {
        getActionButton().setContentDescription(str);
    }

    public final void setActionButtonText(CharSequence charSequence) {
        getActionButton().setText(charSequence);
    }

    public final void setActionButtonTextDrawable(@NotNull c cVar) {
        cVar.getClass();
        com.yandex.plus.bdui.flex.ui.a.D(getActionButton(), cVar, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
    }

    public final void setContentDescription(@NotNull String str) {
        str.getClass();
        setContentDescription((CharSequence) str);
    }

    public final void setSubtitle(@NotNull CharSequence charSequence) {
        charSequence.getClass();
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
}
