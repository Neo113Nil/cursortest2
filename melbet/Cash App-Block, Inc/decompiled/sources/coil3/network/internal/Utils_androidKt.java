package coil3.network.internal;

import android.content.Context;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.util.Strings;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class Utils_androidKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewInvestingContactSettings.deepLinkSpecs;
    }

    public static final boolean isPermissionGranted(Context context) {
        return Strings.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
    }
}
