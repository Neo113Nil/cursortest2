package ru.yandex.taxi.widget.wheel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.h2r;
import defpackage.ndh0;
import defpackage.qke;
import defpackage.rp31;
import defpackage.sph0;
import defpackage.ux41;
import defpackage.vby;
import defpackage.vd11;
import defpackage.wd11;
import defpackage.xby;
import defpackage.xz60;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u000eJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u000eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010+¨\u0006,"}, d2 = {"Lru/yandex/taxi/widget/wheel/PickerView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "setSafe", "Lzy11;", "setSafeLineSpacing", "(Z)V", "Lvd11;", "", "optionsItems", "setPicker", "(Lvd11;)V", "Lxz60;", "optionsSelectListener", "setOnOptionsSelectListener", "(Lxz60;)V", "option1", "option2", "selectItem", "(Ljava/lang/Object;Ljava/lang/Object;)V", BackendConfig.Restrictions.ENABLED, "setEnabled", "isSinglePositionMode", "updateMode", "Lru/yandex/taxi/widget/wheel/WheelView;", "options1", "Lru/yandex/taxi/widget/wheel/WheelView;", "options2", "options3", "Landroid/view/ViewGroup;", "options1Container", "Landroid/view/ViewGroup;", "Lux41;", "wheelOptions", "Lux41;", "Lxz60;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class PickerView extends LinearLayout {
    private final WheelView options1;
    private final ViewGroup options1Container;
    private final WheelView options2;
    private final WheelView options3;
    private xz60 optionsSelectListener;
    private final ux41 wheelOptions;

    public PickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c.q(this, sph0.wheel_picker, true);
        setOrientation(0);
        int i2 = ndh0.options1;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.options1 = (WheelView) ((View) rp31.d(this, i2));
        this.options2 = (WheelView) ((View) rp31.d(this, ndh0.options2));
        this.options3 = (WheelView) ((View) rp31.d(this, ndh0.options3));
        this.options1Container = (ViewGroup) ((View) rp31.d(this, ndh0.options1_container));
        this.wheelOptions = new ux41(this, new h2r(26, context, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(Context context, PickerView pickerView, int i, int i2, int i3, boolean z) {
        if (z) {
            qke.w(context, HapticController$Effect.TICK, false, false);
        }
        xz60 xz60Var = pickerView.optionsSelectListener;
        if (xz60Var != null) {
            xz60Var.l(i, i2, i3, z);
        }
    }

    public final void selectItem(Object option1, Object option2) {
        ux41 ux41Var = this.wheelOptions;
        WheelView wheelView = ux41Var.b;
        vby vbyVar = xby.d;
        vbyVar.n("WheelOptions: " + ux41Var + " setCurrentItems option1: " + option1 + " option2: " + option2);
        WheelView wheelView2 = ux41Var.a;
        wd11 adapter = wheelView2.getAdapter();
        if (adapter == null) {
            vbyVar.n("WheelOptions: " + ux41Var + " option1Adapter == null");
            vbyVar.j(new IllegalStateException("WheelOptions setCurrentItems option1Adapter == null"));
            return;
        }
        int b = adapter.b(option1);
        if (b == -1) {
            return;
        }
        wheelView2.setCurrentItem(b);
        wheelView.setAdapter(new wd11(wheelView2.getCurrentSubtree()));
        wd11 adapter2 = wheelView.getAdapter();
        if (adapter2 == null) {
            vbyVar.n("WheelOptions: " + ux41Var + " option2Adapter == null");
            return;
        }
        int b2 = adapter2.b(option2);
        if (b2 != -1) {
            wheelView.setCurrentItem(b2);
            ux41Var.d.g(b2, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.options1.setEnabled(enabled);
        this.options2.setEnabled(enabled);
        this.options3.setEnabled(enabled);
    }

    public final void setOnOptionsSelectListener(xz60 optionsSelectListener) {
        this.optionsSelectListener = optionsSelectListener;
    }

    public final void setPicker(vd11 optionsItems) {
        ux41 ux41Var = this.wheelOptions;
        ux41Var.getClass();
        xby.d.n("WheelOptions: " + ux41Var + " setPicker options size: " + optionsItems.b.size());
        WheelView wheelView = ux41Var.a;
        wheelView.setAdapter(new wd11(optionsItems));
        wheelView.setCurrentItem(0);
        WheelView wheelView2 = ux41Var.b;
        wheelView2.setAdapter(new wd11(wheelView.getCurrentSubtree()));
        wheelView2.setCurrentItem(0);
    }

    public final void setSafeLineSpacing(boolean setSafe) {
        this.options1.setSafeLineSpacing(setSafe);
        this.options2.setSafeLineSpacing(setSafe);
        this.options3.setSafeLineSpacing(setSafe);
    }

    public final void updateMode(boolean isSinglePositionMode) {
        wd11 adapter = this.options1.getAdapter();
        if (adapter == null) {
            xby.d.n("PickerView: " + this + " options1Adapter == null");
            return;
        }
        if (isSinglePositionMode && adapter.a() == 1) {
            this.options1Container.setVisibility(8);
        } else {
            this.options1Container.setVisibility(0);
        }
    }

    public PickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PickerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PickerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
