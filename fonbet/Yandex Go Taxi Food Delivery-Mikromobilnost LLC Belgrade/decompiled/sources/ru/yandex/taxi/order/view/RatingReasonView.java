package ru.yandex.taxi.order.view;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.mg;
import defpackage.r8i0;
import defpackage.tje;
import defpackage.xw31;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemCheckComponent;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/order/view/RatingReasonView;", "Lru/yandex/taxi/design/ListItemCheckComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lr8i0;", Constants.KEY_DATA, "Lzy11;", "setData", "(Lr8i0;)V", "", "selected", "setDataSelected", "(Z)V", "toggle", "()V", "Lr8i0;", "mg", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RatingReasonView extends ListItemCheckComponent {
    public static final int $stable = 8;
    private r8i0 data;

    public RatingReasonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setMode(ListItemCheckComponent.Mode.MULTIPLE);
        setLeadFrameMinimumWidth(0);
        xw31.I(this, Integer.valueOf(tje.u(16, getContext())), 0, Integer.valueOf(tje.u(2, getContext())), 0);
        androidx.core.view.b.p(this, new mg(27, this));
    }

    public final void setData(r8i0 data) {
        this.data = data;
        setTitle(data.b);
        setDataSelected(data.c);
    }

    public final void setDataSelected(boolean selected) {
        r8i0 r8i0Var = this.data;
        if (r8i0Var == null) {
            r8i0Var = null;
        }
        r8i0Var.c = selected;
        setChecked(selected);
        sendAccessibilityEvent(2048);
    }

    @Override // ru.yandex.taxi.design.ListItemCheckComponent, android.widget.Checkable
    public void toggle() {
        r8i0 r8i0Var = this.data;
        if (r8i0Var == null) {
            r8i0Var = null;
        }
        setDataSelected(!r8i0Var.c);
    }

    public RatingReasonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RatingReasonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ RatingReasonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
