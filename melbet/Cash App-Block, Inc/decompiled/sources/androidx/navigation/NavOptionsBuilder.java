package androidx.navigation;

import androidx.navigation.NavOptions;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class NavOptionsBuilder {
    public boolean inclusive;
    public boolean launchSingleTop;
    public String popUpToRoute;
    public boolean saveState;
    public final NavOptions.Builder builder = new NavOptions.Builder();
    public int popUpToId = -1;

    public final void setPopUpToId$navigation_common_release(int i) {
        this.popUpToId = i;
        this.inclusive = false;
    }

    public final void setPopUpToRoute(String str) {
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                a$$ExternalSyntheticBUOutline0.m$3("Cannot pop up to an empty route");
            } else {
                this.popUpToRoute = str;
                this.inclusive = false;
            }
        }
    }
}
