package defpackage;

import android.os.SystemClock;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class c38 extends e80 {
    public long a = -9223372036854775807L;
    public long b = -9223372036854775807L;
    public final SimpleDateFormat c = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z", Locale.US);

    @Override // defpackage.d80
    public final void Z(c80 c80Var, cfg cfgVar, boh bohVar) {
        String str;
        String str2;
        Map map = cfgVar.c;
        if (bohVar.a == 4) {
            map.getClass();
            List list = (List) map.get("x-server-time-ms");
            Long l = null;
            Long r0 = (list == null || (str2 = (String) CollectionsKt.firstOrNull(list)) == null) ? null : StringsKt.r0(10, str2);
            if (r0 == null) {
                map.getClass();
                List list2 = (List) map.get("Date");
                if (list2 != null && (str = (String) CollectionsKt.firstOrNull(list2)) != null) {
                    try {
                        Date parse = this.c.parse(str);
                        if (parse != null) {
                            l = Long.valueOf(parse.getTime());
                        }
                    } catch (Exception e) {
                        Timber.INSTANCE.e(e);
                    }
                }
                r0 = l;
            }
            if (r0 != null) {
                this.a = (cfgVar.d / 2) + r0.longValue();
                this.b = SystemClock.elapsedRealtime();
            }
        }
    }
}
