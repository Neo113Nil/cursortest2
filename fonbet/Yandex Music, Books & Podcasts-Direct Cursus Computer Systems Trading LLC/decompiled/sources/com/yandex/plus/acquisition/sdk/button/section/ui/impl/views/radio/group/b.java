package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Guideline;
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
public final class b extends FrameLayout implements com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.accordion.a {
    public static final /* synthetic */ s9f[] d = {new yxm(b.class, "guideline", "getGuideline()Landroidx/constraintlayout/widget/Guideline;", 0), f1d.c(ern.a, b.class, "radioButtonsContainer", "getRadioButtonsContainer()Landroid/widget/LinearLayout;", 0), new yxm(b.class, "productExpandTexts", "getProductExpandTexts()Lcom/yandex/plus/acquisition/sdk/button/section/ui/impl/views/product/texts/expand/ProductExpandTexts;", 0)};
    public final f a;
    public final f b;
    public final f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.a = new f(new a(this, 0));
        this.b = new f(new a(this, 1));
        this.c = new f(new a(this, 2));
        r1.p(this, R.layout.acquisition_sdk_view_radio_group, true);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.accordion.a
    @NotNull
    public View getCollapsedView() {
        return getProductExpandTexts().getView();
    }

    @Override // com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.accordion.a
    @NotNull
    public FrameLayout getContainer() {
        return this;
    }

    @Override // com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.accordion.a
    @NotNull
    public View getExpandedView() {
        return getRadioButtonsContainer();
    }

    @NotNull
    public Guideline getGuideline() {
        return (Guideline) this.a.g(d[0]);
    }

    @NotNull
    public com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.expand.b getProductExpandTexts() {
        return (com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.expand.b) this.c.g(d[2]);
    }

    @NotNull
    public LinearLayout getRadioButtonsContainer() {
        return (LinearLayout) this.b.g(d[1]);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ b(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
