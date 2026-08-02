package ru.yandex.taxi.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.dzg0;
import defpackage.mrg0;
import defpackage.tje;
import defpackage.vng;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a\u0002\b\n¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/widget/BottomEdgeButtonLayout;", "Lru/yandex/taxi/widget/ComponentLinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/jvm/JvmOverloads;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class BottomEdgeButtonLayout extends ComponentLinearLayout {
    public BottomEdgeButtonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        setPadding(getPaddingLeft() == 0 ? tje.r(mrg0.go_design_s_space, getContext()) : paddingLeft, getPaddingTop() == 0 ? tje.r(mrg0.go_design_s_space, getContext()) : paddingTop, getPaddingRight() == 0 ? tje.r(mrg0.go_design_s_space, getContext()) : paddingRight, getPaddingBottom() == 0 ? tje.r(mrg0.go_design_m_space, getContext()) : paddingBottom);
        setShowDividers(2);
        setDividerDrawable(vng.t(dzg0.bottom_edge_button_divider, getContext()));
        setBaselineAligned(false);
    }

    public BottomEdgeButtonLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BottomEdgeButtonLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BottomEdgeButtonLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
