package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.d;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.controller.f;
import defpackage.ern;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.yxm;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class c extends ConstraintLayout {
    public static final /* synthetic */ s9f[] v = {new yxm(c.class, "guideline", "getGuideline()Landroidx/constraintlayout/widget/Guideline;", 0), f1d.c(ern.a, c.class, "checkableContainer", "getCheckableContainer()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), new yxm(c.class, "productTexts", "getProductTexts()Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/product/texts/ProductTexts;", 0), new yxm(c.class, "indicatorImageView", "getIndicatorImageView()Landroid/widget/ImageView;", 0), new yxm(c.class, "badges", "getBadges()Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/badges/Badges;", 0)};
    public final f q;
    public final f r;
    public final f s;
    public final f t;
    public final f u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.q = new f(new b(this, 0));
        this.r = new f(new b(this, 1));
        this.s = new f(new b(this, 2));
        this.t = new f(new b(this, 3));
        this.u = new f(new b(this, 4));
        r1.p(this, R.layout.acquisition_sdk_view_radio_button, true);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @NotNull
    public com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.badges.b getBadges() {
        return (com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.badges.b) this.u.g(v[4]);
    }

    @NotNull
    public ConstraintLayout getCheckableContainer() {
        return (ConstraintLayout) this.r.g(v[1]);
    }

    @NotNull
    public Guideline getGuideline() {
        return (Guideline) this.q.g(v[0]);
    }

    @NotNull
    public ImageView getIndicatorImageView() {
        return (ImageView) this.t.g(v[3]);
    }

    @NotNull
    public d getProductTexts() {
        return (d) this.s.g(v[2]);
    }

    @NotNull
    public View getView() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ c(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
