package coil3.svg.internal;

import android.content.Context;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class Utils_androidKt {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewInvestingRoundupsOnboarding.deepLinkSpecs;
    }

    public static final float getDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }
}
