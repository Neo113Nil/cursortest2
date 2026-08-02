package defpackage;

import java.util.HashMap;
import ru.yandex.taxi.analytics.Events$SuggestedCurrentLocation$ScreenType;

/* loaded from: classes12.dex */
public final class wff {
    public final o61 a;

    public wff(o61 o61Var) {
        this.a = o61Var;
    }

    public final void a(Events$SuggestedCurrentLocation$ScreenType events$SuggestedCurrentLocation$ScreenType) {
        String screenType = events$SuggestedCurrentLocation$ScreenType.getScreenType();
        o61 o61Var = this.a;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (screenType != null) {
            hashMap.put("screen_type", screenType);
        }
        o61Var.a.a("CurrentLocationItem.Tapped", hashMap, 1, new HashMap());
    }
}
