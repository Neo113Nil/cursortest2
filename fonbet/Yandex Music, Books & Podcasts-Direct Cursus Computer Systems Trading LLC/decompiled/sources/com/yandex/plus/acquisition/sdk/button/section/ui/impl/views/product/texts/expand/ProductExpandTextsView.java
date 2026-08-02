package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.expand;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
public final class ProductExpandTextsView extends ConstraintLayout implements b {
    public static final /* synthetic */ s9f[] s = {new yxm(ProductExpandTextsView.class, "productTexts", "getProductTexts()Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/product/texts/ProductTexts;", 0), f1d.c(ern.a, ProductExpandTextsView.class, "expandTextView", "getExpandTextView()Landroid/widget/TextView;", 0)};
    public final f q;
    public final f r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductExpandTextsView(@NotNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.q = new f(new c(this, 0));
        this.r = new f(new c(this, 1));
        r1.p(this, R.layout.acquisition_sdk_view_texts_with_expand, true);
    }

    @Override // com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.expand.b
    @NotNull
    public TextView getExpandTextView() {
        return (TextView) this.r.g(s[1]);
    }

    @Override // com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.expand.b
    @NotNull
    public d getProductTexts() {
        return (d) this.q.g(s[0]);
    }

    @Override // com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.expand.b
    @NotNull
    public View getView() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductExpandTextsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductExpandTextsView(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ ProductExpandTextsView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductExpandTextsView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
