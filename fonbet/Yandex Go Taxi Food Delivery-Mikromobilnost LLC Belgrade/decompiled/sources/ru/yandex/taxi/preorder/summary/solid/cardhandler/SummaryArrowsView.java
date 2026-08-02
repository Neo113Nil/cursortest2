package ru.yandex.taxi.preorder.summary.solid.cardhandler;

import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.cdv0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.ArrowsView;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/preorder/summary/solid/cardhandler/SummaryArrowsView;", "Lru/yandex/taxi/widget/ArrowsView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$a;", "customBehaviour", "Lzy11;", "updateArrowBehaviour", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout$a;)V", "setDrawHandlerDefault", "()V", "setDrawHandlerInside", "defaultArrowBehaviour", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$a;", "Companion", "cdv0", "solid"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SummaryArrowsView extends ArrowsView {
    public static final cdv0 Companion = new cdv0();
    private static final CoordinatorLayout.a INSIDE_BEHAVIOUR = new SummaryArrowsView$Companion$INSIDE_BEHAVIOUR$1();
    private final CoordinatorLayout.a defaultArrowBehaviour;

    public /* synthetic */ SummaryArrowsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void updateArrowBehaviour(CoordinatorLayout.a customBehaviour) {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) getLayoutParams();
        if (customBehaviour == null) {
            customBehaviour = this.defaultArrowBehaviour;
        }
        layoutParams.setBehavior(customBehaviour);
    }

    public final void setDrawHandlerDefault() {
        updateArrowBehaviour(null);
    }

    public final void setDrawHandlerInside() {
        updateArrowBehaviour(INSIDE_BEHAVIOUR);
    }

    public SummaryArrowsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SummaryArrowsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.defaultArrowBehaviour = getBehavior();
    }

    public SummaryArrowsView(Context context) {
        this(context, null, 0, 6, null);
    }
}
