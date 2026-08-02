package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.controller.f;
import defpackage.eb;
import defpackage.eeh;
import defpackage.ern;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.t86;
import defpackage.wdu;
import defpackage.yxm;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class c extends ConstraintLayout {
    public static final /* synthetic */ s9f[] y = {new yxm(c.class, "topTextView", "getTopTextView()Landroid/widget/TextView;", 0), f1d.c(ern.a, c.class, "bottomTextView", "getBottomTextView()Landroid/widget/TextView;", 0), new yxm(c.class, "arrowForwardImageView", "getArrowForwardImageView()Landroid/widget/ImageView;", 0), new yxm(c.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0)};
    public final f q;
    public final f r;
    public final f s;
    public final f t;
    public final int u;
    public final float v;
    public Context w;
    public boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context) {
        super(context);
        context.getClass();
        this.q = new f(new b(this, 0));
        this.r = new f(new b(this, 1));
        this.s = new f(new b(this, 2));
        this.t = new f(new b(this, 3));
        int k = r1.k(R.dimen.plus_sdk_panel_mini_promo_content_padding, this);
        this.u = k;
        this.v = getResources().getDimension(R.dimen.plus_sdk_panel_default_corner_radius);
        this.w = context;
        r1.p(this, R.layout.plus_sdk_panel_mini_promo_view, true);
        setPadding(k, k, k, k);
        wdu.q(this, new eb(15));
    }

    private final ImageView getArrowForwardImageView() {
        return (ImageView) this.s.g(y[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getBottomTextView() {
        return (TextView) this.r.g(y[1]);
    }

    private final ImageView getImageView() {
        return (ImageView) this.t.g(y[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTopTextView() {
        return (TextView) this.q.g(y[0]);
    }

    private final void setTextAlignment(boolean z) {
        ViewGroup.LayoutParams layoutParams = getBottomTextView().getLayoutParams();
        t86 t86Var = layoutParams instanceof t86 ? (t86) layoutParams : null;
        if (t86Var == null) {
            return;
        }
        boolean z2 = z && !this.x;
        boolean z3 = t86Var.l == 0;
        if (z2 && !z3) {
            t86Var.l = 0;
        } else {
            if (z2 || !z3) {
                return;
            }
            t86Var.l = -1;
        }
    }

    private final void setTextMaxLines(boolean z) {
        if (z) {
            getTopTextView().setMaxLines(Integer.MAX_VALUE);
            getBottomTextView().setMaxLines(Integer.MAX_VALUE);
            return;
        }
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new a(0, this));
            return;
        }
        TextPaint paint = getTopTextView().getPaint();
        float descent = paint.descent() - paint.ascent();
        if (descent < 1.0f) {
            descent = 1.0f;
        }
        int height = (int) ((getHeight() - (this.u * 2)) / descent);
        if (!this.x) {
            getBottomTextView().setMaxLines(height);
            return;
        }
        getTopTextView().setMaxLines(Math.min(height, eeh.b(getTopTextView().getHeight() / descent)));
        getBottomTextView().setMaxLines(height - getTopTextView().getMaxLines());
    }

    public final void setActionEnabled(boolean z) {
        getArrowForwardImageView().setVisibility(z ? 0 : 8);
    }

    public final void setActionIconDrawable(@NotNull com.yandex.plus.core.theme.c cVar) {
        cVar.getClass();
        if (cVar instanceof com.yandex.plus.core.theme.a) {
            getArrowForwardImageView().setImageTintList(ColorStateList.valueOf(((com.yandex.plus.core.theme.a) cVar).a));
        }
    }

    public final void setContentDescription(@NotNull String str) {
        str.getClass();
        setContentDescription((CharSequence) str);
    }

    public final void setIsLong(boolean z) {
        setTextAlignment(z);
        setTextMaxLines(z);
    }

    public final void setSubtitleTextDrawable(@NotNull com.yandex.plus.core.theme.c cVar) {
        cVar.getClass();
        if (this.x) {
            com.yandex.plus.bdui.flex.ui.a.D(getBottomTextView(), cVar, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
        }
    }

    public final void setTitleTextDrawable(@NotNull com.yandex.plus.core.theme.c cVar) {
        cVar.getClass();
        if (this.x) {
            com.yandex.plus.bdui.flex.ui.a.D(getTopTextView(), cVar, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
        } else {
            com.yandex.plus.bdui.flex.ui.a.D(getBottomTextView(), cVar, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
        }
    }

    public final void v(String str, com.yandex.plus.core.imageloader.b bVar) {
        bVar.getClass();
        ((com.yandex.plus.coil.b) bVar).b(str).i(getImageView());
    }

    public final void w(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.x = !StringsKt.U(str2);
        getTopTextView().setVisibility(this.x ? 0 : 8);
        if (!this.x) {
            getBottomTextView().setText(str);
        } else {
            getTopTextView().setText(str);
            getBottomTextView().setText(str2);
        }
    }
}
