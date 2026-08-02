package ru.yandex.taxi.design;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.view.ContextThemeWrapper;
import defpackage.a2i0;
import defpackage.dwh0;
import defpackage.dzg0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.kyh0;
import defpackage.oyr;
import defpackage.vng;
import defpackage.w511;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/design/BackButtonIconComponent;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "text", "Lzy11;", "setBadgeText", "(Ljava/lang/String;)V", "baseContentDescription", "Ljava/lang/String;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public class BackButtonIconComponent extends FloatButtonIconComponent {
    public static final int $stable = FloatButtonIconComponent.$stable;
    private final String baseContentDescription;

    public BackButtonIconComponent(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        String string = getContext().getString(kyh0.common_back);
        this.baseContentDescription = string;
        int i3 = xw31.n(context) ? dzg0.ic_arrow_right : dzg0.ic_arrow_left;
        Drawable t = vng.t(i3, new ContextThemeWrapper(getContext(), a2i0.IconDefaultStyle));
        if (t == null) {
            w511.f(oyr.j(i3, "Drawable resource ", " not found"));
            throw null;
        }
        setIcon(t);
        setContentDescription(string);
    }

    @Override // ru.yandex.taxi.design.CircleButtonComponent
    public void setBadgeText(String text) {
        String str;
        super.setBadgeText(text);
        if (text == null || evu0.J(text) || !TextUtils.isDigitsOnly(text)) {
            str = this.baseContentDescription;
        } else {
            int parseInt = Integer.parseInt(text);
            str = g8e.p(this.baseContentDescription, Extension.FIX_SPACE, ru.yandex.taxi.design.utils.c.v(this, dwh0.active_orders_counter_content_description, kyh0.active_orders_counter_one_content_description, parseInt, Integer.valueOf(parseInt)));
        }
        setContentDescription(str);
    }

    public BackButtonIconComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public BackButtonIconComponent(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public BackButtonIconComponent(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ BackButtonIconComponent(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
