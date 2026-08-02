package app.cash.zipline.internal;

import android.util.Log;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class LogAndroidKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewFamilyAccountSponsor.deepLinkSpecs;
    }

    public static final void log(String str, String str2, Throwable th) {
        if (str.equals("warn")) {
            Log.w("Zipline", str2, th);
        } else if (str.equals(BreadcrumbHelper.Category.ERROR)) {
            Log.e("Zipline", str2, th);
        } else {
            Log.i("Zipline", str2, th);
        }
    }
}
