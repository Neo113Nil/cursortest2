package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.pluspoints;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.data.common.k;
import com.yandex.plus.core.theme.c;
import defpackage.b6e;
import defpackage.eb;
import defpackage.ern;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.wdu;
import defpackage.xz0;
import defpackage.yxm;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class b extends ConstraintLayout {
    public static final /* synthetic */ s9f[] D = {new yxm(b.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), f1d.c(ern.a, b.class, "subtitleTextView", "getSubtitleTextView()Landroid/widget/TextView;", 0), new yxm(b.class, "balanceTextView", "getBalanceTextView()Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/pluspoints/PlusPanelTextWithIconView;", 0), new yxm(b.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)};
    public Context A;
    public String B;
    public String C;
    public final com.yandex.plus.core.strings.a q;
    public final f r;
    public final f s;
    public final f t;
    public final f u;
    public c v;
    public c w;
    public c x;
    public final float y;
    public final Drawable z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, @NotNull com.yandex.plus.core.strings.a aVar) {
        super(context);
        context.getClass();
        aVar.getClass();
        this.q = aVar;
        this.r = new f(new a(this, 0));
        this.s = new f(new a(this, 1));
        this.t = new f(new a(this, 2));
        this.u = new f(new a(this, 3));
        float dimension = getResources().getDimension(R.dimen.plus_sdk_panel_default_corner_radius);
        this.y = dimension;
        this.z = com.yandex.plus.bdui.plus.analytics.b.y(r1.D(aVar), dimension);
        this.A = context;
        r1.p(this, R.layout.plus_sdk_panel_plus_view, true);
        wdu.q(this, new eb(16));
    }

    private final PlusPanelTextWithIconView getBalanceTextView() {
        return (PlusPanelTextWithIconView) this.t.g(D[2]);
    }

    private final ProgressBar getProgressBar() {
        return (ProgressBar) this.u.g(D[3]);
    }

    private final TextView getSubtitleTextView() {
        return (TextView) this.s.g(D[1]);
    }

    private final TextView getTitleTextView() {
        return (TextView) this.r.g(D[0]);
    }

    public final void setActionEnabled(boolean z) {
        u.C(getTitleTextView(), z);
    }

    public final void setBackground(k kVar) {
        Drawable drawable;
        if (kVar != null) {
            float f = this.y;
            drawable = com.yandex.plus.bdui.plus.analytics.b.B(kVar, f, f, f, f);
        } else {
            drawable = this.z;
        }
        Drawable drawable2 = drawable;
        int b = com.yandex.plus.home.common.utils.a.b(this.A, R.attr.plus_sdk_panelDefaultRippleColor);
        float f2 = this.y;
        setBackground(u.I(drawable2, b, f2, f2, f2, f2));
    }

    public final void setBalance(@NotNull com.yandex.plus.home.feature.panel.internalapi.model.c cVar) {
        Drawable drawable;
        cVar.getClass();
        boolean z = cVar instanceof com.yandex.plus.home.feature.panel.internalapi.model.a;
        getProgressBar().setVisibility(z ? 0 : 8);
        getBalanceTextView().setVisibility(z ? 4 : 0);
        Drawable drawable2 = null;
        com.yandex.plus.home.feature.panel.internalapi.model.b bVar = cVar instanceof com.yandex.plus.home.feature.panel.internalapi.model.b ? (com.yandex.plus.home.feature.panel.internalapi.model.b) cVar : null;
        if (bVar != null) {
            String str = bVar.a;
            getBalanceTextView().setBrandType(this.q);
            getBalanceTextView().setText(str);
            if (this.x != null) {
                getBalanceTextView().setTextAndIconDrawableHolder(this.x);
                return;
            }
            PlusPanelTextWithIconView balanceTextView = getBalanceTextView();
            c cVar2 = this.v;
            c cVar3 = this.w;
            balanceTextView.s = true;
            if (cVar2 instanceof com.yandex.plus.core.theme.a) {
                drawable = new ColorDrawable(((com.yandex.plus.core.theme.a) cVar2).a);
            } else if (cVar2 instanceof com.yandex.plus.core.theme.b) {
                drawable = ((com.yandex.plus.core.theme.b) cVar2).a;
            } else {
                if (cVar2 != null) {
                    b6e.s();
                    return;
                }
                drawable = null;
            }
            balanceTextView.k = drawable;
            if (cVar3 instanceof com.yandex.plus.core.theme.a) {
                drawable2 = new ColorDrawable(((com.yandex.plus.core.theme.a) cVar3).a);
            } else if (cVar3 instanceof com.yandex.plus.core.theme.b) {
                drawable2 = ((com.yandex.plus.core.theme.b) cVar3).a;
            } else if (cVar3 != null) {
                b6e.s();
                return;
            }
            balanceTextView.m = drawable2;
            balanceTextView.invalidate();
            balanceTextView.requestLayout();
        }
    }

    public final void setBalanceContentDescription(String str) {
        this.C = str;
        setContentDescription(CollectionsKt.X(xz0.w(new String[]{str, this.B}), null, null, null, null, 63));
    }

    public final void setGeneralContentDescription(@NotNull String str) {
        str.getClass();
        this.B = str;
        setContentDescription(CollectionsKt.X(xz0.w(new String[]{this.C, str}), null, null, null, null, 63));
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
}
