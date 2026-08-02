package ru.yandex.taxi.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import defpackage.w1w;
import defpackage.x1w;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/widget/InsetsAwareLinearLayout;", "Landroid/widget/LinearLayout;", "Lw1w;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/WindowInsets;", "insets", "dispatchApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "left", "top", "right", "bottom", "Lzy11;", "setPadding", "(IIII)V", "setSuperPadding", "Lx1w;", "insetsAwareHelper", "Lx1w;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InsetsAwareLinearLayout extends LinearLayout implements w1w {
    public static final int $stable = 8;
    private final x1w insetsAwareHelper;

    public InsetsAwareLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        x1w x1wVar = new x1w(this, attributeSet);
        this.insetsAwareHelper = x1wVar;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(this, x1wVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        return this.insetsAwareHelper.a(insets, super.dispatchApplyWindowInsets(insets));
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        x1w x1wVar = this.insetsAwareHelper;
        ((w1w) x1wVar.a).setSuperPadding(left, top, right, bottom);
        x1wVar.b = new Rect(left, top, right, bottom);
    }

    @Override // defpackage.w1w
    public void setSuperPadding(int left, int top, int right, int bottom) {
        super.setPadding(left, top, right, bottom);
    }

    public InsetsAwareLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public InsetsAwareLinearLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ InsetsAwareLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
