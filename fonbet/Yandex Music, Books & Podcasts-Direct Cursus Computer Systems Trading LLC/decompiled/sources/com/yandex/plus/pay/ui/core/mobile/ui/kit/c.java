package com.yandex.plus.pay.ui.core.mobile.ui.kit;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.provider.Settings;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import defpackage.btf;
import defpackage.jyr;
import defpackage.y2x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class c extends ProgressBar {
    public static final /* synthetic */ int b = 0;
    public final jyr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = btf.b(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(21, this));
        setIndeterminateTintList(ColorStateList.valueOf(com.yandex.plus.home.common.utils.a.b(context, R.attr.pay_sdk_progressColor)));
        setIndeterminateDrawable(y2x.w(context, R.drawable.pay_sdk_ic_spinner));
    }

    private final ObjectAnimator getAnimator() {
        Object value = this.a.getValue();
        value.getClass();
        return (ObjectAnimator) value;
    }

    @Override // android.widget.ProgressBar
    public int getProgress() {
        return isIndeterminate() ? (int) getRotation() : super.getProgress();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isIndeterminate()) {
            if (Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                return;
            }
            getAnimator().start();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        if (getAnimator().isRunning()) {
            getAnimator().cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
        } else {
            setRotation(i);
            getAnimator().setFloatValues(getRotation() + 0.0f, getRotation() + 360.0f);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ c(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
