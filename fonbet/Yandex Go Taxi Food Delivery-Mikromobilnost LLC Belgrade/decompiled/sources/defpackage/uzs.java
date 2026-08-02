package defpackage;

import android.location.Location;
import android.os.SystemClock;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public final class uzs {
    public static zzs a(Long l, String str, boolean z) {
        List W;
        if (str == null) {
            return null;
        }
        W = evu0.W(str, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
        if (W.size() < 2) {
            return null;
        }
        return z ? c((String) W.get(1), (String) W.get(0), l) : c((String) W.get(0), (String) W.get(1), l);
    }

    public static zzs b(Location location) {
        return new zzs(location.getLatitude(), location.getLongitude(), (int) location.getAccuracy(), location.getProvider(), Long.valueOf(System.currentTimeMillis() - ((SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000)));
    }

    public static zzs c(String str, String str2, Long l) {
        try {
            double parseDouble = Double.parseDouble(evu0.k0(str).toString());
            double parseDouble2 = Double.parseDouble(evu0.k0(str2).toString());
            if (!Double.isNaN(parseDouble) && !Double.isNaN(parseDouble2)) {
                return new zzs(parseDouble, parseDouble2, 0, null, l, 12);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final KSerializer serializer() {
        return b0t.a;
    }
}
