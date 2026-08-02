package io.appmetrica.analytics.push.impl;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;
import ru.CryptoPro.JCP.VMInspector.OpenList;

/* renamed from: io.appmetrica.analytics.push.impl.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC1043j {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "receive";
            case 2:
                return "dismiss";
            case 3:
                return OpenList.STR_OPEN;
            case 4:
                return "custom";
            case 5:
                return "processed";
            case 6:
                return "shown";
            case 7:
                return "ignored";
            case 8:
                return "expired";
            case 9:
                return "removed";
            case 10:
                return FlexRouteHandlerImpl.FLEX_CUSTOM_PROPS_REPLACE;
            default:
                throw null;
        }
    }
}
