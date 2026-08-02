package ru.yandex.taxi.walkroute;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import defpackage.c0h0;
import defpackage.mrg0;
import defpackage.tje;
import defpackage.vng;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/walkroute/WalkRouteInfoView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "compoundDrawable", CA20Status.STATUS_USER_I, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WalkRouteInfoView extends RobotoTextView {
    private int compoundDrawable;

    public WalkRouteInfoView(Context context) {
        super(context, null, 0, 6, null);
        setTextSize(0, getResources().getDimension(mrg0.component_text_size_caption));
        setBackgroundResource(c0h0.bg_walking_route_info_corner_4_dp);
        setPaddingRelative(getResources().getDimensionPixelSize(mrg0.go_design_s_space), tje.u(4, context), getResources().getDimensionPixelSize(mrg0.go_design_s_space), tje.u(4, context));
        int i = c0h0.ic_walking_man;
        this.compoundDrawable = i;
        setCompoundDrawablesWithIntrinsicBounds(vng.t(i, context), (Drawable) null, (Drawable) null, (Drawable) null);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }

    @Override // ru.yandex.taxi.widget.RobotoTextView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        if (this.compoundDrawable != 0) {
            setCompoundDrawablesWithIntrinsicBounds(vng.t(this.compoundDrawable, getContext()), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }
}
