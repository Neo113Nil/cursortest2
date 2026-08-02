package androidx.media3.ui;

import android.graphics.Color;
import androidx.media3.common.util.Util;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.Locale;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class HtmlUtils {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewAllowCustomerSearch.deepLinkSpecs;
    }

    public static String toCssRgba(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d)};
        String str = Util.DEVICE_DEBUG_INFO;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }
}
