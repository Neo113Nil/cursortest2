package a5;

import E.e;
import android.content.Context;
import com.google.android.gms.location.LocationListener;
import com.huawei.hms.location.LocationCallback;
import com.onesignal.common.AndroidUtils;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class b {
    public static final b INSTANCE = new b();

    private b() {
    }

    public final boolean hasGMSLocationLibrary() {
        try {
            return AndroidUtils.INSTANCE.opaqueHasClass(LocationListener.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean hasHMSLocationLibrary() {
        try {
            return AndroidUtils.INSTANCE.opaqueHasClass(LocationCallback.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean hasLocationPermission(Context context) {
        h.e(context, "context");
        return e.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || e.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }
}
