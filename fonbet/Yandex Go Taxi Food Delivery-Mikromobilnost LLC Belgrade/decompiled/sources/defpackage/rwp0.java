package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ru.yandex.common.clid.ClidManager;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes6.dex */
public final class rwp0 {
    public final RoutePointType a;
    public final boolean b;
    public final AtomicInteger c = new AtomicInteger();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final long e = System.currentTimeMillis();
    public final AtomicInteger f = new AtomicInteger(0);
    public final ArrayList g = new ArrayList();
    public String h;
    public String i;

    public rwp0(RoutePointType routePointType, boolean z) {
        this.a = routePointType;
        this.b = z;
    }

    public final synchronized String a() {
        String uuid;
        uuid = UUID.randomUUID().toString();
        this.i = uuid;
        return uuid;
    }

    public final synchronized String b(long j) {
        String format;
        format = String.format(Locale.US, ClidManager.KEY_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j), UUID.randomUUID().toString()}, 2));
        this.h = format;
        return format;
    }

    public final String c() {
        String str = this.h;
        if (str != null) {
            if (evu0.J(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        jst.e.j(new IllegalStateException("Missing clientReqId on generating event"));
        return b(System.currentTimeMillis());
    }
}
