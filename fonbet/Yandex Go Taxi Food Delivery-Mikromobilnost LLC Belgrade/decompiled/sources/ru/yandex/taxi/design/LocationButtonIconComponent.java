package ru.yandex.taxi.design;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.view.ContextThemeWrapper;
import defpackage.a2i0;
import defpackage.f1h0;
import defpackage.kyh0;
import defpackage.mg;
import defpackage.oyr;
import defpackage.vng;
import defpackage.w511;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\b\u0003\u0010\u0006\u001a\u00020\u0007:\u0002\b\b\u0012\f\b\u0003\u0010\t\u001a\u00020\u0007:\u0002\b\n\u001a\u0002\b\r¢\u0006\u0004\b\u000b\u0010\fÊ\u0001\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/design/LocationButtonIconComponent;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "Landroidx/annotation/AttrRes;", "defStyleRes", "Landroidx/annotation/StyleRes;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkotlin/jvm/JvmOverloads;", "taxi_design", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocationButtonIconComponent extends FloatButtonIconComponent {
    public static final int $stable = FloatButtonIconComponent.$stable;

    public LocationButtonIconComponent(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int i3 = f1h0.ic_location_fill_24;
        Drawable t = vng.t(i3, new ContextThemeWrapper(getContext(), a2i0.IconDefaultStyle));
        if (t == null) {
            w511.f(oyr.j(i3, "Drawable resource ", " not found"));
            throw null;
        }
        if (xw31.n(context)) {
            setRotationY(180.0f);
        }
        setIcon(t);
        setContentDescription(getContext().getString(kyh0.detect_my_location_description));
        androidx.core.view.b.p(this, new mg(18, this));
    }

    public LocationButtonIconComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public LocationButtonIconComponent(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public LocationButtonIconComponent(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ LocationButtonIconComponent(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
