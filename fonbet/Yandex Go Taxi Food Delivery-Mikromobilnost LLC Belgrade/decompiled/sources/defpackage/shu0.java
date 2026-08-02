package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.masstransit.sdk.checkout.impl.stop.ui.components.RouteLineIndicatorSize;

/* loaded from: classes12.dex */
public abstract class shu0 {
    public static final q5l0 a;
    public static final q5l0 b;
    public static final q5l0 c;
    public static final n5l0 d;

    static {
        RouteLineIndicatorSize routeLineIndicatorSize = RouteLineIndicatorSize.M;
        a = new q5l0(routeLineIndicatorSize, new up2(r5l0.a));
        b = new q5l0(routeLineIndicatorSize, AppColor$Palette.Text);
        c = new q5l0(RouteLineIndicatorSize.S, AppColor$Palette.Background);
        d = new n5l0(AppColor$Palette.Line, null);
    }
}
