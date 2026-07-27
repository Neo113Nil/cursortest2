package O;

import android.app.ApplicationExitInfo;
import android.media.RouteDiscoveryPreference;
import android.util.CloseGuard;
import com.google.android.gms.internal.ads.RB;

/* loaded from: classes.dex */
public abstract /* synthetic */ class D0 {
    public static /* bridge */ /* synthetic */ ApplicationExitInfo e(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder h(RB rb) {
        return new RouteDiscoveryPreference.Builder(rb, false);
    }

    public static /* synthetic */ CloseGuard i() {
        return new CloseGuard();
    }

    public static /* synthetic */ void z() {
    }
}
