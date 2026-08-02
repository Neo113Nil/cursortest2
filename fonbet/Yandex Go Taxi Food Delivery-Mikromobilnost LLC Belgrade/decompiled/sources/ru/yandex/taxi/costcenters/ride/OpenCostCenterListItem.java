package ru.yandex.taxi.costcenters.ride;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.czg0;
import defpackage.dzg0;
import defpackage.n470;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/costcenters/ride/OpenCostCenterListItem;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ln470;", "viewModel", "Lzy11;", "setState", "(Ln470;)V", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OpenCostCenterListItem extends ListItemComponent {
    public OpenCostCenterListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
        setTrailMode(2);
        setTrailImage(dzg0.component_trail_navigation_elevator);
        setLeadImage(czg0.ic_cost_center);
    }

    public final void setState(n470 viewModel) {
        setVisibility(viewModel.a.length() > 0 ? 0 : 8);
        setTitle(viewModel.a);
        setSubtitle(viewModel.b);
    }

    public OpenCostCenterListItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OpenCostCenterListItem(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ OpenCostCenterListItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
