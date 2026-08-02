package ru.yandex.taxi.scooters.utils;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.a2i0;
import defpackage.dzg0;
import defpackage.vjh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.CloseButtonIconComponent;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a\u0002\b\n¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\u0007H\u0014J\b\u0010\f\u001a\u00020\u0007H\u0014Ê\u0001\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\u0003\u0010\u0000¨\u0006\r"}, d2 = {"Lru/yandex/taxi/scooters/utils/ScootersCloseButtonIconComponent;", "Lru/yandex/taxi/design/CloseButtonIconComponent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/jvm/JvmOverloads;", "closeDrawable", "getLayoutResource", "design", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersCloseButtonIconComponent extends CloseButtonIconComponent {
    public static final int $stable = CloseButtonIconComponent.$stable;

    public /* synthetic */ ScootersCloseButtonIconComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? a2i0.FloatButtonIconStyle : i);
    }

    @Override // ru.yandex.taxi.design.CloseButtonIconComponent
    public int closeDrawable() {
        return dzg0.ic_cross_close_white;
    }

    @Override // ru.yandex.taxi.design.FloatButtonIconComponent, ru.yandex.taxi.widget.buttons.LittleIconCircleButton, ru.yandex.taxi.widget.buttons.IconCircleButton, ru.yandex.taxi.design.CircleButtonComponent
    public int getLayoutResource() {
        return vjh0.scooters_float_button_icon_component;
    }

    public ScootersCloseButtonIconComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ScootersCloseButtonIconComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ScootersCloseButtonIconComponent(Context context) {
        this(context, null, 0, 6, null);
    }
}
