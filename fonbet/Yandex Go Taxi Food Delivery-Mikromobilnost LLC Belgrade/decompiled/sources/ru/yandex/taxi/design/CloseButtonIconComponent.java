package ru.yandex.taxi.design;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.view.ContextThemeWrapper;
import defpackage.a2i0;
import defpackage.dzg0;
import defpackage.kyh0;
import defpackage.mg;
import defpackage.oyr;
import defpackage.vng;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a\u0002\b\n¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\u0007H\u0014Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0000¨\u0006\f"}, d2 = {"Lru/yandex/taxi/design/CloseButtonIconComponent;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/jvm/JvmOverloads;", "closeDrawable", "taxi_design", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class CloseButtonIconComponent extends FloatButtonIconComponent {
    public static final int $stable = FloatButtonIconComponent.$stable;

    public CloseButtonIconComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        int closeDrawable = closeDrawable();
        Drawable t = vng.t(closeDrawable, new ContextThemeWrapper(getContext(), a2i0.IconDefaultStyle));
        if (t == null) {
            w511.f(oyr.j(closeDrawable, "Drawable resource ", " not found"));
            throw null;
        }
        setIcon(t);
        setContentDescription(getContext().getString(kyh0.common_close));
        androidx.core.view.b.p(this, new mg(14, this));
    }

    public int closeDrawable() {
        return dzg0.ic_cross_close;
    }

    public CloseButtonIconComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CloseButtonIconComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CloseButtonIconComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
