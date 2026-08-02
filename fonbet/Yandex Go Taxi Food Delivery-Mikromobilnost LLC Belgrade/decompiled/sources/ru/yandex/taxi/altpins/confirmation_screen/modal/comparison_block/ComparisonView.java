package ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import defpackage.ax1;
import defpackage.bdh0;
import defpackage.cma1;
import defpackage.dv31;
import defpackage.gph0;
import defpackage.m6;
import defpackage.ny61;
import defpackage.pvc;
import defpackage.qvc;
import defpackage.rvc;
import defpackage.svc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.altpins.confirmation_screen.modal.AlternativeDestinationModalView;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/altpins/confirmation_screen/modal/comparison_block/ComparisonView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/yandex/taxi/altpins/confirmation_screen/modal/comparison_block/OptionType;", "type", "Lzy11;", "setCheckedType", "(Lru/yandex/taxi/altpins/confirmation_screen/modal/comparison_block/OptionType;)V", "Lsvc;", ClidProvider.STATE, "render", "(Lsvc;)V", "Lqvc;", "listener", "setChangeTypeListener", "(Lqvc;)V", "Lrvc;", "binding", "Lrvc;", "Ldv31;", "stateHolder", "Ldv31;", "onChangeType", "Lqvc;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComparisonView extends LinearLayout {
    private final rvc binding;
    private qvc onChangeType;
    private final dv31 stateHolder;

    public ComparisonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(gph0.comparison_view, this);
        int i2 = bdh0.altpin;
        ComparisonItemView comparisonItemView = (ComparisonItemView) cma1.O(i2, this);
        if (comparisonItemView != null) {
            i2 = bdh0.original;
            ComparisonItemView comparisonItemView2 = (ComparisonItemView) cma1.O(i2, this);
            if (comparisonItemView2 != null) {
                this.binding = new rvc(this, comparisonItemView, comparisonItemView2);
                this.stateHolder = new ax1(this, svc.c, this, 3);
                setOrientation(1);
                comparisonItemView.setOnCheckListener(new pvc(this, 0));
                comparisonItemView2.setOnCheckListener(new pvc(this, 1));
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCheckedType(OptionType type) {
        qvc qvcVar = this.onChangeType;
        if (qvcVar != null) {
            AlternativeDestinationModalView._init_$lambda$0((AlternativeDestinationModalView) ((m6) qvcVar).b, type);
        }
    }

    public final void render(svc state) {
        this.stateHolder.g(state, false, false);
    }

    public final void setChangeTypeListener(qvc listener) {
        this.onChangeType = listener;
    }

    public ComparisonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComparisonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ComparisonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
