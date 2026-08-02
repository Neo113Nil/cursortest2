package com.yandex.plus.acquisition.sdk.button.section.ui.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.plus.acquisition.sdk.button.section.ui.api.j;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.ern;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.yxm;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class f extends FrameLayout {
    public static final /* synthetic */ s9f[] e = {new yxm(f.class, "contentContainer", "getContentContainer()Landroid/widget/FrameLayout;", 0), f1d.c(ern.a, f.class, "purchaseButton", "getPurchaseButton()Lcom/yandex/plus/acquisition/sdk/button/section/ui/api/PlusAcquisitionPurchaseButton;", 0), new yxm(f.class, "legalsTextView", "getLegalsTextView()Landroid/widget/TextView;", 0), new yxm(f.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)};
    public final com.yandex.plus.bdui.plus.content.controller.f a;
    public final com.yandex.plus.bdui.plus.content.controller.f b;
    public final com.yandex.plus.bdui.plus.content.controller.f c;
    public final com.yandex.plus.bdui.plus.content.controller.f d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.a = new com.yandex.plus.bdui.plus.content.controller.f(new e(this, 0));
        this.b = new com.yandex.plus.bdui.plus.content.controller.f(new e(this, 1));
        this.c = new com.yandex.plus.bdui.plus.content.controller.f(new e(this, 2));
        this.d = new com.yandex.plus.bdui.plus.content.controller.f(new e(this, 3));
        r1.p(this, R.layout.acquisition_sdk_view_button_section, true);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @NotNull
    public FrameLayout getContentContainer() {
        return (FrameLayout) this.a.g(e[0]);
    }

    @NotNull
    public TextView getLegalsTextView() {
        return (TextView) this.c.g(e[2]);
    }

    @NotNull
    public ProgressBar getProgressBar() {
        return (ProgressBar) this.d.g(e[3]);
    }

    @NotNull
    public j getPurchaseButton() {
        return (j) this.b.g(e[1]);
    }

    @NotNull
    public View getView() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ f(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.acquisition_sdk_buttonSectionStyle : i, (i3 & 8) != 0 ? R.style.AcquisitionSdk_Widget_ButtonSection : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
