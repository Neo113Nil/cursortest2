package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.ern;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.yxm;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class ProductTextsView extends LinearLayout implements d {
    public static final /* synthetic */ s9f[] c = {new yxm(ProductTextsView.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), f1d.c(ern.a, ProductTextsView.class, "subtitleTextView", "getSubtitleTextView()Landroid/widget/TextView;", 0)};
    public final com.yandex.plus.bdui.plus.content.controller.f a;
    public final com.yandex.plus.bdui.plus.content.controller.f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductTextsView(@NotNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.a = new com.yandex.plus.bdui.plus.content.controller.f(new e(this, 0));
        this.b = new com.yandex.plus.bdui.plus.content.controller.f(new e(this, 1));
        r1.p(this, R.layout.acquisition_sdk_view_product_texts, true);
        setOrientation(1);
    }

    @Override // com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.d
    @NotNull
    public TextView getSubtitleTextView() {
        return (TextView) this.b.g(c[1]);
    }

    @Override // com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.d
    @NotNull
    public TextView getTitleTextView() {
        return (TextView) this.a.g(c[0]);
    }

    @Override // com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.d
    @NotNull
    public View getView() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductTextsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductTextsView(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ ProductTextsView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductTextsView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
