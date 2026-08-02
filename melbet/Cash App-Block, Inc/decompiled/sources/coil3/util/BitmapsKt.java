package coil3.util;

import android.graphics.Bitmap;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class BitmapsKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewInvestingRoundupsSkippedConfirmation.deepLinkSpecs;
    }

    public static final Bitmap.Config getSafeConfig(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }

    public static final boolean isHardware(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }
}
