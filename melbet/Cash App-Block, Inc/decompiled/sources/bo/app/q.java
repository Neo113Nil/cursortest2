package bo.app;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.models.Banner;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class q {
    public final com.braze.storage.a a;

    public q(com.braze.storage.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    public static final String b(Banner banner) {
        String placementId = banner.getPlacementId();
        long expirationTimestampSeconds = banner.getExpirationTimestampSeconds();
        long nowInSeconds = DateTimeUtils.nowInSeconds();
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Filtering expired banner for placement ", placementId, ": expirationTimestampSeconds=", expirationTimestampSeconds);
        m.append(", now=");
        m.append(nowInSeconds);
        return m.toString();
    }

    public final boolean a(Banner banner, Long l, Map map) {
        Long l2;
        if (l == null || (l2 = (Long) map.get(banner.getPlacementId())) == null) {
            return true;
        }
        long longValue = l2.longValue();
        if (longValue <= l.longValue()) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new q$$ExternalSyntheticLambda1(banner, longValue, l, 0), 6, (Object) null);
        return false;
    }

    public static final String a(Banner banner, long j, Long l) {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Filtering stale banner for placement ", banner.getPlacementId(), ": lastRequestTime=", j);
        m.append(" > responseRequestTime=");
        m.append(l);
        return m.toString();
    }

    public final boolean a(Banner banner, Set set) {
        String stableKey = banner.getStableKey();
        if (stableKey == null || !set.contains(stableKey)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda0(26, banner, stableKey), 6, (Object) null);
        return false;
    }

    public static final String a(Banner banner, String str) {
        return Boxes$$ExternalSyntheticOutline1.m("Filtering dismissed banner for placement ", banner.getPlacementId(), ": stableKey=", str, " has an unacknowledged pending dismissal");
    }

    public final boolean a(Banner banner) {
        if (!banner.isExpired()) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new q$$ExternalSyntheticLambda0(banner, 0), 6, (Object) null);
        return false;
    }
}
