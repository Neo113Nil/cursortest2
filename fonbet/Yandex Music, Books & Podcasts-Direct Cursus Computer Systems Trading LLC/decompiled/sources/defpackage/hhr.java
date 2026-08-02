package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class hhr {
    public boolean a;
    public long b;

    public final long a() {
        if (this.a) {
            return System.nanoTime() - this.b;
        }
        return 0L;
    }

    public final void b() {
        o2g.U("This stopwatch is already running.", !this.a);
        this.a = true;
        this.b = System.nanoTime();
    }

    public final String toString() {
        String str;
        long nanoTime = this.a ? System.nanoTime() - this.b : 0L;
        TimeUnit timeUnit = nanoTime / 86400000000000L > 0 ? TimeUnit.DAYS : nanoTime / 3600000000000L > 0 ? TimeUnit.HOURS : nanoTime / 60000000000L > 0 ? TimeUnit.MINUTES : nanoTime / 1000000000 > 0 ? TimeUnit.SECONDS : nanoTime / 1000000 > 0 ? TimeUnit.MILLISECONDS : nanoTime / 1000 > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        double convert = nanoTime / r5.convert(1L, timeUnit);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.ROOT, "%.4g", Double.valueOf(convert)));
        sb.append(StringUtil.SPACE);
        switch (ghr.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                wvs.b();
                return null;
        }
        sb.append(str);
        return sb.toString();
    }
}
