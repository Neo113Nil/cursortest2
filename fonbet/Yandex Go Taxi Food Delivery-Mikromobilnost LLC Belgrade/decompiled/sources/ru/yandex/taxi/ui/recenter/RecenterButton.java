package ru.yandex.taxi.ui.recenter;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.FloatButtonIconComponent;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\b\u0003\u0010\u0006\u001a\u00020\u0007:\u0002\b\b\u0012\f\b\u0003\u0010\t\u001a\u00020\u0007:\u0002\b\n\u001a\u0002\b\r¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/ui/recenter/RecenterButton;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "Landroidx/annotation/AttrRes;", "defStyleRes", "Landroidx/annotation/StyleRes;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkotlin/jvm/JvmOverloads;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class RecenterButton extends FloatButtonIconComponent {
    public /* synthetic */ RecenterButton(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? xng0.circleButtonComponentStyle : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public RecenterButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public RecenterButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public RecenterButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public RecenterButton(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
