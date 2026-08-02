package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.icons.ProductIconView;
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
    public static final /* synthetic */ s9f[] s = {new yxm(c.class, "productTexts", "getProductTexts()Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/product/texts/ProductTexts;", 0), f1d.c(ern.a, c.class, "productIconView", "getProductIconView()Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/product/icons/ProductIconView;", 0)};
    public final f q;
    public final f r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.q = new f(new b(this, 0));
        this.r = new f(new b(this, 1));
        r1.p(this, R.layout.acquisition_sdk_view_composite_product, true);
        int d = com.yandex.plus.home.common.utils.a.d(context, R.dimen.acquisition_sdk_dimension_size_200);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.acquisition_sdk_dimension_size_175);
        setPadding(d, dimensionPixelSize, d, dimensionPixelSize);
    }

    @NotNull
    public ProductIconView getProductIconView() {
        return (ProductIconView) this.r.g(s[1]);
    }

    @NotNull
    public d getProductTexts() {
        return (d) this.q.g(s[0]);
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
