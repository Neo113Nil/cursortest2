package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.badges;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
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
public final class BadgesView extends LinearLayout implements b {
    public static final /* synthetic */ s9f[] d = {new yxm(BadgesView.class, "discountBadgeTextView", "getDiscountBadgeTextView()Landroid/widget/TextView;", 0), f1d.c(ern.a, BadgesView.class, "plusPointsBadgeContainer", "getPlusPointsBadgeContainer()Landroid/widget/LinearLayout;", 0), new yxm(BadgesView.class, "plusPointsBadgeTextView", "getPlusPointsBadgeTextView()Landroid/widget/TextView;", 0)};
    public final f a;
    public final f b;
    public final f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgesView(@NotNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int d2;
        int i3;
        context.getClass();
        this.a = new f(new c(this, 0));
        this.b = new f(new c(this, 1));
        this.c = new f(new c(this, 2));
        r1.p(this, R.layout.acquisition_sdk_view_badges, true);
        if (getOrientation() == 0) {
            setGravity(0);
            i3 = com.yandex.plus.home.common.utils.a.d(context, R.dimen.acquisition_sdk_dimension_size_50);
            d2 = 0;
        } else {
            setGravity(8388613);
            d2 = com.yandex.plus.home.common.utils.a.d(context, R.dimen.acquisition_sdk_dimension_size_50);
            i3 = 0;
        }
        TextView discountBadgeTextView = getDiscountBadgeTextView();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getDiscountBadgeTextView().getLayoutParams().width, getDiscountBadgeTextView().getLayoutParams().height);
        layoutParams.setMarginEnd(i3);
        layoutParams.bottomMargin = d2;
        discountBadgeTextView.setLayoutParams(layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        LinearLayout plusPointsBadgeContainer = getPlusPointsBadgeContainer();
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.acquisition_sdk_badge_corner_radius);
        RoundRectShape roundRectShape = new RoundRectShape(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize}, null, null);
        ShapeDrawable a = a(roundRectShape, context.getColor(R.color.acquisition_sdk_color_shadow_main), context.getResources().getDimensionPixelSize(R.dimen.acquisition_sdk_dimension_size_50));
        ShapeDrawable a2 = a(roundRectShape, context.getColor(R.color.acquisition_sdk_color_shadow_secondary), context.getResources().getDimensionPixelSize(R.dimen.acquisition_sdk_dimension_size_125));
        int color = context.getColor(R.color.acquisition_sdk_color_bg_brand);
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        shapeDrawable.getPaint().setColor(color);
        plusPointsBadgeContainer.setBackground(new LayerDrawable(new Drawable[]{a, a2, shapeDrawable}));
    }

    public final ShapeDrawable a(RoundRectShape roundRectShape, int i, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        shapeDrawable.getPaint().setColor(i);
        getContext().getClass();
        shapeDrawable.getPaint().setShadowLayer(i2, 0.0f, r1.getResources().getDimensionPixelSize(R.dimen.acquisition_sdk_dimension_size_15), i);
        return shapeDrawable;
    }

    @Override // com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.badges.b
    @NotNull
    public TextView getDiscountBadgeTextView() {
        return (TextView) this.a.g(d[0]);
    }

    @Override // com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.badges.b
    @NotNull
    public LinearLayout getPlusPointsBadgeContainer() {
        return (LinearLayout) this.b.g(d[1]);
    }

    @Override // com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.badges.b
    @NotNull
    public TextView getPlusPointsBadgeTextView() {
        return (TextView) this.c.g(d[2]);
    }

    @Override // com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.badges.b
    @NotNull
    public View getView() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BadgesView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BadgesView(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ BadgesView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BadgesView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
