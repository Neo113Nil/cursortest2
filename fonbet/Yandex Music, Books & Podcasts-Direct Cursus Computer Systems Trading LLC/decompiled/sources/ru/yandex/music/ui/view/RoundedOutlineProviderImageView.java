package ru.yandex.music.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.pgo;
import defpackage.qgo;
import defpackage.zdn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class RoundedOutlineProviderImageView extends AppCompatImageView {
    public float a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedOutlineProviderImageView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zdn.e, i, 0);
        obtainStyledAttributes.getClass();
        setCornerRadius(obtainStyledAttributes.getDimensionPixelSize(0, 0));
        obtainStyledAttributes.recycle();
        setClipToOutline(true);
        setOutlineProvider(new qgo(this.a, pgo.a));
    }

    public final float getCornerRadius() {
        return this.a;
    }

    public final void setCornerRadius(float f) {
        this.a = f;
        setOutlineProvider(new qgo(this.a, pgo.a));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundedOutlineProviderImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundedOutlineProviderImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ RoundedOutlineProviderImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
