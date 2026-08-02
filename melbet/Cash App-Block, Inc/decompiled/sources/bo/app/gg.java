package bo.app;

import android.util.Base64;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;

/* loaded from: classes3.dex */
public abstract class gg implements v9 {
    public static final String d = BrazeLogger.getBrazeLogTag((Class<?>) gg.class);
    public final long a;
    public final long b;
    public y8 c;

    public gg() {
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        this.b = nowInMilliseconds;
        this.a = nowInMilliseconds / 1000;
    }

    public static String a(String str) {
        if (StringUtils.isNullOrBlank(str)) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 0)).split("_")[0];
        } catch (Exception e) {
            BrazeLogger.e(d, "Unexpected error decoding Base64 encoded campaign Id " + str, e);
            return null;
        }
    }
}
